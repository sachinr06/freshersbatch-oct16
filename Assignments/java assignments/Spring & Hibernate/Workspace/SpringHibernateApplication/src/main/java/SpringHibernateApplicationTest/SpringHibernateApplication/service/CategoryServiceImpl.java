package SpringHibernateApplicationTest.SpringHibernateApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import SpringHibernateApplicationTest.SpringHibernateApplication.dao.CategoryDao;
import SpringHibernateApplicationTest.SpringHibernateApplication.entity.Category;



public class CategoryServiceImpl implements CategoryService{
	@Autowired
	CategoryDao categoryDao;

	public List<Category> getAllCategories() {
		// TODO Auto-generated method stub
		return categoryDao.getAllCategories();
	}

}
