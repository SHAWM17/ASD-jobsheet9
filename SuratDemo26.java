import java.util.Scanner;
public class SuratDemo26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackSurat26 tumpukan = new StackSurat26(10); // Kapasitas 10 surat
        int pilih;

        do {
            System.out.println("\n--- Sistem Manajemen Surat Izin ---");
            System.out.println("1. Terima Surat Izin (Push)");
            System.out.println("2. Proses Surat Izin (Pop)");
            System.out.println("3. Lihat Surat Izin Terakhir (Peek)");
            System.out.println("4. Cari Surat (Search by Name)");
            System.out.println("5. Keluar");
            System.out.print("Pilih Menu: ");
            pilih = scan.nextInt();
            scan.nextLine(); // clear buffer

            switch (pilih) {
                case 1:
                    System.out.print("ID Surat: "); String id = scan.nextLine();
                    System.out.print("Nama Mahasiswa: "); String nama = scan.nextLine();
                    System.out.print("Kelas: "); String kelas = scan.nextLine();
                    System.out.print("Jenis Izin (S/I): "); char jenis = scan.next().charAt(0);
                    System.out.print("Durasi (hari): "); int durasi = scan.nextInt();
                    
                    Surat26 baru = new Surat26(id, nama, kelas, jenis, durasi);
                    tumpukan.push(baru);
                    System.out.println("Surat berhasil diterima.");
                    break;

                case 2:
                    Surat26 diproses = tumpukan.pop();
                    if (diproses != null) {
                        System.out.println("Memproses/Validasi surat dari: " + diproses.namaMahasiswa);
                        System.out.println("Status: Berhasil Diverifikasi.");
                    }
                    break;

                case 3:
                    Surat26 teratas = tumpukan.peek();
                    if (teratas != null) {
                        System.out.println("Surat terakhir yang masuk: " + teratas.namaMahasiswa + " (" + teratas.idSurat + ")");
                    } else {
                        System.out.println("Tidak ada surat di tumpukan.");
                    }
                    break;

                case 4:
                    System.out.print("Masukkan nama mahasiswa yang dicari: ");
                    String cariNama = scan.nextLine();
                    tumpukan.cariSurat(cariNama);
                    break;

                case 5:
                    System.out.println("Keluar program...");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilih != 5);
        scan.close();
    }
}
