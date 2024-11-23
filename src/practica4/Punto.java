package practica4;

public class Punto {
    public double x;
    public double y;

    public Punto(double x, double y) { //Constructor parametrizado que inicializa el punto con las coordenadas proporcionadas
        this.x = x;
        this.y = y;
    }

    public Punto() {} //Constructor por defecto por si no se asigna un parametro al constructor parametrizado

    public void desplazaX(double dx) { //Metodo para desplazar el punto en el eje X
        this.x += dx; //Incrementa la coordenado X por dx
    }

    public void desplazaY(double dy) { //Metodo para desplazar el punto en el eje Y
        this.y += dy; //Incrementa la coordenada Y por dy
    }

    public void desplaza(double dx, double dy) { //Metodo para desplazar el punto en ambos ejes X e Y
        this.x += dx;
        this.y += dy;
    }

    public double distanciaEuclidea(Punto p2) { //Metodo para calcula la distancia Euclidiana entre este punto y otro punto dado
        return Math.sqrt(Math.pow(p2.x - this.x, 2) + Math.pow(p2.y - this.y, 2));
    }

    public void muestra() { //Metodo para mostrar las coordenada del punto
        System.out.println("X: " + this.x + " Y: " + this.y);
    }
}
