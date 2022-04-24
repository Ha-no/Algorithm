
/*
	문제 : https://www.acmicpc.net/problem/6588
	풀이 노션 : https://www.notion.so/1dc69bebd4534c109e8dce3c33c5eeb0
*/

package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A10{
	
	public static boolean[] array = new boolean[20001];
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );

    	StringBuffer sb = new StringBuffer();
    	
    	prime();
    	
    	int t = Integer.parseInt( in.readLine() );
    	
    	while( t-- > 0 ) {
    		
    		int n = Integer.parseInt( in.readLine() );
    		int first = n/2, second = n/2;
    		
    		while( true ) {
    			if( !array[first] && !array[second] ) {
        		
        			sb.append( first ).append( " " ).append( second ).append( "\n" );
        			break;
        		}
    			first--;
    			second++;
    		}
    		
    	}
    	
    	out.write( sb.toString() );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
    
    public static void prime() {
    	
    	array[0] = array[1] = true;
    	
    	for( int a=2; a<=Math.sqrt( array.length ); a++ ) {
    		
    		if( !array[a] ) {
    			
    			for( int b=a*a; b<array.length; b+=a ) {
    				
    				array[b] = true;
    			}
    		}
    	}
    }
}