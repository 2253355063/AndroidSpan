package jamesxu.androidspan;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.TextView;

import me.jamesxu.androidspan.AndroidSpan;
import me.jamesxu.androidspan.SpanOptions;


public class MainActivity extends AppCompatActivity {

    private TextView textView;
    private AccelerateDecelerateInterpolator mSmoothInterpolator;
    private SpannableString spannableString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = (TextView) findViewById(R.id.text);
        setText();
    }

    private void setText() {
        AndroidSpan androidSpan = new AndroidSpan()
                .drawUnderlineSpan("测试文本")
                .drawRelativeSize("我要变大", 2.0f)
                .drawForegroundColor("红色的文本", Color.RED)
                .drawWithOptions("综合效果", new SpanOptions().addBackgroundColorSpan(Color.GREEN).addUnderlineSpan());
        textView.setText(androidSpan.getSpanText());

    }

}
