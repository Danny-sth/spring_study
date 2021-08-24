package AOP.aspects;

import AOP.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* AOP.UniLibrary.*(..))")
//    private void allMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(public void AOP.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUniLibrary() {
//    }
//
//    @Pointcut("allMethodsFromUniLibrary() && !returnMagazineFromUniLibrary()")
//    private void allMethodsExceptReturnMagazineFromUniLibrary() {
//    }
//
//    @Before("allMethodsExceptReturnMagazineFromUniLibrary()")
//    public void beforeAllMethodsExceptReturnMagazineAdvice() {
//        System.out.println("beforeAllMethodsExceptReturnMagazineAdvice: log #10");
//    }

//      Комбинирование POINTCUT
//    @Pointcut("execution(* AOP.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("execution(* AOP.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary() {
//    }
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    // комбинирование двух предыдущих Pointcut'ов
//    private void allGetAndReturnMethodsFromUniLibrary() {
//    }
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice: writing log #1");
//    }
//
//    @Before("allReturnMethodsFromUniLibrary())")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeReturnLoggingAdvice: writing log #2");
//    }
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice: writing log #3");
//    }


    @Before("AOP.aspects.MyPointcuts.allAddMethods()") // Pointcut
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature" + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println("Информация о книге: название - " + myBook.getName() + ", автор - " + myBook.getAuthor() +
                            ", год издания - " + myBook.getYearOfPublication());
                } else if (obj instanceof String) {
                    System.out.println("Книгу в библиотеку добавляет " + obj);
                }
            }
        }
        System.out.println("beforeGetBookAdvice: логирование попытки получить книгу или журнал");
        System.out.println("---------------------------------------------------------------------------");
    }

//    @Before("execution(public * returnBook())") // Pointcut
//    public void beforeReturnBookAdvice() {
//        System.out.println("beforeReturnBookAdvice: Попытка вернуть книгу");
//    }
}

