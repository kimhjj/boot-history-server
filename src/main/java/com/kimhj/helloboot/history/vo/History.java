package com.kimhj.helloboot.history.vo;

public class History {
	private int timeMillies;
	private String url;
	private String param;
	private String resp;
	
	
	public int getTimeMillies() {
		return timeMillies;
	}
	public void setTimeMillies(int timeMillies) {
		this.timeMillies = timeMillies;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getParam() {
		return param;
	}
	public void setParam(String param) {
		this.param = param;
	}
	public String getResp() {
		return resp;
	}
	public void setResp(String resp) {
		this.resp = resp;
	}
}
