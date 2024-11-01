package androidx.datastore.core;

import java.io.IOException;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class CorruptionException extends IOException {
    public /* synthetic */ CorruptionException(String str, Throwable th, int i8, AbstractC3284p abstractC3284p) {
        this(str, (i8 & 2) != 0 ? null : th);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CorruptionException(String message, Throwable th) {
        super(message, th);
        AbstractC3292y.i(message, "message");
    }
}
