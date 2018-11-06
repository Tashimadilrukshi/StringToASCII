import java.util.Scanner;

class StringToCharArray{
  
  public static void main(String args[]){
  
      Scanner s = new Scanner(System.in);
      
      String word = s.nextLine();
      
      stringToCharArray(word);
      
  }
  
  
  static int stringToCharArray(String word) {

        
        char[] chars = word.toCharArray();
       
        int[] ascii=new int[chars.length];
        for(int i=0;i<chars.length;i++){
            ascii[i]=((int)chars[i]);
        }
        

}
