package com.example.datalab.authenticate;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.datalab.R;
import com.example.datalab.main.MainMenuActivity;


public class SignInActivity extends AppCompatActivity implements LoginFragment.LoginFragmentListener{ // (impliments...) this fixed the problem

    private SharedPreferences mSharedPreferences;
    private boolean mTest = true; // Change to false after testing done.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in); // create itself (probably)

        mSharedPreferences = getSharedPreferences(getString(R.string.LOGIN_PREFS)   // the error could be because Jaedan and I are not from UW Tacoma
                , Context.MODE_PRIVATE);

        if(!mSharedPreferences.getBoolean(getString(R.string.LOGGEDIN), false) || mTest) {

            getSupportFragmentManager().beginTransaction()
                    .add(R.id.sign_in_fragment_id, new LoginFragment())
                    .commit(); // if not signed it, go to the sign in page
        } else {
            Intent intent = new Intent(this, MainMenuActivity.class);
            startActivity(intent);
            finish();                             // if already signed in, go to main menu
        }
    }

    @Override
    public void login(String email, String pwd) {
        if(Account.isValidPassword(pwd)){
            return;
        }
        if(Account.isValidEmail(email)){
            return;
        }

        mSharedPreferences
                .edit()
                .putBoolean(getString(R.string.LOGGEDIN), true)
                .commit();           // when user clicks, this info will be stored in the file using SharedPreferences API

        Intent i = new Intent(this, MainMenuActivity.class); // goes to MainMenuActivity after successful login
        startActivity(i);
        finish();
    }

}