package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A29 {

	public static Integer[] check;
	public static int[] array;
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	
    	int max;
    	int n = Integer.parseInt( in.readLine() );
    			
    	check = new Integer[n+1];
    	array = new int[n+1];
    	
    	for( int a=1; a<n+1; a++ ) { array[a] = Integer.parseInt( in.readLine() ); }
    	
    	check[0] = array[0];
    	check[1] = array[1];
    	
    	if( n > 1 ) { check[2] = array[1] + array[2]; }
    	
    	max = fnc( n );
    	
    	out.write( max + "" );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
    
    public static int fnc( int n ) {
    	
    	if( check[n] == null ) { check[n] = Math.max( fnc(n-2), fnc(n-3) + array[n-1] ) + array[n]; }
    	
    	return check[n];
    }
}
