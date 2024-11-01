package androidx.core.view;

import android.view.View;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public interface NestedScrollingParent {
    int getNestedScrollAxes();

    boolean onNestedFling(@NonNull View view, float f8, float f9, boolean z8);

    boolean onNestedPreFling(@NonNull View view, float f8, float f9);

    void onNestedPreScroll(@NonNull View view, int i8, int i9, @NonNull int[] iArr);

    void onNestedScroll(@NonNull View view, int i8, int i9, int i10, int i11);

    void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i8);

    boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i8);

    void onStopNestedScroll(@NonNull View view);
}
