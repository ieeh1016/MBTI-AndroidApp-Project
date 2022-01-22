package com.example.project;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class test extends AppCompatActivity {



    private Button button1, button2, button3, button4, button5;
    int ie_sum,tf_sum,sn_sum,pj_sum=0;
    int survey_count=1;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);


        final TextView answer = (TextView)findViewById(R.id.answer);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data=4;
                ie_sum=ie_sum+data;
                survey_count++;
                if(survey_count==2){
                    answer.setText("보통 대화를 먼저 시작하지 않습니다");
                }
                else if(survey_count==3){
                    answer.setText("주목받는 일에는 관심이 없습니다");
                }
                else if(survey_count==4){
                    answer.setText("재미있는 책이나 비디오 게임이 종종 사교 모임보다 더 낫습니다");
                }
                else if(survey_count==5){
                    answer.setText("방에 사람들이 가득찬 경우 방의 중앙보다는 벽 가까이에 자리합니다");
                }
                else if(survey_count==6){
                    answer.setText("대게 의욕적이고 활동적입니다");
                }
                else if(survey_count==7){
                    answer.setText("금방 새로운 직장 사람들과 어울리기 시작합니다");
                }
                else if(survey_count==8){
                    answer.setText("정장을 요하거나 역할극 활동을 수반하는 사교 모임에 가는 것을 즐깁니다");
                }
                else if(survey_count==9){
                    answer.setText("많은 사람들과 시간을 보낸 후에 에너지가 넘친다고 느낍니다");
                }
                else if(survey_count==10){
                    answer.setText("종종 사회적 상황에서 주도적으로 행동합니다");
                }

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data=3;
                ie_sum=ie_sum+data;
                survey_count++;
                if(survey_count==2){
                    answer.setText("보통 대화를 먼저 시작하지 않습니다");
                }
                else if(survey_count==3){
                    answer.setText("주목받는 일에는 관심이 없습니다");
                }
                else if(survey_count==4){
                    answer.setText("재미있는 책이나 비디오 게임이 종종 사교 모임보다 더 낫습니다");
                }
                else if(survey_count==5){
                    answer.setText("방에 사람들이 가득찬 경우 방의 중앙보다는 벽 가까이에 자리합니다");
                }
                else if(survey_count==6){
                    answer.setText("대게 의욕적이고 활동적입니다");
                }
                else if(survey_count==7){
                    answer.setText("금방 새로운 직장 사람들과 어울리기 시작합니다");
                }
                else if(survey_count==8){
                    answer.setText("정장을 요하거나 역할극 활동을 수반하는 사교 모임에 가는 것을 즐깁니다");
                }
                else if(survey_count==9){
                    answer.setText("많은 사람들과 시간을 보낸 후에 에너지가 넘친다고 느낍니다");
                }
                else if(survey_count==10){
                    answer.setText("종종 사회적 상황에서 주도적으로 행동합니다");
                }



            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data=2;
                ie_sum=ie_sum+data;
                survey_count++;
                if(survey_count==2){
                    answer.setText("보통 대화를 먼저 시작하지 않습니다");
                }
                else if(survey_count==3){
                    answer.setText("주목받는 일에는 관심이 없습니다");
                }
                else if(survey_count==4){
                    answer.setText("재미있는 책이나 비디오 게임이 종종 사교 모임보다 더 낫습니다");
                }
                else if(survey_count==5){
                    answer.setText("방에 사람들이 가득찬 경우 방의 중앙보다는 벽 가까이에 자리합니다");
                }
                else if(survey_count==6){
                    answer.setText("대게 의욕적이고 활동적입니다");
                }
                else if(survey_count==7){
                    answer.setText("금방 새로운 직장 사람들과 어울리기 시작합니다");
                }
                else if(survey_count==8){
                    answer.setText("정장을 요하거나 역할극 활동을 수반하는 사교 모임에 가는 것을 즐깁니다");
                }
                else if(survey_count==9){
                    answer.setText("많은 사람들과 시간을 보낸 후에 에너지가 넘친다고 느낍니다");
                }
                else if(survey_count==10){
                    answer.setText("종종 사회적 상황에서 주도적으로 행동합니다");
                }
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data=1;
                ie_sum=ie_sum+data;
                survey_count++;
                if(survey_count==2){
                    answer.setText("보통 대화를 먼저 시작하지 않습니다");
                }
                else if(survey_count==3){
                    answer.setText("주목받는 일에는 관심이 없습니다");
                }
                else if(survey_count==4){
                    answer.setText("재미있는 책이나 비디오 게임이 종종 사교 모임보다 더 낫습니다");
                }
                else if(survey_count==5){
                    answer.setText("방에 사람들이 가득찬 경우 방의 중앙보다는 벽 가까이에 자리합니다");
                }
                else if(survey_count==6){
                    answer.setText("대게 의욕적이고 활동적입니다");
                }
                else if(survey_count==7){
                    answer.setText("금방 새로운 직장 사람들과 어울리기 시작합니다");
                }
                else if(survey_count==8){
                    answer.setText("정장을 요하거나 역할극 활동을 수반하는 사교 모임에 가는 것을 즐깁니다");
                }
                else if(survey_count==9){
                    answer.setText("많은 사람들과 시간을 보낸 후에 에너지가 넘친다고 느낍니다");
                }
                else if(survey_count==10){
                    answer.setText("종종 사회적 상황에서 주도적으로 행동합니다");
                }
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data=0;
                ie_sum=ie_sum+data;
                survey_count++;
                if(survey_count==2){
                    answer.setText("보통 대화를 먼저 시작하지 않습니다");
                }
                else if(survey_count==3){
                    answer.setText("주목받는 일에는 관심이 없습니다");
                }
                else if(survey_count==4){
                    answer.setText("재미있는 책이나 비디오 게임이 종종 사교 모임보다 더 낫습니다");
                }
                else if(survey_count==5){
                    answer.setText("방에 사람들이 가득찬 경우 방의 중앙보다는 벽 가까이에 자리합니다");
                }
                else if(survey_count==6){
                    answer.setText("대게 의욕적이고 활동적입니다");
                }
                else if(survey_count==7){
                    answer.setText("금방 새로운 직장 사람들과 어울리기 시작합니다");
                }
                else if(survey_count==8){
                    answer.setText("정장을 요하거나 역할극 활동을 수반하는 사교 모임에 가는 것을 즐깁니다");
                }
                else if(survey_count==9){
                    answer.setText("많은 사람들과 시간을 보낸 후에 에너지가 넘친다고 느낍니다");
                }
                else if(survey_count==10){
                    answer.setText("종종 사회적 상황에서 주도적으로 행동합니다");
                }
            }
        });


    }

}

