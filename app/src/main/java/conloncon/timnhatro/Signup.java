package conloncon.timnhatro;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Signup extends AppCompatActivity{

    EditText textUser, textPass, textPassAgain, textEmail, textPhone;
    Button confirm, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);



        confirm = (Button) findViewById(R.id.button_confirm);
        cancel = (Button) findViewById(R.id.cancel_button);
        textUser = (EditText) findViewById(R.id.editTextUserName);
        textPass = (EditText) findViewById(R.id.editTextPassword);
        textPassAgain = (EditText) findViewById(R.id.editTextPasswordAgain);
        textEmail = (EditText) findViewById(R.id.editTextEmail);
        textPhone = (EditText) findViewById(R.id.editTextPhone);

        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //control button
        confirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textPass.toString().equals(textPassAgain.toString())) {
                    Toast.makeText(Signup.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();

                }
                else
                    Toast.makeText(Signup.this, "Đăng ký không thành công", Toast.LENGTH_SHORT).show();
            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_CANCELED);
                finish();
            }
        });

        android.support.v7.app.ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_search) {
        }

        else if (id == R.id.filter_search){

        }

        return super.onOptionsItemSelected(item);
    }


}
