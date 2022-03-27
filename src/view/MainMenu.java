package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.Border;
import javax.imageio.*;
import javax.swing.event.MouseInputListener;

import com.sun.xml.internal.ws.assembler.dev.ServerTubelineAssemblyContext;
import controller.ImagePanel;
import controller.Tetris;

public class MainMenu extends JPanel {

	private static final long serialVersionUID = 1L;

	JFrame myFrame;
	
	public int width = 550, height = 830;

	public MainMenu(){
		
		myFrame = new JFrame();

		myFrame.pack();
		myFrame.setTitle("Tetris");
		myFrame.setLocation(650, 100);
		myFrame.setSize(width, height);
		myFrame.setResizable(false);
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel myPanel = new JPanel(){
			
			private static final long serialVersionUID = 1L;

			@Override
			protected void paintComponent(Graphics g) {
				super.paintComponent(g);
				g.drawImage(Tetris.bgpanel, 0, 0, null);
			}
		};
		BoxLayout boxlayout = new BoxLayout(myPanel, BoxLayout.Y_AXIS);
		myPanel.setLayout(boxlayout);
		myPanel.add(Box.createVerticalStrut(200));
		myPanel.setVisible(true);
		//Icon icon = new ImageIcon("C:\\Users\\HP\\Downloads\\Tetris-java-main\\src\\resources\\wooden_bar.png");

	
		JLabel jLbl = new JLabel("TETRIS");
		jLbl.setFont(new Font("Arial", Font.BOLD, 50));
		jLbl.setAlignmentX(Component.CENTER_ALIGNMENT);
		myPanel.add(jLbl);
		myPanel.add(Box.createVerticalStrut(20));
		
		JButton jBtn1 = new JButton("New Game");
		jBtn1.setFont(new Font("Arial", Font.BOLD, 30));
		jBtn1.setFocusable(false);
		jBtn1.setBorder(new RoundBtn(15));
		myPanel.add(jBtn1);
		jBtn1.setAlignmentX(Component.CENTER_ALIGNMENT);
		myPanel.add(Box.createVerticalStrut(20));
		
		JButton jBtn2 = new JButton("Tutorial");
		jBtn2.setFont(new Font("Arial", Font.BOLD, 30));
		jBtn2.setFocusable(false);
		jBtn2.setBorder(new RoundBtn(15));
		myPanel.add(jBtn2);
		jBtn2.setAlignmentX(Component.CENTER_ALIGNMENT);
		myPanel.add(Box.createVerticalStrut(20));
		
		JButton jBtn3 = new JButton("High Score");
		jBtn3.setFont(new Font("Arial", Font.BOLD, 30));
		jBtn3.setFocusable(false);
		jBtn3.setBorder(new RoundBtn(15));
		myPanel.add(jBtn3);
		jBtn3.setAlignmentX(Component.CENTER_ALIGNMENT);
		myPanel.add(Box.createVerticalStrut(20));
		
		JButton jBtn4 = new JButton("Exit");
		jBtn4.setFont(new Font("Arial", Font.BOLD, 30));
		jBtn4.setFocusable(false);
		jBtn4.setBorder(new RoundBtn(15));
		myPanel.add(jBtn4);
		jBtn4.setAlignmentX(Component.CENTER_ALIGNMENT);
		myPanel.add(Box.createVerticalStrut(20));

		SwitchScene switchScene = new SwitchScene(myFrame);
		jBtn1.addMouseListener(switchScene);
		jBtn2.addMouseListener(switchScene);
		jBtn3.addMouseListener(switchScene);
		jBtn4.addMouseListener(switchScene);
		
		myFrame.add(myPanel);
		myFrame.setVisible(true);
	}
	
}
