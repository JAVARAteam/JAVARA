package Workable;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class em_info {

	private Connection conn;
	private static final String USERNAME = "root";// DBMS접속 시 아이디
	private static final String PASSWORD = "1234";// DBMS접속 시 비밀번호
	private static final String URL = "jdbc:mysql://localhost:3306/workable";

	public em_info() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		} catch (Exception e) {
			System.out.println("드라이버 로딩 실패 ");
			try {
				conn.close();
			} catch (SQLException e1) {
			}
		}
	}

	public ArrayList<employmentInfo> selectByOne(String region) {

		String sql = "select * from employment where `사업장 주소` like " + region;

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple(ArrayList<String> region) {
		String sql = "select * from employment where (";
		String likeStr = " `사업장 주소` like ";
		int lastIdx = region.size() - 1;

		for (int i = 0; i < lastIdx; i++) {
			sql = sql + likeStr + region.get(i) + " OR";
		}
		sql = sql + likeStr + region.get(lastIdx) + ")";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	public ArrayList<employmentInfo> selectByOne1(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '충북지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple1(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '충북지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	public ArrayList<employmentInfo> selectByOne2(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '충남지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple2(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '충남지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	public ArrayList<employmentInfo> selectByOne3(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '경북지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple3(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '경북지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	public ArrayList<employmentInfo> selectByOne4(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '경남지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple4(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '경남지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	public ArrayList<employmentInfo> selectByOne5(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '전북지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple5(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '전북지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	
	public ArrayList<employmentInfo> selectByOne6(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '전남지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple6(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '전남지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	
	public ArrayList<employmentInfo> selectByOne7(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '대전지역본부'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple7(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '대전지역본부'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	
	public ArrayList<employmentInfo> selectByOne8(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '인천지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple8(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '인천지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	
	public ArrayList<employmentInfo> selectByOne9(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '대구지역본부'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple9(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '대구지역본부'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	
	public ArrayList<employmentInfo> selectByOne10(String mapSearch) {
		String sql = "select * from employment where `담당기관` = '부산지역본부'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple10(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '부산지역본부'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	
	public ArrayList<employmentInfo> selectByOne11(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '제주지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple11(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '제주지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	
	public ArrayList<employmentInfo> selectByOne12(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '서울지역본부'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple12(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '서울지역본부'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	
	public ArrayList<employmentInfo> selectByOne13(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '울산지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple13(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '울산지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	
	public ArrayList<employmentInfo> selectByOne14(String mapSearch) {
		String sql = "select * from employment where `담당기관` = '경기지역본부'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple14(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '경기지역본부'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	
	public ArrayList<employmentInfo> selectByOne15(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '광주지역본부'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple15(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '광주지역본부'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	
	public ArrayList<employmentInfo> selectByOne16(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '강원지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple16(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '강원지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	
	public ArrayList<employmentInfo> selectByOne17(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '서울북부지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple17(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '서울북부지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	
	public ArrayList<employmentInfo> selectByOne18(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '서울남부지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple18(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '서울남부지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	
	public ArrayList<employmentInfo> selectByOne19(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '서울동부지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple19(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '서울동부지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	
	public ArrayList<employmentInfo> selectByOne20(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '경기서부지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple20(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '경기서부지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	
	public ArrayList<employmentInfo> selectByOne21(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '경기북부지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple21(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '경기북부지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	
	public ArrayList<employmentInfo> selectByOne22(String mapSearch) {

		String sql = "select * from employment where `담당기관` = '경기동부지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}

	public ArrayList<employmentInfo> selectByMultiple22(ArrayList<String> mapSearch) {
		String sql = "select * from employment where `담당기관` = '경기동부지사'";

		ArrayList<employmentInfo> emList = new ArrayList<>();
		PreparedStatement pstmt = null;
		try {
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				employmentInfo em = new employmentInfo();
				em.setId(rs.getInt("연번"));
				em.setApplyDate(rs.getString("구인신청일자"));
				em.setPeriod(rs.getString("모집기간"));
				em.setCompanyName(rs.getString("사업장명"));
				em.setDuty(rs.getString("모집직종"));
				em.setTypeOfEmployment(rs.getString("고용형태"));
				em.setTypeOfPay(rs.getString("임금형태"));
				em.setPay(rs.getString("임금"));
				em.setTypeOfJoin(rs.getString("입사형태"));
				em.setReqCareer(rs.getString("요구경력"));
				em.setReqEdu(rs.getString("요구학력"));
				em.setMajor(rs.getString("전공계열"));
				em.setReqLicense(rs.getString("요구자격증"));
				em.setAddress(rs.getString("사업장 주소"));
				em.setTypeOfCompany(rs.getString("기업형태"));
				em.setInstitution(rs.getString("담당기관"));
				em.setContact(rs.getString("연락처"));
				emList.add(em);
			}
			for(int i=0;i<emList.size();i++) {
				employmentInfo dd = new employmentInfo();
				System.out.println(dd.getAddress());
			}

		} catch (Exception e) {
			System.out.println("select 메서드 예외발생");
		} finally {
			try {
				if (pstmt != null && !pstmt.isClosed()) {
					pstmt.close();
				}
			} catch (Exception e2) {
			}
		}
		return emList;
	}
	
}