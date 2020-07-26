package javaPilha;
											 //isso é necessário pela classe de exceção que se herda, nesse caso é exception
public class MyException2 extends Exception{ //essa classe é unchecked ou seja, o compilador checa se compila
											 //para resolver oma exceptio checked ou coloque a chasse na assinatura do método ou então usando try 
	public MyException2(String a) {
		super(a);
	}

}
