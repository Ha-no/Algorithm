package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class T3 {

	static int array[][][] = new int[21][21][21];
	
	public static void main( String args[] ) throws Exception {
		
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
		
		StringTokenizer st = null;
		
		StringBuilder output = new StringBuilder();
		
		int a = 0, b = 0, c = 0;
		
		while( true ) {
			
			st = new StringTokenizer( in.readLine() );
			
			a = Integer.parseInt( st.nextToken() );
			b = Integer.parseInt( st.nextToken() );
			c = Integer.parseInt( st.nextToken() );
			
			if( a == -1 && b == -1 && c == -1 ) { break; }
			
			output.append( "w(" ).append( a ).append( ", " ).append( b ).append( ", " ).append( c ).append( ") = " ).append( w( a, b, c ) ).append( "\n" );
		}
		
		out.write( output.toString() );
		
		out.flush();
		out.close();
		in.close();
	}
	
	static int w( int a, int b, int c) {
		
		if( range( a, b, c ) && array[a][b][c] != 0 ) {
			return array[a][b][c];
		}
		
		if( a <= 0 || b <= 0 || c <= 0 ) { return 1; }
		
		else if( a > 20 || b > 20 || c > 20 ) { return array[20][20][20] = w( 20, 20, 20 ); }
		
		else if( a < b && b < c ) { return array[a][b][c] = ( w( a, b, c-1 ) + w( a, b-1, c-1 ) - w( a, b-1, c ) ); }
		
		else { return array[a][b][c] = ( w( a-1, b, c ) + w( a-1, b-1, c ) + w( a-1, b, c-1 ) - w( a-1, b-1, c-1 ) ); }
	}
	
	static boolean range( int a, int b, int c ) {
		
		if( a > 20 || b > 20 || c > 20 || a < 0 || b < 0 || c < 0 ) { return false; }
		else { return true; }
	}
}

/*

https://www.acmicpc.net/problem/9184

�������� ����(?)����
����Լ��� �־��������Ƿ� �޸������̼Ǹ� �߰��ϸ� �ȴ�

�� 3���� �Է°��� ����ϱ� ������
3������ �迭�� ������ ��, �� �Լ��� ������� �ִ´�

*/