package com.sebone.java.sort;
import java.util.ArrayList;

public interface SortUserData {
    public ArrayList<UserDataS> sortUserDataByAge(ArrayList<UserDataS> userDatalist);
    public ArrayList<UserDataS> sortUserDataByName(ArrayList<UserDataS> userDatalist);
    public ArrayList<UserDataS> sortUserDataByRollNumber(ArrayList<UserDataS> userDatalist);
}
