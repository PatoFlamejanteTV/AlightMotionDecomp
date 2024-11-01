package androidx.work;

import androidx.annotation.RestrictTo;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public abstract class InputMergerFactory {
    public abstract InputMerger createInputMerger(String str);

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final InputMerger createInputMergerWithDefaultFallback(String className) {
        AbstractC3292y.i(className, "className");
        InputMerger createInputMerger = createInputMerger(className);
        if (createInputMerger == null) {
            return InputMergerKt.fromClassName(className);
        }
        return createInputMerger;
    }
}
