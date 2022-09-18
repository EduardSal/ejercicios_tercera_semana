import java.util.Scanner;

class cuadrado {
  public static void main(String[] args) {

   Scanner scanner = new Scanner(System.in);

  while (true){
    
    System.out.println("Ingrese el numero: ");
    int num = scanner.nextInt();
    System.out.println();

    if (num > 0){
      System.out.println("El cuadrado de su numero es: "+Math.pow(num,2));
      System.out.println();
      System.out.println();
    }
    else if (num < 0){
      System.out.println("Numero negativo");
      System.out.println("Cerrando....");
      System.out.println();  
      System.out.println();  
      break;
    }
    else{
      System.out.println("Su numero fue cero");
      System.out.println("Cerrando....");
      System.out.println();
      System.out.println();
      break;
    }
    
  }

    

  }
}