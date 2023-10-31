package com.example.objectTDDStudy.day1;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@SpringBootTest
class ObjectTddStudyApplicationTests {

// sut : system under test -> 테스트할 대상체를 의미함
// actual : sut가 행동 나온 결과물 -> sut가 잘 행동했는 지, 단언문으로 검증하는 것을 의미함
	@Test
	void 키오스크는_카드를_이벽하면_주문서가_나온다() {
		Kiosk sut = new Kiosk();
		Order actual = sut.input(new Card());
		assertThat(actual).isNotNull();
	}

	@Test
	void 점원은_주문서로_커피를_만든다() {
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		Barista sut = new Barista(coffeeMaker);

		Coffee actual = sut.order(new Order());
		assertThat(actual).isNotNull();
	}
}
