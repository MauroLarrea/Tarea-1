package supermercado;

public class Ropa extends Producto {
	private String Talla;
	
		

	    public Ropa(String nombre, int precio, String talla) {
	        super(nombre, precio);
	        this.Talla = talla;
	    }



		public String getTalla() {
			return Talla;
		}



		public void setTalla(String talla) {
			Talla = talla;
		}

	   
	        
	        
}
	        
	        
	    
