package androidx.compose.foundation.lazy.layout;

import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {
    public static /* synthetic */ void a(IntervalList intervalList, int i8, int i9, Function1 function1, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 1) != 0) {
                i8 = 0;
            }
            if ((i10 & 2) != 0) {
                i9 = intervalList.getSize() - 1;
            }
            intervalList.forEach(i8, i9, function1);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forEach");
    }
}
