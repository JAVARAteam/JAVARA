package workable;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Naver_Map {
	JTextField address;
	JLabel resAddress, resX, resY, jibunAddress;
	JLabel imageLabel;
	private final String[] labels= {"회사명","주소","모집기간","근무형태","임금","전화번호"};
	
	public void initGUI() {
		JFrame frm = new JFrame("Map View"); // 프레임 생성
		frm.setPreferredSize(new Dimension(560, 900)); //프레임 크기 조정
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 프레임의 X 클릭 시 종료.
		Container c = frm.getContentPane(); // JFrame 안쪽 영역.

		imageLabel = new JLabel("지도보기"); // JFrame 안쪽 영역 상단에 들어갈 지도보기
		JPanel pan = new JPanel();
		JLabel addressLbl = new JLabel("주소입력"); // JFrame 안쪽 영역 상단에 들어갈 주소입력
		address = new JTextField(30);
		JButton btn = new JButton("클릭"); // JFrame 안쪽 영역에 들어갈 클릭 버튼
	

		pan.add(addressLbl);
		pan.add(address);
		pan.add(btn);
		btn.addActionListener(new NaverMap(this)); // pan에 생성한 버튼(btn) 클릭 시 처리하는 이벤트 핸들러.

		JPanel pan1 = new JPanel();
		pan1.setLayout(new GridLayout(12, 1));
		resAddress = new JLabel("Company name"); // 그리드 1행에 들어갈 도로명
		jibunAddress = new JLabel("Company Address"); // 그리드 2행에 들어갈 지번주소
		resX = new JLabel("Recruitment period"); // 그리드 3행에 들어갈 경도
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
		// 그리드 4행에 들어갈 위도
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

		c.add(BorderLayout.NORTH, pan); // 상단 pan 세팅
		c.add(BorderLayout.CENTER, imageLabel); // 센터 imageLabel 세팅
		c.add(BorderLayout.SOUTH, pan1); // 하단 pan1 세팅

		frm.setSize(500, 650);
		frm.setVisible(true);

	}

	public static void main(String[] args) {
		new Naver_Map().initGUI();
	}
}
