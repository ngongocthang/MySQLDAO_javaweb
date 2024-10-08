package thang.dev.data.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import thang.dev.data.dao.CategoryDao;
import thang.dev.data.driver.MySQLDriver;
import thang.dev.data.model.Category;

public class CategoryImpl implements CategoryDao {
	@Override
	public boolean insert(Category category) {
		String sql = "INSERT INTO CATEGORIES(NAME, THUMBNAIL) VALUES(?, ?)";
		try {
			Connection conn = MySQLDriver.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, category.name);
			stmt.setString(2, category.thumbnail);

			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;

		}
		return true;
	}

	@Override
	public boolean update(Category category) {
		String sql = "UPDATE CATEGORIES SET name = ?, thumbnail = ? WHERE id = ?";
		try {
			Connection conn = MySQLDriver.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, category.name);
			stmt.setString(2, category.thumbnail);
			stmt.setInt(3, category.id);
//			stmt.setInt(3, 12);

			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public boolean delete(int id) {
		String sql = "DELETE FROM CATEGORIES WHERE ID = ?";
		try {
			Connection conn = MySQLDriver.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);

			stmt.execute();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Category find(int id) {
		// TODO Auto-generated method stub
		String sql = "SELECT * FROM CATEGORIES WHERE ID = ?";
		try {
			Connection conn = MySQLDriver.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);

			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				String name = rs.getString("name");
				String thumbnail = rs.getString("thumbnail");

				return new Category(id, name, thumbnail);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Category> findAll() {
		List<Category> categoryList = new ArrayList<Category>();
		String sql = "SELECT * FROM CATEGORIES";
		try {
			Connection conn = MySQLDriver.getInstance().getConnection();
			PreparedStatement stmt = conn.prepareStatement(sql);
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				int id = rs.getInt("id");
				String name = rs.getString("name");
				String thumbnail = rs.getString("thumbnail");
				categoryList.add(new Category(id, name, thumbnail));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return categoryList;
	}

}
