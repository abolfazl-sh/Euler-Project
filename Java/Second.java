class Second{

  public static void main(String[] args){
    int first = 1;
    int second = 2;
    int result = second;

    while(true){
      int third = first + second;
      if(third > 4000000){
        break;
      }else{
        first = second;
        second = third;
        if(third % 2 == 0){
          result += third;
        }
      }
    }
    System.out.println(result);
  }

}
