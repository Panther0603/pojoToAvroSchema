package com.example.avroconvertor.pojo;


import lombok.Data;

@Data
public class Student {
    private String uid;
    private String first_Name;
    private String last_name;
    private String className;
    private AddressDetails addressDetails;
    private PersonalDetail personalDetail;
    private static final String SchoolName="GBSSS";
}
