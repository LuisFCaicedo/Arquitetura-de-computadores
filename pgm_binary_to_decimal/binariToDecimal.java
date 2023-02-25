import java.util.Scanner;

public class binariToDecimal{

  public static void main(String[] args) {
    long num, aux, digito, decimal;
     int exponente;
     boolean validaBinario;
     Scanner sc = new Scanner(System.in);
     do {
          System.out.print("Ingresa el Numero Binario digito 1 o 0: ");
          num = sc.nextLong();
          validaBinario = true;
          aux = num;
          while (aux != 0) {
                     digito = aux % 10; 
                     if (digito != 0 && digito != 1) { 
                         validaBinario = false;    
                     }
                     aux = aux / 10;               
           }  
      } while (!validaBinario);
      exponente = 0;
      decimal = 0; 
      while (num != 0) {
               
                digito = num % 10;                          
                decimal = decimal + digito * (int) Math.pow(2, exponente);
                exponente++;
                num = num / 10;
      }
      System.out.println("El Numero Decimal es: " + decimal);

      System.out.println("Luis Fernando caicedo Solis ");
   }
}