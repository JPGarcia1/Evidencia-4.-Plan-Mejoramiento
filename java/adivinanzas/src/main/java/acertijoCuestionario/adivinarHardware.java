package acertijoCuestionario;

import java.util.Scanner;

public class adivinarHardware extends adivinanza {
    private String[] acertijo = {"Ayudó a que el pc tenga su alimento pero no siempre se me da el reconocimiento.",
    "Muestra la tarea que tù y tu computadora han hecho.",
    "Soy la pequeña pero importante herramienta para interactuar con el pc"};
    private String[] respuesta = {"fuente de alimentacion","la pantalla","el mouse"};
    private String eleccion;
    private double puntajeRonda3;

    Scanner sc = new Scanner(System.in);

    public adivinarHardware(){}

    public adivinarHardware(String[] acertijo, String[] respuesta, String eleccion, double puntajeRonda3) {
        this.acertijo = acertijo;
        this.respuesta = respuesta;
        this.eleccion = eleccion;
        this.puntajeRonda3 = puntajeRonda3;

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
    public double getPuntajeRonda3() {
        return puntajeRonda3;
    }
    public void setPuntajeRonda3(double puntajeRonda3) {
        this.puntajeRonda3 = puntajeRonda3;
    }

    public void realizarAcertijo(){
        double puntaje = 0;
        for (int i = 0; i < getAcertijo().length; i++) {
            System.out.println("\nAdivinanza No. "+(i+1));
            System.out.println(getAcertijo()[i]);
            System.out.println("¿Que componente o herramienta es?");
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
        setPuntajeRonda3((puntaje / 3)*100);
        System.out.println("Tu puntaje final de esta ronda es del "+getPuntajeRonda3()+"%");
    }
}