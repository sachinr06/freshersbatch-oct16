package SpringHibernateApplicationTest.SpringHibernateApplication.dao;

import java.util.List;

import org.springframework.orm.hibernate4.support.HibernateDaoSupport;

import SpringHibernateApplicationTest.SpringHibernateApplication.entity.Category;

public class CategoryDaoImpl extends HibernateDaoSupport implements CategoryDao {

	public List<Category> getAllCategories() {

	 List<Category> list= (List<Category>) getHibernateTemplate().find("select name from Category");
	 return list;
	}

}