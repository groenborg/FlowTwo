
package dk.kasper.simon;

import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 *      @author Simon & Kasper
 *
 *      Version 0.1.2.0
 * 
 */
public class FlowTwo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String dir = System.getProperty("user.dir");
        Path p = Paths.get("");
        
        String s = p.toAbsolutePath().toString();
        // both works 
        System.out.println(s);
        System.out.println(dir);
    }
}
