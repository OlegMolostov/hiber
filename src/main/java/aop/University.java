package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students=new ArrayList<>();
    public void addStudents(){
        Student st1=new Student("OlegMol",4,2.3);
        Student st2=new Student("MishaVas",2,4.3);
        Student st3=new Student("ElenSid",1,9.3);

        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("Begin");
        //  System.out.println(students.get(3));
        System.out.println("Info from method getStudents=");
        System.out.println(students);
        return students;
    }
}
