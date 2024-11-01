package M5;

import android.view.View;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes5.dex */
public abstract class a {
    public static final void a(View view, boolean z8) {
        int i8;
        AbstractC3292y.i(view, "<this>");
        if (z8) {
            i8 = 0;
        } else {
            i8 = 8;
        }
        view.setVisibility(i8);
    }
}
