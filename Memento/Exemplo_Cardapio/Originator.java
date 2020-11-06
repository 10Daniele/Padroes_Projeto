public class Originator{
    private String cardapio;

    public void setCardapio(String cardapio){
        this.cardapio = cardapio;
    }

    public String getCardapio(){
        return cardapio;
    }

    public Memento saveCardapioToMemento(){
        return new Memento(cardapio);
    }

    public void getCardapioFromMemento(Memento memento){
        cardapio = memento.getCardapio();
    }
}