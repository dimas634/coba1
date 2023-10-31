package Modul2.Tugas.Tugas3.Jawaban;

public class Person {
    protected String employeeName;//ref
    protected int employeeAge;//ref
    protected double salary;
    protected String jobDescription;//ref

    public Person(EmployeeInfo employeeInfo) {
        this.employeeName = employeeInfo.employeeName();
        this.employeeAge = employeeInfo.employeeAge();
        this.salary = employeeInfo.salary();
        this.jobDescription = employeeInfo.jobDescription();
    }
}
