package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class T0 {
	
	static int array[][] = new int[15][15];
	
	public static void main( String args[] ) throws Exception {
		
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
		
		StringBuilder output = new StringBuilder();
		
		f();
		
		int t = Integer.parseInt( in.readLine() );
		int n = 0, k = 0;
		
		while( t --> 0 ) {
			k = Integer.parseInt( in.readLine() );
			n = Integer.parseInt( in.readLine() );
			
			output.append( array[k][n-1] ).append( "\n" );
		}
		
		out.write( output.toString() );
		
		out.flush();
		out.close();
		in.close();
	}
	
	static void f() {
		
		int box = 0;
		
		for(int a=0; a<15; a++ ) {
			for( int b=0; b<15; b++ ) {
				
				if( a==0 ) { array[a][b] = b+1; }
				else if( b == 0 ) { array[a][0] = 1; }
				else {
					for( int c=0; c<=b; c++ )  {
						box += ( array[a-1][c] )  ;
					}
					
					array[a][b] = box;
					box = 0;
				}
			}
		}
	}	
}

/*

https://www.acmicpc.net/problem/2775

단순하게 모든 경우의 수 크기의 배열을 생성하여 각 값을 넣은 후
입력된 k, n에 따른 값을 출력한다


*/