package in.timesinternet.punjiup.controller.Manager;
import in.timesinternet.punjiup.dto.FundDto;
import in.timesinternet.punjiup.dto.FundManagerUpdateDTO;
import in.timesinternet.punjiup.dto.FundmanagerDto;
import in.timesinternet.punjiup.dto.LoginDto;
import in.timesinternet.punjiup.entity.FundManager;
import in.timesinternet.punjiup.entity.enumaration.fundType;
import in.timesinternet.punjiup.service.FundManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/api/manager")
public class ManagerController {
    @PostMapping("")
    Object loginManager(@RequestBody LoginDto loginDto)
    {
        return null;
    }
    @PostMapping("/login")
    Object createManager(@RequestBody  FundmanagerDto fundmanagerDto)
    {
        //Manager Service Call;
        return null;
    }
    @PutMapping("")
    Object updateManager(@RequestBody FundManagerUpdateDTO fundManagerUpdateDTO)
    {
        //update Mangaer Service Call
        return null;
    }
    @PostMapping("/fund")
    Object addFund(@RequestBody FundDto fundDto)
    {
        //update Mangaer Service Call
        return null;
    }
    @PutMapping("/fund")
    Object fundUpdate(@RequestBody FundDto fundDto)
    {
        //update Mangaer Service Call
        return null;
    }
    @GetMapping("/{managerId}/fund")
    Object getAllFund(@PathVariable int managerId)
    {
        //Get All funds for perticular manager
        return null;
    }
    @GetMapping("/{managerId}/fund/{fundId}")
    Object getFund(@PathVariable int fundId)
    {
        //update Mangaer Service Call
        return null;
    }
    @GetMapping("/funds/{fundType}")
    Object getAllTypeFund(@PathVariable fundType fundType)
    {
        //get all open or close end fund;
        return null;
    }
   /* //To update Transaction Status
    @PutMapping("/fund/transaction")
    Object updateTransactinStatus(@RequestBody )*/

    /*
    To get all Unapproved Transaction

     */
}
