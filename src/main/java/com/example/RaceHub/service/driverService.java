package com.example.RaceHub.service;

import com.example.RaceHub.dto.driverDto;
import com.example.RaceHub.models.Driver;
import com.example.RaceHub.repository.driverRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class driverService {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private driverRepository driverRepository;

    public List<Driver> fetchAndSaveDriver()
    {
        String url="https://api.openf1.org/v1/drivers";
        driverDto[] driverDtos=restTemplate.getForObject(url,driverDto[].class);
        List<Driver> drivers = Arrays.stream(driverDtos).map(dto -> {
            Driver driver = new Driver();
            driver.setId(dto.getId()); // or any unique ID from API
            driver.setBroadcastName(dto.getBroadcast_name());
            driver.setFirstName(dto.getFirst_name());
            driver.setLastName(dto.getLast_name());
            driver.setFullName(dto.getFull_name());
            driver.setDriverNumber(dto.getDriver_number());
            driver.setTeamName(dto.getTeam_name());
            driver.setTeamColour(dto.getTeam_colour());
            driver.setHeadshotUrl(dto.getHeadshot_url());
            driver.setCountryCode(dto.getCountry_code());
            return driver;
        }).toList();

        return driverRepository.saveAll(drivers);
    }


    public Driver getDriverById(Long id)
    {
        Driver res = driverRepository.findById(id);
        return res;


    }
}
