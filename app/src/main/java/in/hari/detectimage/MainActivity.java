package in.hari.detectimage;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import org.opencv.android.OpenCVLoader;

public class MainActivity extends AppCompatActivity {

    private static String TAG = "MainActivity";

    static
    {
        if(OpenCVLoader.initDebug())
        {
            Log.d(TAG, "OpenCV is configured successfully");
        }
        else
        {
            Log.d(TAG, "OpenCV is not configured or loaded");
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
