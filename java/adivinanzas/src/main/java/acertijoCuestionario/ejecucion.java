package acertijoCuestionario;

public class ejecucion {
    public static void main(String[] args) {
        double puntajeFinal;
        adivinarCosas enigma = new adivinarCosas();
        adivinarAnimal buho = new adivinarAnimal();
        adivinarHardware pc = new adivinarHardware();

        System.out.println("ADIVINANZAS\nBienvenido al juego de las adivinanzas,\neste juego consiste en responder a las adivinanzas correctamente y este estara divido en 3 rondas"+
        "\ndependiendo el puntaje de cada ronda se generara una puntuacion total en la que,\nsi el puntaje total es mayor de 60, ganas el juego, y si es menor de 60 pierdes.");

        System.out.println("\nAdivinanzas de objetos");
        enigma.realizarAcertijo();
        System.out.println("\nAdivinanzas de animales");
        buho.realizarAcertijo();
        System.out.println("\nAdivinanzas de hardware");
        pc.realizarAcertijo();

        System.out.println("\n Puntajes");
        System.out.println(" - El puntaje de la primera ronda fue del "+enigma.getPuntajeRonda1()+"%");
        System.out.println(" - El puntaje de la segunda ronda fue del "+buho.getPuntajeRonda2()+"%");
        System.out.println(" - El puntaje de la tercera y ultima ronda de del "+pc.getPuntajeRonda3()+"%");
        puntajeFinal = (enigma.getPuntajeRonda1() + buho.getPuntajeRonda2() + pc.getPuntajeRonda3())/3;
        System.out.println("El puntaje final es de "+puntajeFinal);

        if (puntajeFinal >= 60) {
            System.out.println("Tu puntaje total fue mayor que 60.\nGanaste el juego de las adivinanzas, Felicidades!!");
        }
        else
        {
            System.out.println("Tu puntaje total fue menor que 60.\nPerdiste el juego de las adivinanzas.");
        }
    }
}