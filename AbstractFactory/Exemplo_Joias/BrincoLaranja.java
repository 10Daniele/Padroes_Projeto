public class BrincoLaranja implements brincoAbstrato{
    @Override
    public void interagir(colarAbstrato a) {
        System.out.println(this.getClass().getName() + " combina com " + a.getClass().getName());
    } 
}