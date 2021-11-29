package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice=логируем получение списка студентов перед getSTUD");
//    }

//    @AfterReturning(pointcut = "execution(* getStudents())",
//    returning = "students")
//    public void afterReturningGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent=students.get(0);
//        String nameSurname=firstStudent.getNameSurname();
//        nameSurname="Mr"+nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//    double avgGrade=firstStudent.getAvgGrad()+1;
//    firstStudent.setAvgGrad(avgGrade);
//
//
//        System.out.println("afterReturningGetStudentsLoggingAdvice=логируем получение списка студентов после getSTUD");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())",
//    throwing = "exp")
//    public void afterThrowGetStudent(Throwable exp){
//        System.out.println("afterThrowGetStudent=выбросс---------------"+exp);
//    }
    @After("execution(* getStudents())")
    public void afterGetStudent(){
        System.out.println("afterGetStudent=нормальное окончание или выброс исключения---------------");
    }
}
