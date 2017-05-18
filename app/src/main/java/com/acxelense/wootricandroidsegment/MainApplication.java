package com.acxelense.wootricandroidsegment;

import android.app.Application;
import com.segment.analytics.Analytics;
import com.wootric.analytics.android.integrations.wootric.WootricIntegration;

public class MainApplication extends Application {

    Analytics analytics;

    @Override
    public void onCreate() {
        super.onCreate();

        analytics = new Analytics.Builder(this, "2kSG0kmIt9c0QL0zm0rqvChFO5VHHuXJ")
                .use(WootricIntegration.FACTORY)
                .build();
    }

    public Analytics getAnalytics() {
        return analytics;
    }

}
