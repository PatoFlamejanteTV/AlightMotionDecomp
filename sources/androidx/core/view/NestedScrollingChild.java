package androidx.core.view;

import androidx.annotation.Nullable;

/* loaded from: classes3.dex */
public interface NestedScrollingChild {
    boolean dispatchNestedFling(float f8, float f9, boolean z8);

    boolean dispatchNestedPreFling(float f8, float f9);

    boolean dispatchNestedPreScroll(int i8, int i9, @Nullable int[] iArr, @Nullable int[] iArr2);

    boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, @Nullable int[] iArr);

    boolean hasNestedScrollingParent();

    boolean isNestedScrollingEnabled();

    void setNestedScrollingEnabled(boolean z8);

    boolean startNestedScroll(int i8);

    void stopNestedScroll();
}
