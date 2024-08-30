package thang.dev.data.dao;

import java.util.List;

import thang.dev.data.model.OrderItem;

public interface OrderItemDao {
	public boolean insert(OrderItem orderItem);
	public boolean update(OrderItem orderItem);
	public boolean delete(int id);
	public OrderItem find(int id);
	public List<OrderItem> findAll();
}
