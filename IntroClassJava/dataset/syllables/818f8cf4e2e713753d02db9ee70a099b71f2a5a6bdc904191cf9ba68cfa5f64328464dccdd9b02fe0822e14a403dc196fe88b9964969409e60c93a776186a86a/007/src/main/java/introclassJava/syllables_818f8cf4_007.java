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

public class syllables_818f8cf4_007 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        syllables_818f8cf4_007 mainClass = new syllables_818f8cf4_007 ();
        String output;
        if (args.length > 0) {
            mainClass.scanner = new java.util.Scanner (args[0]);
        } else {
            mainClass.scanner = new java.util.Scanner (System.in);
        }
        mainClass.exec ();
        System.out.println (mainClass.output);
    }

    public void exec () throws Exception {
        char[] str = new char[20];
        IntObj syllables = new IntObj (0), i = new IntObj (0), len =
            new IntObj ();
        output += (String.format ("Please enter a string > "));
        str = scanner.next ().toCharArray ();
        len.value = str.length;
        for (i.value = 0; i.value < len.value; i.value++) {
            if (str[i.value] == 'a') {
                syllables.value++;
            }
            if (str[i.value] == 'e') {
                syllables.value++;
            }
            if (str[i.value] == 'i') {
                syllables.value++;
            }
            if (str[i.value] == 'o') {
                syllables.value++;
            }
            if (str[i.value] == 'u') {
                syllables.value++;
            }
            if (str[i.value] == 'y') {
                syllables.value++;
            }
        }
        output +=
            (String.format ("The number of syllables is %d.\n", syllables.value));
        if (true)
            return;;
    }
}
