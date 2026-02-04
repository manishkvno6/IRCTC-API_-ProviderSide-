package com.nandrekha.dto;

public class Ticket {

	private Integer PNR;
	private String from;
	private String to;
	private String date;
	private Integer trainNo;
	private String coachClass;
	private String pname;
	private Integer passage;
	private String pemail;
	private String status;

	public Integer getPNR() {
		return PNR;
	}

	public void setPNR(Integer pNR) {
		PNR = pNR;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getTrainNo() {
		return trainNo;
	}

	public void setTrainNo(Integer trainNo) {
		this.trainNo = trainNo;
	}

	public String getCoachClass() {
		return coachClass;
	}

	public void setCoachClass(String coachClass) {
		this.coachClass = coachClass;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getPassage() {
		return passage;
	}

	public void setPassage(Integer passage) {
		this.passage = passage;
	}

	public String getPemail() {
		return pemail;
	}

	public void setPemail(String pemail) {
		this.pemail = pemail;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
