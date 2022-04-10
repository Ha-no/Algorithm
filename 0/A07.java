package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A07{
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


/*	문제

육각형으로 이루어진 벌집이 있다.
그림에서 보는 바와 같이 중앙의 방 1부터 시작해서 이웃하는 방에 돌아가면서 1씩 증가하는 번호를 주소로 매길 수 있다.
숫자 N이 주어졌을 때, 벌집의 중앙 1에서 N번 방까지 최소 개수의 방을 지나서 갈 때 몇 개의 방을 지나가는지(시작과 끝을 포함하여)를 계산하는 프로그램을 작성하시오.
예를 들면, 13까지는 3개, 58까지는 5개를 지난다.

*/


/*	풀이

한줄이 늘어날때의 패턴을 찾아보니
1
2 ~ 7
8 ~ 19
20 ~ 37
...
의 패턴으로 이루어지는데 마지막 숫자들은 차례로 +6 > +12 > +18의 6의 배수가 더해지는 패턴을 발견할 수 있다.
그러니 범위의 마지막 숫자를 이용해 입력된 수와 비교하면서 진행하면 찾을 수 있다.
*/
