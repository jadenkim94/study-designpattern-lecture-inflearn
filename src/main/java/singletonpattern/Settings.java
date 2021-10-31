package singletonpattern;

import java.io.Serializable;

public class Settings implements Serializable {

    private Settings(){};

    private static class SettingsHolder{
        private static Settings INSTNACE = new Settings();
    }

    public static Settings getInstance(){
        return SettingsHolder.INSTNACE;
    }

    protected Object readResolve(){
        return getInstance();
    }

}
