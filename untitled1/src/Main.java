import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*System.out.println("Ingrese su numbre:");
        String usuario = scanner.nextLine();
        String saludar = "Saludos";
        System.out.println(saludar+ " " + usuario);*/


        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el titulo:");
        String titulo = scanner.nextLine();
        System.out.println("Proporciona el autor:");
        String autor = scanner.nextLine();
        System.out.println(titulo + " fue escrito por " + autor);
    }
}
