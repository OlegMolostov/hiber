package aop;

public class Student {
    private String nameSurname;
    private int course;
    private double avgGrad;

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", course=" + course +
                ", avgGrad=" + avgGrad +
                '}';
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public double getAvgGrad() {
        return avgGrad;
    }

    public void setAvgGrad(double avgGrad) {
        this.avgGrad = avgGrad;
    }

    public Student(String nameSurname, int course, double avgGrad) {
        this.nameSurname = nameSurname;
        this.course = course;
        this.avgGrad = avgGrad;
    }
}
