package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;

/* loaded from: classes3.dex */
class PersistentFocusWrapper extends FrameLayout {
    private static final boolean DEBUG = false;
    private static final String TAG = "PersistentFocusWrapper";
    private boolean mPersistFocusVertical;
    private int mSelectedPosition;

    public PersistentFocusWrapper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mSelectedPosition = -1;
        this.mPersistFocusVertical = true;
    }

    private boolean shouldPersistFocusFromDirection(int i8) {
        boolean z8 = this.mPersistFocusVertical;
        if ((z8 && (i8 == 33 || i8 == 130)) || (!z8 && (i8 == 17 || i8 == 66))) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i8, int i9) {
        if (!hasFocus() && getGrandChildCount() != 0 && shouldPersistFocusFromDirection(i8)) {
            arrayList.add(this);
        } else {
            super.addFocusables(arrayList, i8, i9);
        }
    }

    public void clearSelection() {
        this.mSelectedPosition = -1;
        if (hasFocus()) {
            clearFocus();
        }
    }

    int getGrandChildCount() {
        ViewGroup viewGroup = (ViewGroup) getChildAt(0);
        if (viewGroup == null) {
            return 0;
        }
        return viewGroup.getChildCount();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mSelectedPosition = savedState.mSelectedPosition;
        super.onRestoreInstanceState(savedState.getSuperState());
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.mSelectedPosition = this.mSelectedPosition;
        return savedState;
    }

    public void persistFocusHorizontal() {
        this.mPersistFocusVertical = false;
    }

    public void persistFocusVertical() {
        this.mPersistFocusVertical = true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        int indexOfChild;
        super.requestChildFocus(view, view2);
        while (view2 != null && view2.getParent() != view) {
            view2 = (View) view2.getParent();
        }
        if (view2 == null) {
            indexOfChild = -1;
        } else {
            indexOfChild = ((ViewGroup) view).indexOfChild(view2);
        }
        this.mSelectedPosition = indexOfChild;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i8, Rect rect) {
        int i9;
        ViewGroup viewGroup = (ViewGroup) getChildAt(0);
        if (viewGroup != null && (i9 = this.mSelectedPosition) >= 0 && i9 < getGrandChildCount() && viewGroup.getChildAt(this.mSelectedPosition).requestFocus(i8, rect)) {
            return true;
        }
        return super.requestFocus(i8, rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.leanback.widget.PersistentFocusWrapper.SavedState.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i8) {
                return new SavedState[i8];
            }
        };
        int mSelectedPosition;

        SavedState(Parcel parcel) {
            super(parcel);
            this.mSelectedPosition = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.mSelectedPosition);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public PersistentFocusWrapper(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.mSelectedPosition = -1;
        this.mPersistFocusVertical = true;
    }
}
