package androidx.core.os;

import android.os.OutcomeReceiver;
import androidx.annotation.RequiresApi;

@RequiresApi(31)
/* loaded from: classes3.dex */
public final class OutcomeReceiverKt {
    @RequiresApi(31)
    public static final <R, E extends Throwable> OutcomeReceiver<R, E> asOutcomeReceiver(U5.d dVar) {
        return g.a(new ContinuationOutcomeReceiver(dVar));
    }
}
