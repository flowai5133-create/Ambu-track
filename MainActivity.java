package com.ambutrack.app;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout root = new LinearLayout(this);
        root.setOrientation(LinearLayout.VERTICAL);
        root.setGravity(Gravity.CENTER);
        root.setPadding(32, 32, 32, 32);

        TextView title = new TextView(this);
        title.setText("AmbuTrack");
        title.setTextSize(32);
        title.setTextColor(Color.rgb(25, 118, 210));
        title.setGravity(Gravity.CENTER);

        TextView info = new TextView(this);
        info.setText("AmbuTrack APK Builder\n\nProject is ready to build with GitHub Actions.");
        info.setTextSize(18);
        info.setGravity(Gravity.CENTER);
        info.setPadding(0, 24, 0, 0);

        root.addView(title);
        root.addView(info);
        setContentView(root);
    }
}
