package hrs.indiv04;

public class E04 {
    // ATRIBUTOS
    char[][] tablero;
    
    public static final char FICHA1 = 'X';
    public static final char FICHA2 = 'O';
    public static final char VACIO = ' ';
    
    public static final int EMPATE = 0;
    public static final int GANADOR1 = 1;
    public static final int GANADOR2 = 2;
    
    public static final int OPCION_SALIR = 0;
    public static final int OPCION_VS_HUMANO = 1;
    public static final int OPCION_VS_CPU = 2;
    
    
    
    
    //METODOS
    public E04() {
        tablero = new char[3][3];
    }
    
    public void reiniciarTablero() {
        for (int i = 0; i < 3; i++) { //filas
            for (int j = 0; j < 3; j++) { //columnas
                tablero[i][j] = VACIO;
            }
        }
    }
    
    public void pintarTablero() {
        for (int i = 0; i < 3; i++) { //filas
            ES.escribirLn("-------------");
            
            for (int j = 0; j < 3; j++) { //columnas
                ES.escribir("| " + tablero[i][j] + " ");
            }
            
            ES.escribirLn("|");
        }
        
        ES.escribirLn("-------------");
    }
    
    public int comprobarGanador() {
        int ganador = EMPATE;
        
        // comprobar fila
        for (int i = 0; i < 3; i++) { //filas
            char ficha = tablero[i][0];
            
            if ((ficha == tablero[i][1]) && (ficha == tablero[i][2])) {
                if (ficha == FICHA1) {
                    ganador = GANADOR1;
                } else if (ficha == FICHA2) {
                    ganador = GANADOR2;
                }
            }
        }
        
        //comprobar columna
        for (int j = 0; j < 3; j++) { //columnas
            char ficha = tablero[0][j];
            
            if ((ficha == tablero[1][j]) && (ficha == tablero[2][j])) {
                if (ficha == FICHA1) {
                    ganador = GANADOR1;
                } else if (ficha == FICHA2) {
                    ganador = GANADOR2;
                }
            }
        }
        
        //comprobar diagonales
        if ((tablero[0][0] == tablero[1][1] && tablero[0][0] == tablero[2][2]) ||
            (tablero[0][2] == tablero[1][1] && tablero[0][2] == tablero[2][0])) {
            if (tablero[1][1] == FICHA1) {
                ganador = GANADOR1;
            } else if (tablero[1][1] == FICHA2) {
                ganador = GANADOR2;
            }
        }
        
        return ganador;
    }
    
    boolean comprobarCelda(int fila, int columna, char simbolo, boolean mostrarMensajes) {
        boolean resultado;
        
        if (tablero[fila][columna] == VACIO) {
            tablero[fila][columna] = simbolo;
            resultado = true;
        } else {
            resultado = false;
            
            if (mostrarMensajes) {
                ES.escribirLn("Error: celda ocupada");
            }
        }
        
        return resultado;
    }
    
    void colocarFicha(String nombreJugador, char ficha) {
        ES.escribirLn("Jugador " + nombreJugador + ":");
        
        boolean ok;
        
        do {
            int fila = ES.leerEntero(0, 2, "Introduzca la fila: ");
            int columna = ES.leerEntero(0, 2, "Introduzca la columna: ");
            
            if (comprobarCelda(fila, columna, ficha, true)) {
                ok = true;
            } else {
                ok = false;
                ES.escribirLn("La posicion esta ocupada");
            }
        } while (!ok);
    }
    
    public void logicaCPU() {
        boolean ok;
        int fila;
        int columna;
        
        do {
            fila = (int) Math.round(Math.random() * 2);
            columna = (int) Math.round(Math.random() * 2);
            ok = comprobarCelda(fila, columna, FICHA2, false);
        } while (!ok);
    }
    
    public static void main(String[] args) {
        int opcion;
        E04 ter;
        int ganador;
        int turno;
        String nombre1;
        String nombre2;
        
        ter = new E04();
        
        do {
            ES.escribirLn("0. Salir del juego.");
            ES.escribirLn("1. Jugador 1 vs Jugador 2.");
            ES.escribirLn("2. Jugador vs CPU.");
            opcion = ES.leerEntero(0, 2, "Opcion: ");
            
            switch (opcion) {
                case OPCION_VS_CPU:
                    ES.escribir("Introduce tu nombre: ");
                    nombre1 = ES.leerCadena();
                    
                    ter.reiniciarTablero();
                    turno = 0;
                    
                    do {
                        ter.pintarTablero();
                        
                        if (turno % 2 == 0) {
                            ter.colocarFicha(nombre1, FICHA1);
                        } else {
                            ES.escribirLn("La maquina esta pensando");
                            ter.logicaCPU();
                        }
                        
                        turno++;
                        
                        ganador = ter.comprobarGanador();
                    } while (ganador == EMPATE);
                    
                    ter.pintarTablero();
                    
                    if (ganador == GANADOR1) {
                        ES.escribirLn("Ha ganado " + nombre1);
                    } else {
                        ES.escribirLn("Ha ganado la maquina");
                    }
                    
                    break;
                case OPCION_VS_HUMANO:
                    ES.escribir("Jugador 1, introduce tu nombre: ");
                    nombre1 = ES.leerCadena();
                    ES.escribir("Jugador 2, introduce tu nombre: ");
                    nombre2 = ES.leerCadena();
                    
                    ter.reiniciarTablero();
                    turno = 0;
                    
                    do {
                        ter.pintarTablero();
                        
                        if (turno % 2 == 0) {
                            ter.colocarFicha(nombre1, FICHA1);
                        } else {
                            ter.colocarFicha(nombre2, FICHA2);
                        }
                        
                        turno++;
                        
                        ganador = ter.comprobarGanador();
                    } while (ganador == EMPATE);
                    
                    ter.pintarTablero();
                    
                    if (ganador == GANADOR1) {
                        ES.escribirLn("Ha ganado " + nombre1);
                    } else {
                        ES.escribirLn("Ha ganado " + nombre2);
                    }
                    
                    break;
            }
        } while (opcion != OPCION_SALIR);
    }
}
