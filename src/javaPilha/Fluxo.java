package javaPilha;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
        	metodo1();
        }
        catch(ArithmeticException | NullPointerException | MyException ex) {
        	String b = ex.getMessage();
        	System.out.println(b);
        }
        
        System.out.println("Fim do main");
    }

    private static void metodo1() {//se o static for retirado, essa m�todo s� pode ser chamado a partir de uma referencia
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }
//
//    private static void metodo2() {
//        System.out.println("Ini do metodo2");
//        for(int i = 1; i <= 5; i++) {
//            System.out.println(i);
//            try {
//            	//int a = i / 0;
//            	Conta c = null;
//            	c.deposita();
//            }
//            catch(ArithmeticException | NullPointerException ex ) {
//            	String b = ex.getMessage();
//            	System.out.println(b);
//            }
//        }
//        System.out.println("Fim do metodo2");
//    }
    
    private static void metodo2() {
      System.out.println("Ini do metodo2");

      throw new MyException("deu ruim");

      }
}
 