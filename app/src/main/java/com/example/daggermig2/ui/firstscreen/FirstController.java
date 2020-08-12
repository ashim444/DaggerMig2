package com.example.daggermig2.ui.firstscreen;

import android.content.Context;
import android.util.Log;
import android.view.View;

import androidx.annotation.NonNull;

import com.bluelinelabs.conductor.Controller;
import com.example.daggermig2.R;
import com.example.daggermig2.databinding.FirstScreenBinding;
import com.example.daggermig2.ui.BaseController;
import com.example.daggermig2.ui.main.MainActivity;

import javax.inject.Inject;

public class FirstController extends BaseController implements View.OnClickListener {
    private static final String TAG = "FirstController";
    @Inject
    FirstPresenter presenter;
    @Inject
    FirstViewModel viewModel;
    private FirstScreenBinding binding;

    public static Controller newInstance() {
        return new FirstController();
    }

    @Override
    protected void onContextAvailable(@NonNull Context context) {
        ((MainActivity) getActivity()).getComponent().getFirstComp().create().inject(this);
        super.onContextAvailable(context);
    }

    @Override
    protected void onViewBound(View view) {
        super.onViewBound(view);
        binding = (FirstScreenBinding) dataBinding;
        binding.button.setOnClickListener(this);
        Log.d(TAG, "onViewBound: presenterFirst" + presenter);
        Log.d(TAG, "onViewBound: viewModelSecond" + viewModel);
        presenter.printLog();

    }

    @Override
    protected int layoutRes() {
        return R.layout.first_screen;
    }

    @Override
    public void onClick(View view) {
        presenter.navigateToSecondScreen();
    }
}
