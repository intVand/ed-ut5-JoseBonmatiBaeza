package practica4;

public class PuntoApp {
    public static void main(String[] args) {
        Punto p1 = new Punto(10,20); //Se crea un objeto con unos parametros asignados
        Punto p2 = new Punto(15,30);

        p1.desplazaX(3); //Desplaza el punto p1 en el eje X en 3 unidades
        p1.muestra(); //Muestra las coordenadas de p1

        p2.desplazaY(10); //Desplaza el punto p2 en el eje Y en 10 unidades
        p2.muestra(); //Muestra las coordenada de p2

        p1.desplaza(5, 10); //Desplaza el punto p1 en ambos ejes X e Y en 5 y 10 unidades respectivamente
        p1.muestra();

        p2.desplaza(7, 14); //Desplaza el punto p2 en ambos ejes X e Y en 7 y 14 unidades respectivamente
        p2.muestra();

        System.out.println(p1.distanciaEuclidea(p2)); //Calcula y muestra por pantalla la distancia Euclidiana entre p1 y p2
    }
}
