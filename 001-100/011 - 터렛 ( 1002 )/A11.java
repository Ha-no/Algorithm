
package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A11{
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	StringTokenizer st = null;
    	
    	StringBuilder output = new StringBuilder();
    	
    	int n = Integer.parseInt( in.readLine() );
    	
    	int x1 = 0, x2 = 0, y1 = 0, y2 = 0, r1 = 0, r2 = 0;
    	double range = 0;
    	
    	for( int a=0; a<n; a++ ) {
    		
    		st = new StringTokenizer( in.readLine() );
    		
    		x1 = Integer.parseInt( st.nextToken() );
    		y1 = Integer.parseInt( st.nextToken() );
    		r1 = Integer.parseInt( st.nextToken() );
    		x2 = Integer.parseInt( st.nextToken() );
    		y2 = Integer.parseInt( st.nextToken() );
    		r2 = Integer.parseInt( st.nextToken() );

    		range = (Math.pow( ( x2 - x1 ) , 2 ) + Math.pow( ( y2 - y1 ), 2 ));

    		
    		if( x1 == x2 && y1 == y2 && r1 == r2 ) { output.append( -1 ); }
    		else if( range < Math.pow( ( r2 - r1 ), 2 ) ) { output.append( 0 ); }
    		else if( range > Math.pow( ( r1 + r2 ), 2 ) ) { output.append( 0 ); }
    		else if( range == Math.pow( ( r2 - r1 ), 2) ) { output.append( 1 ); }
    		else if( range == Math.pow( ( r1 + r2 ), 2 ) ) { output.append( 1 ); }
    		else { output.append( 2 ); }
        	
        	output.append( "\n" );
    	}

    	out.write( output.toString() );
		
    	out.flush();
    	out.close();
    	in.close();
    }
}
