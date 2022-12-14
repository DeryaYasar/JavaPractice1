package day37_OOP_Study_Task;

import java.util.ArrayList;
import java.util.Arrays;

public class Amazon {
    public static void main(String[] args) {

        ProductOwner PO1=new ProductOwner("Ahmet",40,'M',100000,1000,"ProductOwner","Amazon");
        ProductOwner PO2=new ProductOwner("Ali",39,'M',110000,1100,"ProductOwner","Amazon");
        ProductOwner PO3=new ProductOwner("Ayşe",38,'F',120000,1200,"ProductOwner","Amazon");

        ScrumMaster SM1=new ScrumMaster("Recep",37,'M',100000,1300,"ScrumMaster","Amazon");
        ScrumMaster SM2=new ScrumMaster("Hasan",36,'M',110000,1400,"ScrumMaster","Amazon");
        ScrumMaster SM3=new ScrumMaster("Fatma",35,'F',120000,1500,"ScrumMaster","Amazon");

        BusinessAnalyst BA1=new BusinessAnalyst("Volkan",34,'M',100000,1600,"BusinessAnalyst","Amazon");
        BusinessAnalyst BA2=new BusinessAnalyst("Ömer",33,'M',110000,1700,"BusinessAnalyst","Amazon");
        BusinessAnalyst BA3=new BusinessAnalyst("Mine",32,'F',120000,1800,"BusinessAnalyst","Amazon");

        Tester tester1 = new Tester("Murat",31,'M',100000,1900,"Tester","Amazon");
        Tester tester2 = new Tester("Orhan",30,'M',110000,2000,"Tester","Amazon");
        Tester tester3 = new Tester("Eda",29,'F',120000,2100,"Tester","Amazon");
        Tester tester4 = new Tester("Gül",28,'F',130000,2200,"Tester","Amazon");
        Tester tester5 = new Tester("Arda",27,'M',140000,2300,"Tester","Amazon");
        Tester tester6 = new Tester("İdil",26,'F',150000,2400,"Tester","Amazon");

        Tester[] testers={tester1,tester2,tester3,tester4,tester5,tester6};
        Tester[] testersGr1={tester1,tester2};
        Tester[] testersGr2={tester3,tester4};
        Tester[] testersGr3={tester5,tester6};

        Developer developer1 = new Developer("Metin",41,'M',100000,2500,"Developer","Amazon");
        Developer developer2 = new Developer("Mert",42,'M',110000,2600,"Developer","Amazon");
        Developer developer3= new Developer("İnci",43,'F',120000,2700,"Developer","Amazon");

        Developer[] developers={developer1,developer2,developer3};

        Employee[] arrayOfEmployees = {PO1,PO2,PO3,SM1,SM2,SM3,BA1,BA2,BA3,tester1,tester2,tester3,tester4,tester5,tester6,developer1,developer2,developer3};
        ArrayList<Employee> listOfEmployees = new ArrayList<>();
        listOfEmployees.addAll(Arrays.asList(arrayOfEmployees));

        ScrumTeam scrumTeam1 = new ScrumTeam(PO1,BA1,SM1);
        ScrumTeam scrumTeam2 = new ScrumTeam(PO2,BA2,SM2);
        ScrumTeam scrumTeam3 = new ScrumTeam(PO3,BA3,SM3);

        scrumTeam1.addTesters(testersGr1);
        scrumTeam2.addTesters(testersGr2);
        scrumTeam3.addTesters(testersGr3);

        System.out.println("scrumTeam1 = " + scrumTeam1.BA.name);
        System.out.println("scrumTeam2 = " + scrumTeam2.testers);
        System.out.println("scrumTeam3 = " + scrumTeam3.testers.get(0).name);

        ArrayList<String> nameList = new ArrayList<>();
        for(int i=1;i<testers.length;i++){
            nameList.add((Arrays.asList(testers).get(i).name));
        }
        System.out.println("nameList = " + nameList);

        ArrayList<String> nameOfEmployees = new ArrayList<>();
        for(int i=1;i<listOfEmployees.size();i++){
            nameOfEmployees.add((listOfEmployees.get(i).name));
        }
        System.out.println("nameOfEmployees = " + nameOfEmployees);

        ArrayList<Integer> idOfEmployees = new ArrayList<>();
        for(int i=1;i<listOfEmployees.size();i++){
            idOfEmployees.add((listOfEmployees.get(i).id));
        }
        System.out.println("idOfEmployees = " + idOfEmployees);


    ArrayList<Character> genderOfEmployees = new ArrayList<>();
        for(int i=1;i<listOfEmployees.size();i++){
        genderOfEmployees.add((listOfEmployees.get(i).gender));
    }
        System.out.println("genderOfEmployees = " + genderOfEmployees);

        int numberOfMales =0;
        int numberOfFemales =0;
        for(int i=1;i<listOfEmployees.size();i++){
            if(listOfEmployees.get(i).gender=='M'){
                numberOfMales++;
            }
            else numberOfFemales++;
        }
        System.out.println("numberOfMales = " + numberOfMales);
        System.out.println("numberOfFemales = " + numberOfFemales);

        ArrayList<Integer> salaryOfEmployees = new ArrayList<>();
        for(int i=1;i<listOfEmployees.size();i++){
            salaryOfEmployees.add((int) listOfEmployees.get(i).salary);
        }
        System.out.println("salaryOfEmployees = " + salaryOfEmployees);

        double totalSalary = 0;
        double averageSalary;
        int numberOfEmployee = listOfEmployees.size();

        for(int i=1;i<listOfEmployees.size();i++){
            totalSalary+=listOfEmployees.get(i).salary;
        }
        averageSalary=totalSalary/numberOfEmployee;
        System.out.println("averageSalary = " + averageSalary);

        int totalAge=0;
        double averageAge;
        numberOfEmployee = listOfEmployees.size();

        for(int i=1;i<listOfEmployees.size();i++){
            totalAge+=listOfEmployees.get(i).age;
        }
        averageAge = (double) totalAge/numberOfEmployee;
        System.out.println("averageAge = " + averageAge);
}
}