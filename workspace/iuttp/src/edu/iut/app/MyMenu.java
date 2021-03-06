package edu.iut.app;

import java.awt.Frame;  
import java.awt.Menu;  
import java.awt.MenuBar;  
import java.awt.MenuItem;  
import java.awt.event.WindowAdapter;  
import java.awt.event.WindowEvent;  

import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.SpinnerListModel;
import javax.swing.SpinnerModel;
import javax.swing.event.ChangeListener;

public class MyMenu {  
	Frame myFrame;  
	MenuBar menubar;  
	Menu file,edit,editSon,about;  
	MenuItem open,save,line,exit,  
	copy,pause,  
	cut,put,  
	author,help;  

	myFrame.setDefaultCloseOperation(3);
	String[] years = {2010;2011;2012;2013;2014;2015;2016;2017;2018;2018;2020};
	SpinnerModel model = new SpinnerListModel(years);
	JSpinner spinner = new JSpinner(model);
	myFrame.getContentPane().add(spinner, BorderLayout.NORTH);
	
	ChangeListener listener = new ChangeListener() {
		
		public void stateChanged(ChangeEvent e) {
			SpinnerModel source = (SpinnerModel)e.getSource();
			System.out.println("The value is: " + source.getValue());
		}
	};
	model.addChangeListener(listener);


	String []array =  {January;February；March;April；May;June;July;August; September;October;November;December};   
	JComboBox box1 = new JComboBox(array);   
	box.1setPreferredSize(new Dimension(160,22));		ActionListener listener1 = new ActionListener(){   
		
		public void actionPerformed(ActionEvent e) {   
			JComboBox com = (JComboBox)e.getSource();   
			String str = (String)com.getSelectedItem();   

		}   
	};   
	box.addActionListener(listener1);

	String [] array2=  {Monday ;Tuesday ;Wednesday;Thursday;Friday;Saturday;Sunday };   
	JComboBox box2 = new JComboBox(array2);   
	box2.setPreferredSize(new Dimension(160,22));		ActionListener listener2 = new ActionListener(){   
		public void actionPerformed(ActionEvent e) {   
			JComboBox com = (JComboBox)e.getSource();   
			String str = (String)com.getSelectedItem();   

		}   
	};   
	box.addActionListener(listener2);  


	public MyMenu()  
	{  
		myFrame=new Frame("Chevi.C Menu(awt)");  
		myFrame.setBounds(400,400,300,300);  


		myFrame.addWindowListener(new WindowAdapter()  
		{  
			public void windowClosing(WindowEvent e)  
			{  
				System.exit(0);  
			}  
		});  


		menubar=new MenuBar();  
		edit=new Menu("Edit");  
		editSon=new Menu("DialogBox");  


		year=new MenuItem("year");  
		month=new MenuItem("month");  
		week=new MenuItem("week");  
		edit.add(year);  
		edit.add(month);  
		edit.add(week);  
		menubar.add(edit);  

		Error=new MenuItem("Error");  
		Warning=new MenuItem("Warning");  
		Info=new MenuItem("Info");  
		editSon.add(Info);
		editSon.add(Error);  
		editSon.add(Warning);  

		//Menu add Menu......!!  
		edit.add(editSon);  
		menubar.add(edit);  

		myFrame.setMenuBar(menubar);  

		myFrame.setVisible(true);  
	}  
	public static void main(String[] args) //~!@  
	{  
		new MyMenu();  
	}  

}  

//Calendar c = Calendar.getInstance();
//c.get(Calendar.YEAR);



