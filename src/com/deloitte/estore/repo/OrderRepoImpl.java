package com.deloitte.estore.repo;

import java.sql.SQLException;
import java.util.List;

import com.deloitte.estore.model.Order;

public class OrderRepoImpl implements OrderRepo {

	@Override
	public boolean addOrder(Order Order) throws SQLException {
		return false;
	}
	@Override
	public boolean deleteOrder(Order Order) throws SQLException {
		return false;
	}

	@Override
	public boolean updateOrder(Order Order) throws SQLException {
		return false;
	}

	@Override
	public Order getOrderById(int orderId) throws SQLException {
		return null;
	}

	@Override
	public List<Order> getAllOrders() throws SQLException {
		return null;
	}

}