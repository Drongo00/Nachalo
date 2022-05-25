import java.math.BigInteger;
import java.util.Random;

public class Example {
    public static void main(String args[]) {

	// Генерируем случайное число BitInteger
	int bitLength = 64; // 8 bits (диапазон от 0 до 255)
	Random rnd = new Random();

	BigInteger birnd2 = new BigInteger(bitLength, rnd);

	System.out.println("birnd2 = " + birnd2);
		
        // Вычислить 2-ю степень больших чисел
//        System.out.println("Возвести результат операции в степень 3 : " + birnd2.pow(3));
        
//        birnd2 = birnd2.pow(3);
//        System.out.println("birnd2 = " + birnd2);

	BigInteger i = BigInteger.ZERO;


	long time = System.currentTimeMillis();
	
        while (true){

            if(birnd2.equals(i)){
                System.out.println("Equal");
		System.out.println("i = " + i);
		System.out.println("Time = " + (System.currentTimeMillis() - time) + "ms");                
                break;                
            }
            else{
//                System.out.println("Not Equal");
            }            
            
            i = i.add(BigInteger.ONE);
        }
    }
}