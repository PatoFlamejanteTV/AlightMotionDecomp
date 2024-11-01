package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.mbridge.msdk.foundation.tools.ai;
import com.mbridge.msdk.foundation.tools.v;
import com.mbridge.msdk.widget.FeedBackButton;

/* loaded from: classes4.dex */
public class MBFeedBack extends MBTextView {
    public static String FEEDBACK_BTN_BACKGROUND_COLOR_STR = "#60000000";

    public MBFeedBack(Context context) {
        super(context);
        a();
    }

    private void a() {
        setText(v.a(getContext(), "mbridge_cm_feedback_btn_text", TypedValues.Custom.S_STRING));
        int a9 = ai.a(getContext(), 13.0f);
        setPadding(a9, 0, a9, 0);
        setTextIsSelectable(false);
        setGravity(17);
        setBackgroundColor(Color.parseColor(FEEDBACK_BTN_BACKGROUND_COLOR_STR));
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(ai.a(r0, 20.0f));
        gradientDrawable.setColor(Color.parseColor(FeedBackButton.FEEDBACK_BTN_BACKGROUND_COLOR_STR));
        setBackground(gradientDrawable);
        setTextColor(-1);
    }

    public MBFeedBack(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a();
    }

    public MBFeedBack(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        a();
    }
}
