package Workable;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

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
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.swing.border.MatteBorder;

public class trainingUI extends JFrame {

	private JPanel mainPanel;
	JPanel contentPanel = new JPanel();
	JTextField idText1 = new JTextField();
	JTextField nameText1 = new JTextField();
	JTextField institutionText1 = new JTextField();
	JTextField periodText1 = new JTextField();
	JTextField idText2 = new JTextField();
	JTextField nameText2 = new JTextField();
	JTextField institutionText2 = new JTextField();
	JTextField periodText2 = new JTextField();
	JTextField idText3 = new JTextField();
	JTextField nameText3 = new JTextField();
	JTextField institutionText3 = new JTextField();
	JTextField periodText3 = new JTextField();
	JTextField idText4 = new JTextField();
	JTextField nameText4 = new JTextField();
	JTextField institutionText4 = new JTextField();
	JTextField periodText4 = new JTextField();
	JTextField idText5 = new JTextField();
	JTextField nameText5 = new JTextField();
	JTextField institutionText5 = new JTextField();
	JTextField periodText5 = new JTextField();
	JTextField idText6 = new JTextField();
	JTextField nameText6 = new JTextField();
	JTextField institutionText6 = new JTextField();
	JTextField periodText6 = new JTextField();

	ed_info ed = new ed_info();
	ArrayList<ed_idinfo> edList = ed.selectOne();
	int dataNum = edList.size();
	int pageNum = (dataNum / 6) + 1;
	int pageIdx = 0;
	int listIdx = pageIdx * 6;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					trainingUI frame = new trainingUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public trainingUI() {
		
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 560, 900);
		mainPanel = new JPanel();
		mainPanel.setForeground(Color.BLACK);
		mainPanel.setBackground(Color.WHITE);
		mainPanel.setBorder(new LineBorder(new Color(0, 0, 0)));

		setContentPane(mainPanel);
		mainPanel.setLayout(null);

		contentPanel.setBackground(Color.WHITE);
		contentPanel.setBorder(new LineBorder(new Color(255, 165, 0)));
		contentPanel.setBounds(0, 80, 560, 790);
		mainPanel.add(contentPanel);
		contentPanel.setLayout(null);

		JSeparator separator1 = new JSeparator();
		separator1.setBounds(0, 100, 560, 10);
		contentPanel.add(separator1);

		JSeparator separator2 = new JSeparator();
		separator2.setBounds(0, 200, 560, 10);
		contentPanel.add(separator2);

		JSeparator separator3 = new JSeparator();
		separator3.setBounds(0, 300, 560, 10);
		contentPanel.add(separator3);

		JSeparator separator4 = new JSeparator();
		separator4.setBounds(0, 400, 560, 10);
		contentPanel.add(separator4);

		JSeparator separator5 = new JSeparator();
		separator5.setBounds(0, 500, 560, 10);
		contentPanel.add(separator5);

		JSeparator separator6 = new JSeparator();
		separator6.setBounds(0, 600, 560, 10);
		contentPanel.add(separator6);

		JSeparator separator7 = new JSeparator();
		separator7.setBounds(0, 700, 560, 10);
		contentPanel.add(separator7);

		JTextField trainingLabel = new JTextField();
		trainingLabel.setFocusable(false);
		trainingLabel.setAutoscrolls(false);
		trainingLabel.setEditable(false);
		trainingLabel.setBorder(null);
		trainingLabel.setFont(new Font("NanumSquare", Font.PLAIN, 20));
		trainingLabel.setHorizontalAlignment(SwingConstants.CENTER);
		trainingLabel.setText("Training for the development of job skills for the disabled");
		trainingLabel.setBounds(0, 35, 544, 30);
		contentPanel.add(trainingLabel);
		trainingLabel.setColumns(10);

		idText1.setBorder(null);
		idText1.setBackground(Color.WHITE);
		idText1.setEditable(false);
		idText1.setColumns(10);
		idText1.setBounds(20, 138, 70, 26);
		contentPanel.add(idText1);

		nameText1.setFont(new Font("NanumSquare", Font.PLAIN, 20));
		nameText1.setBorder(null);
		nameText1.setBackground(Color.WHITE);
		nameText1.setEditable(false);
		nameText1.setColumns(10);
		nameText1.setBounds(90, 158, 350, 26);
		contentPanel.add(nameText1);

