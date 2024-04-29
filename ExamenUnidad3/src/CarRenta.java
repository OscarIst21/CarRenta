import java.awt.EventQueue;
import javax.swing.JFrame;
import java.security.SecureRandom;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.ComboBoxModel;
import java.awt.GridBagLayout;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import javax.swing.SwingConstants;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import java.awt.FlowLayout;
public class CarRenta extends JFrame {
	private JPanel contentPane;
	private JPanel panelPrincipal;
	private JPanel panel_1,panel_2;
	private JLabel lblNewLabel_2, lblNewLabel_3, lblNewLabel_4, lblNewLabel_5;
	private JLabel lblNewLabel_7, lblNewLabel_8, lblNewLabel_9, lblNewLabel_10;
	private JLabel lblNewLabel_11, lblNewLabel_12, lblNewLabel_13, lblNewLabel_14;
	private JLabel lblNewLabel_15, lblNewLabel_16, lblNewLabel_17, lblNewLabel_18;
	private JLabel lblNewLabel_19, lblNewLabel_20, lblNewLabel_21, lblNewLabel_23;
	private JLabel lblNewLabel_24, lblNewLabel_25, lblNewLabel_26, lblNewLabel_27;
	private JLabel lblNewLabel_28, lblNewLabel_29, lblNewLabel_32, lblNewLabel_33;
	private JLabel lblNewLabel_36, lblNewLabel_37, lblNewLabel_39, lblNewLabel_40;
	private JLabel lblNewLabel_41, lblNewLabel_42, lblNewLabel_43, lblNewLabel_44;
	private JLabel lblNewLabel_45, lblNewLabel_46, lblNewLabel_47, lblNewLabel_48;
	private JLabel lblNewLabel_49, lblNewLabel_50, lblNewLabel_51, lblNewLabel_51_1,lblNewLabel_51_1_1;
	private JComboBox comboBox_1,comboBox_2,comboBox_3;
	private JTextField textField, textField_1, textField_2, textField_3, textField_4, textField_5, textField_6, textField_7;
	private JPasswordField passwordField;
	private JButton btnNewButton_2, btnNewButton_3, btnNewButton_4, btnNewButton_5, btnNewButton_10,btnNewButton_6, btnNewButton_7, btnNewButton_8, btnNewButton_9,btnNewButton_13;
	private String usuario = "Invitado";
	private List<Carro> deportivosCompactos = new ArrayList<>();
	private List<Carro> muscleCars = new ArrayList<>();
	private List<Carro> deportivos = new ArrayList<>();
	private List<Cliente> clientes = new ArrayList<>();
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CarRenta frame = new CarRenta();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void iniciarCarros() {
		deportivosCompactos.add(new Carro("Toyota", "Celica", "Manual", 2, 1, 550.00,getClass().getResource("celicaC.jpg").getPath(),"deportivosCompactos"));
		deportivosCompactos.add(new Carro("Honda", "Civic", "Automatico", 2, 1, 500.00,getClass().getResource("hondaCivic.jpg").getPath(),"deportivosCompactos"));
		deportivosCompactos.add(new Carro("Mini", "Copper", "Manual", 2, 1, 610.00, getClass().getResource("miniCopper.jpg").getPath(),"deportivosCompactos"));
		deportivosCompactos.add(new Carro("Hyundai", "Tiburon", "Manual", 2, 1, 550.00, getClass().getResource("tiburon.jpg").getPath(),"deportivosCompactos"));
		deportivosCompactos.add(new Carro("Mazda", "MX-5 Miata", "Automatico", 2, 1, 550.00, getClass().getResource("miata.jpg").getPath(),"deportivosCompactos"));

		muscleCars.add(new Carro("Ford", "Mustang", "Manual", 2, 1, 800.00,getClass().getResource("mustang.jpg").getPath(),"muscleCars"));
		muscleCars.add(new Carro("Chevrolet", "Camaro", "Automático", 2, 1, 750.00,getClass().getResource("camaro.jpg").getPath(),"muscleCars"));
		muscleCars.add(new Carro("Dodge", "Challenger", "Manual", 2, 1, 820.00,getClass().getResource("challenger.jpg").getPath(),"muscleCars"));
		muscleCars.add(new Carro("Dodge", "Barracuda", "Manual", 2, 1, 830.00,getClass().getResource("barracuda.jpg").getPath(),"muscleCars"));
		muscleCars.add(new Carro("Chevrolet", "Chevelle", "Automático", 2, 1, 790.00,getClass().getResource("chevelle.jpg").getPath(),"muscleCars"));

		deportivos.add(new Carro("Chevrolet", "Corvette", "Manual", 2, 1, 900.00,getClass().getResource("Corvette.jpg").getPath(),"deportivos"));
		deportivos.add(new Carro("Mitsubishi", "Eclipse", "Manual", 2, 1, 1250.00,getClass().getResource("eclipse.jpg").getPath(),"deportivos"));
		deportivos.add(new Carro("Nissan", "GT-R", "Automático", 2, 1, 1200.00,getClass().getResource("gtr34.jpg").getPath(),"deportivos"));
		deportivos.add(new Carro("Toyota", "Supra", "Manual", 2, 1, 1200.00,getClass().getResource("supramk4.jpg").getPath(),"deportivos"));
		deportivos.add(new Carro("BMW", "M4", "Automático", 2, 1, 950.00,getClass().getResource("m4.jpg").getPath(),"deportivos"));
		deportivos.add(new Carro("Nissan", "Tsuru", "Manual", 4, 1, 1950.00,getClass().getResource("tsuru.jpg").getPath(),"deportivos"));
		
		clientes.add(new Cliente("Jose", new Carro("Honda", "Civic", "Automatico", 4, 1, 750.00,getClass().getResource("civic.jpg").getPath(),"deportivosCompactos"),1));
		clientes.add(new Cliente("Mateo", new Carro("Ford", "Shelby", "Manual", 2, 1, 850.00,getClass().getResource("shelbyY.jpg").getPath(),"deportivos"),12));
		clientes.add(new Cliente("Julian", new Carro("Mitsubishi", "Lancer", "Manual", 4, 1, 850.00,getClass().getResource("lancer.jpg").getPath(),"deportivos"),2));
		clientes.add(new Cliente("Camilo", new Carro("Dodge", "Charger", "Manual", 4, 1, 950.00,getClass().getResource("dodgeCharge.jpg").getPath(),"muscleCars"),6));
	}
	public CarRenta() {
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 1200, 720);
	    setLocationRelativeTo(null);
	    setResizable(false);
        setTitle("FASTKING Car Renta");
	    iniciarCarros();
	    contentPane = new JPanel();
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentPane);
	    contentPane.setLayout(new BorderLayout(0, 0));
	    panelPrincipal = new JPanel();
	    panelPrincipal.setBackground(Color.white);
	    contentPane.add(panelPrincipal);
	    panelPrincipal.setLayout(null);
		inicio(); 
	}
	public void inicio() {
		panelPrincipal.setBackground(Color.black);
		JLabel lblNewLabel = new JLabel();
		lblNewLabel.setIcon(new ImageIcon(getClass().getResource("Portada.png")));
		lblNewLabel.setBounds(0, 0, 475, 690);
		panelPrincipal.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("FASTKING ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 70));
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(596, 0, 420, 231);
		panelPrincipal.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("CAR");
		lblNewLabel_1_1.setForeground(Color.WHITE);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 70));
		lblNewLabel_1_1.setBounds(596, 100, 420, 231);
		panelPrincipal.add(lblNewLabel_1_1);
		
		
		JLabel lblNewLabel_1_2 = new JLabel("Renta de carros Baja");
		lblNewLabel_1_2.setForeground(Color.WHITE);
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblNewLabel_1_2.setBounds(606, 242, 446, 152);
		panelPrincipal.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel(" California Sur");
		lblNewLabel_1_2_1.setForeground(Color.WHITE);
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 38));
		lblNewLabel_1_2_1.setBounds(596, 256, 446, 231);
		panelPrincipal.add(lblNewLabel_1_2_1);
		
		JButton btnNewButton = new JButton("Iniciar Sesión");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 24));
		btnNewButton.setFocusable(false);
		btnNewButton.setForeground(Color.white);
		btnNewButton.setBackground(new Color(155, 43, 33));
		btnNewButton.setBounds(695, 489, 212, 74);
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	panelPrincipal.removeAll();
                login();
                repaint();
            }
        });
		panelPrincipal.add(btnNewButton);
	}
	public void login() {
		panelPrincipal.setBackground(Color.white);
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(getClass().getResource("loginImagen.png")));
		lblNewLabel_2.setBounds(516, 0, 680, 684);
		lblNewLabel_2.setOpaque(true);
		
		panelPrincipal.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("KING");
		lblNewLabel_3.setForeground(new Color(155, 43, 33));
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 80));
		lblNewLabel_3.setBounds(234, 26, 238, 159);
		panelPrincipal.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("FAST");
		lblNewLabel_4.setForeground(new Color(0, 0, 0));
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 80));
		lblNewLabel_4.setBounds(34, 26, 238, 159);
		panelPrincipal.add(lblNewLabel_4);
		
		lblNewLabel_5 = new JLabel("Ingrese su nombre");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_5.setBounds(102, 210, 257, 28);
		panelPrincipal.add(lblNewLabel_5);
		
		textField = new JTextField();
		textField.setBounds(102, 249, 310, 35);
		panelPrincipal.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_5_1 = new JLabel("Ingrese su contraseña");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 26));
		lblNewLabel_5_1.setBounds(102, 363, 292, 28);
		panelPrincipal.add(lblNewLabel_5_1);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(10);
		passwordField.setBounds(102, 402, 310, 35);
		panelPrincipal.add(passwordField);
		
		JButton btnNewButton_1 = new JButton("Iniciar sesión");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_1.setFocusable(false);
		btnNewButton_1.setForeground(Color.white);
		btnNewButton_1.setBackground(new Color(155, 43, 33));
		btnNewButton_1.setBounds(102, 513, 310, 50);
		btnNewButton_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textField.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "El nombre de usuario no puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
                } 
                else if (passwordField.getPassword().length == 0) {
                    JOptionPane.showMessageDialog(null, "La contraseña no puede estar vacía.", "Error", JOptionPane.ERROR_MESSAGE);
                } 
                else {
                    panelPrincipal.removeAll();
                    usuario = textField.getText();
                    menu();
                    repaint();
                }
            }
        });
		panelPrincipal.add(btnNewButton_1);
		JButton volverBoton = new JButton("Volver");
		volverBoton.setFont(new Font("Tahoma", Font.BOLD, 20));
		volverBoton.setFocusable(false);
		volverBoton.setForeground(Color.white);
		volverBoton.setBackground(Color.black);
		volverBoton.setBounds(102, 570, 310, 50);
		volverBoton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelPrincipal.removeAll();	
                inicio();
                repaint();
            }
        });
		panelPrincipal.add(volverBoton);
	}
	public void encabezado() {
		lblNewLabel_19 = new JLabel("KING");
		lblNewLabel_19.setForeground(new Color(155, 43, 33));
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_19.setBounds(107, 19, 71, 33);
		panelPrincipal.add(lblNewLabel_19);
		
		JLabel lblNewLabel_6 = new JLabel("      FAST");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_6.setBackground(new Color(0, 0, 0));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(0, 0, 1174, 70);
		lblNewLabel_6.setOpaque(true);
		panelPrincipal.add(lblNewLabel_6);
	}
	public void perfil() {
	 	lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(getClass().getResource("iconoUser.png")));
		lblNewLabel_17.setForeground(new Color(255, 255, 255));
		lblNewLabel_17.setBounds(933, 12, 53, 44);
		panelPrincipal.add(lblNewLabel_17);
		lblNewLabel_17 = new JLabel(usuario);
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_17.setForeground(new Color(255, 255, 255));
		lblNewLabel_17.setBounds(996, 9, 135, 56);
		panelPrincipal.add(lblNewLabel_17);
	}
	public void menu() {
	    panelPrincipal.setBackground(Color.white);
	    perfil();
		encabezado();
		lblNewLabel_7 = new JLabel("Menú");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_7.setBounds(539, 78, 122, 70);
		panelPrincipal.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(getClass().getResource("celica.jpg")));
		lblNewLabel_8.setBounds(117, 251, 284, 157);
		panelPrincipal.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(getClass().getResource("dodgechallenger.jpg")));
		lblNewLabel_9.setBounds(459, 251, 284, 157);
		panelPrincipal.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(getClass().getResource("shelby.jpg")));
		lblNewLabel_10.setBounds(799, 251, 284, 157);
		panelPrincipal.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Deportivo Compacto");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_11.setBounds(160, 215, 205, 25);
		panelPrincipal.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("Muscle Car");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_12.setBounds(539, 215, 110, 25);
		panelPrincipal.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("Deportivo");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_13.setBounds(888, 215, 110, 25);
		panelPrincipal.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("<html>Desde<br>MNX 500/día</html>");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_14.setBounds(196, 419, 122, 70);
		panelPrincipal.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("<html>Desde<br>MNX 650/día</html>");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_15.setBounds(539, 419, 122, 70);
		panelPrincipal.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("<html>Desde<br>MNX 950/día</html>");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_16.setBounds(878, 419, 122, 70);
		panelPrincipal.add(lblNewLabel_16);
		
		btnNewButton_2 = new JButton("Buscar");//Boton DeportivoCompacto
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setForeground(Color.white);
		btnNewButton_2.setBackground(Color.black);
		btnNewButton_2.setBounds(196, 516, 122, 56);
		btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelPrincipal.removeAll();
            	carrosPanel(deportivosCompactos);
                repaint();
            }
        });
		panelPrincipal.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Buscar");//muscle car
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setForeground(Color.white);
		btnNewButton_3.setBackground(Color.black);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(539, 516, 122, 56);
		btnNewButton_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelPrincipal.removeAll();
            	carrosPanel(muscleCars);
                repaint();
            }
        });
		panelPrincipal.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Buscar");
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.setForeground(Color.white);
		btnNewButton_4.setBackground(Color.black);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_4.setBounds(878, 516, 122, 56);
		btnNewButton_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelPrincipal.removeAll();
            	carrosPanel(deportivos);
                repaint();
            }
        });
		panelPrincipal.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Salir");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5.setFocusable(false);
		btnNewButton_5.setBackground(new Color(155, 43, 33));
		btnNewButton_5.setBounds(196, 87,122, 56);
		btnNewButton_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelPrincipal.removeAll();
            	login();
                repaint();
                revalidate();
            }
        });
		panelPrincipal.add(btnNewButton_5);
		
		JButton rentas = new JButton("Rentas");
		rentas.setForeground(Color.WHITE);
		rentas.setFont(new Font("Tahoma", Font.BOLD, 20));
		rentas.setFocusable(false);
		rentas.setBackground(Color.black);
		rentas.setBounds(878, 87, 122, 56);
		rentas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelPrincipal.removeAll();
            	clientesPanel(clientes);
                repaint();
            }
        });
		panelPrincipal.add(rentas);
	}
	public void carrosPanel(List<Carro> carros) {
		List<Carro> carrosLista=carros;
	    panelPrincipal.setBackground(Color.white);
		perfil();
		encabezado();
		String listaNombre="";
		if (carros.equals(deportivos)) {
		    listaNombre = "Deportivos";
		} else if (carros.equals(muscleCars)) {
		    listaNombre = "Muscle Cars";
		} else if (carros.equals(deportivosCompactos)) {
		    listaNombre = "Deportivos Compactos";
		} 
		JLabel titulo = new JLabel(listaNombre);
		titulo.setFont(new Font("Tahoma", Font.BOLD, 25));
		titulo.setHorizontalAlignment(SwingConstants.CENTER);
		titulo.setBounds(0, 81, 1200, 52);
		panelPrincipal.add(titulo);
		btnNewButton_6 = new JButton("Volver");
		btnNewButton_6.setForeground(Color.WHITE);
		btnNewButton_6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_6.setFocusable(false);
		btnNewButton_6.setBackground(new Color(155, 43, 33));
		btnNewButton_6.setBounds(41, 81, 118, 52);
		btnNewButton_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelPrincipal.removeAll();
				
                menu();
                repaint();
            }
        });
		panelPrincipal.add(btnNewButton_6);
		
		JPanel panel = new JPanel();
		panel.setBounds(41, 154, 1056, 506);
		panel.setBackground(Color.white);
		panelPrincipal.add(panel);
		panel.setLayout(new GridLayout(0,2, 0, 0));
		
		JButton btnNewButton_6_1 = new JButton("Nuevo carro");
		btnNewButton_6_1.setForeground(Color.WHITE);
		btnNewButton_6_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_6_1.setFocusable(false);
		btnNewButton_6_1.setBackground(Color.black);
		btnNewButton_6_1.setBounds(915, 81, 182, 52);
		btnNewButton_6_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelPrincipal.removeAll();
				Carro carro = null;
            	agregarCarro(carrosLista, carro);
                repaint();
            }
        });
		panelPrincipal.add(btnNewButton_6_1);
		JPanel[] panelA=new JPanel[carrosLista.size()];
		JPanel[] panelbtn=new JPanel[carrosLista.size()];
		JLabel[] blanco1=new JLabel[carrosLista.size()];
		JLabel[] blanco2=new JLabel[carrosLista.size()];
		for (int i = 0; i < carrosLista.size(); i++) {
            Carro carro = carrosLista.get(i);
            panelA[i] = new JPanel();
            panelA[i].setLayout(new GridLayout(0, 3, 0, 0));
            panelA[i].setBackground(Color.white);
            try {
                JLabel lblImagenCarro = new JLabel();
                lblImagenCarro.setIcon(new ImageIcon(carro.getImagen()));
                panelA[i].add(lblImagenCarro);
            }catch(Exception e) {}
            JLabel lblInfoCarro = new JLabel();
            lblInfoCarro.setText("<html>" + carro.getMarca() + " " + carro.getModelo() + "<br>"
                + carro.getPuertas() + " Pasajeros<br>"
                + "Aire Acondicionado<br>"
                + carro.getTransmision() + "<br>"
                + carro.getPuertas() + " Puertas<br>"
                + carro.getEquipaje() + " Equipaje<br>"
                + "$" + carro.getPrecio() + "/Día</html>");
            panelA[i].add(lblInfoCarro);
            panelbtn[i] = new JPanel();
            panelbtn[i].setLayout(new GridLayout(4, 0, 0, 0));
            panelbtn[i].setBackground(Color.white);
            
            blanco1[i]=new JLabel("            ");
            panelbtn[i].add(blanco1[i]);
            
            JButton editar=new JButton("Editar");
            editar.setForeground(Color.WHITE);
            editar.setFont(new Font("Tahoma", Font.BOLD, 20));
            editar.setFocusable(false);
            editar.setBackground(new Color(155, 43, 33));
            editar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	panelPrincipal.removeAll();
        	        editarCarro(carrosLista,carro);
        	        panelPrincipal.revalidate();
        	        panelPrincipal.repaint();
                }
            });
            panelbtn[i].add(editar);
            JButton reservar=new JButton("Reservar");
            reservar.setForeground(Color.WHITE);
            reservar.setFont(new Font("Tahoma", Font.BOLD, 20));
            reservar.setFocusable(false);
            reservar.setBackground(Color.black);
            reservar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	panelPrincipal.removeAll();
        	        reservarCarro(carrosLista,carro);
                    repaint();
                }
            }); 
            panelbtn[i].add(reservar);
            blanco2[i]=new JLabel("            ");
            panelbtn[i].add(blanco2[i]);
            
            panelA[i].add(panelbtn[i]);
            panel.add(panelA[i]);
        }
		contentPane.add(panelPrincipal);
        revalidate();
        repaint();
	}	
	public void agregarCarro(List<Carro> carros, Carro car) {
		List<Carro> carrosLista=carros;
	    panelPrincipal.setBackground(Color.white);
		panelPrincipal.removeAll();
		panelPrincipal.revalidate();
		panelPrincipal.repaint();
		encabezado();
		lblNewLabel_23 = new JLabel("Nuevo Vehículo");
		lblNewLabel_23.setForeground(new Color(0, 0, 0));
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_23.setBounds(506, 89, 201, 33);
		panelPrincipal.add(lblNewLabel_23);
		
		lblNewLabel_24 = new JLabel("Marca:");
		lblNewLabel_24.setForeground(Color.BLACK);
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_24.setBounds(318, 171, 87, 33);
		panelPrincipal.add(lblNewLabel_24);
		
		lblNewLabel_25 = new JLabel("Modelo:");
		lblNewLabel_25.setForeground(Color.BLACK);
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_25.setBounds(305, 227, 100, 33);
		panelPrincipal.add(lblNewLabel_25);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(415, 227, 172, 35);
		panelPrincipal.add(textField_2);
		
		lblNewLabel_26 = new JLabel("Trasmisión:");
		lblNewLabel_26.setForeground(Color.BLACK);
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_26.setBounds(258, 286, 147, 33);
		panelPrincipal.add(lblNewLabel_26);
		
		String[] marcasCarros = {"     ",
			    "Toyota", "Honda", "Ford", "Chevrolet", "Nissan",
			    "Volkswagen", "BMW", "Mercedes-Benz", "Audi", "Hyundai",
			    "Kia", "Mazda", "Subaru", "Lexus", "Jaguar",
			    "Land Rover", "Porsche", "Ferrari", "Lamborghini", "Tesla",
			    "Mitsubishi", "Volvo", "Acura", "Infiniti", "Chrysler"
			};
        JComboBox comboBox = new JComboBox(new DefaultComboBoxModel(marcasCarros));
        comboBox.setFont(new Font("Tahoma", Font.BOLD, 20));
        comboBox.setBounds(415, 173, 172, 33);
        panelPrincipal.add(comboBox);
        String[] trasmision= {"     ","Manual","Automatica"};
        comboBox_1 = new JComboBox(new DefaultComboBoxModel(trasmision));
        comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        comboBox_1.setBounds(415, 287, 172, 35);
        panelPrincipal.add(comboBox_1);
        
        lblNewLabel_27 = new JLabel("N. Puertas:");
        lblNewLabel_27.setForeground(Color.BLACK);
        lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel_27.setBounds(266, 343, 139, 33);
        panelPrincipal.add(lblNewLabel_27);
        String[] puertas= {"   ","2","4"};
        comboBox_2 = new JComboBox(new DefaultComboBoxModel(puertas));
        comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 20));
        comboBox_2.setBounds(415, 350, 172, 35);
        panelPrincipal.add(comboBox_2);
        
        lblNewLabel_28 = new JLabel("N. Equipaje:");
        lblNewLabel_28.setForeground(Color.BLACK);
        lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 22));
        lblNewLabel_28.setBounds(644, 228, 139, 33);
        panelPrincipal.add(lblNewLabel_28);
        String[] equipaje= {"  ","1","2"};
        comboBox_3 = new JComboBox(new DefaultComboBoxModel(equipaje));
        comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 20));
        comboBox_3.setBounds(793, 227, 172, 35);
        panelPrincipal.add(comboBox_3);
        
        lblNewLabel_29 = new JLabel("Precio/día MXN:");
        lblNewLabel_29.setForeground(Color.BLACK);
        lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel_29.setBounds(619, 173, 172, 33);
        panelPrincipal.add(lblNewLabel_29);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(793, 172, 172, 33);
        panelPrincipal.add(textField_1);
        
        textField_3 = new JTextField();
        textField_3.setEditable(false);
        textField_3.setColumns(10);
        textField_3.setBounds(793, 287, 172, 35);
        panelPrincipal.add(textField_3);
        
        btnNewButton_7 = new JButton("Seleccionar Imagen");
        btnNewButton_7.setBounds(636, 287, 147, 35);
        btnNewButton_7.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Jpg", "jpg"));
            fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Png", "png"));
            int returnValue = fileChooser.showOpenDialog(null);
            if (returnValue == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                textField_3.setText(selectedFile.getAbsolutePath());
            } else {
                JOptionPane.showMessageDialog(this, "Agrega una imagen valida");
            }
        });
        panelPrincipal.add(btnNewButton_7);
        JLabel categoria = new JLabel("Categoria:");
        categoria.setForeground(Color.BLACK);
        categoria.setFont(new Font("Tahoma", Font.BOLD, 20));
        categoria.setBounds(676, 343, 147, 35);
        panelPrincipal.add(categoria);
        String[] categorias= {"  ","deportivosCompactos","muscleCars","deportivos"};
        JComboBox categoriasBox = new JComboBox(new DefaultComboBoxModel(categorias));
        categoriasBox.setFont(new Font("Tahoma", Font.BOLD, 15));
        categoriasBox.setBounds(793, 343, 172, 35);
        panelPrincipal.add(categoriasBox);
        
        btnNewButton_8 = new JButton("Regresar");
        btnNewButton_8.setForeground(Color.WHITE);
		btnNewButton_8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_8.setFocusable(false);
		btnNewButton_8.setBackground(new Color(155, 43, 33));
		btnNewButton_8.setBounds(41, 81, 118, 52);
        btnNewButton_8.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        		panelPrincipal.removeAll();
        		carrosPanel(carros);
                repaint();
        	}
        });
        btnNewButton_8.setBounds(429, 581, 158, 49);
        panelPrincipal.add(btnNewButton_8);
        btnNewButton_9 = new JButton("Agregar");
        btnNewButton_9.setForeground(Color.WHITE);
        btnNewButton_9.setFont(new Font("Tahoma", Font.BOLD, 20));
        btnNewButton_9.setFocusable(false);
        btnNewButton_9.setBackground(Color.black);
        btnNewButton_9.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        	        if (comboBox.getSelectedItem() == null) {
        	            JOptionPane.showMessageDialog(null, "Seleccione una marca.");
        	            return;
        	        } if (textField_2.getText().isEmpty()) {
        	            JOptionPane.showMessageDialog(null, "Ingrese el modelo.");
        	            return;
        	        } if (comboBox_1.getSelectedIndex()==0) {
        	            JOptionPane.showMessageDialog(null, "Seleccione la transmisión.");
        	            return;
        	        }if (comboBox_2.getSelectedIndex()==0) {
        	            JOptionPane.showMessageDialog(null, "Seleccione el número de puertas.");
        	            return;
        	        }if (comboBox_3.getSelectedIndex()==0) {
        	            JOptionPane.showMessageDialog(null, "Seleccione el número de equipaje.");
        	            return;
        	        } if (textField_1.getText().isEmpty()) {
        	            JOptionPane.showMessageDialog(null, "Ingrese el precio en MNX.");
        	            return;
        	        }if (categoriasBox.getSelectedIndex()==0) {
        	            JOptionPane.showMessageDialog(null, "Seleccione una categoria.");
        	            return;
        	        }
        	        int num;
        	        try {
        	             num = Integer.parseInt(textField_1.getText()); 
        	        } catch (NumberFormatException f) {
        	            JOptionPane.showMessageDialog(null, "Ingrese el precio en numeros.");
        	            return;
        	        }if (textField_3.getText().isEmpty()) {
        	            JOptionPane.showMessageDialog(null, "Seleccione una imagen.");
        	            return;
        	        }
        	        String marca = comboBox.getSelectedItem().toString();
        	        String modelo = textField_2.getText();
        	        String transmision = comboBox_1.getSelectedItem().toString();
        	        String categoriaN = categoriasBox.getSelectedItem().toString();
        	        int puertas = Integer.parseInt(comboBox_2.getSelectedItem().toString());
        	        int capacidadEquipaje = Integer.parseInt(comboBox_3.getSelectedItem().toString());
        	        String imagen = textField_3.getText();
        	        Carro nuevoCarro = new Carro(marca, modelo, transmision, puertas, capacidadEquipaje, num, imagen,categoriaN);
        	        switch (categoriaN) {
        	        case "deportivosCompactos":
        	        	deportivosCompactos.add(nuevoCarro);
        	        	break;
        	        case "muscleCars":
        	        	muscleCars.add(nuevoCarro);
            	        break;
        	        case "deportivos":
        	        	deportivos.add(nuevoCarro);
        	        	break;
        	        }
        	            JOptionPane.showMessageDialog(null, "Vehículo agregado exitosamente.");
        	            panelPrincipal.removeAll();
                		carrosPanel(carros);
                        repaint();
        	        }
        });
        btnNewButton_9.setBounds(597, 581, 172, 49);
        panelPrincipal.add(btnNewButton_9);
	}
	public void editarCarro(List<Carro> carros, Carro carro) {
		panelPrincipal.removeAll();
		panelPrincipal.revalidate();
		panelPrincipal.repaint();
		encabezado();
	    JLabel lblTitulo = new JLabel("Editar Carro");
	    lblTitulo.setFont(new Font("Tahoma", Font.BOLD, 30));
	    lblTitulo.setBounds(459, 81, 200, 40);
	    panelPrincipal.add(lblTitulo);

	    JLabel lblMarca = new JLabel("Marca:");
	    lblMarca.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblMarca.setBounds(104, 153, 150, 30);
	    panelPrincipal.add(lblMarca);

	    JComboBox<String> comboMarca = new JComboBox<>(new String[] {
	        "Toyota", "Honda", "Ford", "Chevrolet", "Nissan",
	        "Volkswagen", "BMW", "Mercedes-Benz", "Audi", "Hyundai",
	        "Kia", "Mazda", "Subaru", "Lexus", "Jaguar",
	        "Land Rover", "Porsche", "Ferrari", "Lamborghini", "Tesla",
	        "Mitsubishi", "Volvo", "Acura", "Infiniti", "Chrysler"
	    });
	    comboMarca.setSelectedItem(carro.getMarca());
	    comboMarca.setBounds(254, 153, 200, 30);
	    panelPrincipal.add(comboMarca);

	    JLabel lblModelo = new JLabel("Modelo:");
	    lblModelo.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblModelo.setBounds(104, 203, 150, 30);
	    panelPrincipal.add(lblModelo);

	    JTextField txtModelo = new JTextField(carro.getModelo());
	    txtModelo.setBounds(254, 203, 200, 30);
	    panelPrincipal.add(txtModelo);

	    JLabel lblTransmision = new JLabel("Transmisión:");
	    lblTransmision.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblTransmision.setBounds(104, 253, 150, 30);
	    panelPrincipal.add(lblTransmision);

	    JComboBox<String> comboTransmision = new JComboBox<>(new String[] {"Manual", "Automática"});
	    comboTransmision.setSelectedItem(carro.getTransmision());
	    comboTransmision.setBounds(254, 253, 200, 30);
	    panelPrincipal.add(comboTransmision);

	    JLabel lblPuertas = new JLabel("N. Puertas:");
	    lblPuertas.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblPuertas.setBounds(104, 303, 150, 30);
	    panelPrincipal.add(lblPuertas);

	    JComboBox<Integer> comboPuertas = new JComboBox<>(new Integer[] {2, 4});
	    comboPuertas.setSelectedItem(carro.getPuertas());
	    comboPuertas.setBounds(254, 303, 200, 30);
	    panelPrincipal.add(comboPuertas);

	    JLabel lblEquipaje = new JLabel("Capacidad de equipaje:");
	    lblEquipaje.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblEquipaje.setBounds(104, 353, 200, 30);
	    panelPrincipal.add(lblEquipaje);

	    JComboBox<Integer> comboEquipaje = new JComboBox<>(new Integer[] {1, 2});
	    comboEquipaje.setSelectedItem(carro.getEquipaje());
	    comboEquipaje.setBounds(304, 353, 150, 30);
	    panelPrincipal.add(comboEquipaje);

	    JLabel lblPrecio = new JLabel("Precio por día MXN:");
	    lblPrecio.setFont(new Font("Tahoma", Font.BOLD, 16));
	    lblPrecio.setBounds(104, 403, 200, 30);
	    panelPrincipal.add(lblPrecio);

	    JTextField txtPrecio = new JTextField(String.valueOf(carro.getPrecio()));
	    txtPrecio.setBounds(304, 403, 150, 30);
	    panelPrincipal.add(txtPrecio);

	    JTextField txtImagen = new JTextField(carro.getImagen());
	    txtImagen.setBounds(114, 452, 165, 30);
	    panelPrincipal.add(txtImagen);

	    JButton btnSeleccionarImagen = new JButton("Seleccionar Imagen");
	    btnSeleccionarImagen.setBounds(304, 452, 150, 30);
	    btnSeleccionarImagen.addActionListener(e -> {
	        JFileChooser fileChooser = new JFileChooser();
	        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
	        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Imágenes", "jpg", "jpeg", "png"));
	        int resultado = fileChooser.showOpenDialog(null);
	        if (resultado == JFileChooser.APPROVE_OPTION) {
	            File imagenSeleccionada = fileChooser.getSelectedFile();
	            txtImagen.setText(imagenSeleccionada.getAbsolutePath());
	        }
	    });
	    panelPrincipal.add(btnSeleccionarImagen);
	    JButton btnGuardarCambios = new JButton("Guardar Cambios");
	    btnGuardarCambios.setForeground(Color.WHITE);
	    btnGuardarCambios.setFont(new Font("Tahoma", Font.BOLD, 16));
	    btnGuardarCambios.setFocusable(false);
	    btnGuardarCambios.setBackground(Color.black);
	    btnGuardarCambios.setBounds(570, 591, 180, 40);
	    btnGuardarCambios.addActionListener(e -> {
	        carro.setMarca((String) comboMarca.getSelectedItem());
	        carro.setModelo(txtModelo.getText());
	        carro.setTransmision((String) comboTransmision.getSelectedItem());
	        carro.setPuertas((int) comboPuertas.getSelectedItem());
	        carro.setEquipaje((int) comboEquipaje.getSelectedItem());
	        carro.setPrecio(Double.parseDouble(txtPrecio.getText()));
	        carro.setImagen(txtImagen.getText());
	        JOptionPane.showMessageDialog(null, "Cambios guardados correctamente.");
	        panelPrincipal.removeAll();
			menu();
            repaint();
	    });

	    panelPrincipal.add(btnGuardarCambios);
	    JButton btnRegresar = new JButton("Regresar");
	    btnRegresar.setForeground(Color.WHITE);
	    btnRegresar.setFont(new Font("Tahoma", Font.BOLD, 20));
	    btnRegresar.setFocusable(false);
	    btnRegresar.setBackground(new Color(155, 43, 33));
	    btnRegresar.setBounds(369, 589, 180, 40);
	    btnRegresar.addActionListener(e -> {
	    	panelPrincipal.removeAll();
	        carrosPanel(carros);
            repaint();
	    });
	    panelPrincipal.add(btnRegresar);
	    
	    JPanel panel = new JPanel();
	    panel.setBounds(540, 153, 566, 287);
	    panelPrincipal.add(panel);
	    panel.setLayout(new GridLayout(0, 2, 0, 0));
	    
	    JLabel lblNewLabel_30 = new JLabel("         ");
	    lblNewLabel_30.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_30.setVerticalAlignment(SwingConstants.CENTER);
	    lblNewLabel_30.setIcon(new ImageIcon(carro.getImagen()));
	    panel.add(lblNewLabel_30);
	    
	    JLabel lblNewLabel_31 = new JLabel();
	    lblNewLabel_31.setFont(new Font("Tahoma", Font.PLAIN, 27));
	    lblNewLabel_31.setText("<html>" + carro.getMarca() + " " + carro.getModelo() + "<br>"
                + carro.getPuertas() + " Pasajeros<br>"
                + "Aire Acondicionado<br>"
                + carro.getTransmision() + "<br>"
                + carro.getPuertas() + " Puertas<br>"
                + carro.getEquipaje() + " Equipaje<br>"
                + "$" + carro.getPrecio() + "/Día</html>");
	    panel.add(lblNewLabel_31);
	    
	    JButton btnEliminar = new JButton("Eliminar");
	    btnEliminar.setForeground(Color.WHITE);
	    btnEliminar.setFont(new Font("Tahoma", Font.BOLD, 16));
	    btnEliminar.setFocusable(false);
	    btnEliminar.setBackground(Color.BLACK);
	    btnEliminar.setBounds(768, 445, 180, 40);
	    btnEliminar.addActionListener(e -> {
	        int confirmacion = JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres eliminar este carro?", "Confirmar eliminación", JOptionPane.YES_NO_OPTION);
	        if (confirmacion == JOptionPane.YES_OPTION) {
	            deportivosCompactos.remove(carro);
	            JOptionPane.showMessageDialog(null, "Carro eliminado correctamente.");
	            panelPrincipal.removeAll();
	            menu();
                repaint();
	        }
	    });
	    panelPrincipal.add(btnEliminar);
	    panelPrincipal.revalidate();
	    panelPrincipal.repaint();
	}
	
	public void reservarCarro(List<Carro> carros, Carro carro) {
    	Cliente nuevoCliente = new Cliente(" ", carro,1);
		panelPrincipal.setBackground(Color.white);
		perfil();
		List<Carro> carrosLista=carros;
		panelPrincipal.revalidate();
		panelPrincipal.repaint();
		String ticketID=generarTicketAleatorio();
		panelPrincipal.setBackground(new Color(89, 89, 89));
	    encabezado();
	    lblNewLabel_32 = new JLabel();
	    lblNewLabel_32.setBorder(new LineBorder(Color.black, 5));
	    lblNewLabel_32.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_32.setVerticalAlignment(SwingConstants.CENTER);
	    lblNewLabel_32.setIcon(new ImageIcon(carro.getImagen()));
	    lblNewLabel_32.setBounds(76, 156, 267, 213);
	    panelPrincipal.add(lblNewLabel_32);

	    JTextField cliente = new JTextField();
	    cliente.setBounds(514, 176, 183, 30);
	    panelPrincipal.add(cliente);
	    lblNewLabel_33 = new JLabel("Cliente: ");
	    lblNewLabel_33.setHorizontalAlignment(SwingConstants.LEFT);
	    lblNewLabel_33.setBorder(new LineBorder(Color.black, 1));
	    lblNewLabel_33.setForeground(new Color(255, 255, 255));
	    lblNewLabel_33.setBackground(new Color(31, 32, 38));
	    lblNewLabel_33.setOpaque(true);
	    lblNewLabel_33.setFont(new Font("Tahoma", Font.BOLD, 20));
	    lblNewLabel_33.setBounds(400, 166, 309, 53);
	    panelPrincipal.add(lblNewLabel_33);

	    lblNewLabel_36 = new JLabel("<html>Incluido en la reservación<br>Cobertura contra daños al vehículo<br>Protección Contra Terceros<br>Cobertura contra robo<br>El mejor precio garantizado<br>Kilometraje libre<br>Tarifas de la compañía de renta<br>Sin tarifas por cambios</html>");
	    lblNewLabel_36.setForeground(new Color(255, 255, 255));
	    lblNewLabel_36.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_36.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblNewLabel_36.setBounds(76, 380, 261, 166);
	    panelPrincipal.add(lblNewLabel_36);

	    panel_2 = new JPanel();
	    panel_2.setBounds(514, 240, 183, 38);
	    panelPrincipal.add(panel_2);
	    panel_2.setLayout(new GridLayout(0, 3, 0, 0));

	    JComboBox<Integer> comboBox_4 = new JComboBox<>();
	    JComboBox<String> comboBox_5 = new JComboBox<>();
	    JComboBox<Integer> comboBox = new JComboBox<>();
	    JComboBox<Integer> comboBox_6 = new JComboBox<>();
	    JComboBox<String> comboBox_7 = new JComboBox<>();
	    JComboBox<Integer> comboBox8 = new JComboBox<>();
	    for (int i = 1; i <= 31; i++) {
	        comboBox_4.addItem(i); 
	        comboBox_6.addItem(i);
	    }
	    String[] meses = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};
	    for (String mes : meses) {
	        comboBox_5.addItem(mes); 
	        comboBox_7.addItem(mes);
	    }
	    for (int i = 2024; i <= 2030; i++) {
	        comboBox.addItem(i); 
	        comboBox8.addItem(i);
	    }
	    panel_2.add(comboBox_4);
	    panel_2.add(comboBox_5);
	    panel_2.add(comboBox);
	    
	    lblNewLabel_37 = new JLabel("   Fecha inicial:");
	    lblNewLabel_37.setOpaque(true);
	    lblNewLabel_37.setForeground(Color.WHITE);
	    lblNewLabel_37.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblNewLabel_37.setBorder(new LineBorder(Color.black, 1));
	    lblNewLabel_37.setBackground(new Color(31, 32, 38));
	    lblNewLabel_37.setBounds(400, 231, 309, 59);
	    panelPrincipal.add(lblNewLabel_37);
	    
	    JPanel panel_2_1 = new JPanel();
	    panel_2_1.setBounds(514, 310, 183, 38);
	    panel_2_1.setLayout(new GridLayout(0, 3, 0, 0));
	    panel_2_1.add(comboBox_6);
	    panel_2_1.add(comboBox_7);
	    panel_2_1.add(comboBox8);
	    panelPrincipal.add(panel_2_1);
	    JLabel lblNewLabel_37_1 = new JLabel("   Fecha Final:");
	    lblNewLabel_37_1.setOpaque(true);
	    lblNewLabel_37_1.setForeground(Color.WHITE);
	    lblNewLabel_37_1.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblNewLabel_37_1.setBorder(new LineBorder(Color.black, 1));
	    lblNewLabel_37_1.setBackground(new Color(31, 32, 38));
	    lblNewLabel_37_1.setBounds(400, 301, 309, 59);
	    panelPrincipal.add(lblNewLabel_37_1);
	    
	    JComboBox<String> comboBox_8 = new JComboBox<>();
	    comboBox_8.setBounds(906, 179, 155, 28);
	    comboBox_8.addItem("Visa");
	    comboBox_8.addItem("Cheque");
	    comboBox_8.addItem("Efectivo");
	    comboBox_8.setBounds(906, 179, 155, 28);
	    panelPrincipal.add(comboBox_8);
	    
	    JLabel lblNewLabel_37_2 = new JLabel("   Metodo de pago:");
	    lblNewLabel_37_2.setHorizontalAlignment(SwingConstants.LEFT);
	    lblNewLabel_37_2.setOpaque(true);
	    lblNewLabel_37_2.setForeground(Color.WHITE);
	    lblNewLabel_37_2.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblNewLabel_37_2.setBorder(new LineBorder(Color.black, 1));
	    lblNewLabel_37_2.setBackground(new Color(31, 32, 38));
	    lblNewLabel_37_2.setBounds(764, 166, 309, 53);
	    panelPrincipal.add(lblNewLabel_37_2);
	    
	    textField_4 = new JTextField(ticketID);
	    textField_4.setEditable(false);
	    textField_4.setBounds(906, 248, 155, 28);
	    panelPrincipal.add(textField_4);
	    textField_4.setColumns(10);
	    
	    JLabel lblNewLabel_37_2_1 = new JLabel("           ID ticket:");
	    lblNewLabel_37_2_1.setOpaque(true);
	    lblNewLabel_37_2_1.setHorizontalAlignment(SwingConstants.LEFT);
	    lblNewLabel_37_2_1.setForeground(Color.WHITE);
	    lblNewLabel_37_2_1.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblNewLabel_37_2_1.setBorder(new LineBorder(Color.black, 1));
	    lblNewLabel_37_2_1.setBackground(new Color(31, 32, 38));
	    lblNewLabel_37_2_1.setBounds(764, 231, 309, 59);
	    panelPrincipal.add(lblNewLabel_37_2_1);
	    
	    JButton btnNewButton_11 = new JButton("Volver");
	    btnNewButton_11.setForeground(Color.WHITE);
	    btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 20));
	    btnNewButton_11.setFocusable(false);
	    btnNewButton_11.setBackground(new Color(155, 43, 33));
	    btnNewButton_11.setFont(new Font("Tahoma", Font.BOLD, 20));
	    btnNewButton_11.setBounds(76, 81, 102, 53);
	    btnNewButton_11.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        		panelPrincipal.removeAll();
	        		carrosPanel(carrosLista);
	                repaint();
	        	}
	        });
	    panelPrincipal.add(btnNewButton_11);
	    
	    JLabel lblNewLabel_34 = new JLabel("Reservar: "+carro.getMarca()+" "+carro.getModelo());
	    lblNewLabel_34.setForeground(new Color(255, 255, 255));
	    lblNewLabel_34.setFont(new Font("Tahoma", Font.BOLD, 30));
	    lblNewLabel_34.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_34.setBounds(359, 81, 410, 53);
	    panelPrincipal.add(lblNewLabel_34);
	    
	    JLabel lblNewLabel_35_1_1_2 = new JLabel();
	    lblNewLabel_35_1_1_2.setText("Total de dias: ");
	    lblNewLabel_35_1_1_2.setHorizontalAlignment(SwingConstants.LEFT);
	    lblNewLabel_35_1_1_2.setForeground(Color.WHITE);
	    lblNewLabel_35_1_1_2.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblNewLabel_35_1_1_2.setBounds(400, 473, 309, 38);
	    panelPrincipal.add(lblNewLabel_35_1_1_2);

	    JLabel lblNewLabel_35_1_1_2_1 = new JLabel();
	    JButton btnNewButton_12_1 = new JButton("Pagar");
	    btnNewButton_12_1.setForeground(Color.WHITE);
	    btnNewButton_12_1.setFont(new Font("Tahoma", Font.BOLD, 20));
	    btnNewButton_12_1.setFocusable(false);
	    btnNewButton_12_1.setBackground(new Color(155, 43, 33));
	    btnNewButton_12_1.setFont(new Font("Tahoma", Font.BOLD, 20));
	    btnNewButton_12_1.setBounds(764, 438, 309, 53);
	    btnNewButton_12_1.setEnabled(false);
	    lblNewLabel_40 = new JLabel();
	    btnNewButton_12_1.addActionListener(e -> {
    	 	JDialog ticketDialog = new JDialog(this, "Ticket de Reserva", true);
        	nuevoCliente.setNombre(cliente.getText());
    	    ticketDialog.setSize(300, 500);
    	    ticketDialog.setLayout(null);
		    lblNewLabel_40.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    lblNewLabel_40.setHorizontalAlignment(SwingConstants.RIGHT);
		    lblNewLabel_40.setBounds(120, 11, 145, 25);
		    ticketDialog.add(lblNewLabel_40);
		    JLabel lblNewLabel_50 = new JLabel(ticketID);
		    lblNewLabel_50.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    lblNewLabel_50.setHorizontalAlignment(SwingConstants.LEFT);
		    lblNewLabel_50.setBounds(0, 11, 145, 25);
		    ticketDialog.add(lblNewLabel_50);
		    lblNewLabel_41 = new JLabel("Cliente: "+nuevoCliente.getNombre());
		    lblNewLabel_41.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    lblNewLabel_41.setBounds(25, 72, 223, 25);
		    ticketDialog.add(lblNewLabel_41);
		    JLabel lblNewLabel_55 = new JLabel("Arrentador: "+usuario);
		    lblNewLabel_55.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    lblNewLabel_55.setBounds(25, 87, 223, 25);
		    ticketDialog.add(lblNewLabel_55);
		    lblNewLabel_39 = new JLabel("Tu reserva "+carro.getMarca()+" "+carro.getModelo());
		    lblNewLabel_39.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    lblNewLabel_39.setBounds(25, 108, 255, 25);
		    ticketDialog.add(lblNewLabel_39);
		    
		    lblNewLabel_44 = new JLabel("Valor del vehículo MXN$ "+carro.getPrecio());
		    lblNewLabel_44.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    lblNewLabel_44.setBounds(25, 132, 255, 25);
		    ticketDialog.add(lblNewLabel_44);
		    
		    lblNewLabel_45 = new JLabel("Por 1 dia");
		    lblNewLabel_45.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    lblNewLabel_45.setBounds(25, 158, 255, 25);
		    ticketDialog.add(lblNewLabel_45);
		    
		    lblNewLabel_46 = new JLabel(lblNewLabel_35_1_1_2.getText());
		    lblNewLabel_46.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    lblNewLabel_46.setBounds(25, 187, 255, 25);
		    ticketDialog.add(lblNewLabel_46);
		    
		    lblNewLabel_47 = new JLabel(lblNewLabel_35_1_1_2_1.getText());
		    lblNewLabel_47.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    lblNewLabel_47.setBounds(25, 213, 255, 25);
		    ticketDialog.add(lblNewLabel_47);
		    
		    lblNewLabel_48 = new JLabel("_____________________________");
		    lblNewLabel_48.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    lblNewLabel_48.setBounds(25, 276, 255, 25);
		    ticketDialog.add(lblNewLabel_48);
		    
		    lblNewLabel_49 = new JLabel("Pago realizado con "+comboBox_8.getSelectedItem());
		    lblNewLabel_49.setFont(new Font("Tahoma", Font.PLAIN, 15));
		    lblNewLabel_49.setBounds(25, 300, 255, 25);
		    ticketDialog.add(lblNewLabel_49);
		    btnNewButton_13 = new JButton("Imprimir");
		    btnNewButton_13.setBounds(100, 390, 100, 40);
		    btnNewButton_13.setFocusable(false);
		    btnNewButton_13.addActionListener(f -> {
		    	clientes.add(nuevoCliente);
		    	 switch (carro.getCategoria()) {
     	        case "deportivosCompactos":
     	            deportivosCompactos.remove(carro);
     	            break;
     	        case "muscleCars":
     	            muscleCars.remove(carro);
     	            break;
     	        case "deportivos":
     	            deportivos.remove(carro);
     	            break;
     	    }
		        JOptionPane.showMessageDialog(ticketDialog, "Ticket impreso");
		        ticketDialog.dispose();
        		panelPrincipal.removeAll();
        		menu();
                repaint();
		    });
		    ticketDialog.add(btnNewButton_13);
		    ticketDialog.setLocationRelativeTo(this);
		    ticketDialog.setVisible(true);
	    });
	    panelPrincipal.add(btnNewButton_12_1);
	    
	    JButton btnNewButton_12 = new JButton("Calcular costo");
	    btnNewButton_12.setForeground(Color.WHITE);
	    btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 20));
	    btnNewButton_12.setFocusable(false);
	    btnNewButton_12.setBackground(Color.black);
	    btnNewButton_12.setFont(new Font("Tahoma", Font.BOLD, 15));
	    btnNewButton_12.setBounds(764, 301, 309, 53);
	    btnNewButton_12.addActionListener(e -> {
	        int diaInicio = comboBox_4.getSelectedIndex() + 1; // Días del 1 al 31
	        int mesInicio = comboBox_5.getSelectedIndex() + 1; // Meses de 1 a 12 (enero a diciembre)
	        int añoInicio = (int) comboBox.getSelectedItem(); // Años (2024-2030)
	        
	        int diaFinal = comboBox_6.getSelectedIndex() + 1; // Días del 1 al 31
	        int mesFinal = comboBox_7.getSelectedIndex() + 1; // Meses de 1 a 12 (enero a diciembre)
	        int añoFinal = (int) comboBox8.getSelectedItem(); // Años (2024-2030)
	        
	        LocalDate fechaInicio = LocalDate.of(añoInicio, mesInicio, diaInicio);
	        LocalDate fechaFinal = LocalDate.of(añoFinal, mesFinal, diaFinal);
	        
	        if (fechaFinal.isAfter(fechaInicio)) {
	            long dias = ChronoUnit.DAYS.between(fechaInicio, fechaFinal);
	            nuevoCliente.setDias((int)dias);
	            double precioDiario = carro.getPrecio();
	            double costoTotal = dias * precioDiario;
	            int dia = fechaInicio.getDayOfMonth();
	            int mes = fechaInicio.getMonthValue();
	            int año = fechaInicio.getYear();
	            String fechaInicioString = dia + "/" + mes + "/" + año;
	            lblNewLabel_40.setText(fechaInicioString);
	            lblNewLabel_35_1_1_2.setText("Total de días: " + dias);
	    	    lblNewLabel_35_1_1_2_1.setText("Monto total                MXN$ ");
	    	    lblNewLabel_35_1_1_2_1.setHorizontalAlignment(SwingConstants.LEFT);
	    	    lblNewLabel_35_1_1_2_1.setForeground(Color.WHITE);
	    	    lblNewLabel_35_1_1_2_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	    	    lblNewLabel_35_1_1_2_1.setBounds(400, 496, 409, 38);
	    	    panelPrincipal.add(lblNewLabel_35_1_1_2_1);
	            lblNewLabel_35_1_1_2_1.setText("Monto total: MXN$ " + String.format("%.2f", costoTotal));
	            btnNewButton_12_1.setEnabled(true);
	            JOptionPane.showMessageDialog(null, "Costo calculado correctamente.");
	            
	        } else {
	            JOptionPane.showMessageDialog(null, "La fecha final debe ser posterior a la fecha inicial.", "Error", JOptionPane.ERROR_MESSAGE);
	        }
	    });
	    panelPrincipal.add(btnNewButton_12);
	    
	    JLabel lblNewLabel_35 = new JLabel();
	    lblNewLabel_35.setForeground(new Color(255, 255, 255));
	    lblNewLabel_35.setFont(new Font("Tahoma", Font.BOLD, 15));
	    lblNewLabel_35.setText("Tu reserva en FastKing");
	    
	    lblNewLabel_35.setHorizontalAlignment(SwingConstants.CENTER);
	    lblNewLabel_35.setBounds(400, 370, 309, 38);
	    panelPrincipal.add(lblNewLabel_35);
	    
	    JLabel lblNewLabel_35_1 = new JLabel();
	    lblNewLabel_35_1.setText("5.0/104 opiones ");
	    lblNewLabel_35_1.setHorizontalAlignment(SwingConstants.RIGHT);
	    lblNewLabel_35_1.setForeground(Color.WHITE);
	    lblNewLabel_35_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblNewLabel_35_1.setBounds(400, 393, 323, 38);
	    panelPrincipal.add(lblNewLabel_35_1);
	    
	    JLabel lblNewLabel_35_1_1 = new JLabel();
	    lblNewLabel_35_1_1.setText("Valor del vehículo   MXN$ "+String.valueOf(carro.getPrecio()));
	    lblNewLabel_35_1_1.setHorizontalAlignment(SwingConstants.LEFT);
	    lblNewLabel_35_1_1.setForeground(Color.WHITE);
	    lblNewLabel_35_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblNewLabel_35_1_1.setBounds(400, 419, 309, 38);
	    panelPrincipal.add(lblNewLabel_35_1_1);
	    
	    JLabel lblNewLabel_35_1_1_1 = new JLabel();
	    lblNewLabel_35_1_1_1.setText("Precio por 1 DÍA");
	    lblNewLabel_35_1_1_1.setHorizontalAlignment(SwingConstants.LEFT);
	    lblNewLabel_35_1_1_1.setForeground(Color.WHITE);
	    lblNewLabel_35_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
	    lblNewLabel_35_1_1_1.setBounds(400, 447, 309, 38);
	    panelPrincipal.add(lblNewLabel_35_1_1_1);

	    JLabel lblNewLabel_38 = new JLabel();
	    lblNewLabel_38.setBorder(new LineBorder(Color.black, 2));
	    lblNewLabel_38.setBounds(359, 376, 729, 175);
	    panelPrincipal.add(lblNewLabel_38);
	    
	    JLabel lblNewLabel_38_1 = new JLabel();
	    lblNewLabel_38_1.setBorder(new LineBorder(Color.black, 2));
	    lblNewLabel_38_1.setBounds(359, 156, 729, 213);
	    panelPrincipal.add(lblNewLabel_38_1);
	    
	    JLabel lblNewLabel_38_1_1 = new JLabel();
	    lblNewLabel_38_1_1.setBorder(new LineBorder(Color.black, 2));
	    lblNewLabel_38_1_1.setBounds(76, 376, 267, 175);
	    panelPrincipal.add(lblNewLabel_38_1_1);
	}
	public void clientesPanel(List<Cliente> clientes) {
		System.out.println();
	    panelPrincipal.setBackground(Color.white);
	    panelPrincipal.removeAll();
	    panelPrincipal.revalidate();
	    panelPrincipal.repaint();
	    perfil();
	    encabezado();
	    lblNewLabel_7 = new JLabel("Rentas");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_7.setBounds(524, 78, 152, 70);
		panelPrincipal.add(lblNewLabel_7);
	    JButton volverButton = new JButton("Volver");
	    volverButton.setForeground(Color.WHITE);
	    volverButton.setFont(new Font("Tahoma", Font.BOLD, 20));
	    volverButton.setFocusable(false);
	    volverButton.setBackground(new Color(155, 43, 33));
	    volverButton.setBounds(41, 81, 118, 52);
	    volverButton.addActionListener(e -> {
	        panelPrincipal.removeAll();
	        menu();
	        repaint();
	    });
	    panelPrincipal.add(volverButton);
	    JPanel panelClientes = new JPanel();
	    panelClientes.setBounds(41, 154, 1056, 506);
	    panelClientes.setBackground(Color.white);
	    panelPrincipal.add(panelClientes);
	    panelClientes.setLayout(new GridLayout(0, 2, 0, 0));

	    for (Cliente cliente : clientes) {
	        Carro carro = cliente.getCarro();
	        JPanel panelCliente = new JPanel();
	        panelCliente.setBounds(0, 0, 500, 100);
	        panelCliente.setLayout(new GridLayout(0, 3, 0, 0));
	        panelCliente.setBackground(Color.white);

	        JLabel carroIcon = new JLabel();
	        carroIcon.setIcon(new ImageIcon(carro.getImagen()));
	        carroIcon.setFont(new Font("Tahoma", Font.BOLD, 20));
	        panelCliente.add(carroIcon);

            JPanel infoBtn = new JPanel();
            infoBtn.setLayout(new GridLayout(4, 1, 0, 0));
            JLabel blanco=new JLabel("     ");
            infoBtn.add(blanco);
            infoBtn.setBackground(Color.white);
	        if (carro != null) {
	            JLabel carroLabel = new JLabel();
	            carroLabel.setText("<html>" +"Cliente: "+cliente.getNombre()+"<br>"
	            	+"Renta echa por: "+usuario+"<br>"
	            	+"Auto reservado: "+ carro.getMarca() + " " + carro.getModelo() + "<br>"
	                + "Precio por día: MXN$" + carro.getPrecio() +"<br>"
	                + "Cantidad de dias: "+cliente.getDias()+"<br>"
	                + "</html>");
	            carroLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
	            panelCliente.add(carroLabel);
	            JPanel panelBtn=new JPanel();
	            panelBtn.setLayout(new GridLayout(2, 1, 0, 0));
	            JButton eliminarButton = new JButton("Eliminar");
	            eliminarButton.setFont(new Font("Tahoma", Font.BOLD, 20));
	            eliminarButton.setFocusable(false);
	            eliminarButton.setBackground(new Color(155, 43, 33));
	            eliminarButton.setForeground(Color.WHITE);
	            eliminarButton.addActionListener(e -> {
	            	Cliente clienteAEliminar = null;
                    System.out.println(carro.getCategoria());
	                for (Cliente clientee : clientes) {
	                    if (clientee.getNombre().equals(cliente.getNombre())) {
	                        clienteAEliminar = cliente;
	                        break;
	                    }
	                }
	                if (clienteAEliminar != null) {
	                    Carro carroRentado = clienteAEliminar.getCarro();
	                    System.out.println(carroRentado.getCategoria());
	                    switch (carroRentado.getCategoria()) {
	        	        case "deportivosCompactos":
	        	            deportivosCompactos.add(carro);
	        	            break;
	        	        case "muscleCars":
	        	            muscleCars.add(carro);
	        	            break;
	        	        case "deportivos":
	        	            deportivos.add(carro);
	        	            break;
	        	    }
	                    clientes.remove(clienteAEliminar);
	                } panelPrincipal.removeAll(); 
	                clientesPanel(clientes); 
	                panelPrincipal.revalidate(); 
	                panelPrincipal.repaint();
	                
	            });
	            
	            infoBtn.add(eliminarButton);
	            JButton editarRenta = new JButton("Editar");
	            editarRenta.setFont(new Font("Tahoma", Font.BOLD, 20));
	            editarRenta.setFocusable(false);
	            editarRenta.setBackground(Color.black);
	            editarRenta.setForeground(Color.WHITE);
	            editarRenta.addActionListener(e -> {
	            	panelPrincipal.removeAll(); 
	                editarCliente(cliente); 
	                panelPrincipal.revalidate(); 
	                panelPrincipal.repaint();
	            });
	            infoBtn.add(editarRenta);
	        }
	        JLabel blanco1=new JLabel("     ");
            infoBtn.add(blanco1);
	        panelCliente.add(infoBtn);
	        panelClientes.add(panelCliente);
	    }
	    panelPrincipal.add(panelClientes);
	    panelPrincipal.revalidate();
	    panelPrincipal.repaint();
	}
	public void editarCliente(Cliente cliente)	{
			encabezado();
			Carro carroEdit=cliente.getCarro();
		 	JButton btnGuardarCambios = new JButton("Guardar Cambios");
		    btnGuardarCambios.setForeground(Color.WHITE);
		    btnGuardarCambios.setFont(new Font("Tahoma", Font.BOLD, 16));
		    btnGuardarCambios.setFocusable(false);
		    btnGuardarCambios.setBackground(Color.black);
		    btnGuardarCambios.setBounds(570, 589, 180, 40);
		    btnGuardarCambios.addActionListener(e -> {
		    	String nuevoNombre = textField_5.getText().trim();
		        String diasText = textField_6.getText().trim();
		        String precioText = textField_7.getText().trim();
		        if (nuevoNombre.isEmpty() || diasText.isEmpty() || precioText.isEmpty()) {
		            JOptionPane.showMessageDialog(null, "Todos los campos deben estar llenos.", "Error", JOptionPane.ERROR_MESSAGE);
		            return;
		        }
		        int nuevosDias;
		        double nuevoPrecio;
		        try {
		            nuevosDias = Integer.parseInt(diasText);
		            if(nuevosDias<1) {JOptionPane.showMessageDialog(null, "Ingrese una cantidad de días que sea valida", "Error", JOptionPane.ERROR_MESSAGE);
		            return;}
		            nuevoPrecio = Double.parseDouble(precioText);
		        } catch (NumberFormatException ex) {
		            JOptionPane.showMessageDialog(null, "Ingrese valores numéricos válidos en los campos de días y precio.", "Error", JOptionPane.ERROR_MESSAGE);
		            return;
		        }
		        cliente.setNombre(nuevoNombre);
		        cliente.setDias(nuevosDias);
		        carroEdit.setPrecio(nuevoPrecio);
		        JOptionPane.showMessageDialog(null, "Cambios guardados correctamente.");
		        panelPrincipal.removeAll();
	    		clientesPanel(clientes);
		        panelPrincipal.revalidate();
		        panelPrincipal.repaint();
		    });

		    panelPrincipal.add(btnGuardarCambios);

		    JButton btnRegresar = new JButton("Regresar");
		    btnRegresar.setForeground(Color.WHITE);
		    btnRegresar.setFont(new Font("Tahoma", Font.BOLD, 20));
		    btnRegresar.setFocusable(false);
		    btnRegresar.setBackground(new Color(155, 43, 33));
		    btnRegresar.setBounds(369, 589, 180, 40);
		    btnRegresar.addActionListener(e -> {
		    		panelPrincipal.removeAll();
		    		clientesPanel(clientes);
			        panelPrincipal.revalidate();
			        panelPrincipal.repaint();
		    });
		    panelPrincipal.add(btnRegresar);
			JLabel lblNewLabel_50 = new JLabel("Editar Reserva");
			lblNewLabel_50.setFont(new Font("Tahoma", Font.BOLD, 30));
			lblNewLabel_50.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel_50.setBounds(0, 70, 1174, 70);
			panelPrincipal.add(lblNewLabel_50);
			
			JLabel lblNewLabel_51 = new JLabel("Cliente: ");
			lblNewLabel_51.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_51.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_51.setBounds(146, 201, 136, 38);
			panelPrincipal.add(lblNewLabel_51);
			
			JLabel lblNewLabel_51_1 = new JLabel("C/días: ");
			lblNewLabel_51_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_51_1.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_51_1.setBounds(146, 301, 136, 38);
			panelPrincipal.add(lblNewLabel_51_1);
			
			JLabel lblNewLabel_51_1_1 = new JLabel("Precio/Dias: ");
			lblNewLabel_51_1_1.setHorizontalAlignment(SwingConstants.RIGHT);
			lblNewLabel_51_1_1.setFont(new Font("Tahoma", Font.BOLD, 20));
			lblNewLabel_51_1_1.setBounds(146, 401, 136, 38);
			panelPrincipal.add(lblNewLabel_51_1_1);
			
			textField_5 = new JTextField(cliente.getNombre());
			textField_5.setBounds(292, 201, 136, 40);
			panelPrincipal.add(textField_5);
			textField_5.setColumns(10);
			
			textField_6 = new JTextField(cliente.getDias()+"");
			textField_6.setColumns(10);
			textField_6.setBounds(292, 301, 136, 40);
			panelPrincipal.add(textField_6);
			
			textField_7 = new JTextField(carroEdit.getPrecio()+"");
			textField_7.setColumns(10);
			textField_7.setBounds(292, 401, 136, 40);
			panelPrincipal.add(textField_7);
			
			JPanel panel = new JPanel();
			panel.setBounds(570, 201, 476, 238);
			panelPrincipal.add(panel);
			panel.setLayout(new GridLayout(0, 2, 0, 0));
			
			JLabel lblNewLabel_53 = new JLabel("");
			lblNewLabel_53.setIcon(new ImageIcon(carroEdit.getImagen()));
			panel.add(lblNewLabel_53);
			
			JLabel lblNewLabel_52 = new JLabel("<html>" +"Cliente: "+cliente.getNombre()+"<br>"
	            	+"Renta echa por: "+usuario+"<br>"
	            	+"Auto reservado: "+ carroEdit.getMarca() + " " + carroEdit.getModelo() + "<br>"
	                + "Precio por día: MXN$" + carroEdit.getPrecio() +"<br>"
	                + "Cantidad de dias: "+cliente.getDias()+"<br>"
	                + "</html>");
			lblNewLabel_52.setFont(new Font("Tahoma", Font.BOLD, 20));
			panel.add(lblNewLabel_52);
	}
	public String generarTicketAleatorio() {
	    Random random = new Random();
	    long ticketAleatorio = 1_000_000_000_000L + (long) (random.nextDouble() * 9_000_000_000_000L);
	    return String.valueOf(ticketAleatorio);
	}
}


