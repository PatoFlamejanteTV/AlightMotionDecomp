package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public abstract class TargetFragmentUsageViolation extends Violation {
    public /* synthetic */ TargetFragmentUsageViolation(Fragment fragment, String str, int i8, AbstractC3284p abstractC3284p) {
        this(fragment, (i8 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TargetFragmentUsageViolation(Fragment fragment, String str) {
        super(fragment, str);
        AbstractC3292y.i(fragment, "fragment");
    }
}
