package com.example.java.basics.part2.Controllers;

import com.example.java.basics.part2.Entity.Campaign;
import com.example.java.basics.part2.Entity.Vehicle;
import com.example.java.basics.part2.Services.CampaignManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CampaignController {
    @Autowired
    CampaignManager campaignManager;

    @PostMapping("/addCampaign")
    public Campaign addCampaign(@RequestBody Campaign campaign) {
        return campaignManager.addCampaign(campaign);
    }
    @GetMapping("getAll")
    public List<Campaign> getAll() {
        return campaignManager.getAllCampaigns();

    }
    @GetMapping("getById")
    public Campaign getById(@RequestParam Integer id) {
        return campaignManager.getById(String.valueOf(id));
    }
    @GetMapping("getByName")
    public Campaign getByName(@RequestParam String name) {
        return campaignManager.getByName(name) ;
    }
    @PutMapping("update")
    public Campaign updateCampaign(@RequestBody String id, String name) throws Exception {
        return campaignManager.updateCampaign(id,name);
    }
    @DeleteMapping("deleteById")
    public Boolean deleteById(@RequestParam Integer id) {
        return campaignManager.deleteById(id);
    }
}
