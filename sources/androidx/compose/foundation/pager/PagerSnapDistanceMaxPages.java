package androidx.compose.foundation.pager;

import i6.m;

/* loaded from: classes.dex */
public final class PagerSnapDistanceMaxPages implements PagerSnapDistance {
    private final int pagesLimit;

    public PagerSnapDistanceMaxPages(int i8) {
        this.pagesLimit = i8;
    }

    @Override // androidx.compose.foundation.pager.PagerSnapDistance
    public int calculateTargetPage(int i8, int i9, float f8, int i10, int i11) {
        int i12 = this.pagesLimit;
        return m.k(i9, i8 - i12, i8 + i12);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof PagerSnapDistanceMaxPages) || this.pagesLimit != ((PagerSnapDistanceMaxPages) obj).pagesLimit) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.pagesLimit;
    }
}
