package hello.core.member;

//클라이언트
public interface MemberService {

    //회원가입
    void join(Member member);
    //회원조회
    Member findMember(Long memberId);
}
