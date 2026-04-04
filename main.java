import java.util.Scanner;
public class Main{
    Scanner scanner = new Scanner(System.in);
    public  void main(String[] args) {
        int num =0;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nivel de dificultad: ");
        System.out.println("Nivel facil:   1 ");
        System.out.println("Nivel medio:   2 ");
        System.out.println("Nivel dificil: 3 ");
        int dificultad = scanner.nextInt();
        switch (dificultad) {
            case 1:
                num = (int)(Math.random() * 10) + 1;
                System.out.println("Has elegido el nivel facil");
                System.out.println("El numero es del 1 al 10");
                adivinar(num);
                break;
            case 2:
                num = (int)(Math.random() * 20) + 1;
                System.out.println("Has elegido el nivel medio");
                System.out.println("El numero es del 1 al 20");
                adivinar(num);
                break;
            case 3:
                num = (int)(Math.random() * 30) + 1;
                System.out.println("Has elegido el nivel dificil");
                System.out.println("El numero es del 1 al 30");
                adivinar(num);
                break;

            default:
                  System.out.println("Valor incorrecto");
                break;
        }
        
    }
    public void  adivinar(int num){
        int intentos=1;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Di el numero que crees que es ");
            int numero = scanner.nextInt();
            intentos = intentos+1;
            System.out.println("Intento:"+intentos);
            if(numero<num){
             System.out.println("El numero es mas alto");
            }
            if(numero>num){
             System.out.println("El numero es mas bajo");
            }
            if (intentos==5){
                System.out.println("Has perdido,el numero era: "+num);
                break;
            }
            if (numero==num) {
                System.out.println("Has ganado");
                break;
            }
        }
    } 
}