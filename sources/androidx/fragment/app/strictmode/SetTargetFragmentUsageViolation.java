package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class SetTargetFragmentUsageViolation extends TargetFragmentUsageViolation {
    private final int requestCode;
    private final Fragment targetFragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetTargetFragmentUsageViolation(Fragment fragment, Fragment targetFragment, int i8) {
        super(fragment, "Attempting to set target fragment " + targetFragment + " with request code " + i8 + " for fragment " + fragment);
        AbstractC3292y.i(fragment, "fragment");
        AbstractC3292y.i(targetFragment, "targetFragment");
        this.targetFragment = targetFragment;
        this.requestCode = i8;
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    public final Fragment getTargetFragment() {
        return this.targetFragment;
    }
}
