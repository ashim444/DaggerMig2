package com.example.daggermig2.ui.secondscreen;

import android.content.Context;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;

import com.bluelinelabs.conductor.Controller;
import com.example.daggermig2.R;
import com.example.daggermig2.databinding.SecondScreenBinding;
import com.example.daggermig2.ui.BaseController;
import com.example.daggermig2.ui.main.MainActivity;

import javax.inject.Inject;

public class SecondController extends BaseController implements View.OnClickListener {

    private static final String TAG = "SecondController";

    @Inject
    SecondPresenter presenter;

    @Inject
    SecondViewModel viewModel;

    private SecondScreenBinding binding;

    public static Controller newInstance() {
        return new SecondController();
    }

    @Override
    protected void onContextAvailable(@NonNull Context context) {
        ((MainActivity) getActivity()).getComponent().getSecondComp().create().inject(this);
        super.onContextAvailable(context);
    }


    @Override
    protected void onViewBound(View root) {
        super.onViewBound(root);
        binding = (SecondScreenBinding) dataBinding;
        binding.button2.setOnClickListener(this);
        Log.d(TAG, "onViewBound: presenterFirst" + presenter);
        Log.d(TAG, "onViewBound: viewModelSecond" + viewModel);
        presenter.printLog();
    }

    @Override
    protected int layoutRes() {
        return R.layout.second_screen;
    }

    @Override
    public void onClick(View view) {
        presenter.navigateBack();
    }
}
