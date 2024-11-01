package com.google.android.material.transformation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.ViewCompat;
import com.google.android.material.expandable.ExpandableWidget;
import java.util.List;

@Deprecated
/* loaded from: classes3.dex */
public abstract class ExpandableBehavior extends CoordinatorLayout.Behavior<View> {
    private static final int STATE_COLLAPSED = 2;
    private static final int STATE_EXPANDED = 1;
    private static final int STATE_UNINITIALIZED = 0;
    private int currentState;

    public ExpandableBehavior() {
        this.currentState = 0;
    }

    private boolean didStateChange(boolean z8) {
        if (z8) {
            int i8 = this.currentState;
            if (i8 != 0 && i8 != 2) {
                return false;
            }
            return true;
        }
        if (this.currentState != 1) {
            return false;
        }
        return true;
    }

    @Nullable
    public static <T extends ExpandableBehavior> T from(@NonNull View view, @NonNull Class<T> cls) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams instanceof CoordinatorLayout.LayoutParams) {
            CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) layoutParams).getBehavior();
            if (behavior instanceof ExpandableBehavior) {
                return cls.cast(behavior);
            }
            throw new IllegalArgumentException("The view is not associated with ExpandableBehavior");
        }
        throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    protected ExpandableWidget findExpandableWidget(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view) {
        List<View> dependencies = coordinatorLayout.getDependencies(view);
        int size = dependencies.size();
        for (int i8 = 0; i8 < size; i8++) {
            View view2 = dependencies.get(i8);
            if (layoutDependsOn(coordinatorLayout, view, view2)) {
                return (ExpandableWidget) view2;
            }
        }
        return null;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public abstract boolean layoutDependsOn(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public boolean onDependentViewChanged(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i8;
        ExpandableWidget expandableWidget = (ExpandableWidget) view2;
        if (didStateChange(expandableWidget.isExpanded())) {
            if (expandableWidget.isExpanded()) {
                i8 = 1;
            } else {
                i8 = 2;
            }
            this.currentState = i8;
            return onExpandedStateChange((View) expandableWidget, view, expandableWidget.isExpanded(), true);
        }
        return false;
    }

    protected abstract boolean onExpandedStateChange(View view, View view2, boolean z8, boolean z9);

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    @CallSuper
    public boolean onLayoutChild(@NonNull CoordinatorLayout coordinatorLayout, @NonNull final View view, int i8) {
        final ExpandableWidget findExpandableWidget;
        final int i9;
        if (!ViewCompat.isLaidOut(view) && (findExpandableWidget = findExpandableWidget(coordinatorLayout, view)) != null && didStateChange(findExpandableWidget.isExpanded())) {
            if (findExpandableWidget.isExpanded()) {
                i9 = 1;
            } else {
                i9 = 2;
            }
            this.currentState = i9;
            view.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.google.android.material.transformation.ExpandableBehavior.1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // android.view.ViewTreeObserver.OnPreDrawListener
                public boolean onPreDraw() {
                    view.getViewTreeObserver().removeOnPreDrawListener(this);
                    if (ExpandableBehavior.this.currentState == i9) {
                        ExpandableBehavior expandableBehavior = ExpandableBehavior.this;
                        ExpandableWidget expandableWidget = findExpandableWidget;
                        expandableBehavior.onExpandedStateChange((View) expandableWidget, view, expandableWidget.isExpanded(), false);
                    }
                    return false;
                }
            });
            return false;
        }
        return false;
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.currentState = 0;
    }
}
