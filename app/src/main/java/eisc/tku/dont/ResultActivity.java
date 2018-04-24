package eisc.tku.dont;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
    findview();
    }
    public void findview(){
        Bundle bag=getIntent().getExtras();
        String id=bag.getString("student_id",null);
        String name=bag.getString("student_name",null);
        String email=bag.getString("student_email",null);

        Log.d("student_id",id);
        Log.d("student_name",name);
        Log.d("student_email",email);

    }


}