		institutionText1.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		institutionText1.setBorder(null);
		institutionText1.setBackground(Color.WHITE);
		institutionText1.setEditable(false);
		institutionText1.setColumns(10);
		institutionText1.setBounds(90, 128, 300, 26);
		contentPanel.add(institutionText1);

		periodText1.setBorder(null);
		periodText1.setFocusable(false);
		periodText1.setDragEnabled(false);
		periodText1.setEditable(false);
		periodText1.setBounds(453, 138, 50, 26);
		periodText1.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		contentPanel.add(periodText1);
		periodText1.setColumns(10);

		idText2.setBorder(null);
		idText2.setColumns(10);
		idText2.setBounds(20, 238, 70, 26);
		contentPanel.add(idText2);

		nameText2.setBorder(null);
		nameText2.setFont(new Font("NanumSquare", Font.PLAIN, 20));
		nameText2.setColumns(10);
		nameText2.setBounds(90, 258, 350, 26);
		contentPanel.add(nameText2);

		institutionText2.setBorder(null);
		institutionText2.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		institutionText2.setColumns(10);
		institutionText2.setBounds(90, 228, 300, 26);
		contentPanel.add(institutionText2);

		periodText2.setFocusable(false);
		periodText2.setBorder(null);
		periodText2.setDragEnabled(false);
		periodText2.setEditable(false);
		periodText2.setBounds(453, 238, 50, 26);
		periodText2.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		contentPanel.add(periodText2);
		periodText2.setColumns(10);

		idText3.setBorder(null);
		idText3.setBounds(20, 338, 70, 26);
		contentPanel.add(idText3);
		idText3.setColumns(10);

		nameText3.setBorder(null);
		nameText3.setFont(new Font("NanumSquare", Font.PLAIN, 20));
		nameText3.setBounds(90, 358, 350, 26);
		contentPanel.add(nameText3);
		nameText3.setColumns(10);

		institutionText3.setBorder(null);
		institutionText3.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		institutionText3.setBounds(90, 328, 300, 26);
		contentPanel.add(institutionText3);
		institutionText3.setColumns(10);

		periodText3.setFocusable(false);
		periodText3.setBorder(null);
		periodText3.setDragEnabled(false);
		periodText3.setEditable(false);
		periodText3.setBounds(453, 338, 50, 26);
		periodText3.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		contentPanel.add(periodText3);
		periodText3.setColumns(10);

		idText4.setBorder(null);
		idText4.setColumns(10);
		idText4.setBounds(20, 438, 70, 26);
		contentPanel.add(idText4);

		nameText4.setBorder(null);
		nameText4.setFont(new Font("NanumSquare", Font.PLAIN, 20));
		nameText4.setColumns(10);
		nameText4.setBounds(90, 458, 350, 26);
		contentPanel.add(nameText4);

		institutionText4.setBorder(null);
		institutionText4.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		institutionText4.setColumns(10);
		institutionText4.setBounds(90, 428, 300, 26);
		contentPanel.add(institutionText4);

		periodText4.setFocusable(false);
		periodText4.setBorder(null);
		periodText4.setDragEnabled(false);
		periodText4.setEditable(false);
		periodText4.setBounds(453, 438, 50, 26);
		periodText4.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		contentPanel.add(periodText4);
		periodText4.setColumns(10);

		idText5.setBorder(null);
		idText5.setColumns(10);
		idText5.setBounds(20, 538, 70, 26);
		contentPanel.add(idText5);

		nameText5.setBorder(null);
		nameText5.setFont(new Font("NanumSquare", Font.PLAIN, 20));
		nameText5.setColumns(10);
		nameText5.setBounds(90, 558, 350, 26);
		contentPanel.add(nameText5);

		institutionText5.setBorder(null);
		institutionText5.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		institutionText5.setColumns(10);
		institutionText5.setBounds(90, 528, 300, 26);
		contentPanel.add(institutionText5);

		periodText5.setFocusable(false);
		periodText5.setBorder(null);
		periodText5.setDragEnabled(false);
		periodText5.setEditable(false);
		periodText5.setBounds(453, 538, 50, 26);
		periodText5.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		contentPanel.add(periodText5);
		periodText5.setColumns(10);

