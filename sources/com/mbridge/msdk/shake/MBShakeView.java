package com.mbridge.msdk.shake;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.ai;

/* loaded from: classes4.dex */
public class MBShakeView extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private Animation f22968a;

    /* renamed from: b, reason: collision with root package name */
    private ImageView f22969b;

    public MBShakeView(Context context) {
        super(context);
    }

    public void initView(String str) {
        initView(str, false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 10.0f, 1, 0.5f, 1, 0.5f);
        this.f22968a = rotateAnimation;
        rotateAnimation.setDuration(100L);
        this.f22968a.setRepeatMode(2);
        this.f22968a.setRepeatCount(-1);
        this.f22969b.startAnimation(this.f22968a);
    }

    public MBShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void initView(String str, boolean z8) {
        setOrientation(1);
        setGravity(1);
        View imageView = new ImageView(getContext());
        imageView.setLayoutParams(new LinearLayout.LayoutParams(ai.a(getContext(), z8 ? 60.0f : 80.0f), ai.a(getContext(), z8 ? 60.0f : 80.0f)));
        int parseColor = Color.parseColor("#80000000");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(parseColor);
        gradientDrawable.setCornerRadius(200);
        imageView.setBackground(gradientDrawable);
        this.f22969b = new ImageView(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ai.a(getContext(), z8 ? 20.0f : 40.0f), ai.a(getContext(), z8 ? 20.0f : 40.0f));
        layoutParams.gravity = 17;
        this.f22969b.setLayoutParams(layoutParams);
        this.f22969b.setImageResource(getResources().getIdentifier("mbridge_cm_btn_shake", "drawable", c.m().g()));
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        frameLayout.addView(imageView);
        frameLayout.addView(this.f22969b);
        TextView textView = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = ai.a(getContext(), 10.0f);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        if (getContext().getResources().getConfiguration().locale.getLanguage().contains("zh")) {
            textView.setText("摇动手机 或 点击图标");
        } else {
            textView.setText("Shake your phone");
        }
        textView.setTextSize(z8 ? 16.0f : 20.0f);
        textView.setTextColor(-1);
        textView.setShadowLayer(8.0f, 3.0f, 3.0f, ViewCompat.MEASURED_STATE_MASK);
        if (TextUtils.isEmpty(str)) {
            str = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "浏览第三方应用" : "Redirect to third party application";
        }
        TextView textView2 = new TextView(getContext());
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.topMargin = ai.a(getContext(), 5.0f);
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(17);
        textView2.setText(str);
        textView2.setTextSize(z8 ? 12.0f : 16.0f);
        textView2.setTextColor(-1);
        textView2.setShadowLayer(8.0f, 3.0f, 3.0f, ViewCompat.MEASURED_STATE_MASK);
        addView(frameLayout);
        addView(textView);
        addView(textView2);
    }

    public MBShakeView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }

    public MBShakeView(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
    }
}
