package in.timesinternet.punjiup.controller.Manager;
import in.timesinternet.punjiup.dto.*;
import in.timesinternet.punjiup.entity.FundDetails;
import in.timesinternet.punjiup.entity.FundManager;
import in.timesinternet.punjiup.entity.enumaration.fundType;
import in.timesinternet.punjiup.entity.enumaration.transactionStatus;
import in.timesinternet.punjiup.repository.FundDetailsRepository;
import in.timesinternet.punjiup.repository.FundManagerRepository;
import in.timesinternet.punjiup.service.FundManagerService;
import in.timesinternet.punjiup.service.impl.FundManagerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/api/fundmanager")
public class ManagerController {
    @Autowired
    FundDetailsRepository fundDetailsRepository;
    @Autowired
    FundManagerRepository fundManagerRepository;
    @Autowired
    FundManagerServiceImpl fundManagerServiceImpl;
    @PostMapping("/login")
    Object loginManager(@RequestBody LoginDto loginDto)
    {
        return null;
    }
    @PostMapping("/signup")
    FundManager createManager(@RequestBody  FundmanagerDto fundmanagerDto)
    {
        //Manager Service Call;
        FundManager fundManager=fundManagerServiceImpl.createFundManagerAccount(fundmanagerDto);
        return fundManager;
    }
    @GetMapping("/allfundmanager")
    List<FundManager> fundManagerList()
    {
        return fundManagerServiceImpl.getAllFundManager();
    }

    @PutMapping("")
    FundManager updateManager(@RequestBody FundManagerUpdateDTO fundManagerUpdateDTO)
    {
        //update Mangaer Service Call
        FundManager fundManager=fundManagerServiceImpl.UpdateManager(fundManagerUpdateDTO);
        return  fundManager;
    }
    @PostMapping("/addfund")
    FundDetails addFund(@RequestBody FundDto fundDto)
    {
        //update Mangaer Service Call
       FundDetails fundDetails=fundManagerServiceImpl.addFund(fundDto);
       return fundDetails;
    }
    @PutMapping("/fund")
    FundDetails fundUpdate(@RequestBody FundUpdateDto fundUpdateDto)
    {
        //update Mangaer Service Call
        FundDetails fundDetails=fundManagerServiceImpl.fundUpdate(fundUpdateDto);
        return fundDetails;
    }
    @GetMapping("/{mgrId}/fund")
    List<FundDetails> getAllFund(@PathVariable int managerId)
    {
        //Get All funds for perticular manager
         List<FundDetails>fundDetailsList=fundManagerServiceImpl.getAllFund(managerId);
        return fundDetailsList;
    }
    @GetMapping("/{mgrId}/fund/{fundId}")
    Object getFund(@PathVariable int fundId,@PathVariable int mgrId)
    {
        //update Mangaer Service Call
        FundDetails fundDetails=fundManagerServiceImpl.getFund(fundId,mgrId);
        return fundDetails;
    }
    @GetMapping("/funds/{fundType}")
    Object getAllTypeFund(@PathVariable fundType fundType)
    {
        //get all open or close end fund;
        return null;
    }
  // To update Transaction Status
    @PutMapping("/fund/transaction")
    Object updateTransactinStatus(@RequestBody TransactionDto transactionDto)
    {
        return null;
    }


   // To get all Unapproved Transaction
    @GetMapping("/{managerId}/fund/transactions/{transactionStatus}")
    Object getTransaction(@PathVariable Integer managerId,@PathVariable transactionStatus transactionStatus)
    {
        return null;
    }


}
