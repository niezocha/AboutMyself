package janicka.zofia.aboutmyself;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import java.io.File;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private boolean isMyCard;
    private boolean isProfile;
    private boolean isContact;
    private boolean isExp;
    private boolean isEdu;
    private boolean isJava;
    private boolean isSkills;
    private boolean isTools;
    private boolean isLang;
    private boolean isHobby;

    @BindView(R.id.my_card_view)
    CardView myCadrView;
    @BindView(R.id.floating_button)
    FloatingActionButton floatingButton;
    @BindView(R.id.mailing_button)
    ImageButton maillingButton;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.edittext_mailto)
    EditText editText;
    @BindView(R.id.profile)
    TextView profileTV;
    @BindView(R.id.contact)
    TextView contactTV;
    @BindView(R.id.experience)
    TextView expTV;
    @BindView(R.id.education)
    TextView eduTV;
    @BindView(R.id.java)
    TextView javaTV;
    @BindView(R.id.skills)
    TextView skillsTV;
    @BindView(R.id.tools)
    TextView toolsTV;
    @BindView(R.id.lang)
    TextView langTV;
    @BindView(R.id.hobby)
    TextView hobbyTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

    }

    @OnClick(R.id.profile)
    void onProfileClick() {
        isProfile = onItemClick(isProfile, findViewById(R.id.profile_text));
    }

    @OnClick(R.id.contact)
    void onContactClick() {
        isContact = onItemClick(isContact, findViewById(R.id.contact_text));
    }

    @OnClick(R.id.experience)
    void onExpClick() {
        isExp = onItemClick(isExp, findViewById(R.id.exp_text));
    }

    @OnClick(R.id.education)
    void onEduClick() {
        isEdu = onItemClick(isEdu, findViewById(R.id.edu_text));
    }

    @OnClick(R.id.java)
    void onJavaClick() {
        isJava = onItemClick(isJava, findViewById(R.id.java_text));
    }

    @OnClick(R.id.skills)
    void onSkillsClick() {
        isSkills = onItemClick(isSkills, findViewById(R.id.skills_text));
    }

    @OnClick(R.id.tools)
    void onToolsClick() {
        isTools = onItemClick(isTools, findViewById(R.id.tools_text));
    }

    @OnClick(R.id.lang)
    void onLangClick() {
        isLang = onItemClick(isLang, findViewById(R.id.lang_text));
    }

    @OnClick(R.id.hobby)
    void onHobbyClick() {
        isHobby = onItemClick(isHobby, findViewById(R.id.hobby_text));
    }

    @OnClick(R.id.floating_button)
    void onFloatingButtonClick() {
        isMyCard = onItemClick(isMyCard, myCadrView);
    }

    @OnClick(R.id.mailing_button)
    void onMailingButtonClick() {
        mailing();
    }


    private void mailing() {

        //dodac wysyłanie pdf'a

//        Uri uri = Uri.parse("file://" + myFile.getAbsolutePath());
//
//        Intent email = new Intent(Intent.ACTION_SEND);
//        email.putExtra(Intent.EXTRA_SUBJECT, mSubjectEditText.getText().toString());
//        email.putExtra(Intent.EXTRA_TEXT, mBodyEditText.getText().toString());
//        email.putExtra(Intent.EXTRA_STREAM, uri);
//        email.setType("message/rfc822");
//        startActivity(email);
    }

    private boolean onItemClick(Boolean isClicked, View view){
        if (!isClicked) {
            view.setVisibility(View.VISIBLE);
            return true;
        } else {
            view.setVisibility(View.GONE);
            return false;
        }
    }

    private String getEmail(){
        return editText.getText().toString();
    }

}
