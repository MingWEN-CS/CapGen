package introclassJava;

class IntObj {public int value; public IntObj(){} public IntObj(int i){value = i;}}
class FloatObj {public float value; public FloatObj(){} public FloatObj(float i){value = i;}}
class LongObj {public long value; public LongObj(){} public LongObj(long i){value = i;}}
class DoubleObj {public double value; public DoubleObj(){} public DoubleObj(double i){value = i;}}
class CharObj {public char value; public CharObj(){} public CharObj(char i){value = i;}}
public class Syllables {
	public java.util.Scanner scanner;
	public String output = "";

	public static void main(String[] args) throws Exception {
		Syllables mainClass = new Syllables();
		String output;
		if(args.length > 0) {
			mainClass.scanner = new java.util.Scanner(args[0]);
		} else {
			mainClass.scanner = new java.util.Scanner(System.in);
		}
		mainClass.exec();
		System.out.println(mainClass.output);
	}

    public static int NSIZE = 40;
    public void exec () throws Exception {
        char[] given = new char[NSIZE];
        IntObj i = new IntObj(), len = new IntObj(), syls = new IntObj();
        output += (String.format("Please enter a string > "));
        given = (scanner.nextLine() + "\n").toCharArray();
        len.value = given.length;
        given[len.value - 1] = 0;
        len.value--;
        syls.value = 0;
        for(i.value = 0; i.value < len.value; i.value++) {
            if(given[i.value] == 'a' || given[i.value] == 'e' || given[i.value] == 'i' || given[i.value] == 'o' || given[i.value] == 'u' || given[i.value] == 'y'){
                syls.value++;
            }
        }
        output += (String.format("The number of syllables is %d.\n", syls.value));
        if(true)return;;
    }
}