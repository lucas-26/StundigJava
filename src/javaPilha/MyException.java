package javaPilha;
//isso � necess�rio pela classe de exce��o que se herda, nesse caso � Runtimeexception
public class MyException extends RuntimeException{ //essa classe � checked ou seja, o compilador n�o checa
	
	public MyException(String a) {
		super(a);
	}

}
