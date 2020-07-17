public class Third{

  public static void main(String[] args){
    long val = 600851475143L;
    long result = 1L;
    long counter = 1L;
    do{
      if(isPrime(counter)){
          if(val % counter == 0){
            result = counter;
            System.out.println(result);
          }
      }

      counter++;

    }while(counter < val);
    System.out.println(result);

  }

  public static boolean isPrime(long number){
    if(number <= 1){
      return false;
    }
    boolean isprime = true;
    for(int i = 2; i < number; i++){
      if(number % i == 0){
        isprime = false;
        break;
      }

    }
    return isprime;
  }

}
