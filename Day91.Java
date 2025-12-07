import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("nama\t : ");
	String nama = in.nextLine();
	System.out.print("Prodi\t : ");
String a = in.nextLine();
System.out.print("Umur\t : ");
int b =in.nextInt();


System.out.println("Nama saya adalah "+aku(nama));
System.out.println("Prodi Saya adalah "+aku(a));
System.out.println("Umur saya adalah "+iya(b)+" tahun ");
		
	}
	static String aku(String nama){
	    return nama;
	}
	static int iya(int b){
	    return b;
	}
