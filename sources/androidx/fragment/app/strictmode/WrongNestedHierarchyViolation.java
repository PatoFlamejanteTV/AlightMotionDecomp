package androidx.fragment.app.strictmode;

import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes3.dex */
public final class WrongNestedHierarchyViolation extends Violation {
    private final int containerId;
    private final Fragment expectedParentFragment;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WrongNestedHierarchyViolation(Fragment fragment, Fragment expectedParentFragment, int i8) {
        super(fragment, "Attempting to nest fragment " + fragment + " within the view of parent fragment " + expectedParentFragment + " via container with ID " + i8 + " without using parent's childFragmentManager");
        AbstractC3292y.i(fragment, "fragment");
        AbstractC3292y.i(expectedParentFragment, "expectedParentFragment");
        this.expectedParentFragment = expectedParentFragment;
        this.containerId = i8;
    }

    public final int getContainerId() {
        return this.containerId;
    }

    public final Fragment getExpectedParentFragment() {
        return this.expectedParentFragment;
    }
}
