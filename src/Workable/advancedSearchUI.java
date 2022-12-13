package Workable;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import java.awt.Container;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JCheckBox;
import java.awt.SystemColor;

public class advancedSearchUI extends JFrame {

	private JPanel advanSearch;
	private JTextField question;
	private JTextField question1;
	private JTextField question2;
	private JTextField question3;
	private JTextField question4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					advancedSearchUI frame = new advancedSearchUI();
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
	public advancedSearchUI() {
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 900);
		advanSearch = new JPanel();
		advanSearch.setForeground(Color.BLACK);
		advanSearch.setBackground(Color.WHITE);
		advanSearch.setBorder(new LineBorder(new Color(0, 0, 0)));
		
		setContentPane(advanSearch);
		advanSearch.setLayout(null);
		
		JPanel subPanel = new JPanel();
		subPanel.setBounds(0, 79, 544, 781);
		subPanel.setBackground(Color.WHITE);
		subPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		subPanel.setBorder(new LineBorder(new Color(255, 165, 0)));
		advanSearch.add(subPanel);
		subPanel.setLayout(null);
		
		question = new JTextField();
		question.setBackground(new Color(255, 255, 255));
		question.setSelectedTextColor(Color.black);
		question.setText("< Parallel Recruitment >");
		question.setColumns(10);
		question.setBorder(null);
		question.setBounds(3, 4, 397, 35);
		question.setFont(new Font("나눔스퀘어", Font.BOLD, 25));
		subPanel.add(question);
		
		JCheckBox checkBox = new JCheckBox("Yes");
		checkBox.setBackground(new Color(255, 255, 255));
		checkBox.setBounds(3, 46, 58, 20);
		checkBox.setFont(new Font("나눔스퀘어", Font.PLAIN, 16));
		subPanel.add(checkBox);
		
		JCheckBox checkBox1 = new JCheckBox("No");
		checkBox1.setBackground(new Color(255, 255, 255));
		checkBox1.setBounds(121, 46, 93, 20);
		checkBox1.setFont(new Font("나눔스퀘어", Font.PLAIN, 16));
		subPanel.add(checkBox1);
		
		question1 = new JTextField();
		question1.setBackground(new Color(255, 255, 255));
		question1.setSelectedTextColor(Color.black);
		question1.setText("< Type Of Work >");
		question1.setColumns(10);
		question1.setBorder(null);
		question1.setBounds(3, 116, 359, 35);
		question1.setFont(new Font("나눔스퀘어", Font.BOLD, 25));
		subPanel.add(question1);
		
		JCheckBox checkBox2 = new JCheckBox("Permanent");
		checkBox2.setBackground(new Color(255, 255, 255));
		checkBox2.setBounds(3, 154, 114, 20);
		checkBox2.setFont(new Font("나눔스퀘어", Font.PLAIN, 16));
		subPanel.add(checkBox2);
		
		JCheckBox checkBox3 = new JCheckBox("Contract ");
		checkBox3.setBackground(new Color(255, 255, 255));
		checkBox3.setBounds(121, 154, 93, 20);
		checkBox3.setFont(new Font("나눔스퀘어", Font.PLAIN, 16));
		subPanel.add(checkBox3);
		
		JCheckBox checkBox4 = new JCheckBox("Part Time");
		checkBox4.setBackground(new Color(255, 255, 255));
		checkBox4.setBounds(218, 154, 105, 20);
		checkBox4.setFont(new Font("나눔스퀘어", Font.PLAIN, 16));
		subPanel.add(checkBox4);
		
		JCheckBox checkBox5 = new JCheckBox("Day Job");
		checkBox5.setBackground(new Color(255, 255, 255));
		checkBox5.setBounds(325, 154, 114, 20);
		checkBox5.setFont(new Font("나눔스퀘어", Font.PLAIN, 16));
		subPanel.add(checkBox5);
		
		question2 = new JTextField();
		question2.setBackground(new Color(255, 255, 255));
		question2.setSelectedTextColor(Color.black);
		question2.setText("< Career >");
		question2.setColumns(10);
		question2.setBorder(null);
		question2.setBounds(3, 230, 200, 35);
		question2.setFont(new Font("나눔스퀘어", Font.BOLD, 25));
		subPanel.add(question2);
		
		JCheckBox checkBox6 = new JCheckBox("Regardless");
		checkBox6.setBackground(new Color(255, 255, 255));
		checkBox6.setBounds(3, 280, 114, 20);
		checkBox6.setFont(new Font("나눔스퀘어", Font.PLAIN, 16));
		subPanel.add(checkBox6);
		
		JCheckBox checkBox7 = new JCheckBox("1~2 Years");
		checkBox7.setBackground(new Color(255, 255, 255));
		checkBox7.setBounds(121, 280, 117, 20);
		checkBox7.setFont(new Font("나눔스퀘어", Font.PLAIN, 16));
		subPanel.add(checkBox7);
		
