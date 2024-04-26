
public class Carro {
	String marca,modelo,transmision,imagen;
	double precio;
	int puertas,equipaje;
	public Carro(String marca,String modelo,String transmision,int puertas,int equipaje,double precio,String imagen) {
		 this.marca = marca;
	        this.modelo = modelo;
	        this.transmision = transmision;
	        this.puertas = puertas;
	        this.equipaje = equipaje;
	        this.precio = precio;
	        this.imagen=imagen;
	    }
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getTransmision() {
		return transmision;
	}
	public void setTransmision(String transmision) {
		this.transmision = transmision;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public int getPuertas() {
		return puertas;
	}
	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}
	public int getEquipaje() {
		return equipaje;
	}
	public void setEquipaje(int equipaje) {
		this.equipaje = equipaje;
	}
	public String getImagen() {
		return imagen;
	}
	public void setImagen(String imagen) {
		this.imagen = imagen;
	}
	@Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(marca).append(" ").append(modelo).append("\n");
        sb.append(puertas).append(" Pasajeros").append("\n");
        sb.append("Aire Acondicionado").append("\n");
        sb.append("Cambio ").append(transmision).append("\n");
        sb.append(puertas).append(" Puertas").append("\n");
        sb.append(equipaje).append(" Equipaje    $").append(precio).append("/Día");
        
        return sb.toString();
    }
}
