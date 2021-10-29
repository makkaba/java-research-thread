
쓰레드-safe 테스트를 위해서 2가지 케이스를 작성하였다 

- UnsafeSequence.java  
-> 공유 자원에 대해서 보호가 되지 않으므로 일정하지 않은 결과가 나옴
- SafeSequence.java  
-> 공유 자원에 대한 접근에 제한이 있으므로 일정한 결과(safe한 결과)가 나옴 

