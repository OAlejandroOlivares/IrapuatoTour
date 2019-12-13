package com.example.irapuatotour;
//Custom objecto to store location data
public class Location {
    private String name;
    private String description;
    private Integer resource;

    public Location(String _name, String _description, Integer _resource){
        name = _name;
        description = _description;
        resource = _resource;
    }
    // methods to retrive the object data
    public Integer getResource() {
        return resource;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }
}
