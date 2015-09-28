package ex.spring.practice.service;

import java.io.File;

import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ex.spring.practice.model.Anno_test;
import ex.spring.practice.model.Member;
import ex.spring.practice.repository.Anno_testRepository;
import ex.spring.practice.repository.MemberRepository;

@Service("testService")
public class TestServiceImpl implements TestService {

	@Autowired
	MemberRepository repository;
	
	@Autowired
	Anno_testRepository anno_repository;

	@Override
	public void members() {

		Member mem1 = new Member();
		mem1.setName("SATOU");
		mem1.setMail("satou@ntc.co.jp");
		mem1.setMemo("test");

		repository.save(mem1);

		List<Member> list = repository.findAll();
		for (Member m : list) {
			System.out.println("ID  :" + m.getId());
			System.out.println("NAME:" + m.getName());
			System.out.println("MAIL:" + m.getMail());
			System.out.println("MEMO:" + m.getMemo());
		}

	}

	@Override
	public void annoTest() {
		
		Locale loc = new Locale("ja", "JP", "JP");
		Calendar cal = Calendar.getInstance(loc);
		
		Anno_test test = new Anno_test();
		
		test.setDate(cal.getTime());
		test.setTime(cal.getTime());
		test.setTimeStamp(cal);	
			
		try {
			// ファイルの読み込み
			File file = new File("src/main/resources/test.txt");
			System.out.println("対象ファイル：" + file.getAbsolutePath());
			
			// バイナリとして読み込み
			byte[] bytes = Files.readAllBytes(file.toPath());
			test.setLargeArray(bytes);
			
			// テキストとして読み込み
			List<String> list = Files.readAllLines(file.toPath(),  StandardCharsets.UTF_8);
			test.setLargeString(list.toString());
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ファイルの読み込みに失敗したのでスキップ");
		}
				
		anno_repository.save(test);
	}
	
}
