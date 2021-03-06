package hibernate_test.Entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class)
                        .buildSessionFactory();

        try {
            Session session = factory.getCurrentSession();
            Employee employee =
                    new Employee("Oleg", "Sidorov", "HR", 700);

            session.beginTransaction();
            session.save(employee); // Запрос Insert Into...

            int myId = employee.getId(); // Получаем ID добавленного обьекта, автоматически сгенерированный в БД

            Employee emp = session.get(Employee.class, myId);
            session.getTransaction().commit();
            System.out.println(emp);

            System.out.println("Done!");

        } finally {
            factory.close();
        }
    }
}
