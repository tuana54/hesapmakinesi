/*package swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Window.Type;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class HesapMakinesi {

	private JFrame frmHesapMakinesi;
	private JTextField sayi1;
	private JTextField sayi2;
	private JTextField resault;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HesapMakinesi window = new HesapMakinesi();
					window.frmHesapMakinesi.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public HesapMakinesi() {
		initialize();
	}

	/**

	 */
	private void initialize() {
		frmHesapMakinesi = new JFrame();
		frmHesapMakinesi.setTitle("Hesap Makinesi");
		frmHesapMakinesi.setBounds(100, 100, 632, 518);
		frmHesapMakinesi.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmHesapMakinesi.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("ilk sayı");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(89, 92, 96, 39);
		frmHesapMakinesi.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ikinci sayı");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(427, 99, 79, 25);
		frmHesapMakinesi.getContentPane().add(lblNewLabel_1);

		sayi1 = new JTextField();
		sayi1.setBounds(70, 141, 96, 19);
		frmHesapMakinesi.getContentPane().add(sayi1);
		sayi1.setColumns(10);

		sayi2 = new JTextField();
		sayi2.setBounds(410, 138, 96, 19);
		frmHesapMakinesi.getContentPane().add(sayi2);
		sayi2.setColumns(10);

		JButton btntopla = new JButton("Topla");
		btntopla.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					int a1=Integer.parseInt(sayi1.getText());
					int a2=Integer.parseInt(sayi2.getText());
					int total=a1+a2;
					resault.setText(Integer.toString(total));
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null, "Lütfen sayi giriniz...");
				}
			}
		});
		btntopla.setBounds(10, 204, 128, 53);
		frmHesapMakinesi.getContentPane().add(btntopla);

		JButton btncikar = new JButton("Çıkar");
		btncikar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a1=Integer.parseInt(sayi1.getText());
					int a2=Integer.parseInt(sayi2.getText());
					int total=a1-a2;
					resault.setText(Integer.toString(total));
				}
				catch(Exception ex) {
					JOptionPane.showMessageDialog(null, "Lütfen sayi giriniz...");
				}
			}
		});
		btncikar.setBounds(165, 204, 128, 53);
		frmHesapMakinesi.getContentPane().add(btncikar);

		JButton btncarp = new JButton("Çarp");
		btncarp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a1=Integer.parseInt(sayi1.getText());
					int a2=Integer.parseInt(sayi2.getText());
					int total=a1*a2;
					resault.setText(Integer.toString(total));
				}
				catch(Exception ey) {
					JOptionPane.showMessageDialog(null, "Lütfen sayi giriniz...");
				}
			}
		});
		btncarp.setBounds(323, 204, 128, 53);
		frmHesapMakinesi.getContentPane().add(btncarp);

		JButton btnbol = new JButton("Böl");
		btnbol.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					int a1=Integer.parseInt(sayi1.getText());
					int a2=Integer.parseInt(sayi2.getText());
					double bolme=(double)a1/a2;
					resault.setText(Double.toString(bolme));
				}
				catch(Exception ez) {
					JOptionPane.showMessageDialog(null, "Lütfen sayi giriniz...");
				}
			}
		});
		btnbol.setBounds(480, 204, 128, 53);
		frmHesapMakinesi.getContentPane().add(btnbol);

		JLabel lblNewLabel_2 = new JLabel("Hesap Makinesi");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.BOLD, 14));
		lblNewLabel_2.setBounds(264, 32, 128, 25);
		frmHesapMakinesi.getContentPane().add(lblNewLabel_2);

		resault = new JTextField();
		resault.setBounds(244, 317, 148, 39);
		frmHesapMakinesi.getContentPane().add(resault);
		resault.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(297, 393, -34, -10);
		frmHesapMakinesi.getContentPane().add(lblNewLabel_3);

		JLabel lblNewLabel_4 = new JLabel("                      Sonuç Ekranı");
		lblNewLabel_4.setBounds(221, 366, 192, 17);
		frmHesapMakinesi.getContentPane().add(lblNewLabel_4);
	}
}
