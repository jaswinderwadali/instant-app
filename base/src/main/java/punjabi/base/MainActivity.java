package punjabi.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.google.android.instantapps.InstantApps;

/**
 * Created by jaswinderwadali on 28/12/17.
 */

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (!InstantApps.isInstantApp(this)) {
//            startService(this,punjabi.services.UtilService.class);
        }

    }
}
