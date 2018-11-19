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

public class syllables_48925325_007 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        syllables_48925325_007 mainClass = new syllables_48925325_007 ();
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
        char[] instr = new char[20];
        IntObj len = new IntObj (), i = new IntObj (), num = new IntObj (0);
        output += (String.format ("Please enter a string > "));
        instr = scanner.next ().toCharArray ();
        len.value = instr.length;
        i.value = 0;
        while (i.value < len.value) {
            if (instr[i.value] == 'a' || instr[i.value] == 'e'
                    || instr[i.value] == 'i' || instr[i.value] == 'o'
                    || instr[i.value] == 'u' || instr[i.value] == 'y') {
                num.value = num.value + 1;
            }
            i.value = i.value + 1;
        }
        output += (String.format ("The number of syllables is %d\n", num.value));
        if (true)
            return;;
    }
}
