package interestingLitoPrograms;
import java.io.OutputStream;
import java.io.PrintStream;
 
public class ModifyingSystemOutput {
 
    public static void main(String[] args) {
        System.out.println("This line does not have the extra text added");
 
        System.setOut(new MyPrintStream(" ADDED TEXT", System.out));
 
        System.out.println("This line will have some added text");
        System.out.println("I wonder if this has added text as well.");
       
    }
 
    public static class MyPrintStream extends PrintStream {
 
        private final String x;
 
        public MyPrintStream(final String x, final OutputStream outputStream) {
            super(outputStream);
            this.x = x;
        }
 
        @Override
        public void println(final String string) {
            super.println(string + this.x);
        }
    }
}