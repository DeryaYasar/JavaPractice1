package day37_OOP_Study_Task;

import java.util.ArrayList;
import java.util.Arrays;

public class ScrumTeam {

        public ProductOwner PO;
        public BusinessAnalyst BA;
        public ScrumMaster SM;
        public ArrayList<Tester> testers =  new ArrayList<>();
         public ArrayList<Developer> developers = new ArrayList<>();


    public ScrumTeam(ProductOwner PO, BusinessAnalyst BA, ScrumMaster SM) {
            this.PO = PO;
            this.BA = BA;
            this.SM = SM;
        }

        public void addTester (Tester tester){
            testers.add(tester);
        }

        public void addTesters (Tester[]testerList){
            this.testers.addAll(Arrays.asList(testerList));
        }
        public void removeTester (Tester tester){
            testers.remove(tester);
        }

        public void removeTesters (Tester[]testersRem){
            testers.removeAll(Arrays.asList(testersRem));
        }

        public void removeTester ( int id){
            testers.removeIf(p -> p.id == id);
        }


    public String toString() {
        return "ScrumTeam{" +
                "PO=" + PO +
                ", BA=" + BA +
                ", SM=" + SM +
                ", developers=" + developers +
                ", testers=" + testers +
                '}';
    }
}