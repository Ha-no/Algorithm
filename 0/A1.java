package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A1{
    public static void main(String[] args) throws Exception{

    	// �Է�
    	BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    	// ���
    	BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	
    	// ���ڿ��� ������ �Ǵµ� Default���� ����/��/�ٹٲ� �� �⺻ �����ڰ� ����Ǿ� ������ ��
    	StringTokenizer st = new StringTokenizer( br.readLine() );
    	// ���ڿ��� ���� �� ����ڰ� ������ ����/���ڿ��� ������ ��
    	StringTokenizer st1 = new StringTokenizer( br.readLine(), "T" );
    	// ���ڿ��� ���� �� ����ڰ� ������ ����/���ڿ��� ������ �⺻ �����ڵ�ε� �������� true/false�� �����Ͽ� ������ ��
    	StringTokenizer st2 = new StringTokenizer( br.readLine(), "T", true );
    	
    	// ���ڿ��� ���� ������ int������ ����ȯ
    	int input1 = Integer.parseInt( st.nextToken() );
    	int input2 = 0, input3 = 0;
    	
    	// �޸� ����� ���̱� ���� StringBuffer
    	StringBuffer sb1 = new StringBuffer();
    	
    	for( int i=0; i<input1; i++ ) {
    		
    		// �ٹٲ㼭 �Է��� �� ���� �� ����
    		st = new StringTokenizer( br.readLine() );
    		input2 = Integer.parseInt( st.nextToken() );
    		input3 = Integer.parseInt( st.nextToken() );
    		sb1.append( input2 + input3 ).append( "\n" );
    	}

    	bw.write( sb1.toString() );
    	bw.close();
    	br.close();
    }
}

