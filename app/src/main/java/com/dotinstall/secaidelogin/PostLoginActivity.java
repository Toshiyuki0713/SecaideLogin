package com.dotinstall.secaidelogin;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.linecorp.linesdk.LineProfile;
import com.linecorp.linesdk.api.LineApiClient;
import com.linecorp.linesdk.api.LineApiClientBuilder;

/**
 * Created by gosho on 2017/10/22.
 */

public class PostLoginActivity extends AppCompatActivity {

    private LineApiClient lineApiClient;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post_login_main);

        LineApiClientBuilder apiClientBuilder = new LineApiClientBuilder(getApplicationContext(), Constants.CHANNEL_ID);
        lineApiClient = apiClientBuilder.build();


        Intent intent = getIntent();
        LineProfile intentProfile = intent.getParcelableExtra("line_profile");
        //LineCredential intentCredential = intent.getParcelableExtra("line_credential");

        TextView profileText;

        profileText = (TextView) findViewById(R.id.profileName);
        profileText.setText(intentProfile.getDisplayName() + "さん");

    }

}
