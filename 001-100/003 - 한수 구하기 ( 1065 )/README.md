
***
Notion : [Notion Link](https://west-pineapple-c4d.notion.site/e38ece7655884e53b2e3cdc4f4d0eb64)  
Problem : [Problem Link](https://www.acmicpc.net/problem/1065)
***



<br/>

### 📋 문제

어떤 양의 정수 X의 각 자리가 등차수열을 이룬다면, 그 수를 한수라고 한다. 등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다.  

N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오.  

<br/>

### ✒ 입력

첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.  

<br/>

### 🖨 출력

첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.  

<br/>

### 🖥 입력 / 출력 예제

#### Input 1
<pre>
110
</pre>

#### Output 1
<pre>
99
</pre>

***

#### Input 2
<pre>
1
</pre>

#### Output 2
<pre>
1
</pre>

***

#### Input 3
<pre>
210
</pre>

#### Output 3
<pre>
105
</pre>

<br/>

## 🌈풀이
100 미만의 자연수는 모두 한수이므로 100이상의 자연수에서만 한수에 대한 검사를 실시.  

자연수 1000은 한수가 아니므로 1000이 입력되면 999를 입력되었다고 해도 무방함.  

각 자리수의 값을 꺼내서 비교  
