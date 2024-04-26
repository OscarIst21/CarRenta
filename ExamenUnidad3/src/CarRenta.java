import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JScrollBar;

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
	private Carro deportivoCompacto[];
	int deportivosCompactos=4;
	private JLabel lblNewLabel_21;
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
		deportivoCompacto = new Carro[deportivosCompactos]; 
        deportivoCompacto[0] = new Carro("Toyota", "Celica", "Manual", 2, 1, 550.00, "celicaC.jpg");
	}
	public CarRenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 720);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		iniciarCarros();
		panelPrincipal = new JPanel();
		panelPrincipal.setBackground(Color.white);
		contentPane.add(panelPrincipal);
		panelPrincipal.setLayout(null);
		

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
		
		lblNewLabel_20 = new JLabel();
		lblNewLabel_20.setBounds(40, 175, 186, 137);
		lblNewLabel_20.setIcon(new ImageIcon(getClass().getResource(deportivoCompacto[0].getImagen())));
		panelPrincipal.add(lblNewLabel_20);
		 

		lblNewLabel_21 = new JLabel("");
		lblNewLabel_21.setText("<html>" + deportivoCompacto[0].getMarca() + " " + deportivoCompacto[0].getModelo() + "<br>"
			    + deportivoCompacto[0].getPuertas() + " Pasajeros<br>"
			    + "Aire Acondicionado<br>"
			    + deportivoCompacto[0].getTransmision() + "<br>"
			    + deportivoCompacto[0].getPuertas() + " Puertas<br>"
			    + deportivoCompacto[0].getEquipaje() + " Equipaje<br>"
			    + "$" + deportivoCompacto[0].getPrecio() + "/Día"
			    + "</html>");
		lblNewLabel_21.setBounds(236, 175, 181, 137);
		panelPrincipal.add(lblNewLabel_21);
			scrollPanel();
		 
		
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
		
		btnNewButton_2 = new JButton("Buscar");
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_2.setFocusable(false);
		btnNewButton_2.setForeground(Color.white);
		btnNewButton_2.setBackground(Color.black);
		btnNewButton_2.setBounds(196, 446, 122, 56);
		panelPrincipal.add(btnNewButton_2);
		
		btnNewButton_3 = new JButton("Buscar");
		btnNewButton_3.setFocusable(false);
		btnNewButton_3.setForeground(Color.white);
		btnNewButton_3.setBackground(Color.black);
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNewButton_3.setBounds(539, 446, 122, 56);
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
}
