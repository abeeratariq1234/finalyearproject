package com.example.myapplication.ui.reportmobile;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReportMobileViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ReportMobileViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}