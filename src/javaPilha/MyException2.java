package javaPilha;
											 //isso � necess�rio pela classe de exce��o que se herda, nesse caso � exception
public class MyException2 extends Exception{ //essa classe � unchecked ou seja, o compilador checa se compila
											 //para resolver oma exceptio checked ou coloque a chasse na assinatura do m�todo ou ent�o usando try 
	public MyException2(String a) {
		super(a);
	}

}
