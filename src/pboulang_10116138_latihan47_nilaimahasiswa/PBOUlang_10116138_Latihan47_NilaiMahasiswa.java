/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboulang_10116138_latihan47_nilaimahasiswa;

/**
 *
 * @author 
 * NAMA     : Afif Raditya Nugraha
 * KELAS    : PBO_ULANG/IF4
 * NIM      : 10116138
 * LOG      : Program ini berisi program untuk Menampilkan Nilai Mahasiswa 
 */
public class PBOUlang_10116138_Latihan47_NilaiMahasiswa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai mahasiswa = new Nilai(75, 45, 34);
        System.out.println("QUIZ : " + mahasiswa.getnQuiz());
        System.out.println("UTS : " + mahasiswa.getnUts());
        System.out.println("UAS : " + mahasiswa.getnUas());
        System.out.println("");
        System.out.println("Nilai Akhir : " + mahasiswa.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Indeks : " + mahasiswa.nilaiIndeks(mahasiswa.hitungNilaiAkhir()));
        System.out.println("Keterangan : " + mahasiswa.indeksKeterangan(mahasiswa.nilaiIndeks(mahasiswa.hitungNilaiAkhir())));
        System.out.println("");

        Nilai mahasiswa2 = new Nilai(60, 80, 75);
        System.out.println("QUIZ : " + mahasiswa2.getnQuiz());
        System.out.println("UTS : " + mahasiswa2.getnUts());
        System.out.println("UAS : " + mahasiswa2.getnUas());
        System.out.println("");
        System.out.println("Nilai Akhir : " + mahasiswa2.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Indeks : " + mahasiswa2.nilaiIndeks(mahasiswa2.hitungNilaiAkhir()));
        System.out.println("Keterangan : " + mahasiswa2.indeksKeterangan(mahasiswa2.nilaiIndeks(mahasiswa2.hitungNilaiAkhir())));
        System.out.println("");

        Nilai mahasiswa3 = new Nilai(30, 80, 40);
        System.out.println("QUIZ : " + mahasiswa3.getnQuiz());
        System.out.println("UTS : " + mahasiswa3.getnUts());
        System.out.println("UAS : " + mahasiswa3.getnUas());
        System.out.println("");
        System.out.println("Nilai Akhir : " + mahasiswa3.hitungNilaiAkhir());
        System.out.println("");
        System.out.println("Indeks : " + mahasiswa3.nilaiIndeks(mahasiswa3.hitungNilaiAkhir()));
        System.out.println("Keterangan : " + mahasiswa3.indeksKeterangan(mahasiswa3.nilaiIndeks(mahasiswa3.hitungNilaiAkhir())));
        System.out.println("");

    }

}
