package hello.core;

import hello.core.discount.member.Grade;
import hello.core.discount.member.Member;
import hello.core.discount.member.MemberService;
import hello.core.discount.member.MemberServiceImpl;
import hello.core.order.Order;
import hello.core.order.OrderService;
import hello.core.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        MemberService memberService = new MemberServiceImpl();
        OrderService orderService = new OrderServiceImpl();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "iTemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculaterPrice() = " + order.calculaterPrice());
    }
}
