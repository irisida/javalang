package com.irisida.lang.part03.chapter08.inheritance.constructorchain;

public class Employee extends Person {
    String jobTitle;

    public Employee() {
        this("no jobtitle provided");
        System.out.println("\tEmployee -> no param Constructor");
    }

    public Employee(String jobTitle) {
        this.jobTitle = jobTitle;
        System.out.printf("\tEmployee -> Constructor(%s)%n", jobTitle);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("name            : ").append(this.name).append("\n");
        sb.append("Job title       : ").append(this.jobTitle).append("\n");

        return sb.toString();
    }
}
