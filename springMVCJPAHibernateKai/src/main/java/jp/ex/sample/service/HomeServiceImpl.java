package jp.ex.sample.service;

import java.util.List;

import jp.ex.sample.entities.HomeEntity;
import jp.ex.sample.repositories.HomeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("service")
@Transactional
public class HomeServiceImpl implements HomeService{

	@Autowired
	HomeRepository homeRepository;

	public String serviceMethod() {

		String ret = "";

		List<HomeEntity> list = homeRepository.findAll();
		for(HomeEntity h : list){
			System.out.println("ID :" + h.getId());
			ret = h.getName();
		}

		return ret;
	}

	public String topMethod(Long inPut){
		String ret = "";
		HomeEntity obj = homeRepository.findOne(inPut);
		ret = obj.getName();
		return ret;

	}

}
