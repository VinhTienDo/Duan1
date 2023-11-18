package fpoly.hoangphph35249.duan1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {
    EditText edUserName, edPassWord;
    Button btnLogin, btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

         edUserName = findViewById(R.id.edUserName);
         edPassWord = findViewById(R.id.edPassword);
         btnLogin = findViewById(R.id.btnLogin);
         btnRegister = findViewById(R.id.btnRegister);
    }
}