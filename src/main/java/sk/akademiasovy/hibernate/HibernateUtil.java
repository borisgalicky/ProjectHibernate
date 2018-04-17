package sk.akademiasovy.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import sk.akademiasovy.hibernate.entity.User;

public class HibernateUtil{
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }

    private static final SessionFactory sessionFactory = buildSessionFactory();

    private static SessionFactory buildSessionFactory(){
        try{
            Configuration configuration=new org.hibernate.cfg.Configuration();
            configuration.addAnnotatedClass(User.class);
            return configuration.buildSessionFactory(new StandardServiceRegistryBuilder().build());
        }catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
