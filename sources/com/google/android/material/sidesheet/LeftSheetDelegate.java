package com.google.android.material.sidesheet;

import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* loaded from: classes3.dex */
final class LeftSheetDelegate extends SheetDelegate {
    final SideSheetBehavior<? extends View> sheetBehavior;

    /* JADX INFO: Access modifiers changed from: package-private */
    public LeftSheetDelegate(@NonNull SideSheetBehavior<? extends View> sideSheetBehavior) {
        this.sheetBehavior = sideSheetBehavior;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int calculateInnerMargin(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public float calculateSlideOffset(int i8) {
        float hiddenOffset = getHiddenOffset();
        return (i8 - hiddenOffset) / (getExpandedOffset() - hiddenOffset);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getCoplanarSiblingAdjacentMargin(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
        return marginLayoutParams.leftMargin;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getExpandedOffset() {
        return Math.max(0, this.sheetBehavior.getParentInnerEdge() + this.sheetBehavior.getInnerMargin());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getHiddenOffset() {
        return (-this.sheetBehavior.getChildWidth()) - this.sheetBehavior.getInnerMargin();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getMaxViewPositionHorizontal() {
        return this.sheetBehavior.getInnerMargin();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getMinViewPositionHorizontal() {
        return -this.sheetBehavior.getChildWidth();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public <V extends View> int getOuterEdge(@NonNull V v8) {
        return v8.getRight() + this.sheetBehavior.getInnerMargin();
    }

    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getParentInnerEdge(@NonNull CoordinatorLayout coordinatorLayout) {
        return coordinatorLayout.getLeft();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public int getSheetEdge() {
        return 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public boolean isExpandingOutwards(float f8) {
        return f8 > 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public boolean isReleasedCloseToInnerEdge(@NonNull View view) {
        if (view.getRight() < (getExpandedOffset() - getHiddenOffset()) / 2) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public boolean isSwipeSignificant(float f8, float f9) {
        if (SheetUtils.isSwipeMostlyHorizontal(f8, f9) && Math.abs(f8) > this.sheetBehavior.getSignificantVelocityThreshold()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public boolean shouldHide(@NonNull View view, float f8) {
        if (Math.abs(view.getLeft() + (f8 * this.sheetBehavior.getHideFriction())) > this.sheetBehavior.getHideThreshold()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public void updateCoplanarSiblingAdjacentMargin(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i8) {
        marginLayoutParams.leftMargin = i8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.material.sidesheet.SheetDelegate
    public void updateCoplanarSiblingLayoutParams(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams, int i8, int i9) {
        if (i8 <= this.sheetBehavior.getParentWidth()) {
            marginLayoutParams.leftMargin = i9;
        }
    }
}
