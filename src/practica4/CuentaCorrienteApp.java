package practica4;

public class CuentaCorrienteApp {
    public static void main(String[] args) {
        CuentaCorriente Jose = new CuentaCorriente("99999999Q", "Ivan"); //Se crea un objeto de tipo CuentaCorriente
        CuentaCorriente Alicia = new CuentaCorriente("99999999A", "Silvia");

        Jose.ingresarDinero(50); //Ingresa una cantidad de dinero en una cuenta
        Alicia.ingresarDinero(80);

        System.out.println(Jose.mostrarInfo()); //Muestra la información de una cuenta
        System.out.println(Alicia.mostrarInfo());

        if (Jose.sacarDinero(40)) { //Comprueba si es posible sacar dinero de la cuenta
            System.out.println("La extracción ha sido exitosa "); //Si es exitosa se saca el dinero de la cuenta
        }
        else {
            System.out.println("La extracción ha fracasado"); //Si fracasa no se saca el dinero de la cuenta
        }

        if (Alicia.sacarDinero(100)) {
            System.out.println("La extracción ha sido exitosa");
        }
        else {
            System.out.println("La extracción ha fracasado");
        }
    }
}
