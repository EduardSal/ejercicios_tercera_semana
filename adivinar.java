import java.util.Scanner;


class adivinar {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Ingrese su numero a adivinar: ");
    int N = scanner.nextInt();
    System.out.println();
    System.out.println();

    
    while (true){
    System.out.println("Ingrese un numero");
    int num = scanner.nextInt();

      if (num == N){
        System.out.println("ENHORABUENA! Es el numero correcto");
        System.out.println("Cerrando....");
        System.out.println();
        System.out.println();
        break;
      }

      else if (num != N){
        System.out.println("Numero incorrecto, vuelva a intentar.");
        System.out.println();
        System.out.println();
      }
    }
      
    }

  }