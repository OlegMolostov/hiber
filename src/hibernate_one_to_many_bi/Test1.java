package hibernate_one_to_many_bi;


import hibernate_one_to_many_bi.entity.Department;
import hibernate_one_to_many_bi.entity.Employee;
import hibernate_one_to_one.entity.Detail;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test1 {
    public static void main(String[] args) {

        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Department.class)
                .buildSessionFactory();


        Session session = null;
        try {
//            session = factory.getCurrentSession();
//
//
//            Department dep = new Department("Sales", 1222, 222);
//
//            Employee emp1=new Employee("Oleg","Molostov",800);
//            Employee emp2=new Employee("Elena","Smirnova",1000);
//            Employee emp3=new Employee("Zaur","Trueg",424);
//
//            dep.addEmployeeToDepartment(emp1);
//            dep.addEmployeeToDepartment(emp2);
//            dep.addEmployeeToDepartment(emp3);
//
//            session.beginTransaction();
//
//            session.save(dep);
//
//            session.getTransaction().commit();
//            System.out.println("DOne");
//****************************

            session = factory.getCurrentSession();




            session.beginTransaction();

            Department department=session.get(Department.class,4);

            System.out.println("Show department");

            System.out.println(
                    department
            );

            System.out.println("Show employees of the department");
            System.out.println(department.getEmps());


            session.getTransaction().commit();
            System.out.println("DOne");
//***********************
//            session = factory.getCurrentSession();
//
//
//
//
//            session.beginTransaction();
//
//            Employee employee=session.get(Employee.class,1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//
//            session.getTransaction().commit();
//            System.out.println("DOne");
/////////////////////////////////////
//            session = factory.getCurrentSession();
//
//
//
//
//            session.beginTransaction();
//
//            Employee employee=session.get(Employee.class,3);
//
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("DOne");

        } finally {
            session.close();
            factory.close();
        }

    }
}
