package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class A21{
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	
    	StringTokenizer st = null;
    	StringBuilder output = new StringBuilder();
    	
    	HashMap<String,Integer> map = new HashMap<String,Integer>();
    	
    	int n = Integer.parseInt( in.readLine() );
    	
    	st = new StringTokenizer( in.readLine() );
    	
    	while( n-- > 0 ) {

    		String check = st.nextToken();
    		
    		if( !map.containsKey( check ) ) { map.put( check, 1 ); }
    		else { map.put( check, ( map.get(check)+1 ) ); }
    	}
    	
    	int m = Integer.parseInt( in.readLine() );
    	st = new StringTokenizer( in.readLine() );
    	
    	while( m-- > 0 ) {
    		
    		String check = st.nextToken();
    		
    		if( map.containsKey( check ) ) {

        		int value = map.get( check );
        		
        		output.append( value ).append( " " );
    		
    		} else {
    			output.append( "0 " );
    		}
    		
    	}
    	
    	out.write( output.toString() );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
}



