/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.HibernateImplement;

import Domain.Author;
import Domain.Catalogloanrecord;
import Domain.Catalogrecord;
import Domain.Customer;
import Domain.Employee;
import Domain.Publisher;
import Domain.Documenttype;
import Domain.Genre;
import Domain.Person;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author IT Technician
 */
public abstract class HibernateMainConfig {
    private static final Configuration Config = new Configuration();
    private static SessionFactory sessionFactory=null;
    
    private static SessionFactory getSessionFactory() throws HibernateException
    {
        if(sessionFactory==null)
        {
            try{
                //configure hibernate using xml file
                Config.configure("hibernate.cfg.xml");
                
                //add annotated classes
                Config.addAnnotatedClass(Author.class);
                Config.addAnnotatedClass(Publisher.class);
                Config.addAnnotatedClass(Person.class);
                Config.addAnnotatedClass(Customer.class);
                Config.addAnnotatedClass(Employee.class);
                Config.addAnnotatedClass(Genre.class);
                Config.addAnnotatedClass(Documenttype.class);
                Config.addAnnotatedClass(Catalogloanrecord.class);
                Config.addAnnotatedClass(Catalogrecord.class);
                sessionFactory=Config.buildSessionFactory();
                
            }
            catch(HibernateException hex)
            {
                throw new HibernateException("Unable to build Session factory " +hex.getMessage());
            }
        }
        return sessionFactory;
    }
    
    protected static Session getSession() throws HibernateException
    {
        sessionFactory=getSessionFactory();
        return(sessionFactory!=null) ? sessionFactory.openSession() : null; //opens and return the session
    }
    
    
}
