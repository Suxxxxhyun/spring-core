package hello.core.member;

//회원저장소
public interface MemberRepository {

    //회원가입
    void save(Member member);

    //회원조회
    Member findById(Long memberId);
}
