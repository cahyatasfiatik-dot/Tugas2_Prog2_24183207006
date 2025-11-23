
package mahasiswa2;

import java.util.Scanner;


public class MainApp {
    public static void main(String[] args){
        Scanner input= new Scanner(System.in);
        Mahasiswa mhs = null; 
        int pilihan;

        do {
            System.out.println("===== MENU DATA MAHASISWA =====");
            System.out.println("1. Tambah Data");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihan = input.nextInt();
            input.nextLine();

        if (pilihan == 1) {
            System.out.print("Masukkan NPM        : ");
            String npm = input.nextLine();
            System.out.print("Masukkan Nama       : ");
            String nama = input.nextLine();
            System.out.print("Masukkan Prodi      : ");
            String prodi = input.nextLine();
        

            mhs = new Mahasiswa(npm, nama, prodi);
            System.out.println("Data berhasil ditambahkan!");

        } else if (pilihan == 2) {
            if (mhs != null) {
                mhs.tampilkanData();
            } else {
                System.out.println("Belum ada data mahasiswa!");
            }

        } else if (pilihan == 3) {
            System.out.println("Data Selesai Dimasukkan");
            System.out.println("Keluar dari program...");
            System.out.println("<<<<<>>>>>");
            
        } else {
            System.out.println("!Pilihan tidak valid!");
        }
        } while (pilihan != 3); 

        input.close();
    }
}
