
***
Notion : [Notion Link](https://west-pineapple-c4d.notion.site/f9468c6bbb4c4d988c05acc81d0862de)  
Problem : [Problem Link](https://www.acmicpc.net/problem/1018)
***



<br/>

### 문제

지민이는 자신의 저택에서 MN개의 단위 정사각형으로 나누어져 있는 M×N 크기의 보드를 찾았다.  
어떤 정사각형은 검은색으로 칠해져 있고, 나머지는 흰색으로 칠해져 있다.  
지민이는 이 보드를 잘라서 8×8 크기의 체스판으로 만들려고 한다.  

체스판은 검은색과 흰색이 번갈아서 칠해져 있어야 한다.  
구체적으로, 각 칸이 검은색과 흰색 중 하나로 색칠되어 있고, 변을 공유하는 두 개의 사각형은 다른 색으로 칠해져 있어야 한다.  
따라서 이 정의를 따르면 체스판을 색칠하는 경우는 두 가지뿐이다.  
하나는 맨 왼쪽 위 칸이 흰색인 경우, 하나는 검은색인 경우이다.  

보드가 체스판처럼 칠해져 있다는 보장이 없어서, 지민이는 8×8 크기의 체스판으로 잘라낸 후에 몇 개의 정사각형을 다시 칠해야겠다고 생각했다.  
당연히 8*8 크기는 아무데서나 골라도 된다.  
지민이가 다시 칠해야 하는 정사각형의 최소 개수를 구하는 프로그램을 작성하시오.  

### 입력

첫째 줄에 N과 M이 주어진다.  

N과 M은 8보다 크거나 같고, 50보다 작거나 같은 자연수이다.  

둘째 줄부터 N개의 줄에는 보드의 각 행의 상태가 주어진다. B는 검은색이며, W는 흰색이다.  

### 출력

첫째 줄에 지민이가 다시 칠해야 하는 정사각형 개수의 최솟값을 출력한다.  

### 입력 / 출력 예제

#### Input 1
<pre>
8 8
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBBBWBW
WBWBWBWB
BWBWBWBW
WBWBWBWB
BWBWBWBW
</pre>

#### Output 1
<pre>
1
</pre>

***

#### Input 2
<pre>
10 13
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
BBBBBBBBWBWBW
BBBBBBBBBWBWB
WWWWWWWWWWBWB
WWWWWWWWWWBWB
</pre>

#### Output 2
<pre>
12
</pre>

***

#### Input 3
<pre>
9 23
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBB
BBBBBBBBBBBBBBBBBBBBBBW
</pre>

#### Output 3
<pre>
31
</pre>


## 🌈풀이

💡 체스판을 표라고 생각하면 8 * 8 이상의 표이다.

우리가 사용해야 할 표는 8 * 8 의 표이므로 오른쪽과 아래의 각 8칸은 꼭 포함이 되어야 함.

8 * 8 표를 지정하였으면 시작지점을 W, B 로 각각 지정했을 때의 검사를 진행.

앞칸의 문자를 변수에 저장해 놓고 칸이 이동할때 마다 변경 또는 유지.

현재칸의 문자와 변수의 문자가 다르면 넘어가고 같으면 count++

마지막 칸의 문자와 다음줄의 문자가 다르면 count++

모든 경우의 수 중 count가 가장 작은 수를 출력.  
