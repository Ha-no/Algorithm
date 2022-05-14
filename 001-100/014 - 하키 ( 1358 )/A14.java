package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A14 {
		
	static int count = 0;
	static int w, h, x, y;
	
	public static void main( String args[] ) throws Exception {
		
		BufferedReader in = new BufferedReader( new InputStreamReader( System.in ) );
		BufferedWriter out = new BufferedWriter( new OutputStreamWriter( System.out ) );
		
		StringTokenizer st = new StringTokenizer( in.readLine() );
		
		StringBuilder output = new StringBuilder();
		
		w = Integer.parseInt( st.nextToken() );
		h = Integer.parseInt( st.nextToken() );
		x = Integer.parseInt( st.nextToken() );
		y = Integer.parseInt( st.nextToken() );
		int p = Integer.parseInt( st.nextToken() );
		int a = 0, b = 0;
		
		while( p --> 0 ) {
			
			st = new StringTokenizer( in.readLine() );
			
			a = Integer.parseInt( st.nextToken() );
			b = Integer.parseInt( st.nextToken() );
			
			area( a, b );
		}
		
		output.append( count );
		
		out.write( output.toString() );
		
		out.flush();
		out.close();
		in.close();
	}
	
	static void area( int a, int b) {

		if( x <= a && a <= (x+w) && y <= b && b <= (y+h) ) { count++; }
		else {
			int range1 = 0, range2 = 0, box = y + (h/2);
			
			range1 = (int)( Math.pow( (x-a), 2 ) + Math.pow( (box-b), 2 ) );
			range2 = (int)( Math.pow( (x+w-a), 2 ) + Math.pow( (box-b), 2 ) );
			
			box = (h/2) * (h/2);
			
			if( range1 <= box || range2 <= box ) { count++; }
		}
	}
}
