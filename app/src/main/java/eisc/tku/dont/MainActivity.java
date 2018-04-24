package eisc.tku.dont;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int size=15;

    private EditText id;
    private EditText name;
    private EditText email;
    private Button send;
    private TextView printout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViews();
    }

    private void findViews() {
        id= findViewById(R.id.editText4);
        name = findViewById(R.id.editText5);
        email = findViewById(R.id.editText6);

        send = findViewById(R.id.button);
        printout = findViewById(R.id.textView);
    }
    String id2="405410480";
    String name2="erika";
    String email2="erika21404@gmail.com";

    public void printresult2(View v) {
        String i = id.getText().toString();
        String n = name.getText().toString();
        String e = email.getText().toString();
        //printout.setTextSize(size);
        //printout.setText(i+n+e);
        //Toast.makeText(this,"學號"+i+"\n"+n+" 您好"+"\n"+"您的email是: "+e+"\n",Toast.LENGTH_LONG).show();
        if ((i.equals(id2)) && (n.equals(name2)) && (e.equals(email2))) {
            Bundle bag = new Bundle();
            Intent intent = new Intent(MainActivity.this, ResultActivity.class);

            bag.putString("student_id", i);
            bag.putString("student_name", n);
            bag.putString("student_email", e);
            intent.putExtras(bag);
            startActivity(intent);
        }

        else{
            Toast.makeText(this,"error information",Toast.LENGTH_LONG).show();
        }

    }
    public void printresult(View v){
        String i=id.getText().toString();
        String n=name.getText().toString();
        String e=email.getText().toString();
        //printout.setTextSize(size);
        //printout.setText(i+n+e);
       // Toast.makeText(this,"學號"+i+"\n"+n+" 您好"+"\n"+"您的email是: "+e+"\n",Toast.LENGTH_LONG).show();
        AlertDialog.Builder builder= new AlertDialog.Builder(this);
        builder.setMessage("學號"+i+"\n"+n+" 您好"+"\n"+"您的email是: "+e+"\n");
        builder.setTitle("print");
        builder.setPositiveButton("ok",null);
        builder.setNeutralButton("Nothing",null);
        builder.setNegativeButton("cancel",null);
        builder.show();



    }

}
