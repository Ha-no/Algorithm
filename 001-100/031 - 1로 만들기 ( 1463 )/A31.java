package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A31 {
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	
    	int n = Integer.parseInt( in.readLine() );
    	
    	int count = fnc( n, 0 );
    	
    	out.write( count + "" );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
    
    public static int fnc( int n, int count ) {
    	
    	if( n < 2 ) { return count; }
    	
    	return Math.min( fnc( n/2, count + 1 + ( n % 2 ) ), fnc( n/3, count + 1 + ( n % 3 ) ) );
    }
}
