package androidx.activity.result.contract;

import android.content.Context;
import android.content.Intent;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public abstract class ActivityResultContract<I, O> {

    /* loaded from: classes.dex */
    public static final class SynchronousResult<T> {
        private final T value;

        public SynchronousResult(T t8) {
            this.value = t8;
        }

        public final T getValue() {
            return this.value;
        }
    }

    public abstract Intent createIntent(Context context, I i8);

    public SynchronousResult<O> getSynchronousResult(Context context, I i8) {
        AbstractC3292y.i(context, "context");
        return null;
    }

    public abstract O parseResult(int i8, Intent intent);
}
