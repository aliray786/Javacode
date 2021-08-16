package in.timesinternet.punjiup.dto;

import in.timesinternet.punjiup.entity.enumaration.transactionStatus;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionStatusUpdateDto {
    Integer transactionId;
    transactionStatus transactionStatus;
}
