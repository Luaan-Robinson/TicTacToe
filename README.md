Tic-Tac-Toe
A simple two-player Tic-Tac-Toe game built with Java Swing.
Description
This is a classic Tic-Tac-Toe game with a graphical user interface. Two players take turns placing X's and O's on a 3x3 grid. The first player to get three marks in a row (horizontally, vertically, or diagonally) wins the game.
Features

Clean, colorful GUI using Java Swing
Random selection of which player goes first
Visual indication of winning combination (green highlighting)
Turn indicator at the top of the window

Requirements

Java JDK 17 or higher

How to Run

Clone this repository
Open the project in your IDE (IntelliJ IDEA recommended)
Run the Main.java file

Alternatively, compile and run from the command line:
bashjavac src/Main.java src/TicTacToe.java
java -cp src Main

How to Play

The game randomly decides who goes first (X or O)
Click on any empty square to place your mark
Players alternate turns automatically
The game announces the winner when three marks align
Winning squares are highlighted in green

Project Structure:

TicTacToe/
├── src/
│   ├── Main.java        # Entry point
│   └── TicTacToe.java   # Game logic and GUI
└── TicTacToe.iml        # IntelliJ project file

Future Enhancements:

Add a reset/new game button
Implement draw detection
Add single-player mode with AI opponent
Keep track of win statistics

