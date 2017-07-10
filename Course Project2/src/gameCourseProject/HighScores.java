package gameCourseProject;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.Font;
import java.awt.SystemColor;

public class HighScores extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HighScores frame = new HighScores();
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
	public HighScores() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(1000, 5, 300, 300);
		contentPane = new JPanel();
		contentPane.setForeground(SystemColor.menu);
		contentPane.setBackground(SystemColor.windowBorder);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{10, 210, 0};   //changed leading number to 10 not 210 to get different cell spacing
		gbl_contentPane.rowHeights = new int[]{0, 38, 38, 38, 38, 38, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblNewLabel = new JLabel("High Scores");
		lblNewLabel.setForeground(SystemColor.activeCaption);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 0);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 0;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel label = new JLabel("1");
		label.setForeground(SystemColor.text);
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.anchor = GridBagConstraints.WEST;
		gbc_label.fill = GridBagConstraints.VERTICAL;
		gbc_label.insets = new Insets(0, 0, 5, 5);
		gbc_label.gridx = 0;
		gbc_label.gridy = 1;
		contentPane.add(label, gbc_label);
		
		JLabel lblHighScore = new JLabel("High score 1");
		lblHighScore.setForeground(SystemColor.text);
		GridBagConstraints gbc_lblHighScore = new GridBagConstraints();
		gbc_lblHighScore.insets = new Insets(0, 0, 5, 0);
		gbc_lblHighScore.gridx = 1;
		gbc_lblHighScore.gridy = 1;
		contentPane.add(lblHighScore, gbc_lblHighScore);
		
		JLabel label_1 = new JLabel("2");
		label_1.setForeground(SystemColor.text);
		GridBagConstraints gbc_label_1 = new GridBagConstraints();
		gbc_label_1.fill = GridBagConstraints.BOTH;
		gbc_label_1.insets = new Insets(0, 0, 5, 5);
		gbc_label_1.gridx = 0;
		gbc_label_1.gridy = 2;
		contentPane.add(label_1, gbc_label_1);
		
		JLabel lblHighScore_1 = new JLabel("High score 2");
		lblHighScore_1.setForeground(SystemColor.text);
		GridBagConstraints gbc_lblHighScore_1 = new GridBagConstraints();
		gbc_lblHighScore_1.fill = GridBagConstraints.VERTICAL;
		gbc_lblHighScore_1.insets = new Insets(0, 0, 5, 0);
		gbc_lblHighScore_1.gridx = 1;
		gbc_lblHighScore_1.gridy = 2;
		contentPane.add(lblHighScore_1, gbc_lblHighScore_1);
		
		JLabel label_2 = new JLabel("3");
		label_2.setForeground(SystemColor.text);
		GridBagConstraints gbc_label_2 = new GridBagConstraints();
		gbc_label_2.fill = GridBagConstraints.BOTH;
		gbc_label_2.insets = new Insets(0, 0, 5, 5);
		gbc_label_2.gridx = 0;
		gbc_label_2.gridy = 3;
		contentPane.add(label_2, gbc_label_2);
		
		JLabel lblHighScore_2 = new JLabel("High score 3");
		lblHighScore_2.setForeground(SystemColor.text);
		GridBagConstraints gbc_lblHighScore_2 = new GridBagConstraints();
		gbc_lblHighScore_2.fill = GridBagConstraints.VERTICAL;
		gbc_lblHighScore_2.insets = new Insets(0, 0, 5, 0);
		gbc_lblHighScore_2.gridx = 1;
		gbc_lblHighScore_2.gridy = 3;
		contentPane.add(lblHighScore_2, gbc_lblHighScore_2);
		
		JLabel label_3 = new JLabel("4");
		label_3.setForeground(SystemColor.text);
		GridBagConstraints gbc_label_3 = new GridBagConstraints();
		gbc_label_3.fill = GridBagConstraints.BOTH;
		gbc_label_3.insets = new Insets(0, 0, 5, 5);
		gbc_label_3.gridx = 0;
		gbc_label_3.gridy = 4;
		contentPane.add(label_3, gbc_label_3);
		
		JLabel lblHighScore_3 = new JLabel("High score 4");
		lblHighScore_3.setForeground(SystemColor.text);
		GridBagConstraints gbc_lblHighScore_3 = new GridBagConstraints();
		gbc_lblHighScore_3.fill = GridBagConstraints.VERTICAL;
		gbc_lblHighScore_3.insets = new Insets(0, 0, 5, 0);
		gbc_lblHighScore_3.gridx = 1;
		gbc_lblHighScore_3.gridy = 4;
		contentPane.add(lblHighScore_3, gbc_lblHighScore_3);
		
		JLabel label_4 = new JLabel("5");
		label_4.setForeground(SystemColor.text);
		GridBagConstraints gbc_label_4 = new GridBagConstraints();
		gbc_label_4.fill = GridBagConstraints.BOTH;
		gbc_label_4.insets = new Insets(0, 0, 0, 5);
		gbc_label_4.gridx = 0;
		gbc_label_4.gridy = 5;
		contentPane.add(label_4, gbc_label_4);
		
		JLabel lblHighScore_4 = new JLabel("High Score 5");
		lblHighScore_4.setForeground(SystemColor.text);
		GridBagConstraints gbc_lblHighScore_4 = new GridBagConstraints();
		gbc_lblHighScore_4.fill = GridBagConstraints.VERTICAL;
		gbc_lblHighScore_4.gridx = 1;
		gbc_lblHighScore_4.gridy = 5;
		contentPane.add(lblHighScore_4, gbc_lblHighScore_4);
	}

}
