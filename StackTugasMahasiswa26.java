public class StackTugasMahasiswa26 {
    Mahasiswa26[] stack;
    int top;
    int size;

    public StackTugasMahasiswa26(int size) {
        this.size = size;
        this.stack = new Mahasiswa26[size];
        this.top = -1;
    }

    public boolean isFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(Mahasiswa26 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
        } else {
            System.out.println("Stack sudah penuh");
        }
    }

    public Mahasiswa26 pop() {
        if (!isEmpty()) {
            Mahasiswa26 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    public Mahasiswa26 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    public void print(){
        if (!isEmpty()) {
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
            }
        } else {
            System.out.println("Stack kosong");
        }
    }

    public Mahasiswa26 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    public int getCount() {
        return top + 1; 
    }

    public String konversiDesimalKeBiner (int nilai){
        StackKonversi26 stack = new StackKonversi26();
        while (nilai > 0) {
            int sisa = nilai % 2;
            stack.push(sisa);
            nilai = nilai / 2;
        }
        String biner = new String();
        while (!stack.isEmpty()) {
            biner += stack.pop();
        }
        return biner;
    }
}
