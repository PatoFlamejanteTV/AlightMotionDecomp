package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class GetTargetFragmentRequestCodeUsageViolation extends TargetFragmentUsageViolation {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetTargetFragmentRequestCodeUsageViolation(Fragment fragment) {
        super(fragment, "Attempting to get target request code from fragment " + fragment);
        AbstractC3292y.i(fragment, "fragment");
    }
}
