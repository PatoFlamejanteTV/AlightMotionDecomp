package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.BoolRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableGroup;
import com.google.android.material.internal.FlowLayout;
import java.util.List;

/* loaded from: classes3.dex */
public class ChipGroup extends FlowLayout {
    private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_ChipGroup;
    private final CheckableGroup<Chip> checkableGroup;

    @Dimension
    private int chipSpacingHorizontal;

    @Dimension
    private int chipSpacingVertical;
    private final int defaultCheckedId;

    @Nullable
    private OnCheckedStateChangeListener onCheckedStateChangeListener;

    @NonNull
    private final PassThroughHierarchyChangeListener passThroughListener;

    /* loaded from: classes3.dex */
    public static class LayoutParams extends ViewGroup.MarginLayoutParams {
        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(int i8, int i9) {
            super(i8, i9);
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Deprecated
    /* loaded from: classes3.dex */
    public interface OnCheckedChangeListener {
        void onCheckedChanged(@NonNull ChipGroup chipGroup, @IdRes int i8);
    }

    /* loaded from: classes3.dex */
    public interface OnCheckedStateChangeListener {
        void onCheckedChanged(@NonNull ChipGroup chipGroup, @NonNull List<Integer> list);
    }

    /* loaded from: classes3.dex */
    private class PassThroughHierarchyChangeListener implements ViewGroup.OnHierarchyChangeListener {
        private ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener;

        private PassThroughHierarchyChangeListener() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    view2.setId(ViewCompat.generateViewId());
                }
                ChipGroup.this.checkableGroup.addCheckable((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                chipGroup.checkableGroup.removeCheckable((Chip) view2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.onHierarchyChangeListener;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context) {
        this(context, null);
    }

    private int getVisibleChipCount() {
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            if ((getChildAt(i9) instanceof Chip) && isChildVisible(i9)) {
                i8++;
            }
        }
        return i8;
    }

    private boolean isChildVisible(int i8) {
        if (getChildAt(i8).getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public void check(@IdRes int i8) {
        this.checkableGroup.check(i8);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (super.checkLayoutParams(layoutParams) && (layoutParams instanceof LayoutParams)) {
            return true;
        }
        return false;
    }

    public void clearCheck() {
        this.checkableGroup.clearCheck();
    }

    @Override // android.view.ViewGroup
    @NonNull
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    @IdRes
    public int getCheckedChipId() {
        return this.checkableGroup.getSingleCheckedId();
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        return this.checkableGroup.getCheckedIdsSortedByChildOrder(this);
    }

    @Dimension
    public int getChipSpacingHorizontal() {
        return this.chipSpacingHorizontal;
    }

    @Dimension
    public int getChipSpacingVertical() {
        return this.chipSpacingVertical;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int getIndexOfChip(@Nullable View view) {
        if (!(view instanceof Chip)) {
            return -1;
        }
        int i8 = 0;
        for (int i9 = 0; i9 < getChildCount(); i9++) {
            View childAt = getChildAt(i9);
            if ((childAt instanceof Chip) && isChildVisible(i9)) {
                if (((Chip) childAt) == view) {
                    return i8;
                }
                i8++;
            }
        }
        return -1;
    }

    public boolean isSelectionRequired() {
        return this.checkableGroup.isSelectionRequired();
    }

    @Override // com.google.android.material.internal.FlowLayout
    public boolean isSingleLine() {
        return super.isSingleLine();
    }

    public boolean isSingleSelection() {
        return this.checkableGroup.isSingleSelection();
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        int i8 = this.defaultCheckedId;
        if (i8 != -1) {
            this.checkableGroup.check(i8);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        int i8;
        int i9;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        AccessibilityNodeInfoCompat wrap = AccessibilityNodeInfoCompat.wrap(accessibilityNodeInfo);
        if (isSingleLine()) {
            i8 = getVisibleChipCount();
        } else {
            i8 = -1;
        }
        int rowCount = getRowCount();
        if (isSingleSelection()) {
            i9 = 1;
        } else {
            i9 = 2;
        }
        wrap.setCollectionInfo(AccessibilityNodeInfoCompat.CollectionInfoCompat.obtain(rowCount, i8, false, i9));
    }

    public void setChipSpacing(@Dimension int i8) {
        setChipSpacingHorizontal(i8);
        setChipSpacingVertical(i8);
    }

    public void setChipSpacingHorizontal(@Dimension int i8) {
        if (this.chipSpacingHorizontal != i8) {
            this.chipSpacingHorizontal = i8;
            setItemSpacing(i8);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(@DimenRes int i8) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i8));
    }

    public void setChipSpacingResource(@DimenRes int i8) {
        setChipSpacing(getResources().getDimensionPixelOffset(i8));
    }

    public void setChipSpacingVertical(@Dimension int i8) {
        if (this.chipSpacingVertical != i8) {
            this.chipSpacingVertical = i8;
            setLineSpacing(i8);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(@DimenRes int i8) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i8));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(@Nullable Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i8) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(@Nullable final OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new OnCheckedStateChangeListener() { // from class: com.google.android.material.chip.ChipGroup.2
                @Override // com.google.android.material.chip.ChipGroup.OnCheckedStateChangeListener
                public void onCheckedChanged(@NonNull ChipGroup chipGroup, @NonNull List<Integer> list) {
                    if (!ChipGroup.this.checkableGroup.isSingleSelection()) {
                        return;
                    }
                    onCheckedChangeListener.onCheckedChanged(chipGroup, ChipGroup.this.getCheckedChipId());
                }
            });
        }
    }

    public void setOnCheckedStateChangeListener(@Nullable OnCheckedStateChangeListener onCheckedStateChangeListener) {
        this.onCheckedStateChangeListener = onCheckedStateChangeListener;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.passThroughListener.onHierarchyChangeListener = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z8) {
        this.checkableGroup.setSelectionRequired(z8);
    }

    @Deprecated
    public void setShowDividerHorizontal(int i8) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i8) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // com.google.android.material.internal.FlowLayout
    public void setSingleLine(boolean z8) {
        super.setSingleLine(z8);
    }

    public void setSingleSelection(boolean z8) {
        this.checkableGroup.setSingleSelection(z8);
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.chipGroupStyle);
    }

    @Override // android.view.ViewGroup
    @NonNull
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams);
    }

