import java.util.Scanner;

public class Nilai {
  public static Scanner input = new Scanner(System.in);

  public static int isWithinRange(float x, float min, float max) {
    byte result = 1;
    if (x < min || x > max) {
      result = 0;
    }
    return result;
  }

  public static void main(String[] args) {
    float grade_points = 0, sum_grade_points = 0, average_students = 0;
    int count_students = 0, passed_students = 0, failed_students = 0;
    boolean exit = false;

    
    System.out.println("\n--------------------------------------\n");
	System.out.println("Program Sederhana Menghitung IP");
	System.out.println("Untuk berenti masukan -999.");
    System.out.println("\n--------------------------------------\n");

    do {
      System.out.print("Masukan IP Mahasiswa                : ");
      grade_points = input.nextFloat();
      if (isWithinRange(grade_points, 0f, 4f) == 1) {
        count_students++;
        if (isWithinRange(grade_points, 2.75f, 4f) == 1) {
          passed_students++;
        }
        else {
          failed_students++;
        }
        sum_grade_points += grade_points;
      }
      else if (grade_points == -999) {
        exit = true;
      }
      else 
		  
    } while (!exit);

    System.out.println("\n--------------------------------------\n");
    if (count_students > 0) {
      average_students = sum_grade_points / count_students;
      System.out.println("Banyak Mahasiswa                    : " + count_students);
      System.out.println("Banyak Mahasiswa Lulus (IP >= 2.75) : " + passed_students);
      System.out.println("Banyak Mahasiswa Tidak Lulus        : " + failed_students);
      System.out.println("Rata-Rata IP Mahasiswa              : " + average_students);
    }
    else {
      System.out.println("Tidak ada data, mohon isi data.");
    }
    System.out.println("\n--------------------------------------\n");
    
  }
}