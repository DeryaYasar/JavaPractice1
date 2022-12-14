package day37_OOP_Study_Task;

public class ProductOwner extends Employee{


    public ProductOwner(String name, int age, char gender, double salary, int id, String jobTitle, String companyName) {
        super(name, age, gender, salary, id, jobTitle, companyName);
    }

    public void analyze(){
        System.out.println(name + " is analyzing the documents" );
    }

}
