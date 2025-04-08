/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package redsocial;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;

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
}

