package dmacc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import dmacc.beans.Cars;

@Repository
public interface CarsRepository extends JpaRepository<Cars, Long> {
	
}
