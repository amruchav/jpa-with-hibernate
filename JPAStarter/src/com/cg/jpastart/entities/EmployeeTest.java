package com.cg.jpastart.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EmployeeTest {

		public static void main(String[] args) {  
			
			//It makes connection with database
			EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
			//Interface that contain all predefined queries like persist,merge,find,getTransaction by object "em" we will call that method(query)
			EntityManager em = factory.createEntityManager();
			//
			em.getTransaction().begin();
			
			Employee e1=new Employee();  
		    e1.setId(1005);  
		    e1.setFirstName("Ajita");  
		    e1.setLastName("Gaikwad"); 
		    
		  
		    Employee e2=new Employee();  
		    e2.setId(1006);  
		    e2.setFirstName("Sudhir");  
		    e2.setLastName("Gaikwad");  
		     
		    //
		    em.persist(e1);  
		    em.persist(e2);  
		    //
			em.getTransaction().commit();
		    System.out.println("successfully saved"); 
		    
		    //
		    em.close();
		    //
			factory.close();
		}  
		} 
