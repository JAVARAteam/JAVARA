package workable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;

import org.json.JSONArray;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.json.simple.parser.JSONParser;

public class Project_D {
	public static void main(String[] args) {
		// �ּ� �Է� -> ����, �浵 ��ǥ ����.
		BufferedReader io = new BufferedReader(new InputStreamReader(System.in));	
		String clientId = "t4seiucvic";
		String clientSecret = "t0sFUBHY4xYJm4IADSDta2wQeZJ1i4axOIyvRBFE";
		
		try {
			System.out.println("�ּҸ� �Է����ּ��� : ");
			
			String address = io.readLine();
			String addr = URLEncoder.encode(address, "UTF-8");
			
			// Geocoding ���信 �����ִ� API URL �Է�.
			String apiURL = "https://naveropenapi.apigw.ntruss.com/map-geocode/v2/geocode?query=" + addr;	// JSON
			
			URL url = new URL(apiURL);
			HttpURLConnection con = (HttpURLConnection) url.openConnection();
			con.setRequestMethod("GET");
			
			// Geocoding ���信 �����ִ� ��û ��� �Է�.
			con.setRequestProperty("X-NCP-APIGW-API-KEY-ID", clientId);
			con.setRequestProperty("X-NCP-APIGW-API-KEY", clientSecret);
			
			// ��û ��� Ȯ��. ���� ȣ���� ��� 200
			int responseCode = con.getResponseCode();
			
			BufferedReader br;
			
			if (responseCode == 200) {
				br = new BufferedReader(new InputStreamReader(con.getInputStream(), "UTF-8"));
			} else {
				br = new BufferedReader(new InputStreamReader(con.getErrorStream()));
			}
			
			String inputLine;
			
			StringBuffer response = new StringBuffer();
			
			while((inputLine = br.readLine()) != null) {
				response.append(inputLine);
			}
			
			br.close();
			
			JSONTokener tokener = new JSONTokener(response.toString());
			JSONObject object = new JSONObject(tokener);			
			JSONArray arr = object.getJSONArray("addresses");
			
			for (int i = 0; i < arr.length(); i++) {
				JSONObject temp = (JSONObject) arr.get(i);
				System.out.println("address : " + temp.get("roadAddress"));
				System.out.println("jibunAddress : " + temp.get("jibunAddress"));
				System.out.println("���� : " + temp.get("y"));
				System.out.println("�浵 : " + temp.get("x"));
			}
			
			// JSON.simple ����� ��� �Ʒ��� ���� ����.
			/*JSONParser jpr = new JSONParser();
			JSONObject jarr = (JSONObject) jpr.parse(response.toString());
			JSONArray arr2 = (JSONArray) jarr.get("addresses");
			
			for (int i = 0; i < arr2.length(); i++) {
				JSONObject temp = (JSONObject) arr.get(i);
				System.out.println("address : " + temp.get("roadAddress"));
				System.out.println("jibunAddress : " + temp.get("jibunAddress"));
				System.out.println("���� : " + temp.get("y"));
				System.out.println("�浵 : " + temp.get("x"));
			}*/
		
		} catch (Exception  e) {
			System.out.println(e);
		}
	}
}