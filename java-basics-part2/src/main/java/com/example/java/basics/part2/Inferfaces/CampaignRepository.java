package com.example.java.basics.part2.Inferfaces;

import com.example.java.basics.part2.Entity.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CampaignRepository extends JpaRepository<Campaign,String > {
    @Query("SELECT c FROM Campaign WHERE c.isActive=true")
    List<Campaign> getAllCampaign();

    @Query("SELECT c from Campaign c WHERE c.isActive=true AND c.id=:campaignId")
    Campaign getCampaignById(@Param("campaignId") Integer id);

    @Query(" SELECT c from Campaign c WHERE c.isActive=true AND c.campaignName=:campaignName")
    Campaign getCampaignByName(@Param("campaignName") String campaignName);
}
