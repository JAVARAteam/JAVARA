package Workable;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class regionUI extends JFrame {

	private JPanel mainPanel;
	
	JTextField idText1 = new JTextField();
	JTextField idText2 = new JTextField();
	JTextField idText3 = new JTextField();
	JTextField idText4 = new JTextField();
	JTextField nameText1 = new JTextField();;
	JTextField nameText2 = new JTextField();;
	JTextField nameText3 = new JTextField();;
	JTextField nameText4 = new JTextField();
	JTextField payTypeText1 = new JTextField();
	JTextField payText1 = new JTextField();
	JTextField payTypeText2 = new JTextField();
	JTextField payText2 = new JTextField();
	JTextField payTypeText3 = new JTextField();
	JTextField payText3 = new JTextField();
	JTextField payTypeText4 = new JTextField();
	JTextField payText4 = new JTextField();
	
	em_info em = new em_info();
	ArrayList<employmentInfo> emList = em.selectByOne("'%%'");
	
	int dataNum = emList.size();
	int pageNum = (dataNum / 4) + 1;
	int pageIdx = 0;
	int listIdx = pageIdx * 4;
	
	ArrayList<String> region = new ArrayList<>();
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					regionUI frame = new regionUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public void setEmList() {
		if(!region.isEmpty()) {
			emList = em.selectByMultiple(region);
		}
		
		else {
			emList = em.selectByOne("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;
		
		settingText();
	}

	public regionUI() {
		settingText();
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
		contentPanel.setFocusable(false);
		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new LineBorder(new Color(255, 165, 0)));
		contentPanel.setBounds(0, 80, 560, 792);
		mainPanel.add(contentPanel);
		contentPanel.setLayout(null);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 300, 560, 10);
		contentPanel.add(separator);
		
		JSeparator separator2 = new JSeparator();
		separator2.setBounds(0, 400, 560, 10);
		contentPanel.add(separator2);
		
		JSeparator separator3 = new JSeparator();
		separator3.setBounds(0, 500, 560, 10);
		contentPanel.add(separator3);
		
		JSeparator separator4 = new JSeparator();
		separator4.setBounds(0, 600, 560, 10);
		contentPanel.add(separator4);
		
		JSeparator separator5 = new JSeparator();
		separator5.setBounds(0, 700, 560, 10);
		contentPanel.add(separator5);
		
		idText1.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		idText1.setBorder(null);
		idText1.setBounds(12, 338, 40, 26);
		contentPanel.add(idText1);
		idText1.setColumns(10);
		
		nameText1.setFont(new Font("NanumSquare", Font.PLAIN, 17));
		nameText1.setBorder(null);
		nameText1.setFocusable(false);
		nameText1.setEditable(false);
		nameText1.setBounds(64, 320, 288, 60);
		contentPanel.add(nameText1);
		nameText1.setColumns(20);
		nameText1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				recruitmentInformationUI recruitment = new recruitmentInformationUI();
				recruitment.setVisible(true);
				setVisible(false);
				
			}
		});
		
		payTypeText1.setHorizontalAlignment(SwingConstants.CENTER);
		payTypeText1.setFont(new Font("NanumSquare", Font.PLAIN, 16));
		payTypeText1.setBorder(null);
		payTypeText1.setFocusable(false);
		payTypeText1.setDragEnabled(false);
		payTypeText1.setEditable(false);
		payTypeText1.setBounds(393, 315, 120, 26);
		contentPanel.add(payTypeText1);
		payTypeText1.setColumns(10);
		
		payText1.setHorizontalAlignment(SwingConstants.CENTER);
		payText1.setFont(new Font("NanumSquare", Font.PLAIN, 16));
		payText1.setBorder(null);
		payText1.setBounds(393, 353, 120, 26);
		payText1.setFocusable(false);
		payText1.setDragEnabled(false);
		payText1.setEditable(false);
		contentPanel.add(payText1);
		payText1.setColumns(10);
		
		
		idText2.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		idText2.setBorder(null);
		idText2.setColumns(10);
		idText2.setBounds(12, 438, 40, 26);
		contentPanel.add(idText2);
		
		nameText2.setBounds(64, 420, 288, 60);
		nameText2.setFont(new Font("NanumSquare", Font.PLAIN, 17));
		nameText2.setBorder(null);
		nameText2.setFocusable(false);
		nameText2.setEditable(false);
		contentPanel.add(nameText2);
		nameText2.setColumns(20);
		nameText2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				recruitmentInformationUI recruitment = new recruitmentInformationUI();
				recruitment.setVisible(true);
				setVisible(false);
				
			}
		});
		
		payTypeText2.setBounds(393, 415, 120, 26);
		payTypeText2.setHorizontalAlignment(SwingConstants.CENTER);
		payTypeText2.setFont(new Font("NanumSquare", Font.PLAIN, 16));
		payTypeText2.setBorder(null);
		payTypeText2.setFocusable(false);
		payTypeText2.setDragEnabled(false);
		payTypeText2.setEditable(false);
		contentPanel.add(payTypeText2);
		payTypeText2.setColumns(10);
		
		payText2.setBounds(393, 453, 120, 26);
		payText2.setHorizontalAlignment(SwingConstants.CENTER);
		payText2.setFont(new Font("NanumSquare", Font.PLAIN, 16));
		payText2.setBorder(null);
		payText2.setFocusable(false);
		payText2.setDragEnabled(false);
		payText2.setEditable(false);
		contentPanel.add(payText2);
		payText2.setColumns(10);
		
		
		idText3.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		idText3.setBorder(null);
		idText3.setColumns(10);
		idText3.setBounds(12, 538, 40, 26);
		contentPanel.add(idText3);
		
		nameText3.setBounds(64, 520, 288, 60);
		nameText3.setFont(new Font("NanumSquare", Font.PLAIN, 17));
		nameText3.setBorder(null);
		nameText3.setFocusable(false);
		nameText3.setEditable(false);
		contentPanel.add(nameText3);
		nameText3.setColumns(20);
		nameText3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				recruitmentInformationUI recruitment = new recruitmentInformationUI();
				recruitment.setVisible(true);
				setVisible(false);
				
			}
		});
		
		payTypeText3.setBounds(393, 515, 120, 26);
		payTypeText3.setHorizontalAlignment(SwingConstants.CENTER);
		payTypeText3.setFont(new Font("NanumSquare", Font.PLAIN, 16));
		payTypeText3.setBorder(null);
		payTypeText3.setFocusable(false);
		payTypeText3.setDragEnabled(false);
		payTypeText3.setEditable(false);
		contentPanel.add(payTypeText3);
		payTypeText3.setColumns(10);
		
		payText3.setBounds(393, 553, 120, 26);
		payText3.setHorizontalAlignment(SwingConstants.CENTER);
		payText3.setFont(new Font("NanumSquare", Font.PLAIN, 16));
		payText3.setBorder(null);
		payText3.setFocusable(false);
		payText3.setDragEnabled(false);
		payText3.setEditable(false);
		contentPanel.add(payText3);
		payText3.setColumns(10);
		
		
		idText4.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		idText4.setBorder(null);
		idText4.setColumns(10);
		idText4.setBounds(12, 638, 40, 26);
		contentPanel.add(idText4);
		
		nameText4.setBounds(64, 620, 288, 60);
		nameText4.setFont(new Font("NanumSquare", Font.PLAIN, 17));
		nameText4.setBorder(null);
		nameText4.setFocusable(false);
		nameText4.setEditable(false);
		contentPanel.add(nameText4);
		nameText4.setColumns(20);
		nameText4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				recruitmentInformationUI recruitment = new recruitmentInformationUI();
				recruitment.setVisible(true);
				setVisible(false);
				
			}
		});
		
		
		payTypeText4.setBounds(393, 615, 120, 26);
		payTypeText4.setHorizontalAlignment(SwingConstants.CENTER);
		payTypeText4.setFont(new Font("NanumSquare", Font.PLAIN, 16));
		payTypeText4.setBorder(null);
		payTypeText4.setFocusable(false);
		payTypeText4.setDragEnabled(false);
		payTypeText4.setEditable(false);
		contentPanel.add(payTypeText4);
		payTypeText4.setColumns(10);
		
		payText4.setFocusable(false);
		payText4.setHorizontalAlignment(SwingConstants.CENTER);
		payText4.setFont(new Font("NanumSquare", Font.PLAIN, 16));
		payText4.setBorder(null);
		payText4.setDragEnabled(false);
		payText4.setEditable(false);
		payText4.setBounds(393, 653, 120, 26);
		contentPanel.add(payText4);
		payText4.setColumns(10);
		
		
		JTextField regionLabel = new JTextField();
		regionLabel.setBackground(Color.WHITE);
		regionLabel.setEditable(false);
		regionLabel.setBorder(null);
		regionLabel.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		regionLabel.setHorizontalAlignment(SwingConstants.CENTER);
		regionLabel.setBounds(12, 21, 520, 26);
		contentPanel.add(regionLabel);
		regionLabel.setColumns(10);
		
		JPanel regionPanel = new JPanel();
		regionPanel.setBorder(new LineBorder(new Color(255, 165, 0)));
		regionPanel.setBackground(Color.WHITE);
		regionPanel.setBounds(18, 59, 510, 170);
		contentPanel.add(regionPanel);
		regionPanel.setLayout(null);
		
		JButton seoulBtn = new JButton("SEL");
		seoulBtn.setFocusable(false);
		seoulBtn.addMouseListener(new MouseAdapter() {
			boolean isChecked = false;
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isChecked) {
					seoulBtn.setFont(new Font("NanumSquare", Font.BOLD | Font.ITALIC, 30));
					isChecked = true;
					region.add("'서울특별시%%'");
				}
				else {
					seoulBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
					isChecked = false;
					region.remove("'서울특별시%%'");
				}
				
				setEmList();
			}
		});
		seoulBtn.setBorder(null);
		seoulBtn.setBackground(Color.WHITE);
		seoulBtn.setHorizontalAlignment(SwingConstants.LEFT);
		seoulBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		seoulBtn.setBounds(15, 20, 60, 30);
		seoulBtn.setForeground(Color.BLACK);
		regionPanel.add(seoulBtn);
		
		JButton kyeonggiBtn = new JButton("KYG");
		kyeonggiBtn.setFocusable(false);
		kyeonggiBtn.addMouseListener(new MouseAdapter() {
			boolean isChecked = false;
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isChecked) {
					kyeonggiBtn.setFont(new Font("NanumSquare", Font.BOLD | Font.ITALIC, 30));
					region.add("'경기도%%'");
					isChecked = true;
				}
				else {
					kyeonggiBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
					isChecked = false;
					region.remove("'경기도%%'");
				}
				setEmList();
			}
		});
		kyeonggiBtn.setBorder(null);
		kyeonggiBtn.setBackground(Color.WHITE);
		kyeonggiBtn.setHorizontalAlignment(SwingConstants.LEFT);
		kyeonggiBtn.setForeground(Color.BLACK);
		kyeonggiBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		kyeonggiBtn.setBounds(99, 20, 60, 30);
		regionPanel.add(kyeonggiBtn);
		
		JButton incheonBtn = new JButton("INC");
		incheonBtn.setFocusable(false);
		incheonBtn.addMouseListener(new MouseAdapter() {
			boolean isChecked = false;
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isChecked) {
					incheonBtn.setFont(new Font("NanumSquare", Font.BOLD | Font.ITALIC, 30));
					isChecked = true;
					region.add("'인천광역시%%'");
				}
				else {
					incheonBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
					isChecked = false;
					region.remove("'인천광역시%%'");
				}
				setEmList();
			}
		});
		incheonBtn.setBorder(null);
		incheonBtn.setBackground(Color.WHITE);
		incheonBtn.setHorizontalAlignment(SwingConstants.LEFT);
		incheonBtn.setForeground(Color.BLACK);
		incheonBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		incheonBtn.setBounds(183, 20, 60, 30);
		regionPanel.add(incheonBtn);
		
		JButton kangwonBtn = new JButton("GAW");
		kangwonBtn.setFocusable(false);
		kangwonBtn.addMouseListener(new MouseAdapter() {
			boolean isChecked = false;
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isChecked) {
					kangwonBtn.setFont(new Font("NanumSquare", Font.BOLD | Font.ITALIC, 30));
					isChecked = true;
					region.add("'강원도%%'");
				}
				else {
					kangwonBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
					isChecked = false;
					region.remove("'강원도%%'");
				}
				setEmList();
			}
		});
		kangwonBtn.setBorder(null);
		kangwonBtn.setBackground(Color.WHITE);
		kangwonBtn.setHorizontalAlignment(SwingConstants.LEFT);
		kangwonBtn.setForeground(Color.BLACK);
		kangwonBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		kangwonBtn.setBounds(267, 20, 70, 30);
		regionPanel.add(kangwonBtn);
		
		JButton deajeonBtn = new JButton("DAJ");
		deajeonBtn.setFocusable(false);
		deajeonBtn.addMouseListener(new MouseAdapter() {
			boolean isChecked = false;
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isChecked) {
					deajeonBtn.setFont(new Font("NanumSquare", Font.BOLD | Font.ITALIC, 30));
					region.add("'대전광역시%%'");
					isChecked = true;
				}
				else {
					deajeonBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
					isChecked = false;
					region.remove("'대전광역시%%'");
				}
				setEmList();
			}
		});
		deajeonBtn.setBorder(null);
		deajeonBtn.setBackground(Color.WHITE);
		deajeonBtn.setHorizontalAlignment(SwingConstants.LEFT);
		deajeonBtn.setForeground(Color.BLACK);
		deajeonBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		deajeonBtn.setBounds(351, 20, 60, 30);
		regionPanel.add(deajeonBtn);
		
		JButton sejongBtn = new JButton("SEJ");
		sejongBtn.setFocusable(false);
		sejongBtn.addMouseListener(new MouseAdapter() {
			boolean isChecked = false;
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isChecked) {
					sejongBtn.setFont(new Font("NanumSquare", Font.BOLD | Font.ITALIC, 30));
					isChecked = true;
					region.add("'세종특별자치시%%'");
				}
				else {
					sejongBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
					isChecked = false;
					region.remove("'세종특별자치시%%'");
				}
				setEmList();
			}
		});
		sejongBtn.setBorder(null);
		sejongBtn.setBackground(Color.WHITE);
		sejongBtn.setHorizontalAlignment(SwingConstants.LEFT);
		sejongBtn.setForeground(Color.BLACK);
		sejongBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		sejongBtn.setBounds(435, 20, 60, 30);
		regionPanel.add(sejongBtn);
		
		JButton chungnamBtn = new JButton("CCN");
		chungnamBtn.setFocusable(false);
		chungnamBtn.addMouseListener(new MouseAdapter() {
			boolean isChecked = false;
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isChecked) {
					chungnamBtn.setFont(new Font("NanumSquare", Font.BOLD | Font.ITALIC, 30));
					isChecked = true;
					region.add("'충청남도%%'");
				}
				else {
					chungnamBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
					isChecked = false;
					region.remove("'충청남도%%'");
				}
				setEmList();
			}
		});
		chungnamBtn.setBorder(null);
		chungnamBtn.setBackground(Color.WHITE);
		chungnamBtn.setHorizontalAlignment(SwingConstants.LEFT);
		chungnamBtn.setForeground(Color.BLACK);
		chungnamBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		chungnamBtn.setBounds(15, 70, 60, 30);
		regionPanel.add(chungnamBtn);
		
		JButton chungbukBtn = new JButton("CCB");
		chungbukBtn.setFocusable(false);
		chungbukBtn.addMouseListener(new MouseAdapter() {
			boolean isChecked = false;
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isChecked) {
					chungbukBtn.setFont(new Font("NanumSquare", Font.BOLD | Font.ITALIC, 30));
					isChecked = true;
					region.add("'충청북도%%'");
				}
				else {
					chungbukBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
					isChecked = false;
					region.remove("'충청북도%%'");
				}
				setEmList();
			}
		});
		chungbukBtn.setBorder(null);
		chungbukBtn.setBackground(Color.WHITE);
		chungbukBtn.setHorizontalAlignment(SwingConstants.LEFT);
		chungbukBtn.setForeground(Color.BLACK);
		chungbukBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		chungbukBtn.setBounds(99, 70, 60, 30);
		regionPanel.add(chungbukBtn);
		
		JButton busanBtn = new JButton("BUS");
		busanBtn.setFocusable(false);
		busanBtn.addMouseListener(new MouseAdapter() {
			boolean isChecked = false;
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isChecked) {
					busanBtn.setFont(new Font("NanumSquare", Font.BOLD | Font.ITALIC, 30));
					isChecked = true;
					region.add("'부산광역시%%'");
				}
				else {
					busanBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
					isChecked = false;
					region.remove("'부산광역시%%'");
				}
				setEmList();
			}
		});
		busanBtn.setBorder(null);
		busanBtn.setBackground(Color.WHITE);
		busanBtn.setHorizontalAlignment(SwingConstants.LEFT);
		busanBtn.setForeground(Color.BLACK);
		busanBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		busanBtn.setBounds(183, 70, 60, 30);
		regionPanel.add(busanBtn);
		
		JButton ulsanBtn = new JButton("USN");
		ulsanBtn.setFocusable(false);
		ulsanBtn.addMouseListener(new MouseAdapter() {
			boolean isChecked = false;
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isChecked) {
					ulsanBtn.setFont(new Font("NanumSquare", Font.BOLD | Font.ITALIC, 30));
					isChecked = true;
					region.add("'울산광역시%%'");
				}
				else {
					ulsanBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
					isChecked = false;
					region.remove("'울산광역시%%'");
					
				}
				setEmList();
			}
		});
		ulsanBtn.setBorder(null);
		ulsanBtn.setBackground(Color.WHITE);
		ulsanBtn.setHorizontalAlignment(SwingConstants.LEFT);
		ulsanBtn.setForeground(Color.BLACK);
		ulsanBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		ulsanBtn.setBounds(267, 70, 60, 30);
		regionPanel.add(ulsanBtn);
		
		JButton gyeongnamBtn = new JButton("GSN");
		gyeongnamBtn.setFocusable(false);
		gyeongnamBtn.addMouseListener(new MouseAdapter() {
			boolean isChecked = false;
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isChecked) {
					gyeongnamBtn.setFont(new Font("NanumSquare", Font.BOLD | Font.ITALIC, 30));
					isChecked = true;
					region.add("'경상남도%%'");
				}
				else {
					gyeongnamBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
					isChecked = false;
					region.remove("'경상남도%%'");
				}
				setEmList();
			}
		});
		gyeongnamBtn.setBorder(null);
		gyeongnamBtn.setBackground(Color.WHITE);
		gyeongnamBtn.setHorizontalAlignment(SwingConstants.LEFT);
		gyeongnamBtn.setForeground(Color.BLACK);
		gyeongnamBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		gyeongnamBtn.setBounds(351, 70, 60, 30);
		regionPanel.add(gyeongnamBtn);
		
		JButton gyeongbukBtn = new JButton("GSB");
		gyeongbukBtn.setFocusable(false);
		gyeongbukBtn.addMouseListener(new MouseAdapter() {
			boolean isChecked = false;
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isChecked) {
					gyeongbukBtn.setFont(new Font("NanumSquare", Font.BOLD | Font.ITALIC, 30));
					isChecked = true;
					region.add("'경상북도%%'");
				}
				else {
					gyeongbukBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
					isChecked = false;
					region.remove("'경상북도%%'");
				}
				setEmList();
			}
		});
		gyeongbukBtn.setBorder(null);
		gyeongbukBtn.setBackground(Color.WHITE);
		gyeongbukBtn.setHorizontalAlignment(SwingConstants.LEFT);
		gyeongbukBtn.setForeground(Color.BLACK);
		gyeongbukBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		gyeongbukBtn.setBounds(435, 70, 60, 30);
		regionPanel.add(gyeongbukBtn);
		
		JButton daeguBtn = new JButton("DAE");
		daeguBtn.setFocusable(false);
		daeguBtn.addMouseListener(new MouseAdapter() {
			boolean isChecked = false;
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isChecked) {
					daeguBtn.setFont(new Font("NanumSquare", Font.BOLD | Font.ITALIC, 30));
					isChecked = true;
					region.add("'대구광역시%%'");
				}
				else {
					daeguBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
					isChecked = false;
					region.remove("'대구광역시%%'");
				}
				setEmList();
			}
		});
		daeguBtn.setBorder(null);
		daeguBtn.setBackground(Color.WHITE);
		daeguBtn.setHorizontalAlignment(SwingConstants.LEFT);
		daeguBtn.setForeground(Color.BLACK);
		daeguBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		daeguBtn.setBounds(15, 120, 60, 30);
		regionPanel.add(daeguBtn);
		
		JButton gwangjuBtn = new JButton("KWJ");
		gwangjuBtn.setFocusable(false);
		gwangjuBtn.addMouseListener(new MouseAdapter() {
			boolean isChecked = false;
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isChecked) {
					gwangjuBtn.setFont(new Font("NanumSquare", Font.BOLD | Font.ITALIC, 30));
					isChecked = true;
					region.add("'광주광역시%%'");
				}
				else {
					gwangjuBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
					isChecked = false;
					region.remove("'광주광역시%%'");
				}
				setEmList();
			}
		});
		gwangjuBtn.setBorder(null);
		gwangjuBtn.setBackground(Color.WHITE);
		gwangjuBtn.setHorizontalAlignment(SwingConstants.LEFT);
		gwangjuBtn.setForeground(Color.BLACK);
		gwangjuBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		gwangjuBtn.setBounds(99, 120, 62, 30);
		regionPanel.add(gwangjuBtn);
		
		JButton jeonnamBtn = new JButton("JLN");
		jeonnamBtn.setFocusable(false);
		jeonnamBtn.addMouseListener(new MouseAdapter() {
			boolean isChecked = false;
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isChecked) {
					jeonnamBtn.setFont(new Font("NanumSquare", Font.BOLD | Font.ITALIC, 30));
					isChecked = true;
					region.add("'전라남도%%'");
				}
				else {
					jeonnamBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
					isChecked = false;
					region.remove("'전라남도%%'");
				}
				setEmList();
			}
		});
		jeonnamBtn.setBorder(null);
		jeonnamBtn.setBackground(Color.WHITE);
		jeonnamBtn.setHorizontalAlignment(SwingConstants.LEFT);
		jeonnamBtn.setForeground(Color.BLACK);
		jeonnamBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		jeonnamBtn.setBounds(183, 120, 60, 30);
		regionPanel.add(jeonnamBtn);
		
		JButton jeonbukBtn = new JButton("JLB");
		jeonbukBtn.setFocusable(false);
		jeonbukBtn.addMouseListener(new MouseAdapter() {
			boolean isChecked = false;
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isChecked) {
					jeonbukBtn.setFont(new Font("NanumSquare", Font.BOLD | Font.ITALIC, 30));
					isChecked = true;
					region.add("'전라북도%%'");
				}
				else {
					jeonbukBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
					isChecked = false;
					region.remove("'전라북도%%'");
				}
				setEmList();
			}
		});
		jeonbukBtn.setBorder(null);
		jeonbukBtn.setBackground(Color.WHITE);
		jeonbukBtn.setHorizontalAlignment(SwingConstants.LEFT);
		jeonbukBtn.setForeground(Color.BLACK);
		jeonbukBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		jeonbukBtn.setBounds(267, 120, 60, 30);
		regionPanel.add(jeonbukBtn);
		
		JButton jejuBtn = new JButton("JEJ");
		jejuBtn.setFocusable(false);
		jejuBtn.addMouseListener(new MouseAdapter() {
			boolean isChecked = false;
			@Override
			public void mouseClicked(MouseEvent e) {
				if(!isChecked) {
					jejuBtn.setFont(new Font("NanumSquare", Font.BOLD | Font.ITALIC, 30));
					isChecked = true;
					region.add("'제주특별자치도%%'");
				}
				else {
					jejuBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
					isChecked = false;
					region.remove("'제주특별자치도%%'");
				}
				setEmList();
			}
		});
		jejuBtn.setBorder(null);
		jejuBtn.setBackground(Color.WHITE);
		jejuBtn.setHorizontalAlignment(SwingConstants.LEFT);
		jejuBtn.setForeground(Color.BLACK);
		jejuBtn.setFont(new Font("NanumSquare", Font.PLAIN, 30));
		jejuBtn.setBounds(351, 120, 60, 30);
		regionPanel.add(jejuBtn);
		
		ImageIcon originalIcon = new ImageIcon("C:\\Users\\SAMSUNG\\eclipse-workspace\\Workable\\src\\image\\filter.png");
		Image filterImg = originalIcon.getImage();
		filterImg = filterImg.getScaledInstance(130, 50, Image.SCALE_DEFAULT);
		ImageIcon filterIcon = new ImageIcon(filterImg);
		JLabel advancedSearchBtn = new JLabel(filterIcon);
		advancedSearchBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				advancedSearchUI advancedSearch = new advancedSearchUI();
				advancedSearch.setVisible(true);
				setVisible(false);
			}
		});
		
		advancedSearchBtn.setBounds(383, 241, 152, 51);
		contentPanel.add(advancedSearchBtn);
		
		ImageIcon icon = new ImageIcon("C:\\Users\\SAMSUNG\\eclipse-workspace\\Workable\\src\\image\\prevBtn.png");
		Image previm = icon.getImage();
		Image previm2 = previm.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		ImageIcon icon2 = new ImageIcon(previm2);
		JButton prevBtn = new JButton(icon2);
		prevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pageIdx = Math.floorMod((pageIdx - 1), pageNum);
				listIdx = pageIdx * 4;
				settingText();
			}
		});
		prevBtn.setForeground(Color.ORANGE);
		prevBtn.setBorder(null);
		prevBtn.setBackground(Color.WHITE);
		prevBtn.setBounds(200, 720, 50, 50);
		contentPanel.add(prevBtn);
		
		ImageIcon icon3 = new ImageIcon("C:\\Users\\SAMSUNG\\eclipse-workspace\\Workable\\src\\image\\nextBtn.png");
		Image nextim3 = icon3.getImage();
		Image nextim4 = nextim3.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		ImageIcon icon4 = new ImageIcon(nextim4);
		JButton nextBtn = new JButton(icon4);
		nextBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pageIdx = Math.floorMod((pageIdx + 1), pageNum);
				listIdx = pageIdx * 4;
				settingText();

			}
		});
		nextBtn.setForeground(Color.ORANGE);
		nextBtn.setBorder(null);
		nextBtn.setBackground(Color.WHITE);		
		nextBtn.setBounds(306, 720, 50, 50);
		contentPanel.add(nextBtn);
		
		
		
		JPanel topPanel = new JPanel();
		topPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		topPanel.setName("Workable");
		topPanel.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		topPanel.setToolTipText("Workable");
		topPanel.setBackground(new Color(255, 165, 0));
		topPanel.setBounds(0, 0, 560, 80);
		topPanel.setBorder(new LineBorder(new Color(255, 165, 0)));
		mainPanel.add(topPanel);
		topPanel.setLayout(null);
		
		JLabel topLabel = new JLabel("Region");
		topLabel.setBounds(1, 20, 559, 40);
		topLabel.setAlignmentX(0.5f);
		topLabel.setHorizontalAlignment(SwingConstants.CENTER);
		topLabel.setFont(new Font("NanumSquare", Font.PLAIN, 40));
		topPanel.add(topLabel);
		
		ImageIcon icon5 = new ImageIcon("C:\\Users\\SAMSUNG\\eclipse-workspace\\Workable\\src\\image\\backBtn.png");
		Image backim = icon5.getImage();
		Image backim2 = backim.getScaledInstance(30, 30, Image.SCALE_DEFAULT);
		ImageIcon icon6 = new ImageIcon(backim2);
		JButton backBtn = new JButton(icon6);
		backBtn.setFocusable(false);
		backBtn.setBorder(null);
		backBtn.setBackground(new Color(255, 165, 0));
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				javaraUI javara = new javaraUI();
				javara.setVisible(true);
				setVisible(false);
			}
		});
		backBtn.setBounds(12, 16, 48, 48);
		topPanel.add(backBtn);
	}
	
