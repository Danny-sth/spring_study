package AOP.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class MyPointcuts {
    // Обьявление POINTCUT
    @Pointcut("execution(* abc*(..))")
    public void allAddMethods() {
    }
}
