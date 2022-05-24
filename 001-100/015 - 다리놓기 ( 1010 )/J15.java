package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
 
public class J15 {

	static int array[][][] = new int[30][30][1];
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        
        StringBuilder output = new StringBuilder();
        
        int t = Integer.parseInt( in.readLine() );
        int n = 0, m = 0;
        
        for( int a=0; a<t; a++ ) {
        	
        	st = new StringTokenizer( in.readLine() );
        	n = Integer.parseInt( st.nextToken() );
        	m = Integer.parseInt( st.nextToken() );
        	
        	output.append( fnc( m, n ) ).append( "\n" );
        }
        
        out.write( output.toString() );
        
		out.flush();
		out.close();
		in.close();
	}
		
	static int fnc( int n, int r ) {
		
		if( n == r || r == 0 ) { return 1; }
		
		if( array[n][r][0] == 0 ) {
			array[n][r][0] = fnc( n-1, r-1 ) + fnc( n-1, r );
		}
		
		return array[n][r][0];
	}
}
