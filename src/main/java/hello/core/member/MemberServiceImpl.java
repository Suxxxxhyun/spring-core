package hello.core.member;

public class MemberServiceImpl implements MemberService{

    //추상화(MemberRepository)도, 구현체(MemoryMemberRepository)에도 의존하고 있음 -> DIP위반
    //private final MemberRepository memberRepository = new MemoryMemberRepository();
    private final MemberRepository memberRepository;

    public MemberServiceImpl(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    //회원가입
    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    //회원조회
    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
