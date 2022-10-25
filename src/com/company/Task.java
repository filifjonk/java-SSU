package com.company;

public class Task {
    public static void main(String[] args){
        Developer developer = new JavaDeveloper();
        Developer developer1 = new SeniorJavaDeveloper(new JavaDeveloper());
        Developer developer2 = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(developer1.makeJob());
        System.out.println(developer2.makeJob());
        System.out.println(developer.makeJob());

    }
}
