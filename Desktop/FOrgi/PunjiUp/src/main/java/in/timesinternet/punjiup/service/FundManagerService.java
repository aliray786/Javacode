package in.timesinternet.punjiup.service;

import in.timesinternet.punjiup.dto.*;
import in.timesinternet.punjiup.entity.FundDetails;
import in.timesinternet.punjiup.entity.FundManager;
import in.timesinternet.punjiup.entity.Transaction;
import in.timesinternet.punjiup.entity.enumaration.fundType;
import in.timesinternet.punjiup.entity.enumaration.transactionStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public interface FundManagerService {
    FundManager createFundManagerAccount(FundmanagerDto fundmanagerDto);
    ResponseEntity login(String email, String password);
    FundManager UpdateManager(FundManagerUpdateDTO fundManagerUpdateDTO);
    FundDetails addFund(FundDto fundDto);
    FundDetails fundUpdate(FundUpdateDto fundUpdateDto);
    List<FundDetails> getAllFund( int managerId);
    FundDetails getFund( int fundId,int mgrId);
    List<FundDetails> getAllTypeFund(fundType fundType,Integer mgr_id);
    Transaction updateTransactionStatus(TransactionStatusUpdateDto transactionStatusUpdateDto);
    List<FundManager>getAllFundManager();
    /*List<Transaction>transactionList(Integer mgrId, transactionStatus transactionStatus);*/






}
