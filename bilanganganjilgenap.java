import java.util.Scanner;
public class bilanganganjilgenap {
public static void main (String args[])
{
int angka;
System.out.println("MASUKAN NILAI KAMU:");
Scanner masukan = new Scanner(System.in);
angka = masukan.nextInt();
if (angka % 2 == 0 ) {
	System.out.println("bilangan genap");
}else {
	System.out.println("bilangan ganjil");
}
}
}
