import java.io.*;
import java.text.*;
import java.util.*;

public class Cliente {

	public static void main(String args[]) throws Exception  {
		Pizzaria pizzaria = new PizzaioloCalabresa();
		PizzaCalabresaCategoria calabresaCategoria = pizzaria.criarPizzaCalabresa();
		PizzaPresuntoCategoria presuntoCategoria = pizzaria.criarPizzaPresunto();


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Digite a data: ");
		String data = br.readLine();

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date ontem = sdf.parse(data);
        GregorianCalendar gc = new GregorianCalendar();
        gc.setTime(ontem);
        int diaDaSemana = gc.get(GregorianCalendar.DAY_OF_WEEK);

        if (diaDaSemana == 1) {
        	System.out.println("Pizzaria fechada");
        } else if (diaDaSemana == 2 || diaDaSemana == 4 || diaDaSemana == 6) {
			calabresaCategoria.exibirInfoPizzaCalabresa();
        } else {
        	presuntoCategoria.exibirInfoPizzaPresunto();
        }
	}

}