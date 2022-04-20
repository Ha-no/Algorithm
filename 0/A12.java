package Algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class A12{
	
	public static boolean[] array = new boolean[20001];
	
    public static void main(String[] args) throws Exception{
    	
    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );

    	StringBuilder output = new StringBuilder();
    	
    	int n = Integer.parseInt( in.readLine() );
    	
    	int input = 0, max = 0, rmax = 0, rmin = 8001, idx = 0, flag = 0, mflag = 0;
    	int avg = 0, median = 0, mode = 0, range = 0, count = 0;
    	
    	int check[] = new int[ 80001 ];
    	
    	for( int a=0; a<n; a++ ) {
    		input = Integer.parseInt( in.readLine() );
    		
    		check[ input + 4000 ]++;
    		avg += input;
    	}
    	
    	for( int a=0; a<check.length; a++ ) {
    		
    		if( check[a] > 0 ) {
    			
    			count += check[a];
    			
    			// Áß¾Ó°ª
    			if( mflag == 0 ) {
    				if( count >= Math.round( (double)n / 2 ) ) {
        				median = a - 4000;
        				mflag++;
        			}
    			}
    			
    			// ÃÖºó°ª
    			if( idx == check[a] ) {
    				idx = check[a];
    				max = a - 4000;
    				flag++;
    				if( flag == 1 ) { mode = max; }
    				
    			} else if( idx < check[a] ) {
    				idx = check[a];
    				max = a - 4000;
    				flag = 0;
    			}
    			
    			// ¹üÀ§ °è»êÀ» À§ÇÑ max / min
    			if( rmin > a ) { rmin = a - 4000; }
    			if( rmax < a ) { rmax = a - 4000; }
    		}
    	}

    	// Æò±Õ
    	avg = Math.round( avg / (float)n );
    	
    	range = rmax - rmin;

    	if( flag == 0 ) { mode = max; }
    	
    	output.append( avg ).append( "\n" ).append( median ).append( "\n" );

    	output.append( mode ).append( "\n" ).append( range );
    	
    	System.out.println( output );
    	
    	in.close();    	
    }
}

/*
	https://www.acmicpc.net/problem/2108
*/
