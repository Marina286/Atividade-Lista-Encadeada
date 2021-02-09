package exercicio.listaencadeada;
import java.util.LinkedList;

public class Listaencadeada2 {
	public static void main (String[] args) {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		Integer m = 0;
		lista.addFirst(28);
		lista.add(11);
		lista.addLast(07);
		lista.add(06);
		
		for (int num : lista) {
			if(num > m) {
				m = num;
			System.out.println("Imprimindo a Lista: " + m);}}	
}}
