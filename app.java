public class app {

    public static void main(String[] args) {
        
        System.out.println("3! fact(3) " +fact(3));
        System.out.println("5! fact(5) " +fact(5));
        System.out.println("9! fact(9) " +fact(9));
    }
    
    
    public static int fact(int n){
         if(n == 0){
             return  1;
         }else {
             return  n * fact(n-1);
         }   
             
    }
      
}
