package com.peaksoft.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor
@Setter
@Getter
@Table(name = "companies")
@AllArgsConstructor
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @Column(length = 100000, name = "company_name")
    private  String companyName;
    @Column(length = 100000, name = "located_country")
    private String locatedCountry;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy = "company")
    private List<Course> courses;
    public void addCourses(Course course){
        if (courses==null){
            courses=new ArrayList<>();
        }
        courses.add(course);
    } public Company(String companyName, String locatedCountry) {
            this.companyName = companyName;
            this.locatedCountry = locatedCountry;
        }

        @OneToMany(cascade = {CascadeType.ALL},fetch = FetchType.LAZY, mappedBy = "company")
    private List<Group> groups;
    public void addGroups(Group group){
        if(groups == null){
        groups = new ArrayList<>();
        }
        groups.add(group);
    }

}
