# GPA Game

A fun GPA-themed game built with Java. Players catch falling grades to score points and avoid failing grades. Features include:
- **Interactive Gameplay**: Catch grades and earn points.
- **Animations**: Smooth falling grades for an engaging experience.
- **Leaderboard**: Stores top scores using SQLite.
---
## Technologies Used
- **Java**: Core language for development.
- **Swing**: For the user interface.
- **Gradle**: For building and packaging the project.
- **SQLite**: For storing leaderboard scores.
---
## Design Patterns Used

This project leverages several design patterns to improve code structure, scalability, and maintainability:

1. **Singleton Pattern**:
   - **Where Used**: `DatabaseManager`
   - **Purpose**: Ensures a single, globally accessible instance of the database connection.

2. **Factory Pattern**:
   - **Where Used**: `GradeFactory`
   - **Purpose**: Creates different types of grades (`A`, `B`, `C`, `D`, `F`) dynamically based on input.

3. **Observer Pattern**:
   - **Where Used**: `Leaderboard` and `LeaderboardScreen`
   - **Purpose**: Updates the leaderboard display automatically whenever a new score is added.

4. **State Pattern**:
   - **Where Used**: Game states (`MainMenu`, `Game`, `GameOverScreen`)
   - **Purpose**: Encapsulates different states of the game, making transitions (e.g., from menu to game) easy to manage.

5. **Command Pattern**:
   - **Where Used**: Player actions (`MoveLeftCommand`, `MoveRightCommand`)
   - **Purpose**: Encapsulates user actions as objects, decoupling input handling from game logic.
