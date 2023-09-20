package OOPS.Inheritance.Challeng1;

import java.time.LocalDate;

public class Worker {
    private String name;
    private String birthDate;
    private String endDate;



    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public Worker(String name, String birthDate, String endDate) {
        this.name = name;
        this.birthDate = birthDate;
        this.endDate = endDate;
    }

    public int getAge(){
        int birthYear = Integer.parseInt(this.birthDate.substring(6));
        int currentYear = LocalDate.now().getYear();
        System.out.println(birthYear);
        System.out.println(currentYear);
        return currentYear-birthYear;
    }

    public double collectPay(){
        return 0d;
    }

    public void terminated(String endDate){
        this.endDate=endDate;
        System.out.println("Worker Will terminated at "+endDate);
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}
