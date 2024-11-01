package androidx.compose.foundation.gestures;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class GestureCancellationException extends CancellationException {
    public static final int $stable = 0;

    public GestureCancellationException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public GestureCancellationException(String str) {
        super(str);
    }

    public /* synthetic */ GestureCancellationException(String str, int i8, AbstractC3284p abstractC3284p) {
        this((i8 & 1) != 0 ? null : str);
    }
}
