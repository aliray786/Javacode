package in.timesinternet.punjiup.repository;

import in.timesinternet.punjiup.entity.FundDetails;
import in.timesinternet.punjiup.entity.enumaration.FundType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FundDetailsRepository extends JpaRepository<FundDetails, Integer> {
  List<FundDetails>  findAllByFundTypeAndFundManagerMgrIdOrderByPreference(FundType fundType, Integer mgr_id);
  FundDetails  findByFundIdAndFundManagerMgrId(Integer fundId,Integer mgr_Id);
  List<FundDetails> findFundDetailsByFundManagerMgrId(Integer mgrId);


}
