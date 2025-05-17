/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redsocial;

import IGU.Feed;
import IGU.Login;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.client.model.Filters;
import org.bson.Document;

/**
 *
 * @author Marco
 */
public class Conexion {
   
    private static MongoDatabase DB; //MongoDatabase es ahora un atributo estático para que se pueda compartir en todo el proyecto.
    public static void Con(){ //Para poder llamar la conexión desde el metodo main
        
        
String uri = "mongodb://localhost:27017"; // Cambia el puerto si es necesario

        try{
            MongoClient cliente = MongoClients.create(uri);
            // Intentar listar las bases de datos para comprobar la conexión real
            MongoIterable<String> databases = cliente.listDatabaseNames();
            DB = cliente.getDatabase("RedSocial");
            System.out.println("Conexión exitosa a MongoDB. Bases de datos disponibles:");

            for (String dbName : databases) {
                System.out.println("- " + dbName);
            }
        } catch (Exception e) {
            System.err.println("Error al conectar con MongoDB: " + e.getMessage());
        }
                 
    }
        
        
         public static MongoDatabase getDatabase(){ //metodo para obtener la conexion desde otras clases
            return DB;
        } 
         
         public static void paginaPrincipal() {
             Feed perfil = new Feed();
        perfil.setVisible(true);
        perfil.setLocationRelativeTo(null);
        }
         
     
         
       
        
}

