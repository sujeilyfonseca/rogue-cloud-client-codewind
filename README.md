# The Rogue Cloud, An Interactive Session #


## Rogue Cloud client overview ##
This repository serves as a client for the Rogue Cloud game. A client is a computer that accesses a server through a network. On the other hand, a server machine is a large capacity computer that can store a wide variety of files, such as applications and data files.

<img height="550" width="850" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/rogue-cloud-client-eclipse-logs.png">


## Interactive part of session ##
In the interactive part of the session, students will be guided to improve their agent behavior on the scene. This could be done by modifying the game agent, which would be represented by a class called SimpleAI. The changes made to this class are reflected in the AI running in the Liberty MicroProfile container.

Following the strategies and the example given, students should have the opportunity to develop their code to participate in the challenge. As a base source, students can follow the Step-by-Step guide provided in this README file.

<img height="550" width="850" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/rogue-cloud-client-winners.png">


## Challenge Rules ##
1. Students will be divided into groups with a maximum of 4 students.
2. Each team must have its own computer, and the team members must indicate their username for the customer on the cards provided in the tables.
2. Students have about 40 minutes to add functions to the SimpleAI Java class.
3. Students will receive an example of how to access classes within the rogue-cloud-client-codewind repository.
4. Students will have a step-by-step guide to improving the SimpleAI Java class. However, they must provide any improvement to the class to be considered as participants of the challenge.
5. At the end of the session, a game round will be observed to give the team with the highest scores the opportunity to explain their improvements.
6. First place will receive a special prize.
7. The first three places will be recognized during the session.


## Code a Rogue Cloud Agent (SimpleAI Java Class) ##
The ``SimpleAI`` class provides a sample implementation and framework to easily begin hacking on your agent code. In fact, the ``SimpleAI`` class is ready to go right out of the box! The [rogue-cloud-interactive-session](https://github.com/sujeilyfonseca/rogue-cloud-interactive-session) repository has already provided instructions to start your agent code. 

When you've got your code running, the next step is to focus on improving it. The ``SimpleAI`` class acts based on the implementation that you provide in each of the following methods:

1. **shouldIPickUpItem**: I see an item, should I pick it up?
2. **shouldIAttackCreature**: I see a creature, should I attack them?
3. **whereShouldIGo**: What coordinate on the map should I start moving towards?
4. **shouldIDrinkAPotion**: Should I drink a potion this turn?
5. **shouldIEquipNewItem**:  Should I equip a new item that I just picked up?
6. **beingAttackedShouldIAttackBack**:  Help, I am being attacked, should I attack back?

It is up to your code to answer these questions, by improving upon the existing code contained in these methods.

Examine the source for each of these methods, and learn more about how the agent API interacts with the game world. The agent API are classes that you can use to interact with the world. All are fully documented to provide you information on what their purpose is and how to use them. Examples include ``SelfState/WorldState``, which provide you with information on yourself/the world, or ``IMap/Tile``, which let you see the contents of a particular map location.

Do you need inspiration? See the **How to improve your character over the sample agent** section in the [Key Concepts](https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/docs/introduction-and-concepts.md) file.


## How to Locate code and Learn About the Agent API classes ##

While hacking on your agent code, it is important to be able to learn about the agent API classes and their methods. The best way to do this is to open their source in the git repo.

To locate the source and documentation for a Rogue Cloud class, use the 'Goto' key/shortcut for your development environment of choice.
* **Eclipse**: `CTRL-SHIFT-R` (Windows) or `Command-Shift-R` (Mac)
* **Visual Studio Code**: `CTRL-P` or `Command-P` (Mac)

For example, if you are using Eclipse on Mac, and you are looking for the `SimpleAI.java` class, press `Command-Shift-R`, type ``ICreature.java``, and click Enter. If you want to see the source code of a method and/or a class, press `fn` and then `F3`.

For more information, please refer to the [Useful Resources](https://github.com/sujeilyfonseca/rogue-cloud-client-codewind#useful-resources) section.


## Step-by-Step Guide ##

### A) shouldIPickUpItem ###
* The default ``shouldIPickUpItem`` implementation picks up the first thing it sees. A better idea is to only pick up items that are an improvement over what the character already has.

### B) shouldIAttackCreature ###
* The default ``shouldIAttackCreature`` implementation attacks the first thing it sees. This is often not a good idea: some monsters are more powerful than others, and the character may want to consider avoiding attack if its health is low.

### C) whereShouldIGo ###
* The default ``whereShouldIGo`` implementation picks random spots on the map. A better strategy is to avoid areas that we have already seen, so as to discover as much of the world as possible.

### D) shouldIEquipNewItem ###
* The default ``shouldIDrinkAPotion`` implementation drinks a random potion when the character's health drops below 50%, and keeps on drinking potions until it is above 50%. Since potions can heal over multiple turns, some potions may overheal the player, and some potions don't heal at all. A better strategy would be to be carefully analyze the situation and choose potions to reflect the immediate need.

### E) shouldIEquipNewItem ###
* The default ``shouldIEquipNewItem`` implementation equips anything that is picked up. A better idea is to only equip items that are an improvement over what is already equipped.

### F) unprovokedAttackShouldIAttackBack ###
* The default ``unprovokedAttackShouldIAttackBack`` implementation ALWAYS attacks back. Some monsters are much tougher than your player character, and fleeing would likely be a better option!


## Accessing Logs ##
### Accessing the logs using the IDEs: ###
* **Eclipse:** Right click on your project, select **Show Log Files**, and click on the desired log file. You can also select **Show All Logs**.

<img height="550" width="850" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/access-logs-eclipse.png">

* **Visual Studio Code:** Right click on your project and select **Show All Logs**. You can select the desired log file using the combo box.

<img height="550" width="850" src="https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/images/access-logs-vscode.png">


### Accessing the logs within your machine: ###
All Codewind logs can be found in the  `.logs` directory within your `codewind-workspace`. On Mac, if you don not have access to hidden items, press `Command` + `Shift` + `.`


## Useful Resources ##
1. [Java API](https://docs.oracle.com/javase/7/docs/api/overview-summary.html)
2. [Javadocs for the Agent API Classes](http://www-rogue-cloud.mybluemix.net/)
3. [Locations of Important Agent API Classes](https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/docs/important-agent-API-classes.md)
4. [Key Concepts](https://github.com/sujeilyfonseca/rogue-cloud-client-codewind/blob/master/docs/introduction-and-concepts.md)
5. [Eclipse ANSI Console](https://mihai-nita.net/2013/06/03/eclipse-plugin-ansi-in-console/)


## Next Steps ##
Have a few more minutes? Visit the [rogue-cloud](https://github.com/sujeilyfonseca/rogue-cloud) repository to know the arquitecture, and how to continue developing and improving the Rogue Cloud game.