		JCheckBox checkBox8 = new JCheckBox("2~3 Years");
		checkBox8.setBackground(new Color(255, 255, 255));
		checkBox8.setBounds(242, 280, 105, 20);
		checkBox8.setFont(new Font("나눔스퀘어", Font.PLAIN, 16));
		subPanel.add(checkBox8);
		
		JCheckBox checkBox9 = new JCheckBox("More 3 Years");
		checkBox9.setBackground(new Color(255, 255, 255));
		checkBox9.setBounds(351, 280, 132, 20);
		checkBox9.setFont(new Font("나눔스퀘어", Font.PLAIN, 16));
		subPanel.add(checkBox9);
		
		question3 = new JTextField();
		question3.setBackground(new Color(255, 255, 255));
		question3.setSelectedTextColor(Color.black);
		question3.setText("< Gender >");
		question3.setColumns(10);
		question3.setBorder(null);
		question3.setBounds(3, 349, 200, 35);
		question3.setFont(new Font("나눔스퀘어", Font.BOLD, 25));
		subPanel.add(question3);
		
		JCheckBox checkBox10 = new JCheckBox("Regardless");
		checkBox10.setBackground(new Color(255, 255, 255));
		checkBox10.setBounds(3, 390, 114, 20);
		checkBox10.setFont(new Font("나눔스퀘어", Font.PLAIN, 16));
		subPanel.add(checkBox10);
		
		JCheckBox checkBox11 = new JCheckBox("Male");
		checkBox11.setBackground(new Color(255, 255, 255));
		checkBox11.setBounds(121, 390, 80, 20);
		checkBox11.setFont(new Font("나눔스퀘어", Font.PLAIN, 16));
		subPanel.add(checkBox11);
		
		JCheckBox checkBox12 = new JCheckBox("Female");
		checkBox12.setBackground(new Color(255, 255, 255));
		checkBox12.setBounds(242, 390, 80, 20);
		checkBox12.setFont(new Font("나눔스퀘어", Font.PLAIN, 16));
		subPanel.add(checkBox12);
		
		question4 = new JTextField();
		question4.setBackground(new Color(255, 255, 255));
		question4.setSelectedTextColor(Color.black);
		question4.setText("< Work Time >");
		question4.setColumns(10);
		question4.setBorder(null);
		question4.setBounds(9, 451, 200, 35);
		question4.setFont(new Font("나눔스퀘어", Font.BOLD, 25));
		subPanel.add(question4);
		
		JCheckBox checkBox13 = new JCheckBox("DayTime");
		checkBox13.setBackground(new Color(255, 255, 255));
		checkBox13.setBounds(3, 492, 114, 20);
		checkBox13.setFont(new Font("나눔스퀘어", Font.PLAIN, 16));
		subPanel.add(checkBox13);
		
		JCheckBox checkBox14 = new JCheckBox("NightTime");
		checkBox14.setBackground(new Color(255, 255, 255));
		checkBox14.setBounds(121, 492, 105, 20);
		checkBox14.setFont(new Font("나눔스퀘어", Font.PLAIN, 16));
		subPanel.add(checkBox14);
		
		JButton reButton = new JButton("↪ Reset");
		reButton.setBackground(new Color(255, 255, 255));
		reButton.setBounds(118, 660, 115, 35);
		subPanel.add(reButton);
		reButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				advancedSearchUI advancedSearchui = new advancedSearchUI();
				setVisible(false);
			}
		});
	
		
		JButton okButton = new JButton("✓ OK");
		okButton.setBackground(new Color(255, 255, 255));
		okButton.setBounds(285, 660, 115, 35);
		subPanel.add(okButton);
		
		JPanel topPanel = new JPanel();
		topPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		topPanel.setName("Workable");
		topPanel.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		topPanel.setToolTipText("Workable");
		topPanel.setBackground(new Color(255, 165, 0));
		topPanel.setBorder(new LineBorder(new Color(255, 165, 0)));
		topPanel.setBounds(0, 0, 544, 80);
		advanSearch.add(topPanel);
		topPanel.setLayout(null);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\SAMSUNG\\eclipse-workspace\\Workable\\src\\image\\backBtn.png");
		Image backim = icon.getImage();
		Image backim2 = backim.getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		ImageIcon icon2 = new ImageIcon(backim2);
		JButton backBtn = new JButton(icon2);
		backBtn.setFocusable(false);
		backBtn.setBorder(null);
		backBtn.setBackground(new Color(255, 165, 0));
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regionUI region = new regionUI();
				region.setVisible(true);
				setVisible(false);
			}
		});
		backBtn.setBounds(12, 16, 48, 48);
		topPanel.add(backBtn);
		
		JLabel topLabel = new JLabel("AdvancedSearch");
		topLabel.setHorizontalAlignment(SwingConstants.CENTER);
		topLabel.setFont(new Font("나눔스퀘어", Font.PLAIN, 40));
		topLabel.setBackground(SystemColor.menu);
		topLabel.setAlignmentX(0.5f);
		topLabel.setBounds(0, 24, 544, 40);
		topPanel.add(topLabel);
		
		
	}
}
