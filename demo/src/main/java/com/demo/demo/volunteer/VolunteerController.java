package com.demo.demo.volunteer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/volunteer")
public class VolunteerController {

    private final VolunteerService volunteerService;

    @Autowired
    public VolunteerController(VolunteerService volunteerService) {
        this.volunteerService = volunteerService;
    }

    @GetMapping
    public List<Volunteer> getVolunteers() {
        return volunteerService.getVolunteers();
    }

    @PostMapping
    public void registerNewVolunteer(@RequestBody Volunteer volunteer) {
        volunteerService.addNewVolunteer(volunteer);
    }

    @DeleteMapping(path = "{volunteerId}")
    public void deleteVolunteer(@PathVariable("volunteerId") Long volunteerId) {
        volunteerService.deleteStudent(volunteerId);
    }
}
