package com.shivanshpachnanda.MovieReservationSystem.src;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


@SuppressWarnings("serial")
class SimulationPane extends JPanel implements ActionListener{
	int ticketCollectorTime = 2;
	private Queue<Integer>[] queues;
	
	private JLabel correction;
	private JTextField userText;
	public JButton submit;
	
	SimulationPane()
	{
		this.setBounds(0,0,300,800);
		this.setBackground(new Color(42,42,42,255));
		this.setLayout(null);
		
		JLabel Title = new JLabel("Simulator");
		Title.setBounds(0,50,300,60);
		Title.setHorizontalAlignment(JLabel.CENTER);
		Title.setFont(new Font("Times New Roman",Font.BOLD,32));
		Title.setForeground(Color.white);
		
		
		JLabel userName = new JLabel("No of entries");
		userName.setForeground(new Color(188,188,188,255));
		userName.setBounds(10,120,360,45);
		userName.setHorizontalAlignment(JLabel.LEFT);
		userName.setFont(new Font("Times New Roman",Font.PLAIN,18));
	
		
		userText = new JTextField();
		userText.setBounds(10,160,280,25);
		userText.setFont(new Font("Times New Roman",Font.PLAIN,16));
		userText.setForeground(Color.WHITE);
		userText.setCaretColor(Color.GRAY);
		userText.setBackground(Color.black);
		userText.addKeyListener(new KeyAdapter() {
	         public void keyPressed(KeyEvent ke) {
	            String value = userText.getText();
	            int l = value.length();
	            if (ke.getKeyChar() >= '0' && ke.getKeyChar() <= '9' || ke.getKeyCode()  == KeyEvent.VK_BACK_SPACE) {
	            	userText.setEditable(true);
	                correction.setVisible(false);
	            } else {
	            	userText.setEditable(false);
	            	correction.setText("* Enter only numeric digits(0-9)");
	            	correction.setVisible(true);
	            }
	         }
	      });
		
		submit = new JButton("SUBMIT");//ActionPerformed
		submit.addActionListener(this);
		submit.setFocusable(false);
		submit.setBounds(100,200,100,30);	
		
		correction = new JLabel();
		correction.setHorizontalAlignment(JLabel.CENTER);
		correction.setBounds(0,220,300,45);
		correction.setText("Please choose a correct number");
		correction.setFont(new Font("Times New Roman",Font.PLAIN,12));
		correction.setForeground(Color.RED);
		correction.setVisible(false);
			
		this.add(userName);
		this.add(userText);
		this.add(submit);	
		this.add(correction);
		this.add(Title);
	 	
	}
	@Override
	 public void actionPerformed(ActionEvent e)
	 {
		 if(e.getSource()==submit)
		 {
			 int n=Integer.parseInt(userText.getText());
			 if(n==0)
			 {   
				 correction.setText("* Enter number greater than 0");
				 correction.setVisible(true);
			 }
			 else
			 {
				 correction.setVisible(false);
				 App2.Opening.dispose();
				 App2.pane = new ContentPanel(n);
				 App2.comp= new JComponent[]{App2.pane.pane,App2.img,App2.simul};
				 App2.Opening = new WindowClass(App2.comp);
			 }
		 }
	 }
}
