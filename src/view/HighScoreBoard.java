package view;

import controller.Tetris;

import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class HighScoreBoard {
    public int width = 550, height = 830;
    JFrame highScoreBoard;
    public HighScoreBoard(JFrame mainmenu) {
        highScoreBoard = new JFrame("High Score Board");
        highScoreBoard.setSize(width, height);
        highScoreBoard.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        highScoreBoard.setResizable(false);
        highScoreBoard.setLocation(650, 100);
        highScoreBoard.setVisible(true);
        
        JPanel myPanel = new JPanel()
        {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                HighScore.paintBackground(g);
                HighScore.paintHighScore(g);
            }
        };
        myPanel.setLayout(null);

        JButton undo = new JButton("RETURN");
        Dimension size = undo.getPreferredSize();
        undo.setBounds(50, 50, size.width, size.height);
        undo.setSize(200,50);
        undo.setFont(new Font("Noto Sans", Font.BOLD, 32));
        undo.setBorder(new RoundBtn(25));
        undo.setFocusable(false);
        
        undo.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                mainmenu.setVisible(true);
                highScoreBoard.setVisible(false);
                highScoreBoard.dispose();
            }
        });
        
        myPanel.add(undo);
        myPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        highScoreBoard.add(myPanel);
        
    }
}
