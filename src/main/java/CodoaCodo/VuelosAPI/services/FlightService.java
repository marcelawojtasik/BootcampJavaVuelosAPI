package CodoaCodo.VuelosAPI.services;

import CodoaCodo.VuelosAPI.model.Flight;
import CodoaCodo.VuelosAPI.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service //le indico que tipo de clase es
public class FlightService {

    @Autowired //inyecto el repositorio C8
    private FlightRepository flightRepository;

    public void createFlight(Flight flight){
        flightRepository.save(flight);
    }

    public void createFlights(List<Flight> flights) {
        flightRepository.saveAll(flights);
    }
/*
    public Flight getFlight() {
        return null;
    }
*/
    public List<Flight> getAllFlights() {
        return flightRepository.findAll();
    }

    public Flight searchFlightById(Long id) {
        return flightRepository.findById(id).orElse(null);
        //me pedia q lo envuelva en optional para evitar la exception(si el id no existe x ej)
    }

    public Flight updateFlight(Flight flight){
        flightRepository.save(flight);
        return flightRepository.findById(flight.getId()).orElse(null);
    }

    public void deleteFlightById(Long id) {
        flightRepository.deleteById(id);
    }

    public void deleteAllFlights() {
        flightRepository.deleteAll();
    }
}
















