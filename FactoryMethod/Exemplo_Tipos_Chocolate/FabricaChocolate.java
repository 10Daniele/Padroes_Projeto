public final class FabricaChocolate{
    public static Chocolate getChocolate(int chocolate) {
        if(chocolate == 0){
            return new Branco();
        }
        else if (chocolate == 1){
            return new AoLeite();
        }
        else{
            return new MeioAmargo();
        }
    }
}