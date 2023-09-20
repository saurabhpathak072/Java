package OOPS.Inheritance.Challeng1;

public class Main {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Saurabh Pathak","05-04-1997","04/05/2022");
        System.out.println("Age => "+emp1.getAge());
        System.out.println(emp1.collectPay());
        System.out.println(emp1);
        Employee emp2 = new Employee("dfghjk","05-04-1972","04/05/2016");
        System.out.println("Age => "+emp2.getAge());
        System.out.println(emp2.collectPay());
        System.out.println(emp2);
        SalariedEmployee salEmp = new SalariedEmployee("Ram","12/11/2011","09/03/1990",3200);
        System.out.println("Ram Get a Annual Pay check of "+salEmp.collectPay());
        System.out.println(salEmp.getAge());
        salEmp.retire();
        System.out.println("Ram's Pension Check = "+salEmp.collectPay());
        System.out.println(salEmp);

        HourlyEmployee saylee = new HourlyEmployee("Sayali","12/01/1990","10/12/2020",40);
        System.out.println(saylee);
        System.out.println("Sayli get pay of : "+saylee.collectPay());
        System.out.println("Sayli get Double Pay : "+saylee.getDoublePay());

    }
}
