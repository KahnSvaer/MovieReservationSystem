package com.shivanshpachnanda.MovieReservationSystem.src;

import java.awt.Color;
import java.awt.GridBagLayout;

import javax.swing.JPanel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

@SuppressWarnings("serial")
class intoPane extends JPanel{
	intoPane()
	{
		JLabel img = new JLabel();
		ImageIcon bGimage = new ImageIcon("com/shivanshpachnanda/MovieReservationSystem/MetaFiles/Img.png");
		img.setIcon(bGimage);
		img.setBounds(25,180,550,147);
		
		this.setBounds(600,0,600,800);
		this.setBackground(new Color(35,35,35,255));
		this.setOpaque(true);
		
		
		this.setLayout(null);
		this.add(new Login());
		this.add(img);
		
		this.setVisible(true);
		
	}
}
