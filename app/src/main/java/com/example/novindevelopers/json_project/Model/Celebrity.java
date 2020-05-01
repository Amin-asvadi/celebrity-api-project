package com.example.novindevelopers.json_project.Model;

/**
 * Created by NovinDevelopers on 2/10/2018.
 */

public class Celebrity
{
    String name;
    String email;
    String image;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getImage()
    {
        return image;
    }

    public void setImage(String image)
    {
        this.image = image;
    }

    public Celebrity(String name, String email, String image)
    {
        this.name = name;
        this.email = email;
        this.image = image;
    }
}
