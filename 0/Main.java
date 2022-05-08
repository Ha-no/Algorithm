package algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
	
	// 계산했던 값( 수열 )을 저장하는 배열
	static int[] array;
	
	public static void main( String args[] ) throws Exception {
		
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
		
		StringBuilder output = new StringBuilder();

		int n = Integer.parseInt( in.readLine() );
		
		array = new int[n+1];

		// 배열을 초기화하면 0이 들어가는데 fibo(0) = 0 이 되어야 하므로, -1로 초기화
		Arrays.fill( array, -1 );
		
		array[0] = 0;
		array[1] = 1;
		
		int doit = fibo( n );
		
		// 수열 출력
		for( int a: array ) {
			
			output.append( a ).append( " " );
		}
		
		out.write( output.toString() );
		
		out.flush();
		out.close();
		in.close();
	}
	
	static int fibo( int n ) {
		
		// n번째 수열을 계산한적이 없다면 계산
		if( array[n] == -1 ) { array[n] = fibo( n-1 ) + fibo( n - 2 ); }
		
		// n번째 수열을 계산한적이 있다면 바로 return
		return array[n];
	}
}

/*

	동적 계획법 ( Dynamic Programing : DP )
	어떤 주어진 문제를 작은 문제로 쪼개서 풀어나감에 있어 반복되는 호출을 줄이는 방법
	주로 반복문( Bottom-UP ) / 재귀( Top-Down ) 방식이 존재
	
	재귀를 이용한 방식은 재귀를 진행할 때 한번 사용했던 함수(값)는 재실행 시키지않고
	값을 저장했다가 가져와 재활용(Memoization : 메모이제이션)사용하는 방식
	
	
	
*/
