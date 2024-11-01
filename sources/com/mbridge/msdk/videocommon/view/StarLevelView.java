package com.mbridge.msdk.videocommon.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.mbridge.msdk.foundation.tools.v;

/* loaded from: classes4.dex */
public class StarLevelView extends LinearLayout {
    public StarLevelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOrientation(0);
    }

    public void initScore(double d8) {
        for (int i8 = 0; i8 < ((int) d8); i8++) {
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(v.a(getContext(), "mbridge_video_common_full_star", "drawable"));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            if (i8 != 0) {
                layoutParams.setMargins(5, 0, 5, 0);
            }
            addView(imageView, layoutParams);
        }
        int i9 = (int) (50.0d - (d8 * 10.0d));
        if (i9 <= 0) {
            return;
        }
        if (i9 > 1 && i9 < 10) {
            if (i9 > 0 && i9 < 5) {
                ImageView imageView2 = new ImageView(getContext());
                imageView2.setImageResource(v.a(getContext(), "mbridge_video_common_full_star", "drawable"));
                LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams2.setMargins(5, 0, 5, 0);
                addView(imageView2, layoutParams2);
            } else {
                ImageView imageView3 = new ImageView(getContext());
                imageView3.setImageResource(v.a(getContext(), "mbridge_video_common_full_star", "drawable"));
                LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams3.setMargins(5, 0, 5, 0);
                addView(imageView3, layoutParams3);
            }
        }
        int i10 = i9 / 10;
        if (i10 >= 1) {
            int i11 = i9 % (i10 * 10);
            if (i11 > 0 && i11 < 5) {
                ImageView imageView4 = new ImageView(getContext());
                imageView4.setImageResource(v.a(getContext(), "mbridge_video_common_full_while_star", "drawable"));
                LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams4.setMargins(5, 0, 5, 0);
                addView(imageView4, layoutParams4);
            } else if (i11 >= 5 && i11 <= 9) {
                ImageView imageView5 = new ImageView(getContext());
                imageView5.setImageResource(v.a(getContext(), "mbridge_video_common_half_star", "drawable"));
                LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams5.setMargins(5, 0, 5, 0);
                addView(imageView5, layoutParams5);
            }
            for (int i12 = 0; i12 < i10; i12++) {
                ImageView imageView6 = new ImageView(getContext());
                imageView6.setImageResource(v.a(getContext(), "mbridge_video_common_full_while_star", "drawable"));
                LinearLayout.LayoutParams layoutParams6 = new LinearLayout.LayoutParams(-2, -2);
                layoutParams6.setMargins(5, 0, 5, 0);
                addView(imageView6, layoutParams6);
            }
        }
    }

    public StarLevelView(Context context) {
        super(context);
        setOrientation(0);
    }

    public StarLevelView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        setOrientation(0);
    }
}
