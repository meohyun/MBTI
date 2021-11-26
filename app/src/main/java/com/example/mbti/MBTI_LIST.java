package com.example.mbti;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MBTI_LIST extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mbti_info);

        ListView listview;
        ListViewAdapter adapter;

        adapter = new ListViewAdapter();

        listview = (ListView)findViewById(R.id.listview01);
        listview.setAdapter(adapter);

        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.infp),"INFP","열정적인 중재자");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.enfp),"ENFP","재기발랄한 활동가");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.enfj),"ENFJ","정의로운 사회운동가");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.infj),"INFJ","선의의 옹호자");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.esfp),"ESFP","자유로운 영혼의 연예인");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.isfp),"ISFP","호기심 많은 예술가");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.estp),"ESTP","모험을 즐기는 사업가");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.istp),"ISTP","만능 재주꾼");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.esfj),"ESFJ","엄격한 관리자");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.isfj),"ISFJ","용감한 수호자");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.estj),"ESTJ","엄격한 관리자");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.istj),"ISTJ","청렴결백한 논리주의자");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.entp),"ENTP","뜨거운 논쟁을 즐기는 변론가");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.intp),"INTP","논리적인 사색가");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.entj),"ENTJ","대담한 통솔자");
        adapter.addItem(ContextCompat.getDrawable(this,R.drawable.intj),"INTJ","용의주도한 전략가");



        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                ListViewItem item = (ListViewItem) parent.getItemAtPosition(position);

                String titleStr = item.getTitle();
                String descStr = item.getDesc();
                Drawable iconDrawable = item.getIcon();
            }
        });
    }

}
