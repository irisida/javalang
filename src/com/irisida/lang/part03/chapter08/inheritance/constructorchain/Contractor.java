package com.irisida.lang.part03.chapter08.inheritance.constructorchain;

public class Contractor extends Employee {
    int weeksContracted;

    public Contractor() {
        this(12);
        System.out.println("\t\tContractor -> no param Constructor");
    }

    public Contractor(int weeksContracted) {
        this(weeksContracted, "application developer");
        this.weeksContracted = weeksContracted;
        System.out.printf("\t\tContractor -> Constructor(%d)%n", weeksContracted);
    }

    public Contractor(int weeksContracted, String jobTitle) {
        this.weeksContracted = weeksContracted;
        this.jobTitle = jobTitle;
        System.out.printf("\t\tContractor -> Constructor(%d, %s)%n", weeksContracted, jobTitle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name            : ").append(this.name).append("\n");
        sb.append("Job title       : ").append(this.jobTitle).append("\n");
        sb.append("Weeks contracted: ").append(this.weeksContracted).append("\n");

        return sb.toString();
    }
}
