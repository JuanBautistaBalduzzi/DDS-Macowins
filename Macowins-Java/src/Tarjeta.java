public class Tarjeta implements MedioDePago
{
    private int cuotas;
    private double interes;
    @Override
    public double recargo(double monto) {
        return this.cuotas*this.interes+ monto*0.01;
    }
    public Tarjeta(int cuotas,double interes)
    {
        this.cuotas=cuotas;
        this.interes=interes;
    }
}
