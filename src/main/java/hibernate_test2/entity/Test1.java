package hibernate_test2.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();

        Session session = null;

//        try {
//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Denis", "Kudinov", "IT", 35);
//            Detail detail = new Detail("Krasnodar", "89881327456", "danny.wasth@gmail.com");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//        } finally {
//            factory.close();
//        }


//        try {
//            Session session = factory.getCurrentSession();
//
//            Employee employee = new Employee("Nancy", "Brizhko", "IT", 35);
//            Detail detail = new Detail("Petersburg", "8988132678", "nancy@gmail.com");
//            employee.setEmpDetail(detail);
//
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//        } finally {
//            factory.close();
//        }


        try {
            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            session.close();
            factory.close();
        }
    }
}
