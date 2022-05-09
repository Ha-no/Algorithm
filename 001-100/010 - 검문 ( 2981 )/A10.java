
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
    
    // 최대 공약수 함수
    static int fnc( int a, int b ) {
    	
    	while( b != 0 ) {
    		
    		int box = a % b;
    		a = b;
    		b = box;
    	}
    	
    	return a;
    }
    
    // 입력 함수
    static void input() throws Exception {

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	
    	n = Integer.parseInt( in.readLine() );
    	array = new int [n];
    	
    	for( int a=0; a<n; a++ ) {
    		array[a] = Integer.parseInt( in.readLine() );
    	}
    	
    	in.close();
    }
    
    // 해결 함수
    static void solve() {
    	
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	StringBuilder output = new StringBuilder();
    	
    	int max = 0;
    	
    	// Math.abs()를 생략하기 위해 정렬
    	Arrays.sort( array );
    	
    	max = array[1] - array[0];
    	
    	// 0-1 / 1-2 / 2-3 / ... 의 값들의 최대 공약수 구하기
    	for( int a=2; a<n; a++ ) {

    		max = fnc( max, array[a] - array[a-1] );
    	}
    	
    	// 최대 공약수의 공약수 구하기
    	// 공약수는 루트n을 넘지 않으므로 Math.sqrt() 사용
    	for( int a=2; a<=Math.sqrt( max ); a++ ) {
    		
    		// 중복방지를 위해 제곱근은 따로 처리
    		if( a * a == max ) { list.add( a ); }
    		// 약수 모두 삽입
    		// 삽입시 a뿐만 아니라 a로 나눈 몫도 삽입
    		else if( max % a == 0 ) {
    			list.add( a );
    			list.add( max / a );
    		}
    	}

    	// ArrayList<>() 정렬
    	Collections.sort( list );
    	
    	for( int a : list ) {
    		output.append( a ).append( " " );
    	}
    	output.append( max );
    	
    	System.out.println( output );
    }
}
