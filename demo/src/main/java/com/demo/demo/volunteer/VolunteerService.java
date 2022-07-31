package com.demo.demo.volunteer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VolunteerService {

    private final VolunteerRepository volunteerRepository;

    @Autowired
    public VolunteerService(VolunteerRepository volunteerRepository) {
        this.volunteerRepository = volunteerRepository;
    }

    public List<Volunteer> getVolunteers() {
        return volunteerRepository.findAll();
    }

    public void addNewVolunteer(Volunteer volunteer) {
        Optional<Volunteer> volunteerOptional = volunteerRepository.findVolunteerByContactNumber(volunteer.getContactNumber());

        if (volunteerOptional.isPresent()) {
            throw new IllegalStateException("Contact Number already Registered");
        }
        volunteerRepository.save(volunteer);
    }

    public void deleteStudent(Long volunteerId) {
        boolean exists = volunteerRepository.existsById(volunteerId);
        if (!exists) {
            throw new IllegalStateException("volunteer with id " + volunteerId + " does not exists");
        }
        volunteerRepository.deleteById(volunteerId);
    }
}
