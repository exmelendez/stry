package com.example.android.stry;

public class Settings {

    private String userName;


    private String notifications = "Notifications";
    private String logout = "Logout";

    //May not use yet
    private Boolean notificationEnable;
//    private Intent logout;


    //Constructor
    public Settings(String userName) {
        this.userName = userName;
    }

    //Setter

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setNotifications(String notifications) {
        this.notifications = notifications;
    }

    public void setLogout(String logout) {
        this.logout = logout;
    }

    //Getters
    public String getUserName() {
        return userName;
    }

    public String getNotifications() {
        return notifications;
    }

    public String getLogout() {
        return logout;
    }
}
