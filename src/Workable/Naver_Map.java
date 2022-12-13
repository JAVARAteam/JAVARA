package Workable;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class Naver_Map{
	public static String[] array;
	JTextField address;
	JLabel resAddress, resX, resY, jibunAddress,la1,la2,la3,la4,la5,la6;
	JLabel imageLabel;
	ArrayList<AddressVO> ad = new ArrayList<>();
	ArrayList<employmentInfo> emList = new ArrayList<>();


	public void initGUI()  {
		JFrame frm = new JFrame("Map View"); 
		frm.setPreferredSize(new Dimension(560, 900)); 
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // �������� X Ŭ�� �� ����.
		Container c = frm.getContentPane(); // JFrame ���� ����.

		imageLabel = new JLabel("View Map"); // JFrame ���� ���� ��ܿ� �� ��������
		JPanel pan = new JPanel();
		pan.setBackground(Color.WHITE);
		pan.setBorder(new LineBorder(new Color(255, 165, 0)));
		pan.setBounds(0, 160, 560, 710);
		JLabel addressLbl = new JLabel("Enter your address");
		addressLbl.setFont(new Font("NanumSquare", Font.PLAIN, 15));// JFrame ���� ���� ��ܿ� �� �ּ��Է�
		address = new JTextField(30);
		JButton btn = new JButton("Click"); // JFrame ���� ������ �� Ŭ�� ��ư
		JButton btn1 = new JButton("next");
		JButton btn2 = new JButton("back");
		pan.add(addressLbl);
		pan.add(address);
		pan.add(btn);
		//btn.addActionListener(new NaverMap(this)); // pan�� ������ ��ư(btn) Ŭ�� �� ó���ϴ� �̺�Ʈ �ڵ鷯.

		JPanel pan1 = new JPanel();
		
		//DefaultTableModel model = new DefaultTableModel(header, labels);
		//JTable table = new JTable(model);
		//JScrollPane scroll = new JScrollPane(table);
		//scroll.setPreferredSize(new Dimension(400, 200));
		
		pan1.setLayout(new GridLayout(12, 1)); // ���� �ϴ� �׸��� 4�� 1���� ����
		
		resAddress = new JLabel("Company name"); // �׸��� 1�࿡ �� ���θ�
		jibunAddress = new JLabel("Company Address"); // �׸��� 2�࿡ �� �����ּ�
		resX = new JLabel("Recruitment period"); // �׸��� 3�࿡ �� �浵
		resY = new JLabel("pay");
		la1 = new JLabel("the agency in charge");
		la2= new JLabel("Phone number");
		resAddress.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		jibunAddress.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		resX.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		resY.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		la1.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		la2.setFont(new Font("NanumSquare", Font.PLAIN, 15));
		
		pan1.setBackground(Color.WHITE);
		// �׸��� 4�࿡ �� ����
		pan1.add(resAddress);
		pan1.add(jibunAddress);
		pan1.add(resX);
		pan1.add(resY);
		pan1.add(la1);
		pan1.add(la2);
		
		//btn1.setBounds(30, 170, )
		pan1.add(btn1);
		pan1.add(btn2);
		//pan1.add(scroll);

		c.add(BorderLayout.NORTH, pan); // ��� pan ����
		c.add(BorderLayout.CENTER, imageLabel); // ���� imageLabel ����
		c.add(BorderLayout.SOUTH, pan1); // �ϴ� pan1 ����

		frm.setSize(500, 650);
		frm.setVisible(true);

	}

	public static void main(String[] args) {
		new Naver_Map().initGUI();
	}
}