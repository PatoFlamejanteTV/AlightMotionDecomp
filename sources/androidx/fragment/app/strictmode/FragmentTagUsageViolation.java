package androidx.fragment.app.strictmode;

import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class FragmentTagUsageViolation extends Violation {
    private final ViewGroup parentContainer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentTagUsageViolation(Fragment fragment, ViewGroup viewGroup) {
        super(fragment, "Attempting to use <fragment> tag to add fragment " + fragment + " to container " + viewGroup);
        AbstractC3292y.i(fragment, "fragment");
        this.parentContainer = viewGroup;
    }

    public final ViewGroup getParentContainer() {
        return this.parentContainer;
    }
}
