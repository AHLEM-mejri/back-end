package DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Direction;

public interface DirectionDAO  extends JpaRepository<Direction,Long>{

}
