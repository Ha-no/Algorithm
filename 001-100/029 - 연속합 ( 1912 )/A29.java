package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A29 {

	public static int max;
	public static int[] array;
	public static Integer[] check;
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	StringTokenizer st = null;
    	
    	int n = Integer.parseInt( in.readLine() );

    	array = new int[n];
    	check = new Integer[n];

    	st = new StringTokenizer( in.readLine() );
    	
    	for( int a=0; a<n; a++ ) { array[a] = Integer.parseInt( st.nextToken() ); }

    	max = check[0] = array[0];
    	
    	fnc( n-1 );
    	
    	out.write( max + "" );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
    
    public static int fnc( int n ) {
    	
    	if( check[n] == null ) {
    		
    		check[n] = Math.max( fnc( n-1 ) + array[n], array[n] );
    		
    		max = Math.max( max, check[n] );
    	}
    	
    	return check[n];
    }
}
