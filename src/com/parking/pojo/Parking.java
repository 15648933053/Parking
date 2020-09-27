package com.parking.pojo;

import java.sql.Time;
import java.util.Date;

public class Parking {

	private String username;
	private String carnum;
	private Date begintime;
	private Date endtime;
	private Time totaltime;
	private int money;
	private int is_delete;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCarnum() {
		return carnum;
	}
	public void setCarnum(String carnum) {
		this.carnum = carnum;
	}
	public Date getBegintime() {
		return begintime;
	}
	public void setBegintime(Date begintime) {
		this.begintime = begintime;
	}
	public Date getEndtime() {
		return endtime;
	}
	public void setEndtime(Date endtime) {
		this.endtime = endtime;
	}
	public Time getTotaltime() {
		return totaltime;
	}
	public void setTotaltime(Time totaltime) {
		this.totaltime = totaltime;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getIs_delete() {
		return is_delete;
	}
	public void setIs_delete(int is_delete) {
		this.is_delete = is_delete;
	}
	
}
