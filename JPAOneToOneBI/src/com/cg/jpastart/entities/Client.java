package com.cg.jpastart.entities;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-PU");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Student student = new Student();
		student.setName("Deepak Patil");
		Address homeAddress = new Address();
		homeAddress.setStreet("MG Road");
		homeAddress.setCity("Pune");
		homeAddress.setState("Maharashtra");
		homeAddress.setZipCode("411017");
		
		
		TypedQuery<Address> query = em.createQuery("SELECT s FROM Address s", Address.class);
		List<Address> list = query.getResultList();
		
		for(Address st: list){
			
			System.out.println(st.getStudent().getName());
			System.out.println(st.getCity());
		}
		
		
		
//		//inject address into student
//		student.setAddress(homeAddress);
//		
//		//persist only student, no need to persist Address explicitly
//		em.persist(student);
		em.getTransaction().commit();
		
		System.out.println("Added one student with address to database.");
		em.close();
		factory.close();
	}
}
