package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

/* loaded from: classes4.dex */
public class MBSplashShakeView extends MBLinearLayout {

    /* renamed from: a, reason: collision with root package name */
    private final String f19643a;

    /* renamed from: b, reason: collision with root package name */
    private final String f19644b;

    /* renamed from: c, reason: collision with root package name */
    private final String f19645c;

    /* renamed from: d, reason: collision with root package name */
    private final String f19646d;

    /* renamed from: e, reason: collision with root package name */
    private final String f19647e;

    /* renamed from: f, reason: collision with root package name */
    private final String f19648f;

    /* renamed from: g, reason: collision with root package name */
    private ImageView f19649g;

    /* renamed from: h, reason: collision with root package name */
    private Animation f19650h;

    public MBSplashShakeView(Context context) {
        super(context);
        this.f19643a = "浏览第三方应用";
        this.f19644b = "View";
        this.f19645c = "打开第三方应用";
        this.f19646d = "Open";
        this.f19647e = "下载第三方应用";
        this.f19648f = "Install";
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0111, code lost:            if (r11.equals("Open") == false) goto L6;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void initView(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 414
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.MBSplashShakeView.initView(java.lang.String):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.mbridge.msdk.dycreator.baseview.MBLinearLayout, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f19649g != null) {
            RotateAnimation rotateAnimation = new RotateAnimation(-10.0f, 10.0f, 1, 0.5f, 1, 0.5f);
            this.f19650h = rotateAnimation;
            rotateAnimation.setDuration(100L);
            this.f19650h.setRepeatMode(2);
            this.f19650h.setRepeatCount(-1);
            this.f19649g.startAnimation(this.f19650h);
        }
    }

    public MBSplashShakeView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19643a = "浏览第三方应用";
        this.f19644b = "View";
        this.f19645c = "打开第三方应用";
        this.f19646d = "Open";
        this.f19647e = "下载第三方应用";
        this.f19648f = "Install";
    }

    public MBSplashShakeView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f19643a = "浏览第三方应用";
        this.f19644b = "View";
        this.f19645c = "打开第三方应用";
        this.f19646d = "Open";
        this.f19647e = "下载第三方应用";
        this.f19648f = "Install";
    }
}
