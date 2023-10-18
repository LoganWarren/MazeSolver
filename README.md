# Maze Solver - CS 0445 Algorithms and Data Structures 1
## Overview:

In this project, we leverage the power of stacks and queues to navigate and find a way through mazes. The application allows users to load different mazes and solve them using either a stack-based or queue-based approach, visualizing the pathfinding process.

### Features:
- Load Mazes: Users can load custom mazes to test the solver's capabilities.
- Two Solvers: Choose between a stack-based or queue-based approach to maze-solving.
- Visualize Pathfinding: Watch the solver explore the maze in real-time, marking visited squares and highlighting the successful path.

### Technical Implementation:
- Maze Representation: Mazes are represented as 2D arrays made up of individual squares (either empty, wall, start, or exit).
- Maze Loading: Custom mazes can be loaded from text files with specific formatting.
- Solvers: Two concrete implementations of the abstract MazeSolver class: MazeSolverStack and MazeSolverQueue.
- Data Structures: Custom implementations of stacks and queues, built on top of a simple linked list data structure.

### Testing:

JUnit tests are provided for various components, ensuring the robustness of the solvers and data structures.
Getting Started:

- Clone the repository.
- Load the project into your preferred Java IDE.
- Ensure the mazes folder is in the correct location to load mazes.
- Run MazeApp.java to launch the application.
- Load a maze and select a solver type to begin pathfinding.

Dependencies:
- Java SE Development Kit (JDK)
- JUnit for testing