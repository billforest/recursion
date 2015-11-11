// RecursiveMath.java

public class RecursiveMath {
  
  public static void main ( String[] args ) {
    
    System.out.println( factorial(10) );
    fibonacci(10);
    
  } // end main method
  
   public static long factorial ( int f ) {
    if( f > 1 ) {
      f *= factorial( f - 1 );
    }
    return f;
   }
   
   public static void fibonacci( int f ) {
     int result = 0;
     
  /*   if ( f == 0 ) {
       System.out.print( "0, " );
    }*/
     
     if ( f > 0 ) {
        result = prev + next;
        System.out.print( result + ", " );
        fibonacci( f - 1 );
        } else {
          System.out.print( "1, " );
        }
     
   }
} // end RecursiveMath