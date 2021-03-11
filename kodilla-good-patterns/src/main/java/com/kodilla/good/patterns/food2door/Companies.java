package com.kodilla.good.patterns.food2door;

import java.util.ArrayList;

public class Companies {

    private ArrayList<Process> CompaniesList = new ArrayList<>();

    public void addCompany(Process process) {
        CompaniesList.add(process);
    }

   public ArrayList<Process> getCompaniesList() {
       return CompaniesList;
   }
}
