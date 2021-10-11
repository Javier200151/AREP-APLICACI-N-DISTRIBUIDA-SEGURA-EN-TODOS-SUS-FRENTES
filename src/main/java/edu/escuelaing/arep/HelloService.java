package cd ;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class HelloService 
{
    public static void main( String[] args )
    {
        //API: secure(keystoreFilePath, keystorePassword, truststoreFilePath, truststorePassword); 
        secure("keystores/ecikeystore.p12", "123456", "keystores/myTrustStore","123456");
        port(getPort());
        get("/hello", (req, res) -> "Hello World");
    }
    
    static int getPort() { 
        if (System.getenv("PORT") != null) { 
            return Integer.parseInt(System.getenv("PORT")); 
        } 
        return 4567; //returns default port if heroku-port isn't set (i.e. on localhost) 
    } 
}
