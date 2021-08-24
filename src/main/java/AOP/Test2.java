package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Test2 {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        // обьявляем контейнер

        University university = context.getBean("university", University.class);
        // получаем бин  university c типом University

        university.addStudents();
        try {
            List<Student> studentList = university.getStudents();
            System.out.println(studentList.toString());
        } catch (IndexOutOfBoundsException e){
            System.out.println("Было поймано исключение " + e);
        }

        context.close();
    }
}
