import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.Timer;
public class TicTacToe implements ActionListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JPanel control_panel = new JPanel();
    JButton resetButton = new JButton("New Game");
    JLabel textfield = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;

    TicTacToe() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 850);
        frame.setMinimumSize(new Dimension(600, 650));
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);

        textfield.setBackground(new Color(25, 25, 25));
        textfield.setForeground(new Color(25, 255, 0));
        textfield.setFont(new Font("Ink Free", Font.BOLD, 75));
        textfield.setHorizontalAlignment(JLabel.CENTER);
        textfield.setText("Tic-Tac-Toe");
        textfield.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 800, 100);

        button_panel.setLayout(new GridLayout(3, 3, 6, 6));
        button_panel.setBackground(new Color(150, 150, 150));
        //frame.add(button_panel);

        // Setup control panel with reset button
        control_panel.setLayout(new FlowLayout());
        control_panel.setBackground(new Color(50, 50, 50));
        resetButton.setFont(new Font("Arial", Font.BOLD, 30));
        resetButton.setFocusable(false);
        resetButton.addActionListener(e -> resetGame());
        control_panel.add(resetButton);

        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            button_panel.add(buttons[i]);
            buttons[i].setFont(new Font("MV Boli", Font.BOLD, 120));
            buttons[i].setFocusable(false);
            buttons[i].addActionListener(this);
           // buttons[i].setBorder(BorderFactory.createRaisedBevelBorder()); //gives buttons 3D shadow effect
            buttons[i].setBorder(BorderFactory.createCompoundBorder(
                    BorderFactory.createLineBorder(Color.DARK_GRAY, 3),
                    BorderFactory.createRaisedBevelBorder()
            ));
        }

        title_panel.add(textfield);
        frame.add(title_panel, BorderLayout.NORTH);
        frame.add(button_panel, BorderLayout.CENTER);
        frame.add(control_panel, BorderLayout.SOUTH);

        firstTurn();


    }

    /**
     * Invoked when an action occurs.
     *
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < 9; i++) {
            if (e.getSource() == buttons[i]) {
                if (player1_turn) {
                    if (buttons[i].getText().equals("")) {
                        buttons[i].setForeground(new Color(255, 0, 0));
                        buttons[i].setText("X");
                        player1_turn = false;
                        textfield.setText("O turn");
                        check();
                    }
                }
                else{
                    if (buttons[i].getText().equals("")) {
                        buttons[i].setForeground(new Color(0, 0, 255));
                        buttons[i].setText("O");
                        player1_turn = true;
                        textfield.setText("X turn");
                        check();
                    }
                }

            }
        }


    }




    public void firstTurn(){
        Timer timer = new Timer(2000, e -> {
            if (random.nextInt(2) == 0) {
                player1_turn = true;
                textfield.setText("X turn");
            } else {
                player1_turn = false;
                textfield.setText("O turn");
            }
        });
        timer.setRepeats(false);
        timer.start();
    }
    public void check(){
        //check X win conditions

                if(
                        (buttons[0].getText().equals("X")) &&
                        (buttons[1].getText().equals("X")) &&
                        (buttons[2].getText().equals("X"))){
                    xWins(0,1,2);
                }
        if(
                        (buttons[3].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[5].getText().equals("X"))){
            xWins(3,4,5);
        }
        if(
                        (buttons[6].getText() == "X") &&
                        (buttons[7].getText() == "X") &&
                        (buttons[8].getText() == "X")){
                    xWins(6,7,8);
        }
        if(
                        (buttons[0].getText().equals("X")) &&
                        (buttons[3].getText().equals("X")) &&
                        (buttons[6].getText().equals("X"))){
                    xWins(0,3,6);
        }
        if(
                        (buttons[1].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[7].getText().equals("X"))){
                    xWins(1,4,7);
        }
        if(
                        (buttons[2].getText().equals("X")) &&
                        (buttons[5].getText().equals("X")) &&
                        (buttons[8].getText().equals("X"))){
                    xWins(2,5,8);
        }
        if(
                        (buttons[0].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[8].getText().equals("X"))){
                    xWins(0,4,8);
        }
        if(
                        (buttons[2].getText().equals("X")) &&
                        (buttons[4].getText().equals("X")) &&
                        (buttons[6].getText().equals("X"))){
                  xWins(2,4,6);
        }
        //check O win conditions

        if(
                        (buttons[0].getText().equals("0")) &&
                        (buttons[1].getText().equals("0")) &&
                        (buttons[2].getText().equals("0"))){
                 oWins(0,1,2);
        }
        if(
                        (buttons[3].getText().equals("0")) &&
                        (buttons[4].getText().equals("0")) &&
                        (buttons[5].getText().equals("0"))){
                 oWins(3,4,5);
        }
        if(
                        (buttons[6].getText().equals("0")) &&
                        (buttons[7].getText().equals("0")) &&
                        (buttons[8].getText().equals("0"))){
                 oWins(6,7,8);
        }
        if(
                        (buttons[0].getText().equals("0")) &&
                        (buttons[3].getText().equals("0")) &&
                        (buttons[6].getText().equals("0"))){
                 oWins(0,3,6);
        }
        if(
                        (buttons[1].getText().equals("0")) &&
                        (buttons[4].getText().equals("0")) &&
                        (buttons[7].getText().equals("0"))){
                 oWins(1,4,7);
        }
        if(
                        (buttons[2].getText().equals("0")) &&
                        (buttons[5].getText().equals("0")) &&
                        (buttons[8].getText().equals("0"))){
                  oWins(2,5,8);
        }
        if(
                        (buttons[0].getText().equals("0")) &&
                        (buttons[4].getText().equals("0")) &&
                        (buttons[8].getText().equals("0"))){
                 oWins(0,4,8);
        }
        if(
                        (buttons[2].getText().equals("0")) &&
                        (buttons[4].getText().equals("0")) &&
                        (buttons[6].getText().equals("0"))){
                 oWins(2,4,6);        }

        //check for draw
        boolean boardFull = true;
        for (int i = 0; i < 9; i++) {
            if (buttons[i].getText().equals("")) {
                boardFull = false;
                break;
            }
        }
        if (boardFull) {
            textfield.setText("Draw!");
            for (int i = 0; i < 9; i++) {
                buttons[i].setEnabled(false);
            }
        }

    }
    public void xWins(int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        textfield.setText("X wins");
    }
    public void oWins(int a, int b, int c){
        buttons[a].setBackground(Color.GREEN);
        buttons[b].setBackground(Color.GREEN);
        buttons[c].setBackground(Color.GREEN);

        for (int i = 0; i < 9; i++) {
            buttons[i].setEnabled(false);
        }
        textfield.setText("O wins");
    }

    public void resetGame() {
        // Clear all buttons
        for (int i = 0; i < 9; i++) {
            buttons[i].setText("");
            buttons[i].setEnabled(true);
            buttons[i].setBackground(UIManager.getColor("Button.background")); //prevents background color from going gray
        }

        // Reset title
        textfield.setText("Tic-Tac-Toe");

        // Randomly choose who goes first
        firstTurn();
    }

    }

