import java.util.Scanner;

public class pgm_decimal_to_binary{

    public static void main(String[] args) {

        int numero, exp, digito;
        int binario;
        Scanner sc = new Scanner(System.in);

        do{  
            System.out.println("Digite el numero Decimal a convertir: ");
            numero = sc.nextInt();
        }while(numero<0);

        exp=0;
        binario=0;
        while(numero!=0){
                digito = numero % 2;            
                binario += digito * Math.pow(10, exp);   
                exp++;
                numero = numero/2;
        }
        System.out.println("El numero Binario que corresponde es : " + binario);

        System.out.println("**Luis Fernando Caicedo Solis **");
    }
}    