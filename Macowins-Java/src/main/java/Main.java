import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Prenda prenda=new Prenda();
        prenda.setPrecio(3455);
        prenda.setEstado(new Promocion(455));

        Venta venta= new Venta();
        Date fecha=new Date(2020,04,15);
        venta.setFecha(fecha);
        venta.setMedioDePago(new Efectivo());
        List<Prenda>lista = new ArrayList<Prenda>();
        lista.add(prenda);
        lista.add(prenda);
        venta.setPrendas(lista);
        List<Venta> listaVentas=new ArrayList<Venta>();
        listaVentas.add(venta);
        RegistroVentas registro = new RegistroVentas(listaVentas);

        System.out.println(registro.gananciaDelDia(fecha));

    }

}
