package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MemberApp {
    public static void main(String[] args) {
        //AppConfig appConfig = new AppConfig();
        //MemberService memberService = appConfig.memberService();
        //MemberService memberService = new MemberServiceImpl();
        //1L이라는 회원아이디, memberA라는 회원이름, VIP라는 등급

        //ApplicationContext는 내가 등록한 Bean들을 모두 관리해주는 객체임. + 스프링컨테이너라고 함.
        //AppConfig에 있는 환경설정정보를 가지고 스프링 컨테이너에 모두 등록하고 관리해줌.
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        //AppConfig에 memberService라는 메서드이름으로 등록된 것을 찾을 것이고, 이에 대한 반환타입은 MemberService야. 라고 알려줌.
        MemberService memberService = applicationContext.getBean("memberService", MemberService.class);

        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);

        System.out.println("new member = " + member.getName());
        System.out.println("findMember = " + findMember.getName());

    }
}
