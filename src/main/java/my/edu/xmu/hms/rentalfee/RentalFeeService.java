package my.edu.xmu.hms.rentalfee;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RentalFeeService {
    private final RentalFeeRepository rentalFeeRepository;

    public RentalFeeService(RentalFeeRepository rentalFeeRepository) {
        this.rentalFeeRepository = rentalFeeRepository;
    }

    public List<RentalFee> getRentalFees(String userId){
        if(userId == null){
            return rentalFeeRepository.findAll();
        }
        return rentalFeeRepository.findByUserId(userId);
    }
}
