package androidx.navigation;

import android.view.View;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class ViewKt {
    public static final NavController findNavController(View view) {
        AbstractC3292y.i(view, "<this>");
        return Navigation.findNavController(view);
    }
}
