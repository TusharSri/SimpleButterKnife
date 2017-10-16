package com.example.tushar.simplebutterknife;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.textview_hello) TextView helloTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        helloTextView.setText("ButterKnife Implemented");
    }

    @OnClick(R.id.textview_hello)
    public void helloTextClicked(){
        helloTextView.setText("ButterKnife Clicked worked");
    }
}
