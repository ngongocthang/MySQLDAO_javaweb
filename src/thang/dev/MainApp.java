package thang.dev;

import thang.dev.data.dao.CategoryDao;
import thang.dev.data.dao.Database;
import thang.dev.data.dao.DatabaseDao;
import thang.dev.data.dao.OrderDao;
import thang.dev.data.dao.OrderItemDao;
import thang.dev.data.dao.ProductDao;
import thang.dev.data.dao.UserDao;
import thang.dev.data.impl.CategoryImpl;
import thang.dev.data.impl.OrderImpl;
import thang.dev.data.impl.OrderItemImpl;
import thang.dev.data.impl.ProductImpl;
import thang.dev.data.impl.UserImpl;
import thang.dev.data.model.Category;
import thang.dev.data.model.Order;
import thang.dev.data.model.OrderItem;
import thang.dev.data.model.Product;
import thang.dev.data.model.User;

public class MainApp {

	public static void main(String[] args) {
		// Khởi tạo DatabaseDao với một thể hiện mới của Database
		DatabaseDao.init(new Database());

		// Sử dụng CategoryDao để thực hiện các action
//		CategoryDao categoryDao = DatabaseDao.getInstance().getCategoryDao();
//
//		Category cat = new Category(1, "Ao nu", "https://singleton.png");
//		categoryDao.insert(cat);

//		Category find = categoryDao.find(2);
//		System.out.println("Tên danh mục: " + find.name);

//		find.name = "Ao nu";
//		categoryDao.update(find);

//		categoryDao.delete(14);

//		UserDao userDao = new UserImpl();
//		User user = new User(1, "user@gmail.com", "123", "user");
////		userDao.insert(user);
//
//		User findUser = userDao.find(2);
////		System.out.println("Email người dùng: " + findUser.email);
//
//		findUser.email = "admin@gmail.com";
//		findUser.role = "admin";
//		userDao.update(findUser);

//		userDao.delete(12);

//		  ProductDao productDao = new ProductImpl(); 
////		  Product pro = new Product(1, "T-shirt", "https://ao.png", "des pro 1", 1, 2, 1, 1, null);
////		  productDao.insert(pro);
//		  
//		  Product findProduct = productDao.find(1); 
//		  System.out.println("Tên sản phẩm: "+ findProduct.name);
////		  
//		  findProduct.name = "T-shirt men"; 
//		  productDao.update(findProduct);

//		  productDao.delete(12);

//		OrderDao orderDao = new OrderImpl();
//		 Order order = new Order(1, "code", "paid", 1, null); 
//		 orderDao.insert(order);

//		Order findOrder = orderDao.find(1);
//		 System.out.println("Trạng thái đơn hàng: " + findOrder.status);
//		 
//		findOrder.status = "canceled";
//		orderDao.update(findOrder);
//		 
//		 orderDao.delete(1); }

		
		  OrderItemDao orderItemDao = new OrderItemImpl(); 
		  OrderItem orderItem = new OrderItem(1, 3, 2, 1, 1); 
//		  orderItemDao.insert(orderItem);
		 
		  OrderItem findOrderItem = orderItemDao.find(1);
//		  System.out.println("ID sản phẩm trong mục đơn hàng: " + findOrderItem.product_id);
//		  
		  findOrderItem.product_id = 3; 
		  orderItemDao.update(findOrderItem);
//		  
//		  orderItemDao.delete(1); 
		 
	}
}
