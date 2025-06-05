package supermercado;

public class Electronica extends Producto  {
	private String Marca;
	public Electronica (String nombre, int precio, String marca) {
		super(nombre, precio);
        this.Marca = marca;
	
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	
	public void informacion() {
	
		
	}
	
  
    
    }



