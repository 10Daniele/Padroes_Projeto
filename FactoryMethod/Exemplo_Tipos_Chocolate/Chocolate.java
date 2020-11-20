public abstract class Chocolate{
    private String tipoChocolate;
    private int calorias;

    public Chocolate(String tipoChocolate, int calorias){
        this.tipoChocolate = tipoChocolate;
        this.calorias = calorias;
    }

    public String getTipo(){
        return tipoChocolate;
    }
    public int getCalorias(){
        return calorias;
    }
}