
/*
	���� : https://www.acmicpc.net/problem/2981
	Ǯ�� ��� : https://www.notion.so/f85b8cb1a0c24e7bb21c9bf62668ef00
*/

package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class A10{
	
	static int n;
	static int array[];
	
    public static void main(String[] args) throws Exception{
    	
    	input();
    	solve();
    	
    }
    
    // �ִ� ����� �Լ�
    static int fnc( int a, int b ) {
    	
    	while( b != 0 ) {
    		
    		int box = a % b;
    		a = b;
    		b = box;
    	}
    	
    	return a;
    }
    
    // �Է� �Լ�
    static void input() throws Exception {

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	
    	n = Integer.parseInt( in.readLine() );
    	array = new int [n];
    	
    	for( int a=0; a<n; a++ ) {
    		array[a] = Integer.parseInt( in.readLine() );
    	}
    	
    	in.close();
    }
    
    // �ذ� �Լ�
    static void solve() {
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	StringBuilder output = new StringBuilder();
    	
    	int max = 0;
    	
    	// Math.abs()�� �����ϱ� ���� ����
    	Arrays.sort( array );
    	
    	max = array[1] - array[0];
    	
    	// 0-1 / 1-2 / 2-3 / ... �� ������ �ִ� ����� ���ϱ�
    	for( int a=2; a<n; a++ ) {

    		max = fnc( max, array[a] - array[a-1] );
    	}
    	
    	// �ִ� ������� ����� ���ϱ�
    	// ������� ��Ʈn�� ���� �����Ƿ� Math.sqrt() ���
    	for( int a=2; a<=Math.sqrt( max ); a++ ) {
    		
    		// �ߺ������� ���� �������� ���� ó��
    		if( a * a == max ) { list.add( a ); }
    		// ��� ��� ����
    		// ���Խ� a�Ӹ� �ƴ϶� a�� ���� �� ����
    		else if( max % a == 0 ) {
    			list.add( a );
    			list.add( max / a );
    		}
    	}

    	// ArrayList<>() ����
    	Collections.sort( list );
    	
    	for( int a : list ) {
    		output.append( a ).append( " " );
    	}
    	output.append( max );
    	
    	System.out.println( output );
    }
}
