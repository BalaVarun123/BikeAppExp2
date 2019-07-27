package com.example.bikeappexp2;

import android.content.Context;
import android.content.SharedPreferences;

public class LoginHelper {
    private Context context;
    private SharedPreferences sharedPreferences;

    public LoginHelper(Context context){
        this.context = context;
        sharedPreferences = context.getSharedPreferences(context.getResources().getString(R.string.logging_preferences),context.MODE_PRIVATE);


    }

    public void setLoggingStatus(boolean status,String user_name){
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putBoolean(context.getResources().getString(R.string.logging_status_preference),status);
        editor.putString(context.getResources().getString(R.string.user_name_prefernce),user_name);
        editor.commit();
    }

    public boolean getLoggingStatus(){
        return sharedPreferences.getBoolean(context.getResources().getString(R.string.logging_status_preference),false);
    }
    public String getUserName(){

        return sharedPreferences.getString(context.getResources().getString(R.string.user_name_prefernce),"");
    }


    public boolean check_user_name(String user_name){
        //checkig with server
        //
        return false;
    }
    public boolean check_password(String user_name , String password){
        if (!check_user_name(user_name)){
            return false;
        }
        String ps = sharedPreferences.getString(context.getResources().getString(R.string.password_preference),"");
        //replace with code checking the server
        if (!ps.equals(password)){
            return false;
        }
        else {
            return true;
        }
    }
    public boolean addUser(String user_name,String password){

        // Adding user in the app
        return false;

    }
    public boolean removeUser(String user_name, String password){
        return false;
    }
    public boolean create_account(String user_name, String password){
        return false;
    }
    public boolean delete_account(String user_name,String password){
        return false;
    }
    public boolean modify_account(String user_name,String parameter , Object value){
        return false;
    }




}
