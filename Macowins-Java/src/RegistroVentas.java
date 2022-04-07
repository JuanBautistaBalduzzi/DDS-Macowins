import java.util.Date;
import java.util.List;

public class RegistroVentas {
    public List<Venta> ventas;
    public double gananciaDelDia(Date fecha)
    {
        return ventas.stream().filter(venta-> venta.fechaDeVenta(fecha)).mapToDouble(venta->venta.totalVenta()).sum();
    }
    public RegistroVentas(List<Venta> ventas)
    {
        this.ventas=ventas;
    }
}
