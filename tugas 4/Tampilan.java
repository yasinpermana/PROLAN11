import java.util.Scanner;

public class Tampilan {
   
  public void Layar(){
	Gundam Tampilan= new Gundam();
	
	Scanner scan=new Scanner(System.in);
	System.out.println("===========================================");

	System.out.println("||         PROGRAM TYPE GUNDAM           ||");

	System.out.println("===========================================");

	System.out.println("|| 1. SD                     ||");

	System.out.println("|| 2. RG/HG                     ||");

	System.out.println("|| 3. MG                      ||");

	System.out.println("|| 4. PG                      ||");
	System.out.println("===========================================");
	System.out.print("PILIH 1-4 : ");
	char pilih=(char) scan.nextInt();
	
      switch (pilih) {
          case 1:
              Tampilan.SD();
              break;
          case 2:
              Tampilan.HG();
              break;
          case 3:
              Tampilan.MG();
              break;
          case 4:
              Tampilan.PG();
              break;
          default:
              System.out.println("ERROR!!!");
              break;
         }

	

	}
 
 
    
}