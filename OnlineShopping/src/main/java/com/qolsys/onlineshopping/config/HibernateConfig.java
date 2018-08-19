package com.qolsys.onlineshopping.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages = { "com.qolsys.onlineshopping.dto" })
@EnableTransactionManagement
public class HibernateConfig {


	private static final String database_driver = "com.mysql.jdbc.Driver";
	private static final String database_url = "jdbc:mysql://localhost:3307/chandan";
	private static final String database_root = "root";
	private static final String database_password = "root";

	private static final String hibernate_dialect = "org.hibernate.dialect.MySQLDialect";

	@Bean
	public DataSource getDataSource() {
		BasicDataSource ds=new BasicDataSource();
		ds.setDriverClassName(database_driver);
		ds.setUrl(database_url);
		ds.setUsername(database_root);
		ds.setPassword(database_password);
		return ds;
	}
	
	@Bean
	public SessionFactory getSessionFactory(DataSource ds) {
		
		LocalSessionFactoryBuilder builder= new LocalSessionFactoryBuilder(ds);
		builder.scanPackages("com.qolsys.onlineshopping.dto");
		builder.addProperties(getHibernateProperties());
		return builder.buildSessionFactory();
		
	}

	private Properties getHibernateProperties() {
		   Properties hibernateProperties = new Properties();
	        hibernateProperties.put("hibernate.dialect", hibernate_dialect);
	        hibernateProperties.put("hibernate.show_sql", true);
	        hibernateProperties.put("hibernate.format_sql", true);
	       hibernateProperties.put("hibernate.hbm2ddl.auto", "update");
	        return hibernateProperties;
	}

	@Bean
	public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)  {
	 HibernateTransactionManager htm= new HibernateTransactionManager(sessionFactory);
	
			 return htm;
	}
	
}


