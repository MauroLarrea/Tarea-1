package supermercado;
import java.util.Scanner;
public class Main  {

	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	 
	      Electronica l = new Electronica(null,0,null);
	     System.out.println("ingrese Nombre del producto electronico: ");
	     l.setNombre(scanner.next());
	     System.out.println("Ingrese Precio: ");
	     l.setPrecio(scanner.nextInt());
	     System.out.println("Ingrese Marca: ");
	     l.setMarca(scanner.next());
	     
	     System.out.println("Nombre del producto: "+l.getNombre());
	     System.out.println("Precio del producto: "+l.getPrecio());
	     System.out.println("Marca del producto: "+l.getMarca());
	     
	     
	     Ropa R = new Ropa(null,0,null);
	     System.out.println("ingrese Prenda: ");
	     R.setNombre(scanner.next());
	     System.out.println("Ingrese Precio: ");
	     R.setPrecio(scanner.nextInt());
	     System.out.println("Ingrese Marca: ");
	     R.setTalla(scanner.next());
	     
	     System.out.println("Nombre de la prenda: "+R.getNombre());
	     System.out.println("Precio de la prenda: "+R.getPrecio());
	     System.out.println("Talle de la prenda: "+R.getTalla());
	     
	     
	     
	     Alimento A = new Alimento(null,0,0);
	     System.out.println("ingrese Alimento: ");
	     A.setNombre(scanner.next());
	     System.out.println("Ingrese Precio: ");
	     A.setPrecio(scanner.nextInt());
	     System.out.println("Ingrese fecha de caducidad: ");
	     A.setFechaCaducidad(scanner.nextDouble());
	     
	     System.out.println("Nombre del alimento : "+A.getNombre());
	     System.out.println("Precio del alimento : "+A.getPrecio());
	     System.out.println("Talle del alimento : "+A.getFechaCaducidad());
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	 
	 
	 
	 
	 
	 
	 }
	 
	 
}
