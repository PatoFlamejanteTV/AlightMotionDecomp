package u5;

import android.text.TextUtils;
import android.widget.TextView;
import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: u5.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC4089i {
    public static final void b(final TextView textView) {
        AbstractC3292y.i(textView, "<this>");
        textView.postDelayed(new Runnable() { // from class: u5.h
            @Override // java.lang.Runnable
            public final void run() {
                AbstractC4089i.c(textView);
            }
        }, 3000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(TextView textView) {
        textView.setSelected(true);
    }

    public static final void d(TextView textView) {
        AbstractC3292y.i(textView, "<this>");
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.MARQUEE);
        textView.setMarqueeRepeatLimit(1);
        textView.setFocusable(true);
        textView.setFocusableInTouchMode(true);
        textView.setHorizontallyScrolling(true);
    }
}
