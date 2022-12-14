package day37_OOP_Study_Task;

public class Employee extends Person{

    public double salary;
    public int id;
    public String jobTitle;
    public String companyName;

    public Employee(String name, int age, char gender, double salary, int id, String jobTitle, String companyName) {
        super(name, age, gender);
        this.salary = salary;
        this.id = id;
        this.jobTitle = jobTitle;
        this.companyName = companyName;
    }

    public void work(){
        System.out.println(jobTitle+" "+name + "is working");
    }

    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", id=" + id +
                ", jobTitle='" + jobTitle + '\'' +
                ", companyName='" + companyName + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
