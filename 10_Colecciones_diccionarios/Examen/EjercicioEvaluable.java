import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class EjercicioEvaluable {
  public static void main(String[] args) {
    // variables
    int aciertos = 0;
    int posision;
    int respuestas;

    // Array list con respuestas incorrectas
    ArrayList<String> capitalesIncorrectas = new ArrayList<>();
    capitalesIncorrectas.add("Nicosia");
    capitalesIncorrectas.add("Ciudad del Vaticano");
    capitalesIncorrectas.add("Zagreb");
    capitalesIncorrectas.add("Copenhague");
    capitalesIncorrectas.add("Bratislava");
    capitalesIncorrectas.add("Liubliana");
    capitalesIncorrectas.add("Madrid");
    capitalesIncorrectas.add("Tallín");
    capitalesIncorrectas.add("Helsinki");
    capitalesIncorrectas.add("París");
    capitalesIncorrectas.add("Tiflis");
    capitalesIncorrectas.add("Atenas");
    capitalesIncorrectas.add("Budapest");
    capitalesIncorrectas.add("Dublín");
    capitalesIncorrectas.add("Reikiavik");
    capitalesIncorrectas.add("Roma");
    capitalesIncorrectas.add("Nursultán");
    capitalesIncorrectas.add("Riga");
    capitalesIncorrectas.add("Vaduz");
    capitalesIncorrectas.add("Vilna");
    capitalesIncorrectas.add("Luxemburgo");
    capitalesIncorrectas.add("Skopie");
    capitalesIncorrectas.add("La Valeta");
    capitalesIncorrectas.add("Chisinau");
    capitalesIncorrectas.add("Mónaco");
    capitalesIncorrectas.add("Podgorica");
    capitalesIncorrectas.add("Oslo");
    capitalesIncorrectas.add("Ámsterdam");
    capitalesIncorrectas.add("Varsovia");
    capitalesIncorrectas.add("Lisboa");
    capitalesIncorrectas.add("Londres");
    capitalesIncorrectas.add("Praga");
    capitalesIncorrectas.add("Bucarest");
    capitalesIncorrectas.add("Moscú");
    capitalesIncorrectas.add("San Marino");
    capitalesIncorrectas.add("Belgrado");
    capitalesIncorrectas.add("Estocolmo");
    capitalesIncorrectas.add("Berna");
    capitalesIncorrectas.add("Ankara");
    capitalesIncorrectas.add("Kiev");

    // Hasmap con respuestas correctas
    HashMap<String, String> respuestasCorrectas = new HashMap<String, String>();
    respuestasCorrectas.put("Albania", "Tirana");
    respuestasCorrectas.put("Alemania", "Berlín");
    respuestasCorrectas.put("Andorra", "Andorra La Vieja");
    respuestasCorrectas.put("Armenia", "Ereván");
    respuestasCorrectas.put("Austria", "Viena");
    respuestasCorrectas.put("Azerbaiyán", "Bakú");
    respuestasCorrectas.put("Bélgica", "Bruselas");
    respuestasCorrectas.put("Bielorrusia", "Minsk");
    respuestasCorrectas.put("Bosnia y Herzegovina", "Sarajevo");
    respuestasCorrectas.put("Bulgaria", "Sofía");

    ArrayList<String> paisPregunta = new ArrayList<>();
    for (String pais : respuestasCorrectas.keySet()) {
      paisPregunta.add(pais);

    }

    Collections.shuffle(paisPregunta);
    Collections.shuffle(capitalesIncorrectas);

    for (int i = 0; i < 10; i++) {
      System.out.println("¿Cuál es la capital de " + paisPregunta.get(i) + " ?");
      posision = (int) (Math.random() * 3);
      for (int j = 0; j < 3; j++) {
        if (j == posision) {
          System.out.println((j + 1) + " " + respuestasCorrectas.get(paisPregunta.get(i)));
        } else {
          System.out.println((j + 1) + " " + capitalesIncorrectas.get(j));
          capitalesIncorrectas.remove(j);
        }
      }

      do {
        System.out.print("Respuesta: ");
        respuestas = Integer.parseInt(System.console().readLine());
      } while (respuestas < 1 || respuestas > 3);

      if (respuestas == (posision + 1)) {
        aciertos++;
      }

    }

    if (aciertos >= 5) {
      System.out.println("¡Enhorabuena! ¡Has aprobado! Puntuación: " + aciertos);
    } else {
      System.out.println("Que lastima.... estas suspenso Puntuacion: " + aciertos);
    }
  }
}
