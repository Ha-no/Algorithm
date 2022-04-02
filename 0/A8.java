package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A8{
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );

    	StringBuffer sb = new StringBuffer();
    	
    	// N을 입력 받아 N까지의 수 중에 소수를 찾는다
    	int n = Integer.parseInt( in.readLine() );
    	
    	// N개의 공간이 있는 배열 생성 ( True = 소수X / False = 소수 )
    	boolean array[] = new boolean[ n + 1 ];
    	
    	// 루트 N * 2 > N 이므로 루트 N보다 작은 수의 배수로만 계산해도 충분하다
    	int check = (int)Math.sqrt( n );
    	
    	// 2부터 시작하여 루트 N까지의 배수들을 배열에서 False로 치환 
    	for( int a=2; a<=check; a++ ) {
    		
    		// array[a]가 소수가 아니면
    		if( !array[a] ) {
    			
    			// a의 배수의 모든 숫자를 소수가 아니라고 치환
        		for( int b=2*a; b<=n; b+=a ) {
        			
        			array[b] = true;
        		}
    		}
    	}
    	
    	// 2부터 N까지의 모든 소수 출력
    	for( int a=2; a<=n; a++ ) {
    	
    		if( array[a] != true ) { sb.append( a ).append( "\n" ); }
    	}
    	
    	out.write( sb.toString() );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
}
