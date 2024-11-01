package androidx.core.view;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public interface NestedScrollingChild2 extends NestedScrollingChild {
    boolean dispatchNestedPreScroll(int i8, int i9, @Nullable int[] iArr, @Nullable int[] iArr2, int i10);

    boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, @Nullable int[] iArr, int i12);

    boolean hasNestedScrollingParent(int i8);

    boolean startNestedScroll(int i8, int i9);

    void stopNestedScroll(int i8);
}
