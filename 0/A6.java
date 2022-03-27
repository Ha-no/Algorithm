package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class A6{
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );

    	int array[] = new int[10];
    	char array2[] = new char[10];
    	double array3[] = new double[10];
    	
    	// 배열의 초기값 설정 for문보다 빠름
    	Arrays.fill( array, -1 );
    	Arrays.fill( array2, 'a' );
    	Arrays.fill( array3, 0.5 );
    	
    	for( int a=0; a<array.length; a++ ) {
    		
    		out.write( array[a] + " " );
    	}

    	out.write( "\n" );
    	
    	for( int a=0; a<array2.length; a++ ) {
    		
    		out.write( array2[a] + " " );
    	}

    	out.write( "\n" );
    	
    	for( int a=0; a<array3.length; a++ ) {
    		
    		out.write( array3[a] + " " );
    	}
    	
    	out.flush();
    	out.close();
    	in.close();
    }
}
