package exercicio.listaencadeada;
import java.util.LinkedList;

public class Listaencadeada {
	public static void main (String[] args) {
		LinkedList<Integer> lista = new LinkedList<Integer>();
		
		Integer a = 0; 
		lista.addFirst(1111);
		lista.add(0612);
		lista.addLast(2003);
		
		for (int l = 0; l < lista.size(); ++l) {
			a = a + lista.get(l);
		System.out.println("Imprimindo a Lista: " + a);}
} }
