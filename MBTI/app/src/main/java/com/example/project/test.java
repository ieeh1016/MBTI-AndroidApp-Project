package com.example.project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class test extends AppCompatActivity {


    private Button button1, button2, button3, button4, button5;
    int ie_sum, tf_sum, sn_sum, pj_sum = 0;
    int survey_count = 1;
    int per_i, per_e, per_s, per_n, per_t, per_f, per_p, per_j;

    Toast mToast = null; //전역변수로 선언 ①
    String mToastStr, percent_moniter;    //전역변수로 선언 ②


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);

        ProgressBar progress = (ProgressBar) findViewById(R.id.progress_percent);
        progress.setProgress(1);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);

        final TextView persent = (TextView) findViewById(R.id.percent);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data = 2;
                survey_count++;
                result(data);
                change();
                //mToastStr = "ie"+ie_sum+"tf"+tf_sum+"sn"+sn_sum+"pj"+pj_sum+"cnt"+survey_count;
                //toastShort();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data = 1;
                survey_count++;
                result(data);
                change();
                //mToastStr = "ie"+ie_sum+"tf"+tf_sum+"sn"+sn_sum+"pj"+pj_sum+"cnt"+survey_count;
                //toastShort();
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data = 0;
                survey_count++;
                result(data);
                change();
                //mToastStr = "ie"+ie_sum+"tf"+tf_sum+"sn"+sn_sum+"pj"+pj_sum+"cnt"+survey_count;
                //toastShort();
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data = -1;
                survey_count++;
                result(data);
                change();
                //mToastStr = "ie"+ie_sum+"tf"+tf_sum+"sn"+sn_sum+"pj"+pj_sum+"cnt"+survey_count;
                //toastShort();
            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int data = -2;
                survey_count++;
                result(data);
                change();
                //mToastStr = "ie"+ie_sum+"tf"+tf_sum+"sn"+sn_sum+"pj"+pj_sum+"cnt"+survey_count;
                //toastShort();
            }
        });
    }

    public void change() {
        final TextView answer = (TextView) findViewById(R.id.answer);
        final TextView percent = (TextView) findViewById(R.id.percent);

        if (survey_count == 2) answer.setText("보통 대화를 먼저 시작하지 않습니다.");
        if (survey_count == 3) answer.setText("주목받는 일에는 관심이 없습니다.");
        if (survey_count == 4) answer.setText("재미있는 책이나 비디오 게임이 \n 사교 모임보다 더 낫습니다.");
        if (survey_count == 5) answer.setText("방에 사람들이 가득찬 경우\n 방의 중앙보다는 벽 가까이에 자리합니다.");
        if (survey_count == 6) answer.setText("대게 의욕적이고 활동적입니다.");
        if (survey_count == 7) answer.setText("금방 새로운 직장 사람들과 어울리기 시작합니다.");
        if (survey_count == 8) answer.setText("정장을 요하거나 역할극 활동을 \n수반하는 사교 모임에 가는 것을 즐깁니다.");
        if (survey_count == 9) answer.setText("많은 사람들과 시간을 보낸 후에\n 에너지가 넘친다고 느낍니다.");
        if (survey_count == 10) answer.setText("종종 사회적 상황에서 주도적으로 행동합니다.");
        if (survey_count == 11) answer.setText("중요한 결정을 내려야 할 때\n 일반적으로 가슴보다 논리가 더 중요합니다.");
        if (survey_count == 12) answer.setText("논쟁에서 이기는 것이 상대방을 불쾌하지\n 않도록 하는 것보다 더 중요합니다.");
        if (survey_count == 13) answer.setText("토론 시 사람들의 민감한 반응보다\n 진실을 더 중요시해야 합니다.");
        if (survey_count == 14) answer.setText("종종 다른 사람들의 감정에 공감하기가 어렵습니다.");
        if (survey_count == 15) answer.setText("사람들 때문에 화나는 일이 거의 없습니다.");
        if (survey_count == 16) answer.setText("부모로서 자녀가 똑똑하기 보다는\n 착하게 성장하기를 바랍니다.");
        if (survey_count == 17) answer.setText("사업을 하는 경우, 충실하지만 실적을 못 내는 직원을\n 해고하기를 어려워합니다.");
        if (survey_count == 18) answer.setText("권력을 쥐는 것 보다 다른 사람들의\n 호의를 얻는 것이 더 보람 있다고 생각합니다.");
        if (survey_count == 19) answer.setText("사실이 뒷받침되는지에 상관없이\n 모든 사람의 견해가 존중되어야 한다고 생각합니다.");
        if (survey_count == 20)
            answer.setText("친구가 어떤 일로 슬퍼할 경우, 문제를 처리하는\n 방법을 제시하기보다 정신적인 지지를 제공하곤 합니다.");
        if (survey_count == 21) answer.setText("본인이 창의적이기보다\n 현실적인 사람이라고 생각합니다.");
        if (survey_count == 22) answer.setText("공상과 아이디어 때문에 흥분하는 일은 없습니다.");
        if (survey_count == 23) answer.setText("꿈이 현실 세계와 사건에 중점을 두는 경향이 있습니다.");
        if (survey_count == 24) answer.setText("자신의 행동이 다른 사람들에게 어떠한\n 영향을 주는 지에 대해 거의 걱정하지 않습니다.");
        if (survey_count == 25) answer.setText("다른 사람들이 본인의 행동에\n 영향을 주는 것을 허용하지 않습니다.");
        if (survey_count == 26) answer.setText("종종 주변을 무시하거나 잊어버리는 생각에 빠지곤 합니다.");
        if (survey_count == 27) answer.setText("종종 비현실적이고 터무니없지만\n 흥미로운 생각을 하며 시간을 보냅니다.");
        if (survey_count == 28) answer.setText("종종 인간 실존에 대한 이유를 생각합니다.");
        if (survey_count == 29) answer.setText("종종 자연 속에서 거닐고 있을 때 생각에 잠기곤 합니다.");
        if (survey_count == 30) answer.setText("항상 책, 예술 또는 영화 등 색다르고\n 다양한 해석이 가능한 것에 관심이 있습니다.");
        if (survey_count == 31) answer.setText("주의깊게 미리 계획하기 보다는 즉흥적으로 움직입니다.");
        if (survey_count == 32) answer.setText("구체적인 계획을 갖고 시간을 보내기보다는\n 다소 즉흥적으로 움직입니다.");
        if (survey_count == 33) answer.setText("업무 스타일이 체계적이고 조직적이라기보다는\n 그때그때 몰아서 처리하는 편입니다.");
        if (survey_count == 34) answer.setText("종종 물건을 제자리에 두지 않습니다.");
        if (survey_count == 35) answer.setText("시간이 부족할 때까지 일을 미루는 경향이 있습니다.");
        if (survey_count == 36) answer.setText("이메일에 가능한 빨리 회신하려고\n 하고 지저분한 편지함을 참을 수 없습니다.");
        if (survey_count == 37) answer.setText("적응을 잘 하는 것 보다 체계적인 것이 더 중요합니다.");
        if (survey_count == 38) answer.setText("집과 업무 환경이 잘 정돈되어 있습니다.");
        if (survey_count == 39) answer.setText("보통 여행 계획은 철저하게 세우는 편입니다.");
        if (survey_count == 40) {
            answer.setText("계획의 수립과 이행은\n 모든 프로젝트에서 가장 중요한 부분입니다.");

        }
        if (survey_count == 41) {
            percent.setText("40/40");



        }

        if(survey_count<=40){
        percent_moniter = survey_count + "/40";
        percent.setText(percent_moniter);}

        ProgressBar progress = (ProgressBar) findViewById(R.id.progress_percent);
        progress.setProgress(survey_count);
    }

    public void result(int data) {
        final TextView answer = (TextView) findViewById(R.id.answer);
        if (survey_count >= 1) if (survey_count <= 5) ie_sum = ie_sum + data;
        if (survey_count > 5) if (survey_count <= 10) ie_sum = ie_sum - data;
        if (survey_count > 10) if (survey_count <= 15) tf_sum = tf_sum + data;
        if (survey_count > 15) if (survey_count <= 20) tf_sum = tf_sum - data;
        if (survey_count > 20) if (survey_count <= 25) sn_sum = sn_sum + data;
        if (survey_count > 25) if (survey_count <= 30) sn_sum = sn_sum - data;
        if (survey_count > 30) if (survey_count <= 35) pj_sum = pj_sum + data;
        if (survey_count > 35) if (survey_count <= 40) pj_sum = pj_sum - data;

        if (survey_count == 41) {

            String mbti_result;
            String first_str, second_str, third_str, fourth_str;
            //int per_i, per_e, per_s, per_n, per_t, per_f, per_p, per_j;

            Toast.makeText(getApplicationContext(),"결과분석중입니다. 잠시만 기다려주세요",Toast.LENGTH_LONG);

            if (ie_sum >= 0) {
                first_str = "i";
                per_i = (ie_sum * 10)/2;
                per_e = 100 - per_i;
            } else {
                first_str = "e";
                per_e = (ie_sum * -10)/2;
                per_i = 100 - per_e;
            }

            if (sn_sum >= 0) {
                second_str = "s";
                per_s = (sn_sum * 10)/2;
                per_n = 100 - per_s;
            } else {
                second_str = "n";
                per_n = (sn_sum * -10)/2;
                per_s = 100 - per_n;
            }

            if (tf_sum >= 0) {
                third_str = "t";
                per_t = (tf_sum* 10)/2;
                per_f = 100 - per_t;
            } else {
                third_str = "f";
                per_f = (tf_sum* -10)/2;
                per_t = 100 - per_f;
            }

            if (pj_sum >= 0) {
                fourth_str = "p";
                per_p = (pj_sum * 10)/2;
                per_j = 100 - per_p;
            } else {
                fourth_str = "j";
                per_j = (pj_sum * -10)/2;
                per_p = 100 - per_j;
            }

            mbti_result = first_str + second_str + third_str + fourth_str;
            //answer.setText(mbti_result);
            change_page(mbti_result, per_i, per_e, per_s, per_n, per_t, per_f, per_p, per_j);
            //answer.setText(mbti_result);
            //Toast myToast = Toast.makeText(this.getApplicationContext(),mbti_result, Toast.LENGTH_LONG);
            //myToast.show();


        }


    }


    void toastShort() { //③
        if (mToast == null) {
            mToast = Toast.makeText(getApplicationContext(), mToastStr, Toast.LENGTH_SHORT);
        } else {
            mToast.setText(mToastStr);
        }
        mToast.show();
    }

    public void change_page(String mbti_result, int i, int e, int s, int n, int t, int f, int p, int j) {
        //String enfj = "enfj",enfp = "enfp",entj,entp,esfp,estp,infj,infp,intj,intp,isfj,isfp,istj,istp;
        if (mbti_result.equals("enfj")) {
            Intent intent = new Intent(getApplicationContext(), enfj_result.class);
            intent.putExtra("i", i);
            intent.putExtra("e", e);
            intent.putExtra("s", s);
            intent.putExtra("n", n);
            intent.putExtra("t", t);
            intent.putExtra("f", f);
            intent.putExtra("p", p);
            intent.putExtra("j", j);
            startActivity(intent);
        }

        if (mbti_result.equals("enfp")) {
            Intent intent = new Intent(getApplicationContext(), enfp_result.class);
            intent.putExtra("i", i);
            intent.putExtra("e", e);
            intent.putExtra("s", s);
            intent.putExtra("n", n);
            intent.putExtra("t", t);
            intent.putExtra("f", f);
            intent.putExtra("p", p);
            intent.putExtra("j", j);
            startActivity(intent);
        }

        if (mbti_result.equals("entj")) {
            Intent intent = new Intent(getApplicationContext(), entj_result.class);
            intent.putExtra("i", i);
            intent.putExtra("e", e);
            intent.putExtra("s", s);
            intent.putExtra("n", n);
            intent.putExtra("t", t);
            intent.putExtra("f", f);
            intent.putExtra("p", p);
            intent.putExtra("j", j);
            startActivity(intent);
        }

        if (mbti_result.equals("entp")) {
            Intent intent = new Intent(getApplicationContext(), entp_result.class);
            intent.putExtra("i", i);
            intent.putExtra("e", e);
            intent.putExtra("s", s);
            intent.putExtra("n", n);
            intent.putExtra("t", t);
            intent.putExtra("f", f);
            intent.putExtra("p", p);
            intent.putExtra("j", j);
            startActivity(intent);
        }

        if (mbti_result.equals("esfj")) {
            Intent intent = new Intent(getApplicationContext(), esfj_result.class);
            intent.putExtra("i", i);
            intent.putExtra("e", e);
            intent.putExtra("s", s);
            intent.putExtra("n", n);
            intent.putExtra("t", t);
            intent.putExtra("f", f);
            intent.putExtra("p", p);
            intent.putExtra("j", j);
            startActivity(intent);
        }

        if (mbti_result.equals("esfp")) {
            Intent intent = new Intent(getApplicationContext(), esfp_result.class);
            intent.putExtra("i", i);
            intent.putExtra("e", e);
            intent.putExtra("s", s);
            intent.putExtra("n", n);
            intent.putExtra("t", t);
            intent.putExtra("f", f);
            intent.putExtra("p", p);
            intent.putExtra("j", j);
            startActivity(intent);
        }

        if (mbti_result.equals("estp")) {
            Intent intent = new Intent(getApplicationContext(), estp_result.class);
            intent.putExtra("i", i);
            intent.putExtra("e", e);
            intent.putExtra("s", s);
            intent.putExtra("n", n);
            intent.putExtra("t", t);
            intent.putExtra("f", f);
            intent.putExtra("p", p);
            intent.putExtra("j", j);
            startActivity(intent);
        }

        if (mbti_result.equals("enfj")) {
            Intent intent = new Intent(getApplicationContext(), enfj_result.class);
            intent.putExtra("i", i);
            intent.putExtra("e", e);
            intent.putExtra("s", s);
            intent.putExtra("n", n);
            intent.putExtra("t", t);
            intent.putExtra("f", f);
            intent.putExtra("p", p);
            intent.putExtra("j", j);
            startActivity(intent);
        }

        if (mbti_result.equals("infp")) {
            Intent intent = new Intent(getApplicationContext(), infp_result.class);
            intent.putExtra("i", i);
            intent.putExtra("e", e);
            intent.putExtra("s", s);
            intent.putExtra("n", n);
            intent.putExtra("t", t);
            intent.putExtra("f", f);
            intent.putExtra("p", p);
            intent.putExtra("j", j);
            startActivity(intent);
        }

        if (mbti_result == "intj") {
            Intent intent = new Intent(getApplicationContext(), infj_result.class);
            intent.putExtra("i", i);
            intent.putExtra("e", e);
            intent.putExtra("s", s);
            intent.putExtra("n", n);
            intent.putExtra("t", t);
            intent.putExtra("f", f);
            intent.putExtra("p", p);
            intent.putExtra("j", j);
            startActivity(intent);
        }

        if (mbti_result.equals("intp")) {
            Intent intent = new Intent(getApplicationContext(), intp_result.class);
            intent.putExtra("i", i);
            intent.putExtra("e", e);
            intent.putExtra("s", s);
            intent.putExtra("n", n);
            intent.putExtra("t", t);
            intent.putExtra("f", f);
            intent.putExtra("p", p);
            intent.putExtra("j", j);
            startActivity(intent);
        }

        if (mbti_result.equals("isfj")) {
            Intent intent = new Intent(getApplicationContext(), isfj_result.class);
            intent.putExtra("i", i);
            intent.putExtra("e", e);
            intent.putExtra("s", s);
            intent.putExtra("n", n);
            intent.putExtra("t", t);
            intent.putExtra("f", f);
            intent.putExtra("p", p);
            intent.putExtra("j", j);
            startActivity(intent);
        }

        if (mbti_result.equals("isfp")) {
            Intent intent = new Intent(getApplicationContext(), isfp_result.class);
            intent.putExtra("i", i);
            intent.putExtra("e", e);
            intent.putExtra("s", s);
            intent.putExtra("n", n);
            intent.putExtra("t", t);
            intent.putExtra("f", f);
            intent.putExtra("p", p);
            intent.putExtra("j", j);
            startActivity(intent);
        }

        if (mbti_result.equals("istj")) {
            Intent intent = new Intent(getApplicationContext(), istj_result.class);
            intent.putExtra("i", i);
            intent.putExtra("e", e);
            intent.putExtra("s", s);
            intent.putExtra("n", n);
            intent.putExtra("t", t);
            intent.putExtra("f", f);
            intent.putExtra("p", p);
            intent.putExtra("j", j);
            startActivity(intent);
        }

        if (mbti_result.equals("istp")) {
            Intent intent = new Intent(getApplicationContext(), istp_result.class);
            intent.putExtra("i", i);
            intent.putExtra("e", e);
            intent.putExtra("s", s);
            intent.putExtra("n", n);
            intent.putExtra("t", t);
            intent.putExtra("f", f);
            intent.putExtra("p", p);
            intent.putExtra("j", j);
            startActivity(intent);
        }
    }
}