public void settingText() {
	
		String idArr[] = new String[6];
		String nameArr[] = new String[6];
		String payTypeArr[] = new String[6];
		String payArr[] = new String[6];
		int idx;
		
		for (idx = 0; idx < 4; idx++) {
			idArr[idx] = String.valueOf(emList.get(listIdx).getId());
			nameArr[idx] = emList.get(listIdx).getCompanyName();
			payTypeArr[idx] = emList.get(listIdx).getTypeOfPay();
			payArr[idx] = emList.get(listIdx++).getPay();
			
			if(listIdx >= dataNum ) {
				idx = 4;
			}
		}
		

		idText1.setText(idArr[0]);
		nameText1.setText(nameArr[0]);
		payTypeText1.setText(payTypeArr[0]);
		payText1.setText(payArr[0]);

		idText2.setText(idArr[1]);
		nameText2.setText(nameArr[1]);
		payTypeText2.setText(payTypeArr[1]);
		payText2.setText(payArr[1]);
		
		idText3.setText(idArr[2]);
		nameText3.setText(nameArr[2]);
		payTypeText3.setText(payTypeArr[2]);
		payText3.setText(payArr[2]);

		idText4.setText(idArr[3]);
		nameText4.setText(nameArr[3]);
		payTypeText4.setText(payTypeArr[3]);
		payText4.setText(payArr[3]);


	}

public int getListIdx() {
	return listIdx;
}

public void setListIdx(int listIdx) {
	this.listIdx = listIdx;
}

public int getPageNum() {
	return pageIdx;
}

public void setPageNum(int pageNum) {
	this.pageNum = pageNum;
}

public int getPageIdx() {
	return pageIdx;
}

public void setPageIdx(int pageIdx) {
	this.pageIdx = pageIdx;
}

}
