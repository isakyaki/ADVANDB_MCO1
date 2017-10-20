package service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;

import bean.Book;

public class GetResult {
	
	public static List<Object[]> getResult() {
		
		/**
		 * I'm trying to look for a solution
		 * on how to make a query using multiple tables
		 * i don't understand criteriabuilder thp
		 */
		
		List<Object[]> queryList = null; 
		
					
				EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysqldb"); 
				EntityManager em = emf.createEntityManager(); 
				
				CriteriaBuilder cb = emf.getCriteriaBuilder();
				
				EntityTransaction trans = em.getTransaction(); 
				
				try { 
					trans.begin(); 
				
					CriteriaQuery<Book> q = cb.createQuery(Book.class); 
					//queryList = q.getResultList(); 
							
					
					trans.commit();
				} catch (Exception e) { 
					if( trans != null )
						trans.rollback();
					e.printStackTrace(); 
				} finally { 
					em.close();
				}
				
				return queryList; 
			}

}
