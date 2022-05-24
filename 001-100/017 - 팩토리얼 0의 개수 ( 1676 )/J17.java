package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class J17 {
	
	public static void main(String[] args) throws Exception {
		
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringBuilder output = new StringBuilder();
        
        int n = Integer.parseInt( in.readLine() );
        int count = 0;
        
        while( n >= 5 ) {
        	
        	count += ( n / 5 );
        	n /= 5;
        }

        output.append( count );
        
        out.write( output.toString() );
        
		out.flush();
		out.close();
		in.close();
	}
	
}
