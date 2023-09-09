package Miscellanious;
//
//public class GuiTicTacToe {
//}

import javax.swing.*;
        import java.awt.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;

public class GuiTicTacToe extends JFrame implements ActionListener {
    private JButton[][] buttons;
    private char currentPlayer;
    private JLabel statusLabel;

    public GuiTicTacToe() {
        buttons = new JButton[3][3];
        currentPlayer = 'X';

        // Create the game board
        JPanel boardPanel = new JPanel(new GridLayout(3, 3));
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col] = new JButton("");
                buttons[row][col].setFont(new Font("Arial", Font.PLAIN, 48));
                buttons[row][col].setFocusPainted(false);
                buttons[row][col].addActionListener(this);
                boardPanel.add(buttons[row][col]);
            }
        }

        // Create a label for game status
        statusLabel = new JLabel("Player " + currentPlayer + "'s turn");
        statusLabel.setFont(new Font("Arial", Font.PLAIN, 20));

        // Set up the frame
        setLayout(new BorderLayout());
        add(boardPanel, BorderLayout.CENTER);
        add(statusLabel, BorderLayout.SOUTH);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Tic-Tac-Toe");
        setSize(300, 300);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton buttonClicked = (JButton) e.getSource();

        if (buttonClicked.getText().equals("") && !isGameWon()) {
            buttonClicked.setText(String.valueOf(currentPlayer));
            buttonClicked.setEnabled(false);
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            statusLabel.setText("Player " + currentPlayer + "'s turn");
        }

        if (isGameWon()) {
            statusLabel.setText("Player " + ((currentPlayer == 'X') ? 'O' : 'X') + " wins!");
        } else if (isBoardFull()) {
            statusLabel.setText("It's a draw!");
        }
    }
    private boolean isGameWon() {
        char lastPlayer = (currentPlayer == 'X') ? 'O' : 'X';

        // Check rows, columns, and diagonals for a win
        for (int i = 0; i < 3; i++) {
            if (buttons[i][0].getText().equals(String.valueOf(lastPlayer))
                    && buttons[i][1].getText().equals(String.valueOf(lastPlayer))
                    && buttons[i][2].getText().equals(String.valueOf(lastPlayer))) {
                return true; // Row win
            }
            if (buttons[0][i].getText().equals(String.valueOf(lastPlayer))
                    && buttons[1][i].getText().equals(String.valueOf(lastPlayer))
                    && buttons[2][i].getText().equals(String.valueOf(lastPlayer))) {
                return true; // Column win
            }
        }
        if (buttons[0][0].getText().equals(String.valueOf(lastPlayer))
                && buttons[1][1].getText().equals(String.valueOf(lastPlayer))
                && buttons[2][2].getText().equals(String.valueOf(lastPlayer))) {
            return true; // Diagonal win (top-left to bottom-right)
        }
        if (buttons[0][2].getText().equals(String.valueOf(lastPlayer))
                && buttons[1][1].getText().equals(String.valueOf(lastPlayer))
                && buttons[2][0].getText().equals(String.valueOf(lastPlayer))) {
            return true; // Diagonal win (top-right to bottom-left)
        }
        return false;
    }


//    private boolean isGameWon() {
//        // Check rows, columns, and diagonals for a win
//        for (int i = 0; i < 3; i++) {
//            if (buttons[i][0].getText().equals(String.valueOf(currentPlayer))
//                    && buttons[i][1].getText().equals(String.valueOf(currentPlayer))
//                    && buttons[i][2].getText().equals(String.valueOf(currentPlayer))) {
//                return true; // Row win
//            }
//            if (buttons[0][i].getText().equals(String.valueOf(currentPlayer))
//                    && buttons[1][i].getText().equals(String.valueOf(currentPlayer))
//                    && buttons[2][i].getText().equals(String.valueOf(currentPlayer))) {
//                return true; // Column win
//            }
//        }
//        if (buttons[0][0].getText().equals(String.valueOf(currentPlayer))
//                && buttons[1][1].getText().equals(String.valueOf(currentPlayer))
//                && buttons[2][2].getText().equals(String.valueOf(currentPlayer))) {
//            return true; // Diagonal win (top-left to bottom-right)
//        }
//        if (buttons[0][2].getText().equals(String.valueOf(currentPlayer))
//                && buttons[1][1].getText().equals(String.valueOf(currentPlayer))
//                && buttons[2][0].getText().equals(String.valueOf(currentPlayer))) {
//            return true; // Diagonal win (top-right to bottom-left)
//        }
//        return false;
//    }

    private boolean isBoardFull() {
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (buttons[row][col].getText().equals("")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new GuiTicTacToe());
    }
}

