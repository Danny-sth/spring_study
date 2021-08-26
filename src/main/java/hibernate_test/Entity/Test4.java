package hibernate_test.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class)
                        .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            session.beginTransaction();

//            Employee den = session.get(Employee.class, 1); // Получение обьекта из таблицы
//            den.setSalary(50); // установка нового значения полю  salary, полученного обьекта

            session.createQuery("update Employee set salary = 1000 " +
                    "where name = 'Alexandr'").executeUpdate(); // update поля salary на значение - 1000
            // у обьектов где имя = Alexandr

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
