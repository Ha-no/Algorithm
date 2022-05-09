
package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A07{
	
    public static void main(String[] args) throws Exception{
    	
    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	StringTokenizer st = new StringTokenizer( in.readLine() );
    	
    	int n = Integer.parseInt( st.nextToken() );
    	int m = Integer.parseInt( st.nextToken() );
    	
    	int array[][] = new int[n][m];
    	String input;
    	StringBuilder output = new StringBuilder();
    	
    	for( int a=0; a<n; a++ ) {
    		
    		input = in.readLine();
    		
    		for( int b=0; b<m; b++ ) {
    			
    			array[a][b] = input.charAt( b ); 
    		}
    	}
    	
    	int check = 87, min = n * m, count = 0;
    	
    	for( int a=0; a<=(n-8); a++ ) {
    		for( int b=0; b<=(m-8); b++ ) {
    			
    			for( int c=0; c<2; c++ ) {
    				
    				if( c == 0 ) { check = 66; }
    				else { check = 87; }
    				
    				for( int x=a; x<(a+8); x++ ) {
    					for( int y=b; y<(b+8); y++ ) {
    						
    						if( array[x][y] == check ) {
    							
    							count++;
    							
    							if( check == 87 ) { check = 66; }
    							else { check = 87; }
    						}
    						else { check = array[x][y]; }
    						
    						if( ( y + 1 ) == ( b + 8 ) ) {
    							if( check == 66 ) { check = 87; }
    							else { check = 66; }
    						}
    					}
    				}
    				if( min > count ) { min = count; }
    				count = 0;
    			}
    		}
    	}
    	
    	output.append( min );
    
    	System.out.println( output );
    	
    	in.close();
    }
}
