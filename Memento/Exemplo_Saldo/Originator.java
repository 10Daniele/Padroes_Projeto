public class Originator{
    private float saldo;

    public void setSaldo(float saldo){
        this.saldo=saldo;
    }
   
    public float getSaldo(){
        return saldo;  
    }
   
    public void Depositar(float valor){
        this.saldo=this.saldo+valor;
    }
    
    public void Sacar(float valor){
        this.saldo=this.saldo-valor;
    }

    public Memento saveStateToMemento(){
        return new Memento(saldo);
    }

    public void getStateFromMemento(Memento memento){
        saldo=memento.getSaldo(); 
    }
} 