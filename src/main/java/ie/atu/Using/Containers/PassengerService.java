package ie.atu.Using.Containers;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class PassengerService {
    @GetMapping
    public List<Passenger> getPassengers() {
        List<Passenger> myPassengers = List.of(
                new Passenger("Mr", "Paul", "1234567890", "2123455678", 23),
                new Passenger("Mr", "Paul2", "1234567890", "2485665567", 93),
                new Passenger("Mr", "Paul3", "1234567890", "55624564525", 53));
        return myPassengers;
    }

    public Passenger getPassenger(String passengerID){
        Passenger myPassenger =new Passenger("Mr", "Paul", "1234567890", "2123455678", 26);
        return myPassenger;
    }

    }