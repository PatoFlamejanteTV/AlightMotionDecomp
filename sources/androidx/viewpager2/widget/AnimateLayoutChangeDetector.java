package androidx.viewpager2.widget;

import android.animation.LayoutTransition;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class AnimateLayoutChangeDetector {
    private static final ViewGroup.MarginLayoutParams ZERO_MARGIN_LAYOUT_PARAMS;
    private LinearLayoutManager mLayoutManager;

    static {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-1, -1);
        ZERO_MARGIN_LAYOUT_PARAMS = marginLayoutParams;
        marginLayoutParams.setMargins(0, 0, 0, 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public AnimateLayoutChangeDetector(@NonNull LinearLayoutManager linearLayoutManager) {
        this.mLayoutManager = linearLayoutManager;
    }

    private boolean arePagesLaidOutContiguously() {
        boolean z8;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        int top;
        int i8;
        int bottom;
        int i9;
        int childCount = this.mLayoutManager.getChildCount();
        if (childCount == 0) {
            return true;
        }
        if (this.mLayoutManager.getOrientation() == 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, childCount, 2);
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = this.mLayoutManager.getChildAt(i10);
            if (childAt != null) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                } else {
                    marginLayoutParams = ZERO_MARGIN_LAYOUT_PARAMS;
                }
                int[] iArr2 = iArr[i10];
                if (z8) {
                    top = childAt.getLeft();
                    i8 = marginLayoutParams.leftMargin;
                } else {
                    top = childAt.getTop();
                    i8 = marginLayoutParams.topMargin;
                }
                iArr2[0] = top - i8;
                int[] iArr3 = iArr[i10];
                if (z8) {
                    bottom = childAt.getRight();
                    i9 = marginLayoutParams.rightMargin;
                } else {
                    bottom = childAt.getBottom();
                    i9 = marginLayoutParams.bottomMargin;
                }
                iArr3[1] = bottom + i9;
            } else {
                throw new IllegalStateException("null view contained in the view hierarchy");
            }
        }
        Arrays.sort(iArr, new Comparator<int[]>() { // from class: androidx.viewpager2.widget.AnimateLayoutChangeDetector.1
            @Override // java.util.Comparator
            public int compare(int[] iArr4, int[] iArr5) {
                return iArr4[0] - iArr5[0];
            }
        });
        for (int i11 = 1; i11 < childCount; i11++) {
            if (iArr[i11 - 1][1] != iArr[i11][0]) {
                return false;
            }
        }
        int[] iArr4 = iArr[0];
        int i12 = iArr4[1];
        int i13 = iArr4[0];
        int i14 = i12 - i13;
        if (i13 <= 0 && iArr[childCount - 1][1] >= i14) {
            return true;
        }
        return false;
    }

    private boolean hasRunningChangingLayoutTransition() {
        int childCount = this.mLayoutManager.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            if (hasRunningChangingLayoutTransition(this.mLayoutManager.getChildAt(i8))) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean mayHaveInterferingAnimations() {
        if ((!arePagesLaidOutContiguously() || this.mLayoutManager.getChildCount() <= 1) && hasRunningChangingLayoutTransition()) {
            return true;
        }
        return false;
    }

    private static boolean hasRunningChangingLayoutTransition(View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            LayoutTransition layoutTransition = viewGroup.getLayoutTransition();
            if (layoutTransition != null && layoutTransition.isChangingLayout()) {
                return true;
            }
            int childCount = viewGroup.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                if (hasRunningChangingLayoutTransition(viewGroup.getChildAt(i8))) {
                    return true;
                }
            }
        }
        return false;
    }
}
