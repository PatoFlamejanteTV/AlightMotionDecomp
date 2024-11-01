package androidx.core.view;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.DoNotInline;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* loaded from: classes3.dex */
public final class ViewParentCompat {
    private static final String TAG = "ViewParentCompat";
    private static int[] sTempNestedScrollConsumed;

    /* JADX INFO: Access modifiers changed from: package-private */
    @RequiresApi(21)
    /* loaded from: classes3.dex */
    public static class Api21Impl {
        private Api21Impl() {
        }

        @DoNotInline
        static boolean onNestedFling(ViewParent viewParent, View view, float f8, float f9, boolean z8) {
            return viewParent.onNestedFling(view, f8, f9, z8);
        }

        @DoNotInline
        static boolean onNestedPreFling(ViewParent viewParent, View view, float f8, float f9) {
            return viewParent.onNestedPreFling(view, f8, f9);
        }

        @DoNotInline
        static void onNestedPreScroll(ViewParent viewParent, View view, int i8, int i9, int[] iArr) {
            viewParent.onNestedPreScroll(view, i8, i9, iArr);
        }

        @DoNotInline
        static void onNestedScroll(ViewParent viewParent, View view, int i8, int i9, int i10, int i11) {
            viewParent.onNestedScroll(view, i8, i9, i10, i11);
        }

        @DoNotInline
        static void onNestedScrollAccepted(ViewParent viewParent, View view, View view2, int i8) {
            viewParent.onNestedScrollAccepted(view, view2, i8);
        }

        @DoNotInline
        static boolean onStartNestedScroll(ViewParent viewParent, View view, View view2, int i8) {
            return viewParent.onStartNestedScroll(view, view2, i8);
        }

        @DoNotInline
        static void onStopNestedScroll(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    private ViewParentCompat() {
    }

    private static int[] getTempNestedScrollConsumed() {
        int[] iArr = sTempNestedScrollConsumed;
        if (iArr == null) {
            sTempNestedScrollConsumed = new int[2];
        } else {
            iArr[0] = 0;
            iArr[1] = 0;
        }
        return sTempNestedScrollConsumed;
    }

    public static void notifySubtreeAccessibilityStateChanged(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i8) {
        viewParent.notifySubtreeAccessibilityStateChanged(view, view2, i8);
    }

    public static boolean onNestedFling(@NonNull ViewParent viewParent, @NonNull View view, float f8, float f9, boolean z8) {
        try {
            return Api21Impl.onNestedFling(viewParent, view, f8, f9, z8);
        } catch (AbstractMethodError e8) {
            Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedFling", e8);
            return false;
        }
    }

    public static boolean onNestedPreFling(@NonNull ViewParent viewParent, @NonNull View view, float f8, float f9) {
        try {
            return Api21Impl.onNestedPreFling(viewParent, view, f8, f9);
        } catch (AbstractMethodError e8) {
            Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e8);
            return false;
        }
    }

    public static void onNestedPreScroll(@NonNull ViewParent viewParent, @NonNull View view, int i8, int i9, @NonNull int[] iArr) {
        onNestedPreScroll(viewParent, view, i8, i9, iArr, 0);
    }

    public static void onNestedScroll(@NonNull ViewParent viewParent, @NonNull View view, int i8, int i9, int i10, int i11) {
        onNestedScroll(viewParent, view, i8, i9, i10, i11, 0, getTempNestedScrollConsumed());
    }

    public static void onNestedScrollAccepted(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i8) {
        onNestedScrollAccepted(viewParent, view, view2, i8, 0);
    }

    public static boolean onStartNestedScroll(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i8) {
        return onStartNestedScroll(viewParent, view, view2, i8, 0);
    }

    public static void onStopNestedScroll(@NonNull ViewParent viewParent, @NonNull View view) {
        onStopNestedScroll(viewParent, view, 0);
    }

    @Deprecated
    public static boolean requestSendAccessibilityEvent(ViewParent viewParent, View view, AccessibilityEvent accessibilityEvent) {
        return viewParent.requestSendAccessibilityEvent(view, accessibilityEvent);
    }

    public static void onNestedPreScroll(@NonNull ViewParent viewParent, @NonNull View view, int i8, int i9, @NonNull int[] iArr, int i10) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedPreScroll(view, i8, i9, iArr, i10);
            return;
        }
        if (i10 == 0) {
            try {
                Api21Impl.onNestedPreScroll(viewParent, view, i8, i9, iArr);
            } catch (AbstractMethodError e8) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e8);
            }
        }
    }

    public static void onNestedScrollAccepted(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i8, int i9) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedScrollAccepted(view, view2, i8, i9);
            return;
        }
        if (i9 == 0) {
            try {
                Api21Impl.onNestedScrollAccepted(viewParent, view, view2, i8);
            } catch (AbstractMethodError e8) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e8);
            }
        }
    }

    public static boolean onStartNestedScroll(@NonNull ViewParent viewParent, @NonNull View view, @NonNull View view2, int i8, int i9) {
        if (viewParent instanceof NestedScrollingParent2) {
            return ((NestedScrollingParent2) viewParent).onStartNestedScroll(view, view2, i8, i9);
        }
        if (i9 != 0) {
            return false;
        }
        try {
            return Api21Impl.onStartNestedScroll(viewParent, view, view2, i8);
        } catch (AbstractMethodError e8) {
            Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e8);
            return false;
        }
    }

    public static void onStopNestedScroll(@NonNull ViewParent viewParent, @NonNull View view, int i8) {
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onStopNestedScroll(view, i8);
            return;
        }
        if (i8 == 0) {
            try {
                Api21Impl.onStopNestedScroll(viewParent, view);
            } catch (AbstractMethodError e8) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e8);
            }
        }
    }

    public static void onNestedScroll(@NonNull ViewParent viewParent, @NonNull View view, int i8, int i9, int i10, int i11, int i12) {
        onNestedScroll(viewParent, view, i8, i9, i10, i11, i12, getTempNestedScrollConsumed());
    }

    public static void onNestedScroll(@NonNull ViewParent viewParent, @NonNull View view, int i8, int i9, int i10, int i11, int i12, @NonNull int[] iArr) {
        if (viewParent instanceof NestedScrollingParent3) {
            ((NestedScrollingParent3) viewParent).onNestedScroll(view, i8, i9, i10, i11, i12, iArr);
            return;
        }
        iArr[0] = iArr[0] + i10;
        iArr[1] = iArr[1] + i11;
        if (viewParent instanceof NestedScrollingParent2) {
            ((NestedScrollingParent2) viewParent).onNestedScroll(view, i8, i9, i10, i11, i12);
            return;
        }
        if (i12 == 0) {
            try {
                Api21Impl.onNestedScroll(viewParent, view, i8, i9, i10, i11);
            } catch (AbstractMethodError e8) {
                Log.e(TAG, "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e8);
            }
        }
    }
}
