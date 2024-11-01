package androidx.compose.runtime.reflect;

import androidx.compose.foundation.a;
import androidx.compose.runtime.internal.StabilityInferred;

@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class ComposableInfo {
    public static final int $stable = 0;
    private final int changedParams;
    private final int defaultParams;
    private final boolean isComposable;
    private final int realParamsCount;

    public ComposableInfo(boolean z8, int i8, int i9, int i10) {
        this.isComposable = z8;
        this.realParamsCount = i8;
        this.changedParams = i9;
        this.defaultParams = i10;
    }

    public static /* synthetic */ ComposableInfo copy$default(ComposableInfo composableInfo, boolean z8, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z8 = composableInfo.isComposable;
        }
        if ((i11 & 2) != 0) {
            i8 = composableInfo.realParamsCount;
        }
        if ((i11 & 4) != 0) {
            i9 = composableInfo.changedParams;
        }
        if ((i11 & 8) != 0) {
            i10 = composableInfo.defaultParams;
        }
        return composableInfo.copy(z8, i8, i9, i10);
    }

    public final boolean component1() {
        return this.isComposable;
    }

    public final int component2() {
        return this.realParamsCount;
    }

    public final int component3() {
        return this.changedParams;
    }

    public final int component4() {
        return this.defaultParams;
    }

    public final ComposableInfo copy(boolean z8, int i8, int i9, int i10) {
        return new ComposableInfo(z8, i8, i9, i10);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComposableInfo)) {
            return false;
        }
        ComposableInfo composableInfo = (ComposableInfo) obj;
        return this.isComposable == composableInfo.isComposable && this.realParamsCount == composableInfo.realParamsCount && this.changedParams == composableInfo.changedParams && this.defaultParams == composableInfo.defaultParams;
    }

    public final int getChangedParams() {
        return this.changedParams;
    }

    public final int getDefaultParams() {
        return this.defaultParams;
    }

    public final int getRealParamsCount() {
        return this.realParamsCount;
    }

    public int hashCode() {
        return (((((a.a(this.isComposable) * 31) + this.realParamsCount) * 31) + this.changedParams) * 31) + this.defaultParams;
    }

    public final boolean isComposable() {
        return this.isComposable;
    }

    public String toString() {
        return "ComposableInfo(isComposable=" + this.isComposable + ", realParamsCount=" + this.realParamsCount + ", changedParams=" + this.changedParams + ", defaultParams=" + this.defaultParams + ')';
    }
}
