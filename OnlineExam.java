
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

public class OnlineExam extends JFrame implements ActionListener
{
	JLabel label;
	JRadioButton radioButton[] = new JRadioButton[5];
	JButton btnnext;
	ButtonGroup bg;
	int count = 0 ;
	int current = 0;
		
	//Create jframe with radiobutton and jbutton
	public OnlineExam(String str)
	{
		super(str);
		label = new JLabel();
		add(label);
		bg = new ButtonGroup();
		for(int i = 0 ; i < 5 ; i++)
		{
			radioButton[i] = new JRadioButton();
			add(radioButton[i]);
			bg.add(radioButton[i]);
		}
		btnnext = new JButton("Next");
		btnnext.addActionListener(this);
		add(btnnext);
		label.setBounds(30, 40, 450, 20);
		radioButton[0].setBounds(50, 80, 100, 20);
		radioButton[1].setBounds(50, 110, 100, 20);
		radioButton[2].setBounds(50, 140, 100, 20);
		radioButton[3].setBounds(50, 170, 100, 20);	
		btnnext.setBounds(100, 240, 100, 30);
		set();

		//To close all the frames
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//cardlayout
		setLayout(null);
		setLocation(250, 100);
		//this is used for the visibility of JFrame
		setVisible(true);
		setSize(600, 350);	
	}

	//handle all the action based events
	public void actionPerformed(ActionEvent e)
	{	
		if(e.getSource() == btnnext)
		{
			if(check())	
				count = count + 1;
			current++;
			set();
			if(current == 9)
				btnnext.setText("Result");
			
		}
		if(e.getActionCommand().equals("Result"))
		{
			btnnext.setEnabled(false);
			if(check())
				count = count + 1;
			current++;
			JOptionPane.showMessageDialog(this,"correct answers = "+ count);
		}
	}

	//Set questions with options
	void set()
	{
		radioButton[4].setSelected(true);
		if(current == 0)
		{
			label.setText("Que1 : When did India win their first WorldCup ?");
			radioButton[0].setText("2003");
			radioButton[1].setText("1983");
			radioButton[2].setText("2007");
			radioButton[3].setText("2011");			
		}
		if(current == 1)
		{
			label.setText("Que2 : Who captained India when india won the first WorldCup ?");
			radioButton[0].setText("Kapil Dev");
			radioButton[1].setText("Sunil Gavaskar");
			radioButton[2].setText("Sachin Tendulkar");
			radioButton[3].setText("Rahul Dravid");			
		}
		if(current == 2)
		{
			label.setText("Que3 : Who was awarded man of the match when India won second world cup ?");
			radioButton[0].setText("Gautam Gambir");
			radioButton[1].setText("Sachin");
			radioButton[2].setText("Virat");
			radioButton[3].setText("M S Dhoni");			
		}
		if(current == 3)
		{
			label.setText("Que4 : Who was awarded man of the series in 2011 world cup ?");
			radioButton[0].setText("Gambir");
			radioButton[1].setText("Sachin");
			radioButton[2].setText("Yuvraj");
			radioButton[3].setText("Raina");			
		}
		if(current == 4)
		{
			label.setText("Que5 : Against which team did India win the world cup 2011 final ?");
			radioButton[0].setText("Sri lanka");
			radioButton[1].setText("Australia");
			radioButton[2].setText("West Indies");
			radioButton[3].setText("Pakistan");			
		}
		if(current == 5)
		{
			label.setText("Que6 : Against which team did India win the world cup 1983 final ?");
			radioButton[0].setText("West Indies");
			radioButton[1].setText("England");
			radioButton[2].setText("Australia");
			radioButton[3].setText("Sri lanka");			
		}
		if(current == 6)
		{
			label.setText("Que7 : Who has the record of scoring highest runs in Ipl tournament ?");
			radioButton[0].setText("David Warner");
			radioButton[1].setText("Virat Kohli");
			radioButton[2].setText("Suresh Raina");
			radioButton[3].setText("Murali vijay");			
		}
		if(current == 7)
		{
			label.setText("Que8 : Which team won the recent world cup held in 2019 ?");
			radioButton[0].setText("India");
			radioButton[1].setText("Sri lanka");
			radioButton[2].setText("England");
			radioButton[3].setText("Australia");			
		}
		if(current == 8)
		{
			label.setText("Que9 : Who was the highest run getter in 2019 world cup ?");
			radioButton[0].setText("Rohit Sharma");
			radioButton[1].setText("Virat kohli");
			radioButton[2].setText("Ben stokes");
			radioButton[3].setText("Kane Williamson");			
		}
		if(current == 9)
		{
			label.setText("Que10 : How many years was CSK banned in Ipl ?");
			radioButton[0].setText("2 years");
			radioButton[1].setText("1 year");
			radioButton[2].setText("3 years");
			radioButton[3].setText("Not Banned");			
		}
 	}

	//Declare right answers
	boolean check()
	{
		if(current == 0)
			return(radioButton[1].isSelected());
		if(current == 1)
			return(radioButton[0].isSelected());
		if(current == 2)
			return(radioButton[3].isSelected());
		if(current == 3)
			return(radioButton[2].isSelected());
		if(current == 4)
			return(radioButton[0].isSelected());
		if(current == 5)
			return(radioButton[0].isSelected());
		if(current == 6)
			return(radioButton[1].isSelected());
		if(current == 7)
			return(radioButton[2].isSelected());
		if(current == 8)
			return(radioButton[0].isSelected());
		if(current == 9)
			return(radioButton[0].isSelected());
		return false;
	}
	
	
	public static void main(String... args)
	{
		new OnlineExam("MCQ App");
	}
}