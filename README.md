# Maze Solver - CS 0445 Algorithms and Data Structures 1
## Overview
This project uses stacks and queues to explore and find paths through a maze. The primary aim is to understand and differentiate the traversal patterns of stacks and queues in a maze environment.

## Features
    __Maze Representation:__ Mazes are represented as 2D arrays with unique codes for paths, walls, start, and end points.
    Maze Solver: An abstract superclass that contains the logic to solve the maze. Two concrete implementations, MazeSolverStack and MazeSolverQueue, represent the use of stacks and queues respectively.
    Visualization: The MazeApp program provides a GUI interface to visualize the maze solving process in real-time.

How to Run

    Load a maze file using the load button.
    Choose between stack and queue as your maze-solving strategy.
    Use the step button to take one step at a time or the start button to run the animation.

Dependencies

    Java SE Development Kit
    JUnit for testing

Testing

Four JUnit test files are provided to validate the implementation:

    MiniListTest.java
    MyQueueTest.java
    MyStackTest.java
    MazeSolverTest.java