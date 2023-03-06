/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ELECTRO
 */
public class Exame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code a public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        // Solicitar los valores de entrada al usuario
        System.out.print("Ingrese la población actual: ");
        double poblacionActual = entrada.nextDouble();
        
        System.out.print("Ingrese la tasa de crecimiento anual: ");
        double tasaCrecimiento = entrada.nextDouble();
        
        // Calcular la población futura
        double poblacionFutura1 = poblacionActual * Math.pow(1 + tasaCrecimiento, 1);
        double poblacionFutura2 = poblacionActual * Math.pow(1 + tasaCrecimiento, 2);
        double poblacionFutura3 = poblacionActual * Math.pow(1 + tasaCrecimiento, 3);
        double poblacionFutura4 = poblacionActual * Math.pow(1 + tasaCrecimiento, 4);
        double poblacionFutura5 = poblacionActual * Math.pow(1 + tasaCrecimiento, 5);
        
        // Mostrar los resultados
        System.out.println("La población mundial estimada después de 1 año es: " + poblacionFutura1);
        System.out.println("La población mundial estimada después de 2 años es: " + poblacionFutura2);
        System.out.println("La población mundial estimada después de 3 años es: " + poblacionFutura3);
        System.out.println("La población mundial estimada después de 4 años es: " + poblacionFutura4);
        System.out.println("La población mundial estimada después de 5 años es: " + poblacionFutura5);
    
    }

    /**
     *
     * @param args
     */
    public static void velocidad (String[] args) {
        Scanner input = new Scanner(System.in);
        double distancia, tiempo, velocidad;
        
        System.out.print("Ingrese la distancia recorrida (en metros): ");
        distancia = input.nextDouble();
        
        System.out.print("Ingrese el tiempo transcurrido (en segundos): ");
        tiempo = input.nextDouble();
        
        velocidad = distancia / tiempo;
        System.out.println("La velocidad es " + velocidad + " metros por segundo.");
    }

    /**
     *
     * @param args
     */
    public static void area(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la longitud de un lado del cuadrado: ");
        double lado = sc.nextDouble();
        double area = lado * lado;
        System.out.println("El area del cuadrado es: " + area);
    }

    /**
     *
     * @param args
     */
    public static void numeros (String[] args) {
       int[] numeros = new int[10];
       Scanner input = new Scanner(System.in);

       // Pedir al usuario que ingrese los números
       System.out.println("Ingrese 10 números: ");
       for (int i = 0; i < numeros.length; i++) {
           numeros[i] = input.nextInt();
       }

       // Imprimir solo los números pares
       System.out.println("Números pares:");
       for (int i = 0; i < numeros.length; i++) {
           if (numeros[i] % 2 == 0) {
               System.out.println(numeros[i]);
           }
       }
   }

    /**
     *
     * @param args
     */
    public static void promedio(String[] args) {
        double nota1, nota2, nota3, promedio;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la primera nota: ");
        nota1 = sc.nextDouble();

        System.out.println("Ingrese la segunda nota: ");
        nota2 = sc.nextDouble();

        System.out.println("Ingrese la tercera nota: ");
        nota3 = sc.nextDouble();

        promedio = (nota1 + nota2 + nota3) / 3;

        System.out.println("El promedio del alumno es: " + promedio);
    }
