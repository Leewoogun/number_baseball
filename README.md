# number_baseball
### random 세자릿수 생성
![image](https://user-images.githubusercontent.com/91789276/204091792-d2610b79-e488-4290-bc39-d85f1d7bdb3a.png)

숫자야구에서 컴퓨터가 내는 세자리수 생성이다. 1~9까지 랜덤 숫자를 mutableList에 추가한다.

### input받은 숫자를 mutableList로 만듬
![image](https://user-images.githubusercontent.com/91789276/204091928-7858de95-0234-4108-a5ee-e4726bf69ea3.png)

사용자가 입력한 세자리수를 mutableList로 만드는 과정이다.
아직 입력 데이터를 바로 mutableList로 만드는 방법을 몰라 함수로 구현하였다.

### 볼, 스트라이크 숫자 세기
![image](https://user-images.githubusercontent.com/91789276/204092232-cdbb97f6-0ac3-4a5c-a62e-529741e1962f.png)

위에서 입력받은 random 데이터와 input 데이터의 인덱스를 검사해서 볼인지 스트라이크인지 구분하고 숫자를 세준다.

### 볼, 스트라이크, 낫싱 출력
![image](https://user-images.githubusercontent.com/91789276/204092272-12c1c8b3-30c5-43ca-bccd-f9be560e136a.png)

볼, 스트라이크의 개수가 정해지면 사용자가 input 데이터를 입력했을 때 그에 맞는 볼 스트라이크 낫싱을 출력한다.

### 게임 재시작 or 종료
![image](https://user-images.githubusercontent.com/91789276/204092325-b05d963c-a44c-4d7e-88d0-82d57fcd2f27.png)

3 스트라이크면 게임을 재시작할 것 인지 종료할 것인지 묻고 사용자에 입력에 따라 구현한다.

### main 함수
![image](https://user-images.githubusercontent.com/91789276/204092360-0fcc2df2-4b29-42d9-8873-dcd8b62d77a6.png)

while문으로 3 스트라이크가 나올 때 까지 반복한다.

### 입력 예외처리
![image](https://user-images.githubusercontent.com/91789276/204236268-64452553-4acd-4904-ad2c-8b6bef3be3cb.png)

입력을 문자열로 받아 세자리수가 아닐 시 또는 isdigit()함수를 이용해 문자열이 숫자가 아닐 시 또는 서로 다른 세자리 수가 아닐 시
throw을 통해 IllegalArgumentException을 던지고 프로그램을 종료시킨다.
