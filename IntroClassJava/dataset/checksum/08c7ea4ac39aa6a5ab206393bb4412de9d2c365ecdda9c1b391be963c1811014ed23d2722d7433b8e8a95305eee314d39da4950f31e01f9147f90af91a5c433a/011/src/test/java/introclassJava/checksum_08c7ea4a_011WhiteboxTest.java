package introclassJava;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class checksum_08c7ea4a_011WhiteboxTest {

    @Test (timeout = 1000) public void test1 () throws Exception {
        checksum_08c7ea4a_011 mainClass = new checksum_08c7ea4a_011 ();
        String expected =
            "Enter an abitrarily long string, ending with carriage return > Check sum is ]";
        mainClass.scanner = new java.util.Scanner ("hello world!");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test10 () throws Exception {
        checksum_08c7ea4a_011 mainClass = new checksum_08c7ea4a_011 ();
        String expected =
            "Enter an abitrarily long string, ending with carriage return > Check sum is ,";
        mainClass.scanner = new java.util.Scanner ("We the people...");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test2 () throws Exception {
        checksum_08c7ea4a_011 mainClass = new checksum_08c7ea4a_011 ();
        String expected =
            "Enter an abitrarily long string, ending with carriage return > Check sum is 7";
        mainClass.scanner = new java.util.Scanner ("qwertyuiopasdfghjkl");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test3 () throws Exception {
        checksum_08c7ea4a_011 mainClass = new checksum_08c7ea4a_011 ();
        String expected =
            "Enter an abitrarily long string, ending with carriage return > Check sum is K";
        mainClass.scanner = new java.util.Scanner ("A*");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test4 () throws Exception {
        checksum_08c7ea4a_011 mainClass = new checksum_08c7ea4a_011 ();
        String expected =
            "Enter an abitrarily long string, ending with carriage return > Check sum is F";
        mainClass.scanner = new java.util.Scanner ("O Brother Where Art Thou?");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test5 () throws Exception {
        checksum_08c7ea4a_011 mainClass = new checksum_08c7ea4a_011 ();
        String expected =
            "Enter an abitrarily long string, ending with carriage return > Check sum is 4";
        mainClass.scanner = new java.util.Scanner ("~!@#$%^&*()_+");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test6 () throws Exception {
        checksum_08c7ea4a_011 mainClass = new checksum_08c7ea4a_011 ();
        String expected =
            "Enter an abitrarily long string, ending with carriage return > Check sum is @";
        mainClass.scanner = new java.util.Scanner ("100 Degrees and sunny");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test7 () throws Exception {
        checksum_08c7ea4a_011 mainClass = new checksum_08c7ea4a_011 ();
        String expected =
            "Enter an abitrarily long string, ending with carriage return > Check sum is V";
        mainClass.scanner = new java.util.Scanner ("?? water the plants !!");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test8 () throws Exception {
        checksum_08c7ea4a_011 mainClass = new checksum_08c7ea4a_011 ();
        String expected =
            "Enter an abitrarily long string, ending with carriage return > Check sum is X";
        mainClass.scanner = new java.util.Scanner ("12894.389239");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
    @Test (timeout = 1000) public void test9 () throws Exception {
        checksum_08c7ea4a_011 mainClass = new checksum_08c7ea4a_011 ();
        String expected =
            "Enter an abitrarily long string, ending with carriage return > Check sum is #";
        mainClass.scanner = new java.util.Scanner ("! word 12 :)");
        mainClass.exec ();
        String out = mainClass.output.replace ("\n", " ").trim ();
        assertEquals (expected.replace (" ", ""), out.replace (" ", ""));
    }
}
