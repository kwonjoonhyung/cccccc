package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {
    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();
    @Test
    @DisplayName("VIP는 10% 할인이 돼야 한다.")
    void vip_o(){
        Member member = new Member(1L,"Kwon", Grade.VIP);
        Assertions.assertThat(rateDiscountPolicy.discount(member, 25000)).isEqualTo(22500);
    }
}