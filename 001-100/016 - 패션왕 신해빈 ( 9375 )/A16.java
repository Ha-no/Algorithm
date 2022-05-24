package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
 
public class A16 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = null;
        
        StringBuilder output = new StringBuilder();
        
        
        int t = Integer.parseInt( in.readLine() );
        int n = 0, result = 1;
        String input;        
        
        while( t-- > 0 ) {

            Map<String, Integer> map = new HashMap<>();
        	n = Integer.parseInt( in.readLine() );
        	result = 1;
        	
        	while( n-- > 0 ) {
        		
            	st = new StringTokenizer( in.readLine() );
            	
            	input = st.nextToken();
            	input = st.nextToken();
            	
            	if( map.containsKey( input ) ) { map.put( input, map.get( input )+1 ); }
            	else { map.put( input, 1 ); }
            	
        	}
        	
            for( int value : map.values() ) {
            	result *= ( ++value );
            }
            result--;
            
            output.append( result ).append( "\n" );
        }
        
        out.write( output.toString() );
        
		out.flush();
		out.close();
		in.close();
	}
}
