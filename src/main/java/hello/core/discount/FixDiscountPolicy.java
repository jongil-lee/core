package hello.core.discount;

import hello.core.discount.member.Grade;
import hello.core.discount.member.Member;

public class FixDiscountPolicy implements DiscountPolicy{

    private int discoutFixAmount = 1000;

    @Override
    public int discount(Member member, int price) {
        if(member.getGrade() == Grade.VIP) {
            return discoutFixAmount;
        } else {
            return 0;
        }
    }
}
