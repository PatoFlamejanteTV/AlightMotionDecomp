package androidx.navigation;

import android.content.Context;
import android.content.ContextWrapper;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* loaded from: classes3.dex */
final class NavController$activity$1 extends AbstractC3293z implements Function1 {
    public static final NavController$activity$1 INSTANCE = new NavController$activity$1();

    NavController$activity$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Context invoke(Context it) {
        AbstractC3292y.i(it, "it");
        if (it instanceof ContextWrapper) {
            return ((ContextWrapper) it).getBaseContext();
        }
        return null;
    }
}
