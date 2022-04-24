
/*
	문제 : https://www.acmicpc.net/problem/2292 
	풀이 노션 : https://www.notion.so/1c519915b5b94411a72896fbff3f3371
*/

package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A04{
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );

    	int input = Integer.parseInt( in.readLine() );
    	int count = 1, check = 1;
    	
    	while( true ) {
    		
    		if( input <= check ) { out.write( count + "" ); break; }
    		check = check + ( 6 * count);
    		count++;
    	}
    	
    	out.flush();
    	out.close();
    	in.close();
    }
} 