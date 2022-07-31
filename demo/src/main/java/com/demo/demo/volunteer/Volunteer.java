package com.demo.demo.volunteer;

import javax.persistence.*;

@Entity
@Table
public class Volunteer {
    @Id
    @SequenceGenerator(name = "volunteer_sequence", sequenceName = "volunteer_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "volunteer_sequence")
    private Long id;
    private String name;
    private Integer age;
    private String address;
    private Long contactNumber;
    private String bloodGroup;

    public Volunteer() {
    }

    public Volunteer(Long id, String name, Integer age, String address, Long contactNumber, String bloodGroup) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactNumber = contactNumber;
        this.bloodGroup = bloodGroup;
    }

    public Volunteer(String name, Integer age, String address, Long contactNumber, String bloodGroup) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.contactNumber = contactNumber;
        this.bloodGroup = bloodGroup;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(Long contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString() {
        return "Volunteer{" + "id=" + id + ", name='" + name + '\'' + ", age=" + age + ", address='" + address + '\'' + ", contactNumber=" + contactNumber + ", bloodGroup='" + bloodGroup + '\'' + '}';
    }
}
