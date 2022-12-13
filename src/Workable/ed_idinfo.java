package Workable;

import java.util.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ed_idinfo {
	private int ed_id;
	private String ed_name;
	private String ed_period;
	private String ed_target;
	private String ed_institution;
	

	public int getEd_Id() {
		return ed_id;
	}

	public void setEd_Id(int ed_id) {
		this.ed_id = ed_id;
	}

	public String getEd_Name() {
		return ed_name;
	}

	public void setEd_Name(String ed_name) {
		this.ed_name = ed_name;
	}

	public String getEd_Period() {
		return ed_period;
	}

	public void setEd_Period(String ed_period) {
		this.ed_period = ed_period;
	}

	public String geted_target() {
		return ed_target;
	}

	public void seted_target(String ed_target) {
		this.ed_target = ed_target;
	}

	public String getEd_Institution() {
		return ed_institution;
	}

	public void setEd_Institution(String ed_institution) {
		this.ed_institution = ed_institution;
	}

	public void ed_showInfo() {
		System.out.printf("%d %s %s %s %s", ed_id, ed_name, ed_target, ed_institution, ed_period);
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(ed_id).append("\t").append(ed_name).append("\t").append(ed_institution).append("\t").append(ed_period);
		return builder.toString();

	}
}
