package day37_OOP_Study_Task;

public class Tester extends Employee{
    public Tester(String name, int age, char gender, double salary, int id, String jobTitle, String companyName) {
        super(name, age, gender, salary, id, jobTitle, companyName);
    }
    public void test(){
        System.out.println(jobTitle + " " + name + " is testing the code");
    }

    public void creatingTicket(){
        System.out.println(jobTitle + " " + name + " is creating the ticket");
    }
}
