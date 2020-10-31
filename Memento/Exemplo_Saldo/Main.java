public class Main{
    public static void main(String[] args){   
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
                  
        originator.setSaldo(1000);
        careTaker.add(originator.saveStateToMemento());
          
        originator.Depositar(500);
        careTaker.add(originator.saveStateToMemento());
          
        originator.Depositar(250);
        careTaker.add(originator.saveStateToMemento());
          
        originator.Sacar(700);
        careTaker.add(originator.saveStateToMemento());
          
        System.out.println("Saldo atual: " + originator.getSaldo());		
          
        System.out.println("\nHistórico: ");
        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("Saldo 1: " + originator.getSaldo());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Saldo 2: " + originator.getSaldo());
        originator.getStateFromMemento(careTaker.get(2));
        System.out.println("Saldo 3: " + originator.getSaldo());
    }
}