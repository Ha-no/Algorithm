package Algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class A1{
    public static void main(String[] args) throws Exception{

    	// 입력
    	BufferedReader br = new BufferedReader( new InputStreamReader( System.in ) );
    	// 출력
    	BufferedWriter bw = new BufferedWriter( new OutputStreamWriter( System.out ) );
    	
    	// 문자열을 나누게 되는데 Default값은 공백/탭/줄바꿈 등 기본 구분자가 적용되어 나누게 됨
    	StringTokenizer st = new StringTokenizer( br.readLine() );
    	// 문자열을 나눌 때 사용자가 지정한 문자/문자열로 나누게 됨
    	StringTokenizer st1 = new StringTokenizer( br.readLine(), "T" );
    	// 문자열을 나눌 때 사용자가 지정한 문자/문자열을 나누고 기본 구분자들로도 나눌지를 true/false로 적용하여 나누게 됨
    	StringTokenizer st2 = new StringTokenizer( br.readLine(), "T", true );
    	
    	// 문자열로 읽은 내용을 int형으로 형변환
    	int input1 = Integer.parseInt( st.nextToken() );
    	int input2 = 0, input3 = 0;
    	
    	// 메모리 사용을 줄이기 위한 StringBuffer
    	StringBuffer sb1 = new StringBuffer();
    	
    	for( int i=0; i<input1; i++ ) {
    		
    		// 줄바꿔서 입력할 때 마다 재 선언
    		st = new StringTokenizer( br.readLine() );
    		input2 = Integer.parseInt( st.nextToken() );
    		input3 = Integer.parseInt( st.nextToken() );
    		sb1.append( input2 + input3 ).append( "\n" );
    	}

    	bw.write( sb1.toString() );
    	bw.close();
    	br.close();
    }
}

