package controller;

import model.PilhaInt;

public class FatController {

	public FatController() {
		super();
	}
	
	PilhaInt p = new PilhaInt();
	
	public void fatorial(int n) throws Exception {
		p.Push(n);
		int addValor;
		while(n > 1) {
			addValor = (n-1) * p.Top();
			p.Push(addValor);
			n--;
		}
		System.out.println("Fatorial: " + p.Top());
	}

}
