package conloncon.timnhatro;

import android.app.Activity;
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


public class Post extends AppCompatActivity {

    EditText address, square, price, info, extra_info;
    Button post, cancel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.post);

        connectView();
    }

    public void connectView(){
        post = (Button) findViewById(R.id.post_button);
        cancel = (Button) findViewById(R.id.cancel_button);
        address = (EditText) findViewById(R.id.editTextAddress);
        square = (EditText) findViewById(R.id.editTextSquare);
        price = (EditText) findViewById(R.id.editTextPrice);
        info = (EditText) findViewById(R.id.editTextInfo);
        extra_info = (EditText) findViewById(R.id.editTextExtraInfo);

        post.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(address.getText().toString().equals("")
                        && square.getText().toString().equals(0)
                        && price.getText().toString().equals(0)
                        && info.getText().toString().equals("")
                        && extra_info.getText().toString().equals("")) {
                    Toast.makeText(Post.this, "Đăng bài thành công", Toast.LENGTH_SHORT).show();
                    finish();
                }
                else
                    Toast.makeText(Post.this, "Đăng bài không thành công, vui lòng thử lại!", Toast.LENGTH_SHORT).show();
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