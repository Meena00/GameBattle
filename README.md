
# GameBattle

## Overview

GameBattle is a text-based game where a hero battles monsters. The project includes three main classes: `Battle`, `Hero`, and `Monster`. These classes manage game mechanics, combat simulations, and character attributes.

## Classes

### 1. Battle

The `Battle` class orchestrates battles between a `Hero` and a `Monster`. It includes methods for initiating combat, managing turns, and determining battle outcomes based on game rules.

#### Key Methods:

- **fight(Hero h, Monster m)**: Initiates and manages combat between a hero and a monster, handling attack calculations, damage reception, and victory conditions.

### 2. Hero

The `Hero` class represents the player's character. It tracks attributes such as name, hit points, attack rating, defense rating, XP, level, and healing potions. The class manages combat actions, XP progression, level upgrades, and healing during battles.

#### Key Methods:

- **receiveAttack(int incAttack)**: Calculates damage received by the hero, considering defense to mitigate incoming damage.

- **receiveXP(int xpReceived)**: Manages XP gain and level progression, updating attributes and level based on XP received.

- **useHealingPotion()**: Allows the hero to restore hit points using available healing potions during combat.

### 3. Monster

The `Monster` class represents adversaries encountered by the hero. It tracks attributes such as type, hit points, attack rating, XP value (for the hero), and gold value (rewarded to the hero upon defeat). This class manages functions for receiving damage and checking if defeated.

#### Key Methods:

- **receiveAttack(int incAttack)**: Reduces the monster's hit points when attacked by the hero.

- **isDefeated()**: Checks if the monster has been defeated (hit points <= 0), returning true if defeated.

## Technical Terms and Skills

- **Object-Oriented Programming (OOP)**: Utilized for encapsulating attributes and behaviors within classes (`Hero`, `Monster`, `Battle`), promoting modularity and reusability.

- **Game Mechanics**: Includes turn-based combat, hit point management, XP progression, and level-based attribute increases.

- **Simulation**: Methods simulate game actions such as combat dynamics and character interactions, enhancing user engagement.

- **Conditionals and Loops**: Employed for implementing game logic, including damage calculations, victory conditions, and resource management (e.g., healing potions).


-------------
