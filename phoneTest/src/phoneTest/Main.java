package phoneTest;

public class Main {

	public static void main(String[] args) {
		String model;
		double ram;
		double cpu;
		int coreCount;
		double performance;
		double maxRam=32*1024;
		double maxCpu=4800;
		double ramPerformance;
		double cpuPerformance;
		model="Xiaomi Note 10 Lite";
		ram=6*1024;//6144
		cpu=2400;
		coreCount=4;
		ramPerformance=0.4*ram/maxRam*100;
		cpuPerformance=0.6*cpu/maxCpu*100;
		performance=ramPerformance+cpuPerformance;//(0,15)+(0,4)
		System.out.println(model+" : %"+performance);
		System.out.println("      Ram :%"+ramPerformance);
		System.out.println("      Cpu :%"+cpuPerformance);
		System.out.println("      Batarya :%92.45");
	}
//arabalar� de�erlendirmek istiyorum. 
//%55 motorg�c� %25 silindir say�s� %20 jant �l��s�
//carPerformance projesini olu�turtun ve ilgili kodlamay� ger�ekle�tirin 
}
