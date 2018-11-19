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

public class syllables_90a14c1a_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        syllables_90a14c1a_000 mainClass = new syllables_90a14c1a_000 ();
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
        char[] input = new char[21];
        IntObj i = new IntObj (), syllables = new IntObj ();
        output += (String.format ("Please enter a string > "));
        input = scanner.next ().toCharArray ();
        syllables.value = 0;
        i.value = 0;
        while (i.value < input.length) {
            if (input[i.value] == 'a') {
                syllables.value = syllables.value + 1;
            }
            if (input[i.value] == 'e') {
                syllables.value = syllables.value + 1;
            }
            if (input[i.value] == 'i') {
                syllables.value = syllables.value + 1;
            }
            if (input[i.value] == 'o') {
                syllables.value = syllables.value + 1;
            }
            if (input[i.value] == 'u') {
                syllables.value = syllables.value + 1;
            }
            if (input[i.value] == 'y') {
                syllables.value = syllables.value + 1;
            }
            i.value = i.value + 1;
        }
        output +=
            (String.format ("The number of syllables is %d.\n", syllables.value));
        if (true)
            return;;
    }
}
