package Workable;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;

import javax.swing.ImageIcon;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;

public class NaverMap implements ActionListener {
	mapSearchUI naverMap;

	public NaverMap(mapSearchUI naverMap) {
		this.naverMap = naverMap;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String clientId = "t4seiucvic";
		String clientSecret = "t0sFUBHY4xYJm4IADSDta2wQeZJ1i4axOIyvRBFE";
		AddressVO vo = null;
		employmentInfo em = new employmentInfo();
		ArrayList<employmentInfo> emList = new ArrayList<employmentInfo>();
		try {
			String address = naverMap.search.getText();
			String addr = URLEncoder.encode(address, "UTF-8");
			String apiURL = "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=" + addr;
			URL url = new URL(apiURL);

			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientId);
			con.setRequestProperty("X-NCP-APIGW-API-KEY", clientSecret);

			int responseCode = con.getResponseCode();
			BufferedReader br;
			if (responseCode == 200) {
				br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			} else {
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}

			String inputLine;
			StringBuffer response = new StringBuffer();
			while ((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			br.close();

			JSONTokener tokener = new JSONTokener(response.toString());
			JSONObject object = new JSONObject(tokener);
			System.out.println(object);

			JSONArray arr = object.getJSONArray("addresses");
			for (int i = 0; i < arr.length(); i++) {
				JSONObject temp = (JSONObject) arr.get(i);
				vo = new AddressVO();
				vo.setRoadAddress((String) temp.get("roadAddress"));
				vo.setJibunAddress((String) temp.get("jibunAddress"));
				vo.setX((String) temp.get("x"));
				vo.setY((String) temp.get("y"));
				System.out.println(vo.toString());
			}

			map_service(vo, em);
		} catch (Exception err) {
			System.out.println(err);
		}
	}

	public void map_service(AddressVO vo, employmentInfo em) {
		String URL_STATICMAP = "https://naveropenapi.apigw.ntruss.com/map-static/v2/raster?";
		ArrayList<employmentInfo> emList = new ArrayList<employmentInfo>();
		employmentInfo ed3 = new employmentInfo();
		try {
			String pos = URLEncoder.encode(vo.getX() + " " + vo.getY(), "UTF-8");
			URL_STATICMAP += "center=" + vo.getX() + "," + vo.getY();
			URL_STATICMAP += "&level=16&w=700&h=500";
			URL_STATICMAP += "&markers=type:t|size:mid|pos:" + pos + "|label:"
					+ URLEncoder.encode(vo.getRoadAddress(), "UTF-8");

			URL url = new URL(URL_STATICMAP);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			con.setRequestProperty("X-NCP-APIGW-API-KEY-ID", "t4seiucvic");
			con.setRequestProperty("X-NCP-APIGW-API-KEY", "t0sFUBHY4xYJm4IADSDta2wQeZJ1i4axOIyvRBFE");

			int responseCode = con.getResponseCode();
			BufferedReader br;

			// ����ȣ���� ���.
			if (responseCode == 200) {
				InputStream is = con.getInputStream();

				int read = 0;
				byte[] bytes = new byte[1024];

				// ���� ���ϸ����� ���� ����
				String tempName = Long.valueOf(new Date().getTime()).toString();
				File file = new File(tempName + ".jpg"); // ���� ����.

				file.createNewFile();

				OutputStream out = new FileOutputStream(file);

				while ((read = is.read(bytes)) != -1) {
					out.write(bytes, 0, read); // ���� �ۼ�
				}

				is.close();
				ImageIcon img = new ImageIcon(file.getName());
				naverMap.mapLabel.setIcon(img);
				StringTokenizer st = new StringTokenizer(vo.toString());
				em.setpage(st.nextToken());
				emList.add(em);
				for (int k = 0; k < emList.size(); k++) {
					employmentInfo tmp = emList.get(k);
					String str2 = tmp.getpage();
					if (str2.equals("충청북도")) {
						naverMap.setEmList();
					}else if(str2.equals("충청남도")) {
						naverMap.setEmList1();
					}else if(str2.equals("경상북도")) {
						naverMap.setEmList2();
					}else if(str2.equals("경상남도")) {
						naverMap.setEmList3();
					}else if(str2.equals("전라북도")) {
						naverMap.setEmList4();
					}else if(str2.equals("전라남도")) {
						naverMap.setEmList5();
					}else if(str2.equals("대전광역시")) {
						naverMap.setEmList6();
					}else if(str2.equals("인천광역시")) {
						naverMap.setEmList7();
					}else if(str2.equals("대구광역시")) {
						naverMap.setEmList8();
					}else if(str2.equals("부산광역시")) {
						naverMap.setEmList9();
					}else if(str2.equals("제주특별자치도")) {
						naverMap.setEmList10();
					}else if(str2.equals("서울특별시")) {
						naverMap.setEmList11();
					}else if(str2.equals("울산광역시")) {
						naverMap.setEmList12();
					}else if(str2.equals("경기도")) {
						naverMap.setEmList13();
					}else if(str2.equals("광주광역시")) {
						naverMap.setEmList14();
					}else if(str2.equals("강원도")) {
						naverMap.setEmList15();
					}else if(str2.equals("서울북부지사")) {
						naverMap.setEmList16();						
					}else if(str2.equals("서울동부지사")) {
						naverMap.setEmList17();
					}else if(str2.equals("서울남부지사")) {
						naverMap.setEmList18();
					}else if(str2.equals("경기서부지사")) {
						naverMap.setEmList19();
					}else if(str2.equals("경기북부지사")) {
						naverMap.setEmList20();
					}else if(str2.equals("경기동부지사")) {
						naverMap.setEmList21();
					}else {
						System.out.println("오류");
					}
				}
			} else {
				System.out.println(responseCode);
			}

		} catch (Exception e) {
			System.out.println(e);
		}

	}
}