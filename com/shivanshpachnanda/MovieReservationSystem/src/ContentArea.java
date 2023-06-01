package com.shivanshpachnanda.MovieReservationSystem.src;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JTextArea;
import javax.swing.JTextPane;
import javax.swing.border.Border;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.text.SimpleAttributeSet;
class ContentArea extends JTextArea{
	ContentArea()
	{	
		{
			this.setPreferredSize(new Dimension(200, 600));
			this.setFont(new Font("Times New Roman",Font.BOLD,14));
			this.setEditable(false);
			
			this.setBackground(new Color(69,69,72,255));
			this.setForeground(Color.white);
			Border blackline = BorderFactory.createLineBorder(Color.black,3,true);
			this.setBorder(blackline);
		}
	}
	
}
