Tic-Tac-Toe

A classic two-player Tic-Tac-Toe game with a clean graphical user interface built using Java Swing.
Description

This is an interactive Tic-Tac-Toe game where two players take turns placing X's and O's on a 3x3 grid. The first player to align three marks horizontally, vertically, or diagonally wins the game. The application features a polished GUI with visual feedback, game state management, and reset functionality.
Features

    Intuitive GUI - Clean, colorful interface using Java Swing components
    Visual Feedback - Color-coded players (red X, blue O) and green highlighting for winning combinations
    Smart Game Logic - Detects all 8 possible win scenarios plus draw conditions
    Random Turn Selection - Randomly determines which player starts each game
    Reset Functionality - "New Game" button to instantly start a fresh match
    3D Button Effects - Raised bevel borders with dark gray outlines for enhanced visual appeal
    Turn Indicator - Header displays whose turn it is in real-time

Screenshots

(<img width="1919" height="1017" alt="image" src="https://github.com/user-attachments/assets/272128ad-8be4-4e27-8ee0-9accaa0ea73e" />
 <img width="1919" height="1019" alt="Screenshot 2025-11-29 015217" src="https://github.com/user-attachments/assets/bb387eac-a82a-4b1c-9bcf-bcf332e10391" />
 <img width="1919" height="1017" alt="Screenshot 2025-11-29 015137" src="https://github.com/user-attachments/assets/d18d6eed-49c1-4466-b144-137560aa35b1" />
)
Requirements

    Java JDK 17 or higher

How to Run
Using an IDE (Recommended)

    Clone this repository
    Open the project in your IDE (IntelliJ IDEA, Eclipse, etc.)
    Navigate to src/Main.java
    Run the Main class

Command Line
bash

# Navigate to the project directory
cd TicTacToe

# Compile the source files
javac src/Main.java src/TicTacToe.java

# Run the application
java -cp src Main

How to Play

    The game window will appear and randomly select who goes first (X or O)
    Players take turns clicking on empty squares to place their mark
    The turn indicator at the top shows whose turn it is
    The game automatically detects wins and draws
    Winning squares are highlighted in green
    Click "New Game" to start a fresh match at any time

Project Structure

TicTacToe/
├── .idea/                  # IntelliJ IDEA configuration
├── src/
│   ├── Main.java          # Application entry point
│   └── TicTacToe.java     # Game logic and GUI implementation
├── TicTacToe.iml          # IntelliJ module file
└── README.md              # Project documentation

Technical Details
Key Components

    JFrame - Main application window (800x850px)
    JPanel - Organized layout with title, game board, and control sections
    JButton Array - 3x3 grid of interactive buttons for game squares
    ActionListener - Event-driven architecture for user interactions
    Timer - Asynchronous turn selection with 2-second delay
    BorderLayout & GridLayout - Responsive layout management

Game Logic

    Implements all 8 winning combinations (3 rows, 3 columns, 2 diagonals)
    Draw detection when board is full with no winner
    Proper string comparison using .equals() method
    State management for turn tracking and game flow

What I Learned

    Building GUI applications with Java Swing
    Event-driven programming with ActionListener interface
    Game state management and logic implementation
    Working with layout managers (BorderLayout, GridLayout, FlowLayout)
    Proper string comparison in Java (.equals() vs ==)
    Creating responsive and visually appealing interfaces
    Debugging and fixing common Java GUI issues

Future Enhancements

    Add single-player mode with AI opponent (minimax algorithm)
    Implement difficulty levels (Easy, Medium, Hard)
    Keep track of win statistics across multiple games
    Add sound effects for moves and wins
    Create custom themes and color schemes
    Add player name input
    Implement undo/redo functionality
    Add animation for winning combinations

Author

Luaan Robinson

    GitHub: [Luaan-Robinson]
    LinkedIn: [www.linkedin.com/in/luaan-robinson-a6338621b]

License

This project is open source and available under the MIT License.
Acknowledgments

    Built as a learning project to practice Java Swing and OOP principles
    Inspired by the classic Tic-Tac-Toe game

