package com.singleton.implementations;

public class StaticEmpImpl {
	private int eid;
	private String ename;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	private static StaticEmpImpl empl;

	static {
		try {

			empl = new StaticEmpImpl();

		} catch (Exception e) {
			throw new RuntimeException("Exception has occured in creating static block");

		}
	}

	public static StaticEmpImpl getInstance() {
		return empl;

	}

	private StaticEmpImpl() {

	}

}