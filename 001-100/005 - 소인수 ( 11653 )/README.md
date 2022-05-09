
***
Notion : [Notion Link](https://west-pineapple-c4d.notion.site/785df55eab804e92ba5925f51a2f273a)  
Problem : [Problem Link](https://www.acmicpc.net/problem/11653)
***



<br/>

### 문제

정수 N이 주어졌을 때, 소인수분해하는 프로그램을 작성하시오.  

### 입력

첫째 줄에 정수 N (1 ≤ N ≤ 10,000,000)이 주어진다.  

### 출력

N의 소인수분해 결과를 한 줄에 하나씩 오름차순으로 출력한다. N이 1인 경우 아무것도 출력하지 않는다.  

### 입력 예제

#### 1
<pre>
72
</pre>

#### 2
<pre>
3
</pre>

#### 3
<pre>
9991

</pre>


### 출력 예제

#### 1
<pre>
2
2
2
3
3
</pre>

#### 2
<pre>
3
</pre>

#### 3
<pre>
97
103
</pre>


## 🌈풀이

에라토스테네스의 체 공식을 이용.  

2부터 $\sqrt{n}$ 까지의 수 중 N을 나누어 떨어지는 수들을 모두 출력.  
