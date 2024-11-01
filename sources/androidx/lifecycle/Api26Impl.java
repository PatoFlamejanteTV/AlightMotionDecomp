package androidx.lifecycle;

import androidx.annotation.RequiresApi;
import j$.time.Duration;
import kotlin.jvm.internal.AbstractC3292y;

@RequiresApi(26)
/* loaded from: classes3.dex */
public final class Api26Impl {
    public static final Api26Impl INSTANCE = new Api26Impl();

    private Api26Impl() {
    }

    public final long toMillis(Duration timeout) {
        AbstractC3292y.i(timeout, "timeout");
        return timeout.toMillis();
    }
}
