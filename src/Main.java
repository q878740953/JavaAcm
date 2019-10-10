import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int length = a.nextInt();
        int num = a.nextInt();
        DNA[] d = new DNA[num];
        a.nextLine();
        for (int i = 0; i < num; i++) {
            d[i] = new DNA(a.nextLine());
        }

        sort(d);

        for (int i = 0; i < num; i++) {
            System.out.println(d[i].str);
        }

        a.close();
    }

    public static void sort(DNA[] dna) {
        DNA tmp = new DNA();
        for (int i = 0; i < dna.length; i++) {
            for (int j = 1; j < dna.length - i; j++) {
                if (dna[j - 1].compare(dna[j])) {
                    tmp.set(dna[j]);
                    dna[j].set(dna[j - 1]);
                    dna[j - 1].set(tmp);
                }
            }
        }
    }
}

class DNA {
    String str;
    int inversion = 0;

    DNA() {
        this.str = null;
    }

    DNA(String str) {
        this.str = str;
        count();
    }

    public void count() {
        char ch[] = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (ch[i] > ch[j])
                    inversion++;
            }
        }
    }

    public boolean compare(DNA dna) {
        if (this.inversion >= dna.inversion) {
            return true;
        } else return false;
    }

    public void set(DNA d) {
        this.str = d.str;
        this.inversion = d.inversion;
    }
}
