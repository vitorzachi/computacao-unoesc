package singleton.test;

import singleton.PessoaRegras;

public class SingletonTest {

	public static void main(String args[]){
		PessoaRegras p1 = PessoaRegras.getInstance();
		PessoaRegras p2 = PessoaRegras.getInstance();

		System.out.println("p1: "+p1);
		System.out.println("p2: "+p2);
		System.out.println("p1==pe? "+(p1==p2));

	}

}
