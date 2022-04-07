import java.util.Date;
import java.util.List;

public class Venta {
    public void setPrendas(List<Prenda> prendas) {
        this.prendas = prendas;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public void setMedioDePago(MedioDePago medioDePago) {
        this.medioDePago = medioDePago;
    }

    private List<Prenda> prendas;
    private Date fecha;
    private MedioDePago medioDePago;

    public double sumaTotal(){
        return   prendas.stream().mapToDouble(prenda -> prenda.precioDeVenta()).sum();
    }
    public double totalVenta(){
        double montoVenta = this.sumaTotal();
        return montoVenta+this.medioDePago.recargo(montoVenta);
    }
    public boolean fechaDeVenta(Date fecha){
        return fecha==this.fecha;
    }
}
