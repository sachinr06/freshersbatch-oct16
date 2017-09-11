package SpringHibernateApplicationTest.SpringHibernateApplication.dao;

import java.util.List;

import SpringHibernateApplicationTest.SpringHibernateApplication.entity.Category;

public interface CategoryDao {
	public List<Category> getAllCategories();
}
