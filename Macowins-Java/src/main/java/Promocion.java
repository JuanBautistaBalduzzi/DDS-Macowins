public class Promocion implements Estado {
    private double montoDescuento;
    @Override
    public double descuento(double precioPrenda)
    {
        return this.montoDescuento;
    }
    public Promocion(double montoDescuento)
    {
        this.montoDescuento=montoDescuento;
    }
}
