package androidx.work.impl.utils;

import android.app.Application;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(28)
/* loaded from: classes3.dex */
final class Api28Impl {
    public static final Api28Impl INSTANCE = new Api28Impl();

    private Api28Impl() {
    }

    @DoNotInline
    public final String getProcessName() {
        String processName = Application.getProcessName();
        AbstractC3292y.h(processName, "getProcessName()");
        return processName;
    }
}
