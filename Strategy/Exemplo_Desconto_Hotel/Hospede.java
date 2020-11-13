public class Hospede{
    private String nomeCrianca, nomeResponsavel;
    private boolean ateDois;
    private boolean ateCinco;
    private boolean ateOito;
    
    public Hospede(String nomeCrianca, String nomeResponsavel){
        this.nomeCrianca = nomeCrianca;
        this.nomeResponsavel = nomeResponsavel;
    }

    public String getNomeCrianca(){
        return this.nomeCrianca;
    }    
    public String getNomeResponsavel(){
        return this.nomeResponsavel;
    }

    public void setAteDois(boolean ateDois){
        this.ateDois = ateDois;
    }
    public boolean getAteDois(){
        return this.ateDois;
    }

    public void setAteCinco(boolean ateCinco){
        this.ateCinco = ateCinco;
    }
    public boolean getAteCinco(){
        return this.ateCinco;
    }
    
    public void setAteOito(boolean ateOito){
        this.ateOito = ateOito;
    }
    public boolean getAteOito(){
        return this.ateOito;
    }
}