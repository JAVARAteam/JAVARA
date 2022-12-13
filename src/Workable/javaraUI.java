package Workable;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Component;
import javax.swing.JTextPane;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.DropMode;
import javax.swing.JSplitPane;
import javax.swing.JLabel;
import java.awt.ComponentOrientation;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Insets;

import javax.swing.ImageIcon;

import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.SpringLayout;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class javaraUI extends JFrame {

	private JPanel mainPanel;
	private JTextPane institutionText1 = new JTextPane();
	private JTextPane institutionText2 = new JTextPane();
	private JTextPane institutionText3 = new JTextPane();
	private JTextPane institutionText4 = new JTextPane();
	private JTextPane companyText1 = new JTextPane();
	private JTextPane companyText2 = new JTextPane();
	private JTextPane companyText3 = new JTextPane();
	private JTextPane companyText4 = new JTextPane();
	private JTextPane nameText1 = new JTextPane();
	private JTextPane nameText2 = new JTextPane();
	private JTextPane nameText3 = new JTextPane();
	private JTextPane nameText4 = new JTextPane();
	private JTextPane dutyText1 = new JTextPane();
	private JTextPane dutyText2 = new JTextPane();
	private JTextPane dutyText3 = new JTextPane();
	private JTextPane dutyText4 = new JTextPane();
	
	ed_info ed = new ed_info();
	ArrayList<ed_idinfo> edList = ed.selectOne();
	em_info em = new em_info();
	ArrayList<employmentInfo> emList = em.selectByOne(" '%%청주%%'");
	
	int ed_dataNum = edList.size();
	int em_dataNum = emList.size();
	
	int ed_pageNum = (ed_dataNum / 4) + 1;
	int em_pageNum = (em_dataNum / 4) + 1;
	
	int ed_pageIdx = 0;
	int ed_listIdx = ed_pageIdx * 4;
	
	int em_pageIdx = 0;
	int em_listIdx = em_pageIdx * 4;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					javaraUI frame = new javaraUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void alignCenter(JTextPane pane) {
	    StyledDocument doc = pane.getStyledDocument();
	    SimpleAttributeSet center = new SimpleAttributeSet();
	    StyleConstants.setAlignment(center, StyleConstants.ALIGN_CENTER);
	    StyleConstants.setSpaceAbove(center, 10);
	    doc.setParagraphAttributes(0, doc.getLength(), center, false);
	}

	public javaraUI() { 
		settingEd(ed_listIdx);
		settingEm(em_listIdx);
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 900);
		mainPanel = new JPanel();
		mainPanel.setForeground(Color.BLACK);
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(mainPanel);
		mainPanel.setLayout(null);
		
		
		JPanel contentPanel = new JPanel();
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new LineBorder(new Color(255, 165, 0)));
		contentPanel.setBounds(0, 160, 560, 710);
		mainPanel.add(contentPanel);
		contentPanel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 355, 560, 10);
		contentPanel.add(separator);
		
		JLabel trainingLabel = new JLabel("Edu/Training");
		trainingLabel.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		trainingLabel.setBounds(10, 10, 534, 40);
		contentPanel.add(trainingLabel);
		
		JLabel mapLabel = new JLabel("By Region");
		mapLabel.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		mapLabel.setBounds(10, 365, 544, 40);
		contentPanel.add(mapLabel);
		
		
		institutionText1.setFocusable(false);
		institutionText1.setEditable(false);
		institutionText1.setFont(new Font("NanumSquare", Font.PLAIN, 13));
		alignCenter(institutionText1);
		institutionText1.setBorder(new LineBorder(new Color(0, 0, 0)));
		institutionText1.setBounds(120, 62, 130, 40);
		contentPanel.add(institutionText1);
		
		nameText1.setFocusable(false);
		nameText1.setEditable(false);
		nameText1.setFont(new Font("NanumSquare", Font.PLAIN, 17));
		alignCenter(nameText1);
		nameText1.setBorder(new LineBorder(new Color(0, 0, 0)));
		nameText1.setBounds(120, 100, 130, 90);
		contentPanel.add(nameText1);
		
		institutionText2.setFocusable(false);
		institutionText2.setEditable(false);
		institutionText2.setFont(new Font("NanumSquare", Font.PLAIN, 13));
		alignCenter(institutionText2);
		institutionText2.setBorder(new LineBorder(new Color(0, 0, 0)));
		institutionText2.setBounds(280, 62, 130, 40);
		contentPanel.add(institutionText2);
		
		nameText2.setFocusable(false);
		nameText2.setEditable(false);
		nameText2.setFont(new Font("NanumSquare", Font.PLAIN, 17));
		alignCenter(nameText2);
		nameText2.setBorder(new LineBorder(new Color(0, 0, 0)));
		nameText2.setBounds(280, 100, 130, 90);
		contentPanel.add(nameText2);
		
		institutionText3.setFocusable(false);
		institutionText3.setEditable(false);
		institutionText3.setFont(new Font("NanumSquare", Font.PLAIN, 13));
		alignCenter(institutionText3);
		institutionText3.setBorder(new LineBorder(new Color(0, 0, 0)));
		institutionText3.setBounds(120, 204, 130, 40);
		contentPanel.add(institutionText3);
		
		nameText3.setFocusable(false);
		nameText3.setEditable(false);
		nameText3.setFont(new Font("NanumSquare", Font.PLAIN, 17));
		alignCenter(nameText3);
		nameText3.setBorder(new LineBorder(new Color(0, 0, 0)));
		nameText3.setBounds(120, 242, 130, 90);
		contentPanel.add(nameText3);
		
		institutionText4.setFocusable(false);
		institutionText4.setEditable(false);
		institutionText4.setFont(new Font("NanumSquare", Font.PLAIN, 13));
		alignCenter(institutionText4);
		institutionText4.setBorder(new LineBorder(new Color(0, 0, 0)));
		institutionText4.setBounds(280, 204, 130, 40);
		contentPanel.add(institutionText4);
		
		nameText4.setFocusable(false);
		nameText4.setEditable(false);
		nameText4.setFont(new Font("NanumSquare", Font.PLAIN, 17));
		alignCenter(nameText4);
		nameText4.setBorder(new LineBorder(new Color(0, 0, 0)));
		nameText4.setBounds(280, 242, 130, 90);
		contentPanel.add(nameText4);
		
		
		companyText1.setEditable(false);
		companyText1.setFocusable(false);
		companyText1.setFont(new Font("NanumSquare", Font.PLAIN, 13));
		alignCenter(companyText1);
		companyText1.setBorder(new LineBorder(new Color(0, 0, 0)));
		companyText1.setBounds(120, 417, 130, 40);
		contentPanel.add(companyText1);
		
		dutyText1.setEditable(false);
		dutyText1.setFocusable(false);
		dutyText1.setFont(new Font("NanumSquare", Font.PLAIN, 17));
		alignCenter(dutyText1);
		dutyText1.setBorder(new LineBorder(new Color(0, 0, 0)));
		dutyText1.setBounds(120, 456, 130, 90);
		contentPanel.add(dutyText1);
		
		companyText2.setEditable(false);
		companyText2.setFocusable(false);
		companyText2.setFont(new Font("NanumSquare", Font.PLAIN, 13));
		alignCenter(companyText2);
		companyText2.setBorder(new LineBorder(new Color(0, 0, 0)));
		companyText2.setBounds(280, 417, 130, 40);
		contentPanel.add(companyText2);
		
		dutyText2.setEditable(false);
		dutyText2.setFocusable(false);
		dutyText2.setFont(new Font("NanumSquare", Font.PLAIN, 17));
		alignCenter(dutyText2);
		dutyText2.setBorder(new LineBorder(new Color(0, 0, 0)));
		dutyText2.setBounds(280, 456, 130, 90);
		contentPanel.add(dutyText2);
		
		companyText3.setEditable(false);
		companyText3.setFocusable(false);
		companyText3.setFont(new Font("NanumSquare", Font.PLAIN, 13));
		alignCenter(companyText3);
		companyText3.setBorder(new LineBorder(new Color(0, 0, 0)));
		companyText3.setBounds(120, 559, 130, 40);
		contentPanel.add(companyText3);

		dutyText3.setEditable(false);
		dutyText3.setFocusable(false);	
		dutyText3.setFont(new Font("NanumSquare", Font.PLAIN, 17));
		alignCenter(dutyText3);
		dutyText3.setBorder(new LineBorder(new Color(0, 0, 0)));
		dutyText3.setBounds(120, 597, 130, 90);
		contentPanel.add(dutyText3);
		
		companyText4.setEditable(false);
		companyText4.setFocusable(false);
		companyText4.setFont(new Font("NanumSquare", Font.PLAIN, 13));
		alignCenter(companyText4);
		companyText4.setBorder(new LineBorder(new Color(0, 0, 0)));
		companyText4.setBounds(280, 559, 130, 40);
		contentPanel.add(companyText4);
		

		dutyText4.setEditable(false);
		dutyText4.setFocusable(false);
		dutyText4.setFont(new Font("NanumSquare", Font.PLAIN, 17));
		alignCenter(dutyText4);
		dutyText4.setBorder(new LineBorder(new Color(0, 0, 0)));
		dutyText4.setBounds(280, 599, 130, 90);
		contentPanel.add(dutyText4);
		
		
		JLabel cityLabel = new JLabel("Cheongju");
		cityLabel.setDisplayedMnemonic(KeyEvent.VK_ENTER);
		cityLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		cityLabel.setFont(new Font("NanumSquare", Font.PLAIN, 20));
		cityLabel.setBounds(371, 355, 163, 46);
		contentPanel.add(cityLabel);
		
		ImageIcon icon7 = new ImageIcon("C:\\Users\\SAMSUNG\\eclipse-workspace\\Workable\\src\\image\\prevBtn.png");
		Image previm3 = icon7.getImage();
		Image previm4 = previm3.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		ImageIcon icon8 = new ImageIcon(previm4);
		JButton edPrevBtn = new JButton(icon8);
		edPrevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ed_pageIdx = Math.floorMod((ed_pageIdx - 1), ed_pageNum);
				ed_listIdx = ed_pageIdx * 4;
				settingEd(ed_listIdx);
			}
		});
		edPrevBtn.setForeground(Color.ORANGE);
		edPrevBtn.setBorder(null);
		edPrevBtn.setBackground(Color.WHITE);
		edPrevBtn.setBounds(47, 175, 50, 50);
		contentPanel.add(edPrevBtn);
		
		ImageIcon icon5 = new ImageIcon("C:\\Users\\SAMSUNG\\eclipse-workspace\\Workable\\src\\image\\nextBtn.png");
		Image nextim3 = icon5.getImage();
		Image nextim4 = nextim3.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		ImageIcon icon6 = new ImageIcon(nextim4);
		JButton edNextBtn = new JButton(icon6);
		edNextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ed_pageIdx = Math.floorMod((ed_pageIdx + 1), ed_pageNum);
				ed_listIdx = ed_pageIdx * 4;
				settingEd(ed_listIdx);
			}
		});
		edNextBtn.setForeground(new Color(255, 200, 0));
		edNextBtn.setBorder(null);
		edNextBtn.setBackground(Color.WHITE);
		edNextBtn.setBounds(433, 175, 50, 50);
		contentPanel.add(edNextBtn);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\SAMSUNG\\eclipse-workspace\\Workable\\src\\image\\prevBtn.png");
		Image previm = icon.getImage();
		Image previm2 = previm.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		ImageIcon icon2 = new ImageIcon(previm2);
		JButton emPrevBtn = new JButton(icon2);
		emPrevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {		
				em_pageIdx = Math.floorMod((em_pageIdx - 1), em_pageNum);
				em_listIdx = em_pageIdx * 4;
				settingEm(em_listIdx);
			}
		});
		emPrevBtn.setForeground(Color.ORANGE);
		emPrevBtn.setBorder(null);
		emPrevBtn.setBackground(Color.WHITE);
		emPrevBtn.setBounds(47, 530, 50, 50);
		contentPanel.add(emPrevBtn);
		
		
		ImageIcon icon3 = new ImageIcon("C:\\Users\\SAMSUNG\\eclipse-workspace\\Workable\\src\\image\\nextBtn.png");
		Image nextim = icon3.getImage();
		Image nextim2 = nextim.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		ImageIcon icon4 = new ImageIcon(nextim2);
		JButton emNextBtn = new JButton(icon4);
		emNextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				em_pageIdx = Math.floorMod((em_pageIdx + 1), em_pageNum);
				em_listIdx = em_pageIdx * 4;
				settingEm(em_listIdx);
			}
		});
		emNextBtn.setForeground(Color.ORANGE);
		emNextBtn.setBorder(null);
		emNextBtn.setBackground(Color.WHITE);
		emNextBtn.setBounds(433, 530, 50, 50);
		contentPanel.add(emNextBtn);
		
		JPanel topPanel = new JPanel();
		topPanel.setBorder(new LineBorder(new Color(255, 165, 0)));
		topPanel.setName("Workable");
		topPanel.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		topPanel.setToolTipText("Workable");
		topPanel.setBackground(new Color(255, 165, 0));
		topPanel.setBounds(0, 0, 560, 80);
		mainPanel.add(topPanel);
		topPanel.setLayout(null);
		
		ImageIcon icon9 = new ImageIcon("C:\\Users\\SAMSUNG\\eclipse-workspace\\Workable\\src\\image\\logo.png");
		Image logoImg = icon9.getImage();
		logoImg = logoImg.getScaledInstance(200, 100, Image.SCALE_DEFAULT);
		ImageIcon logoIcon = new ImageIcon(logoImg);
		JLabel topLabel = new JLabel(logoIcon);
		topLabel.setBounds(0, -5, 560, 80);
		topPanel.add(topLabel);
		topLabel.setBackground(new Color(255, 165, 0));
		topLabel.setBounds(0, -5, 544, 80);
		topLabel.setAlignmentX(0.5f);
		topLabel.setHorizontalAlignment(SwingConstants.CENTER);
		topLabel.setFont(new Font("NanumSquare", Font.PLAIN, 40));
		
		JPanel subPanel = new JPanel();
		subPanel.setBounds(0, 80, 560, 80);
		mainPanel.add(subPanel);
		subPanel.setBackground(Color.WHITE);
		subPanel.setBorder(new LineBorder(new Color(255, 165, 0)));
		subPanel.setLayout(null);
		
		JButton regionBtn = new JButton("Region");
		regionBtn.setFocusable(false);
		regionBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				regionUI region = new regionUI();
				region.setVisible(true);
				setVisible(false);
			}
		});
		regionBtn.setBorder(null);
		regionBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		regionBtn.setBackground(Color.WHITE);
		regionBtn.setBounds(55, 6, 120, 68);
		subPanel.add(regionBtn);
		
		JButton mapBtn = new JButton("Map");
		mapBtn.setFocusable(false);
		mapBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		mapBtn.setBorder(null);
		mapBtn.setBackground(Color.WHITE);
		mapBtn.setBounds(235, 6, 70, 68);
		subPanel.add(mapBtn);
		mapBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				mapSearchUI mapSearch = new mapSearchUI();
				mapSearch.setVisible(true);
				setVisible(false);
			}
		});
		
		JButton trainingBtn = new JButton("Training");
		trainingBtn.setFocusable(false);
		trainingBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				trainingUI training = new trainingUI();
				training.setVisible(true);
				setVisible(false);
			}
		});
		trainingBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		trainingBtn.setBorder(null);
		trainingBtn.setBackground(Color.WHITE);
		trainingBtn.setBounds(380, 6, 114, 68);
		subPanel.add(trainingBtn);
			
	}
	
	public void settingEd(int listIdx) {
		
		String institutionArr[] = new String[4];
		String nameArr[] = new String[4];
		int idx;
		
		for (idx = 0; idx < 4; idx++) {
			institutionArr[idx] = edList.get(listIdx).getEd_Institution();
			nameArr[idx] = edList.get(listIdx++).getEd_Name();
			if(listIdx >= ed_dataNum ) {
				idx = 4;
			}
		}
		
		institutionText1.setText(institutionArr[0]);
		nameText1.setText(nameArr[0]);
		institutionText2.setText(institutionArr[1]);
		nameText2.setText(nameArr[1]);
		institutionText3.setText(institutionArr[2]);
		nameText3.setText(nameArr[2]);
		institutionText4.setText(institutionArr[3]);
		nameText4.setText(nameArr[3]);	
		
	}
	
	public void settingEm(int listIdx) { 
		
		String companyArr[] = new String[4];
		String dutyArr[] = new String[4];
		int idx;
		
		for (idx = 0; idx < 4; idx++) {
			companyArr[idx] = emList.get(listIdx).getCompanyName();
			dutyArr[idx] = emList.get(listIdx++).getDuty();
			if(listIdx >= em_dataNum ) {
				idx = 4;
			}
		}
		
		companyText1.setText(companyArr[0]);
		dutyText1.setText(dutyArr[0]);
		companyText2.setText(companyArr[1]);
		dutyText2.setText(dutyArr[1]);
		companyText3.setText(companyArr[2]);
		dutyText3.setText(dutyArr[2]);
		companyText4.setText(companyArr[3]);
		dutyText4.setText(dutyArr[3]);

	}
}
