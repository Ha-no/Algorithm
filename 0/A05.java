package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A5{
	
	static int fct( int n ) {
		
		int count = 99, cal1 = 0, cal2 = 0, cal3 = 0;
		
		if( n == 1000 ) { n = 999; }
		
		for( int a=100; a<=n; a++ ) {

			cal1 = a % 10;
			cal2 = ( a / 10 ) % 10;
			cal3 = ( ( a / 10 ) / 10 ) % 10;
			
			if( cal1 - cal2 == cal2 - cal3 ) { count++; }
		}

		return count;
	}
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );

    	int input = Integer.parseInt( in.readLine() );
    	
    	if( input < 100 ) { out.write( input + "" ); }
    	else {
    		out.write( fct( input ) + "" );
    	}
    	
    	out.flush();
    	out.close();
    	in.close();
    }
}


/*	문제

어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다.
등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.
N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 
 */

/*	풀이

100 미만의 자연수는 모두 한수이므로 100이상의 자연수에서만 한수에 대한 검사를 해야 한다.
자연수 1000은 한수가 아니므로 1000이 입력되면 999로 입력되었다고 해도 무방하므로 예외 처리.
각 자리수의 값을 꺼내서 비교를 한다.

*/
