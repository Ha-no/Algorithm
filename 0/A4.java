package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A4{

	static int d( int n ) {
		
		int second = 0, sum = n;
		
		while( n != 0 ) {
			second = n % 10;
			sum += second;
			n /= 10;
		}
		return sum;
	}
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );

    	int check[] = new int[10001];
    	StringBuffer sb = new StringBuffer();
    	
    	for( int a=0; a<10000; a++ ) {
    	
    		int result = d(a);
    		
    		if( result <= 10000 ) { check[ result ] = 1; }
    	}
    	
    	for( int a=0; a<10000; a++ ) {
    		
    		if( check[a] != 1 ) { sb.append( a ).append( "\n" ); }
    	}
    		
    	out.write( sb.toString() );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
}

/*	���� 

���� �ѹ��� 1949�� �ε� ������ D.R. Kaprekar�� �̸� �ٿ���. ���� ���� n�� ���ؼ� d(n)�� n�� n�� �� �ڸ����� ���ϴ� �Լ���� ��������. ���� ���, d(75) = 75+7+5 = 87�̴�.
���� ���� n�� �־����� ��, �� ���� �����ؼ� n, d(n), d(d(n)), d(d(d(n))), ...�� ���� ���� ������ ���� �� �ִ�. 
���� ���, 33���� �����Ѵٸ� ���� ���� 33 + 3 + 3 = 39�̰�, �� ���� ���� 39 + 3 + 9 = 51, ���� ���� 51 + 5 + 1 = 57�̴�. �̷������� ������ ���� ������ ���� �� �ִ�.
33, 39, 51, 57, 69, 84, 96, 111, 114, 120, 123, 129, 141, ...
n�� d(n)�� �����ڶ�� �Ѵ�. ���� �������� 33�� 39�� �������̰�, 39�� 51�� ������, 51�� 57�� �������̴�. �����ڰ� �� ������ ���� ��쵵 �ִ�. ���� ���, 101�� �����ڰ� 2��(91�� 100) �ִ�. 
�����ڰ� ���� ���ڸ� ���� �ѹ���� �Ѵ�. 100���� ���� ���� �ѹ��� �� 13���� �ִ�. 1, 3, 5, 7, 9, 20, 31, 42, 53, 64, 75, 86, 97
10000���� �۰ų� ���� ���� �ѹ��� �� �ٿ� �ϳ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
*/
 

/*	Ǯ��

d(n) �Լ��� �ܼ��� n�� n�� ���ڸ����� ���� ���� ���ϴ� �Լ� �̴�.
d(n)�� �Լ����� ���Ŀ� ���� ������� ������ �����ڰ� �����Ѵٴ� �ǹ��̹Ƿ� d(n)�Լ����� ��������� ���� �������� ���� ���� �ѹ��̴�.

*/
