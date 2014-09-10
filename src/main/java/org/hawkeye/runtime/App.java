package org.hawkeye.runtime;

import static spark.Spark.*;

public class App{
 	public static void main(String[] args) {
      
      get("/hello",(request, response) -> {
         return "Hello World!";
      });
      
   }
}