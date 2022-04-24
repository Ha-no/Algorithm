
/*
	문제 : https://www.acmicpc.net/problem/2609
	풀이 노션 : https://www.notion.so/d7f4de2205ba44ec8cd0986efc49ef8e
*/

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
    	
		// 최소 공배수
    	int min = first * second / max;
    	
    	output.append( max ).append( "\n" ).append( min );
    	
    	System.out.println( output );
    	
    	in.close();    	
    }
    
	// 최대 공약수 구하는 함수
    // 방식 1 : 반복문
    public static int fnc1( int a, int b ) {
    	
    	int box = 0;
    	
    	while( b != 0 ) {
    		
    		box = a % b;
	    	a = b;
	    	b = box;
    	}
    	
    	return a;
    }
    
    // 방식 2 : 재귀
    public static int fnc2( int a, int b ) {
    	
    	if( b == 0 ) { return a; }
    	
    	return fnc2( b, a % b );
    }
}