# 시스템 요구사항
1. 엄마는 씻기기, 우유 먹이기, 침대에 눕히기, 동화책 읽어주기를 할 수 있다.
2. 아기는 씻기, 우유 먹기, 동화책 읽기, 침대에 눕기, 자기를 할 수 있다.
3. 주어진 역할은 모두 한번씩 수행해야 한다.
4. 아기는 아직 아무것도 하지 않은 상태이다.
5. 아기는 더럽기 때문에 씻기 전에는 우유를 먹거나, 침대에 눕거나, 동화책을 읽을 수 없다.
6. 아기는 배가 고프기 때문에, 우유를 먹기 전에는 침대에 눕거나, 동화책을 읽을 수 없다.
7. 아기는 침대에서 동화책 읽는 것을 좋아하기 때문에, 침대에 눕지 않을 경우 동화책을 읽을 수 없다.
6. 정해진 순서를 어길 경우 이전 과정을 진행하고 올 것을 안내한다.
7. 주어진 역할을 모두 수행하면 아기는 자연스럽게 잠에 든다.


# 필요한 객체
엄마, 아기


# 상호작용
- 엄마가 수신할 수 있는 메시지 (엄마가 해야 하는 일)
1. 씻겨라
2. 우유를 먹여라
3. 침대에 눕혀라
4. 동화책을 읽어줘라

- 아기가 수신할 수 있는 메시지 (아들이 해야 하는 일)
1. 씻어라
2. 우유를 먹어라
3. 침대에 누워라
4. 동화책을 읽어라

# 클래스 설계하기
1. 씻기기
엄마 > 씻겨라 > 아기 > 씻어라

2. 우유 먹이기
엄마 > 우유 먹이기 > 아기 > 우유 먹기

3. 침대에 눕히기
엄마 > 침대에 눕히기 > 아기 > 침대에 눕기

4. 동화책 읽기
엄마 > 동화책 읽어주기 > 아기 > 동화책 읽기