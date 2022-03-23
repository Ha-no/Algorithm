import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A1{
    public static void main(String[] args) throws Exception{

    	BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    	BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	StringTokenizer st = new StringTokenizer( br.readLine() );
    	
    	int input1 = Integer.parseInt( st.nextToken() );
    	int input2 = 0, input3 = 0;
    	StringBuffer sb1 = new StringBuffer();
    	
    	for( int i=0; i<input1; i++ ) {
    		st = new StringTokenizer( br.readLine() );
    		input2 = Integer.parseInt( st.nextToken() );
    		input3 = Integer.parseInt( st.nextToken() );
    		sb1.append( input2 + input3 ).append( "\n" );
    	}

    	bw.write( sb1.toString() );
    	bw.close();
    }
}

