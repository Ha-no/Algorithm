package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A19 {
	
    static BufferedWriter out;
	
	public static void main(String[] args) throws Exception {

		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
		out = new BufferedWriter( new OutputStreamWriter( System.out ) );
        
        int n = Integer.parseInt( in.readLine() );
        
        // �ű� Ƚ��
        int k = (int)Math.pow( 2, n ) -1;

        out.write( k + "\n" );
        
        hanoi( n, 1, 2, 3 );
        
		out.flush();
		out.close();
		in.close();
	}
	
	static void hanoi( int n, int go, int center, int to ) throws Exception {
		
		if( n == 1 ) {
			
			out.write( go + " " + to + "\n" );
			return;
		}

		// A -> B �� n-1 �̵�
		hanoi( n-1, go, to, center );

		// A -> C �� ����ū ���� �̵�
		out.write( go + " " + to + "\n" );
		
		// B -> C �� n-1 �̵�
		hanoi( n-1, center, go, to );
		
	}
}

