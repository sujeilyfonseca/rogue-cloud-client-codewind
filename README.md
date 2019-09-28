# The Rogue Cloud, An Interactive Session #


## Rogue Cloud Client Overview ##
This repository serves as a client for the Rogue Cloud game. A client is a computer that accesses a server through a network. On the other hand, a server machine is a large capacity computer that can store a wide variety of files, such as applications and data files.

<p align="center"><img height="550" width="850" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/rogue-cloud-client-eclipse-logs.png"></br><b>Figure 1:</b> Rogue Cloud Agent Interacting with the Game World</p>


## Interactive Part of the Session ##
In the interactive part of the session, students will be guided to improve their agent behavior on the scene. This could be done by modifying the game agent, which would be represented by a class called SimpleAI. The changes made to this class are reflected in the AI running in the Liberty MicroProfile container.

Following the strategies and the example given, students should have the opportunity to develop their code to participate in the challenge. As a base source, students can follow the Step-by-Step guide provided in this README file.

<p align="center"><img height="550" width="850" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/rogue-cloud-client-winners.png"></br><b>Figure 2:</b> Rogue Cloud Winner Screen</p>


## Challenge Rules ##
1. Students will be divided into groups with a maximum of 4 students.
2. Each team must have its own computer, and the team members must indicate their username for the client on the cards provided in the tables.
2. Students have about 40 minutes to add functions to the SimpleAI Java class.
3. Students will receive an example of how to access classes within the rogue-cloud-client-codewind repository.
4. Students will have a step-by-step guide to improving the SimpleAI Java class. However, they must provide any improvement to the class to be considered as participants of the challenge.
5. At the end of the session, a game round will be observed to give the team with the highest scores the opportunity to explain their improvements.
6. The first two places will receive a special award.
7. The first three places will be recognized during the session.


