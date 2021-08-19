package in.timesinternet.punjiup.dto;

import in.timesinternet.punjiup.entity.embeddable.CloseEndFund;
import in.timesinternet.punjiup.entity.enumaration.FundType;
import in.timesinternet.punjiup.entity.enumaration.IsActive;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.procedure.spi.ParameterRegistrationImplementor;

import java.util.Date;

@Getter
@Setter
public class FundUpdateDto {
    private Integer fund_Id;
    private Double total_value;
    private Double nav;
    private Double expenseRatio;
    private Integer preference;
    private FundType fundType;
    private Double exitLoad;
    private Date bendDate;
    private Date bstartDate;
    private CloseEndFund closeEndFund;
    private IsActive isActive;
}
