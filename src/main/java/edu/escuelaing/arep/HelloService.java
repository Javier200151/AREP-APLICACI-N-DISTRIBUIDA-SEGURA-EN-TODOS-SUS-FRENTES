package edu.escuelaing.arep;

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
        secure("keystores/ecikeystore.p12", "123456", null, null);
        get("/hello", (req, res) -> "Hello World");
    }
}
