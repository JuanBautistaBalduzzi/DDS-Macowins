public class Prenda {

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    private double precio;
    private Estado estado;
    private String tipo;

    public  double precioDeVenta(){
        return this.precio-this.estado.descuento(this.precio);
    }
}
