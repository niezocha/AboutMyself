package janicka.zofia.aboutmyself;

import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.SwipeDismissBehavior;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private boolean isMyCard;

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

    }
}
