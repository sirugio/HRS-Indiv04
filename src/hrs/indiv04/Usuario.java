package hrs.indiv04;

/**
 *
 * @author Sergio
 */
//ATRIBUTOS
public class Usuario {
    public static final int CAPACIDAD = 10;
    private Usuario[] usuario;
    private int tamanno;

    private String nombre;
    private String apellidos;
    private int edad;
    private String dni;

//METODOS
    public Usuario() {
        usuario = new Usuario[CAPACIDAD];
        tamanno = 0;
        nombre = "";
        apellidos = "";
        edad = -1;
        dni = "";
    }

//CONSTRUCTOR
    public Usuario(String nombre, String apellidos, int edad, String dni) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.dni = dni;
    }
    public int posicionUsuario(String dni) {
        int posicion = -1;
        int i = 0;
        
        while ((i < tamanno) && (posicion == -1)) {
            if (usuario[i].getDni().equals(dni)) {
                posicion = i;
            }
            
            i++;
        }
        
        return posicion;
    }
    
    public void insertaUsuario(String nombre, String apellidos, int edad, String dni) {
        Usuario usuarios = new Usuario(nombre, apellidos, edad, dni);
        
        if (tamanno < CAPACIDAD) {
            if (posicionUsuario(dni) == -1) {
                usuario[tamanno] = usuarios;
                tamanno++;
                System.out.println("Usuario insertado");
            } else {
                System.out.println("El DNI ya existe");
            }
        } else {
            System.out.println("Ya no entran mas usuarios");
        }
    }
    
    public void muestraUsuario(String dni) {
        int posicion = posicionUsuario(dni);
        
        if (posicion != -1) {
            Usuario usuarios = usuario[posicion];
            System.out.println(usuario.toString());
        } else {
            System.out.println("No existe el DNI");
        }
    }
    
    public void modificaUsuario(String nombre, String apellidos, int edad, String dni) {
        int posicion = posicionUsuario(dni);
        
        if (posicion != -1) {
            usuario[posicion].setNombre(nombre);
            usuario[posicion].setApellidos(apellidos);
            usuario[posicion].setEdad(edad);
            System.out.println("Usuario modificado");
        } else {
            System.out.println("No existe el DNI");
        }
    }
    
    public void borraUsuario(String dni) {
        int posicion = posicionUsuario(dni);
        
        if (posicion != -1) {
            for (int i = posicion; i < tamanno - 1; i++) {
                usuario[posicion] = usuario[posicion + 1];
            }
            
            tamanno--;
            
            System.out.println("Usuario borrado");
        } else {
            System.out.println("No existe el DNI");
        }
    }


//GET-SET
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public int getEdad() {
        return edad;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String getDni() {
        return dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }
    
//TOSTRING
    @Override
    public String toString() {
        return nombre + " " + apellidos + ", DNI: " + dni + ", Edad: " + edad;
    }
}
