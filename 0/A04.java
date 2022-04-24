

/*
	문제 : https://www.acmicpc.net/problem/4673
	풀이 노션 : https://www.notion.so/254aaaae1e864935832cf1556145d840
*/

package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A04{

	static int d( int n ) {
		
		int second = 0, sum = n;
		
		while( n != 0 ) {
			second = n % 10;
			sum += second;
			n /= 10;
		}
		return sum;
	}
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );

    	int check[] = new int[10001];
    	StringBuffer sb = new StringBuffer();
    	
    	for( int a=0; a<10000; a++ ) {
    	
    		int result = d(a);
    		
    		if( result <= 10000 ) { check[ result ] = 1; }
    	}
    	
    	for( int a=0; a<10000; a++ ) {
    		
    		if( check[a] != 1 ) { sb.append( a ).append( "\n" ); }
    	}
    		
    	out.write( sb.toString() );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
}
 