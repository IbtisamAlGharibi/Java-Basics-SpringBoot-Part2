package com.example.java.basics.part2.Controllers;

import com.example.java.basics.part2.Services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RegistrationController {

    @Autowired
    RegistrationService registrationService;

    @DeleteMapping("/registrations")
    public String deleteMultipleRegistrations(@RequestBody List<Integer> ids) {
        return registrationService.deleteMultipleByIds(ids);
    }
}
