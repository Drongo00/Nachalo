import java.math.BigInteger;
import java.util.Random;

public class Example {
    public static void main(String args[]) {
        
	BigInteger key;        
        long time;
	int bitLength;        
        int[] array = new int[] {8, 16, 32, 64, 128, 256, 1024, 4096}; // создали массив целых чисел на 10 элементов и присвоили ему имя myArray

	Random rnd = new Random();                                     

        BigInteger i = BigInteger.ZERO;
        
        for (int j = 0; j < array.length; j++)
        {
            bitLength = array[j];                      // берем длину бит 8, 16, 32, 64, 128, 256, 1024, 4096
            System.out.println("Range " + bitLength + "bits");
		              
            key = new BigInteger(bitLength, rnd);      // Генерируем случайное число BitInteger 
 
            time = System.currentTimeMillis();         // фиксируем начальное время
		
            i = BigInteger.ZERO;
		
            while (true){
    
                if(key.equals(i)){                     //сравнение сгенерированного ключа с ключами выбранного диапазона
    		        System.out.println("Found KEY = " + i); 
    		        
    		       	System.out.println("SearchTime = " + (System.currentTimeMillis() - time) + "ms");    //время поиска ключа
    		        System.out.println(" ");    		       	
                    break;                
                }
                else{
//                System.out.println("Not Equal");
                }            
                
                i = i.add(BigInteger.ONE);           // увеличиваем переменную сравнения на 1 
            }           
        }
    }
}