package acertijoCuestionario;

import java.util.Scanner;

public class adivinarCosas extends adivinanza {
    private String[] adivinanza = {"Soy un círculo redondo al que, si me golpeas, das un buen brinco del susto.",
    "La gente me compra para comer pero nunca me come. ¿Que soy?",
    "Cuanto más le quitas, más grande se vuelve. ¿Que es?"};
    private String[] respuesta = {"un tambor","un plato","un hoyo"};
    private String eleccion;
    private double puntajeRonda1;

    Scanner sc = new Scanner(System.in);

    public adivinarCosas() {}
    
    public adivinarCosas(String[] adivinanza, String[] respuesta, String eleccion, double puntajeRonda1) {
        this.adivinanza = adivinanza;
        this.respuesta = respuesta;
        this.eleccion = eleccion;
        this.puntajeRonda1 = puntajeRonda1;
    }

    public String[] getAdivinanza() {
        return adivinanza;
    }

    public void setAdivinanza(String[] adivinanza) {
        this.adivinanza = adivinanza;
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

    public double getPuntajeRonda1() {
        return puntajeRonda1;
    }

    public void setPuntajeRonda1(double puntajeRonda1) {
        this.puntajeRonda1 = puntajeRonda1;
    }

    public void realizarAcertijo(){
        double puntaje = 0;
        for (int i = 0; i < getAdivinanza().length; i++) {
            System.out.println("\nAdivinanza No. "+(i+1));
            System.out.println(getAdivinanza()[i]);
            System.out.println("Escribe la respuesta del acertijo: ");
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
        setPuntajeRonda1((puntaje / 3)*100);
        System.out.println("Tu puntaje final de esta ronda es del "+getPuntajeRonda1()+"%");
    }
}