    public void setSingleLine(@BoolRes int i8) {
        setSingleLine(getResources().getBoolean(i8));
    }

    public void setSingleSelection(@BoolRes int i8) {
        setSingleSelection(getResources().getBoolean(i8));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ChipGroup(android.content.Context r9, android.util.AttributeSet r10, int r11) {
        /*
            r8 = this;
            int r4 = com.google.android.material.chip.ChipGroup.DEF_STYLE_RES
            android.content.Context r9 = com.google.android.material.theme.overlay.MaterialThemeOverlay.wrap(r9, r10, r11, r4)
            r8.<init>(r9, r10, r11)
            com.google.android.material.internal.CheckableGroup r9 = new com.google.android.material.internal.CheckableGroup
            r9.<init>()
            r8.checkableGroup = r9
            com.google.android.material.chip.ChipGroup$PassThroughHierarchyChangeListener r6 = new com.google.android.material.chip.ChipGroup$PassThroughHierarchyChangeListener
            r0 = 0
            r6.<init>()
            r8.passThroughListener = r6
            android.content.Context r0 = r8.getContext()
            int[] r2 = com.google.android.material.R.styleable.ChipGroup
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r10
            r3 = r11
            android.content.res.TypedArray r10 = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(r0, r1, r2, r3, r4, r5)
            int r11 = com.google.android.material.R.styleable.ChipGroup_chipSpacing
            int r11 = r10.getDimensionPixelOffset(r11, r7)
            int r0 = com.google.android.material.R.styleable.ChipGroup_chipSpacingHorizontal
            int r0 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingHorizontal(r0)
            int r0 = com.google.android.material.R.styleable.ChipGroup_chipSpacingVertical
            int r11 = r10.getDimensionPixelOffset(r0, r11)
            r8.setChipSpacingVertical(r11)
            int r11 = com.google.android.material.R.styleable.ChipGroup_singleLine
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleLine(r11)
            int r11 = com.google.android.material.R.styleable.ChipGroup_singleSelection
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSingleSelection(r11)
            int r11 = com.google.android.material.R.styleable.ChipGroup_selectionRequired
            boolean r11 = r10.getBoolean(r11, r7)
            r8.setSelectionRequired(r11)
            int r11 = com.google.android.material.R.styleable.ChipGroup_checkedChip
            r0 = -1
            int r11 = r10.getResourceId(r11, r0)
            r8.defaultCheckedId = r11
            r10.recycle()
            com.google.android.material.chip.ChipGroup$1 r10 = new com.google.android.material.chip.ChipGroup$1
            r10.<init>()
            r9.setOnCheckedStateChangeListener(r10)
            super.setOnHierarchyChangeListener(r6)
            r9 = 1
            androidx.core.view.ViewCompat.setImportantForAccessibility(r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