		idText6.setBorder(null);
		idText6.setColumns(10);
		idText6.setBounds(20, 638, 70, 26);
		contentPanel.add(idText6);

		nameText6.setBorder(null);
		nameText6.setFont(new Font("NanumSquare", Font.PLAIN, 20));
		nameText6.setColumns(10);
		nameText6.setBounds(90, 658, 350, 26);
		contentPanel.add(nameText6);

		institutionText6.setBorder(null);
		institutionText6.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		institutionText6.setColumns(10);
		institutionText6.setBounds(90, 628, 300, 26);
		contentPanel.add(institutionText6);

		periodText6.setFocusable(false);
		periodText6.setBorder(null);
		periodText6.setDragEnabled(false);
		periodText6.setEditable(false);
		periodText6.setBounds(453, 638, 50, 26);
		periodText6.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		contentPanel.add(periodText6);
		periodText6.setColumns(10);

		ImageIcon icon = new ImageIcon("C:\\Users\\SAMSUNG\\eclipse-workspace\\Workable\\src\\image\\prevBtn.png");
		Image previm = icon.getImage();
		Image previm2 = previm.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		ImageIcon icon2 = new ImageIcon(previm2);
		JButton prevBtn = new JButton(icon2);
		prevBtn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				pageIdx = Math.floorMod((pageIdx - 1), pageNum);
				listIdx = pageIdx * 6;
				settingText();

			}
		});
		prevBtn.setForeground(Color.ORANGE);
		prevBtn.setBorder(null);
		prevBtn.setBackground(Color.WHITE);
		prevBtn.setBounds(194, 720, 50, 50);
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
				listIdx = pageIdx * 6;
				settingText();

			}
		});
		nextBtn.setForeground(Color.ORANGE);
		nextBtn.setBorder(null);
		nextBtn.setBackground(Color.WHITE);
		nextBtn.setBounds(304, 720, 50, 50);
		contentPanel.add(nextBtn);

		JPanel topPanel = new JPanel();
		topPanel.setBorder(new LineBorder(new Color(0, 0, 0)));
		topPanel.setName("Workable");
		topPanel.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		topPanel.setToolTipText("Workable");
		topPanel.setBackground(new Color(255, 165, 0));
		topPanel.setBorder(new LineBorder(new Color(255, 165, 0)));
		topPanel.setBounds(0, 0, 560, 80);
		mainPanel.add(topPanel);
		topPanel.setLayout(null);

		JLabel topLabel = new JLabel("Education/ Training");
		topLabel.setBounds(0, 20, 560, 40);
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

		settingText();
	}

	public void settingText() {
		
		String idArr[] = new String[6];
		String nameArr[] = new String[6];
		String institutionArr[] = new String[6];
		String periodArr[] = new String[6];
		int idx;
		
		for (idx = 0; idx < 6; idx++) {
			idArr[idx] = String.valueOf(edList.get(listIdx).getEd_Id());
			nameArr[idx] = edList.get(listIdx).getEd_Name();
			institutionArr[idx] = edList.get(listIdx).getEd_Institution();
			periodArr[idx] = edList.get(listIdx++).getEd_Period();
			
			if(listIdx >= dataNum ) {
				idx = 6;
			}
		}
		

		idText1.setText(idArr[0]);
		nameText1.setText(nameArr[0]);
		institutionText1.setText(institutionArr[0]);
		periodText1.setText(periodArr[0]);

		idText2.setText(idArr[1]);
		nameText2.setText(nameArr[1]);
		institutionText2.setText(institutionArr[1]);
		periodText2.setText(periodArr[1]);
		
		idText3.setText(idArr[2]);
		nameText3.setText(nameArr[2]);
		institutionText3.setText(institutionArr[2]);
		periodText3.setText(periodArr[2]);

		idText4.setText(idArr[3]);
		nameText4.setText(nameArr[3]);
		institutionText4.setText(institutionArr[3]);
		periodText4.setText(periodArr[3]);

		idText5.setText(idArr[4]);
		nameText5.setText(nameArr[4]);
		institutionText5.setText(institutionArr[4]);
		periodText5.setText(periodArr[4]);

		idText6.setText(idArr[5]);
		nameText6.setText(nameArr[5]);
		institutionText6.setText(institutionArr[5]);
		periodText6.setText(periodArr[5]);

	}
}
