package com.mbridge.msdk.video.dynview.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mbridge.msdk.foundation.tools.v;

/* loaded from: classes4.dex */
public class MBridgeLevelLayoutView extends LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    private static int f23462d = 18;

    /* renamed from: a, reason: collision with root package name */
    private double f23463a;

    /* renamed from: b, reason: collision with root package name */
    private int f23464b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f23465c;

    public MBridgeLevelLayoutView(Context context) {
        super(context);
    }

    private void a() {
        LinearLayout linearLayout;
        LinearLayout linearLayout2;
        if (this.f23465c) {
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, dip2px(getContext(), f23462d));
            linearLayout = new LinearLayout(getContext());
            linearLayout.setOrientation(0);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setLayoutParams(layoutParams);
        } else {
            linearLayout = null;
            linearLayout2 = null;
        }
        removeAllViews();
        if (linearLayout2 != null) {
            LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, dip2px(getContext(), f23462d));
            TextView textView = new TextView(getContext());
            textView.setTypeface(Typeface.defaultFromStyle(1));
            textView.setText("(");
            textView.setTextColor(Color.parseColor("#5f5f5f"));
            TextView textView2 = new TextView(getContext());
            textView2.setTypeface(Typeface.defaultFromStyle(1));
            textView2.setGravity(17);
            textView2.setTextColor(Color.parseColor("#5f5f5f"));
            Drawable drawable = getResources().getDrawable(v.a(getContext(), "mbridge_reward_user", "drawable"));
            drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
            textView2.setCompoundDrawables(drawable, null, null, null);
            textView2.setText(this.f23464b + " )");
            textView2.setEllipsize(TextUtils.TruncateAt.END);
            textView2.setLines(1);
            linearLayout2.addView(textView, layoutParams2);
            linearLayout2.addView(textView2, layoutParams2);
        }
        double d8 = this.f23463a;
        if (d8 == 0.0d) {
            d8 = 5.0d;
        }
        for (int i8 = 0; i8 < 5; i8++) {
            ImageView imageView = new ImageView(getContext());
            LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(dip2px(getContext(), 15.0f), dip2px(getContext(), f23462d));
            if (i8 < d8) {
                imageView.setImageResource(v.a(getContext(), "mbridge_download_message_dialog_star_sel", "drawable"));
            } else {
                imageView.setImageResource(v.a(getContext(), "mbridge_download_message_dilaog_star_nor", "drawable"));
            }
            layoutParams3.weight = 1.0f;
            layoutParams3.setMargins(dip2px(getContext(), 2.0f), 0, 0, 0);
            if (linearLayout != null) {
                linearLayout.addView(imageView, layoutParams3);
            } else {
                addView(imageView, layoutParams3);
            }
        }
        if (linearLayout != null) {
            addView(linearLayout);
            addView(linearLayout2);
        }
    }

    public static int dip2px(Context context, float f8) {
        Resources resources;
        if (context == null || (resources = context.getResources()) == null) {
            return 0;
        }
        return (int) ((f8 * resources.getDisplayMetrics().density) + 0.5f);
    }

    public void setRating(int i8) {
        this.f23463a = i8;
        a();
    }

    public void setRatingAndUser(double d8, int i8) {
        this.f23463a = d8;
        if (i8 == 0) {
            i8 = (int) (((Math.random() * 9.0d) + 1.0d) * 10000.0d);
        }
        this.f23464b = i8;
        this.f23465c = true;
        a();
    }

    public MBridgeLevelLayoutView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MBridgeLevelLayoutView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
