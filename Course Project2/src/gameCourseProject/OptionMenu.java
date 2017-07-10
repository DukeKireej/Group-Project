package gameCourseProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

public class OptionMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OptionMenu frame = new OptionMenu();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public OptionMenu()  //constructor
	{
		setBackground(new Color(255, 248, 220));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 500, 250, 175);
		contentPane = new JPanel();              //container for components 
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 1, 5, 5));
		
		JButton btnPlay = btnPlay();    		 // play btn creation assigned to btnPlay method
		contentPane.add(btnPlay);       		 //add btn to container (register)  /everything else in method
		
		JButton btnOptions = btnOptions();  	 //options btn creation   
		contentPane.add(btnOptions);             //register btnOptions
		
		JButton btnExit = btnExit();
		contentPane.add(btnExit);
	}  //end  OptionMenu constructor

	private JButton btnExit() {							//method with Exit button details
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {       //anonymous class for action listener// event handler
				//add command to pull up another screen for Exit game
			}
		});
		btnExit.setForeground(SystemColor.text);
		btnExit.setBackground(new Color(95, 158, 160));
		btnExit.setFont(new Font("Tahoma", Font.PLAIN, 22));
		return btnExit;
		
	}

	private JButton btnOptions() {                             
		JButton btnOptions = new JButton("Options");          //button creation/ make into method to keep constructor clean
		btnOptions.addActionListener(new ActionListener() {	
			public void actionPerformed(ActionEvent arg0) {         //event handler / anonymous class	
				//add command to pull up another screen for options
			}
		});
		
		btnOptions.setForeground(SystemColor.text);
		btnOptions.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnOptions.setBackground(new Color(95, 158, 160));
		return btnOptions;
	}

	private JButton btnPlay()               //method for play button features and event handler
	{
		JButton btnPlay = new JButton("Play");
		btnPlay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//add command to pull up another screen for game play
			}
		});
		btnPlay.setForeground(SystemColor.text);
		btnPlay.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnPlay.setBackground(new Color(95, 158, 160));
		return btnPlay;
	}

}
