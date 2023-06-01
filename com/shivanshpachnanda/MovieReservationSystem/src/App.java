package com.shivanshpachnanda.MovieReservationSystem.src;

import javax.swing.JComponent;
import javax.swing.JFrame;

class App {
//	static intoPane pane = new intoPane();
	static JComponent[] comp = {new intoPane(),new IntroImageLabel()};
	static JFrame Opening = new WindowClass(comp);
}
