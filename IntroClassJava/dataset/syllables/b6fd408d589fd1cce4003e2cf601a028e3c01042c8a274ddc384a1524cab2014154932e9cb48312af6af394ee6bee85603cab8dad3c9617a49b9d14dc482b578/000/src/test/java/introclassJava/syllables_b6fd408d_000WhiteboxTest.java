package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class syllables_b6fd408d_000WhiteboxTest {

    @Test (timeout = 1000) public void test1 () throws Exception {
        syllables_b6fd408d_000 mainClass = new syllables_b6fd408d_000 ();
        String expected = "Please enter a string > The number of syllables is 1.";
        mainClass.scanner = new java.util.Scanner ("a");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test10 () throws Exception {
        syllables_b6fd408d_000 mainClass = new syllables_b6fd408d_000 ();
        String expected = "Please enter a string > The number of syllables is 3.";
        mainClass.scanner = new java.util.Scanner ("snow white 123 ><");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test2 () throws Exception {
        syllables_b6fd408d_000 mainClass = new syllables_b6fd408d_000 ();
        String expected = "Please enter a string > The number of syllables is 2.";
        mainClass.scanner = new java.util.Scanner ("i o");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test3 () throws Exception {
        syllables_b6fd408d_000 mainClass = new syllables_b6fd408d_000 ();
        String expected = "Please enter a string > The number of syllables is 0.";
        mainClass.scanner = new java.util.Scanner ("mnhd");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test4 () throws Exception {
        syllables_b6fd408d_000 mainClass = new syllables_b6fd408d_000 ();
        String expected = "Please enter a string > The number of syllables is 3.";
        mainClass.scanner = new java.util.Scanner ("hello world");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test5 () throws Exception {
        syllables_b6fd408d_000 mainClass = new syllables_b6fd408d_000 ();
        String expected = "Please enter a string > The number of syllables is 5.";
        mainClass.scanner = new java.util.Scanner ("aeiou");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test6 () throws Exception {
        syllables_b6fd408d_000 mainClass = new syllables_b6fd408d_000 ();
        String expected = "Please enter a string > The number of syllables is 6.";
        mainClass.scanner = new java.util.Scanner ("seasons greetings!");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test7 () throws Exception {
        syllables_b6fd408d_000 mainClass = new syllables_b6fd408d_000 ();
        String expected = "Please enter a string > The number of syllables is 4.";
        mainClass.scanner = new java.util.Scanner ("which witch is which?");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test8 () throws Exception {
        syllables_b6fd408d_000 mainClass = new syllables_b6fd408d_000 ();
        String expected = "Please enter a string > The number of syllables is 0.";
        mainClass.scanner = new java.util.Scanner ("!@#$%^,");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test9 () throws Exception {
        syllables_b6fd408d_000 mainClass = new syllables_b6fd408d_000 ();
        String expected = "Please enter a string > The number of syllables is 0.";
        mainClass.scanner = new java.util.Scanner ("123zdh");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
}
