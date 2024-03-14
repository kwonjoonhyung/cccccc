package hello.core;

import hello.core.member.*;
import hello.core.order.Order;
import hello.core.order.OrderService;

public class OrderApp {
    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Member member = new Member(1L, "Kwon", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(member.getId(), "MacBook", 25000);
        System.out.println(order);
    }
}
