package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A9{
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	
    	StringBuffer sb = new StringBuffer();
    	int n = Integer.parseInt( in.readLine() );

    	// N을 2부터 나누는데 나누는 숫자가 루트 N까지만 계산해도 된다
    	for( int a=2; a<=(int)Math.sqrt( n ); a++ ) {
    		
    		// 나머지가 0이면 인수이므로 StringBuffer에 저장하고, N을 a로 나눈 몫으로 치환
    		while( n % a == 0 ) {
    			sb.append( a ).append( "\n" );
    			n /= a;
    		}
    	}
    	
    	// 나머지가 1이 아니면 인수이므로 StringBuffer에 저장한다
    	if( n != 1 ) {
    		sb.append( n );
    	}
    	
    	out.write( sb.toString() );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
}
