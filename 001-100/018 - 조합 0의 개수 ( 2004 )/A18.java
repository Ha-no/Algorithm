package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A18 {
	
	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer( in.readLine() );
        
        StringBuilder output = new StringBuilder();
        
        int n = Integer.parseInt( st.nextToken() );
        int m = Integer.parseInt( st.nextToken() );
        int count5 = 0, count2 = 0;
        
        count5 = fnc5( n ) - ( fnc5( m ) + fnc5( n-m ) );
        count2 = fnc2( n ) - ( fnc2( m ) + fnc2( n - m ) );
        
        if( count5 > count2 ) { output.append( count2 ); }
        else { output.append( count5 ); }
        
        out.write( output.toString() );
        
		out.flush();
		out.close();
		in.close();
	}
	
	// 소인수 5의 개수
	static int fnc5( int n ) {
		
		int count = 0;
		
		while( n >= 5 ) {
			count += ( n / 5 );
			n /= 5;
		}
		
		return count;
	}
	
	// 소인수 2의 개수
	static int fnc2( int n ) {
		
		int count = 0;
		
		while( n >= 2 ) {
			count += ( n / 2 );
			n /= 2;
		}
		return count;
	}
}
