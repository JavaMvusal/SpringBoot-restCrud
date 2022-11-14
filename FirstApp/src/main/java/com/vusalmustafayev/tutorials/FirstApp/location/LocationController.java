package com.vusalmustafayev.tutorials.FirstApp.location;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Controller
public class LocationController {
    @Autowired
    private LocationService locationService;
    @RequestMapping(value = "/locations", produces = { MediaType.APPLICATION_JSON_VALUE })
    public String getAllLocation(Model model){
        model.addAttribute("locations",locationService.getAllLocations());

        return "locations";
    }

    @RequestMapping(value = "/locations/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
    public Optional<Location> getLocation(@PathVariable String id){
        return locationService.getLocation(id);
    }

    @RequestMapping(value = "/locations",method = RequestMethod.POST)
    public void addLocation(@RequestBody Location location){
    locationService.addLocation(location);
    }
    @RequestMapping(value = "/locations/{id}" ,method = RequestMethod.PUT,produces = {MediaType.APPLICATION_JSON_VALUE})
    public void updateLocation(@RequestBody Location location, @PathVariable String id){
        locationService.updateLocation(id,location);
    }
    @RequestMapping(value = "/locations/{id}",method = RequestMethod.DELETE,produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteLocation(@PathVariable String id){
        locationService.deleteLocation(id);
    }
}
