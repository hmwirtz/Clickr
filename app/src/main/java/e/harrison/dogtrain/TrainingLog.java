package e.harrison.dogtrain;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class TrainingLog extends AppCompatActivity {

    String sitCounter;
    Button test;
    TextView testView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_training_log);

        Intent intent = getIntent();
        test = findViewById(R.id.testButton);
        test.setOnClickListener(testListener);


    }

   public void getCounter(){

        Intent intent = getIntent();

        sitCounter = intent.getExtras().getString("counterUpdated");

        testView.setText(sitCounter);


   }

   View.OnClickListener testListener = new View.OnClickListener() {
       @Override
       public void onClick(View view) {
           getCounter();

       }
   };

}

