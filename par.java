import java.util.Scanner;


class par {
  public static void main(String[] args) {

  Scanner scanner = new Scanner(System.in);

while (true){

    System.out.println("Ingrese el numero: ");
    int num = scanner.nextInt();
    int numdos = num % 2;

    if (num == 0){
      System.out.println("Su numero fue cero");
      System.out.println("cerrando...");
      System.out.println();
      break;
      }

    else if (numdos == 0){
      System.out.println("su numero es par");
      System.out.println();
    }

    else{
      System.out.println("su numero es impar");
      System.out.println();
    }
}


    
  }
}