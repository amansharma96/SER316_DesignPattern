# RPG Simulator

This is an RPG simulator application that allows players to create and control characters in an adventure-filled game world. The game incorporates various features such as character classes, races, equipment, battles, leveling up, and unique events. Players can explore floors, encounter enemies, find items, and engage in strategic combat.

## Functional Requirements

### Character Creation

- Players can choose a class for their character or have it assigned randomly.
- Each class has a different subset of skills or magic associated with it.

### Gameplay Elements

- Players encounter randomly generated small enemies on each floor, medium enemies every 5 floors, and a boss every 10 floors.
- Characters can equip items such as weapons, armor, helmets, shields, and boots.
- After each battle, there is a chance to find a chest containing armor, money, potions, or encounter a shop to spend money.
- The shop randomly sells 3 objects, including weapons, magic scrolls, potions, and rare items like instant level-up.

### Progression and Difficulty

- Enemies become progressively stronger as players advance to higher floors.
- The game is divided into cycles with four parts: Q1, Q2, Q3, and Q4.

### Character Stats and Abilities

- Characters have stats such as Attack, Health or another resource, Defense, and Speed.
- Each character possesses at least one skill or magic power they can use in battles.
- Physical attacks have a chance to critically strike for double damage.
- Attacks have a chance to miss or fail.

### Battle Mechanics

- Battle starts with the participant having the highest speed going first.
- When a participant's HP reaches 0 or less, they lose the fight.

## Design Patterns

The RPG Simulator incorporates several design patterns to enhance its functionality and maintain modularity:

- Decorator Pattern: Used for evolutions and upgrading skills or magic powers.
- Factory Pattern: Employed to create new characters or trainers in the game.
- Other design patterns can be explored and utilized to enhance specific features or components as desired.

## Getting Started

To run the RPG Simulator, follow these steps:

1. Clone the repository to your local machine.
2. Install the required dependencies listed in the project's documentation.
3. Build and compile the application.
4. Run the executable file or start the game using the provided command.

## Acknowledgements

This project was given to us in our SER316 class by our professor.