package com.example.daggermig2.storage;

public interface UserStorage {

    void saveString(String value, String key);

    void getString(String key);

}
