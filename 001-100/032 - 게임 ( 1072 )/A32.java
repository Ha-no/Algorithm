package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A32 {
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	StringTokenizer st = null;

    	int x = 0, y = 0, z = 0;
    	
    	st = new StringTokenizer( in.readLine() );
    	
    	x = Integer.parseInt( st.nextToken() );
    	y = Integer.parseInt( st.nextToken() );
    	
    	z = getpercent( x, y );
    	
    	if( z > 98 ) { out.write( -1 + "" ); }
    	else {

        	int result = fnc( x, y, z );
        	
        	out.write( result + "" );
    	}
    	
    	out.flush();
    	out.close();
    	in.close();
    }
    
    public static int getpercent( int x, int y ) {
    	
    	// int형의 크기를 넘는 값이 들어오면 원하는 값이 나오지 않으므로 long으로 변환 하고 연산 후 int형으로 바꿔준다.
    	return (int)( ( (long)y * 100 ) / x );
    }
    
    public static int fnc( int x, int y, int z ) {
    	
    	int start = 0, mid = 0, end = x, box = 0;
    	
    	while( start <= end ) {
    		
    		mid = ( start + end ) / 2;
    		
    		if( getpercent( x+mid, y+mid ) == z ) { start = mid + 1; }
    		else {
    			box = mid;
    			end = mid - 1;
    		}
    	}
    	
    	return box;
    }
}
