package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class A20{
	
	static int narray[];
	static StringTokenizer st;
	static StringBuilder output;
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	
    	output = new StringBuilder();
    	
    	int n = Integer.parseInt( in.readLine() );
    	narray = new int[n];
    	
    	st = new StringTokenizer( in.readLine() );
    	
    	for( int a=0; a<n; a++ ) { narray[a] = Integer.parseInt( st.nextToken() ); }

    	Arrays.sort( narray );
    	
    	int m = Integer.parseInt( in.readLine() );
    	
    	st = new StringTokenizer( in.readLine() );
    	
    	while( m-- > 0 ) {
    		int box = Integer.parseInt( st.nextToken() );
    		
    		output.append( fnc( box ) ).append( " " );
    	}
    	
    	out.write( output.toString() );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
    
    static int fnc(int n) {

    	int first = 0, check = 0, last = narray.length - 1;
    	
    	while( first <= last ) {
    		
    		check = ( first + last ) / 2;
    		
    		if( narray[check] == n ) { return 1; }

    		else if( narray[check] > n ) { last = check-1; }
    		
    		else { first = check+1; }
    	}
    	
    	return 0;
	}
}


