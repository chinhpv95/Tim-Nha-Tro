package conloncon.timnhatro;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
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
import android.view.View.OnClickListener;
import android.widget.Toast;

import conloncon.timnhatro.MainActivity;


public class Signin extends AppCompatActivity {

    public boolean CHECK_SIGNIN = false;

    EditText username, pass;
    Button login, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);


        username = (EditText) findViewById(R.id.editTextUserName);
        pass = (EditText) findViewById(R.id.editTextPassword);
        login = (Button) findViewById(R.id.button_login);
        cancel = (Button) findViewById(R.id.cancel_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = "chinh";
                String password = "chinh";
                if(username.getText().toString().equals(user) && pass.getText().toString().equals(password)) {
                    Toast.makeText(Signin.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
                    Intent intent = getIntent();
                    CHECK_SIGNIN = true;
                    intent.putExtra("isLogin", CHECK_SIGNIN);
                    setResult(RESULT_OK, intent);
                    finish();
                }
                else {
                    Toast.makeText(Signin.this, "Đăng nhập không thành công, vui lòng thử lại!", Toast.LENGTH_SHORT).show();
                    username.setText("");
                    pass.setText("");
                }
            }
        });

        //cancel button
        cancel.setOnClickListener(new OnClickListener() {
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
