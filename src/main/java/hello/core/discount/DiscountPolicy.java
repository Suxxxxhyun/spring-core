package hello.core.discount;

import hello.core.member.Member;

public interface DiscountPolicy {

    /*
    @return : 할인 대상 금액(얼마나 할인되었는가를 리턴함)
     */
    int discount(Member member, int price);
}
