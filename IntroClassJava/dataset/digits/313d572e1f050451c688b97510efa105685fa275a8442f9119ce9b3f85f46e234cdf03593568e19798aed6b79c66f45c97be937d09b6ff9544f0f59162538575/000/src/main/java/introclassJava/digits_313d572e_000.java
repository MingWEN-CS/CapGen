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

public class digits_313d572e_000 {
    public java.util.Scanner scanner;
    public String output = "";

    public static void main (String[]args) throws Exception {
        digits_313d572e_000 mainClass = new digits_313d572e_000 ();
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
        IntObj given = new IntObj (), digit10 = new IntObj (), digit9 =
            new IntObj (), digit8 = new IntObj (), digit7 = new IntObj (), digit6 =
            new IntObj (), digit5 = new IntObj (), digit4 = new IntObj (), digit3 =
            new IntObj (), digit2 = new IntObj (), digit1 = new IntObj ();
        output += (String.format ("\nEnter an interger > "));
        given.value = scanner.nextInt ();
        if (given.value >= 1 && given.value < 10) {
            digit10.value = given.value % 10;
            output +=
                (String.format
                 ("\n%d\nThat's all, have a nice day!\n", digit10.value));
        }
        if (given.value >= 10 && given.value < 100) {
            digit10.value = given.value % 10;
            digit9.value = (given.value / 10) % 10;
            output +=
                (String.format
                 ("\n%d\n%d\nThat's all, have a nice day!\n", digit10.value,
                  digit9.value));
        }
        if (given.value >= 100 && given.value < 1000) {
            digit10.value = given.value % 10;
            digit9.value = (given.value / 10) % 10;
            digit8.value = (given.value / 100) % 10;
            output +=
                (String.format ("\n%d\n%d\n%d\nThat's all, have a nice day!\n",
                                digit10.value, digit9.value, digit8.value));
        }
        if (given.value >= 1000 && given.value < 10000) {
            digit10.value = given.value % 10;
            digit9.value = (given.value / 10) % 10;
            digit8.value = (given.value / 100) % 10;
            digit7.value = (given.value / 1000) % 10;
            output +=
                (String.format ("\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n",
                                digit10.value, digit9.value, digit8.value,
                                digit7.value));
        }
        if (given.value >= 10000 && given.value < 100000) {
            digit10.value = given.value % 10;
            digit9.value = (given.value / 10) % 10;
            digit8.value = (given.value / 100) % 10;
            digit7.value = (given.value / 1000) % 10;
            digit6.value = (given.value / 10000) % 10;
            output +=
                (String.format
                 ("\n%d\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n",
                  digit10.value, digit9.value, digit8.value, digit7.value,
                  digit6.value));
        }
        if (given.value >= 100000 && given.value < 1000000) {
            digit10.value = given.value % 10;
            digit9.value = (given.value / 10) % 10;
            digit8.value = (given.value / 100) % 10;
            digit7.value = (given.value / 1000) % 10;
            digit6.value = (given.value / 10000) % 10;
            digit5.value = (given.value / 100000) % 10;
            output +=
                (String.format
                 ("\n%d\n%d\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n",
                  digit10.value, digit9.value, digit8.value, digit7.value,
                  digit6.value, digit5.value));
        }
        if (given.value >= 1000000 && given.value < 10000000) {
            digit10.value = given.value % 10;
            digit9.value = (given.value / 10) % 10;
            digit8.value = (given.value / 100) % 10;
            digit7.value = (given.value / 1000) % 10;
            digit6.value = (given.value / 10000) % 10;
            digit5.value = (given.value / 100000) % 10;
            digit4.value = (given.value / 1000000) % 10;
            output +=
                (String.format
                 ("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n",
                  digit10.value, digit9.value, digit8.value, digit7.value,
                  digit6.value, digit5.value, digit4.value));
        }
        if (given.value >= 10000000 && given.value < 100000000) {
            digit10.value = given.value % 10;
            digit9.value = (given.value / 10) % 10;
            digit8.value = (given.value / 100) % 10;
            digit7.value = (given.value / 1000) % 10;
            digit6.value = (given.value / 10000) % 10;
            digit5.value = (given.value / 100000) % 10;
            digit4.value = (given.value / 1000000) % 10;
            digit3.value = (given.value / 10000000) % 10;
            output +=
                (String.format
                 ("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n",
                  digit10.value, digit9.value, digit8.value, digit7.value,
                  digit6.value, digit5.value, digit4.value, digit3.value));
        }
        if (given.value >= 100000000 && given.value < 1000000000) {
            digit10.value = given.value % 10;
            digit9.value = (given.value / 10) % 10;
            digit8.value = (given.value / 100) % 10;
            digit7.value = (given.value / 1000) % 10;
            digit6.value = (given.value / 10000) % 10;
            digit5.value = (given.value / 100000) % 10;
            digit4.value = (given.value / 1000000) % 10;
            digit3.value = (given.value / 10000000) % 10;
            digit2.value = (given.value / 100000000) % 10;
            output +=
                (String.format
                 ("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n",
                  digit10.value, digit9.value, digit8.value, digit7.value,
                  digit6.value, digit5.value, digit4.value, digit3.value,
                  digit2.value));
        }
        if (given.value >= 1000000000 && given.value < 10000000000L) {
            digit10.value = given.value % 10;
            digit9.value = (given.value / 10) % 10;
            digit8.value = (given.value / 100) % 10;
            digit7.value = (given.value / 1000) % 10;
            digit6.value = (given.value / 10000) % 10;
            digit5.value = (given.value / 100000) % 10;
            digit4.value = (given.value / 1000000) % 10;
            digit3.value = (given.value / 10000000) % 10;
            digit2.value = (given.value / 100000000) % 10;
            digit1.value = (given.value / 1000000000) % 10;
            output +=
                (String.format
                 ("\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\n%d\nThat's all, have a nice day!\n",
                  digit10.value, digit9.value, digit8.value, digit7.value,
                  digit6.value, digit5.value, digit4.value, digit3.value,
                  digit2.value, digit1.value));
        }
        if (true)
            return;;
    }
}
