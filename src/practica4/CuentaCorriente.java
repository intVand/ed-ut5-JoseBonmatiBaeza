package practica4;

public class CuentaCorriente {
        private String dni;
        private String nombre;
        private double saldo;

    public CuentaCorriente(String dni, String nombre) { //Constructor parametrizado que inicializa una nueva cuenta corriente con el dni y nombre
        this.saldo = 0;
        this.dni = dni;
        this.nombre = nombre;
    }

    public void ingresarDinero(double dinero) { //Metodo para ingresar dinero en la cuenta
        this.saldo += dinero; //Suma el dinero al saldo actual
    }

    public boolean sacarDinero(double dinero) { //Metodo para sacar dinero de la cuenta
        if (this.saldo >= dinero) { //Verifica si hay suficiente saldo
            this.saldo -= dinero; //Resta el dinero del saldo actual
            return true;
        }
        else {
            return false;
        }

    }
    public String mostrarInfo() { //Metodo para mostar la informacion de la cuenta
        return this.nombre + " " + this.dni + " " + this.saldo;
    }
}
