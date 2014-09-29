import java.io.*;
import java.util.Scanner;

public class bank{
	public static void main(String[]args){
		int a,b,c,e;
		char d;
		e=50000;
		Scanner in = new Scanner(System.in);
		do{
			atas:
			System.out.println("************************");
			System.out.println("*      BANK KRUT       *");
			System.out.println("************************");
			System.out.println("************************");
			System.out.println("*  Menu Transaksi      *");
			System.out.println("*  1. Tarik Tunai      *");
			System.out.println("*  2. Setor uang       *");
			System.out.println("*  3. Informasi Saldo  *");
			System.out.println("*  4. Keluar           *");
			System.out.println("************************");
			System.out.print(" | Pilih Menu : ");
			a = in.nextInt();
			switch (a){
				case 1 :
				{
					System.out.print(" | Berapa uang yang akan diambil ? ");
					b = in.nextInt();
					if (e-b<10000){
						System.out.println(" | maaf saldo anda terlalu kecil");
					}
					else{
						e=e-b;
						System.out.println(" | anda berhasil mengambil uang : Rp. "+b);
					}
					System.out.print("\n\n");
				}
				break;
				case 2 :
				{
					System.out.print(" | Berapa uang yang akan disetorkan ? ");
					c = in.nextInt();
					if(c<0){
						System.out.println(" | penyetoran gagal, periksa kembali nominal uang !");
					}else{
							e=e+c;
							System.out.println(" | anda berhasil menyetorkan uang : Rp. "+c);
							System.out.print("\n\n");
						}
				}
				break;
				case 3:
				{
					System.out.println(" | Saldo anda : Rp. "+e);
				}
				case 4:
				{
					System.exit(0);
				}
			}
			System.out.print(" | Kembali ke Menu Utama (Y/T)? ");
			d = in.next().charAt(0);
			System.out.print("\n\n");
		}
		while(d=='Y'||d=='y');
	}
}