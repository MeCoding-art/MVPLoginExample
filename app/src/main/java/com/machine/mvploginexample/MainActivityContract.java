package com.machine.mvploginexample;

public interface MainActivityContract {

    public interface view{
        void onSuccess(String message);
        void  onFailure(String message);
    }

    public interface presenter{
        void doLogin(String email, String password);
    }
}
