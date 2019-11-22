package com.sujanmaharjan008.esoftwarica.model;

public class UserInfo {
    int ImageId;
    String gender, name, age, address;

    public UserInfo(int imageId, String gender, String name, String age, String address) {
        ImageId = imageId;
        this.gender = gender;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getImageId() {
        return ImageId;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
