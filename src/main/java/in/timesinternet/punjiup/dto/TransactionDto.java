package in.timesinternet.punjiup.dto;
import in.timesinternet.punjiup.entity.enumaration.transactionStatus;
import in.timesinternet.punjiup.entity.enumaration.transactionType;
import java.util.Date;
public class TransactionDto {
    transactionType transactionType;
    transactionStatus transactionStatus;
    Double amount;
    Integer fundId;
    Integer CustomerId;
}
