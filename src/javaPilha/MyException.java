package javaPilha;
//isso é necessário pela classe de exceção que se herda, nesse caso é Runtimeexception
public class MyException extends RuntimeException{ //essa classe é checked ou seja, o compilador não checa
	
	public MyException(String a) {
		super(a);
	}

}
