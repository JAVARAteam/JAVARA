package Workable;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

@SuppressWarnings("serial")
public class mapSearchUI extends JFrame {

	private JPanel mapShow;
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

	ArrayList<String> mapSearch = new ArrayList<>();
	JTextField search;
	JLabel mapLabel;
	private final JButton searchBtn = new JButton("Search");

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					mapSearchUI frame = new mapSearchUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void setEmList() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple1(mapSearch);
		}

		else {
			emList = em.selectByOne1("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList1() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple2(mapSearch);
		}

		else {
			emList = em.selectByOne2("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList2() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple3(mapSearch);
		}

		else {
			emList = em.selectByOne3("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList3() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple4(mapSearch);
		}

		else {
			emList = em.selectByOne4("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList4() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple5(mapSearch);
		}

		else {
			emList = em.selectByOne5("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList5() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple6(mapSearch);
		}

		else {
			emList = em.selectByOne6("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList6() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple7(mapSearch);
		}

		else {
			emList = em.selectByOne7("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList7() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple8(mapSearch);
		}

		else {
			emList = em.selectByOne8("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList8() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple9(mapSearch);
		}

		else {
			emList = em.selectByOne9("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList9() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple10(mapSearch);
		}

		else {
			emList = em.selectByOne10("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList10() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple11(mapSearch);
		}

		else {
			emList = em.selectByOne11("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList11() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple12(mapSearch);
		}

		else {
			emList = em.selectByOne12("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList12() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple13(mapSearch);
		}

		else {
			emList = em.selectByOne13("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList13() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple14(mapSearch);
		}

		else {
			emList = em.selectByOne14("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList14() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple15(mapSearch);
		}

		else {
			emList = em.selectByOne15("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList15() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple16(mapSearch);
		}

		else {
			emList = em.selectByOne16("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList16() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple17(mapSearch);
		}

		else {
			emList = em.selectByOne17("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList17() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple18(mapSearch);
		}

		else {
			emList = em.selectByOne18("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList18() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple19(mapSearch);
		}

		else {
			emList = em.selectByOne19("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList19() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple20(mapSearch);
		}

		else {
			emList = em.selectByOne20("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList20() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple21(mapSearch);
		}

		else {
			emList = em.selectByOne21("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList21() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple22(mapSearch);
		}

		else {
			emList = em.selectByOne22("'%%'");
		}
		dataNum = emList.size();
		pageNum = (dataNum / 4) + 1;
		pageIdx = 0;
		listIdx = pageIdx * 4;

		settingText();
	}
	
	public void setEmList22() {
		if (!mapSearch.isEmpty()) {
			emList = em.selectByMultiple(mapSearch);
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

	public mapSearchUI() {
		setEmList();
		setEmList1();
		setEmList2();
		setEmList3();
		setEmList4();
		setEmList5();
		setEmList6();
		setEmList7();
		setEmList8();
		setEmList9();
		setEmList10();
		setEmList11();
		setEmList12();
		setEmList13();
		setEmList14();
		setEmList15();
		setEmList16();
		setEmList17();
		setEmList18();
		setEmList19();
		setEmList20();
		setEmList21();
		setEmList22();
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 900);
		mapShow = new JPanel();
		mapShow.setForeground(Color.BLACK);
		mapShow.setBackground(Color.WHITE);
		mapShow.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(mapShow);
		mapShow.setLayout(null);

		em_info em = new em_info();
		ArrayList<employmentInfo> emList = em.selectByOne("'%%'");

		JPanel mapSquare = new JPanel();
		mapSquare.setFocusable(false);
		mapSquare.setBounds(0, 80, 544, 310);
		mapSquare.setBackground(Color.WHITE);
		mapSquare.setBorder(new LineBorder(new Color(255, 165, 0)));
		mapSquare.setBorder(null);
		mapShow.add(mapSquare);
		mapSquare.setLayout(null);

		JPanel recruitShow = new JPanel();
		recruitShow.setBackground(Color.WHITE);
		recruitShow.setBorder(new LineBorder(new Color(0, 0, 0)));
		recruitShow.setBounds(0, 390, 544, 471);
		mapShow.add(recruitShow);
		recruitShow.setLayout(null);

		JSeparator separator = new JSeparator();
		separator.setBounds(0, 0, 560, 10);
		recruitShow.add(separator);

		JSeparator separator2 = new JSeparator();
		separator2.setBounds(0, 100, 560, 10);
		recruitShow.add(separator2);

		JSeparator separator3 = new JSeparator();
		separator3.setBounds(0, 200, 560, 10);
		recruitShow.add(separator3);

		JSeparator separator4 = new JSeparator();
		separator4.setBounds(0, 300, 560, 10);
		recruitShow.add(separator4);

		JSeparator separator5 = new JSeparator();
		separator5.setBounds(0, 400, 560, 10);
		recruitShow.add(separator5);

		idText1.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		idText1.setBorder(null);
		idText1.setBounds(12, 38, 40, 26);
		recruitShow.add(idText1);
		idText1.setColumns(10);

		nameText1.setFont(new Font("NanumSquare", Font.PLAIN, 17));
		nameText1.setBorder(null);
		nameText1.setFocusable(false);
		nameText1.setEditable(false);
		nameText1.setBounds(64, 20, 288, 60);
		recruitShow.add(nameText1);
		nameText1.setColumns(20);

		payTypeText1.setHorizontalAlignment(SwingConstants.CENTER);
		payTypeText1.setFont(new Font("NanumSquare", Font.PLAIN, 16));
		payTypeText1.setBorder(null);
		payTypeText1.setFocusable(false);
		payTypeText1.setDragEnabled(false);
		payTypeText1.setEditable(false);
		payTypeText1.setBounds(393, 20, 120, 26);
		recruitShow.add(payTypeText1);
		payTypeText1.setColumns(10);

		payText1.setHorizontalAlignment(SwingConstants.CENTER);
		payText1.setFont(new Font("NanumSquare", Font.PLAIN, 16));
		payText1.setBorder(null);
		payText1.setBounds(393, 54, 120, 26);
		payText1.setFocusable(false);
		payText1.setDragEnabled(false);
		payText1.setEditable(false);
		recruitShow.add(payText1);
		payText1.setColumns(10);

		idText2.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		idText2.setBorder(null);
		idText2.setColumns(10);
		idText2.setBounds(12, 138, 40, 26);
		recruitShow.add(idText2);

		nameText2.setBounds(64, 120, 288, 60);
		nameText2.setFont(new Font("NanumSquare", Font.PLAIN, 17));
		nameText2.setBorder(null);
		nameText2.setFocusable(false);
		nameText2.setEditable(false);
		recruitShow.add(nameText2);
		nameText2.setColumns(20);

		payTypeText2.setBounds(393, 120, 120, 26);
		payTypeText2.setHorizontalAlignment(SwingConstants.CENTER);
		payTypeText2.setFont(new Font("NanumSquare", Font.PLAIN, 16));
		payTypeText2.setBorder(null);
		payTypeText2.setFocusable(false);
		payTypeText2.setDragEnabled(false);
		payTypeText2.setEditable(false);
		recruitShow.add(payTypeText2);
		payTypeText2.setColumns(10);

		payText2.setBounds(393, 154, 120, 26);
		payText2.setHorizontalAlignment(SwingConstants.CENTER);
		payText2.setFont(new Font("NanumSquare", Font.PLAIN, 16));
		payText2.setBorder(null);
		payText2.setFocusable(false);
		payText2.setDragEnabled(false);
		payText2.setEditable(false);
		recruitShow.add(payText2);
		payText2.setColumns(10);

		idText3.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		idText3.setBorder(null);
		idText3.setColumns(10);
		idText3.setBounds(12, 238, 40, 26);
		recruitShow.add(idText3);

		nameText3.setBounds(64, 220, 288, 60);
		nameText3.setFont(new Font("NanumSquare", Font.PLAIN, 17));
		nameText3.setBorder(null);
		nameText3.setFocusable(false);
		nameText3.setEditable(false);
		recruitShow.add(nameText3);
		nameText3.setColumns(20);

		payTypeText3.setBounds(393, 220, 120, 26);
		payTypeText3.setHorizontalAlignment(SwingConstants.CENTER);
		payTypeText3.setFont(new Font("NanumSquare", Font.PLAIN, 16));
		payTypeText3.setBorder(null);
		payTypeText3.setFocusable(false);
		payTypeText3.setDragEnabled(false);
		payTypeText3.setEditable(false);
		recruitShow.add(payTypeText3);
		payTypeText3.setColumns(10);

		payText3.setBounds(393, 254, 120, 26);
		payText3.setHorizontalAlignment(SwingConstants.CENTER);
		payText3.setFont(new Font("NanumSquare", Font.PLAIN, 16));
		payText3.setBorder(null);
		payText3.setFocusable(false);
		payText3.setDragEnabled(false);
		payText3.setEditable(false);
		recruitShow.add(payText3);
		payText3.setColumns(10);

		idText4.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		idText4.setBorder(null);
		idText4.setColumns(10);
		idText4.setBounds(12, 338, 40, 26);
		recruitShow.add(idText4);

		nameText4.setBounds(64, 320, 288, 60);
		nameText4.setFont(new Font("NanumSquare", Font.PLAIN, 17));
		nameText4.setBorder(null);
		nameText4.setFocusable(false);
		nameText4.setEditable(false);
		recruitShow.add(nameText4);
		nameText4.setColumns(20);

		payTypeText4.setBounds(393, 320, 120, 26);
		payTypeText4.setHorizontalAlignment(SwingConstants.CENTER);
		payTypeText4.setFont(new Font("NanumSquare", Font.PLAIN, 16));
		payTypeText4.setBorder(null);
		payTypeText4.setFocusable(false);
		payTypeText4.setDragEnabled(false);
		payTypeText4.setEditable(false);
		recruitShow.add(payTypeText4);
		payTypeText4.setColumns(10);

		payText4.setFocusable(false);
		payText4.setHorizontalAlignment(SwingConstants.CENTER);
		payText4.setFont(new Font("NanumSquare", Font.PLAIN, 16));
		payText4.setBorder(null);
		payText4.setDragEnabled(false);
		payText4.setEditable(false);
		payText4.setBounds(393, 354, 120, 26);
		recruitShow.add(payText4);
		payText4.setColumns(10);
		
		searchBtn.setBounds(447, 287, 97, 23);
		search = new JTextField();
		search.setBounds(0, 288, 445, 21);
		search.setColumns(10);
		mapSquare.add(search);
		mapSquare.add(searchBtn);
		searchBtn.addActionListener(new NaverMap(this));
		
		mapLabel = new JLabel();
		mapLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mapLabel.setBounds(0, 0, 544, 288);
		mapSquare.add(mapLabel);
		
		JPanel topPanel = new JPanel();
		topPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		topPanel.setName("취업 지도");
		topPanel.setFont(new Font("NanumSquare", Font.PLAIN, 40));
		topPanel.setToolTipText("취업 지도");
		topPanel.setBackground(new Color(255, 165, 0));
		topPanel.setBorder(new LineBorder(new Color(255, 165, 0)));
		topPanel.setBounds(0, 0, 544, 80);
		mapShow.add(topPanel);
		topPanel.setLayout(null);

		ImageIcon icon = new ImageIcon("C:\\Users\\SAMSUNG\\eclipse-workspace\\Workable\\src\\image\\prevBtn.png");
		Image previm = icon.getImage();
		Image previm2 = previm.getScaledInstance(40, 40, Image.SCALE_DEFAULT);
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
		prevBtn.setBounds(194, 420, 43, 40);
		recruitShow.add(prevBtn);

		ImageIcon icon3 = new ImageIcon("C:\\Users\\SAMSUNG\\eclipse-workspace\\Workable\\src\\image\\nextBtn.png");
		Image nextim = icon3.getImage();
		Image nextim2 = nextim.getScaledInstance(40, 40, Image.SCALE_DEFAULT);
		ImageIcon icon4 = new ImageIcon(nextim2);
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
		nextBtn.setBounds(304, 420, 43, 40);
		recruitShow.add(nextBtn);

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

		JLabel mainLabel = new JLabel("Employment Map");
		mainLabel.setForeground(new Color(0, 0, 0));
		mainLabel.setBackground(Color.ORANGE);
		mainLabel.setBounds(0, 20, 544, 48);
		mainLabel.setAlignmentX(0.5f);
		mainLabel.setHorizontalAlignment(SwingConstants.CENTER);
		mainLabel.setFont(new Font("나눔스퀘어", Font.PLAIN, 40));
		topPanel.add(mainLabel);
	}

	public void settingText() {

		String idArr[] = new String[6];
		String nameArr[] = new String[6];
		String payTypeArr[] = new String[6];
		String payArr[] = new String[6];
		int idx;

		for (idx = 0; idx < 4; idx++) {
			idArr[idx] = String.valueOf(emList.get(listIdx).getId());
			nameArr[idx] = emList.get(listIdx).getCompanyName() + " / " + emList.get(listIdx).getDuty();
			payTypeArr[idx] = emList.get(listIdx).getTypeOfPay();
			payArr[idx] = emList.get(listIdx++).getPay();

			if (listIdx >= dataNum) {
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
}
