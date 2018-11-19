package introclassJava;

class IntObj {
    public int value;
    public IntObj () {
    } public IntObj (int i) {
        value = i;
    }
}

class FloatObj {
    public float value;
    public FloatObj () {
    } public FloatObj (float i) {
        value = i;
    }
}

class LongObj {
    public long value;
    public LongObj () {
    } public LongObj (long i) {
        value = i;
    }
}

class DoubleObj {
    public double value;
    public DoubleObj () {
    } public DoubleObj (double i) {
        value = i;
    }
}

class CharObj {
    public char value;
    public CharObj () {
    } public CharObj (char i) {
        value = i;
    }
}

public class syllables_2af3c416_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        syllables_2af3c416_003 mainClass = new syllables_2af3c416_003 ();
        String output;
        if (args.length > 0) {
            mainClass.scanner = new java.util.Scanner (args[0]);
        } else {
            mainClass.scanner = new java.util.Scanner (System.in);
        }
        mainClass.exec ();
        System.out.println (mainClass.output);
    }

    public static int str_size = 20;
    public void exec () throws Exception {
        char[] x = new char[str_size];
        IntObj len = new IntObj (), i = new IntObj (), vowels = new IntObj ();
        vowels.value = 0;
        output += (String.format ("Please enter a string > "));
        x = scanner.next ().toCharArray ();
        len.value = x.length;
        for (i.value = 0; i.value < len.value; ++i.value) {
            if ((x[i.value] == 'a') || (x[i.value] == 'e') || (x[i.value] == 'i')
                    || (x[i.value] == 'o') || (x[i.value] == 'u')
                    || (x[i.value] == 'y')) {
                vowels.value += 1;
            }
        }
        output +=
            (String.format ("The number of syllables is %d.\n", vowels.value));
        if (true)
            return;;
    }
}
