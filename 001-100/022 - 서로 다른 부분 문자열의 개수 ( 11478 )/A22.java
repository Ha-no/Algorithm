package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashSet;
import java.util.Set;

public class A22{
	
    public static void main(String[] args) throws Exception{

    	BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	
    	Set<String> set = new HashSet<String>();
    	
    	String input = in.readLine();
    	
    	for( int a=0; a<=input.length(); a++ ) {
    		for( int b=a+1; b<=input.length(); b++ ) {

    			set.add( input.substring( a, b ) );
    		}
    	}
    	
    	out.write( set.size() + "" );
    	
    	out.flush();
    	out.close();
    	in.close();
    }
}
