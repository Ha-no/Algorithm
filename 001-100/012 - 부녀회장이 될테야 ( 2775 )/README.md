
***
Notion : [Notion Link](https://west-pineapple-c4d.notion.site/9490de0f65644612968762c8f82c0d15)  
Problem : [Problem Link](https://www.acmicpc.net/problem/2775)
***



<br/>

### ๐ ๋ฌธ์ 

ํ์ ๋ฐ์ํ์ ์ฐธ์ํ๋ ๊ฒ์ ์ข์ํ๋ ์ฃผํฌ๋ ์ด๋ฒ ๊ธฐํ์ ๋ถ๋ํ์ฅ์ด ๋๊ณ  ์ถ์ด ๊ฐ ์ธต์ ์ฌ๋๋ค์ ๋ถ๋ฌ ๋ชจ์ ๋ฐ์ํ๋ฅผ ์ฃผ์ตํ๋ ค๊ณ  ํ๋ค.  

์ด ์ํํธ์ ๊ฑฐ์ฃผ๋ฅผ ํ๋ ค๋ฉด ์กฐ๊ฑด์ด ์๋๋ฐ, โa์ธต์ bํธ์ ์ด๋ ค๋ฉด ์์ ์ ์๋(a-1)์ธต์ 1ํธ๋ถํฐ bํธ๊น์ง ์ฌ๋๋ค์ ์์ ํฉ๋งํผ ์ฌ๋๋ค์ ๋ฐ๋ ค์ ์ด์์ผ ํ๋คโ ๋ ๊ณ์ฝ ์กฐํญ์ ๊ผญ ์งํค๊ณ  ๋ค์ด์์ผ ํ๋ค.  

์ํํธ์ ๋น์ด์๋ ์ง์ ์๊ณ  ๋ชจ๋  ๊ฑฐ์ฃผ๋ฏผ๋ค์ด ์ด ๊ณ์ฝ ์กฐ๊ฑด์ ์งํค๊ณ  ์๋ค๊ณ  ๊ฐ์ ํ์ ๋, ์ฃผ์ด์ง๋ ์์ ์ ์ k์ n์ ๋ํด k์ธต์ nํธ์๋ ๋ช ๋ช์ด ์ด๊ณ  ์๋์ง ์ถ๋ ฅํ๋ผ.  

๋จ, ์ํํธ์๋ 0์ธต๋ถํฐ ์๊ณ  ๊ฐ์ธต์๋ 1ํธ๋ถํฐ ์์ผ๋ฉฐ, 0์ธต์ iํธ์๋ i๋ช์ด ์ฐ๋ค.  

<br/>

### โ์๋ ฅ

์ฒซ ๋ฒ์งธ ์ค์ Test case์ ์ T๊ฐ ์ฃผ์ด์ง๋ค. ๊ทธ๋ฆฌ๊ณ  ๊ฐ๊ฐ์ ์ผ์ด์ค๋ง๋ค ์๋ ฅ์ผ๋ก ์ฒซ ๋ฒ์งธ ์ค์ ์ ์ k, ๋ ๋ฒ์งธ ์ค์ ์ ์ n์ด ์ฃผ์ด์ง๋ค.    

<br/>

### ๐จ์ถ๋ ฅ

๊ฐ๊ฐ์ Test case์ ๋ํด์ ํด๋น ์ง์ ๊ฑฐ์ฃผ๋ฏผ ์๋ฅผ ์ถ๋ ฅํ๋ผ.  

<br/>

### ๐ฅ ์๋ ฅ / ์ถ๋ ฅ ์์ 

#### Input 1
<pre>
2
1
3
2
3
</pre>

#### Output 1
<pre>
6
10
</pre>

<br/>

## ๐ํ์ด

๋จ์ํ๊ฒ ๋ชจ๋  ๊ฒฝ์ฐ์ ์๋ฅผ ๋ด์ ์ ์๋ ํฌ๊ธฐ ( [15][15] )์ ๋ฐฐ์ด์ ์์ฑํ์ฌ, 0์ธต ๋ถํฐ 14์ธต์ 1ํธ~14ํธ์ ๊ฐ ๊ฐ์ ๋ฃ์ด ์ค๋ค.  

์๋ ฅ๋ k, n์ ๋ฐ๋ผ ํด๋น ์ธ๋ฑ์ค์ ๊ฐ์ ๊บผ๋ด์จ๋ค.  
