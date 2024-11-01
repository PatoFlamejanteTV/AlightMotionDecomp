package androidx.window.embedding;

import R5.AbstractC1435t;
import androidx.window.core.ExperimentalWindowApi;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;

@ExperimentalWindowApi
/* loaded from: classes3.dex */
public final class SplitPairRule extends SplitRule {
    private final boolean clearTop;
    private final Set<SplitPairFilter> filters;
    private final boolean finishPrimaryWithSecondary;
    private final boolean finishSecondaryWithPrimary;

    public /* synthetic */ SplitPairRule(Set set, boolean z8, boolean z9, boolean z10, int i8, int i9, float f8, int i10, int i11, AbstractC3284p abstractC3284p) {
        this(set, (i11 & 2) != 0 ? false : z8, (i11 & 4) != 0 ? true : z9, (i11 & 8) != 0 ? false : z10, (i11 & 16) != 0 ? 0 : i8, (i11 & 32) == 0 ? i9 : 0, (i11 & 64) != 0 ? 0.5f : f8, (i11 & 128) != 0 ? 3 : i10);
    }

    @Override // androidx.window.embedding.SplitRule
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitPairRule) || !super.equals(obj)) {
            return false;
        }
        SplitPairRule splitPairRule = (SplitPairRule) obj;
        if (AbstractC3292y.d(this.filters, splitPairRule.filters) && this.finishPrimaryWithSecondary == splitPairRule.finishPrimaryWithSecondary && this.finishSecondaryWithPrimary == splitPairRule.finishSecondaryWithPrimary && this.clearTop == splitPairRule.clearTop) {
            return true;
        }
        return false;
    }

    public final boolean getClearTop() {
        return this.clearTop;
    }

    public final Set<SplitPairFilter> getFilters() {
        return this.filters;
    }

    public final boolean getFinishPrimaryWithSecondary() {
        return this.finishPrimaryWithSecondary;
    }

    public final boolean getFinishSecondaryWithPrimary() {
        return this.finishSecondaryWithPrimary;
    }

    @Override // androidx.window.embedding.SplitRule
    public int hashCode() {
        return (((((((super.hashCode() * 31) + this.filters.hashCode()) * 31) + androidx.compose.foundation.a.a(this.finishPrimaryWithSecondary)) * 31) + androidx.compose.foundation.a.a(this.finishSecondaryWithPrimary)) * 31) + androidx.compose.foundation.a.a(this.clearTop);
    }

    public final SplitPairRule plus$window_release(SplitPairFilter filter) {
        AbstractC3292y.i(filter, "filter");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(this.filters);
        linkedHashSet.add(filter);
        return new SplitPairRule(AbstractC1435t.b1(linkedHashSet), this.finishPrimaryWithSecondary, this.finishSecondaryWithPrimary, this.clearTop, getMinWidth(), getMinSmallestWidth(), getSplitRatio(), getLayoutDirection());
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SplitPairRule(Set<SplitPairFilter> filters, boolean z8, boolean z9, boolean z10, int i8, int i9, float f8, int i10) {
        super(i8, i9, f8, i10);
        AbstractC3292y.i(filters, "filters");
        this.finishPrimaryWithSecondary = z8;
        this.finishSecondaryWithPrimary = z9;
        this.clearTop = z10;
        this.filters = AbstractC1435t.b1(filters);
    }
}
