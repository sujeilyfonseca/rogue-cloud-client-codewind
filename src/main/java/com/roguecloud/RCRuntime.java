/*
 * Copyright 2018, 2019 IBM Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License. 
*/

package com.roguecloud;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

import com.roguecloud.map.IMap;
import com.roguecloud.map.Tile;
import com.roguecloud.utils.Console;
import com.roguecloud.utils.Logger;

/** 
 * The RCRuntime contains the utility methods and constants, which are used to enable various DEBUG checks throughout the code base. 
 * Many of these default methods are false, since they are computationally expensive when run in production.
 * This class is an internal class, for server use only. 
 */
public class RCRuntime {
	
	// For internal use only 
	private static final Logger log = Logger.getInstance();
	public static final AtomicLong GAME_TICKS = new AtomicLong(0);

	// Enable this to do runtime checking of various invariant properties throughout the code
	// This should remaining disable in production as it necessarily imposes a performance penalty
	public static final boolean CHECK = false;
	public static final boolean CHECK_GAME_THREAD = false;
	public static final boolean PERF_ENABLED = true;
	public static final boolean SIMULATE_BAD_CONNECTION = false;
	public static final boolean ENABLE_LATENCY_SIM = false;
	public static final long MIN_LATENCY_SIM_IN_NANOS = TimeUnit.NANOSECONDS.convert(500, TimeUnit.MILLISECONDS);	
	public static final long MAX_LATENCY_SIM_IN_NANOS = TimeUnit.NANOSECONDS.convert(1000, TimeUnit.MICROSECONDS);

	// This should always be true (unless you are a Codewind developer writing a client that does not support deflate) 
	public static final boolean ENABLE_DEFLATE_COMPRESSION = true;
	
	public static long convertToLong(Object object) {
		if(object instanceof Long) {
			return ((Long)object).longValue();
		} else if(object instanceof Integer) {
			return ((Integer)object).intValue();
		} else {
			log.severe("Could not convert object " + object + " to long.", null);			
			throw new RuntimeException("Invalid value: " + object);
		}
	}
	
	public static String dumpMap(IMap map, int startx, int starty, int width, int height) {
		StringBuilder sb = new StringBuilder();
		
		sb.append("{\r\n");
		
		for(int y = starty; y < height+starty; y++) {
			for(int x = startx; x < width+startx; x++) {
				Tile t = map.getTile(x,  y);
				if(t != null) {
					sb.append(t.getTileTypeLayers()[0].getNumber()%10);
				} else {
					sb.append("X");
				}
			}
			sb.append("\r\n");
		}
		
		sb.append("}\r\n");
		
		return sb.toString();
	}
	
	public final static void assertNotGameThread() {
		if(!CHECK_GAME_THREAD)  { return; }
		
		if(Thread.currentThread().getName().startsWith("com.roguecloud.GameEngine$GameThread")) {
			
			while(true) {
				log.severe("Invalid thread access: " + Thread.currentThread().getName(), new Throwable(), null);
				System.err.println("INVALID THREAD ACCESS!!!");
				try { 
					Thread.sleep(10 * 1000); 
				} catch (InterruptedException e) { 
					Console.err("Error in RCRuntime.assertNotGameThread: " + e.toString(), null);  
				}
			}
		}
	}
	
	public final static void assertGameThread() {
		if(!CHECK_GAME_THREAD)  { return; }
		
		if(!Thread.currentThread().getName().startsWith("com.roguecloud.GameEngine$GameThread")) {
			
			while(true) {
				log.severe("Invalid thread access: " + Thread.currentThread().getName(), new Throwable(), null);
				System.err.println("INVALID THREAD ACCESS!!!");
				try { 
					Thread.sleep(10 * 1000); 
				} catch (InterruptedException e) { 
					Console.err("Error in RCRuntime.assertGameThread: " + e.toString(), null); 
				}
			}
		}
	}
}
