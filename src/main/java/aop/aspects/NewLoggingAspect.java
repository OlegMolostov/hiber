package aop.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class NewLoggingAspect {

    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {


        System.out.println("aroundReturnBookLoggingAdvice=пытаются вернуть  книгу");
        Object targetMethodResult=null;
        try {
             targetMethodResult= proceedingJoinPoint.proceed();
        }catch (Exception e){
            System.out.println("errorrrr "+e);
            throw e;
        }


        System.out.println("aroundReturnBookLoggingAdvice=успешно вернули книгу");

        return targetMethodResult;
    }
}
