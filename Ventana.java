package mi_ventana_mauro;
import java.awt.*;
import javax.swing.*;
public class Ventana extends JFrame{ 
	public Ventana() {
		
		this.setTitle("Registrar Usuario");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        //this.setResizable(false);
        this.setVisible(true);
		this.setLayout(new BorderLayout());
        String[] Hola = {"Estudiante","Profe"};
		
	
		JPanel p = new JPanel();
		JPanel ph = new JPanel();
		JPanel pv2 = new JPanel();
		JPanel pv1 = new JPanel();
		
		JLabel j1 = new JLabel("Nombre");
		JLabel j2 = new JLabel("Apellido");
		JLabel j3 = new JLabel("Cedula");
		JLabel j4 = new JLabel("Edad");
		JLabel j5 = new JLabel("Rol");
		
		JTextField input1 = new JTextField("Escribe aqui");
		JTextField input2 = new JTextField("Escribe aqui");
		JTextField input3 = new JTextField("Escribe aqui");
		JTextField input4 = new JTextField("Escribe aqui");		
		
		JComboBox jc = new JComboBox(Hola);
		JButton jb = new JButton("Aceptar");
		
		pv1.setLayout(new BoxLayout(pv1,BoxLayout.Y_AXIS));
		pv2.setLayout(new BoxLayout(pv2,BoxLayout.Y_AXIS));
		ph.setLayout(new BoxLayout(ph,BoxLayout.X_AXIS));
		
		p.add(ph);
		ph.add(pv1);
		ph.add(pv2);
		pv1.add(j1);
		pv1.add(j2);
		pv1.add(j3);
		pv1.add(j4);
		pv1.add(j5);
		pv2.add(input1);
		pv2.add(input2);
		pv2.add(input3);
		pv2.add(input4);
		pv2.add(jc);
		pv2.add(jb);
		
		
		
		
		this.add(p);
		
	
		this.setVisible(true);
		
		
		
		
	
		
		
	
		

 
	}

}
