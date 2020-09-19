public abstract class Suco{
    Suco() {}
    
    public void ingredientes() {
        agua();
        gelo();
        acucar();
        limao();
        laranja();
        melancia();
        prepararSuco();
    }
    
    protected void agua(){
        System.out.println("Coloque a água");
    }
    protected void gelo(){
        System.out.println("Coloque o gelo");
    }
    protected void acucar(){
        System.out.println("Coloque açúcar");
    }
    protected void limao(){
        System.out.println("Coloque o limao");
    }
    protected void laranja(){
        System.out.println("Coloque a laranja");
    }
    protected void melancia(){
        System.out.println("Coloque a melancia");
    }
    protected void prepararSuco(){
        System.out.println("Preparando o suco!");
    }
}
