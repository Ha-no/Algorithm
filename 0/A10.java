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

/*	 ����

�������� ����

1���� ū �ڿ��� �߿���  1�� �ڱ� �ڽ��� ������ ����� ���� �ڿ����� �Ҽ���� �Ѵ�. ���� ���, 5�� 1�� 5�� ������ ����� ���� ������ �Ҽ��̴�. ������, 6�� 6 = 2 �� 3 �̱� ������ �Ҽ��� �ƴϴ�.
�������� ������ ������ �������� ���ذ� ������, 2���� ū ��� ¦���� �� �Ҽ��� ������ ��Ÿ�� �� �ִٴ� ���̴�. �̷��� ���� ������ ����� �Ѵ�. ��, ¦���� �� �Ҽ��� ������ ��Ÿ���� ǥ���� �� ���� ������ ��Ƽ���̶�� �Ѵ�. ���� ���, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 14 = 7 + 7�̴�. 10000���� �۰ų� ���� ��� ¦�� n�� ���� ������ ��Ƽ���� �����Ѵ�.
2���� ū ¦�� n�� �־����� ��, n�� ������ ��Ƽ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. ���� ������ n�� ������ ��Ƽ���� ���� ������ ��쿡�� �� �Ҽ��� ���̰� ���� ���� ���� ����Ѵ�.

*/

/*	 Ǯ��

�Է¹����� ũ�⸸ŭ�� boolean�迭�� ����� �Ҽ��� �Ǻ��Ѵ�.
�� �Ҽ��� ���̰� �ִ��� ����� �ϴ� �Է¹��� N�� 2�� ������ �� ������ �����Ѵ�.
�� ������ ��� �Ҽ��̸� StringBuffer�� ������ �ϰ�
���� �ϳ��� �Ҽ��� �ƴϸ� ���� ���� -1, ���� ���� +1�� �ݺ��Ѵ�.


*/