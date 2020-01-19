package com.example.yourvote.ui.vote;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

public class VoteViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public VoteViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is Vote fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}
