package sk.akademiasovy.hibernate;

import org.hibernate.Session;
import sk.akademiasovy.hibernate.entity.User;

/**
 * Hello world!
 *
 */
public class App{
    public static void main(String[] args){
        System.out.println("Hello World!");
        User user = new User();
        user.setFirstname("Daniel");
        user.setFirstname("Novák");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.save(user);
        session.getTransaction().commit();
        System.out.println("New ID: "+user.getId());
        User user2 = (User)session.get(User.class,1L);
        //Hibernate.initialize(user2);
        if(user2!=null){
            System.out.println(user2.getLastname());
        }
        session.close();
    }
}
