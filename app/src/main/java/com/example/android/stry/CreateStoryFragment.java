package com.example.android.stry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CreateStoryFragment extends Activity {

    private static final String TAG = "CreateStoryFragment";
    private EditText writingContET;
    private TextView writeContCharCountTV;
    private Button cancelBtn, submitBtn;
    private int writingCount;

//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        View view = inflater.inflate(R.layout.create_story_fragment,container,false);
//        createStoryBtn = (Button) view.findViewById(R.id.btnTest3);
//
//        createStoryBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity(), "TESTING BUTTON CLICK 3",Toast.LENGTH_SHORT).show();
//            }
//        });
//
//        return view;
//    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_story_fragment);
        Log.d(TAG, "onCreate: Starting.");

        cancelBtn = (Button) findViewById(R.id.cancel_newstory_btn);
        submitBtn = (Button) findViewById(R.id.new_story_btn);

//        writingContET = (EditText) findViewById(R.id.writing_contribution_et);
//        writeContCharCountTV = (TextView) findViewById(R.id.writing_contribution_char_count);
//        writingCount = writingContET.length();
//        String test = Integer.toString(writingCount);
//
//        writeContCharCountTV.setText(test);

//        LinearLayout ll = (LinearLayout) findViewById(R.id.story_create_popup_layout);
//        ll.setAlpha(0.1);

//        createStoryBtn = (Button) findViewById(R.id.btnTest3);
//
//        createStoryBtn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Toast.makeText(getActivity(), "TESTING BUTTON CLICK 3",Toast.LENGTH_SHORT).show();
//            }
//        });


        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int) (width * .90), (int) (height * .85));
//        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));

        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

        submitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });

    }

}
