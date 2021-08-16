package in.timesinternet.punjiup.controller.Investor;
import in.timesinternet.punjiup.dto.CustomerDto;
import in.timesinternet.punjiup.dto.InvestorUpdateDto;
import in.timesinternet.punjiup.dto.LoginDto;
import in.timesinternet.punjiup.dto.TransactionDto;
import in.timesinternet.punjiup.entity.enumaration.fundType;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("api/investor")
public class CustomerController {
    @PostMapping("")
    Object createAccount(@RequestBody CustomerDto customerDto)
    {
        return null;
    }
    @PostMapping("/login")
    Object loginInvestor(@RequestBody LoginDto loginDto)
    {
        return null;
    }
    @PutMapping("")
    Object updateInvestor(@RequestBody InvestorUpdateDto investorUpdateDto)
    {
        //Update detail of users
        return null;
    }
    @GetMapping("/funds")
    Object getAllFunds()
    {
        //return List of funds
        return null;
    }
    @GetMapping("fund/{FundId}")
    Object getFund(@PathVariable int FundId )
    {
        //Return perticular Fund;
        return null;
    }
    @GetMapping("funds/{fundType}")
    Object getAllTypeFund(@PathVariable fundType fundType)
    {
        //get all open or close end fund;
        return null;
    }
    @PostMapping("fund/transaction")
    Object startTransaction(@RequestBody TransactionDto transactionDto)
    {
        //For Recording Transaction for customer
        return null;
    }
    /*//Get total Value Corresponding to all fund
    @GetMapping("funds/")
       */
    //Get total Customer Portfolio Value

}
