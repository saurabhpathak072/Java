package OOPS.Inheritance.Challeng1;

public class SalariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public SalariedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay(){
        double payCheck = annualSalary/26;
        double adjustedPay = (isRetired) ? 0.9 * payCheck:payCheck;
        return adjustedPay;
    }

    public void retire(){
        terminated("25/12/2030");
        isRetired = true;
        System.out.println("Employee is"+(isRetired?"":" not")+" retired");
    }
}
