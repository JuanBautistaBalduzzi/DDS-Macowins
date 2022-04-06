/** First Wollok example */
object registroVentas {
	const property ventas=[]
	method GananciaDelDia(fecha) {
		return ventas.filter({venta=>venta.FechaDeVenta(fecha)}).sum({venta=>venta.TotalVenta()})
	}
}

class Ventas{
	const property prendas=[]
	var property fecha
	var property medioDePago
	
	method SumaTotal(){
		return prendas.sum({prenda=>prenda.PrecioDeVenta()})
	}
	method TotalVenta(){
		return self.SumaTotal()+medioDePago.Recargo(self.SumaTotal())
	}
	method FechaDeVenta(fechaVenta){
		return fechaVenta==self.fecha()
	}
}

class Prenda{
	var property precio
	var property estado
	
	method PrecioDeVenta(){
		return self.precio()-estado.descuento(precio)
	}
}

object efectivo{
	method Recargo(monto)=0
}

class Targeta{
	var property cuotas
	var property interes
	
	method Recargo(monto)= cuotas*interes+ monto*0.01
	
}

class Promocion{
	var property montoDescuento
	method Descuento(precioPrenda)=montoDescuento
}

object liquidacion{
	method Descuento(precioPrenda)=precioPrenda*0.5
}

object nuevo{
	method Descuento(precioPrenda)=0
}

