package thang.dev.data.model;

import java.sql.Timestamp;

public class Product {
	public int id;
	public String name;
	public String thumbnail;
	public String description;
	public double price;
	public int quantity;
	public int view;
	public int category_id;
	public Timestamp createdAt;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getThumbnail() {
		return thumbnail;
	}
	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getView() {
		return view;
	}
	public void setView(int view) {
		this.view = view;
	}
	public int getCategory_id() {
		return category_id;
	}
	public void setCategory_id(int category_id) {
		this.category_id = category_id;
	}
	public Timestamp getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}
	public Product(int id, String name, String thumbnail, String description, double price, int quantity, int view,
			int category_id, Timestamp createdAt) {
		super();
		this.id = id;
		this.name = name;
		this.thumbnail = thumbnail;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.view = view;
		this.category_id = category_id;
		this.createdAt = createdAt;
	}
	public Product(String name, String thumbnail, String description, double price, int quantity, int view,
			int category_id, Timestamp createdAt) {
		super();
		this.name = name;
		this.thumbnail = thumbnail;
		this.description = description;
		this.price = price;
		this.quantity = quantity;
		this.view = view;
		this.category_id = category_id;
		this.createdAt = createdAt;
	}

}
