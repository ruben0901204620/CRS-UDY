public class EjemploStringMetodos {
    public static void main(String[] args) {
        String nombre = "Ruben";

        System.out.println("1. nombre.lench() = " + nombre.length());
        System.out.println("2. nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("3. nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("4. nombre.equals(\"Ruben\") = " + nombre.equals("Ruben"));
        System.out.println("5. nombre.equals(\"Ruben\") = " + nombre.equals("ruben"));
        System.out.println("6. nombre.equalsIgnoreCase(\"Ruben\") = " + nombre.equalsIgnoreCase("Ruben"));
        System.out.println("7. nombre.compareTo(\"Ruben\") = " + nombre.compareTo("Ruben"));
        System.out.println("8. nombre.equals(\"Aron\") = " + nombre.equals("Aron"));
        System.out.println("9. nombre.charAt() = " + nombre.charAt(0));
        System.out.println("10. nombre.substring() = " + nombre.substring(1));
        System.out.println("11. nombre.substring() = " + nombre.substring(1,4));

        String trabalenguas = "trabalenguEas";
        System.out.println("12. trabalenguas.replace(\"a\",\".\") = " + trabalenguas.replace("a","."));
        System.out.println("13. trabalengias.index('a') = " + trabalenguas.indexOf('a'));
        System.out.println("14. trabalenguas.lastIndexof('a') = " + trabalenguas.lastIndexOf('a'));
        System.out.println("15. trabalenguas.lastIndexof('z') = " + trabalenguas.lastIndexOf('z'));
        System.out.println("16. trabalenguas.countais(\"z\") = " + trabalenguas.contains("z"));
        System.out.println("17. trabalenguas.startsWith(\"traba\") = " + trabalenguas.startsWith("traba"));
        System.out.println("18. trabalenguas.endsWith(\"uas\") = " + trabalenguas.endsWith("uas"));
        System.out.println("         trabalenguas  ".trim());


    }
}
