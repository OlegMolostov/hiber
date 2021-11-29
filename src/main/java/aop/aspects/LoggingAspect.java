package aop.aspects;

import aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

//    @Pointcut("execution(* aop.UniLibrary.*(..))")
//    private void allMethods(){}
//
//    @Pointcut("execution(public void aop.UniLibrary.returnMagazine())")
//    private void returnMagazineFromUni(){
//    }
//    @Pointcut("allMethods()&&!returnMagazineFromUni()")
//    private void allMethodsExceptReturnMagazine(){
//    }
//@Before("allMethodsExceptReturnMagazine()")
// public void allMeth(){
//     System.out.println("10");
//    }
//    @Pointcut("execution(* aop.UniLibrary.get*())")
//    public void allGetMethodFromUniLib() {
//    }
//
//    @Pointcut("execution(* aop.UniLibrary.return*())")
//    public void allReturnMethodFromUniLib() {
//    }
//
//    @Pointcut("allGetMethodFromUniLib()||allReturnMethodFromUniLib()")
//    private void allGetandReturnMethodFromUNI(){}
//
//    @Before("allGetMethodFromUniLib()")
//    public void beforeGetLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice=writing log #1");
//    }
//
//    @Before("allReturnMethodFromUniLib()")
//    public void beforeReturnLoggingAdvice() {
//        System.out.println("beforeGetLoggingAdvice=writing log #2");
//    }
//
//    @Before("allGetMethodFromUniLib()||allReturnMethodFromUniLib()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice=writing log #3");
//    }
//



    @Before("aop.aspects.MyPointcuts.allAddMethods()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint){
        MethodSignature methodSignature=(MethodSignature) joinPoint.getSignature();
        System.out.println("MethodSignature="+methodSignature);
        System.out.println("MethodSignature="+methodSignature.getMethod());
        System.out.println("MethodSignature="+methodSignature.getReturnType());
        System.out.println("MethodSignature="+methodSignature.getName());

        if(methodSignature.getName().equals("addBook")){
             Object[] args=joinPoint.getArgs();
            for (Object obj: args
                 ) {
                if (obj instanceof Book){
                    Book book=(Book) obj;
                    System.out.println("Infotmationd-" +
                            book.getName()+"  --  "
                    +book.getAuthor()+"0----0" +
                            book.getYearOfPublic());
                }
                else if (obj instanceof String){
                    System.out.println("Книгу в библ добавляет "+obj);
                }
            }
        }










        System.out.println("beforeGetBookAdvice:логирование" +
                "попыткы поулчить книгу/журанл");
        System.out.println("---------------------------------------");
    }




//
}
