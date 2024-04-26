import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
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
import javax.swing.JFileChooser;
import javax.swing.ComboBoxModel;

public class CarRenta extends JFrame {
	private JScrollBar scrollBar = new JScrollBar();
	private JPanel contentPane;
	JPanel panelPrincipal;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel lblNewLabel_5;
	private JTextField textField;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_7;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JLabel lblNewLabel_11;
	private JLabel lblNewLabel_12;
	private JLabel lblNewLabel_13;
	private JLabel lblNewLabel_14;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_16;
	private JButton btnNewButton_2;
	private JButton btnNewButton_3;
	private JButton btnNewButton_4;
	private JButton btnNewButton_5;
	private String usuario="Invitado";
	private JLabel lblNewLabel_17;
	private JLabel lblNewLabel_18;
	private JLabel lblNewLabel_19;
	private JButton btnNewButton_6;
	private JLabel lblNewLabel_20;
	private List<Carro> deportivosCompactos = new ArrayList<>();
	private List<Carro> muscleCars = new ArrayList<>();
	private JLabel lblNewLabel_21;
	private JLabel lblNewLabel_23;
	private JLabel lblNewLabel_24;
	private JLabel lblNewLabel_25;
	private JTextField textField_2;
	private JLabel lblNewLabel_26;
	private JComboBox comboBox_1;
	private JLabel lblNewLabel_27;
	private JComboBox comboBox_2;
	private JLabel lblNewLabel_28;
	private JComboBox comboBox_3;
	private JLabel lblNewLabel_29;
	private JTextField textField_1;
	private JButton btnNewButton_7;
	private JTextField textField_3;
	private JButton btnNewButton_8;
	private JButton btnNewButton_9;
	/**
	 * Launch the application.
	 */
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

