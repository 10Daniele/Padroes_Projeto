class Main{
    public static void main(String args[]){
        MoldeBlusaManga moldeManga = new MoldeBlusaManga();

        Molde molde = new AdaptadorMangas(moldeManga); 
        molde.usaMoldeRegata();
        
        MoldeBlusaRegata moldeRegata = new MoldeBlusaRegata();
        moldeRegata.usaMoldeRegata();
    }
}