package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.RotateAnimation;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.same.c.b;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;

/* loaded from: classes4.dex */
public class MBridgeBaitClickView extends RelativeLayout {
    public static final int ANIMATION_TYPE_DOUBLE_CLICK = 4;
    public static final int ANIMATION_TYPE_FAST_SCALE = 1;
    public static final int ANIMATION_TYPE_ROTATE = 5;
    public static final int ANIMATION_TYPE_SLOW_SCALE = 2;
    public static final int ANIMATION_TYPE_SLOW_SCALE_WITH_PAUSE = 3;

    /* renamed from: a, reason: collision with root package name */
    private MBridgeDyImageView f19697a;

    /* renamed from: b, reason: collision with root package name */
    private MBridgeDyImageView f19698b;

    /* renamed from: c, reason: collision with root package name */
    private TextView f19699c;

    /* renamed from: d, reason: collision with root package name */
    private String f19700d;

    /* renamed from: e, reason: collision with root package name */
    private String f19701e;

    /* renamed from: f, reason: collision with root package name */
    private String f19702f;

    /* renamed from: g, reason: collision with root package name */
    private int f19703g;

    /* renamed from: h, reason: collision with root package name */
    private int f19704h;

    /* renamed from: i, reason: collision with root package name */
    private Animation f19705i;

    /* renamed from: j, reason: collision with root package name */
    private Animation f19706j;

    /* renamed from: k, reason: collision with root package name */
    private Animation f19707k;

    /* renamed from: l, reason: collision with root package name */
    private Animation f19708l;

    public MBridgeBaitClickView(Context context) {
        super(context);
        this.f19700d = "";
        this.f19701e = "";
        this.f19702f = "Click now for details";
        this.f19703g = 1;
        this.f19704h = 1342177280;
    }

    public void init(int i8) {
        this.f19703g = i8;
        init();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        clearAnimation();
        Animation animation = this.f19705i;
        if (animation != null) {
            animation.cancel();
        }
        Animation animation2 = this.f19706j;
        if (animation2 != null) {
            animation2.cancel();
        }
        Animation animation3 = this.f19707k;
        if (animation3 != null) {
            animation3.cancel();
        }
        Animation animation4 = this.f19708l;
        if (animation4 != null) {
            animation4.cancel();
        }
    }

    public void startAnimation() {
        int i8 = this.f19703g;
        if (i8 != 2) {
            if (i8 != 3) {
                if (i8 != 4) {
                    if (i8 != 5) {
                        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
                        this.f19705i = scaleAnimation;
                        scaleAnimation.setDuration(200L);
                        this.f19705i.setRepeatCount(-1);
                        this.f19705i.setRepeatMode(2);
                        MBridgeDyImageView mBridgeDyImageView = this.f19697a;
                        if (mBridgeDyImageView != null) {
                            mBridgeDyImageView.startAnimation(this.f19705i);
                        }
                        ScaleAnimation scaleAnimation2 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
                        this.f19706j = scaleAnimation2;
                        scaleAnimation2.setDuration(400L);
                        this.f19706j.setRepeatCount(-1);
                        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.3f);
                        this.f19707k = alphaAnimation;
                        alphaAnimation.setDuration(400L);
                        this.f19707k.setRepeatCount(-1);
                        AnimationSet animationSet = new AnimationSet(true);
                        animationSet.addAnimation(this.f19706j);
                        animationSet.addAnimation(this.f19707k);
                        MBridgeDyImageView mBridgeDyImageView2 = this.f19698b;
                        if (mBridgeDyImageView2 != null) {
                            mBridgeDyImageView2.startAnimation(animationSet);
                            return;
                        }
                        return;
                    }
                    RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 30.0f, 1, 0.5f, 1, 0.5f);
                    this.f19708l = rotateAnimation;
                    rotateAnimation.setDuration(300L);
                    this.f19708l.setRepeatMode(2);
                    this.f19708l.setRepeatCount(-1);
                    ScaleAnimation scaleAnimation3 = new ScaleAnimation(0.0f, 1.2f, 0.0f, 1.2f, 1, 0.5f, 1, 0.5f);
                    this.f19706j = scaleAnimation3;
                    scaleAnimation3.setDuration(600L);
                    this.f19706j.setRepeatCount(-1);
                    AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
                    this.f19707k = alphaAnimation2;
                    alphaAnimation2.setDuration(600L);
                    this.f19707k.setRepeatCount(-1);
                    AnimationSet animationSet2 = new AnimationSet(true);
                    animationSet2.addAnimation(this.f19706j);
                    animationSet2.addAnimation(this.f19707k);
                    MBridgeDyImageView mBridgeDyImageView3 = this.f19697a;
                    if (mBridgeDyImageView3 != null) {
                        mBridgeDyImageView3.startAnimation(this.f19708l);
                    }
                    MBridgeDyImageView mBridgeDyImageView4 = this.f19698b;
                    if (mBridgeDyImageView4 != null) {
                        mBridgeDyImageView4.startAnimation(animationSet2);
                        return;
                    }
                    return;
                }
                this.f19698b.setVisibility(4);
                ScaleAnimation scaleAnimation4 = new ScaleAnimation(0.8f, 1.0f, 0.8f, 1.0f, 1, 0.5f, 1, 0.5f);
                this.f19705i = scaleAnimation4;
                scaleAnimation4.setDuration(200L);
                this.f19705i.setRepeatCount(1);
                this.f19705i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5
                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationEnd(Animation animation) {
                        MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.5.1
                            @Override // java.lang.Runnable
                            public void run() {
                                if (MBridgeBaitClickView.this.f19697a != null) {
                                    MBridgeBaitClickView.this.f19697a.startAnimation(MBridgeBaitClickView.this.f19705i);
                                }
                            }
                        }, 1000L);
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationRepeat(Animation animation) {
                    }

