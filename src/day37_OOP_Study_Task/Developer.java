package day37_OOP_Study_Task;

public class Developer extends Employee{
    public Developer(String name, int age, char gender, double salary, int id, String jobTitle, String companyName) {
        super(name, age, gender, salary, id, jobTitle, companyName);
    }

    public void FixBugs(){
        System.out.println(jobTitle + " " + name + "is fixing the bugs");
    }
}
