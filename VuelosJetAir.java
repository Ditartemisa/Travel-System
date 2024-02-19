package sistemaDeVuelos;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

import com.toedter.calendar.JDateChooser;

public class VuelosJetAir {

    private JFrame frame;
    private JTextField textField_1;
    private JTextField textField;
    private JTextField NumeroTarjeta;
    private JTextField textField_3;
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    VuelosJetAir window = new VuelosJetAir();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public VuelosJetAir() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.WHITE);
        frame.setBounds(100, 100, 1200, 700);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        JPanel panel = new JPanel();
        panel.setBackground(new Color(0, 0, 0));
        panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel.setBounds(170, 54, 832, 92);
        frame.getContentPane().add(panel);

        JLabel lblNewLabel = new JLabel("Vuelos Air Jet");
        lblNewLabel.setForeground(new Color(255, 255, 255));
        lblNewLabel.setFont(new Font("Army Condensed", Font.BOLD, 78));
        panel.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Aeropuerto");
		lblNewLabel_1.setFont(new Font("Amsterdam", Font.PLAIN, 17));
		lblNewLabel_1.setBounds(167, 157, 116, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Saliendo de");
		lblNewLabel_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(263, 191, 103, 23);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_2_1 = new JLabel("Llegando a");
		lblNewLabel_2_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_2_1.setBounds(527, 191, 103, 23);
		frame.getContentPane().add(lblNewLabel_2_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Tipo de vuelo");
		lblNewLabel_1_1.setFont(new Font("Amsterdam", Font.PLAIN, 17));
		lblNewLabel_1_1.setBounds(170, 286, 540, 23);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Económico");
		rdbtnNewRadioButton.setFont(new Font("Dubai Light", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBackground(new Color(255, 255, 255));
		rdbtnNewRadioButton.setBounds(263, 329, 103, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnGeneral = new JRadioButton("General");
		rdbtnGeneral.setFont(new Font("Dubai Light", Font.PLAIN, 14));
		rdbtnGeneral.setBackground(Color.WHITE);
		rdbtnGeneral.setBounds(527, 329, 80, 23);
		frame.getContentPane().add(rdbtnGeneral);
		
		JRadioButton rdbtnPremium = new JRadioButton("Premium");
		rdbtnPremium.setFont(new Font("Dubai Light", Font.PLAIN, 14));
		rdbtnPremium.setBackground(Color.WHITE);
		rdbtnPremium.setBounds(784, 329, 90, 23);
		frame.getContentPane().add(rdbtnPremium);
		
		JLabel lblNewLabel_1_1_2 = new JLabel("Pasajeros");
		lblNewLabel_1_1_2.setFont(new Font("Amsterdam", Font.PLAIN, 17));
		lblNewLabel_1_1_2.setBounds(170, 396, 540, 23);
		frame.getContentPane().add(lblNewLabel_1_1_2);
		
		JLabel lblNewLabel_2_2 = new JLabel("Pasajero Principal");
		lblNewLabel_2_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_2_2.setBounds(667, 433, 149, 23);
		frame.getContentPane().add(lblNewLabel_2_2);
		
		JComboBox<?> comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox.setBackground(new Color(220, 220, 220));
		comboBox.setToolTipText("");
		comboBox.setBounds(341, 430, 103, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Adultos");
		lblNewLabel_2_2_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_2_2_1.setBounds(263, 430, 242, 23);
		frame.getContentPane().add(lblNewLabel_2_2_1);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBackground(new Color(255, 255, 255));
		textField_1.setBounds(667, 461, 220, 20);
		frame.getContentPane().add(textField_1);
		
		JLabel lblNewLabel_2_2_1_1 = new JLabel("Niños");
		lblNewLabel_2_2_1_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_2_2_1_1.setBounds(263, 463, 242, 23);
		frame.getContentPane().add(lblNewLabel_2_2_1_1);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		comboBox_1.setToolTipText("");
		comboBox_1.setBackground(new Color(220, 220, 220));
		comboBox_1.setBounds(341, 463, 103, 22);
		frame.getContentPane().add(comboBox_1);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(242, 315, 1, 2);
		frame.getContentPane().add(separator);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBounds(304, 286, 604, 2);
		frame.getContentPane().add(separator_1);
		
		JSeparator separator_1_1 = new JSeparator();
		separator_1_1.setBounds(304, 383, 604, 2);
		frame.getContentPane().add(separator_1_1);
		
		JLabel lblNewLabel_2_3 = new JLabel("Fecha");
		lblNewLabel_2_3.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_2_3.setBounds(784, 191, 103, 23);
		frame.getContentPane().add(lblNewLabel_2_3);
		
		JComboBox comboBox_saliendo = new JComboBox();
		comboBox_saliendo.setModel(new DefaultComboBoxModel(new String[] {"San José de Costa Rica (SJO)", "Ciudad de México (MEX)", "Calagary, Canadá (YYC)", "Cali, Colombia (CLO)"}));
		comboBox_saliendo.setToolTipText("");
		comboBox_saliendo.setBackground(new Color(220, 220, 220));
		comboBox_saliendo.setBounds(263, 211, 168, 22);
		frame.getContentPane().add(comboBox_saliendo);
		
		JComboBox comboBox_2_1 = new JComboBox();
		comboBox_2_1.setModel(new DefaultComboBoxModel(new String[] {"San José de Costa Rica (SJO)", "Ciudad de México (MEX)", "Calagary, Canadá (YYC)", "Cali, Colombia (CLO)"}));
		comboBox_2_1.setToolTipText("");
		comboBox_2_1.setBackground(new Color(220, 220, 220));
		comboBox_2_1.setBounds(527, 211, 168, 22);
		frame.getContentPane().add(comboBox_2_1);
		
		JSeparator separator_1_1_1 = new JSeparator();
		separator_1_1_1.setBounds(304, 492, 604, 2);
		frame.getContentPane().add(separator_1_1_1);
		
		JLabel lblNewLabel_1_1_2_1 = new JLabel("Pago");
		lblNewLabel_1_1_2_1.setFont(new Font("Amsterdam", Font.PLAIN, 17));
		lblNewLabel_1_1_2_1.setBounds(170, 503, 80, 23);
		frame.getContentPane().add(lblNewLabel_1_1_2_1);
		
		JLabel lblNewLabel_2_2_1_2 = new JLabel("Tipo");
		lblNewLabel_2_2_1_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_2_2_1_2.setBounds(263, 524, 53, 23);
		frame.getContentPane().add(lblNewLabel_2_2_1_2);
		
		JComboBox TipoPago = new JComboBox();
		TipoPago.setModel(new DefaultComboBoxModel(new String[] {"VISA", "MASTERCARD", "AMERICAN EXPRESS"}));
		TipoPago.setToolTipText("");
		TipoPago.setBackground(new Color(220, 220, 220));
		TipoPago.setBounds(283, 543, 103, 22);
		frame.getContentPane().add(TipoPago);
		
		JLabel lblNewLabel_2_2_1_2_1 = new JLabel("CV");
		lblNewLabel_2_2_1_2_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_2_2_1_2_1.setBounds(738, 524, 53, 23);
		frame.getContentPane().add(lblNewLabel_2_2_1_2_1);
		
		textField = new JTextField();
		textField.setBounds(768, 544, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		//Botón "Cancelar"
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(442, 614, 89, 23);
		frame.getContentPane().add(btnCancelar);
		
		//Botón "Aceptar"
		
		JButton btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(598, 614, 89, 23);
		frame.getContentPane().add(btnAceptar);
		
		JLabel lblNewLabel_2_2_1_2_2 = new JLabel("Número de tarjeta");
		lblNewLabel_2_2_1_2_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_2_2_1_2_2.setBounds(417, 524, 125, 23);
		frame.getContentPane().add(lblNewLabel_2_2_1_2_2);
		
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(784, 211, 70, 20);
		frame.getContentPane().add(dateChooser);
		
		JLabel lblNewLabel_2_3_1 = new JLabel("Hora");
		lblNewLabel_2_3_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_2_3_1.setBounds(784, 238, 103, 23);
		frame.getContentPane().add(lblNewLabel_2_3_1);
		
		JComboBox comboBox_2_1_1 = new JComboBox();
		comboBox_2_1_1.setModel(new DefaultComboBoxModel(new String[] {"12:30", "16:00", "19:30"}));
		comboBox_2_1_1.setToolTipText("");
		comboBox_2_1_1.setBackground(new Color(220, 220, 220));
		comboBox_2_1_1.setBounds(784, 253, 70, 22);
		frame.getContentPane().add(comboBox_2_1_1);
		
		NumeroTarjeta = new JTextField();
		NumeroTarjeta.setColumns(10);
		NumeroTarjeta.setBounds(452, 544, 103, 20);
		frame.getContentPane().add(NumeroTarjeta);
		
		JDateChooser dateChooser_1 = new JDateChooser();
		dateChooser_1.setBounds(625, 545, 70, 20);
		frame.getContentPane().add(dateChooser_1);
		
		JLabel lblNewLabel_2_2_1_2_1_1 = new JLabel("Vencimiento");
		lblNewLabel_2_2_1_2_1_1.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_2_2_1_2_1_1.setBounds(592, 524, 103, 23);
		frame.getContentPane().add(lblNewLabel_2_2_1_2_1_1);
		
		JLabel lblNewLabel_2_2_1_2_1_2 = new JLabel("Total");
		lblNewLabel_2_2_1_2_1_2.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 14));
		lblNewLabel_2_2_1_2_1_2.setBounds(709, 593, 53, 23);
		frame.getContentPane().add(lblNewLabel_2_2_1_2_1_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(768, 591, 86, 20);
		frame.getContentPane().add(textField_3);
		
		comboBox_saliendo.addActionListener(new ActionListener() 
		{
		@Override
		public void actionPerformed(ActionEvent e) {
			double precio = PrecioVuelo.calcularPrecioVuelo(comboBox_saliendo.getSelectedItem().toString(), comboBox_2_1_1.getSelectedItem().toString()); 
			textField_3.setText(Double.toString(precio));
		}
		});
		
		btnAceptar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
	}
		
	}


