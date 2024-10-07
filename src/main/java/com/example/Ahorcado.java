package com.example;

import java.awt.*;
import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) {
        //Clase scanner que nos permite que el usuario ingrese datos
        Scanner entrada = new Scanner(System.in);

        //Declaraciones y asignaciones
        String palabraSecreta = "aprendizaje";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false; //saber si fue adivinada la palabra se escribiria estaAdivinada? isAskse


        //Arreglos:
        char[]letrasAdivinadas = new char[palabraSecreta.length()];

        //Estructura de control, Bucle
        for (int i = 0; i < letrasAdivinadas.length; i++ ){
            letrasAdivinadas[i] = '_';
        }
        //Estructura de Control
        while (!palabraAdivinada && intentos < intentosMaximos){
            System.out.println("Palabra a adivinar: "+ String.valueOf(letrasAdivinadas) +" (" +palabraSecreta.length() + " letras)");

            System.out.println("Introduce una letra, por favor");

            char letra = Character.toLowerCase(entrada.next().charAt(0));

            boolean letraCorrecta = false;
            for (int i = 0; i<palabraSecreta.length();i++){
                //Estructura de control condicional
                if (palabraSecreta.charAt(i) == letra) //chartAt recorre una cadena de letras, letra por letra
                {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }
            if (!letraCorrecta){
                intentos ++;
                System.out.println("¡Incorrecto! Te quedan " + (intentosMaximos - intentos)+ " intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)){
                palabraAdivinada = true;
                System.out.println("Felicidades, has adividado la palabra secreta: "+ palabraSecreta);
            }

        }
        if (!palabraAdivinada){
            System.out.println("¡Que pena te has quedado sin intentos! GAME OVER");

        }
        entrada.close();
    }
}