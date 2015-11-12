// RecursiveMath.java

public class RecursiveMath {
  
  public static void main( String[] args ) {
    
    System.out.println( factorial(32) );
    
    int fibnum = 10;
    int salnum = 5;
    for( int i = 0; i<=salnum; i++ ) {
    //  System.out.print( sal(i) + ", " );
    }
   
    puf( 10 );
    //sal( 5 );
    
    System.out.println();
    
    elvis(11);
    // System.out.println( "Fibonacci 10: " + fibonacci(10));
    
  } // end main method
  
   public static long factorial ( int f ) {
    if( f > 1 ) {
      f *= factorial( f - 1 );
    }
    return f;
   }
   
   public static int fibonacci( int f ) {
     int result = 0;
     
    if ( f == 0 ) {
       return 0;
    }
    else if( f == 1 ) {
       return 1;
    }
    else {
      return fibonacci(f-1) + fibonacci(f-2);
    }
   }
   
   // Puf function from Blue Pelican Java page 39-9
   public static void puf( int f ) {
     if ( f == 1 ) {
       System.out.print( "x" );
     } else if ( f%2 == 0 ) {
       System.out.print( "{" ); 
       puf(f-1);
       System.out.print( "}" );
     } else {
       System.out.print( "<" );
       puf(f-1);
       System.out.print( ">" );
     }
   }
   
  /* public static int sal( int f ) {
     if ( f==2 ) {
       return 100;
     } else if( f == 3 ) {
       return 200;
     } else {
       return (2 * sal(f-1) + sal(f-2) + 1 ); 
     } 
   } 
   */
   public static void elvis( int f ) {
     if ( f <= 3 )
       System.out.print( f+1 );
     else {
       elvis( f-3 ); // elvis(11), elvis(8), elvis(5)
       System.out.print( ">>" + ( f -1 ) );
     }
   }
} // end RecursiveMath
