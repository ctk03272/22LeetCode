### 회고
- 처음에는 while문을 계속 돌면서 풀었는데 그럴경우 시간복잡도가 너무 안좋았다.
-  그래서 방법을 바꿨다. rotate를 할 때 유지되려면, s를 2배 반복하여 그 s안에 goal이 있는지 찾으면 된다. 굳이 while문을 다 돌 필요가 없다.