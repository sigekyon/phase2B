package jp.ex.sample.repositories;

import jp.ex.sample.entities.HomeEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface HomeRepository extends JpaRepository<HomeEntity,Long>{

}
