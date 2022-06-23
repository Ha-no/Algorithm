
***
Notion : [Notion Link](https://west-pineapple-c4d.notion.site/N-Queen-d65e2625e2574f8aa02ca9c3bafbb978)  
Problem : [Problem Link](https://www.acmicpc.net/problem/9663)
***



<br/>

### 📋 문제

N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.  

N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.  

<br/>

### ✒입력

첫째 줄에 N이 주어진다. (1 ≤ N < 15)  

<br/>

### 🖨출력

첫째 줄에 퀸 N개를 서로 공격할 수 없게 놓는 경우의 수를 출력한다.  

<br/>

### 🖥 입력 / 출력 예제

#### Input 1
<pre>
8
</pre>

#### Output 1
<pre>
92
</pre>

<br/>

## 🌈풀이

N * N 크기의 체스판에서 퀸은 가로 세로 대각선 방향으로 원하는 만큼 갈 수 있다.  

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/06665787-93aa-4339-8626-0a8091db440f/Untitled.png)  

우리는 여기서 2차원 배열과 같은 체스판을 1차원 배열로 만들 수 있는데  int[ 열 ] = 행  과 같은 형태이다.  

이 1차원 배열을 이용해서 문제를 풀어나갈 것이다.  

우선 체스판의 첫 열부터 시작하여 퀸을 놔둘 수 있는 칸인가를 검사 후 가능한 칸이면 놔두고 다음 열로 넘어가는데 이때 DFS를 이용한다.  

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/9aadbc1f-1485-4122-95ea-be30d2988b4b/Untitled.png)  

먼저 첫번째 칸에 퀸을 둔다고 가정하면 당연히 놔둘 수 있으므로 위 사진은 int[ 0 ] = 0 의 형태이다.  

그 다음 깊이로 넘어가는데  

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/3d278d20-ce11-4e54-8816-c72f8d3f3e16/Untitled.png)  

놔둘 수 있는 가장 앞의 위치부터 놓으며 DFS가 진행이 된다.  

위 사진은 int[ 0 ] = 0 , int[ 1 ] = 2 인 상태이다.  

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/a6adf874-93fe-4426-97f5-94dbe3220920/Untitled.png)  

같은 방식으로 진행하여   

int[ 0 ] = 0, int[ 1 ] = 2, int[ 2 ] = 4 인 상태이다.  

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/ca9f00e0-30d4-49f7-8fe4-7b28fad286b1/Untitled.png)  

int[ 0 ] = 0, int[ 1 ] = 2, int[ 2 ] = 4, int[ 3 ] = 1  

![Untitled](https://s3-us-west-2.amazonaws.com/secure.notion-static.com/6940d46e-6eed-4fb7-b92a-3e96b9d29e5b/Untitled.png)  

int[ 0 ] = 0, int[ 1 ] = 2, int[ 2 ] = 4, int[ 3 ] = 1, int[ 4 ] = 3  

이렇게 깊이가 끝까지 오게되면 count를 한 다음 바로 앞 재귀로 넘어가 놓을 수 있는지 검사하면서 처음으로 돌아간다.  
