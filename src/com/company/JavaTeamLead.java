package com.company;

public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developer developer){
        super(developer);
    }
    public String sendReport(){
        return "Sending a week report ";
    }

    @Override
    public String makeJob(){
        return super.makeJob()+sendReport();
    }
}
