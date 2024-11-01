package androidx.lifecycle;

import androidx.annotation.RestrictTo;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.AbstractC3292y;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: classes3.dex */
public class MethodCallsLogger {
    private final Map<String, Integer> calledMethods = new HashMap();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public boolean approveCall(String name, int i8) {
        int i9;
        AbstractC3292y.i(name, "name");
        Integer num = this.calledMethods.get(name);
        boolean z8 = false;
        if (num != null) {
            i9 = num.intValue();
        } else {
            i9 = 0;
        }
        if ((i9 & i8) != 0) {
            z8 = true;
        }
        this.calledMethods.put(name, Integer.valueOf(i8 | i9));
        return !z8;
    }
}
