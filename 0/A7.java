package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A7{
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


/*	����

���������� �̷���� ������ �ִ�.
�׸����� ���� �ٿ� ���� �߾��� �� 1���� �����ؼ� �̿��ϴ� �濡 ���ư��鼭 1�� �����ϴ� ��ȣ�� �ּҷ� �ű� �� �ִ�.
���� N�� �־����� ��, ������ �߾� 1���� N�� ����� �ּ� ������ ���� ������ �� �� �� ���� ���� ����������(���۰� ���� �����Ͽ�)�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
���� ���, 13������ 3��, 58������ 5���� ������.

*/


/*	Ǯ��

������ �þ���� ������ ã�ƺ���
1
2 ~ 7
8 ~ 19
20 ~ 37
...
�� �������� �̷�����µ� ������ ���ڵ��� ���ʷ� +6 > +12 > +18�� 6�� ����� �������� ������ �߰��� �� �ִ�.
�׷��� ������ ������ ���ڸ� �̿��� �Էµ� ���� ���ϸ鼭 �����ϸ� ã�� �� �ִ�.
*/