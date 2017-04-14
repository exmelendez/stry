package com.example.android.stry;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.Button;

public class CreateStoryFragment extends Activity {

    private static final String TAG = "CreateStoryFragment";
    private Button createStoryBtn;

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

        getWindow().setLayout((int)(width * .90), (int)(height * .85));
//        getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));


    }

}
