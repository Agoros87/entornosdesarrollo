import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Principal{
	public static void main(String[] args) {
		System.out.println("Hola mundo");
		dameFechaYHora();
	}

	public static void dameFechaYHora(){

	LocalDateTime fechaYHora = LocalDateTime.now();

	DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

	String fechaYHoraFormateada = fechaYHora.format(formato);

	System.out.println("La fecha y la hora actual es: " + fechaYHoraFormateada);
	}
}

