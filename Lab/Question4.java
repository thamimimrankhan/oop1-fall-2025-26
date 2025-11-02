public class Question4 {
      public static void main(String[] args) {
        int x = 2;
        int y = 4;
        System.out.println("Before swap x:" + x + " y:" +y);
        x = x+y; 
        y = x-y; 
        x = x-y;
        System.out.println("After swap x:" +x + " y:" +y);
    }
    
}
