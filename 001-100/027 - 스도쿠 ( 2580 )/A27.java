package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A27 {
	
	public static int[][] array = new int[9][9];
	public static int end = 0;
	public static StringBuilder output = new StringBuilder();
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	StringTokenizer st = null;
    	
    	for( int a=0; a<9; a++ ){
    		
    		st = new StringTokenizer( in.readLine() );
    		
    		for( int b=0; b<9; b++ ) {
    			
    			array[a][b] = Integer.parseInt( st.nextToken() );
    		}
    	}
    	
    	fnc( 0, 0 );
    	
    	out.write( output.toString() );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
    
    public static void fnc( int row, int col ) {
    	
    	if( end == 1 ) { return; }
    	
    	if( col == 9 ) {
    		
    		fnc( row+1, 0 );
    		return;
    	}
    	
    	if( row == 9 ) {
    		
    		for( int a=0; a<9; a++ ) {
    			for( int b=0; b<9; b++ ) {
    				
    				output.append( array[a][b] ).append( " " );
    			}
    			output.append( "\n" );
    		}
    		
    		end = 1;
    		return;
    	}
    	
    	if( array[row][col] == 0 ) {
    		
    		for( int a=1; a<10; a++ ) {
    			
    			if( check( row, col, a ) ) {
    				
    				array[row][col] = a;
    				fnc( row, col+1 );
    			}
    		}
    		
    		array[row][col] = 0;
    		return;
    	}
    	
    	fnc( row, col+1 );
    }
    
    public static boolean check( int row, int col, int value ) {
    	
    	for( int a=0; a<9; a++ ) {
    		
    		// 같은 행, 열에 존재하는지 검사
    		if( array[row][a] == value || array[a][col] == value ) { return false; }
    	}
    	
    	// 3x3 안에 존재하는지 검사
    	int cr = ( row / 3 ) * 3;
    	int cc = ( col / 3 ) * 3;
    	
    	for( int a=cr; a<cr+3; a++ ) {
    		for( int b=cc; b<cc+3; b++ ) {
    			
    			if( array[a][b] == value ) { return false; } 
    		}
    	}
    	
    	return true;
    }
}
