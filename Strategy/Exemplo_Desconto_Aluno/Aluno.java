public class Aluno{
    private String name;  
    private double mensalidade;

    public String getName(){
        return this.name;
    }

    public double getMensalidade(){
        return mensalidade;
    }

    public void setMensalidade(double mensalidade){
        this.mensalidade = mensalidade;
    }

    public Aluno (String name){
        this.name = name;
    }
}
