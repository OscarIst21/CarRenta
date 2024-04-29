
public class Cliente {
	String nombre;
	Carro carro;
	int dias;
	public Cliente(String nombre,Carro carro,int dias) {
		this.nombre=nombre;
		this.carro=carro;
		this.dias=dias;
	}
	public int getDias() {
		return dias;
	}
	public void setDias(int dias) {
		this.dias = dias;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	
}
