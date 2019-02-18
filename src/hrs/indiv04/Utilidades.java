package hrs.indiv04;

public class Utilidades {
    public static boolean comprobarNIF(String nif) {
        String dni = "[0-9]{8}[A-Z]";
        String nie = "[MXYZ][0-9]{7}[A-Z]";
        
        boolean valido = (nif.matches(dni) || nif.matches(nie));
        
        if (nif.matches(dni))  {
            System.out.println("Es un DNI");
        } else if (nif.matches(nie)) {
            System.out.println("Es un NIE");
        }
        
        return valido;
    }
    
    public static boolean comprobarReferenciaProducto(String referencia) {
        String regexProducto = "[A-HJ-NP-Z]{3}[0-9]{2}";
        
        boolean valido = referencia.matches(regexProducto);
        
        return valido;
    }
}
