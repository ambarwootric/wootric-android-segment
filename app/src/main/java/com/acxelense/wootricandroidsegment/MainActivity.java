package com.acxelense.wootricandroidsegment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.segment.analytics.Analytics;
import com.wootric.analytics.android.integrations.wootric.WootricIntegration;
import com.wootric.androidsdk.Wootric;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startSurvey(View view) {

        Analytics analytics = ((MainApplication) getApplication()).getAnalytics();
        analytics.onIntegrationReady(WootricIntegration.FACTORY.key(), new Analytics.Callback<Wootric>() {
            @Override
            public void onReady(Wootric wootric) {
                // Set all aptional configuration here like:
                // The current logged in user's email address.
                wootric.setEndUserEmail("wootric@example.com");
                // The current logged in user's sign-up date as a Unix timestamp.
                wootric.setEndUserCreatedAt(1234567890);

                // Use only for testing
                wootric.setSurveyImmediately(true);
                wootric.survey();
            }
        });

    }
}
