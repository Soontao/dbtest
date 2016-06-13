package org.uestc.suntao.dbtest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.servlet.http.HttpServletRequest;

@Entity
@Table(name = "publisher")
public class Publisher {
	@Id
	@GeneratedValue
	Integer id;
	String pubname;
	String phone;
	String address;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPubname() {
		return pubname;
	}

	public void setPubname(String pubname) {
		this.pubname = pubname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Publisher(Integer id, String pubname, String phone, String address) {
		super();
		this.id = id;
		this.pubname = pubname;
		this.phone = phone;
		this.address = address;
	}

	public Publisher() {
		// TODO Auto-generated constructor stub
	}

	public Publisher(HttpServletRequest request) {
		setId(!request.getParameter("id").isEmpty() ? Integer.parseInt(request.getParameter("id")) : null);
		setPubname(request.getParameter("pubname"));
		setPhone(request.getParameter("phone"));
		setAddress(request.getParameter("address"));
	}
}
