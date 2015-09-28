package ex.spring.practice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ex.spring.practice.model.Lesson;
import ex.spring.practice.model.Member;
import ex.spring.practice.repository.LessonRepository;

@Service("testService")
public class TestServiceImpl implements TestService {
	
	@Autowired
	LessonRepository repository;

	@Override
	public void lessons() {

		Lesson les1 = new Lesson();
		les1.setName("Java環境構築研修");				
		List<Member> addlist = les1.getMembers();
		Member mem1 = new Member();
		mem1.setLesson(les1);
		mem1.setName("SATOU");
		mem1.setMail("satou@ntc.co.jp");
		addlist.add(mem1);
		repository.save(les1);

		List<Lesson> list = repository.findAll();
		for (Lesson l : list) {
			System.out.println("ID  :" + l.getId());
			System.out.println("NAME:" + l.getName());
			List<Member> members = l.getMembers();
			for (Member m : members){
				System.out.println("M_ID：" + m.getId() + "M_NAME:" + m.getName() + "Mail"+ m.getMail());
			}
		}
	}

}
