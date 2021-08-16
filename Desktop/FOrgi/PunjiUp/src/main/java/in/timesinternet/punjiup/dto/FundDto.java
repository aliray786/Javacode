package in.timesinternet.punjiup.dto;

import in.timesinternet.punjiup.entity.embeddable.CloseEndFund;
import in.timesinternet.punjiup.entity.enumaration.fundType;
import in.timesinternet.punjiup.entity.enumaration.isActive;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class FundDto {
    private String fundName;
    private String symbol;
    private Double totalValue;
    private Double nav;
    private Double expenseRatio;
    private Integer preference;
    private fundType fundType;
    private Double exitLoad;
    private Integer mgrId;
    private isActive isActive;
    private CloseEndFund closeEndFund;
}
