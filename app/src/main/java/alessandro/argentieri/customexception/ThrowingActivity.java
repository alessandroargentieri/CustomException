package alessandro.argentieri.customexception;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ThrowingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_throwing);
    }

    public void LaunchException(View v){
        try {
            throw new CustomException("Erroraccio di un'exception!");
        }catch(CustomException ce){
            Toast.makeText(this, ce.toString(), Toast.LENGTH_LONG).show();
        }
    }
}
