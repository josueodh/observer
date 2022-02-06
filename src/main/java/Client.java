import java.util.Observable;
import java.util.Observer;

public class Client implements Observer{
    private String name;
    private String lastNofification;

    public Client(String name ){
        this.name = name;
    }

    public String getLastNofification(){
        return this.lastNofification;
    }

    public void answerForm(Company company){
        company.addObserver(this);
    }

    public void update(Observable company, Object arg1){
        this.lastNofification = this.name + ", respondeu a pesquisa da empresa " + company.toString();
    }

}
