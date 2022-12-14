package hello.core.discount;

import hello.core.discount.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int price);
}
