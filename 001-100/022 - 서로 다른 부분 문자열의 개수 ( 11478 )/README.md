
***
Notion : [Notion Link](https://west-pineapple-c4d.notion.site/10d49709624842b7bf46c76d2c5a2614)  
Problem : [Problem Link](https://www.acmicpc.net/problem/11478)
***



<br/>

### 📋 문제

문자열 S가 주어졌을 때, S의 서로 다른 부분 문자열의 개수를 구하는 프로그램을 작성하시오.  

부분 문자열은 S에서 연속된 일부분을 말하며, 길이가 1보다 크거나 같아야 한다.  

예를 들어, ababc의 부분 문자열은 a, b, a, b, c, ab, ba, ab, bc, aba, bab, abc, abab, babc, ababc가 있고, 서로 다른것의 개수는 12개이다.  

<br/>

### ✒입력

첫째 줄에 문자열 S가 주어진다.  
S는 알파벳 소문자로만 이루어져 있고, 길이는 1,000 이하이다.  

<br/>

### 🖨출력

첫째 줄에 S의 서로 다른 부분 문자열의 개수를 출력한다.   

<br/>

### 🖥 입력 / 출력 예제

#### Input 1
<pre>
ababc
</pre>

#### Output 1
<pre>
12
</pre>

<br/>

## 🌈풀이

시간이 중요한 문제이므로 List가 아닌 HashSet을 이용하여야 한다.  

문자열은 substring( a, b ) 함수를 이용하여 구분한 후, 중복값을 허용하지 않는 Set의 성질을 이용해 모든 부분 문자열을 넣는다.  
