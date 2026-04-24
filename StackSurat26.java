public class StackSurat26 {
    Surat26[] stack;
    int top;
    int size;

    public StackSurat26(int size) {
        this.size = size;
        this.stack = new Surat26[size];
        this.top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(Surat26 srt) {
        if (!isFull()) {
            top++;
            stack[top] = srt;
        } else {
            System.out.println("Tumpukan surat sudah penuh!");
        }
    }

    public Surat26 pop() {
        if (!isEmpty()) {
            Surat26 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Tumpukan surat kosong!");
            return null;
        }
    }

    public Surat26 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    // Fitur Tambahan: Cari Surat berdasarkan Nama
    public void cariSurat(String nama) {
        boolean ditemukan = false;
        for (int i = top; i >= 0; i--) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                System.out.println("Surat Ditemukan!");
                System.out.println("ID: " + stack[i].idSurat + " | Nama: " + stack[i].namaMahasiswa + 
                                   " | Jenis: " + (stack[i].jenisIzin == 'S' ? "Sakit" : "Izin") + 
                                   " | Durasi: " + stack[i].durasi + " hari");
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Surat dengan nama " + nama + " tidak ditemukan.");
        }
    }
}
