package practica4;

public class SintonizadorFM {
    private double frecuencia = 80;

    public SintonizadorFM(double frecuencia) { //Constructor parametrizado que acepta una frecuencia y la ajusta dentro de los limites permitidos (80-108)
        if (frecuencia < 80) { //Si la fecuencia es menor a los limites, se ajusta a 80
            this.frecuencia = 80;
        }
        else if (frecuencia > 108) { //Si la frecuencia es mayor a los limites, se ajusta a 108
            this.frecuencia = 108;
        }
        else { //Si la frecuencia es valida, se asigna directamente
            this.frecuencia = frecuencia;
        }
    }

    public SintonizadorFM() {} //Constructor por defecto por si no se asigna un parametro al constructor parametrizado (se asigna 80 a la frecuencia)

    public void display () { //Metodo para mostrar la frecuencia actual
        System.out.println(this.frecuencia);
    }

    public void down () { //Metodo para disminuir la frecuencia en 0.5
        this.frecuencia -= 0.5;
        comprobarRango(); //Ajusta la frecuencia si esta fuera de los limites
    }

    public void up () { //Metodo para aumentar la frecuencia en 0.5
        this.frecuencia += 0.5;
        comprobarRango(); //Ajusta la frecuencia si esta fuera de los limites
    }

    private void comprobarRango() { //Metodo para verificar si la frecuencia esta dentro de los limites y ajustarla
        if (this.frecuencia < 80) { //Si la frecuencia es menor a los limites, se ajusta a 108
            this.frecuencia = 108;
        }
        else if (this.frecuencia > 108) { //Si la frecuencia es mayor a los limutes, se ajusta a 80
            this.frecuencia = 80;
        }
    }
}
