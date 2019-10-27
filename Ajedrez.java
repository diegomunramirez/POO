package ajedrez;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.JToggleButton;
import java.awt.Color;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Image;

public class Ajedrez {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ajedrez window = new Ajedrez();
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
	public Ajedrez() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBackground(new Color(240, 240, 240));
		frame.setBounds(100, 100, 640, 639);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton A1 = new JButton("");
		A1.setBackground(Color.BLACK);
		A1.setBounds(111, 96, 60, 60);
		frame.getContentPane().add(A1);
		
		JButton B1 = new JButton("");
		B1.setBackground(Color.WHITE);
		B1.setBounds(172, 96, 60, 60);
		frame.getContentPane().add(B1);
		
		JButton C1 = new JButton("");
		C1.setBackground(Color.BLACK);
		C1.setBounds(232, 96, 60, 60);
		frame.getContentPane().add(C1);
		
		JButton D1 = new JButton("");
		D1.setBackground(Color.WHITE);
		D1.setBounds(292, 96, 60, 60);
		frame.getContentPane().add(D1);
		
		JButton E1 = new JButton("");
		E1.setBackground(Color.BLACK);
		E1.setBounds(352, 96, 60, 60);
		frame.getContentPane().add(E1);
		
		JButton F1 = new JButton("");
		F1.setBackground(Color.WHITE);
		F1.setBounds(412, 96, 60, 60);
		frame.getContentPane().add(F1);
		
		JButton G1 = new JButton("");
		G1.setBackground(Color.BLACK);
		G1.setBounds(472, 96, 60, 60);
		frame.getContentPane().add(G1);
		
		JButton H1 = new JButton("");
		H1.setBackground(Color.WHITE);
		H1.setBounds(532, 96, 60, 60);
		frame.getContentPane().add(H1);
		
		JButton A2 = new JButton("");
		A2.setBackground(Color.WHITE);
		A2.setBounds(111, 156, 60, 60);
		frame.getContentPane().add(A2);
		
		JButton B2 = new JButton("");
		B2.setBackground(Color.BLACK);
		B2.setBounds(172, 156, 60, 60);
		frame.getContentPane().add(B2);
		
		JButton C2 = new JButton("");
		C2.setBackground(Color.WHITE);
		C2.setBounds(232, 156, 60, 60);
		frame.getContentPane().add(C2);
		
		JButton D2 = new JButton("");
		D2.setBackground(Color.BLACK);
		D2.setBounds(292, 156, 60, 60);
		frame.getContentPane().add(D2);
		
		JButton E2 = new JButton("");
		E2.setBackground(Color.WHITE);
		E2.setBounds(352, 156, 60, 60);
		frame.getContentPane().add(E2);
		
		JButton F2 = new JButton("");
		F2.setBackground(Color.BLACK);
		F2.setBounds(412, 156, 60, 60);
		frame.getContentPane().add(F2);
		
		JButton G2 = new JButton("");
		G2.setBackground(Color.WHITE);
		G2.setBounds(472, 156, 60, 60);
		frame.getContentPane().add(G2);
		
		JButton H2 = new JButton("");
		H2.setBackground(Color.BLACK);
		H2.setBounds(532, 156, 60, 60);
		frame.getContentPane().add(H2);
		
		JButton A3 = new JButton("");
		A3.setBackground(Color.BLACK);
		A3.setBounds(111, 216, 60, 60);
		frame.getContentPane().add(A3);
		
		JButton B3 = new JButton("");
		B3.setBackground(Color.WHITE);
		B3.setBounds(172, 216, 60, 60);
		frame.getContentPane().add(B3);
		
		JButton C3 = new JButton("");
		C3.setBackground(Color.BLACK);
		C3.setBounds(232, 216, 60, 60);
		frame.getContentPane().add(C3);
		
		JButton D3 = new JButton("");
		D3.setBackground(Color.WHITE);
		D3.setBounds(292, 216, 60, 60);
		frame.getContentPane().add(D3);
		
		JButton E3 = new JButton("");
		E3.setBackground(Color.BLACK);
		E3.setBounds(352, 216, 60, 60);
		frame.getContentPane().add(E3);
		
		JButton F3 = new JButton("");
		F3.setBackground(Color.WHITE);
		F3.setBounds(412, 216, 60, 60);
		frame.getContentPane().add(F3);
		
		JButton G3 = new JButton("");
		G3.setBackground(Color.BLACK);
		G3.setBounds(472, 216, 60, 60);
		frame.getContentPane().add(G3);
		
		JButton H3 = new JButton("");
		H3.setBackground(Color.WHITE);
		H3.setBounds(532, 216, 60, 60);
		frame.getContentPane().add(H3);
		
