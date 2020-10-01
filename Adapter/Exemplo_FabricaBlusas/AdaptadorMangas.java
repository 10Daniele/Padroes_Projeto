public class AdaptadorMangas implements Molde{   
    private MoldeBlusaManga moldeBlusaManga;

    public AdaptadorMangas(MoldeBlusaManga moldeBlusaManga){
        this.moldeBlusaManga = moldeBlusaManga;
    }

    public void usaMoldeRegata(){
        moldeBlusaManga.usaMoldeManga();
    }
}  