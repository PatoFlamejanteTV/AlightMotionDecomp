package com.mbridge.msdk.video.dynview.i.b;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import com.mbridge.msdk.foundation.tools.ai;

/* loaded from: classes4.dex */
public final class a {
    public static void a(View view, float f8, float f9, String str, String[] strArr, GradientDrawable.Orientation orientation) {
        if (view != null && strArr != null) {
            int[] iArr = new int[strArr.length];
            for (int i8 = 0; i8 < strArr.length; i8++) {
                iArr[i8] = Color.parseColor(strArr[i8]);
            }
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, iArr);
            gradientDrawable.setCornerRadius(ai.a(view.getContext(), f9));
            gradientDrawable.setStroke(ai.a(view.getContext(), f8), Color.parseColor(str));
            view.setBackground(gradientDrawable);
        }
    }
}
