package computerParts;

public class Main {

	public static void main(String[] args) {
		String ramText="Kingston 16 Gb 14200Mhz DDR 4";
		double ramPrice=84.47;
		String cpuText="Intel i7 12Gen";
		double cpuPrice=148.65;
		double computerPrice=0;
		double dolarTl=26.89;
		double computerTlPrice=0;
		double computerTaxPrice=0;//bilgisayar�n vergisi
		double taxRatio=0.20;//vergi oran�
		double computerTlTaxPrice=0;//bilgisayar�n tl olarak vergisi
		computerPrice=ramPrice+cpuPrice;
		computerTlPrice=computerPrice*dolarTl;
		computerTaxPrice=computerPrice*taxRatio;
		computerTlTaxPrice=computerTlPrice*taxRatio;
		
//Ram :Kingston 16 Gb 14200Mhz DDR 4 (84.47$)
		System.out.println("Ram :"+ramText+" ("+ramPrice+"$)");
		System.out.println("��lemci :"+cpuText+" ("+cpuPrice+"$)");
		System.out.println("Fiyat :"+computerPrice+"$ ("+computerTlPrice+"TL)");
		System.out.println("KDV :"+computerTaxPrice+"$ ("+computerTlTaxPrice+"TL)");
		System.out.println("indirim oran�:"+(taxRatio*100));
		//KDV : 157.78$ (1478TL)
		//productTicket
		//�r�n : Nike asdjkasd a daskdjasdas dkjas
		//Fiyat: 2489.45TL
		//�ndirim Oran� : % 40
		//�ndirimli Fiyat : 1847.50TL
		// �r�n->product fiyat->price indirim->discount oran->ratio 
		//indirimli->discounted
	}

}
