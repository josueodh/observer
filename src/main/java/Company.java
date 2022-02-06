import java.util.Observable;

public class Company extends Observable {

    private String name;
    private String manager;

    public Company(String name, String manager){
        this.manager = manager;
        this.name = name;
    }

    public void newAnswer(){
        setChanged();
        notifyObservers();
    }

    @Override
    public String toString(){
        return this.name + ", gerente: " + this.manager;
    }
}
