package acertijoCuestionario;

import java.util.Scanner;

public class adivinarAnimal extends adivinanza {
    private String[] acertijo = {"No tengo ojos, orejas ni pies, y jamás sabrás si voy del derecho o del revés.",
    "Ojos enormes tengo, los cierro por el día y por la noche los abro para ejercitar mi puntería.",
    "Las 5 vocales en mi nombre llevo, no siendo ave por las noches vuelo."};
    private String[] respuesta = {"una lombriz","un buho","el murcielago"};
    private String eleccion;
    private double puntajeRonda2;

    public double getPuntajeRonda2() {
        return puntajeRonda2;
    }

    public void setPuntajeRonda2(double puntajeRonda2) {
        this.puntajeRonda2 = puntajeRonda2;
    }

    public String[] getAcertijo() {
        return acertijo;
    }

    public void setAcertijo(String[] acertijo) {
        this.acertijo = acertijo;
    }

    public String[] getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String[] respuesta) {
        this.respuesta = respuesta;
    }

    public String getEleccion() {
        return eleccion;
    }

    public void setEleccion(String eleccion) {
        this.eleccion = eleccion;
    }

    Scanner sc = new Scanner(System.in);

    public adivinarAnimal(){}
    
    public adivinarAnimal(String[] acertijo, String[] respuesta, String eleccion, double puntajeRonda2) {
        this.acertijo = acertijo;
        this.respuesta = respuesta;
        this.eleccion = eleccion;
        this.puntajeRonda2 = puntajeRonda2;
    }
    
    public void realizarAcertijo(){
        double puntaje = 0;
        for (int i = 0; i < getAcertijo().length; i++) {
            System.out.println("\nAdivinanza No. "+(i+1));
            System.out.println(getAcertijo()[i]);
            System.out.println("¿Que animal es?");
            setEleccion(sc.nextLine());
            if (eleccion.equals(getRespuesta()[i])) {
                System.out.println("Felicidades acertaste, tu respuesta es correcta.");
                puntaje = puntaje + 1;
            }
            else
            {
                System.out.println("Tu respuesta es incorrecta, la palabra era: "+getRespuesta()[i]);
            }
        }
        setPuntajeRonda2((puntaje / 3)*100);
        System.out.println("Tu puntaje final de esta ronda es del "+getPuntajeRonda2()+"%");
    }
}