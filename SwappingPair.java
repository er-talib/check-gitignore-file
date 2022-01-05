
class SwappingPair{
      
      public static void main(String[] args){
      
      String name = "Talib";
      swapPair(name);
      
      }
      
      public static void swapPair(String name ){
      
     
     char[] ch = name.toCharArray();
     
     for(int i = 0 ; i < ch.length -1; i++){
     
     if(i % 2 == 0){
      char temp = ch[i];
      ch[i ] = ch[i + 1];
      ch[i + 1 ] = temp ;  
     
     }
     
     
     }
      System.out.print(ch);
  }
   
}
