
package dk.kasper.simon;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 *      @author Simon & Kasper
 *
 *      Version 0.2.2.0
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
        
        
        
        PrintWriter pw;
        
        
        try{
         PrintWriter out = new PrintWriter(new FileWriter("name.txt", true));
        out.write("\n");
       
        //out.println("fuck");
       // out.close();
        
        }catch(FileNotFoundException ex){
        
        }catch(Exception e){
        
        }
        
        
    }
}
