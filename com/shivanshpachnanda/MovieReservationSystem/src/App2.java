package com.shivanshpachnanda.MovieReservationSystem.src;

import java.awt.Component;

import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;

class App2{
	
	static WindowClass Opening;
	static ContentPanel pane;
	static SimulationPane simul = new SimulationPane();
	static JComponent[] comp;
	static JLabel img;
	App2()
	{	
		pane = new ContentPanel(0);
		ImageIcon bGimage = new ImageIcon("com/shivanshpachnanda/MovieReservationSystem/MetaFiles/Img.png");
		img = new JLabel(bGimage,JLabel.CENTER);
		img.setIcon(bGimage);
		img.setBounds(300,5,900,110);
		
		
		comp = new JComponent[]{pane.pane,img,simul};
		Opening = new WindowClass(comp);
	}
	
}
