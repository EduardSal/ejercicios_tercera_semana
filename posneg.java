import java.util.Scanner;

class posneg {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    

    System.out.println();

    while (true){

    System.out.println("Ingrese el numero: ");
    int num = scanner.nextInt();

      
      if (num > 0){
        System.out.println("Su numero es positivo");
        System.out.println();
      }

      else if (num < 0){
        System.out.println("Su numero es negativo");
        System.out.println();
  }
      
       if (num == 0){
        System.out.println("Su numero es cero");
        System.out.println();
        System.out.println("Cerrando....");
        System.out.println();
        System.out.println();
        break;
}

}
}
}