package in.timesinternet.punjiup.dto;
import in.timesinternet.punjiup.entity.enumaration.transactionStatus;
import in.timesinternet.punjiup.entity.enumaration.transactionType;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Setter
@Getter
public class TransactionDto {
    transactionType transactionType;
    transactionStatus transactionStatus;
    Double amount;
    Integer fundId;
    Integer customerId;
}
