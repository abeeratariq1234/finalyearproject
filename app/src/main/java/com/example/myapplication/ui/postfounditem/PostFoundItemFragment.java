package com.example.myapplication.ui.postfounditem;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.myapplication.R;

public class PostFoundItemFragment extends Fragment {
    public static PostFoundItemFragment newInstance() {
        return new PostFoundItemFragment();
    }
    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        return inflater.inflate(R.layout.post_found_item_fragment,container,false);
    }

}
