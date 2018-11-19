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

public class smallest_c868b30a_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        smallest_c868b30a_000 mainClass = new smallest_c868b30a_000 ();
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
        IntObj x = new IntObj (), i = new IntObj (), smallest = new IntObj (), j =
            new IntObj (), k = new IntObj (), temp = new IntObj ();
        int[] numbers = new int[4];
        output +=
            (String.format ("Please enter 4 numbers separated by spaces > "));
        for (i.value = 0; i.value < 3; i.value++) {
            x.value = scanner.nextInt ();
            numbers[i.value] = x.value;
        }
        for (k.value = 3; k.value > 0; k.value--) {
            for (j.value = 1; j.value <= k.value; j.value++) {
                if (numbers[j.value - 1] > numbers[j.value]) {
                    temp.value = numbers[j.value - 1];
                    numbers[j.value - 1] = numbers[j.value];
                    numbers[j.value] = temp.value;
                }
            }
        }
        smallest.value = numbers[0];
        output += (String.format ("%d is the smallest\n", smallest.value));
        if (true)
            return;;
    }
}
