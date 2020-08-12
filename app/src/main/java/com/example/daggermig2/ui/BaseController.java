package com.example.daggermig2.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.bluelinelabs.conductor.Controller;

public abstract class BaseController extends Controller {

    protected ViewDataBinding dataBinding;

    @NonNull
    @Override
    protected View onCreateView(@NonNull LayoutInflater inflater, @NonNull ViewGroup container, @Nullable Bundle savedViewState) {
        dataBinding = DataBindingUtil.inflate(inflater, layoutRes(), container, false);
        onViewBound(dataBinding.getRoot());
        return dataBinding.getRoot();
    }

    protected  void onViewBound(View root){

    };

    @LayoutRes
    protected abstract int layoutRes();
}
