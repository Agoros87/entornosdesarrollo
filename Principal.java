import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Principal {
	public static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
                System.out.println("Hola mundo");
                dameFechaYHora();
                
                Usuario [] resultado = muestraUsuarios(2);
                
                for(int i = 0 ; i < resultado.length ; i++){
                    System.out.println(i+1 + "º Usuario");
                    System.out.println("Nombre: " + resultado[i].nombre);
                    System.out.println("Apellidos: " + resultado[i].apellidos);
                    System.out.println("Email: " + resultado[i].email+"\n");
                }
	}

	public static void dameFechaYHora(){

        LocalDateTime fechaYHora = LocalDateTime.now();

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

        String fechaYHoraFormateada = fechaYHora.format(formato);

        System.out.println("La fecha y la hora actual es: " + fechaYHoraFormateada);

        
}

	public static Usuario[] muestraUsuarios(int num){

        Usuario [] array = new Usuario[num];
        Usuario usuario = new Usuario();

        for(int i = 0 ; i < array.length; i++){
        System.out.print("Intoduce el " + (i+1) + "º nombre de usuario: ");
        usuario.nombre = teclado.nextLine();
        System.out.print("Introduce los apellidos: ");
        usuario.apellidos = teclado.nextLine();
        System.out.print("Introduce el email: ");
        usuario.email = teclado.nextLine();
        array[i] = usuario;
        
        }

        return array;
	}
}