		JButton A4 = new JButton("");
		A4.setBackground(Color.WHITE);
		A4.setBounds(111, 276, 60, 60);
		frame.getContentPane().add(A4);
		
		JButton B4 = new JButton("");
		B4.setBackground(Color.BLACK);
		B4.setBounds(172, 276, 60, 60);
		frame.getContentPane().add(B4);
		
		JButton C4 = new JButton("");
		C4.setBackground(Color.WHITE);
		C4.setBounds(232, 276, 60, 60);
		frame.getContentPane().add(C4);
		
		JButton D4 = new JButton("");
		D4.setBackground(Color.BLACK);
		D4.setBounds(292, 276, 60, 60);
		frame.getContentPane().add(D4);
		
		JButton E4 = new JButton("");
		E4.setBackground(Color.WHITE);
		E4.setBounds(352, 276, 60, 60);
		frame.getContentPane().add(E4);
		
		JButton F4 = new JButton("");
		F4.setBackground(Color.BLACK);
		F4.setBounds(412, 276, 60, 60);
		frame.getContentPane().add(F4);
		
		JButton G4 = new JButton("");
		G4.setBackground(Color.WHITE);
		G4.setBounds(472, 276, 60, 60);
		frame.getContentPane().add(G4);
		
		JButton H4 = new JButton("");
		H4.setBackground(Color.BLACK);
		H4.setBounds(532, 276, 60, 60);
		frame.getContentPane().add(H4);
		
		JButton A5 = new JButton("");
		A5.setBackground(Color.BLACK);
		A5.setBounds(111, 336, 60, 60);
		frame.getContentPane().add(A5);
		
		JButton C5 = new JButton("");
		C5.setBackground(Color.BLACK);
		C5.setBounds(232, 336, 60, 60);
		frame.getContentPane().add(C5);
		
		JButton B5 = new JButton("");
		B5.setBackground(Color.WHITE);
		B5.setBounds(172, 336, 60, 60);
		frame.getContentPane().add(B5);
		
		JButton D5 = new JButton("");
		D5.setBackground(Color.WHITE);
		D5.setBounds(292, 336, 60, 60);
		frame.getContentPane().add(D5);
		
		JButton E5 = new JButton("");
		E5.setBackground(Color.BLACK);
		E5.setBounds(352, 336, 60, 60);
		frame.getContentPane().add(E5);
		
		JButton F5 = new JButton("");
		F5.setBackground(Color.WHITE);
		F5.setBounds(412, 336, 60, 60);
		frame.getContentPane().add(F5);
		
		JButton G5 = new JButton("");
		G5.setBackground(Color.BLACK);
		G5.setBounds(472, 336, 60, 60);
		frame.getContentPane().add(G5);
		
		JButton H5 = new JButton("");
		H5.setBackground(Color.WHITE);
		H5.setBounds(532, 336, 60, 60);
		frame.getContentPane().add(H5);
		
		JButton A6 = new JButton("");
		A6.setBackground(Color.WHITE);
		A6.setBounds(111, 396, 60, 60);
		frame.getContentPane().add(A6);
		
		JButton B6 = new JButton("");
		B6.setBackground(Color.BLACK);
		B6.setBounds(172, 396, 60, 60);
		frame.getContentPane().add(B6);
		
		JButton C6 = new JButton("");
		C6.setBackground(Color.WHITE);
		C6.setBounds(232, 396, 60, 60);
		frame.getContentPane().add(C6);
		
		JButton D6 = new JButton("");
		D6.setBackground(Color.BLACK);
		D6.setBounds(292, 396, 60, 60);
		frame.getContentPane().add(D6);
		
		JButton E6 = new JButton("");
		E6.setBackground(Color.WHITE);
		E6.setBounds(352, 396, 60, 60);
		frame.getContentPane().add(E6);
		
		JButton F6 = new JButton("");
		F6.setBackground(Color.BLACK);
		F6.setBounds(412, 396, 60, 60);
		frame.getContentPane().add(F6);
		
		JButton G6 = new JButton("");
		G6.setBackground(Color.WHITE);
		G6.setBounds(472, 396, 60, 60);
		frame.getContentPane().add(G6);
		
		JButton H6 = new JButton("");
		H6.setBackground(Color.BLACK);
		H6.setBounds(532, 396, 60, 60);
		frame.getContentPane().add(H6);
		
		JButton A7 = new JButton("");
		A7.setBackground(Color.BLACK);
		A7.setBounds(111, 456, 60, 60);
		frame.getContentPane().add(A7);
		
		JButton B7 = new JButton("");
		B7.setBackground(Color.WHITE);
		B7.setBounds(172, 456, 60, 60);
		frame.getContentPane().add(B7);
		
		JButton C7 = new JButton("");
		C7.setBackground(Color.BLACK);
		C7.setBounds(232, 456, 60, 60);
		frame.getContentPane().add(C7);
		
