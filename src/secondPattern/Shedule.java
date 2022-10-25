package secondPattern;

public class Shedule {
    public static void main(String[] args){
        Activity activity = new Planing();
        Developer developer = new Developer();

        developer.setActivity(activity);
        for(int i = 0; i<7; i++){
            developer.toDoList();
            developer.changeActivity();
        }

    }
}
