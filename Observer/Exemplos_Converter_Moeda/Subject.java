import java.util.ArrayList;
import java.util.List;

public class Subject{	
    private List<Observer> observers = new ArrayList<Observer>();
    private int estado;

    public int getEstado(){
        return estado;
    }

    public void setEstado(int estado){
        this.estado = estado;
        notifyAllObservers();
    }

    public void juntar(Observer observer){
        observers.add(observer);		
    }

    public void separar(Observer observer){
         observers.remove(observer);
    }

    public void notifyAllObservers(){
        for(Observer observer : observers){
            observer.update();
        }
    } 	
}