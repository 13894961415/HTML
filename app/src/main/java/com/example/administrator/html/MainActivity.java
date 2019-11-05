package com.example.administrator.html;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView)this.findViewById(R.id.text);

        String  html = "想到你的名字心就会砰砰的跳看到你的笑容脸就会火辣辣烧！你知道么？我被你彻底迷倒！发誓要和你一起变老";
     CharSequence charSequence = Html.fromHtml(html);
     textView1.setText(charSequence);
     textView1.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
