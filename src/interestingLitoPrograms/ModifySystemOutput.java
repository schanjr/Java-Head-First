package interestingLitoPrograms;
import java.io.OutputStream;
import java.io.PrintStream;
 
/**
 * @author chanst
 *Small demonstration on how to overwrite the System.out.println method. 
 */
public class ModifySystemOutput {
 
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