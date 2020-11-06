public class Main{
    public static void main(String[] args){   
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
      
        originator.setCardapio("DOMINGO: Arroz, feijão, purê de batata, bife, pudim de chocolate");
        careTaker.add(originator.saveCardapioToMemento());
        
        originator.setCardapio("SEGUNDA-FEIRA: Arroz, feijão, salada de tomate, frango assado, maçã");
      
        originator.setCardapio("TERÇA-FEIRA: Macarrão, frango assado, doce de abóbora");
        careTaker.add(originator.saveCardapioToMemento());
      
        originator.setCardapio("QUARTA-FEIRA: Arroz, creme de milho, filé de frango, pudim de leite");
        
        originator.setCardapio("QUINTA-FEIRA: Arroz, feijão, strogonoff, batata palha, abacaxi");
        careTaker.add(originator.saveCardapioToMemento());
        
        originator.setCardapio("SEXTA-FEIRA: Arroz, feijão, batata assada, carne de panela, laranja");
        
        originator.setCardapio("SÁBADO: Lasanha de espinafre, omelete, maçã");    
       
        System.out.println("Cardápio atual: " + originator.getCardapio());     
        
        System.out.println("\nCARDÁPIOS SALVOS: ");
        originator.getCardapioFromMemento(careTaker.get(0));
        System.out.println("1º cardápio salvo: " + originator.getCardapio());
        originator.getCardapioFromMemento(careTaker.get(1));
        System.out.println("2º cardápio salvo: " + originator.getCardapio());
        originator.getCardapioFromMemento(careTaker.get(2));
        System.out.println("3º cardápio salvo: " + originator.getCardapio());
   }
} 