		JButton D7 = new JButton("");
		D7.setBackground(Color.WHITE);
		D7.setBounds(292, 456, 60, 60);
		frame.getContentPane().add(D7);
		
		JButton E7 = new JButton("");
		E7.setBackground(Color.BLACK);
		E7.setBounds(352, 456, 60, 60);
		frame.getContentPane().add(E7);
		
		JButton F7 = new JButton("");
		F7.setBackground(Color.WHITE);
		F7.setBounds(412, 456, 60, 60);
		frame.getContentPane().add(F7);
		
		JButton G7 = new JButton("");
		G7.setBackground(Color.BLACK);
		G7.setBounds(472, 456, 60, 60);
		frame.getContentPane().add(G7);
		
		JButton H7 = new JButton("");
		H7.setBackground(Color.WHITE);
		H7.setBounds(532, 456, 60, 60);
		frame.getContentPane().add(H7);
		
		JButton A8 = new JButton("");
		A8.setBackground(Color.WHITE);
		A8.setBounds(111, 516, 60, 60);
		frame.getContentPane().add(A8);
		
		JButton B8 = new JButton("");
		B8.setBackground(Color.BLACK);
		B8.setBounds(172, 516, 60, 60);
		frame.getContentPane().add(B8);
		
		JButton C8 = new JButton("");
		C8.setBackground(Color.WHITE);
		C8.setBounds(232, 516, 60, 60);
		frame.getContentPane().add(C8);
		
		JButton D8 = new JButton("");
		
		D8.setBounds(292, 516, 60, 60);
		ImageIcon Rey = new ImageIcon("E:\\Eclipse_proyectos\\ajedrez\\imagen\\reypiezachica.png");
		D8.setIcon(new ImageIcon(Rey.getImage().getScaledInstance(60, 60,Image.SCALE_SMOOTH))); //ajustar la imagen a las dimensiones del boton
		D8.setBackground(Color.BLACK);
		frame.getContentPane().add(D8);
		
		JButton E8 = new JButton("");
		E8.setBackground(Color.WHITE);
		E8.setBounds(352, 516, 60, 60);
		frame.getContentPane().add(E8);
		
		JButton F8 = new JButton("");
		F8.setBackground(Color.BLACK);
		F8.setBounds(412, 516, 60, 60);
		frame.getContentPane().add(F8);
		
		JButton G8 = new JButton("");
		G8.setBackground(Color.WHITE);
		G8.setBounds(472, 516, 60, 60);
		frame.getContentPane().add(G8);
		
		JButton H8 = new JButton("");
		H8.setBackground(Color.BLACK);
		H8.setBounds(532, 516, 60, 60);
		frame.getContentPane().add(H8);
		
		JLabel ColumnaA = new JLabel("A");
		ColumnaA.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ColumnaA.setBounds(130, 58, 22, 25);
		frame.getContentPane().add(ColumnaA);
		
		JLabel ColumnaB = new JLabel("B");
		ColumnaB.setFont(new Font("Tahoma", Font.PLAIN, 20));
		ColumnaB.setBounds(191, 59, 22, 22);
		frame.getContentPane().add(ColumnaB);
		
		JLabel lblNewLabel_2 = new JLabel("C");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_2.setBounds(250, 59, 22, 22);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("D");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_3.setBounds(310, 59, 22, 22);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("E");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_4.setBounds(370, 59, 22, 22);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("F");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_5.setBounds(430, 63, 22, 22);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("G");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_6.setBounds(488, 60, 22, 22);
		frame.getContentPane().add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("H");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_7.setBounds(551, 63, 22, 22);
		frame.getContentPane().add(lblNewLabel_7);
		
		JLabel lblNewLabel_13 = new JLabel("8");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_13.setBounds(43, 537, 22, 22);
		frame.getContentPane().add(lblNewLabel_13);
		
		JLabel label = new JLabel("7");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(43, 471, 22, 22);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("6");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(43, 416, 22, 22);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("5");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(43, 358, 22, 22);
		frame.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("4");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBounds(43, 298, 22, 22);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("3");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_4.setBounds(43, 236, 22, 22);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("2");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_5.setBounds(43, 173, 22, 22);
		frame.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("1");
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_6.setBounds(43, 115, 22, 22);
		frame.getContentPane().add(label_6);
		
		//E8.addActionListener(new ActionListener(){
			//public void actionPerformed(ActionEvent arg0){
			//E8.setIcon(new ImageIcon("E:\\Eclipse_proyectos\\ajedrez\\imagen\\reypiezachica.png"));
				
				
			//}
		//});
		
		//E8.setBackground(Color.WHITE);
		//E8.setBounds(352, 516, 60, 60);
		//frame.getContentPane().add(E8);

		
	}
}
