
***
Notion : [Notion Link](https://west-pineapple-c4d.notion.site/0-d5b29c7eee494d59a90baedf1bc6ee5d)  
Problem : [Problem Link](https://www.acmicpc.net/problem/1676)
***



<br/>

### 📋 문제

N!에서 뒤에서부터 처음 0이 아닌 숫자가 나올 때까지 0의 개수를 구하는 프로그램을 작성하시오.  
 
<br/>

### ✒ 입력

첫째 줄에 N이 주어진다. (0 ≤ N ≤ 500)  

<br/>

### 🖨 출력

첫째 줄에 구한 0의 개수를 출력한다.  

<br/>

### 🖥 입력 / 출력 예제

#### Input 1
<pre>
10
</pre>

#### Output 1
<pre>
2
</pre>

***

#### Input 2
<pre>
3
</pre>

#### Output 2
<pre>
0
</pre>

<br/>

## 🌈풀이

뒷자리가 0으로 끝나는 수는 반드시 10의 배수이다.  

숫자 10은 소인수로 2와 5를 갖는데, 모든 수는 5보다 2의 개수가 더 많기 때문에 전체 n의 소인수 중 5의 제곱수를 찾으면 되는 문제이다.  

ex)  3000 = 5^3 * 3^1 * 2^3  
