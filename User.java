package com.javarush.test.jun_golov;

/**
 * Created by Катюха on 20.04.2017.
 */
public class User
{
    private final int id;
    private String login;
    private String name;
    private String email;
    private String password;

    public User(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setLogin(String login)
    {
        this.login = login;
    }

    public String getLogin()
    {
        return login;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getEmail()
    {
        return email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    public String toString()
    {
        return "User{login = '" + login + "', name = '" + name + "', password = '" + password + "'}";
    }
}
