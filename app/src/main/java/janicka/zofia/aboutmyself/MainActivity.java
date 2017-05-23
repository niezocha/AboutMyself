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
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

//    private boolean isMyCard;
//    private String mailAddress;
//    @BindView(R.id.my_card_view)
//    CardView myCadrView;
//    @BindView(R.id.floating_button)
//    FloatingActionButton floatingButton;
//    @BindView(R.id.mailing_button)
//    ImageButton maillingButton;

    private boolean profile;
    private boolean contact;
    private boolean exp;
    private boolean edu;
    private boolean java;
    private boolean skills;
    private boolean tools;
    private boolean lang;
    private boolean hobby;

    @BindView(R.id.toolbar)
    Toolbar toolbar;

    @BindView(R.id.card_profile)
    CardView profileCard;

    @BindView(R.id.card_contact)
    CardView contactCard;

    @BindView(R.id.card_exp)
    CardView expCard;

    @BindView(R.id.card_edu)
    CardView eduCard;

    @BindView(R.id.card_java)
    CardView javaCard;

    @BindView(R.id.card_skills)
    CardView skillsCard;

    @BindView(R.id.card_tools)
    CardView toolsCard;

    @BindView(R.id.card_lang)
    CardView langCard;

    @BindView(R.id.card_hobby)
    CardView hobbyCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setSupportActionBar(toolbar);

    }

    @OnClick(R.id.card_profile)
    void onProfileCardClick(){
        if(!profile){
            findViewById(R.id.profile_text).setVisibility(View.VISIBLE);
            profile = true;
        } else{
            findViewById(R.id.profile_text).setVisibility(View.GONE);
            profile = false;
        }
    }

    @OnClick(R.id.card_contact)
    void onContactCardClick() {
        if (!contact) {
            findViewById(R.id.contact_text).setVisibility(View.VISIBLE);
            contact = true;
        } else {
            findViewById(R.id.contact_text).setVisibility(View.GONE);
            contact = false;
        }
    }

    @OnClick(R.id.card_exp)
    void onExpCardClick() {
        if (!exp) {
            findViewById(R.id.exp_text).setVisibility(View.VISIBLE);
            exp = true;
        } else {
            findViewById(R.id.exp_text).setVisibility(View.GONE);
            exp = false;
        }
    }

    @OnClick(R.id.card_edu)
    void onEduCardClick() {
        if (!edu) {
            findViewById(R.id.edu_text).setVisibility(View.VISIBLE);
            edu = true;
        } else {
            findViewById(R.id.edu_text).setVisibility(View.GONE);
            edu = false;
        }
    }

    @OnClick(R.id.card_java)
    void onJavaCardClick() {
        if (!java) {
            findViewById(R.id.java_text).setVisibility(View.VISIBLE);
            java = true;
        } else {
            findViewById(R.id.java_text).setVisibility(View.GONE);
            java = false;
        }
    }

    @OnClick(R.id.card_skills)
    void onSkillsCardClick() {
        if (!skills) {
            findViewById(R.id.skills_text).setVisibility(View.VISIBLE);
            skills = true;
        } else {
            findViewById(R.id.skills_text).setVisibility(View.GONE);
            skills = false;
        }
    }

    @OnClick(R.id.card_tools)
    void onToolsCardClick() {
        if (!tools) {
            findViewById(R.id.tools_text).setVisibility(View.VISIBLE);
            tools = true;
        } else {
            findViewById(R.id.tools_text).setVisibility(View.GONE);
            tools = false;
        }
    }

    @OnClick(R.id.card_lang)
    void onLangCardClick() {
        if (!lang) {
            findViewById(R.id.lang_text).setVisibility(View.VISIBLE);
            lang = true;
        } else {
            findViewById(R.id.lang_text).setVisibility(View.GONE);
            lang = false;
        }
    }

    @OnClick(R.id.card_hobby)
    void onHobbyCardClick() {
        if (!hobby) {
            findViewById(R.id.hobby_text).setVisibility(View.VISIBLE);
            hobby = true;
        } else {
            findViewById(R.id.hobby_text).setVisibility(View.GONE);
            hobby = false;
        }
    }

//    private void mailing(){
//        //metoda wysyłająca maila z pdf'em
//    }
//
//    @OnClick(R.id.mailing_button)
//    void onMailingButtonClick(){
//        mailing();
//    }
//
//    @OnClick(R.id.floating_button)
//    void onFloatingButtonClick() {
//        if(!isMyCard){
//            myCadrView.setVisibility(View.VISIBLE);
//            isMyCard=true;
//        } else{
//            myCadrView.setVisibility(View.GONE);
//            isMyCard=false;
//        }
//    }
}
