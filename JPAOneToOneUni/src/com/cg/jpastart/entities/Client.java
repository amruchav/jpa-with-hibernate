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
		
		
		TypedQuery<Student> query = em.createQuery("SELECT s FROM Student s", Student.class);
		List<Student> list = query.getResultList();
		
		for(Student st: list){
			
			System.out.println(st.getName());
			System.out.println(st.getAddress().getCity());
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
