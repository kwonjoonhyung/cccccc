package hello.core.order;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class OrderServiceTest {

    MemberService memberService = new MemberServiceImpl();
    OrderService orderService = new OrderServiceImpl(null, null);

    @Test
    void createOrder(){
        Long memberId = 1L;
        Member member = new Member(memberId, "Kwon", Grade.VIP);
        memberService.join(member);
        Order order = orderService.createOrder(memberId, "pencil", 10000);
        Assertions.assertThat(order.calculatePrice()).isEqualTo(9000);

    }
}
