package aplicacao;

import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entidades.Produto;


public class App04 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		List<Produto>list = new ArrayList<>();
			
			list.add(new Produto("Tv", 900.00));
			list.add(new Produto("Mouse",50.00));
			list.add(new Produto("Tablet", 350.00));
			list.add(new Produto("HD Case", 80.90));
	
			double min= 100.0;
	Predicate<Produto> pred = p -> p.getPreco() >= min;
			
			
	list.removeIf(pred);
			
			for(Produto p : list) {
				System.out.println(p);
			}

		}
	}



	


