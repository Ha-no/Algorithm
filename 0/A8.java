package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A8{
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );

    	StringBuffer sb = new StringBuffer();
    	
    	// N�� �Է� �޾� N������ �� �߿� �Ҽ��� ã�´�
    	int n = Integer.parseInt( in.readLine() );
    	
    	// N���� ������ �ִ� �迭 ���� ( True = �Ҽ�X / False = �Ҽ� )
    	boolean array[] = new boolean[ n + 1 ];
    	
    	// ��Ʈ N * 2 > N �̹Ƿ� ��Ʈ N���� ���� ���� ����θ� ����ص� ����ϴ�
    	int check = (int)Math.sqrt( n );
    	
    	// 2���� �����Ͽ� ��Ʈ N������ ������� �迭���� False�� ġȯ 
    	for( int a=2; a<=check; a++ ) {
    		
    		// array[a]�� �Ҽ��� �ƴϸ�
    		if( !array[a] ) {
    			
    			// a�� ����� ��� ���ڸ� �Ҽ��� �ƴ϶�� ġȯ
        		for( int b=2*a; b<=n; b+=a ) {
        			
        			array[b] = true;
        		}
    		}
    	}
    	
    	// 2���� N������ ��� �Ҽ� ���
    	for( int a=2; a<=n; a++ ) {
    	
    		if( array[a] != true ) { sb.append( a ).append( "\n" ); }
    	}
    	
    	out.write( sb.toString() );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
}
