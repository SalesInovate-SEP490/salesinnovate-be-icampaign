package fpt.capstone.iCampaign.repositories;

import fpt.capstone.iCampaign.model.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CampaignRepository extends JpaRepository<Campaign,Long> {
}
