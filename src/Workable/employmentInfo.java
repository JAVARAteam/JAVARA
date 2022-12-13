package Workable;

public class employmentInfo {
	private int id; // 연번
	private String applyDate; // 구인신청일자
	private String period; // 모집기간
	private String companyName; // 사업장명
	private String duty; // 모집직종
	private String typeOfEmployment; // 고용형태
	private String typeOfPay; // 임금형태
	private String pay; // 임금
	private String typeOfJoin; // 입사형태
	private String reqCareer; // 요구경력
	private String reqEdu; // 요구학력
	private String major; // 전공계열
	private String reqLicense; // 요구자격증
	private String address; // 사업장 주소
	private String typeOfCompany; // 기업형태
	private String institution; // 담당기관
	private String contact; // 연락처
	private String page;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApplyDate() {
		return applyDate;
	}

	public void setApplyDate(String applyDate) {
		this.applyDate = applyDate;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getDuty() {
		return duty;
	}

	public void setDuty(String duty) {
		this.duty = duty;
	}

	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}

	public void setTypeOfEmployment(String typeOfEmployment) {
		this.typeOfEmployment = typeOfEmployment;
	}

	public String getTypeOfPay() {
		return typeOfPay;
	}

	public void setTypeOfPay(String typeOfPay) {
		this.typeOfPay = typeOfPay;
	}

	public String getPay() {
		return pay;
	}

	public void setPay(String pay) {
		this.pay = pay;
	}

	public String getTypeOfJoin() {
		return typeOfJoin;
	}

	public void setTypeOfJoin(String typeOfJoin) {
		this.typeOfJoin = typeOfJoin;
	}

	public String getReqCareer() {
		return reqCareer;
	}

	public void setReqCareer(String reqCareer) {
		this.reqCareer = reqCareer;
	}

	public String getReqEdu() {
		return reqEdu;
	}

	public void setReqEdu(String reqEdu) {
		this.reqEdu = reqEdu;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getReqLicense() {
		return reqLicense;
	}

	public void setReqLicense(String reqLicense) {
		this.reqLicense = reqLicense;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTypeOfCompany() {
		return typeOfCompany;
	}

	public void setTypeOfCompany(String typeOfCompany) {
		this.typeOfCompany = typeOfCompany;
	}

	public String getInstitution() {
		return institution;
	}

	public void setInstitution(String institution) {
		this.institution = institution;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getpage() {
		return page;
	}

	public void setpage(String page) {
		this.page = page;
	}

	public String toString() {
		return getCompanyName() + getAddress() + getPeriod() + getPay() + getInstitution() + getContact();
	}

}