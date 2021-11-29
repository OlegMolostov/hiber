package aop;


import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary {


    public void getBook(){
        System.out.println("получили книну UniLIB ");
        System.out.println("---------------------------------------");
    }
    public void getMagazine(){
        System.out.println("получили magaz UniLIB");
        System.out.println("---------------------------------------");
    }
    public String  returnBook(){
        int a=10/0;
        System.out.println("вернули книгк UniLib");
        System.out.println("---------------------------------------");
return "WarPiece";
    }

    public void returnMagazine(){
        System.out.println("вернули журнал UniLib");
        System.out.println("---------------------------------------");

    }

    public void addBook(String person_name,Book book){
        System.out.println("добавили" +
                " книну UniLIB");
        System.out.println("---------------------------------------");
    }
    public void addMagazine(){
        System.out.println("добавили" +
                " журнал UniLIB");
        System.out.println("---------------------------------------");
    }
}
