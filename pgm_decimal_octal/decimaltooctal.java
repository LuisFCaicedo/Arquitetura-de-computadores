import java.util.Scanner;

public class decimaltooctal {
    
  public static void main(String args[]) throws InterruptedException
  {
    Scanner input = new Scanner( System.in );
    System.out.println("*********Conversion de un numero DECIMAL A OCTAL **********");
    System.out.print("🎟️🎟️Ingrese el numero Decimal convertir🎟️🎟️ : ");
    int num =input.nextInt();
 
    /* Metodo 1:  */
    String octalString = Integer.toOctalString(num);
    System.out.println("Estamos en proceso de conversion Metodo 1 ⌛");
        Thread.sleep(1000);
        System.out.println("Estamos en proceso de conversion Metodo 1 ⌛⌛");
        Thread.sleep(1000);
        System.out.println("Estamos en proceso de conversion Metodo 1 ⌛⌛⌛");
        Thread.sleep(1000);
        System.out.println("Casi terminado 🔚🔚🔚");
        Thread.sleep(1000);
        System.out.println("Falta poco 🔚🔚");
        Thread.sleep(1000);
        System.out.println("Hemos terminado 🔚");
        Thread.sleep(1000);    
    System.out.println(" \033[32m Metodo 1: El numero Octal es : " + octalString);

    /* Metodo 2: */
 
    int rem;
    String str=""; 
 
    char dig[]={'0','1','2','3','4','5','6','7'};
 
    while(num>0)
    {
       rem=num%8; 
       str=dig[rem]+str; 
       num=num/8;
    }
    System.out.println("\033[37m --------------------------------------------------------------");
    System.out.println("Estamos en proceso de conversion metodo 2 ⌛:");
        Thread.sleep(1000);
    System.out.println("Estamos en proceso de conversion metodo 2 ⌛⌛");
        Thread.sleep(1000);
    System.out.println("Estamos en proceso de conversion metodo 2 ⌛⌛⌛");
        Thread.sleep(1000);
    System.out.println("Casi terminado 🔚🔚🔚");
        Thread.sleep(1000);
    System.out.println("Falta poco 🔚🔚");
        Thread.sleep(1000);
    System.out.println("Hemos terminado 🔚");
        Thread.sleep(1000);    
    System.out.println("\033[31m Metodo 2: el nimero Octal es : "+str);
    Thread.sleep(1000);
    System.out.println("👨‍💻👨‍💻");
        Thread.sleep(1000);
    System.out.println("💻💻 \033[37m Luis Fernando Caicedo Solis 💻💻");


  }
}