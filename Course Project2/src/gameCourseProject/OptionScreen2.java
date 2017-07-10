package gameCourseProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JRadioButton;
import java.awt.Color;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class OptionScreen2 extends JFrame {

	private JPanel contentPane;
	//private ButtonGroup res = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OptionScreen2 frame = new OptionScreen2();
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
	public OptionScreen2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 350, 450);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.window);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel label = new JLabel("");
		
		
		JCheckBox chckbxMute = chkbxMute();
		
		JLabel lblOptions = lblOptions();
		
		JLabel lblVolume = lblVolume();
		
		JLabel lblResolutionSize = new JLabel("Resolution / Size");
		lblResolutionSize.setFont(new Font("Tahoma", Font.PLAIN, 20));
		
		JRadioButton rdbtnLow_Small = new JRadioButton("Low / Small");
		
		JRadioButton rdbtnMedium = new JRadioButton("Medium");
		
		JRadioButton High_Large = new JRadioButton("High / Large");
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(109)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnMedium)
								.addComponent(rdbtnLow_Small)
								.addComponent(High_Large)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(103)
							.addComponent(lblVolume, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(chckbxMute, GroupLayout.PREFERRED_SIZE, 262, GroupLayout.PREFERRED_SIZE)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(lblResolutionSize, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblOptions, GroupLayout.PREFERRED_SIZE, 273, GroupLayout.PREFERRED_SIZE)))))
					.addContainerGap(41, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblOptions)
					.addGap(70)
					.addComponent(lblVolume)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(label)
						.addComponent(chckbxMute))
					.addGap(18)
					.addComponent(lblResolutionSize)
					.addGap(30)
					.addComponent(rdbtnLow_Small)
					.addGap(18)
					.addComponent(rdbtnMedium)
					.addGap(18)
					.addComponent(High_Large)
					.addContainerGap(42, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

	private JLabel lblVolume() {                       //text label for single selection box -mute
		JLabel lblVolume = new JLabel("Volume");
		lblVolume.setBackground(new Color(255, 228, 181));
		lblVolume.setFont(new Font("Tahoma", Font.PLAIN, 20));
		return lblVolume;
	}

	private JLabel lblOptions() {                        //text label for resolution options -three radio(group)
		JLabel lblOptions = new JLabel("Options");
		lblOptions.setForeground(new Color(105, 105, 105));
		lblOptions.setHorizontalAlignment(SwingConstants.CENTER);
		lblOptions.setFont(new Font("Tahoma", Font.BOLD, 30));
		return lblOptions;
	}

	private JCheckBox chkbxMute() {                        //method for mute checkbox elec
		JCheckBox chckbxMute = new JCheckBox("Mute");
		chckbxMute.addChangeListener(new ChangeListener() {  //
			public void stateChanged(ChangeEvent arg0) {
				
				
			}
		});
		chckbxMute.setFont(new Font("Tahoma", Font.PLAIN, 15));
		chckbxMute.setVerticalAlignment(SwingConstants.TOP);
		chckbxMute.setHorizontalAlignment(SwingConstants.CENTER);
		return chckbxMute;
	}
}
