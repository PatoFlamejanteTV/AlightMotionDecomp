package com.mbridge.msdk.widget;

import android.view.View;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.AdaptiveTrackSelection;
import java.util.Calendar;

/* loaded from: classes4.dex */
public abstract class a implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private long f24410a = 0;

    protected abstract void a(View view);

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (timeInMillis - this.f24410a > AdaptiveTrackSelection.DEFAULT_MIN_TIME_BETWEEN_BUFFER_REEVALUTATION_MS) {
            this.f24410a = timeInMillis;
            a(view);
        }
    }
}
