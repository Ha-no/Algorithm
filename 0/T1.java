package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class T1 {
		
	public static void main( String args[] ) throws Exception {
		
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
		StringTokenizer st = null;
		
		StringBuilder output = new StringBuilder();
		
		int k = Integer.parseInt( in.readLine() );
		
		int array[] = new int[6];
		
		int xmax = 0, ymax = 0, xmaxidx = 0, ymaxidx = 0, big = 0, small = 0;
		
		for( int a=0; a<6; a++ ) {
			
			st = new StringTokenizer( in.readLine() );
			
			int x = Integer.parseInt( st.nextToken() );
			int y = Integer.parseInt( st.nextToken() );
			
			array[a] = y;
			
			if( x == 3 || x == 4 ) {
				if( xmax < y ) { xmax = y; xmaxidx = a; }
			}else {
				if( ymax < y ) { ymax = y; ymaxidx = a;}
			}
		}
		
		big = xmax * ymax;
		
		if ( xmaxidx == 0 ) {
			small = Math.abs( array[5] - array[1] );
		
		} else if ( xmaxidx == 5 ) {
			small = Math.abs( array[4] - array[0] );
		
		} else {
			small = Math.abs( array[xmaxidx-1] - array[xmaxidx+1] );
		}
		
		
		if( ymaxidx == 0 ) {
			small *= Math.abs( array[5] - array[1] );
			
		} else if( ymaxidx == 5 ) {
			small *= Math.abs( array[4] - array[0] );
		
		} else {
			small *= Math.abs( array[ymaxidx-1] - array[ymaxidx+1] );
		}
		
		big -= small;
		
		big *= k;
		
		output.append( big );
		
		out.write( output.toString() );
		
		out.flush();
		out.close();
		in.close();
	}
}

/*

https://www.acmicpc.net/problem/2477

큰삼각형 - 북/남 에서 가장 큰 길이 * 동/서 에서 가장 큰 길이
빈 작은 삼각형 - 북/남 에서 가장 큰길이의 좌우 차이 * 동/서 에서 가장 큰길이의 좌우 차이

큰삼각형 - 빈 작은 삼각형

*/