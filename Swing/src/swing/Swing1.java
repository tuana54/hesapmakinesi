package swing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Swing1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame jf=new JFrame("ilk pencerem");
		jf.setTitle("ilk pencerem");
		//ikisi de aynı şey
		jf.setSize(600,600);
		jf.setLocation(100,200);
		
		jf.getContentPane().setLayout(new FlowLayout());
		
		JTextField text1=new JTextField(10);
		//kaç karakter olmasını istiyorsam parametre olarak onu yazıyorum b en 10 yazdım 10 kaerakterli bir text field oluşturucak
		JButton buton1=new JButton("Gönder");
		//bu şekilde çağırırsam ekrana hiçbir şey gelmez ama bunu getContentPane yapısına eklersem o zaman çalışır
		JLabel label1=new JLabel();
		label1.setText("Buraya ismizini giriniz: ");
		
		jf.getContentPane().add(label1);
		jf.getContentPane().add(text1);
		jf.getContentPane().add(buton1);
		//ekleme yaparken hangisini önce eklersem no solda olucak 
		
		buton1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				label1.setText("Merhabalar "+text1.getText()+" ,programa hoşgeldin");
				//set ile içine yazıyorum  get ile yazdığımı çekiyorum.
			}
		});
		
		Color eskirenk=buton1.getBackground();
		
		buton1.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseEntered(MouseEvent e) {
				buton1.setBackground(Color.ORANGE);
			}

			@Override
			public void mouseExited(MouseEvent e) {
				buton1.setBackground(eskirenk);
			}
			
		});
		
		JButton buton2=new JButton("Tıkla");
		
		buton2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				JOptionPane panelimiz=new JOptionPane();
				panelimiz.showMessageDialog(null,"Merhabalar panele hoşgeldiniz...");
				//kullanıcıya mesaj yazma komutu showMessageDialog
			}
		});
		
		
		JButton buton3=new JButton("Giriş");
		
		buton3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				String isim=JOptionPane.showInputDialog("Lütfen isiminizi giriniz: ");
				//kullanıcıdan mesaj alma komutu showInputDialog
				JOptionPane.showMessageDialog(null,"Hoşgeldiniz "+isim);
			}
		});
		
		JButton buton4=new JButton("Yeni Buton");
		
		jf.getContentPane().setBackground(new Color(200,100,150));
		
		buton4.setBackground(Color.PINK);
		buton4.setForeground(Color.RED);
		buton4.setFont(new Font("Times New Roman",Font.BOLD,14));
		
		JButton buton5=new JButton("OK");
		Image img1=new ImageIcon(Swing1.class.getResource("/son.png")).getImage();
		buton5.setIcon(new ImageIcon(img1));
		
		JLabel ekranresmi=new JLabel();
		Image img2=new ImageIcon(Swing1.class.getResource("/arka.jpg")).getImage();
		ekranresmi.setIcon(new ImageIcon(img2));
		
		
		
		
		
		jf.getContentPane().add(buton2);
		jf.getContentPane().add(buton3);
		jf.getContentPane().add(buton4);
		jf.getContentPane().add(buton5);
		jf.getContentPane().add(ekranresmi);
		
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//çarpı butonuna bastığımızda uygulamanın kapanmasını sağlar eğer bunu yazmazsak çarpıya bastığımızda kapansa bile arka planda çalışmaya devam eder
		jf.setAutoRequestFocus(false);
		//böyle yaptığımda sayfanın genişliğini büyüklüğünün değişmesine izin vermemiş oluyorum bunub yazmazsam otomatik true olarak davranır
		jf.setVisible(true);
		// setVisible frame in ekranda görülmesine sağlıyor içerisi true olduğu sürece ekranda görünür
		//setVisible olmasaydı run ettiğimde hiçbir şey görmezdim
	}

	private static String getResource(String string) {
		// TODO Auto-generated method stub
		return null;
	}

}
