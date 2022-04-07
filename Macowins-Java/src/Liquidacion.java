public class Liquidacion implements Estado  {
    @Override
    public double descuento(double precioPrenda)
    {
        return precioPrenda/2;
    }
}
