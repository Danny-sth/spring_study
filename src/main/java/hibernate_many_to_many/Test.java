package hibernate_many_to_many;

import hibernate_many_to_many.Entity.Child;
import hibernate_many_to_many.Entity.Section;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;

//        try {
//            session = factory.getCurrentSession();
//            Section section1 = new Section("Math");
//            Child child1 = new Child("Denis", 5);
//            Child child2 = new Child("Masha", 7);
//            Child child3 = new Child("Vasya", 6);
//
//            section1.addChildToSection(child1);
//            section1.addChildToSection(child2);
//            section1.addChildToSection(child3);
//
//            session.beginTransaction();
//
//            session.persist(section1);
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//        } finally {
//            session.close();
//            factory.close();
//        } // ********************************************************************************

//        try {
//            session = factory.getCurrentSession();
//            Section section1 = new Section("Football");
//            Section section2 = new Section("Voleyball");
//            Section section3 = new Section("Chess");
//            Child child1 = new Child("Nancy", 6);
//
//            child1.addSectionToChild(section1);
//            child1.addSectionToChild(section2);
//            child1.addSectionToChild(section3);
//
//            session.beginTransaction();
//            session.save(child1);
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//        } finally {
//            session.close();
//            factory.close();
//        } // ********************************************************************************

//        try {
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Section section = session.get(Section.class, 4);
//            System.out.println(section);
//            System.out.println(section.getChildList());
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//        } finally {
//            session.close();
//            factory.close();
//        } // ********************************************************************************


//        try {
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Child child = session.get(Child.class, 6);
//            System.out.println(child);
//            System.out.println(child.getSectionList());
//
//            session.getTransaction().commit();
//            System.out.println("Done!!!");
//        } finally {
//            session.close();
//            factory.close();
//        } // *************** *****************************************************************

        try {
            session = factory.getCurrentSession();

            session.beginTransaction();
           Child child = session.get(Child.class, 7);
            session.delete(child);

            session.getTransaction().commit();
            System.out.println("Done!!!");
        } finally {
            session.close();
            factory.close();
        } // *************** *****************************************************************
    }


}
