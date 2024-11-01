package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;

/* loaded from: classes3.dex */
public class NestedScrollingParentHelper {
    private int mNestedScrollAxesNonTouch;
    private int mNestedScrollAxesTouch;

    public NestedScrollingParentHelper(@NonNull ViewGroup viewGroup) {
    }

    public int getNestedScrollAxes() {
        return this.mNestedScrollAxesTouch | this.mNestedScrollAxesNonTouch;
    }

    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i8) {
        onNestedScrollAccepted(view, view2, i8, 0);
    }

    public void onStopNestedScroll(@NonNull View view) {
        onStopNestedScroll(view, 0);
    }

    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i8, int i9) {
        if (i9 == 1) {
            this.mNestedScrollAxesNonTouch = i8;
        } else {
            this.mNestedScrollAxesTouch = i8;
        }
    }

    public void onStopNestedScroll(@NonNull View view, int i8) {
        if (i8 == 1) {
            this.mNestedScrollAxesNonTouch = 0;
        } else {
            this.mNestedScrollAxesTouch = 0;
        }
    }
}
