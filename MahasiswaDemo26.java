import java.util.Scanner;
public class MahasiswaDemo26 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        StackTugasMahasiswa26 stack = new StackTugasMahasiswa26(5);
        int pilih;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Mengumpulkan tugas");
            System.out.println("2. Menilai tugas");
            System.out.println("3. Melihat tugas teratas");
            System.out.println("4. Menampilkan daftar tugas");
            System.out.println("Pilih: ");
            pilih = scan.nextInt();
            scan.nextLine(); // membersihkan buffer
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scan.nextLine();
                    System.out.print("NIM: ");
                    String nim = scan.nextLine();
                    System.out.print("Kelas: ");
                    String kelas = scan.nextLine();
                    Mahasiswa26 mhs = new Mahasiswa26(nama, nim, kelas);
                    stack.push(mhs);
                    System.out.printf("Tugas %s berhasil dikummpulkan", mhs.nama);
                    break;
                case 2:
                    Mahasiswa26 dinilai = stack.pop();
                    if (dinilai != null) {
                        System.out.print("Menilai tugas dari " + dinilai.nama);
                        System.out.print("Masukkan nilai (0-100): ");
                        int nilai = scan.nextInt();
                        dinilai.tugasDinilai(nilai);
                        System.out.printf("Tugas %s berhasil dinilai dengan nilai %d\n", dinilai.nama, nilai);
                    }
                    break;
                case 3:
                    Mahasiswa26 lihat = stack.peek();
                    if (lihat != null){
                        System.out.println("Tugas terakhir dikumpulkan oleh " + lihat.nama);
                    }
                    break;
                case 4:
                    System.out.println("Daftar semua tugas");
                    System.out.println("Nama\tNIM\tKelas");
                    stack.print();
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            } 
        } while (pilih >= 1 && pilih <= 4);
    }
}
