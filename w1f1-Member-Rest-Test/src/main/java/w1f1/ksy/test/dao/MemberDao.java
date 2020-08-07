package w1f1.ksy.test.dao;

import java.util.List;

import w1f1.ksy.test.model.Member;

public interface MemberDao {

	List<Member> selectList();

	int insertMember(Member member);

	Member selectByIdx(int idx);

	int editMember(Member member);

	int deleteMember(int idx);
	
	
	
}
