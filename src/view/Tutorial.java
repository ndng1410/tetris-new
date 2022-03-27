package view;

import controller.Tetris;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Tutorial {
    public int width = 550, height = 830;
    private JFrame tutorial;
    public Tutorial(JFrame mainmenu){
        tutorial = new JFrame("Tutorial");
        tutorial.setSize(width, height);
        tutorial.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tutorial.setResizable(false);
        tutorial.setLocation(650,100);
        JPanel myPanel = new JPanel(){
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(Tetris.bgpanel, 0, 0, null);
            }
        };
        tutorial.setVisible(true);
        tutorial.getContentPane();
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
                tutorial.setVisible(false);
                tutorial.dispose();
            }
        });
       
        myPanel.add(undo);
        myPanel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
        tutorial.add(myPanel);
    }
}
