
/*
	���� : https://www.acmicpc.net/problem/11653
	Ǯ�� ��� : https://www.notion.so/785df55eab804e92ba5925f51a2f273a
*/

package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A05{
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	
    	StringBuffer sb = new StringBuffer();
    	int n = Integer.parseInt( in.readLine() );

    	// N�� 2���� �����µ� ������ ���ڰ� ��Ʈ N������ ����ص� �ȴ�
    	for( int a=2; a<=(int)Math.sqrt( n ); a++ ) {
    		
    		// �������� 0�̸� �μ��̹Ƿ� StringBuffer�� �����ϰ�, N�� a�� ���� ������ ġȯ
    		while( n % a == 0 ) {
    			sb.append( a ).append( "\n" );
    			n /= a;
    		}
    	}
    	
    	// �������� 1�� �ƴϸ� �μ��̹Ƿ� StringBuffer�� �����Ѵ�
    	if( n != 1 ) {
    		sb.append( n );
    	}
    	
    	out.write( sb.toString() );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
}
