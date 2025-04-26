import java.util.Scanner;

interface Identitas7 {
    public void tampilkanNama();

    public void tampilkanUmur();
}

public class MainMakhlukHidup7 {
    public static void main(String[] args) {
        Scanner newInput = new Scanner(System.in);

        System.out.print("Masukkan Nama Anda : ");
        String nama = newInput.nextLine();

        System.out.print("Masukkan Umur Anda : ");
        int umur = newInput.nextInt();

        Manusia7 m1 = new Manusia7(nama, umur);

        System.out.println("\n=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        m1.tampilkanNama();
        m1.tampilkanUmur();
        m1.makan();
        m1.berjalan();
        m1.bersuara();
    }
}

class Manusia7 implements MakhlukHidup7, Identitas7 {
    private String nama;
    private int umur;

    public Manusia7(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void makan() {
        System.out.println("Makan pakai sendok garpu");
    }

    public void berjalan() {
        System.out.println("Jalan pakai dua kaki");
    }

    public void bersuara() {
        System.out.println("Suaranya merdu");
    }

    public void tampilkanNama() {
        System.out.println("Nama saya: " + this.nama);
    }

    public void tampilkanUmur() {
        System.out.println("Umur saya: " + this.umur);
    }
}

interface MakhlukHidup7 {
    public void makan();

    public void berjalan();

    public void bersuara();
}
