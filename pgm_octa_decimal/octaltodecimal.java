import java.util.Scanner;

public class octaltodecimal {
    public static void main(String[] args) throws InterruptedException {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("*********Conversion de un numero OCTAL A DECIMAL**********");

        System.out.println(" 🎟️🎟️Escribe el numero Octal 🎟️🎟️: ");
        String octal = sc.nextLine();
        long decimal = octalADecimal(octal);

        System.out.println("Estamos en proceso de conversion ⌛:");
        Thread.sleep(1000);
        System.out.println("Estamos en proceso de conversion ⌛⌛:");
        Thread.sleep(1000);
        System.out.println("Estamos en proceso de conversion ⌛⌛⌛:");
        Thread.sleep(1000);
        System.out.println("Casi terminado 🔚🔚🔚:");
        Thread.sleep(1000);
        System.out.println("Falta poco 🔚🔚:");
        Thread.sleep(1000);
        System.out.println("Hemos terminado 🔚:");
        Thread.sleep(1000);
        System.out.printf("\033[32m El octal %s 💱💱💱 \033[31m es %d en decimal %n", octal, decimal);
        Thread.sleep(1000);
        System.out.println("👨‍💻👨‍💻");
        Thread.sleep(1000);
        System.out.println("💻💻 \033[37m Luis Fernando Caicedo Solis 💻💻");

        
    }

    public static long octalADecimal(String octal) {
        long decimal = 0;
        int potencia = 0;
        for (int x = octal.length() - 1; x >= 0; x--) {
            int valorActual = Character.getNumericValue(octal.charAt(x));
            long elevado = (long) Math.pow(8, potencia) * valorActual;
            decimal += elevado;
            potencia++;
        }
        return decimal;
    }
}