## Code a Rogue Cloud Agent (SimpleAI Java Class) ##
The ``SimpleAI`` class provides a sample implementation and framework to easily begin hacking on your agent code. In fact, the ``SimpleAI`` class is ready to go right out of the box! The [rogue-cloud-interactive-session](https://github.com/sujeilyfonseca/rogue-cloud-interactive-session) repository has already provided instructions to start your agent code. 

When you've got your code running, the next step is to focus on improving it. The ``SimpleAI`` class acts based on the implementation that you provide in each of the following methods:

1. **shouldIPickUpItem**: I see an item, should I pick it up?
2. **shouldIAttackCreature**: I see a creature, should I attack it?
3. **whereShouldIGo**: What coordinate on the map should I start moving towards?
4. **shouldIDrinkAPotion**: Should I drink a potion this turn?
5. **shouldIEquipNewItem**:  Should I equip a new item that I just picked up?
6. **unprovokedAttackShouldIAttackBack**:  Help, I am being attacked, should I attack back?

It is up to your code to answer these questions, by improving upon the existing code contained in these methods.

Examine the source for each of these methods, and learn more about how the agent API interacts with the game world. The agent API are classes that you can use to interact with the world. All are fully documented to provide you information on what their purpose is and how to use them. Examples include ``SelfState/WorldState``, which provide you with information on yourself/the world, or ``IMap/Tile``, which let you see the contents of a particular map location.

Do you need inspiration? See the **How to improve your character over the sample agent** section in the [Key Concepts](https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/docs/introduction-and-concepts.md) file.


## How to Locate Code and Learn About the Agent API classes ##

While hacking on your agent code, it is important to be able to learn about the agent API classes and their methods. The best way to do this is to open their source in the git repo.

To locate the source and documentation for a Rogue Cloud class, use the 'Goto' key/shortcut for your development environment of choice.
* **Eclipse**: `CTRL-SHIFT-R` (Windows) or `Command-Shift-R` (Mac)
* **Visual Studio Code**: `CTRL-P` or `Command-P` (Mac)

For example, if you are using Eclipse on Mac, and you are looking for the `SimpleAI.java` class, press `Command-Shift-R`, type ``SimpleAI.java``, and click Enter. If you want to see the source code of a method and/or a class, press `fn` and then `F3`.

### Locations of Important Agent API Classes ###

Here are the locations of some of the most important classes within `gameclient/src/main/java`:

```
com/roguecloud/client/ai/SimpleAI

com/roguecloud/creatures/ICreature

com/roguecloud/map/IMap
com/roguecloud/map/Tile

com/roguecloud/client/container/StartAgentServlet

com/roguecloud/client/SelfState
com/roguecloud/client/WorldState
com/roguecloud/client/IEventLog

com/roguecloud/Position

com/roguecloud/utils/AIUtils
com/roguecloud/utils/AStarSearch
com/roguecloud/utils/SimpleMap

com/roguecloud/items/Armour
com/roguecloud/items/Weapon
com/roguecloud/items/Effect
com/roguecloud/items/DrinkableItem
com/roguecloud/items/OwnableObject
com/roguecloud/items/IGroundObject
com/roguecloud/items/IObject
```

For more information, please refer to the [Useful Resources](https://github.com/sujeilyfonseca/rogue-cloud-client-codewind#useful-resources) section.


## Accessing Logs ##
### Accessing the logs using the IDEs: ###
* **Eclipse:** Right click on your project, select **Show Log Files**, and click on the desired log file. You can also select **Show All Logs**.

<p align="center"><img height="550" width="850" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/access-logs-eclipse.png"></br><b>Figure 15:</b> Accessing the logs using the Eclipse IDE</p>

* **Visual Studio Code:** Right click on your project and select **Show All Logs**. You can select the desired log file using the combo box.

<p align="center"><img height="550" width="850" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/access-logs-vscode.png"></br><b>Figure 16:</b> Accessing the logs using the VS Code IDE</p>

* Some useful logs for viewing the standard messages in the Eclipse Console are: `console.log` and `messages.log`. You may consider installing the [Eclipse ANSI Console](https://mihai-nita.net/2013/06/03/eclipse-plugin-ansi-in-console/) to include colors in your messages and facilitate seeing the player's interactions with the game world. Here are some examples of ANSI colors:
```java
  public static final String ANSI_RESET = "\u001B[0m";
  public static final String ANSI_BLACK = "\u001B[30m";
  public static final String ANSI_RED = "\u001B[31m";
  public static final String ANSI_GREEN = "\u001B[32m";
  public static final String ANSI_YELLOW = "\u001B[33m";
  public static final String ANSI_BLUE = "\u001B[34m";
  public static final String ANSI_PURPLE = "\u001B[35m";
  public static final String ANSI_CYAN = "\u001B[36m";
  public static final String ANSI_WHITE = "\u001B[37m";
```


## Step-by-Step Guide ##

### A) shouldIPickUpItem ###
The default `shouldIPickUpItem` implementation (Figure 3) picks up the first thing the player sees. However, the item could be protected by dangerous enemies who can attack the player once it tries to pick up the item.

<p align="center"><img width="750" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/shouldIPickUpItem_default.png"></br><b>Figure 3:</b> Default shouldIPickUpItem implementation</p>

How could this be improved? We could check how many creatures are near the item. If the item is protected by two or more enemies, then avoid picking it up. To do this, you can use the `AIUtils.findCreaturesInRange (...)`, which can be used as follows:
```java
List<ICreature> creaturesInRange = AIUtils.findCreaturesInRange(worldState.getViewWidth(), worldState.getViewHeight(), getOurPosition(), worldState.getMap());
AIUtils.removePlayerCreaturesFromList(creaturesInRange);
AIUtils.sortClosestCreatures(getOurPosition(), creaturesInRange);
```

The following example demonstrates the use of the above method by verifying if there are less than two creatures within the vision range. The example also uses the Object types to see what items were found and the standard messages to describe them:
``` java
if(objectOnGround.getObjectType() == ObjectType.ARMOUR) {
  Armour newArmour = (Armour) objectOnGround;
  ArmourType newArmourType = newArmour.getType();
  System.out.println(ANSI_PURPLE + "Encountered armour: " + newArmourType + ", " + newArmour.getDefense() + ANSI_RESET);

  if (!(creaturesInRange.size() > 2)) {
    System.out.println(ANSI_GREEN + "Picked up the armour!" + ANSI_RESET);
    return visibleGroundObjectContainer;
  } else {
    System.out.println(ANSI_YELLOW + "Armour found, but not picked up!" + ANSI_RESET)
  }
}
```

A complete example of how to use the described approach to improve the `shouldIPickUpItem` method can be found in Figure 4.

<p align="center"><img width="750" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/shouldIPickUpItem.png"></br><b>Figure 4:</b> Improved shouldIPickUpItem implementation</p>

There are several other manners in which this method could be improved. For example, you could also wait for enemies to leave the item area or attack them before picking up the item, if they are not strong enough. Think outside the box!


### B) shouldIAttackCreature ###
The default `shouldIAttackCreature` implementation (Figure 5) attacks the first thing the player sees. This is often not a good idea because some enemies are more powerful than others, and the player may consider avoiding the attack if its health is low.

<p align="center"><img width="750" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/shouldIAttackCreature_default.png"></br><b>Figure 5:</b> Default shouldIAttackCreature implementation</p>

How could this be improved? We could verify the enemies' level and the player's health. Depending on the current state, we could decide whether to attack or not.
* A reference to the player can be obtained by calling `getSelfState().getPlayer()`. Those methods are located within the `RemoteClient.java` and `SelfState.java` classes, respectively. The enemy level can be obtained using the `getLevel()` method of the `ICreature` class.
* The remaining player's health can be calculated using the following equation: `(int)(100d * (double)mainPlayer.getHp() / (double)mainPlayer.getMaxHp())`

Here is an example of how to retrieve the mentioned information:
```java
for(ICreature c : visibleMonsters) {
  int percentHealthLeft = (int)(100d * (double)mainPlayer.getHp() / (double)mainPlayer.getMaxHp());

  if ((c.getLevel() - 6) < mainPlayer.getLevel() && percentHealthLeft > 40) {
    System.out.println(ANSI_GREEN + "Attacking enemy that could be stronger!" + ANSI_RESET);
    return c;
  } else if ((c.getLevel() - 2) < mainPlayer.getLevel() && percentHealthLeft > 10) { 
    System.out.println(ANSI_GREEN + "Attacking enemy!" + ANSI_RESET);
    return c;
  } else {
    System.out.println(ANSI_BLUE + "Avoiding a stronger enemy and/or running for my life..." + ANSI_RESET);
  }
}
```

A complete example of how to use the described approach to improve the `shouldIAttackCreature` method can be found in Figure 6.

<p align="center"><img width="750" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/shouldIAttackCreature.png"></br><b>Figure 6:</b> Improved shouldIAttackCreature implementation</p>

There are several other manners in which this method could be improved. Think outside the box!


### C) whereShouldIGo ###
The default `whereShouldIGo` implementation (Figure 7) picks random spots on the map.

<p align="center"><img width="750" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/whereShouldIGo_default.png"></br><b>Figure 7:</b> Default whereShouldIGo implementation</p>

How could this be improved?  A better strategy is to avoid areas that we have already seen, to discover as much of the world as possible. Another approach would be to look for routes of interest (e.g., where could the player find items if its health is low?, where could the player reach enemies to increase its score?). Let's follow this second approach!

The `AIUtils.findClosestGroundObjectThatCanBeReached(...)` and `AIUtils.findClosestCreatureThatCanBeReached(...)` are good methods to obtain the mentioned information, which can be send to the `doWandering` method of the `SimpleAI.java` class. Both methods return a `FindClosestResult<Type>` object, which could be used to obtain the necessary positions to achieve the desired target. These positions can be obtained by calling the `getRoute ()` method located within the `FindClosestResult` inner class of` AIUtils.java`. This is how the code will look like:
```java
if (percentHealthLeft < 50) {
  FindClosestResult<IGroundObject> closestGroundObject = AIUtils.findClosestGroundObjectThatCanBeReached(whatWeHaveSeenMap, worldState, selfState);
    
  if (closestGroundObject != null) {
    System.out.println(ANSI_GREEN + "Found target: IGroundObject" + ANSI_RESET);
    return closestGroundObject.getRoute();
  }
} else {
  FindClosestResult<ICreature> closestCreature = AIUtils.findClosestCreatureThatCanBeReached(whatWeHaveSeenMap, worldState, selfState);
			
  if (closestCreature != null) {
    System.out.println(ANSI_GREEN + "Found target: ICreature" + ANSI_RESET);
    return closestCreature.getRoute();
  }
}
```

In order to use a `List` of ` Position` objects, you must change the return type to `List<Position` and modify the `doWandering` method to receive those values, as follows:
```java
// Find a new route
if(wanderingStateDate.ourCurrentRoute == null) {
  List<Position> routeToDestination = whereShouldIGo();
  if(routeToDestination.size() > 1) {
    // Success!!!

    // Remove the first item, which is our current position
    routeToDestination.remove(0);

    wanderingStateDate.ourCurrentRoute = routeToDestination;
  }
}
```

A complete example of how to use the described approach to improve the `whereShouldIGo` method can be found in Figure 8. 

<p align="center"><img width="750" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/whereShouldIGo.png"></br><b>Figure 8:</b> Improved whereShouldIGo implementation</p>

There are several other manners in which this method could be improved. Think outside the box!


### D) shouldIDrinkAPotion ###
The default `shouldIDrinkAPotion` implementation (Figure 9) drinks a random potion when the player's health drops below 50%, and continues to drink potions until the life is above 50%. Since potions can heal over multiple turns, some potions may overheal the player, and some potions don't heal at all. 

<p align="center"><img width="750" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/shouldIDrinkAPotion_default.png"></br><b>Figure 9:</b> Default shouldIDrinkAPotion implementation</p>

How could this be improved? A better strategy would be to be carefully analyze the situation and choose potions to reflect the immediate need. To do this, we should consider scenarios for the available potions: `LIFE`, `VISION_RANGE`, `DAMAGE_REDUCTION` and `INVISIBILITY`. We could use the `EffectType.java` inner class of `Effect.java` to retrieve those scenarios. Here is an example of how to implement this:
```java
DrinkableItem potion = (DrinkableItem) currentObject;
EffectType potionEffectType = potion.getEffect().getType();

switch(potionEffectType) {
  case LIFE:
    int percentHealthLeft = (int)(100d * (double)mainPlayer.getHp() / (double)mainPlayer.getMaxHp()); 
    if (percentHealthLeft < 50) {
      System.out.println(ANSI_GREEN + "Potion taken: LIFE" + ANSI_RESET);
      return object;
    }
    break;
  case VISION_RANGE:
    System.out.println(ANSI_GREEN + "Potion taken: VISION_RANGE" + ANSI_RESET);
    return object;
  case DAMAGE_REDUCTION:
    System.out.println(ANSI_GREEN + "Potion taken: DAMAGE_REDUCTION" + ANSI_RESET);
    return object;
  case INVISIBILITY:
    List<ICreature> creaturesInRange = AIUtils.findCreaturesInRange(worldState.getViewWidth(), worldState.getViewHeight(), getOurPosition(), worldState.getMap());
    AIUtils.removePlayerCreaturesFromList(creaturesInRange);
    AIUtils.sortClosestCreatures(getOurPosition(), creaturesInRange);

    if (creaturesInRange.size() > 2) {
      System.out.println(ANSI_GREEN + "Potion taken: INVISIBILITY" + ANSI_RESET);
      return object;	
    }
    break;
}
					
System.out.println(ANSI_PURPLE + "Saved potion: " + potionEffectType + ANSI_RESET);
```

Since this method is called each turn, a good recommendation would be to store the value of the inventory in a variable to avoid checking if a potion should be drunk if the amount of items in the inventory has not changed. To do this, we must define a private variable in the class (i.e., `private int previousInventorySize = 0;`) and use it at the beginning of the method as follows:
```java
if (!inventory.isEmpty() && inventory.size() != previousInventorySize) {
    ...
}
```

A complete example of how to use the described approach to improve the `shouldIDrinkAPotion` method can be found in Figure 10.

<p align="center"><img width="750" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/shouldIDrinkAPotion.png"></br><b>Figure 10:</b> Improved shouldIDrinkAPotion implementation</p>

There are several other manners in which this method could be improved. Think outside the box!


### E) shouldIEquipNewItem ###
The default `shouldIEquipNewItem` implementation (Figure 11) equips anything that is picked up.

<p align="center"><img width="750" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/shouldIEquipNewItem_default.png"></br><b>Figure 11:</b> Default shouldIEquipNewItem implementation</p>

How could this be improved? A better idea is to equip only items that are an improvement over what is already equipped. Following this approach, we could consider aspects to see what makes the item better. For example, the defense is something important in the `Armour Set`. We may consider getting the current equipped `Armour` (i.e., `mainPlayer.getArmour().get(newArmour.getType()`), if any, and compare its defense with the new item's defense. Here is an example of how to do this:
```java
if(newItem.getObjectType() == ObjectType.ARMOUR) {
  Armour newArmour = (Armour) newItem;			
  Armour previouslyEquippedArmour = mainPlayer.getArmour().get(newArmour.getType());
      
  if(previouslyEquippedArmour != null) {
    if (newArmour.getDefense() > previouslyEquippedArmour.getDefense()) {
      System.out.println(ANSI_GREEN + "Equipped stronger armour: " + newArmour.getType() + ", " + newArmour.getDefense() + ANSI_RESET);
      return true;
    } 
  } else {
    System.out.println(ANSI_GREEN + "Equipped a new armour: " + newArmour.getType() + ", " + newArmour.getDefense() + ANSI_RESET);
    return true;
  }
}
```

You can also think about something that improves a `Weapon`. The `Weapon.java` class would help you retrieve the information you want. A complete example of how to use the described approach to improve the `shouldIEquipNewItem` method can be found in Figure 12.

<p align="center"><img width="750" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/shouldIEquipNewItem.png"></br><b>Figure 12:</b> Improved shouldIEquipNewItem implementation</p>

There are several other manners in which this method could be improved. Think outside the box!


### F) unprovokedAttackShouldIAttackBack ###
The default `unprovokedAttackShouldIAttackBack` implementation (Figure 13) always attacks back. Some enemies are much stronger than your player character, and running would likely be a better option.

<p align="center"><img width="750" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/unprovokedAttackShouldIAttackBack_default.png"></br><b>Figure 13:</b> Default unprovokedAttackShouldIAttackBack implementation</p>

A complete example of how to perform defense attacks while obtaining the enemy's information can be found in Figure 14.

<p align="center"><img width="750" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/unprovokedAttackShouldIAttackBack.png"></br><b>Figure 14:</b> Improved unprovokedAttackShouldIAttackBack implementation</p>

There are several other manners in which this method could be improved. Another example is to verify if the enemies are following you to plan a safe escape or attack them before they can attack you. Think outside the box!


## Useful Resources ##
1. [Java API](https://docs.oracle.com/javase/7/docs/api/overview-summary.html)
2. [Javadocs for the Agent API Classes](http://www-rogue-cloud.mybluemix.net/)
3. [Key Concepts](https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/docs/introduction-and-concepts.md)


## Next Steps ##
Have a few more minutes? Visit the [rogue-cloud](https://github.com/sujeilyfonseca/rogue-cloud) repository to know the arquitecture, and how to continue developing and improving the Rogue Cloud game.
