package com.sujanmaharjan008.esoftwarica.ui.usersList;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UsersViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public UsersViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is home fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}