
package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A03{
	
	static int fct( int n ) {
		
		int count = 99, cal1 = 0, cal2 = 0, cal3 = 0;
		
		// 1000은 한수가 아니므로 999가 입력되었다고 봐도 무방
		if( n == 1000 ) { n = 999; }
		
		for( int a=100; a<=n; a++ ) {

			cal1 = a % 10;
			cal2 = ( a / 10 ) % 10;
			cal3 = ( ( a / 10 ) / 10 ) % 10;
			
			if( cal1 - cal2 == cal2 - cal3 ) { count++; }
		}

		return count;
	}
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );

    	int input = Integer.parseInt( in.readLine() );
    	
    	if( input < 100 ) { out.write( input + "" ); }
    	else {
    		out.write( fct( input ) + "" );
    	}
    	
    	out.flush();
    	out.close();
    	in.close();
    }
}
