package Modul2.Tugas.Tugas3.Jawaban;

public class Employee extends Person implements EmployeeInterface {// extract to EmployeeInterface(abstract) + superclass (centang yang kuning)

    public Employee(String employeeName, int employeeAge, double salary, String jobDescription){
        super(new EmployeeInfo(employeeName, employeeAge, salary, jobDescription));//ref (String employeeName, int employeeAge, double salary, String jobDescription + ref ipo Employeeinfo
    }

    @Override
    public void printEmployeeInfo(){//printEmployeeInfo()
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Age: " + employeeAge);
        System.out.println("Salary: $" + salary);
        System.out.println("Job Description: " + jobDescription);
    }

    @Override
    public double CalculateAnnualSalary(){ //calculateAnnualSalary()
        return salary * 12;
    }

    @Override
    public void applyRaise(double raisePercentage){ //applyRaise
        salary += (salary * raisePercentage / 100);
    }
}