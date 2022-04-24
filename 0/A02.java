
/*
	Ǯ�� ��� : https://www.notion.so/BufferedWriter-int-9eedcb628f784eccbe1377fee9d2f6c6
*/

package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A02 {
    public static void main(String[] args) throws Exception{

    	BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	
    	int input1 = Integer.parseInt( br.readLine() );
    	
    	for( int i=1; i<=input1; i++ ) {
    		
    		// BufferedWriter �� int���� ����ϱ� ���ؼ���
    		// 1. String.valueOf( i );
    		// 2. StringBuffer sb1; �� sb1.toString();
    		// 3. int�� + ������ = ������ �� �̿�
    		bw.write( i + "\n" );
    	}

		bw.flush();
    	bw.close();
    	br.close();
    }
}