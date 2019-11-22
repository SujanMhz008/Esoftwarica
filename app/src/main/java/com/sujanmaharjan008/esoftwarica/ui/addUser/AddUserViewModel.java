package com.sujanmaharjan008.esoftwarica.ui.addUser;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class AddUserViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public AddUserViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}