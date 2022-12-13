package Workable;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.Component;
import javax.swing.JTextField;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;

public class recruitmentInformationUI extends JFrame {

	private JPanel recruitShow;
	private JTextField briefInfo;
	private JTextField briefInfo1;
	private JTextField periodText;
	private JTextField dutyText;
	private JTextField typeOfEmploymentText;
	private JTextField typeOfPayText;
	private JTextField payText;
	private JTextField reqCarrerText;
	private JTextField reqEduText;
	private JTextField majorText;
	private JTextField reqLicenseText;
	private JTextField addressText;
	private JTextField typeOfCompanyText;
	private JTextField institutionText;
	private JTextField contactText;
	private regionUI region;
	int num;
	
	ArrayList<String> recruit = new ArrayList<>();  
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					recruitmentInformationUI frame = new recruitmentInformationUI();
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
	public recruitmentInformationUI() {
		region = new regionUI();
		setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 900);
		recruitShow = new JPanel();
		recruitShow.setForeground(Color.BLACK);
		recruitShow.setBackground(Color.WHITE);
		recruitShow.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(recruitShow);
		recruitShow.setLayout(null);
		JPanel subPanel = new JPanel();
		subPanel.setForeground(new Color(0, 0, 0));
		subPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		subPanel.setBackground(Color.white);
		subPanel.setBounds(12, 111, 205, 177);
		recruitShow.add(subPanel);
		
		JPanel subPanel1 = new JPanel();
		subPanel1.setBackground(new Color(255, 255, 255));
		subPanel1.setForeground(new Color(0, 0, 0));
		subPanel1.setBorder(new LineBorder(Color.BLACK));
		subPanel1.setBackground(Color.white);
		subPanel1.setFont(new Font("나눔스퀘어", Font.PLAIN, 16));
		subPanel1.setBounds(12, 311, 520, 509);
		recruitShow.add(subPanel1);
		
		JLabel subLabel1 = new JLabel();
		subPanel1.add(subLabel1);
		subLabel1.setAlignmentX(0.5f);
		subLabel1.setBackground(Color.WHITE);
		subLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		subLabel1.setFont(new Font("나눔스퀘어", Font.PLAIN, 16));
				
		periodText = new JTextField();
		periodText.setFont(new Font("나눔스퀘어", Font.PLAIN, 14));
		periodText.setHorizontalAlignment(SwingConstants.LEFT);
		periodText.setBorder(null);
		periodText.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		subPanel1.add(periodText);
		periodText.setColumns(40);
		
		dutyText = new JTextField();
		dutyText.setFont(new Font("나눔스퀘어", Font.PLAIN, 14));
		dutyText.setHorizontalAlignment(SwingConstants.LEFT);
		dutyText.setColumns(40);
		dutyText.setBorder(null);
		dutyText.setAlignmentY(1.0f);
		subPanel1.add(dutyText);
		
		typeOfEmploymentText = new JTextField();
		typeOfEmploymentText.setFont(new Font("나눔스퀘어", Font.PLAIN, 14));
		typeOfEmploymentText.setHorizontalAlignment(SwingConstants.LEFT);
		typeOfEmploymentText.setColumns(40);
		typeOfEmploymentText.setBorder(null);
		typeOfEmploymentText.setAlignmentY(1.0f);
		subPanel1.add(typeOfEmploymentText);
		
		typeOfPayText = new JTextField();
		typeOfPayText.setFont(new Font("나눔스퀘어", Font.PLAIN, 14));
		typeOfPayText.setHorizontalAlignment(SwingConstants.LEFT);
		typeOfPayText.setColumns(40);
		typeOfPayText.setBorder(null);
		typeOfPayText.setAlignmentY(1.0f);
		subPanel1.add(typeOfPayText);
		
		payText = new JTextField();
		payText.setFont(new Font("나눔스퀘어", Font.PLAIN, 14));
		payText.setHorizontalAlignment(SwingConstants.LEFT);
		payText.setColumns(40);
		payText.setBorder(null);
		payText.setAlignmentY(1.0f);
		subPanel1.add(payText);
		
		reqCarrerText = new JTextField();
		reqCarrerText.setFont(new Font("나눔스퀘어", Font.PLAIN, 14));
		reqCarrerText.setHorizontalAlignment(SwingConstants.LEFT);
		reqCarrerText.setColumns(40);
		reqCarrerText.setBorder(null);
		reqCarrerText.setAlignmentY(1.0f);
		subPanel1.add(reqCarrerText);
		
