package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class infp_result extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infp_result);

        Intent intent = new Intent(this.getIntent());
        int i = intent.getExtras().getInt("i");
        int e = intent.getExtras().getInt("e");
        int s = intent.getExtras().getInt("s");
        int n = intent.getExtras().getInt("n");
        int t = intent.getExtras().getInt("t");
        int f = intent.getExtras().getInt("f");
        int p = intent.getExtras().getInt("p");
        int j = intent.getExtras().getInt("j");

        TextView i_per = (TextView) findViewById(R.id.i_percent);
        TextView e_per = (TextView) findViewById(R.id.e_percent);
        TextView s_per = (TextView) findViewById(R.id.s_percent);
        TextView n_per = (TextView) findViewById(R.id.n_percent);
        TextView t_per = (TextView) findViewById(R.id.t_percent);
        TextView f_per = (TextView) findViewById(R.id.f_percent);
        TextView p_per = (TextView) findViewById(R.id.p_percent);
        TextView j_per = (TextView) findViewById(R.id.j_percent);

        i_per.setText(i + "%");
        e_per.setText(e + "%");
        s_per.setText(s + "%");
        n_per.setText(n + "%");
        t_per.setText(t + "%");
        f_per.setText(f + "%");
        p_per.setText(p + "%");
        j_per.setText(j + "%");

        ProgressBar progress_ie = (ProgressBar) findViewById(R.id.progress_ie);
        ProgressBar progress_sn = (ProgressBar) findViewById(R.id.progress_sn);
        ProgressBar progress_tf = (ProgressBar) findViewById(R.id.progress_tf);
        ProgressBar progress_pj = (ProgressBar) findViewById(R.id.progress_pj);
        progress_ie.setProgress(e);
        progress_sn.setProgress(n);
        progress_tf.setProgress(t);
        progress_pj.setProgress(j);


        Button main_button = (Button) findViewById((R.id.main_button));

        main_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });



    }


}


