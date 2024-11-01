package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class SetUserVisibleHintViolation extends Violation {
    private final boolean isVisibleToUser;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SetUserVisibleHintViolation(Fragment fragment, boolean z8) {
        super(fragment, "Attempting to set user visible hint to " + z8 + " for fragment " + fragment);
        AbstractC3292y.i(fragment, "fragment");
        this.isVisibleToUser = z8;
    }

    public final boolean isVisibleToUser() {
        return this.isVisibleToUser;
    }
}
