package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class A13{
	
    public static void main(String[] args) throws Exception{
    	
    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	StringTokenizer st = new StringTokenizer( in.readLine() );
    	
    	StringBuilder output = new StringBuilder();
    	
    	int first = Integer.parseInt( st.nextToken() );
    	int second = Integer.parseInt( st.nextToken() );
    	
    	int max = fnc2( first, second );
    	
    	int min = first * second / max;
    	
    	output.append( max ).append( "\n" ).append( min );
    	
    	System.out.println( output );
    	
    	in.close();    	
    }
    
    // ¹Ýº¹¹®
    public static int fnc1( int a, int b ) {
    	
    	int box = 0;
    	
    	while( b != 0 ) {
    		
    		box = a % b;
	    	a = b;
	    	b = box;
    	}
    	
    	return a;
    }
    
    //Àç±Í
    public static int fnc2( int a, int b ) {
    	
    	if( b == 0 ) { return a; }
    	
    	return fnc2( b, a % b );
    }
}

/*
	https://www.acmicpc.net/problem/2609

*/