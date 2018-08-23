package com.qolsys.onlineshopping.daoImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.qolsys.onlineshopping.dao.CategoryDao;
import com.qolsys.onlineshopping.dao.ProductDao;
import com.qolsys.onlineshopping.dto.Category;
import com.qolsys.onlineshopping.dto.Product;

@Repository("productDao")
@Transactional
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory sessionfactory;

	@Override
	public List<Product> list() {
		 String selectactiveProduct="from Product where active = :active";
		   
		   Query query=sessionfactory.getCurrentSession().createQuery(selectactiveProduct);
		   sessionfactory.getCurrentSession().createCriteria(Product.class);
		query.setParameter("active",true);


		return query.list();
	}

	@Override
	public Product get(int productId) {
		try {
			return sessionfactory.getCurrentSession().get(Product.class,productId);
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		return null;
	}

	@Override
	public boolean add(Product product) {
		try {
		 sessionfactory.getCurrentSession().persist(product)	;
		 return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean update(Product product) {
		try {
		sessionfactory.getCurrentSession().saveOrUpdate(product);
		 return true;
		}catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Product product) {
		try {
			product.setActive(false);
			 return this.update(product);
			}catch (Exception e) {
				e.printStackTrace();
			}
			return false;
	}

	@Override
	public List<Product> listActiveProducts() {
		String selectactiveProduct="from Product where active = :active";
		
		Query query=sessionfactory.getCurrentSession().createQuery(selectactiveProduct);
		query.setParameter("active",true);
		return query.list();
	}

	@Override
	public List<Product> listActiveProductsBycategory(int categoryId) {
String selectactiveProductsBycategory="from Product where active = :active and categoryId=:categoryId";
		
		Query query=sessionfactory.getCurrentSession().createQuery(selectactiveProductsBycategory);
		query.setParameter("active",true);
		query.setParameter("categoryId",categoryId);
		return query.list();
	}

	@Override
	public List<Product> getLatestActiveProducts(int count) {
String selectLatestActiveProducts="from Product where active = :active order by id";
		
		Query query=sessionfactory.getCurrentSession().createQuery(selectLatestActiveProducts);
		query.setParameter("active",true);
		query.setFirstResult(0);
		query.setMaxResults(count);
		return query.list();
	}
	
	
	
	

}
