package Collab1;

import java.util.Scanner;

public class StudiKasus2_20 {
    public static void main(String[] args) {
        Scanner fatus = new Scanner(System.in);

        System.out.println("Nama Mahasiswa: ");
        String namaMahasiswa = fatus.nextLine();

        System.out.println("Jenis kegiatan: ");
        String jenisKegiatan = fatus.nextLine();

        System.out.println("Jumlah dokumen: ");
        int jumlahDokumen = fatus.nextInt();

        if (jenisKegiatan.equalsIgnoreCase("BELMAWA") || jenisKegiatan.equalsIgnoreCase("BAKORMA") || jenisKegiatan.equalsIgnoreCase("MANDIRI")) {
            System.out.println("Peringkat Juara: ");
            int peringkatJuara = fatus.nextInt();

            if (peringkatJuara >= 1 && peringkatJuara <=3){

                if (jumlahDokumen == 4){
                    System.out.println("Status: Berhak memperoleh dana penghargaan.");
                } else {
                    int kurang = 4 - jumlahDokumen;
                    System.out.println("Status: Dokumen tidak lengkap (kurang " +kurang+ " dokumen). Dana penghargaan tidak diberikan");
                }
                
            } else {
                System.out.println("Tidak memperoleh dana penghargaan");
            }

        } else if (jenisKegiatan.equalsIgnoreCase("PKM")) {
            System.out.println("Status pendanaan PKM (1= Lolos / 0= Tidak Lolos): ");
            int statusPKM = fatus.nextInt();

            if (statusPKM == 1){
                System.out.println("Status: Dokumen lengkap. Dana penghargaan diberikan.");
            } else {
                System.out.println("Status: Dokumen lengkap, tetapi tidak lolos PKM. Dana penghargaan tidak diberikan.");
            }
        } else if (jenisKegiatan.equalsIgnoreCase("LAINNYA")){
            System.out.println("Tidak memperoleh dana penghargaan.");
        } else {
            System.out.println("Jenis kegiatan tidak valid.");
        }
    }
}