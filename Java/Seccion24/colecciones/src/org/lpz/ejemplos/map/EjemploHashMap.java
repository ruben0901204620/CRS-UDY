package org.lpz.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {

        Map<String, Object> persona = new HashMap<>();

        System.out.println("Contiene elementos? " + !persona.isEmpty());

        // Crear un objeto HashMap con un par clave-valor
        persona.put(null, "1234");
        persona.put(null, "12345");
        persona.put("nombre", "John");
        persona.put("apellido", "Doe");
        persona.put("apellidoPaterno", "Roe");
        persona.put("email", "john@email.com");
        persona.put("Edad", 30);
    
        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");

        persona.put("direccion", direccion);



        System.out.println("Persona: " + persona);

        String nombre = (String)persona.get("nombre");
        System.out.println("Nombre: " + nombre);

        String apellido = (String) persona.get("apellido");
        System.out.println("Apellido: " + apellido);

        Map<String, String> direccionPersona = (Map<String, String>)persona.get("direccion");
        String pais = direccionPersona.get(("pais"));
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio", "La palya");
        System.out.println("El pais de " + nombre + " es: " + pais);
        System.out.println("La ciudad de " + nombre + " es: " + ciudad); 
        System.out.println("El barrio de " + nombre + " es: " + barrio);

        // Eliminar
        //String apellidoPaterno = persona.remove("apellidoPaterno", "Roe"); 
        boolean b = persona.remove("apellidoPaterno", "Roe");
        System.out.println("Eliminado: " + b);
        System.out.println("Persona: " + persona);

        boolean b2 = persona.containsKey("apellidoPaterno");
        System.out.println("b2: " + b2);

        b2 = persona.containsValue("john@email.co");
        System.out.println("b2: " + b2);
        
        System.out.println("================ values");
        Collection<Object> valores = persona.values();
        for(Object valor: valores) {

            System.out.println("valor: " + valor);
        }

        System.out.println("================= keySet");
        Set<String> llaves = persona.keySet();
        for(String llave: llaves) {
            System.out.println("llave: " + llave);
        }
        
        System.out.println("================= entrySet");
        for(Map.Entry<String, Object> par: persona.entrySet()) {
            Object valor = par.getValue();
            if(valor instanceof Map) {
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;

                for(Map.Entry<String, String> parDir: direccionMap.entrySet()) {
                    System.out.println(parDir.getKey() + " => " + parDir.getValue());
                }
                
            } else {
            System.out.println(par.getKey() + " => " + valor);
            }

        }

        System.out.println("================= KeySet");
        for(String llave: persona.keySet()) {
            Object valor = persona.get(llave);

            if(valor instanceof Map) {
                String nom = (String) persona.get("nombre");
                Map<String, String> direccionMap = (Map<String, String>) valor;
                System.out.println("El pasi de " + nom + ": "
                + direccionMap.get("pais"));

                System.out.println("El estado de " + nom + ": " + direccionMap.get("estado"));
                System.out.println("La ciudad de " + nom + ": " + direccionMap.get("ciudad"));
            } else {
                System.out.println(llave + " => " + valor);
            }
        }

        System.out.println("================= Java 8 forEach");
        persona.forEach((llave, valor) -> {
            System.out.println(llave + " => " + valor);
        });

        System.out.println("Total: " + persona.size());
        System.out.println("Contiene elementos? " + !persona.isEmpty());

        boolean b3 = persona.replace("nombre", "juan","Andres");
        System.out.println("b3: " + b3);
        System.out.println("Persona: " + persona);




    }


}
