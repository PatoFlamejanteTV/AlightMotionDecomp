package com.mbridge.msdk.dycreator.baseview;

import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;

/* loaded from: classes4.dex */
public class GradientOrientationUtils {
    public static GradientDrawable.Orientation getOrientation(String str) {
        try {
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            if (!TextUtils.equals(str, orientation.name())) {
                GradientDrawable.Orientation orientation2 = GradientDrawable.Orientation.BL_TR;
                if (!TextUtils.equals(str, orientation2.name())) {
                    orientation2 = GradientDrawable.Orientation.BOTTOM_TOP;
                    if (!TextUtils.equals(str, orientation2.name())) {
                        orientation2 = GradientDrawable.Orientation.BR_TL;
                        if (!TextUtils.equals(str, orientation2.name())) {
                            GradientDrawable.Orientation orientation3 = GradientDrawable.Orientation.LEFT_RIGHT;
                            if (!TextUtils.equals(str, orientation3.name())) {
                                orientation3 = GradientDrawable.Orientation.RIGHT_LEFT;
                                if (!TextUtils.equals(str, orientation3.name())) {
                                    orientation3 = GradientDrawable.Orientation.TL_BR;
                                    if (!TextUtils.equals(str, orientation3.name())) {
                                        if (!TextUtils.equals(str, orientation2.name())) {
                                            return orientation;
                                        }
                                    }
                                }
                            }
                            return orientation3;
                        }
                    }
                }
                return orientation2;
            }
            return orientation;
        } catch (Exception unused) {
            return GradientDrawable.Orientation.TOP_BOTTOM;
        }
    }
}
