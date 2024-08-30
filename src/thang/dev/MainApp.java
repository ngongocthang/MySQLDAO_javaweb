package thang.dev;

import thang.dev.data.dao.CategoryDao;
import thang.dev.data.impl.CategoryImpl;
import thang.dev.data.model.Category;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CategoryDao categoryDao = new CategoryImpl();
		Category cat = new Category(12, "Ao", "https://ao.png");
//		categoryDao.insert(cat);
		
		Category find = categoryDao.find(12);
//		System.out.println(find.name);
		
		find.name = "Ao abc";
//		categoryDao.update(find);
		
		categoryDao.delete(12);
	}
}