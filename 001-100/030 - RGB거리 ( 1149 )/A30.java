package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A30 {

    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	StringTokenizer st = null;
    	
    	int n = Integer.parseInt( in.readLine() );
    	
    	int[][] array = new int[n][3];
    	
    	for( int a=0; a<n; a++ ) {
    		
    		st = new StringTokenizer( in.readLine() );
    		
    		array[a][0] = Integer.parseInt( st.nextToken() );
    		array[a][1] = Integer.parseInt( st.nextToken() );
    		array[a][2] = Integer.parseInt( st.nextToken() );
    	}
    	
    	for( int a=1; a<n; a++ ) {
    		
    		array[a][0] += Math.min( array[a-1][1], array[a-1][2] );
    		array[a][1] += Math.min( array[a-1][0], array[a-1][2] );
    		array[a][2] += Math.min( array[a-1][0], array[a-1][1] );
    	}
    	
    	int output = Math.min( array[n-1][0], Math.min( array[n-1][1], array[n-1][2] ) );
    	
    	out.write( output + "" );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
}
