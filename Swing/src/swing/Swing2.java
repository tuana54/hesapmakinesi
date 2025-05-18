package swing;

import javax.swing.JOptionPane;

public class Swing2 {
	public static void main(String[] args) {
		int vize1,vize2;
		int final1;
		
		String svize1=JOptionPane.showInputDialog("Lütfen 1. vize notunuzu giriniz: ");
		//JOptionPane den 1. vize notunu aldık
		vize1=Integer.parseInt(svize1);
		//aldığımız notu integer a çevirip vize1 e atadık
		
		while(vize1<0 || vize1>100) {
			svize1=JOptionPane.showInputDialog(null,"Lütfen 1.vize notunuzu giriniz: ","Vize1",JOptionPane.WARNING_MESSAGE);
			//burda tekrar string olarak çekiyoruz 
			vize1=Integer.parseInt(svize1);
			//o yüzden bir dönüştürme işlemi daha yapıyorz
		}
		
		String svize2=JOptionPane.showInputDialog("Lütfen 2. vize notunuzu giriniz: ");
		//JOptionPane den 2. vize notunu aldık
		vize2=Integer.parseInt(svize2);
		//aldığımız notu integer a çevirip vize2 e atadık
		
		while(vize2<0 || vize2>100) {
			svize2=JOptionPane.showInputDialog(null,"Lütfen 2.vize notunuzu giriniz: ","Vize2",JOptionPane.WARNING_MESSAGE);
			vize2=Integer.parseInt(svize2);
		}
		
		String sfinal1=JOptionPane.showInputDialog(null,"Lütfen final notunuzu giriniz: ","Final",JOptionPane.QUESTION_MESSAGE);
		final1=Integer.parseInt(sfinal1);
		
		while(final1<0 ||final1>100) {
			sfinal1=JOptionPane.showInputDialog(null,"Lütfen final notunuzu giriniz","Final",JOptionPane.WARNING_MESSAGE);
			final1=Integer.parseInt(sfinal1);
		}
		
		double result=vize1*0.2+vize2*0.2+final1*0.6;
		String mesaj="";
		
		if(result>50) {
			mesaj="Tebrikler dersten geçtiniz";
		}
		else {
			mesaj="Kaldınız";
		}
		//ImageIcon iconcan=new EmageIcon("buraya uzantıyı giricez ama tek / ları double // yaparak yazıcaz ypksa çalışmaz");
		JOptionPane.showMessageDialog(null, mesaj,"Sonuç açıklama ",JOptionPane.INFORMATION_MESSAGE);
		
	}
}
