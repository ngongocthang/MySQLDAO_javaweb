package thang.dev.data.model;

import java.sql.Timestamp;

public class Order {
	public int id;
	public String code;
	public String status;
	public int user_id;
	private Timestamp createdAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Order(int id, String code, String status, int user_id, Timestamp createdAt) {
		super();
		this.id = id;
		this.code = code;
		this.status = status;
		this.user_id = user_id;
		this.createdAt = createdAt;
	}
	public Order(String code, String status, int user_id, Timestamp createdAt) {
		super();
		this.code = code;
		this.status = status;
		this.user_id = user_id;
		this.createdAt = createdAt;
	}
	

}
