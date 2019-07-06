package android.example.diceroll;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Random;

import es.dmoral.toasty.Toasty;

public class MainActivity extends AppCompatActivity {
    ImageView dice;
    private ImageButton tap;
    private Random random=new Random();
    Animation animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        dice=findViewById(R.id.iv1);
        tap=findViewById(R.id.tap);
    }
    public void btnclick(View view){
        rotatedice();
        int a= rollDice();
        String c=String.valueOf(a);
        Toasty.success(getApplicationContext(),c, Toast.LENGTH_SHORT, true).show();
//        Toast.makeText(getApplicationContext(),c,Toast.LENGTH_SHORT).show();

    }
    private void rotatedice(){
        animation= AnimationUtils.loadAnimation(this,R.anim.animation);
        dice.startAnimation(animation);
    }

    private int rollDice(){
        int randomNumber=random.nextInt(6)+1;

        switch (randomNumber){
            case 1:
                dice.setImageResource(R.drawable.one);
                break;
            case 2:
                dice.setImageResource(R.drawable.two);
                break;
            case 3:
                dice.setImageResource(R.drawable.three);
                break;
            case 4:
                dice.setImageResource(R.drawable.four);
                break;
            case 5:
                dice.setImageResource(R.drawable.five);
                break;
            case 6:
                dice.setImageResource(R.drawable.six);
                break;
        }
        return randomNumber;
    }


}