		reqEduText = new JTextField();
		reqEduText.setFont(new Font("나눔스퀘어", Font.PLAIN, 14));
		reqEduText.setHorizontalAlignment(SwingConstants.LEFT);
		reqEduText.setColumns(40);
		reqEduText.setBorder(null);
		reqEduText.setAlignmentY(1.0f);
		subPanel1.add(reqEduText);
		
		majorText = new JTextField();
		majorText.setFont(new Font("나눔스퀘어", Font.PLAIN, 14));
		majorText.setHorizontalAlignment(SwingConstants.LEFT);
		majorText.setColumns(40);
		majorText.setBorder(null);
		majorText.setAlignmentY(1.0f);
		subPanel1.add(majorText);
		
		reqLicenseText = new JTextField();
		reqLicenseText.setFont(new Font("나눔스퀘어", Font.PLAIN, 14));
		reqLicenseText.setHorizontalAlignment(SwingConstants.LEFT);
		reqLicenseText.setColumns(40);
		reqLicenseText.setBorder(null);
		reqLicenseText.setAlignmentY(1.0f);
		subPanel1.add(reqLicenseText);
		
		addressText = new JTextField();
		addressText.setFont(new Font("나눔스퀘어", Font.PLAIN, 14));
		addressText.setHorizontalAlignment(SwingConstants.LEFT);
		addressText.setColumns(40);
		addressText.setBorder(null);
		addressText.setAlignmentY(1.0f);
		subPanel1.add(addressText);
		
		typeOfCompanyText = new JTextField();
		typeOfCompanyText.setFont(new Font("나눔스퀘어", Font.PLAIN, 14));
		typeOfCompanyText.setHorizontalAlignment(SwingConstants.LEFT);
		typeOfCompanyText.setColumns(40);
		typeOfCompanyText.setBorder(null);
		typeOfCompanyText.setAlignmentY(1.0f);
		subPanel1.add(typeOfCompanyText);
		
		institutionText = new JTextField();
		institutionText.setFont(new Font("나눔스퀘어", Font.PLAIN, 14));
		institutionText.setHorizontalAlignment(SwingConstants.LEFT);
		institutionText.setColumns(40);
		institutionText.setBorder(null);
		institutionText.setAlignmentY(1.0f);
		subPanel1.add(institutionText);
		
		contactText = new JTextField();
		contactText.setFont(new Font("나눔스퀘어", Font.PLAIN, 14));
		contactText.setHorizontalAlignment(SwingConstants.LEFT);
		contactText.setColumns(40);
		contactText.setBorder(null);
		contactText.setAlignmentY(1.0f);
		subPanel1.add(contactText);
		
