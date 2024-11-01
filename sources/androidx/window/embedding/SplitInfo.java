package androidx.window.embedding;

import android.app.Activity;
import androidx.window.core.ExperimentalWindowApi;
import kotlin.jvm.internal.AbstractC3292y;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class SplitInfo {
    private final ActivityStack primaryActivityStack;
    private final ActivityStack secondaryActivityStack;
    private final float splitRatio;

    public SplitInfo(ActivityStack primaryActivityStack, ActivityStack secondaryActivityStack, float f8) {
        AbstractC3292y.i(primaryActivityStack, "primaryActivityStack");
        AbstractC3292y.i(secondaryActivityStack, "secondaryActivityStack");
        this.primaryActivityStack = primaryActivityStack;
        this.secondaryActivityStack = secondaryActivityStack;
        this.splitRatio = f8;
    }

    public final boolean contains(Activity activity) {
        AbstractC3292y.i(activity, "activity");
        if (!this.primaryActivityStack.contains(activity) && !this.secondaryActivityStack.contains(activity)) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitInfo)) {
            return false;
        }
        SplitInfo splitInfo = (SplitInfo) obj;
        if (AbstractC3292y.d(this.primaryActivityStack, splitInfo.primaryActivityStack) && AbstractC3292y.d(this.secondaryActivityStack, splitInfo.secondaryActivityStack) && this.splitRatio == splitInfo.splitRatio) {
            return true;
        }
        return false;
    }

    public final ActivityStack getPrimaryActivityStack() {
        return this.primaryActivityStack;
    }

    public final ActivityStack getSecondaryActivityStack() {
        return this.secondaryActivityStack;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public int hashCode() {
        return (((this.primaryActivityStack.hashCode() * 31) + this.secondaryActivityStack.hashCode()) * 31) + Float.floatToIntBits(this.splitRatio);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SplitInfo:{");
        sb.append("primaryActivityStack=" + getPrimaryActivityStack() + ',');
        sb.append("secondaryActivityStack=" + getSecondaryActivityStack() + ',');
        sb.append("splitRatio=" + getSplitRatio() + '}');
        String sb2 = sb.toString();
        AbstractC3292y.h(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
