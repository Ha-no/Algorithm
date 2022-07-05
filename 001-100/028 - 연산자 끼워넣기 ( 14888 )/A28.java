package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A28 {
	
	public static int[] array, sik;
	public static int n = 0, max = -1000000000, min = 1000000000, count = 0;
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	
    	StringBuilder output = new StringBuilder();
    	
    	input( in );
    	
    	fnc( array[0], 1 );
    	
    	output.append( max ).append( " " ).append( min );
    	
    	out.write( output.toString() );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
    
    public static void input( BufferedReader in ) throws Exception {
    	
    	StringTokenizer st = null;
    	
    	n = Integer.parseInt( in.readLine() );
    	
    	array = new int[n];
    	sik = new int[4];
    	
    	st = new StringTokenizer( in.readLine() );
    	
    	for( int a=0; a<n; a++ ) { array[a] = Integer.parseInt( st.nextToken() ); }
    	
    	st = new StringTokenizer( in.readLine() );
    	
    	for( int a=0; a<4; a++ ) { sik[a] = Integer.parseInt( st.nextToken() ); }
    }
    
    public static void fnc( int value, int idx ) {
    	
    	if( idx == n ) {
    		
    		min = Math.min( value, min );
    		max = Math.max( value, max );
    		count++;
    		return;
    	}
    	
    	for( int a=0; a<4; a++ ) {
    		
    		if( sik[a] != 0 ) {
    			
    			sik[a]--;
    			
    			if( a == 0 ) { fnc( value + array[idx], idx+1 ); }
    			else if( a == 1 ) { fnc( value - array[idx], idx+1 ); }
    			else if( a == 2 ) { fnc( value * array[idx], idx+1 ); }
    			else if( a == 3 ) { fnc( value / array[idx], idx+1 ); }
    			
    			sik[a]++;
    		}
    	}
    }
}
