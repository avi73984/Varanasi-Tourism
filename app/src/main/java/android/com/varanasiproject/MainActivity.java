package android.com.varanasiproject;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    EditText username,pasword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=(EditText)findViewById(R.id.edit1);
        pasword=(EditText)findViewById(R.id.filpass);
    }
    public void save(View view)
    {
        String text1=username.getText().toString();
        String text2=pasword.getText().toString();
        File file = null;
        text1=text1+" ";
        FileOutputStream fileOutputStream= null;
        try {
            file=getFilesDir();
            fileOutputStream = openFileOutput("abc.txt",Context.MODE_PRIVATE);
            fileOutputStream.write(text1.getBytes());
            fileOutputStream.write(text2.getBytes());
            if (fileOutputStream!=null)
            {
                fileOutputStream.close();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


        Toast.makeText(this, "welcome to varansi", Toast.LENGTH_LONG).show();
        Intent intent=new Intent(this,secondActivity.class);
        startActivity(intent);
    }


}
