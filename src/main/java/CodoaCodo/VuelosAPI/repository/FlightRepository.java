package CodoaCodo.VuelosAPI.repository;

import CodoaCodo.VuelosAPI.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {

    List<Flight> findByOrigen(String origen);

}
