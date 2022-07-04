package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A26 {
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	StringTokenizer st = null;
    	
    	int max = 0;
    	
    	int n = Integer.parseInt( in.readLine() );
    	
    	st = new StringTokenizer( in.readLine() );

    	int[] array = new int[n];
    	int[] memo = new int[n];
    	
    	for( int a=0; a<n; a++ ) { array[a] = Integer.parseInt( st.nextToken() ); }

    	memo[0] = array[0];
    	max = array[0];
    	
    	for( int a=1; a<n; a++ ) {
    		
    		memo[a] = Math.max( memo[a-1] + array[a], array[a] );
    		
    		max = Math.max( max,  memo[a] );
    	}
    	
    	out.write( max + "" );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
}

