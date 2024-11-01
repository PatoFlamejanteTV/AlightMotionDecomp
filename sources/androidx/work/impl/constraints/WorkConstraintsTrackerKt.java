package androidx.work.impl.constraints;

import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3462k;
import n6.D0;
import n6.I;
import n6.InterfaceC3435A;
import n6.InterfaceC3488x0;
import n6.N;

/* loaded from: classes3.dex */
public final class WorkConstraintsTrackerKt {
    private static final String TAG;

    static {
        String tagWithPrefix = Logger.tagWithPrefix("WorkConstraintsTracker");
        AbstractC3292y.h(tagWithPrefix, "tagWithPrefix(\"WorkConstraintsTracker\")");
        TAG = tagWithPrefix;
    }

    public static final InterfaceC3488x0 listen(WorkConstraintsTracker workConstraintsTracker, WorkSpec spec, I dispatcher, OnConstraintsStateChangedListener listener) {
        InterfaceC3435A b9;
        AbstractC3292y.i(workConstraintsTracker, "<this>");
        AbstractC3292y.i(spec, "spec");
        AbstractC3292y.i(dispatcher, "dispatcher");
        AbstractC3292y.i(listener, "listener");
        b9 = D0.b(null, 1, null);
        AbstractC3462k.d(N.a(dispatcher.plus(b9)), null, null, new WorkConstraintsTrackerKt$listen$1(workConstraintsTracker, spec, listener, null), 3, null);
        return b9;
    }
}
