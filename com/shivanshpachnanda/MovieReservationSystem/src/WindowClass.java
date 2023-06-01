package com.shivanshpachnanda.MovieReservationSystem.src;

import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import javax.swing.ImageIcon;
import java.awt.Color;


@SuppressWarnings("serial")
class WindowClass extends JFrame{
	WindowClass(JComponent[] panes)
	{	
		ImageIcon image = new ImageIcon("com/shivanshpachnanda/MovieReservationSystem/MetaFiles/Popcorn.png"); 
		this.setTitle("Movie Reservation System");
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.getContentPane().setBackground(new Color(53,53,53,255));
		this.setLayout(null);
		this.setIconImage(image.getImage());
		this.setSize(1200,800);
		this.setVisible(true);
		this.setResizable(false);
		for (JComponent pane : panes)
			this.add(pane);
	}
}