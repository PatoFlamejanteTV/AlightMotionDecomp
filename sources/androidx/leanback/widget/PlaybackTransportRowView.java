package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.RestrictTo;
import androidx.leanback.R;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes3.dex */
public class PlaybackTransportRowView extends LinearLayout {
    private OnUnhandledKeyListener mOnUnhandledKeyListener;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    /* loaded from: classes3.dex */
    public interface OnUnhandledKeyListener {
        boolean onUnhandledKey(KeyEvent keyEvent);
    }

    public PlaybackTransportRowView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (super.dispatchKeyEvent(keyEvent)) {
            return true;
        }
        OnUnhandledKeyListener onUnhandledKeyListener = this.mOnUnhandledKeyListener;
        if (onUnhandledKeyListener != null && onUnhandledKeyListener.onUnhandledKey(keyEvent)) {
            return true;
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i8) {
        View childAt;
        if (view != null) {
            if (i8 == 33) {
                for (int indexOfChild = indexOfChild(getFocusedChild()) - 1; indexOfChild >= 0; indexOfChild--) {
                    View childAt2 = getChildAt(indexOfChild);
                    if (childAt2.hasFocusable()) {
                        return childAt2;
                    }
                }
            } else {
                if (i8 == 130) {
                    int indexOfChild2 = indexOfChild(getFocusedChild());
                    do {
                        indexOfChild2++;
                        if (indexOfChild2 < getChildCount()) {
                            childAt = getChildAt(indexOfChild2);
                        }
                    } while (!childAt.hasFocusable());
                    return childAt;
                }
                if ((i8 == 17 || i8 == 66) && (getFocusedChild() instanceof ViewGroup)) {
                    return FocusFinder.getInstance().findNextFocus((ViewGroup) getFocusedChild(), view, i8);
                }
            }
        }
        return super.focusSearch(view, i8);
    }

    OnUnhandledKeyListener getOnUnhandledKeyListener() {
        return this.mOnUnhandledKeyListener;
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return false;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i8, Rect rect) {
        View findFocus = findFocus();
        if (findFocus != null && findFocus.requestFocus(i8, rect)) {
            return true;
        }
        View findViewById = findViewById(R.id.playback_progress);
        if (findViewById != null && findViewById.isFocusable() && findViewById.requestFocus(i8, rect)) {
            return true;
        }
        return super.onRequestFocusInDescendants(i8, rect);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void setOnUnhandledKeyListener(OnUnhandledKeyListener onUnhandledKeyListener) {
        this.mOnUnhandledKeyListener = onUnhandledKeyListener;
    }

    public PlaybackTransportRowView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