	/**
	 * Create the frame.
	 */
	public void iniciarCarros() {
		
		deportivosCompactos.add(new Carro("Toyota", "Celica", "Manual", 2, 1, 550.00, getClass().getResource("celicaC.jpg").getPath()));
		deportivosCompactos.add(new Carro("Honda", "Civic", "Automatico", 2, 1, 500.00, "hondaCivic.jpg"));
		deportivosCompactos.add(new Carro("Mini", "Copper", "Manual", 2, 1, 610.00, "miniCopper.jpg"));
		deportivosCompactos.add(new Carro("Hyundai", "Tiburon", "Manual", 2, 1, 550.00, "tiburon.jpg"));
		deportivosCompactos.add(new Carro("Hyundai", "Tiburon", "Manual", 2, 1, 550.00, "tiburon.jpg"));

		muscleCars.add(new Carro("pene", "Celica", "Manual", 2, 1, 550.00, "celicaC.jpg"));
		muscleCars.add(new Carro("Honda", "Civic", "Automatico", 2, 1, 500.00, "hondaCivic.jpg"));
		muscleCars.add(new Carro("Toyota", "Celica", "Manual", 2, 1, 550.00, "celicaC.jpg"));
		muscleCars.add(new Carro("Toyota", "Celica", "Manual", 2, 1, 550.00, "celicaC.jpg"));
		
		
	}
	public CarRenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 720);
		setLocationRelativeTo(null);
		setResizable(false);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.white);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		
		iniciarCarros();
		deportivosCompactosPanel();
		//inicio();
		
       
	}
	
	public void scrollPanel() {
		scrollBar = new JScrollBar(JScrollBar.VERTICAL);
        scrollBar.setBounds(1157, 70, 17, 700);
        scrollBar.setMinimum(0);
        scrollBar.setMaximum(100);
        scrollBar.setValue(0);
        scrollBar.setVisibleAmount(10); 

        scrollBar.addAdjustmentListener(new AdjustmentListener() {
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                int valorDesplazamiento = scrollBar.getValue();
                panelPrincipal.setLocation(panelPrincipal.getLocation().x, -valorDesplazamiento);
            }
        });
	
     panelPrincipal.add(scrollBar);
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
            @Override
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
	
	public void menu() {
		

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
		
		JLabel lblNewLabel_6 = new JLabel("      FASTKING");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_6.setBackground(new Color(155, 43, 33));
		lblNewLabel_6.setForeground(new Color(255, 255, 255));
		lblNewLabel_6.setBounds(0, 0, 1174, 70);
		lblNewLabel_6.setOpaque(true);
		panelPrincipal.add(lblNewLabel_6);
		
		lblNewLabel_7 = new JLabel("Menú");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 40));
		lblNewLabel_7.setBounds(539, 57, 122, 70);
		panelPrincipal.add(lblNewLabel_7);
		
		lblNewLabel_8 = new JLabel("");
		lblNewLabel_8.setIcon(new ImageIcon(getClass().getResource("celica.jpg")));
		lblNewLabel_8.setBounds(112, 195, 284, 157);
		panelPrincipal.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("");
		lblNewLabel_9.setIcon(new ImageIcon(getClass().getResource("dodgechallenger.jpg")));
		lblNewLabel_9.setBounds(458, 195, 284, 157);
		panelPrincipal.add(lblNewLabel_9);
		
		lblNewLabel_10 = new JLabel("");
		lblNewLabel_10.setIcon(new ImageIcon(getClass().getResource("shelby.jpg")));
		lblNewLabel_10.setBounds(798, 195, 284, 157);
		panelPrincipal.add(lblNewLabel_10);
		
		lblNewLabel_11 = new JLabel("Deportivo Compacto");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_11.setBounds(160, 159, 205, 25);
		panelPrincipal.add(lblNewLabel_11);
		
		lblNewLabel_12 = new JLabel("Muscle Car");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_12.setBounds(531, 159, 110, 25);
		panelPrincipal.add(lblNewLabel_12);
		
		lblNewLabel_13 = new JLabel("Deportivo");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel_13.setBounds(890, 159, 110, 25);
		panelPrincipal.add(lblNewLabel_13);
		
		JLabel lblNewLabel_14 = new JLabel("<html>Desde<br>MNX 500/día</html>");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_14.setBounds(196, 349, 122, 70);
		panelPrincipal.add(lblNewLabel_14);
		
		lblNewLabel_15 = new JLabel("<html>Desde<br>MNX 650/día</html>");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_15.setBounds(539, 349, 122, 70);
		panelPrincipal.add(lblNewLabel_15);
		
		lblNewLabel_16 = new JLabel("<html>Desde<br>MNX 950/día</html>");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_16.setBounds(878, 349, 122, 70);
		panelPrincipal.add(lblNewLabel_16);
		
		btnNewButton_2 = new JButton("Buscar");//Boton DeportivoCompacto
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setForeground(Color.white);
		btnNewButton_2.setBackground(Color.black);
		btnNewButton_2.setBounds(196, 446, 122, 56);
		btnNewButton_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelPrincipal.removeAll();
            	deportivosCompactosPanel();
                repaint();
            }
        });
		panelPrincipal.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Buscar");//muscle car
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setForeground(Color.white);
		btnNewButton_3.setBackground(Color.black);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(539, 446, 122, 56);
		btnNewButton_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelPrincipal.removeAll();
            	muscleCarPanel();
                repaint();
            }
        });
		panelPrincipal.add(btnNewButton_3);
		
		btnNewButton_4 = new JButton("Buscar");
		btnNewButton_4.setFocusable(false);
		btnNewButton_4.setForeground(Color.white);
		btnNewButton_4.setBackground(Color.black);
		btnNewButton_4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_4.setBounds(878, 446, 122, 56);
		panelPrincipal.add(btnNewButton_4);
		
		btnNewButton_5 = new JButton("Volver y salir");
		btnNewButton_5.setForeground(Color.WHITE);
		btnNewButton_5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_5.setFocusable(false);
		btnNewButton_5.setBackground(new Color(155, 43, 33));
		btnNewButton_5.setBounds(458, 587, 284, 56);
		btnNewButton_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	panelPrincipal.removeAll();
				
                login();
                repaint();
            }
        });
		panelPrincipal.add(btnNewButton_5);
		
	}
	
	public void deportivosCompactosPanel() {
		
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
				
            	agregarCarro();
                repaint();
            }
        });
		panelPrincipal.add(btnNewButton_6_1);
		
		lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(getClass().getResource("iconoUser.png")));
		lblNewLabel_17.setForeground(new Color(255, 255, 255));
		lblNewLabel_17.setBounds(499, 81, 49, 52);
		panelPrincipal.add(lblNewLabel_17);
		
		JLabel lblNewLabel_22 = new JLabel(usuario);
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_22.setBounds(547, 81, 135, 52);
		panelPrincipal.add(lblNewLabel_22);
		
		JPanel[] panelA=new JPanel[deportivosCompactos.size()];
		JPanel[] panelbtn=new JPanel[deportivosCompactos.size()];
		JLabel[] blanco1=new JLabel[deportivosCompactos.size()];
		JLabel[] blanco2=new JLabel[deportivosCompactos.size()];
		
		for (int i = 0; i < deportivosCompactos.size(); i++) {
            Carro carro = deportivosCompactos.get(i);

            panelA[i] = new JPanel();
            panelA[i].setLayout(new GridLayout(0, 3, 0, 0));
            panelA[i].setBackground(Color.white);
            // Crear JLabel para la imagen del coche
            try {
                JLabel lblImagenCarro = new JLabel();
                //lblImagenCarro.setIcon(new ImageIcon(getClass().getResource(carro.getImagen())));
                lblImagenCarro.setIcon(new ImageIcon(carro.getImagen()));
                panelA[i].add(lblImagenCarro);
            }catch(Exception e) {}
            

            // Crear JLabel para la información del coche
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
    				
                    menu();
                    repaint();
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
    				
                    menu();
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
	
	public void muscleCarPanel() {
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
		panelPrincipal.add(panel);
		panel.setLayout(new GridLayout(0,2, 0, 0));
		
		JButton btnNewButton_6_1 = new JButton("Nuevo carro");
		btnNewButton_6_1.setForeground(Color.WHITE);
		btnNewButton_6_1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_6_1.setFocusable(false);
		btnNewButton_6_1.setBackground(Color.black);
		btnNewButton_6_1.setBounds(915, 81, 182, 52);
		panelPrincipal.add(btnNewButton_6_1);
		
		lblNewLabel_17 = new JLabel("");
		lblNewLabel_17.setIcon(new ImageIcon(getClass().getResource("iconoUser.png")));
		lblNewLabel_17.setForeground(new Color(255, 255, 255));
		lblNewLabel_17.setBounds(499, 81, 49, 52);
		panelPrincipal.add(lblNewLabel_17);
		
		JLabel lblNewLabel_22 = new JLabel(usuario);
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel_22.setBounds(547, 81, 135, 52);
		panelPrincipal.add(lblNewLabel_22);
		
		JPanel[] panelA=new JPanel[muscleCars.size()];
		JPanel[] panelbtn=new JPanel[muscleCars.size()];
		JLabel[] blanco1=new JLabel[muscleCars.size()];
		JLabel[] blanco2=new JLabel[muscleCars.size()];
		
		for (int i = 0; i < muscleCars.size(); i++) {
            Carro carro = muscleCars.get(i);

            panelA[i] = new JPanel();
            panelA[i].setLayout(new GridLayout(0, 3, 0, 0));
            // Crear JLabel para la imagen del coche
            JLabel lblImagenCarro = new JLabel();
            lblImagenCarro.setIcon(new ImageIcon(getClass().getResource(carro.getImagen())));
            panelA[i].add(lblImagenCarro);

            // Crear JLabel para la información del coche
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
    				
                    menu();
                    repaint();
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
    				
                    menu();
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
	
	public void agregarCarro() {
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
		
		lblNewLabel_23 = new JLabel("Nuevo Vehículo");
		lblNewLabel_23.setForeground(new Color(0, 0, 0));
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_23.setBounds(489, 86, 201, 33);
		panelPrincipal.add(lblNewLabel_23);
		
		lblNewLabel_24 = new JLabel("Marca:");
		lblNewLabel_24.setForeground(Color.BLACK);
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_24.setBounds(489, 171, 87, 33);
		panelPrincipal.add(lblNewLabel_24);
		
		lblNewLabel_25 = new JLabel("Modelo:");
		lblNewLabel_25.setForeground(Color.BLACK);
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_25.setBounds(476, 222, 100, 33);
		panelPrincipal.add(lblNewLabel_25);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(597, 227, 172, 35);
		panelPrincipal.add(textField_2);
		
		lblNewLabel_26 = new JLabel("Trasmisión:");
		lblNewLabel_26.setForeground(Color.BLACK);
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel_26.setBounds(429, 278, 147, 33);
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
        comboBox.setBounds(597, 173, 165, 33);
        panelPrincipal.add(comboBox);
        String[] trasmision= {"     ","Manual","Automatica"};
        comboBox_1 = new JComboBox(new DefaultComboBoxModel(trasmision));
        comboBox_1.setFont(new Font("Tahoma", Font.BOLD, 20));
        comboBox_1.setBounds(597, 273, 172, 46);
        panelPrincipal.add(comboBox_1);
        
        lblNewLabel_27 = new JLabel("N. Puertas:");
        lblNewLabel_27.setForeground(Color.BLACK);
        lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel_27.setBounds(439, 335, 147, 33);
        panelPrincipal.add(lblNewLabel_27);
        String[] puertas= {"   ","2","4"};
        comboBox_2 = new JComboBox(new DefaultComboBoxModel(puertas));
        comboBox_2.setFont(new Font("Tahoma", Font.BOLD, 20));
        comboBox_2.setBounds(597, 330, 172, 46);
        panelPrincipal.add(comboBox_2);
        
        lblNewLabel_28 = new JLabel("N. Equipaje:");
        lblNewLabel_28.setForeground(Color.BLACK);
        lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel_28.setBounds(429, 400, 158, 33);
        panelPrincipal.add(lblNewLabel_28);
        String[] equipaje= {"  ","1","2"};
        comboBox_3 = new JComboBox(new DefaultComboBoxModel(equipaje));
        comboBox_3.setFont(new Font("Tahoma", Font.BOLD, 20));
        comboBox_3.setBounds(597, 395, 172, 46);
        panelPrincipal.add(comboBox_3);
        
        lblNewLabel_29 = new JLabel("Precio MNX:");
        lblNewLabel_29.setForeground(Color.BLACK);
        lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 25));
        lblNewLabel_29.setBounds(429, 457, 158, 33);
        panelPrincipal.add(lblNewLabel_29);
        
        textField_1 = new JTextField();
        textField_1.setColumns(10);
        textField_1.setBounds(597, 455, 172, 35);
        panelPrincipal.add(textField_1);
        
        
        textField_3 = new JTextField();
        textField_3.setEditable(false);
        textField_3.setColumns(10);
        textField_3.setBounds(597, 501, 172, 35);
        panelPrincipal.add(textField_3);
        
        btnNewButton_7 = new JButton("Seleccionar Imagen");
        btnNewButton_7.setBounds(440, 501, 147, 35);
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
        
        btnNewButton_8 = new JButton("Regresar");
        btnNewButton_8.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
        		panelPrincipal.removeAll();
        		deportivosCompactosPanel();
                repaint();
        	}
        });
        btnNewButton_8.setBounds(429, 581, 158, 49);
        panelPrincipal.add(btnNewButton_8);
        
        btnNewButton_9 = new JButton("Agregar");
        btnNewButton_9.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		

        	        if (comboBox.getSelectedItem() == null) {
        	            JOptionPane.showMessageDialog(null, "Seleccione una marca.");
        	            return;
        	        }

        	        if (textField_2.getText().isEmpty()) {
        	            JOptionPane.showMessageDialog(null, "Ingrese el modelo.");
        	            return;
        	        }

        	        if (comboBox_1.getSelectedIndex()==0) {
        	            JOptionPane.showMessageDialog(null, "Seleccione la transmisión.");
        	            return;
        	        }

        	        if (comboBox_2.getSelectedIndex()==0) {
        	            JOptionPane.showMessageDialog(null, "Seleccione el número de puertas.");
        	            return;
        	        }

        	        if (comboBox_3.getSelectedIndex()==0) {
        	            JOptionPane.showMessageDialog(null, "Seleccione el número de equipaje.");
        	            return;
        	        }
        	        
        	        if (textField_1.getText().isEmpty()) {
        	            JOptionPane.showMessageDialog(null, "Ingrese el precio en MNX.");
        	            return;
        	        }
        	        int num;
        	        try {
        	             num = Integer.parseInt(textField_1.getText()); 
        	        } catch (NumberFormatException f) {
        	            JOptionPane.showMessageDialog(null, "Ingrese el precio en numeros.");
        	            return;
        	        }
        	        if (textField_3.getText().isEmpty()) {
        	            JOptionPane.showMessageDialog(null, "Seleccione una imagen.");
        	            return;
        	        }

        	        // Si todos los campos son validos, proceder con la operación de agregar
        	        String marca = comboBox.getSelectedItem().toString();
        	        String modelo = textField_2.getText();
        	        String transmision = comboBox_1.getSelectedItem().toString();
        	        int puertas = Integer.parseInt(comboBox_2.getSelectedItem().toString());
        	        int capacidadEquipaje = Integer.parseInt(comboBox_3.getSelectedItem().toString());
        	        
        	        String imagen = textField_3.getText();

        	        Carro nuevoCarro = new Carro(marca, modelo, transmision, puertas, capacidadEquipaje, num, imagen);
        	        deportivosCompactos.add(nuevoCarro);
        	            JOptionPane.showMessageDialog(null, "Vehículo agregado exitosamente.");
        	            panelPrincipal.removeAll();
                		deportivosCompactosPanel();
                        repaint();
        	        }
        });
        btnNewButton_9.setBounds(597, 581, 172, 49);
        panelPrincipal.add(btnNewButton_9);
	}
}


