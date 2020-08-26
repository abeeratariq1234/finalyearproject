package com.example.myapplication.ui.Reportdoc;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ReportDocViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ReportDocViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is slideshow fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}