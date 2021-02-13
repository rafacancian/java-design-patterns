package com.designpatterns.solid.model;

public class EmployeeOutsource {

    private PersonalInformation personalInformation;
    private String companyName;

    public EmployeeOutsource(PersonalInformation personalInformation, String companyName) {
        this.personalInformation = personalInformation;
        this.companyName = companyName;
    }

    public PersonalInformation getPersonalInformation() {
        return personalInformation;
    }

    public String getCompanyName() {
        return companyName;
    }


    @Override
    public String toString() {
        return "EmployeeOutsource{" +
                "personalInformation=" + personalInformation +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
