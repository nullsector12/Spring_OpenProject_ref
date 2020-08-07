package w1f1.ksy.test.service;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import w1f1.ksy.test.dao.MemberDao;
import w1f1.ksy.test.model.Member;

@Service
public class MemberViewService {

	
	private MemberDao dao;
	
	@Autowired
	private SqlSessionTemplate template;
	
	public Member getMember (int idx) {
		
		dao = template.getMapper(MemberDao.class);
		
		return dao.selectByIdx(idx);
		
	}
}
