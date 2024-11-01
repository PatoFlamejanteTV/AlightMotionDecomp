package androidx.lifecycle;

import android.view.View;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class ViewKt {
    public static final /* synthetic */ LifecycleOwner findViewTreeLifecycleOwner(View view) {
        AbstractC3292y.i(view, "view");
        return ViewTreeLifecycleOwner.get(view);
    }
}
