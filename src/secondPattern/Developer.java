package secondPattern;

public class Developer {
    Activity activity;
    public void setActivity(Activity activity){
        this.activity = activity;
    }
    public void changeActivity(){
        if (activity instanceof Planing){
            setActivity(new Working());
        }
        else if (activity instanceof  Working){
            setActivity((new Testing()));
        }
        else if (activity instanceof Testing){
            setActivity(new Discuss());
        }
        else if (activity instanceof Discuss){
            setActivity(new Planing());
        }
    }
    public void toDoList(){
        activity.toDoList();
    }
}
