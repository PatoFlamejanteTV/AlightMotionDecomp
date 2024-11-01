package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public abstract class Violation extends RuntimeException {
    private final Fragment fragment;

    public /* synthetic */ Violation(Fragment fragment, String str, int i8, AbstractC3284p abstractC3284p) {
        this(fragment, (i8 & 2) != 0 ? null : str);
    }

    public final Fragment getFragment() {
        return this.fragment;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Violation(Fragment fragment, String str) {
        super(str);
        AbstractC3292y.i(fragment, "fragment");
        this.fragment = fragment;
    }
}
