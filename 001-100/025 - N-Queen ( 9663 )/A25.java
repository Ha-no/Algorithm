package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class A25 {
	
	public static int[] array;
	public static int n, count;
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	
    	n = Integer.parseInt( in.readLine() );
    	
    	array = new int[n];
    	
    	nqueen( 0 );
    	
    	out.write( count + "" );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
    
    public static void nqueen( int depth ) {
    	
    	if( depth == n ) {
    		
    		count++;
    		return;
    	}
    	
    	for( int a=0; a<n; a++ ) {
    		
    		array[depth] = a;
    		
    		if( check( depth ) ) { nqueen( depth+1 ); }
    	}
    }
    
    // 놓을 수 있는지 없는지 검사하는 함수
    public static boolean check( int value ) {
    
    	for( int a=0; a<value; a++ ) {
    		
    		// 입력값 이전칸의 퀸들과 현재 퀸이 같은 행( 일직선 )에 있는지 검사
    		if( array[value] == array[a] ) { return false; }
    		// 입력값 이전칸의 퀸들과 현재 퀸이 같은 대각선에 있는지 검사
    		else if( Math.abs( value - a ) == Math.abs( array[value] - array[a] ) ) { return false; }
    	}
    	
    	return true;
    }
}