package com.mbridge.msdk.foundation.webview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.tools.ai;

/* loaded from: classes4.dex */
public class ToolBar extends LinearLayout {
    public ToolBar(Context context) {
        super(context);
        a();
    }

    private void a() {
        setOrientation(0);
        try {
            int a9 = ai.a(getContext(), 10.0f);
            setPadding(0, a9, 0, a9);
        } catch (Exception unused) {
        }
        try {
            ImageView imageView = (ImageView) b();
            imageView.setTag(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.BACKWARD);
            imageView.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_backward", "drawable", com.mbridge.msdk.foundation.controller.c.m().g())));
            addView(imageView);
        } catch (Exception unused2) {
        }
        try {
            ImageView imageView2 = (ImageView) b();
            imageView2.setTag(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.FORWARD);
            imageView2.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_forward", "drawable", com.mbridge.msdk.foundation.controller.c.m().g())));
            addView(imageView2);
        } catch (Exception unused3) {
        }
        try {
            ImageView imageView3 = (ImageView) b();
            imageView3.setTag(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.REFRESH);
            imageView3.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_refresh", "drawable", com.mbridge.msdk.foundation.controller.c.m().g())));
            addView(imageView3);
        } catch (Exception unused4) {
        }
        try {
            ImageView imageView4 = (ImageView) b();
            imageView4.setTag(com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar.EXITS);
            imageView4.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_exits", "drawable", com.mbridge.msdk.foundation.controller.c.m().g())));
            addView(imageView4);
        } catch (Exception unused5) {
        }
    }

    private View b() {
        ImageView imageView = new ImageView(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
        layoutParams.weight = 1.0f;
        imageView.setLayoutParams(layoutParams);
        imageView.setClickable(true);
        return imageView;
    }

    public View getItem(String str) {
        return findViewWithTag(str);
    }

    public void setOnItemClickListener(View.OnClickListener onClickListener) {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            getChildAt(i8).setOnClickListener(onClickListener);
        }
    }

    public ToolBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }
}
