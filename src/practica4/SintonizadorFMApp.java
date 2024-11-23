package practica4;

public class SintonizadorFMApp {
    public static void main(String[] args) {
        SintonizadorFM primero = new SintonizadorFM(); //Se crea un objeto con el parametro por defecto
        SintonizadorFM segundo = new SintonizadorFM(107); //Se crea un objeto con un parametro asignado
        SintonizadorFM tercero = new SintonizadorFM(200);

        for (int i = 1; i >= 0; i--) { //Disminuye la frecuencia del primer sintonizador dos veces
            primero.down();
        }

        for (int i = 3; i >= 0; i--) { //Aumenta la frecuencia del segundo sintonizador 4 veces
            segundo.up();
        }

        primero.display(); //Muestra la frecuencia actual del sintonizador
        segundo.display();
        tercero.display();
    }
}
