package hello.core.member;


import hello.core.AppConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {

    //MemberService memberService = new MemberServiceImpl();
    MemberService memberService;

    //@BeforeEach : 'Test하기 전에 아래 코드를 수정해라'라는 의미임.
    @BeforeEach
    public void beforeEach(){
        AppConfig appConfig = new AppConfig();
        memberService = appConfig.memberService();
    }
    @Test
    void join(){
        //given(이런 환경이 주어졌을때)
        Member member = new Member(1L, "memberA", Grade.VIP);
        //when(이렇게 했을때)
        memberService.join(member);
        Member findMember = memberService.findMember(1L);
        //then
        Assertions.assertThat(member).isEqualTo(findMember);

    }
}
