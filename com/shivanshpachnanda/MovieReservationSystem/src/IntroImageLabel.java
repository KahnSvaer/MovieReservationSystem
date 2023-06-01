package com.shivanshpachnanda.MovieReservationSystem.src;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
class IntroImageLabel extends JPanel{

	IntroImageLabel()
	{
		
		JLabel img = new JLabel();
		ImageIcon bGimage = new ImageIcon("com/shivanshpachnanda/MovieReservationSystem/MetaFiles/SidePanel.png");
		img.setIcon(bGimage);
		img.setBounds(0,(800-540),600,540);
		
		this.setBounds(0,0,600,800);
		this.setBackground(new Color(30,86,161,255));
		this.setOpaque(true);
		
		this.setLayout(null);
		this.add(img);
	}
}
