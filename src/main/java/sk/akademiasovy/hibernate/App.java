package sk.akademiasovy.hibernate;

import org.hibernate.Session;
import sk.akademiasovy.hibernate.entity.User;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        User user = new User();
        user.setFirstname("Daniel");
        user.setFirstname("Novák");
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.getTransaction().begin();
        session.save(user);
        session.getTransaction().commit();
    }
}
