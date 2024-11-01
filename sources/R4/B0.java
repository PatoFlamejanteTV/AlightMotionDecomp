package r4;

import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes4.dex */
public abstract class B0 {
    public static final boolean a(y0 y0Var, String currentValue, String proposedValue) {
        AbstractC3292y.i(y0Var, "<this>");
        AbstractC3292y.i(currentValue, "currentValue");
        AbstractC3292y.i(proposedValue, "proposedValue");
        if (y0Var.d() && proposedValue.length() > currentValue.length()) {
            return false;
        }
        return true;
    }
}
