package com.shivanshpachnanda.MovieReservationSystem.src;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

import com.shivanshpachnanda.MovieReservationSystem.src.Queue.Node;

import java.util.Timer;
import java.util.TimerTask;


class ContentPanel{
	public int n=0;
	Timer timer;
	public JScrollPane pane;
	public ContentArea[] QContent;
	public Queue<Integer>[] qlist;
	@SuppressWarnings("unchecked")
	ContentPanel(int n)
	{	
		this.n=n;
		JPanel panel = new JPanel();
		panel.setLayout(null);
		pane = new JScrollPane(panel);
		pane.setBounds(300,120,880,700);
		pane.setBackground(null);
		
		panel.setLayout(new GridLayout(1,(int)n/18+1,10,0));
		panel.setBackground(new Color(53,53,53,255));
		QContent = new ContentArea[(int)n/18+1];
		qlist = new Queue[(int)n/18+1];
		for(int i=0;i<(int)n/18+1;i++)
			qlist[i] = new Queue<Integer>();
		
		for(int i =0; i < (int)(n/18+1);i++)
		{
			QContent[i] = new ContentArea();
			panel.add(QContent[i]);
			QContent[i].setText("                   Queue "+i+"\n");
			if(i==0)
			{
				QContent[0].setText("  In front of Ticket Collector\n");
			}
		}
		for(int i=0;i<n;i++)
		{
			qlist[(int)i/18].enqueue(i+1);
		}
		for(int i=0;i<(int)(n/18+1);i++)
		{	
			Node<Integer> temp = qlist[i].front;
			while(temp!=null)
			{	
				QContent[i].append("\n"+"\t"+Integer.toString(temp.data)+"\n");
				temp = temp.next;
			}
		}
		timer = new Timer();
		myTimerClass task = new myTimerClass();
		timer. scheduleAtFixedRate(task,2000,2000);
		if(n==0)
		{
			QContent[0].setText("Please set up the simulator");
			timer.cancel();
		}
	}
	class myTimerClass extends TimerTask
	{
		public void run() {
			for(int i =0; i < (int)(n/18+1);i++)
			{
				QContent[i].setText("                   Queue "+i+"\n");
				if(i==0)
				{
					QContent[0].setText("  In front of Ticket Collector\n");
				}
			}
			qlist[0].dequeue();
			for(int i=0;i<(int)(n/18);i++)
			{	
				if(!qlist[i+1].isEmpty())
				{
					qlist[i].enqueue(qlist[i+1].dequeue());
				}
			}
			for(int i=0;i<(int)(n/18+1);i++)
			{	
				Node<Integer> temp = qlist[i].front;
				while(temp!=null)
				{	
					QContent[i].append("\n"+"\t"+Integer.toString(temp.data)+"\n");
					temp = temp.next;
				}
			}
			if(qlist[0].isEmpty())
			{
				QContent[0].append("\n  Queue Empty\n  All people processed");
				timer.cancel();
			}
		}
	}
	
}
