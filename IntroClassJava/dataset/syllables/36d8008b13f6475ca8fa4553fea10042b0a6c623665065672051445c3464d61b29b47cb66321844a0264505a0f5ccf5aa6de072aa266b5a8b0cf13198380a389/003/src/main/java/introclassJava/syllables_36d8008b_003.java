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

public class syllables_36d8008b_003 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        syllables_36d8008b_003 mainClass = new syllables_36d8008b_003 ();
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
        char[] instr = new char[21];
        IntObj i = new IntObj (), len = new IntObj (), s = new IntObj ();
        s.value = 0;
        output += (String.format ("Please enter a string > "));
        instr = scanner.next ().toCharArray ();
        len.value = instr.length;
        for (i.value = 0; i.value < len.value; i.value++) {
            if (instr[i.value] == 'a' || instr[i.value] == 'e'
                    || instr[i.value] == 'i' || instr[i.value] == 'o'
                    || instr[i.value] == 'u' || instr[i.value] == 'y') {
                s.value = s.value + 1;
            }
        }
        output += (String.format ("The number of syllables is %d.\n", s.value));
        if (true)
            return;;
    }
}
