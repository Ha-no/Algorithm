
***
Notion : [Notion Link](https://west-pineapple-c4d.notion.site/f35d5feb8d774e2aaa96b995618f48cc)  
Problem : [Problem Link](https://www.acmicpc.net/problem/1002)
***



<br/>

### 📋 

![img](https://user-images.githubusercontent.com/97273652/167371276-48b2da2e-08f9-4385-96d6-969f1a2a879c.jpg)

조규현과 백승환은 터렛에 근무하는 직원이다.  
하지만 워낙 존재감이 없어서 인구수는 차지하지 않는다. 위는 조규현과 백승환의 사진이다.  

이석원은 조규현과 백승환에게 상대편 마린(류재명)의 위치를 계산하라는 명령을 내렸다.  
조규현과 백승환은 각각 자신의 터렛 위치에서 현재 적까지의 거리를 계산했다.  

조규현의 좌표 (x1, y1)와 백승환의 좌표 (x2, y2)가 주어지고,  
조규현이 계산한 류재명과의 거리 r1과 백승환이 계산한 류재명과의 거리 r2가 주어졌을 때,  
류재명이 있을 수 있는 좌표의 수를 출력하는 프로그램을 작성하시오.  

<br/>

### ✒입력

첫째 줄에 테스트 케이스의 개수 T가 주어진다.  
각 테스트 케이스는 다음과 같이 이루어져 있다.  

한 줄에 x1, y1, r1, x2, y2, r2가 주어진다.  

x1, y1, x2, y2는 -10,000보다 크거나 같고, 10,000보다 작거나 같은 정수이고,  
r1, r2는 10,000보다 작거나 같은 자연수이다.  

<br/>

### 🖨출력

각 테스트 케이스마다 류재명이 있을 수 있는 위치의 수를 출력한다.  
만약 류재명이 있을 수 있는 위치의 개수가 무한대일 경우에는 -1을 출력한다.  

<br/>

### 🖥 입력 / 출력 예제

#### Input 1
<pre>
3
0 0 13 40 0 37
0 0 3 0 7 4
1 1 1 1 1 5
</pre>

#### Output 1
<pre>
2
1
0
</pre>

<br/>

## 🌈풀이
![1-1](https://user-images.githubusercontent.com/97273652/167371718-00a8870d-8810-4584-a899-ef0b66842c6e.png)
![1-2](https://user-images.githubusercontent.com/97273652/167371728-dcc33679-c537-4a57-bb10-ecf3416f92d2.png)
![1-3](https://user-images.githubusercontent.com/97273652/167371733-28fea26c-dc83-4a50-ab76-6c6f778613c0.png)
![1-4](https://user-images.githubusercontent.com/97273652/167371742-5fee3482-ee2a-4b50-a37a-4e0560c6efd7.png)
![1-5](https://user-images.githubusercontent.com/97273652/167371748-a8a77575-aead-436b-8311-917ac5c78294.png)
![1-6](https://user-images.githubusercontent.com/97273652/167371754-c9675d2b-fec5-43aa-ab91-903690d5d788.png)

이 문제는 간단한 두 원의 접점을 찾는 문제임.  

위의 사진은 모든 경우의 수를 보여줌.  

사진들을 차례로 코드로 구성해 놓음.  

두 점의 거리 공식은 sqrt{(x1-x2)^2 + (y1-y2)^2} = r 이지만,  
제곱근 계산을 생략하기 위해 (x1-x2)^2 + (y1-y2)^2 = r^2 의 형태로 사용  
