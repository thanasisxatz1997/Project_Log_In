package Managers;

import Forms.RegistrationForm;

public class Initialize {
    ConnectToDataBase DbConnection;
    public Initialize()
    {
        DbConnection=new ConnectToDataBase();
        RegistrationForm startingForm=new RegistrationForm(null);
    }
    public static void main(String[] args) {
        new Initialize();
    }
}
