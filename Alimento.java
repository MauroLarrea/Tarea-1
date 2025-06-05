package supermercado;

public class Alimento extends Producto {
    private double fechaCaducidad;

    public Alimento(String nombre, int precio, double fechaCaducidad) {
        super(nombre, precio);
        this.fechaCaducidad = fechaCaducidad;
    }

	public double getFechaCaducidad() {
		return fechaCaducidad;
	}

	public void setFechaCaducidad(double fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}

    


		
	}
