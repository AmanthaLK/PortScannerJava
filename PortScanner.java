import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author Amantha - https://www.linkedin.com/in/amanthaa/
 */
public class PortScanner {

    public static void main(String[] args) {
        
        for(int i =1;i<=65535;i++){
            try {
                Socket client = new Socket("localhost",i);
                System.out.println("Service Active on port "+i+"\n***");
                client.close();
            }catch (IOException ex) {
                System.out.println(ex);
                System.out.println("No service on PORT "+i+"\n***");
            }
        }
    }
    
}
