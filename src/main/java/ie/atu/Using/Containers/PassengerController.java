package ie.atu.Using.Containers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(path = "api/passenger")
public class PassengerController {
    public PassengerController(PassengerService myService) {
        this.myService = myService;
    }

    PassengerService myService;

    @GetMapping
    public List<Passenger> getPassengers() {


        return myService.getPassengers();
    }
    @GetMapping("/{passengerID}")
    public Passenger getPassenger(@PathVariable String passengerID){

        return myService.getPassenger(passengerID);
    }

}
