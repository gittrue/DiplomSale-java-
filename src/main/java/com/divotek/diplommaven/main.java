/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.divotek.diplommaven;

import com.divotek.R.R;
import com.divotek.attribute.performAttribute.PMarginB;
import com.divotek.attribute.performMeasurement.PMeasurePercent;
import com.divotek.html.HtmlObject;
import com.divotek.html.TagBorderP;
import com.divotek.html.TagP;
import com.divotek.users.jpa.hibernate.Person;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.stream.Stream;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author maxxl
 */
public class main
{

   /**
    * @param args the command line arguments
    */
   public static void main(String[] args)
   {
	/* TEG Example
	HtmlObject p = new TagBorderP("Какой то текст");
	p.setName(R.Text.border_light);
	p.addAttribute("Отступ вниз", new PMarginB(), "27", new PMeasurePercent());
	System.out.println("Ключ " + p.getName() + " " + p.generatedTag());
	*/
Map a = new LinkedHashMap<>();
a.put("История", "десять");
a.put("Программирование", "Идеально");
Person personOne = new Person();
personOne.setName("Максим");
personOne.setSurname("Сорокин");
personOne.setLastname("Игоревич");
personOne.setSubject(a);
 

EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.divotek.users.jpa.hibernate");
EntityManager em = entityManagerFactory.createEntityManager();/*
em.getTransaction().begin();
em.persist(personOne);

em.getTransaction().commit();
em.close();
*/
System.out.println("************************************************************************");
em = entityManagerFactory.createEntityManager();
em.getTransaction().begin();
Person p;




em.createQuery("from Person", Person.class).getResultList().forEach(g -> System.out.println(String.format("%s, %s!",  g.getName(), g.getSurname())));
em.getTransaction().commit();
em.close();


	

   }

}