public static void juegoadivinar(String[] args) {

        Random random = new Random();
        int numeroAleatorio = random.nextInt(8643) + 1234; // Generar número aleatorio entre 1234 y 9876

        Scanner scanner = new Scanner(System.in);
        int intentos = 0;

        while (true) {
            System.out.print("Ingresa un número de 4 cifras: ");
            int numeroIngresado = scanner.nextInt();

            if (numeroIngresado == numeroAleatorio) {
                System.out.println("¡Felicidades, adivinaste el número en " + intentos + " intentos!");
                break;
            } else {
                int bien = 0;
                int regular = 0;

                // Contar los números bien y regulares
                String numeroAleatorioString = Integer.toString(numeroAleatorio);
                String numeroIngresadoString = Integer.toString(numeroIngresado);
                for (int i = 0; i < 4; i++) {
                    if (numeroAleatorioString.charAt(i) == numeroIngresadoString.charAt(i)) {
                        bien++;
                    } else if (numeroAleatorioString.contains(Character.toString(numeroIngresadoString.charAt(i)))) {
                        regular++;
                    }
                }

                System.out.println("Número de bien: " + bien);
                System.out.println("Número de regular: " + regular);
                intentos++;
            }
        }
    }

    
    
    public static void generateSecret() {
        for (int i = 0; i < 10; i++) { // primer digito
            for (int j = 0; j < 10; j++) { // segundo digito
                for (int k = 0; k < 10; k++) { // tercer digito
                    for (int l = 0; l < 10; l++) { // cuarto digito
                        if (i != j && i != k && i != l && j != k && j != l && k != l // ningún número se repite
                                && ((j + k) % 2 == 0)) { // suma de los dígitos intermedios es par
                            System.out.println("" + i + j + k + l);
                        }
                    }
                }
            }
        }
    }
       public static void nombre(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nombres = new String[10];
        int[] edades = new int[10];
        double[] sueldos = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre del empleado #" + (i + 1) + ":");
            nombres[i] = input.nextLine();

            System.out.println("Ingrese la edad del empleado #" + (i + 1) + ":");
            edades[i] = input.nextInt();
            input.nextLine();

            System.out.println("Ingrese el sueldo del empleado #" + (i + 1) + ":");
            sueldos[i] = input.nextDouble();
            input.nextLine();
        }

        System.out.println("Los datos de los empleados son los siguientes:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Empleado #" + (i + 1) + ": " + nombres[i] + " / " + edades[i] + " años / $" + sueldos[i]);
        }
    }

    /**
     *
     * @param args
     */
    public static void n(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] nombres = new String[10];
        int[] edades = new int[10];
        double[] sueldos = new double[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre del empleado #" + (i + 1) + ":");
            nombres[i] = input.nextLine();

            System.out.println("Ingrese la edad del empleado #" + (i + 1) + ":");
            edades[i] = input.nextInt();
            input.nextLine();

            System.out.println("Ingrese el sueldo del empleado #" + (i + 1) + ":");
            sueldos[i] = input.nextDouble();
            input.nextLine();
        }

        System.out.println("Los datos de los empleados son los siguientes:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Empleado #" + (i + 1) + ": " + nombres[i] + " / " + edades[i] + " años / $" + sueldos[i]);
        }
    }

    /**
     *
     * @param args
     */
    public static void man(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir velocidad y distancia al usuario
        System.out.print("Ingrese la velocidad media del auto (en km/h): ");
        double velocidad = scanner.nextDouble();
        System.out.print("Ingrese la distancia a recorrer (en km): ");
        double distancia = scanner.nextDouble();
        
        // Calcular tiempo de viaje en horas y minutos
        double tiempoEnHoras = distancia / velocidad;
        int horas = (int) tiempoEnHoras; // tomar solo la parte entera de las horas
        int minutos = (int) ((tiempoEnHoras - horas) * 60); // convertir la parte decimal a minutos
        
        // Imprimir resultado
        System.out.println("El tiempo de viaje es de " + horas + " horas y " + minutos + " minutos.");
    }

    /**
     *
     * @param args
     */
    public static void mai(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int monedas50, monedas25, monedas10, monedas5;
        double totalDolares;

        System.out.print("Ingrese la cantidad de monedas de 50 centavos: ");
        monedas50 = entrada.nextInt();

        System.out.print("Ingrese la cantidad de monedas de 25 centavos: ");
        monedas25 = entrada.nextInt();

        System.out.print("Ingrese la cantidad de monedas de 10 centavos: ");
        monedas10 = entrada.nextInt();

        System.out.print("Ingrese la cantidad de monedas de 5 centavos: ");
        monedas5 = entrada.nextInt();

        totalDolares = (monedas50 * 0.5) + (monedas25 * 0.25) + (monedas10 * 0.1) + (monedas5 * 0.05);
        System.out.println("El total de dólares es: $" + totalDolares);
    }
    
    
public static void edad (String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad = 0;

        while (edad < 1 || edad > 80) {
            System.out.print("Ingrese su edad (entre 1 y 80): ");
            edad = sc.nextInt();
        }
        System.out.println("La edad ingresada es: " + edad);
    }


public static void dsitancia(String[] args) {
        Scanner input = new Scanner(System.in);
        double distancia, tiempo, velocidad;
        
        System.out.print("Ingrese la distancia recorrida (en metros): ");
        distancia = input.nextDouble();
        
        System.out.print("Ingrese el tiempo transcurrido (en segundos): ");
        tiempo = input.nextDouble();
        
        velocidad = distancia / tiempo;
        System.out.println("La velocidad es " + velocidad + " metros por segundo.");
    }
 public static void numero(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Introduce un número: ");
        int num = entrada.nextInt();

        System.out.println("Los números desde " + num + " hasta 100 con salto de dos en dos son:");

        for (int i = num; i <= 100; i += 2) {
            System.out.print(i + " ");
        }
    }
public static void serie(String[] args) {
        int a = 0, b = 1, c = 0;
        
        System.out.print(a + " " + b + " ");
        
        while(c < 100) {
            c = a + b;
            if(c < 100) {
                System.out.print(c + " ");
            }
            a = b;
            b = c;
        }
    }
 public static void estudiante(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hombres = 0;
        int mujeres = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.println("Ingrese el nombre del estudiante #" + (i+1) + ":");
            String nombre = scanner.nextLine();
            
            System.out.println("Ingrese el sexo del estudiante #" + (i+1) + " (M/F):");
            String sexo = scanner.nextLine();
            
            if (sexo.equalsIgnoreCase("M")) {
                hombres++;
            } else if (sexo.equalsIgnoreCase("F")) {
                mujeres++;
            }
        }
        
        System.out.println("Cantidad de hombres: " + hombres);
        System.out.println("Cantidad de mujeres: " + mujeres);
    }
 
 
 
public static void rotativo(String[] args) {
        Random random = new Random();
        float a = 0 + random.nextFloat() * 9;
        float b = 0 + random.nextFloat() * 9;
        float c = 0 + random.nextFloat() * 9;

        System.out.printf("a: %.2f, b: %.2f, c: %.2f", a, b, c);
    }


 public static void suma(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = scanner.nextInt();

        // Si el número es negativo, lo convierte en su opuesto
        if (numero < 0) {
            numero = -numero;
            System.out.println("El número ingresado era negativo, se convirtió en positivo.");
        }

        int suma = 0;
        for (int i = 0; i <= numero; i++) {
            suma += i;
        }

        System.out.println("La suma de los números entre 0 y " + numero + " es: " + suma);
    }
 
 
public static void cuadrado(){
        Scanner leer= new Scanner(System.in);
       
       System.out.println("Ingrese el lado del cuadrado: ");
       double lado = leer.nextDouble();
       double area = lado * lado; 
       
       System.out.println("El área del cuadrado es: " + area);
   }
} 



























