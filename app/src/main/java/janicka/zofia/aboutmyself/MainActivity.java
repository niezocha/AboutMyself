package janicka.zofia.aboutmyself;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean isMyCard;
    private String mailAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        final CardView myCadrView = (CardView) findViewById(R.id.my_card_view);

        FloatingActionButton floatingButton = (FloatingActionButton) findViewById(R.id.floating_button);
        floatingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!isMyCard){
                    myCadrView.setVisibility(View.VISIBLE);
                    isMyCard=true;
                } else{
                    myCadrView.setVisibility(View.GONE);
                    isMyCard=false;
                }
            }
        });

        ImageButton maillingButton = (ImageButton) findViewById(R.id.mailing_button);
        maillingButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText editText = (EditText) findViewById(R.id.edittext_mailto);
                mailAddress = editText.getText().toString();
                mailing();
            }
        });
    }

    private void mailing(){

        //do dopracowania
        Intent emailIntent = new Intent(android.content.Intent.ACTION_SEND);
        emailIntent.setType("image/*");
        emailIntent.putExtra(android.content.Intent.EXTRA_EMAIL, new String[] {mailAddress});
        emailIntent.putExtra(android.content.Intent.EXTRA_SUBJECT, R.string.mail_subject);
        emailIntent.putExtra(android.content.Intent.EXTRA_TEXT, R.string.mail_text);
        emailIntent.putExtra(Intent.EXTRA_STREAM, Uri.parse("C:\\Users\\Zofia\\AndroidStudioProjects\\AboutMyself\\app\\src\\main\\res\\raw\\zofia_janicka_cv.bmp"));
        startActivity(Intent.createChooser(emailIntent, "Send mail..."));

    }
}
