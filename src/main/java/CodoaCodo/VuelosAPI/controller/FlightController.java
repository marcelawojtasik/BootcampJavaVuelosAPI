package CodoaCodo.VuelosAPI.controller;

import CodoaCodo.VuelosAPI.model.Flight;
import CodoaCodo.VuelosAPI.services.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class FlightController {

    @Autowired //inyecto el servicio
    private FlightService flightService; //creo la instancia de servicio para que el controller lo pueda llamar y la encapsulo
/*
    @GetMapping("/one")
    public Flight getFlight(){
        return flightService.getFlight();
    }
 */
    @GetMapping("/all")
    public List<Flight> getAllFlights(){
        return flightService.getAllFlights();
    }

    @PostMapping("/create")
    public void createFlight(@RequestBody Flight flight){
        // return "ruta para crear";
        flightService.createFlight(flight);
    }

    @PostMapping("/create/all")
    public void createFlights(@RequestBody List<Flight> flights){
        flightService.createFlights(flights);
    }

    @GetMapping("/{id}")
    public Flight findFlightById(@PathVariable Long id){
        return flightService.searchFlightById(id);
    }

    @GetMapping("/origen")
    public List<Flight> getFlightsByOrigen(@RequestParam String origen){
        return flightService.getByOrigen(origen);
    }

    @PutMapping ("/update")
    public Flight updateFlight(@RequestBody Flight flight){
        return flightService.updateFlight(flight);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteFlight(@PathVariable Long id){
        flightService.deleteFlightById(id);
    }

    @DeleteMapping("/delete/all")
    public void deleteFlight(){
        flightService.deleteAllFlights();
    }

}

















