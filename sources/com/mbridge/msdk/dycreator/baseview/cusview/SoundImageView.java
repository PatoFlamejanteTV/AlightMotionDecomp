package com.mbridge.msdk.dycreator.baseview.cusview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.mbridge.msdk.foundation.tools.v;

/* loaded from: classes4.dex */
public class SoundImageView extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    private boolean f19753a;

    public SoundImageView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f19753a = true;
    }

    public boolean getStatus() {
        return this.f19753a;
    }

    public void setSoundStatus(boolean z8) {
        this.f19753a = z8;
        if (z8) {
            setImageResource(v.a(getContext(), "mbridge_reward_sound_open", "drawable"));
        } else {
            setImageResource(v.a(getContext(), "mbridge_reward_sound_close", "drawable"));
        }
    }

    public SoundImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f19753a = true;
    }

    public SoundImageView(Context context) {
        super(context);
        this.f19753a = true;
    }
}
