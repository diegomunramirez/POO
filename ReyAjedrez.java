import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ReyAjedrez {

	private JFrame frmAjedrez;
	//private JTable table;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ReyAjedrez window = new ReyAjedrez();
					window.frmAjedrez.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public ReyAjedrez() {
		initialize();
		
	}


	private void initialize() {
		frmAjedrez = new JFrame();
		frmAjedrez.setTitle("Ajedrez");
		frmAjedrez.setBounds(150, 60, 640, 640);
		frmAjedrez.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAjedrez.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setBackground(Color.BLACK);
		lblNewLabel.setBounds(46, 11, 60, 60);
		frmAjedrez.getContentPane().add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setOpaque(true);
		label.setForeground(Color.WHITE);
		label.setBackground(Color.WHITE);
		label.setBounds(106, 11, 60, 60);
		frmAjedrez.getContentPane().add(label);
		
		JButton btnNewButton = new JButton("");
		//btnNewButton.setIcon(new ImageIcon("E:\\Eclipse_proyectos\\ajedrez\\imagen\\reypiezachica.png"));
		ImageIcon Rey = new ImageIcon("E:\\Eclipse_proyectos\\ajedrez\\imagen\\reypiezachica.png");
		btnNewButton.setIcon(new ImageIcon(Rey.getImage().getScaledInstance(60, 60,Image.SCALE_SMOOTH))); //ajustar la imagen a las dimensiones del boton
		btnNewButton.setForeground(new Color(0, 0, 0));
		btnNewButton.setOpaque(false);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBounds(223, 430, 60, 60); //tiene que ser -1 en X,Y,sumar 1 en dimensiones
		frmAjedrez.getContentPane().add(btnNewButton);
		
		JLabel label_1 = new JLabel("");
		label_1.setOpaque(true);
		label_1.setForeground(Color.BLACK);
		label_1.setBackground(Color.BLACK);
		label_1.setBounds(165, 11, 60, 60);
		frmAjedrez.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("");
		label_2.setOpaque(true);
		label_2.setForeground(Color.WHITE);
		label_2.setBackground(Color.WHITE);
		label_2.setBounds(224, 11, 60, 60);
		frmAjedrez.getContentPane().add(label_2);
		
		JLabel label_3 = new JLabel("");
		label_3.setOpaque(true);
		label_3.setForeground(Color.BLACK);
		label_3.setBackground(Color.BLACK);
		label_3.setBounds(283, 11, 60, 60);
		frmAjedrez.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("");
		label_4.setOpaque(true);
		label_4.setForeground(Color.WHITE);
		label_4.setBackground(Color.WHITE);
		label_4.setBounds(341, 11, 60, 60);
		frmAjedrez.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("");
		label_5.setOpaque(true);
		label_5.setForeground(Color.BLACK);
		label_5.setBackground(Color.BLACK);
		label_5.setBounds(400, 11, 60, 60);
		frmAjedrez.getContentPane().add(label_5);
		
		JLabel label_6 = new JLabel("");
		label_6.setOpaque(true);
		label_6.setForeground(Color.WHITE);
		label_6.setBackground(Color.WHITE);
		label_6.setBounds(460, 11, 60, 60);
		frmAjedrez.getContentPane().add(label_6);
		
		JLabel label_7 = new JLabel("Si");
		label_7.setOpaque(true);
		label_7.setForeground(Color.WHITE);
		label_7.setBackground(Color.WHITE);
		label_7.setBounds(46, 71, 60, 60);
		frmAjedrez.getContentPane().add(label_7);
		
		JLabel label_8 = new JLabel("Si");
		label_8.setOpaque(true);
		label_8.setForeground(Color.BLACK);
		label_8.setBackground(Color.BLACK);
		label_8.setBounds(105, 71, 60, 60);
		frmAjedrez.getContentPane().add(label_8);
		
		JLabel label_9 = new JLabel("Si");
		label_9.setOpaque(true);
		label_9.setForeground(Color.WHITE);
		label_9.setBackground(Color.WHITE);
		label_9.setBounds(164, 71, 60, 60);
		frmAjedrez.getContentPane().add(label_9);
		
		JLabel label_10 = new JLabel("Si");
		label_10.setOpaque(true);
		label_10.setForeground(Color.BLACK);
		label_10.setBackground(Color.BLACK);
		label_10.setBounds(223, 71, 60, 60);
		frmAjedrez.getContentPane().add(label_10);
		
		JLabel label_11 = new JLabel("Si");
		label_11.setOpaque(true);
		label_11.setForeground(Color.WHITE);
		label_11.setBackground(Color.WHITE);
		label_11.setBounds(281, 71, 60, 60);
		frmAjedrez.getContentPane().add(label_11);
		
		JLabel label_12 = new JLabel("Si");
		label_12.setOpaque(true);
		label_12.setForeground(Color.BLACK);
		label_12.setBackground(Color.BLACK);
		label_12.setBounds(340, 71, 60, 60);
		frmAjedrez.getContentPane().add(label_12);
		
		JLabel label_13 = new JLabel("Si");
		label_13.setOpaque(true);
		label_13.setForeground(Color.WHITE);
		label_13.setBackground(Color.WHITE);
		label_13.setBounds(400, 71, 60, 60);
		frmAjedrez.getContentPane().add(label_13);
		
		JLabel label_14 = new JLabel("Si");
		label_14.setOpaque(true);
		label_14.setForeground(Color.BLACK);
		label_14.setBackground(Color.BLACK);
		label_14.setBounds(460, 71, 60, 60);
		frmAjedrez.getContentPane().add(label_14);
		
		JLabel label_15 = new JLabel("Si");
		label_15.setOpaque(true);
		label_15.setForeground(Color.BLACK);
		label_15.setBackground(Color.BLACK);
		label_15.setBounds(46, 131, 60, 60);
		frmAjedrez.getContentPane().add(label_15);
		
		JLabel label_16 = new JLabel("Si");
		label_16.setOpaque(true);
		label_16.setForeground(Color.WHITE);
		label_16.setBackground(Color.WHITE);
		label_16.setBounds(106, 131, 60, 60);
		frmAjedrez.getContentPane().add(label_16);
		
		JLabel label_17 = new JLabel("Si");
		label_17.setOpaque(true);
		label_17.setForeground(Color.BLACK);
		label_17.setBackground(Color.BLACK);
		label_17.setBounds(165, 131, 60, 60);
		frmAjedrez.getContentPane().add(label_17);
		
		JLabel label_18 = new JLabel("Si");
		label_18.setOpaque(true);
		label_18.setForeground(Color.WHITE);
		label_18.setBackground(Color.WHITE);
		label_18.setBounds(224, 131, 60, 60);
		frmAjedrez.getContentPane().add(label_18);
		
		JLabel label_19 = new JLabel("Si");
		label_19.setOpaque(true);
		label_19.setForeground(Color.BLACK);
		label_19.setBackground(Color.BLACK);
		label_19.setBounds(283, 131, 60, 60);
		frmAjedrez.getContentPane().add(label_19);
		
		JLabel label_20 = new JLabel("Si");
		label_20.setOpaque(true);
		label_20.setForeground(Color.WHITE);
		label_20.setBackground(Color.WHITE);
		label_20.setBounds(341, 131, 60, 60);
		frmAjedrez.getContentPane().add(label_20);
		
		JLabel label_21 = new JLabel("Si");
		label_21.setOpaque(true);
		label_21.setForeground(Color.BLACK);
		label_21.setBackground(Color.BLACK);
		label_21.setBounds(400, 131, 60, 60);
		frmAjedrez.getContentPane().add(label_21);
		
		JLabel label_22 = new JLabel("Si");
		label_22.setOpaque(true);
		label_22.setForeground(Color.WHITE);
		label_22.setBackground(Color.WHITE);
		label_22.setBounds(460, 131, 60, 60);
		frmAjedrez.getContentPane().add(label_22);
		
		JLabel label_23 = new JLabel("Si");
		label_23.setOpaque(true);
		label_23.setForeground(Color.BLACK);
		label_23.setBackground(Color.BLACK);
		label_23.setBounds(460, 191, 60, 60);
		frmAjedrez.getContentPane().add(label_23);
		
		JLabel label_24 = new JLabel("Si");
		label_24.setOpaque(true);
		label_24.setForeground(Color.WHITE);
		label_24.setBackground(Color.WHITE);
		label_24.setBounds(400, 191, 60, 60);
		frmAjedrez.getContentPane().add(label_24);
		
		JLabel label_25 = new JLabel("Si");
		label_25.setOpaque(true);
		label_25.setForeground(Color.BLACK);
		label_25.setBackground(Color.BLACK);
		label_25.setBounds(340, 191, 60, 60);
		frmAjedrez.getContentPane().add(label_25);
		
		JLabel label_26 = new JLabel("Si");
		label_26.setOpaque(true);
		label_26.setForeground(Color.WHITE);
		label_26.setBackground(Color.WHITE);
		label_26.setBounds(281, 191, 60, 60);
		frmAjedrez.getContentPane().add(label_26);
		
		JLabel label_27 = new JLabel("Si");
		label_27.setOpaque(true);
		label_27.setForeground(Color.BLACK);
		label_27.setBackground(Color.BLACK);
		label_27.setBounds(223, 191, 60, 60);
		frmAjedrez.getContentPane().add(label_27);
		
		JLabel label_28 = new JLabel("Si");
		label_28.setOpaque(true);
		label_28.setForeground(Color.WHITE);
		label_28.setBackground(Color.WHITE);
		label_28.setBounds(164, 191, 60, 60);
		frmAjedrez.getContentPane().add(label_28);
		
		JLabel label_29 = new JLabel("Si");
		label_29.setOpaque(true);
		label_29.setForeground(Color.BLACK);
		label_29.setBackground(Color.BLACK);
		label_29.setBounds(105, 191, 60, 60);
		frmAjedrez.getContentPane().add(label_29);
		
		JLabel label_30 = new JLabel("Si");
		label_30.setOpaque(true);
		label_30.setForeground(Color.WHITE);
		label_30.setBackground(Color.WHITE);
		label_30.setBounds(46, 191, 60, 60);
		frmAjedrez.getContentPane().add(label_30);
		
		JLabel label_31 = new JLabel("Si");
		label_31.setOpaque(true);
		label_31.setForeground(Color.BLACK);
		label_31.setBackground(Color.BLACK);
		label_31.setBounds(46, 251, 60, 60);
		frmAjedrez.getContentPane().add(label_31);
		
		JLabel label_32 = new JLabel("Si");
		label_32.setOpaque(true);
		label_32.setForeground(Color.WHITE);
		label_32.setBackground(Color.WHITE);
		label_32.setBounds(106, 251, 60, 60);
		frmAjedrez.getContentPane().add(label_32);
		
		JLabel label_33 = new JLabel("Si");
		label_33.setOpaque(true);
		label_33.setForeground(Color.BLACK);
		label_33.setBackground(Color.BLACK);
		label_33.setBounds(165, 251, 60, 60);
		frmAjedrez.getContentPane().add(label_33);
		
		JLabel label_34 = new JLabel("Si");
		label_34.setOpaque(true);
		label_34.setForeground(Color.WHITE);
		label_34.setBackground(Color.WHITE);
		label_34.setBounds(224, 251, 60, 60);
		frmAjedrez.getContentPane().add(label_34);
		
		JLabel label_35 = new JLabel("Si");
		label_35.setOpaque(true);
		label_35.setForeground(Color.BLACK);
		label_35.setBackground(Color.BLACK);
		label_35.setBounds(283, 251, 60, 60);
		frmAjedrez.getContentPane().add(label_35);
		
		JLabel label_36 = new JLabel("Si");
		label_36.setOpaque(true);
		label_36.setForeground(Color.WHITE);
		label_36.setBackground(Color.WHITE);
		label_36.setBounds(341, 251, 60, 60);
		frmAjedrez.getContentPane().add(label_36);
		
		JLabel label_37 = new JLabel("Si");
		label_37.setOpaque(true);
		label_37.setForeground(Color.BLACK);
		label_37.setBackground(Color.BLACK);
		label_37.setBounds(400, 251, 60, 60);
		frmAjedrez.getContentPane().add(label_37);
		
		JLabel label_38 = new JLabel("Si");
		label_38.setOpaque(true);
		label_38.setForeground(Color.WHITE);
		label_38.setBackground(Color.WHITE);
		label_38.setBounds(460, 251, 60, 60);
		frmAjedrez.getContentPane().add(label_38);
		
		JLabel label_39 = new JLabel("Si");
		label_39.setOpaque(true);
		label_39.setForeground(Color.BLACK);
		label_39.setBackground(Color.BLACK);
		label_39.setBounds(460, 311, 60, 60);
		frmAjedrez.getContentPane().add(label_39);
		
		JLabel label_40 = new JLabel("Si");
		label_40.setOpaque(true);
		label_40.setForeground(Color.WHITE);
		label_40.setBackground(Color.WHITE);
		label_40.setBounds(400, 311, 60, 60);
		frmAjedrez.getContentPane().add(label_40);
		
		JLabel label_41 = new JLabel("Si");
		label_41.setOpaque(true);
		label_41.setForeground(Color.BLACK);
		label_41.setBackground(Color.BLACK);
		label_41.setBounds(340, 311, 60, 60);
		frmAjedrez.getContentPane().add(label_41);
		
		JLabel label_42 = new JLabel("Si");
		label_42.setOpaque(true);
		label_42.setForeground(Color.WHITE);
		label_42.setBackground(Color.WHITE);
		label_42.setBounds(281, 311, 60, 60);
		frmAjedrez.getContentPane().add(label_42);
		
		JLabel label_43 = new JLabel("Si");
		label_43.setOpaque(true);
		label_43.setForeground(Color.BLACK);
		label_43.setBackground(Color.BLACK);
		label_43.setBounds(223, 311, 60, 60);
		frmAjedrez.getContentPane().add(label_43);
		
		JLabel label_44 = new JLabel("Si");
		label_44.setOpaque(true);
		label_44.setForeground(Color.WHITE);
		label_44.setBackground(Color.WHITE);
		label_44.setBounds(164, 311, 60, 60);
		frmAjedrez.getContentPane().add(label_44);
		
		JLabel label_45 = new JLabel("Si");
		label_45.setOpaque(true);
		label_45.setForeground(Color.BLACK);
		label_45.setBackground(Color.BLACK);
		label_45.setBounds(105, 311, 60, 60);
		frmAjedrez.getContentPane().add(label_45);
		
		JLabel label_46 = new JLabel("Si");
		label_46.setOpaque(true);
		label_46.setForeground(Color.WHITE);
		label_46.setBackground(Color.WHITE);
		label_46.setBounds(46, 311, 60, 60);
		frmAjedrez.getContentPane().add(label_46);
		
		JLabel label_47 = new JLabel("Si");
		label_47.setOpaque(true);
		label_47.setForeground(Color.BLACK);
		label_47.setBackground(Color.BLACK);
		label_47.setBounds(46, 371, 60, 60);
		frmAjedrez.getContentPane().add(label_47);
		
		JLabel label_48 = new JLabel("Si");
		label_48.setOpaque(true);
		label_48.setForeground(Color.WHITE);
		label_48.setBackground(Color.WHITE);
		label_48.setBounds(106, 371, 60, 60);
		frmAjedrez.getContentPane().add(label_48);
		
		JLabel label_49 = new JLabel("Si");
		label_49.setOpaque(true);
		label_49.setForeground(Color.BLACK);
		label_49.setBackground(Color.BLACK);
		label_49.setBounds(165, 371, 60, 60);
		frmAjedrez.getContentPane().add(label_49);
		
		JLabel label_50 = new JLabel("Si");
		label_50.setOpaque(true);
		label_50.setForeground(Color.WHITE);
		label_50.setBackground(Color.WHITE);
		label_50.setBounds(224, 371, 60, 60);
		frmAjedrez.getContentPane().add(label_50);
		
		JLabel label_51 = new JLabel("Si");
		label_51.setOpaque(true);
		label_51.setForeground(Color.BLACK);
		label_51.setBackground(Color.BLACK);
		label_51.setBounds(283, 371, 60, 60);
		frmAjedrez.getContentPane().add(label_51);
		
		JLabel label_52 = new JLabel("Si");
		label_52.setOpaque(true);
		label_52.setForeground(Color.WHITE);
		label_52.setBackground(Color.WHITE);
		label_52.setBounds(341, 371, 60, 60);
		frmAjedrez.getContentPane().add(label_52);
		
		JLabel label_53 = new JLabel("Si");
		label_53.setOpaque(true);
		label_53.setForeground(Color.BLACK);
		label_53.setBackground(Color.BLACK);
		label_53.setBounds(400, 371, 60, 60);
		frmAjedrez.getContentPane().add(label_53);
		
		JLabel label_54 = new JLabel("Si");
		label_54.setOpaque(true);
		label_54.setForeground(Color.WHITE);
		label_54.setBackground(Color.WHITE);
		label_54.setBounds(460, 371, 60, 60);
		frmAjedrez.getContentPane().add(label_54);
		
		JLabel label_55 = new JLabel("Si");
		label_55.setOpaque(true);
		label_55.setForeground(Color.BLACK);
		label_55.setBackground(Color.BLACK);
		label_55.setBounds(460, 431, 60, 60);
		frmAjedrez.getContentPane().add(label_55);
		
		JLabel label_56 = new JLabel("Si");
		label_56.setOpaque(true);
		label_56.setForeground(Color.WHITE);
		label_56.setBackground(Color.WHITE);
		label_56.setBounds(400, 431, 60, 60);
		frmAjedrez.getContentPane().add(label_56);
		
		JLabel label_57 = new JLabel("Si");
		label_57.setOpaque(true);
		label_57.setForeground(Color.BLACK);
		label_57.setBackground(Color.BLACK);
		label_57.setBounds(340, 431, 60, 60);
		frmAjedrez.getContentPane().add(label_57);
		
		JLabel label_58 = new JLabel("Si");
		label_58.setOpaque(true);
		label_58.setForeground(Color.WHITE);
		label_58.setBackground(Color.WHITE);
		label_58.setBounds(281, 431, 60, 60);
		frmAjedrez.getContentPane().add(label_58);
		
		JLabel label_59 = new JLabel("Si");
		label_59.setOpaque(true);
		label_59.setForeground(Color.BLACK);
		label_59.setBackground(Color.BLACK);
		label_59.setBounds(223, 431, 60, 60);
		frmAjedrez.getContentPane().add(label_59);
		
		JLabel label_60 = new JLabel("Si");
		label_60.setOpaque(true);
		label_60.setForeground(Color.WHITE);
		label_60.setBackground(Color.WHITE);
		label_60.setBounds(164, 431, 60, 60);
		frmAjedrez.getContentPane().add(label_60);
		
		JLabel label_61 = new JLabel("Si");
		label_61.setOpaque(true);
		label_61.setForeground(Color.BLACK);
		label_61.setBackground(Color.BLACK);
		label_61.setBounds(105, 431, 60, 60);
		frmAjedrez.getContentPane().add(label_61);
		
		JLabel label_62 = new JLabel("Si");
		label_62.setOpaque(true);
		label_62.setForeground(Color.WHITE);
		label_62.setBackground(Color.WHITE);
		label_62.setBounds(46, 431, 60, 60);
		frmAjedrez.getContentPane().add(label_62);
		
	
		
		
		
		
	}
}
