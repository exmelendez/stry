package com.example.android.stry;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TestDialog extends Activity {

    final Context context = this;
    private Button button;
    public TextView titleTV;
    String etContent;

    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.test_main);

        button = (Button) findViewById(R.id.buttonShowCustomDialog);
        titleTV = (TextView) findViewById(R.id.title_tv);


        // add button listener
        button.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View arg0) {

                // custom dialog
                final Dialog dialog = new Dialog(context);
                dialog.setContentView(R.layout.test_dialog);
                dialog.setTitle("Title...");
                final EditText dialogTitleET = (EditText) findViewById(R.id.dialog_title_et);





                // set the custom dialog components - text, image and button
//                TextView text = (TextView) dialog.findViewById(R.id.text);
//                text.setText("Android custom dialog example!");



                Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonOK);
                // if button is clicked, close the custom dialog
                dialogButton.setOnClickListener(new OnClickListener() {
                    @Override
                    public void onClick(View v) {

                        dialog.dismiss();
                        etContent = dialogTitleET.getText().toString();
                        titleTV.setText(etContent);
                    }
                });

                dialog.show();

            }
        });
    }
}