package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A10{
	
	public static boolean[] array = new boolean[20001];
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );

    	StringBuffer sb = new StringBuffer();
    	
    	prime();
    	
    	int t = Integer.parseInt( in.readLine() );
    	
    	while( t-- > 0 ) {
    		
    		int n = Integer.parseInt( in.readLine() );
    		int first = n/2, second = n/2;
    		
    		while( true ) {
    			if( !array[first] && !array[second] ) {
        		
        			sb.append( first ).append( " " ).append( second ).append( "\n" );
        			break;
        		}
    			first--;
    			second++;
    		}
    		
    	}
    	
    	out.write( sb.toString() );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
    
    public static void prime() {
    	
    	array[0] = array[1] = true;
    	
    	for( int a=2; a<=Math.sqrt( array.length ); a++ ) {
    		
    		if( !array[a] ) {
    			
    			for( int b=a*a; b<array.length; b+=a ) {
    				
    				array[b] = true;
    			}
    		}
    	}
    }
}

/*	 문제

골드바흐의 추측

1보다 큰 자연수 중에서  1과 자기 자신을 제외한 약수가 없는 자연수를 소수라고 한다. 예를 들어, 5는 1과 5를 제외한 약수가 없기 때문에 소수이다. 하지만, 6은 6 = 2 × 3 이기 때문에 소수가 아니다.
골드바흐의 추측은 유명한 정수론의 미해결 문제로, 2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 이러한 수를 골드바흐 수라고 한다. 또, 짝수를 두 소수의 합으로 나타내는 표현을 그 수의 골드바흐 파티션이라고 한다. 예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7이다. 10000보다 작거나 같은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.
2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 만약 가능한 n의 골드바흐 파티션이 여러 가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.

*/

/*	 풀이

입력범위의 크기만큼의 boolean배열을 만들어 소수를 판별한다.
두 소수의 차이가 최대한 적어야 하니 입력받은 N을 2로 나눠서 두 변수에 저장한다.
두 변수가 모두 소수이면 StringBuffer에 저장을 하고
둘중 하나라도 소수가 아니면 앞의 수를 -1, 뒤의 수를 +1을 반복한다.


*/