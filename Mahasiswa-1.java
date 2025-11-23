
package mahasiswa;

public class Mahasiswa {
     // Variabel Global 
    private String npm;      
    private String nama;     
    private String prodi;      

    // Konstruktor Default 
 public Mahasiswa() {
        npm = "";
        nama = "";
    }
    // Konstruktor Berparameter 
    public Mahasiswa(String npm, String nama, String prodi) {
        this.npm = npm;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Setter dan Getter 
    public void setNim(String npm){ 
        this.npm = npm; 
    }
    public String getNpm(){ 
        return npm; 
    }

    public void setNama(String nama){ 
        this.nama = nama; 
    }
    public String getNama(){ 
        return nama; 
    }

    public void setProdi(String prodi){ 
        this.prodi = prodi; 
    }
    public String getProdi(){ 
        return prodi; 
    }


    //Method tambahan 
    public void tampilkanData() {
        //Menampilkan semua data dari class Mahasiswa
        System.out.println("======================================");
        System.out.println("NPM           : " + npm);
        System.out.println("Nama          : " + nama);
        System.out.println("Program Studi : " + prodi);
        System.out.println("======================================");
    }
}