		JPanel topPanel = new JPanel();
		topPanel.setBorder(new LineBorder(Color.black));
		topPanel.setName("Workable");
		topPanel.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		topPanel.setToolTipText("Workable");
		topPanel.setBackground(new Color(255, 165, 0));
		topPanel.setBounds(0, 0, 544, 80);
		recruitShow.add(topPanel);
		topPanel.setLayout(null);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\SAMSUNG\\eclipse-workspace\\Workable\\src\\image\\backBtn.png");
		Image backim = icon.getImage();
		Image backim2 = backim.getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		ImageIcon icon2 = new ImageIcon(backim2);
		JButton backBtn = new JButton(icon2);
		backBtn.setBackground(new Color(255, 165, 0));
		backBtn.setBorder(null);
		backBtn.setBounds(12, 16, 48, 48);
		topPanel.add(backBtn);
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				javaraUI javaraUI = new javaraUI();
				javaraUI.setVisible(true);
				setVisible(false);
			}
		});
		
		ImageIcon icon9 = new ImageIcon("C:\\Users\\SAMSUNG\\eclipse-workspace\\Workable\\src\\image\\logo.png");
		Image logoImg = icon9.getImage();
		logoImg = logoImg.getScaledInstance(200, 100, Image.SCALE_DEFAULT);
		ImageIcon logoIcon = new ImageIcon(logoImg);
		JLabel topLabel = new JLabel(logoIcon);
		topLabel.setBounds(239, 32, 57, 15);
		topPanel.add(topLabel);
		topLabel.setBackground(new Color(255, 165, 0));
		topLabel.setBounds(0, -5, 544, 80);
		topLabel.setAlignmentX(0.5f);
		topLabel.setHorizontalAlignment(SwingConstants.CENTER);
		topLabel.setFont(new Font("NanumSquare", Font.PLAIN, 40));
		
		JButton preButton = new JButton("Previous");
		preButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (num > 0) {
					num -= 1;
				}
				else {
					num = 956;
				}
				
				
				recruitText();
				
			}
		});
		preButton.setBounds(156, 828, 97, 23);
		recruitShow.add(preButton);
		
		JButton nextButton = new JButton("Next");
		nextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (num < 956) {
					num += 1;
				}
				else {
					num = 0;
				}
				num += 1;
				recruitText();
			}
		});
		nextButton.setBounds(278, 828, 97, 23);
		recruitShow.add(nextButton);
		
		JPanel subPanel4 = new JPanel();
		subPanel4.setBorder(null);
		subPanel4.setBackground(new Color(255, 255, 255));
		subPanel4.setBounds(229, 111, 303, 177);
		recruitShow.add(subPanel4);
		
		JLabel subLabel = new JLabel();
		subLabel.setBackground(Color.WHITE);
		subLabel.setBounds(0, 37, 264, 34);
		subLabel.setAlignmentX(0.5f);
		subLabel.setHorizontalAlignment(SwingConstants.CENTER);
		subLabel.setFont(new Font("나눔스퀘어", Font.PLAIN, 16));
		subPanel4.add(subLabel);
		
		briefInfo = new JTextField();
		briefInfo.setHorizontalAlignment(SwingConstants.CENTER);
		briefInfo.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 16));
		briefInfo.setBorder(null);
		subLabel.setHorizontalAlignment(SwingConstants.CENTER);
		subPanel4.add(briefInfo);
		briefInfo.setColumns(20);
		
		briefInfo1 = new JTextField();
		briefInfo1.setHorizontalAlignment(SwingConstants.CENTER);
		briefInfo1.setFont(new Font("나눔스퀘어라운드 Bold", Font.PLAIN, 16));
		briefInfo1.setBorder(null);
		subLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		subPanel4.add(briefInfo1);
		briefInfo1.setColumns(20);
		
		num = region.pageIdx;
		System.out.println(num);
		recruitText();
		
	}
	
	public void recruitText() {
		String companyName = new String();
		String period = new String();
		String duty = new String();
		String typeOfEmployment = new String();
		String typeOfPay = new String();
		String pay = new String();
		String reqCarrer = new String();
		String reqEdu = new String();
		String major = new String();
		String reqLicense = new String();
		String address = new String();
		String typeOfCompany = new String();
		String institution = new String();
		String contact = new String();
		
		companyName = region.emList.get(num).getCompanyName();
		period = "모집 기간 :" + region.emList.get(num).getPeriod();
		duty = "모집 직종 :" + region.emList.get(num).getDuty();
		typeOfEmployment = "고용 형태 :" + region.emList.get(num).getTypeOfEmployment();
		typeOfPay = "임금 형태 :" + region.emList.get(num).getTypeOfPay();
		pay = "임금    :" + region.emList.get(num).getPay();
		reqCarrer = "요구 경력 :" + region.emList.get(num).getReqCareer();
		reqEdu = "요구 학력 :" + region.emList.get(num).getReqEdu();
		major = "전공    :" + region.emList.get(num).getMajor();
		reqLicense = "요구 자격 :" + region.emList.get(num).getReqLicense();
		address = "주소    :" + region.emList.get(num).getAddress();
		typeOfCompany = "기업 형태 :" + region.emList.get(num).getTypeOfCompany();
		institution = "담당 기관:" + region.emList.get(num).getInstitution();
		contact = "연락처 :" + region.emList.get(num).getContact();
		
		
		briefInfo.setText(companyName);
		briefInfo1.setText(duty); 
		periodText.setText(period);
		dutyText.setText(duty);
		typeOfEmploymentText.setText(typeOfEmployment);
		typeOfPayText.setText(typeOfPay);
		payText.setText(pay);
		reqCarrerText.setText(reqCarrer);
		reqEduText.setText(reqEdu);
		majorText.setText(major);
		reqLicenseText.setText(reqLicense);
		addressText.setText(address);
		typeOfCompanyText.setText(typeOfCompany);
		institutionText.setText(institution);
		contactText.setText(contact);
		
	}
	
}