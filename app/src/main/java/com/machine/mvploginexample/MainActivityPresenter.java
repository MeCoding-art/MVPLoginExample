package com.machine.mvploginexample;

public class MainActivityPresenter implements MainActivityContract.presenter{

    MainActivityContract.view view;
    public MainActivityPresenter(MainActivityContract.view view) {
        this.view = view;
    }

    @Override
    public void doLogin(String email, String password) {
        if(email.isEmpty() || password.isEmpty()){
            view.onFailure("Please enter email/password");
        }
        else if(email.equals("username") && password.equals("password")){
            view.onSuccess("SuccessfullyLogin");
        }
        else {
            view.onFailure("Please enter valid entries");
        }
    }
}
