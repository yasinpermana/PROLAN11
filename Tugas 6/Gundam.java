import java.util.Scanner;

public class Gundam{
	
	public static void main (String[]args){
		Gundam gundam = new Gundam();
		gundam.SD(); //konstruktor
		gundam.HG(); //konstruktor
		gundam.MG(); //konstruktor
		gundam.PG(); //konstruktor
	}
  public void SD(){
 	System.out.println("--------JENIS GUNDAM SD----------");
	System.out.println("1.SD FREEDOM ");
	System.out.println("2.SD STRIKE");
	System.out.println("3.SD UNICORN");
	System.out.println("4.SD DESTINY");
	System.out.println("5.SD STRIKE FREEDOM")
	}

	public void HG(){
 	System.out.println("--------JENIS GUNDAM HG/RG----------");
	System.out.println("1.RG/HG FREEDOM ");
	System.out.println("2.RG/HG STRIKE");
	System.out.println("3.HG UNICORN");
	System.out.println("4.RG/HG DESTINY");
	System.out.println("5.RG/HG STRIKE FREEDOM");
	}
	
	public void MG(){
 	System.out.println("--------JENIS GUNDAM MG----------");
	System.out.println("1.MG FREEDOM ");
	System.out.println("2.MG STRIKE");
	System.out.println("3.MG UNICORN");
	System.out.println("4.MG DESTINY");
	System.out.println("5.MG STRIKE FREEDOM");
	}


	public void PG(){
 	System.out.println("--------JENIS GUNDAM PG----------");
	System.out.println("1.PG OO RAISER ");
	System.out.println("2.PG STRIKE");
	System.out.println("3.PG UNICORN");
	System.out.println("4.PG WING ZERO");
	System.out.println("5.PG STRIKE FREEDOM");
	}	
 }