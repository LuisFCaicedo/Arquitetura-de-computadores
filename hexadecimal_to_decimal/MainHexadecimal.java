//package hexadecimal_to_decimal;

import java.util.Scanner;

public class MainHexadecimal {
    public static void main(String[] args) {
        
        String imprimir;
        long resultado;
        String numero;
        HexadecimalEngine engine = new HexadecimalEngine();

        Scanner capturar = new Scanner (System.in);
           System.out.println("|------------------------------------");
        System.out.println("| Hexadecimal a Decimal 🖥️             ");
        System.out.println("| Lenguaje: Java                        ");
        System.out.println("| Author: Luis Caicedo 🧠            ");
        System.out.println("-----------------------------");
        System.out.println("Conversor Hexadecimal a Decimal");
        System.out.println("-------------------------------------");
        System.out.println("⌨️⌨️Ingrese un número Hexadecimal ⌨️⌨️");
        System.out.println("-----------------------------");

        numero = capturar.next();
        capturar.close();

        imprimir = engine.validarHexadecimal(numero)?"si":"no";
        resultado = engine.hexadecimalADecimal(numero);

        System.out.println("-----------------------------------------");
        if (imprimir.equals("si")){
            System.out.println("✅El resultado es: " + resultado);
        }else{
            System.out.println("⛔El numero: " + numero + " No es Hexadecimal.");
        }
        System.out.println("-----------------------------------------");

    }
}