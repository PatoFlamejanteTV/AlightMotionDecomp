package com.mbridge.msdk.mbsignalcommon.commonwebview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.ViewCompat;
import com.mbridge.msdk.foundation.tools.ai;
import java.util.List;

/* loaded from: classes4.dex */
public class ToolBar extends LinearLayout {
    public static final String BACKWARD = "backward";
    public static final String EXITS = "exits";
    public static final String FORWARD = "forward";
    public static final String OPEN_BY_BROWSER = "open_by_browser";
    public static final String REFRESH = "refresh";
    public String title;
    public TextView titleView;

    /* loaded from: classes4.dex */
    public static class a {

        /* renamed from: b, reason: collision with root package name */
        public static int f21777b = 40;

        /* renamed from: c, reason: collision with root package name */
        public static int f21778c = 10;

        /* renamed from: a, reason: collision with root package name */
        public int f21779a;
    }

    /* loaded from: classes4.dex */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f21780a;

        /* renamed from: b, reason: collision with root package name */
        public String f21781b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f21782c = true;

        /* renamed from: d, reason: collision with root package name */
        public View.OnClickListener f21783d;

        public b(String str) {
            this.f21780a = str;
        }
    }

    public ToolBar(Context context) {
        super(context);
        a();
    }

    private void a(a aVar, List<b> list) {
        setOrientation(0);
        try {
            int a9 = ai.a(getContext(), 10.0f);
            setPadding(0, a9, ai.a(getContext(), 20.0f), a9);
        } catch (Exception unused) {
        }
        try {
            for (b bVar : list) {
                ImageView imageView = (ImageView) b();
                imageView.setTag(bVar.f21780a);
                imageView.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(bVar.f21781b, "drawable", com.mbridge.msdk.foundation.controller.c.m().g())));
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(a.f21777b, -1);
                layoutParams.setMargins(32, 0, 32, 0);
                imageView.setLayoutParams(layoutParams);
                imageView.setOnClickListener(bVar.f21783d);
                if (!bVar.f21782c) {
                    imageView.setVisibility(8);
                }
                addView(imageView);
            }
        } catch (Exception unused2) {
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

    public void hideTitle() {
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setText("");
        }
    }

    public void setButtonIcon(String str, String str2) {
        ((ImageView) findViewWithTag(str)).setImageDrawable(getResources().getDrawable(getResources().getIdentifier(str2, "drawable", com.mbridge.msdk.foundation.controller.c.m().g())));
    }

    public void setOnItemClickListener(View.OnClickListener onClickListener) {
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            getChildAt(i8).setOnClickListener(onClickListener);
        }
    }

    public void setTitle(String str, int i8) {
        this.title = str;
        if (this.titleView == null) {
            TextView textView = new TextView(getContext());
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -1);
            layoutParams.weight = 1.0f;
            textView.setLayoutParams(layoutParams);
            textView.setClickable(true);
            this.titleView = textView;
            textView.setPadding(64, 0, 10, 0);
            this.titleView.setTextColor(i8);
            addView(this.titleView, 0);
        }
        this.titleView.setText(str);
    }

    public void showTitle() {
        TextView textView = this.titleView;
        if (textView != null) {
            textView.setText(this.title);
        }
    }

    public ToolBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public ToolBar(Context context, List<b> list) {
        super(context);
        a(list);
    }

    public ToolBar(Context context, AttributeSet attributeSet, List<b> list) {
        super(context, attributeSet);
        a(list);
    }

    public ToolBar(Context context, a aVar, List<b> list) {
        super(context);
        a(aVar, list);
    }

    public ToolBar(Context context, AttributeSet attributeSet, a aVar, List<b> list) {
        super(context, attributeSet);
        a(aVar, list);
    }

    public void setTitle(String str) {
        setTitle(str, ViewCompat.MEASURED_STATE_MASK);
    }

    private void a(List<b> list) {
        setOrientation(0);
        try {
            int a9 = ai.a(getContext(), 10.0f);
            setPadding(0, a9, 0, a9);
        } catch (Exception unused) {
        }
        try {
            for (b bVar : list) {
                ImageView imageView = (ImageView) b();
                imageView.setTag(bVar.f21780a);
                imageView.setImageDrawable(getResources().getDrawable(getResources().getIdentifier(bVar.f21781b, "drawable", com.mbridge.msdk.foundation.controller.c.m().g())));
                imageView.setOnClickListener(bVar.f21783d);
                if (!bVar.f21782c) {
                    imageView.setVisibility(8);
                }
                addView(imageView);
            }
        } catch (Exception unused2) {
        }
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
            imageView.setTag(BACKWARD);
            imageView.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_backward", "drawable", com.mbridge.msdk.foundation.controller.c.m().g())));
            addView(imageView);
        } catch (Exception unused2) {
        }
        try {
            ImageView imageView2 = (ImageView) b();
            imageView2.setTag(FORWARD);
            imageView2.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_forward", "drawable", com.mbridge.msdk.foundation.controller.c.m().g())));
            addView(imageView2);
        } catch (Exception unused3) {
        }
        try {
            ImageView imageView3 = (ImageView) b();
            imageView3.setTag(REFRESH);
            imageView3.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_refresh", "drawable", com.mbridge.msdk.foundation.controller.c.m().g())));
            addView(imageView3);
        } catch (Exception unused4) {
        }
        try {
            ImageView imageView4 = (ImageView) b();
            imageView4.setTag(OPEN_BY_BROWSER);
            imageView4.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_browser", "drawable", com.mbridge.msdk.foundation.controller.c.m().g())));
            addView(imageView4);
        } catch (Exception unused5) {
        }
        try {
            ImageView imageView5 = (ImageView) b();
            imageView5.setTag(EXITS);
            imageView5.setImageDrawable(getResources().getDrawable(getResources().getIdentifier("mbridge_cm_exits", "drawable", com.mbridge.msdk.foundation.controller.c.m().g())));
            addView(imageView5);
        } catch (Exception unused6) {
        }
    }
}
