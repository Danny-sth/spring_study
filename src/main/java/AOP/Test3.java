package AOP;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test3 {
    public static void main(String[] args) {
        System.out.println("Method main() starts");

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        // обьявляем контейнер

        UniLibrary library = context.getBean("uniLibrary", UniLibrary.class);
        String bookname = library.returnBook();
        System.out.println("В библиотеку вернули книгу " + bookname);

        context.close();
        System.out.println("Method main() ends");
    }
}