                    @Override // android.view.animation.Animation.AnimationListener
                    public void onAnimationStart(Animation animation) {
                    }
                });
                MBridgeDyImageView mBridgeDyImageView5 = this.f19697a;
                if (mBridgeDyImageView5 != null) {
                    mBridgeDyImageView5.startAnimation(this.f19705i);
                    return;
                }
                return;
            }
            MBridgeDyImageView mBridgeDyImageView6 = this.f19698b;
            if (mBridgeDyImageView6 != null) {
                mBridgeDyImageView6.setVisibility(4);
            }
            ScaleAnimation scaleAnimation5 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
            this.f19705i = scaleAnimation5;
            scaleAnimation5.setDuration(500L);
            this.f19705i.setRepeatCount(1);
            this.f19705i.setRepeatMode(2);
            ScaleAnimation scaleAnimation6 = new ScaleAnimation(0.0f, 1.5f, 0.0f, 1.5f, 1, 0.5f, 1, 0.5f);
            this.f19706j = scaleAnimation6;
            scaleAnimation6.setDuration(1000L);
            this.f19706j.setRepeatCount(0);
            AlphaAnimation alphaAnimation3 = new AlphaAnimation(1.0f, 0.0f);
            this.f19707k = alphaAnimation3;
            alphaAnimation3.setDuration(1000L);
            this.f19707k.setRepeatCount(0);
            final AnimationSet animationSet3 = new AnimationSet(true);
            animationSet3.addAnimation(this.f19706j);
            animationSet3.addAnimation(this.f19707k);
            this.f19706j.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.3
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    if (MBridgeBaitClickView.this.f19698b != null) {
                        MBridgeBaitClickView.this.f19698b.setVisibility(4);
                    }
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    if (MBridgeBaitClickView.this.f19698b != null) {
                        MBridgeBaitClickView.this.f19698b.setVisibility(0);
                    }
                }
            });
            this.f19705i.setAnimationListener(new Animation.AnimationListener() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4
                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationEnd(Animation animation) {
                    MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.2
                        @Override // java.lang.Runnable
                        public void run() {
                            if (MBridgeBaitClickView.this.f19697a != null) {
                                MBridgeBaitClickView.this.f19697a.startAnimation(MBridgeBaitClickView.this.f19705i);
                            }
                        }
                    }, 1000L);
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationRepeat(Animation animation) {
                }

                @Override // android.view.animation.Animation.AnimationListener
                public void onAnimationStart(Animation animation) {
                    MBridgeBaitClickView.this.postDelayed(new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.4.1
                        @Override // java.lang.Runnable
                        public void run() {
                            if (MBridgeBaitClickView.this.f19698b != null) {
                                MBridgeBaitClickView.this.f19698b.startAnimation(animationSet3);
                            }
                        }
                    }, 550L);
                }
            });
            MBridgeDyImageView mBridgeDyImageView7 = this.f19697a;
            if (mBridgeDyImageView7 != null) {
                mBridgeDyImageView7.startAnimation(this.f19705i);
                return;
            }
            return;
        }
        this.f19698b.setVisibility(4);
        ScaleAnimation scaleAnimation7 = new ScaleAnimation(1.0f, 0.7f, 1.0f, 0.7f, 1, 0.5f, 1, 0.5f);
        this.f19705i = scaleAnimation7;
        scaleAnimation7.setDuration(500L);
        this.f19705i.setRepeatCount(-1);
        this.f19705i.setRepeatMode(2);
        MBridgeDyImageView mBridgeDyImageView8 = this.f19697a;
        if (mBridgeDyImageView8 != null) {
            mBridgeDyImageView8.startAnimation(this.f19705i);
        }
    }

    public void init(int i8, int i9) {
        this.f19704h = i8;
        this.f19703g = i9;
        init();
    }

    public void init(int i8, int i9, String str, String str2, String str3) {
        this.f19704h = i8;
        this.f19703g = i9;
        this.f19700d = str;
        this.f19701e = str2;
        this.f19702f = str3;
        init();
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19700d = "";
        this.f19701e = "";
        this.f19702f = "Click now for details";
        this.f19703g = 1;
        this.f19704h = 1342177280;
    }

    public void init() {
        try {
            setBackgroundColor(this.f19704h);
            try {
                this.f19702f = getContext().getResources().getConfiguration().locale.getLanguage().contains("zh") ? "点击查看详情" : "Click now for details";
            } catch (Throwable th) {
                ad.b("MBridgeAnimationClickView", th.getMessage());
            }
            RelativeLayout relativeLayout = new RelativeLayout(getContext());
            relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            int a9 = ai.a(getContext(), 55.0f);
            int a10 = ai.a(getContext(), 33.0f);
            this.f19698b = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(a9, a9);
            layoutParams.setMargins(a10, a10, 0, 0);
            this.f19698b.setLayoutParams(layoutParams);
            final int a11 = v.a(getContext(), "mbridge_icon_click_circle", "drawable");
            if (TextUtils.isEmpty(this.f19701e)) {
                this.f19698b.setImageResource(a11);
            } else {
                b.a(c.m().c()).a(this.f19700d, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.1
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.f19698b.setImageResource(a11);
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (!bitmap.isRecycled()) {
                            MBridgeBaitClickView.this.f19698b.setImageBitmap(bitmap);
                        }
                    }
                });
            }
            int a12 = ai.a(getContext(), 108.0f);
            int a13 = ai.a(getContext(), 35.0f);
            int a14 = ai.a(getContext(), 43.0f);
            this.f19697a = new MBridgeDyImageView(getContext());
            RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(a12, a12);
            layoutParams2.setMargins(a13, a14, 0, 0);
            this.f19697a.setLayoutParams(layoutParams2);
            final int a15 = v.a(getContext(), "mbridge_icon_click_hand", "drawable");
            if (TextUtils.isEmpty(this.f19700d)) {
                this.f19697a.setImageResource(a15);
            } else {
                b.a(c.m().c()).a(this.f19700d, new com.mbridge.msdk.foundation.same.c.c() { // from class: com.mbridge.msdk.dycreator.baseview.cusview.MBridgeBaitClickView.2
                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onFailedLoad(String str, String str2) {
                        MBridgeBaitClickView.this.f19697a.setImageResource(a15);
                    }

                    @Override // com.mbridge.msdk.foundation.same.c.c
                    public void onSuccessLoad(Bitmap bitmap, String str) {
                        if (!bitmap.isRecycled()) {
                            MBridgeBaitClickView.this.f19697a.setImageBitmap(bitmap);
                        }
                    }
                });
            }
            relativeLayout.addView(this.f19698b);
            relativeLayout.addView(this.f19697a);
            LinearLayout linearLayout = new LinearLayout(getContext());
            RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
            layoutParams3.addRule(13);
            linearLayout.setLayoutParams(layoutParams3);
            linearLayout.setOrientation(1);
            linearLayout.setGravity(1);
            linearLayout.addView(relativeLayout);
            this.f19699c = new TextView(getContext());
            this.f19699c.setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
            this.f19699c.setText(this.f19702f);
            this.f19699c.setTextColor(-1);
            this.f19699c.setGravity(14);
            linearLayout.addView(this.f19699c);
            addView(linearLayout);
        } catch (Throwable th2) {
            ad.b("MBridgeAnimationClickView", th2.getMessage());
        }
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f19700d = "";
        this.f19701e = "";
        this.f19702f = "Click now for details";
        this.f19703g = 1;
        this.f19704h = 1342177280;
    }

    public MBridgeBaitClickView(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        this.f19700d = "";
        this.f19701e = "";
        this.f19702f = "Click now for details";
        this.f19703g = 1;
        this.f19704h = 1342177280;
    }
}
