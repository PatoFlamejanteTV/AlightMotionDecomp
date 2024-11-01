package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.LinearLayout;

/* loaded from: classes3.dex */
class PlaybackControlsRowView extends LinearLayout {
    private OnUnhandledKeyListener mOnUnhandledKeyListener;

    /* loaded from: classes3.dex */
    public interface OnUnhandledKeyListener {
        boolean onUnhandledKey(KeyEvent keyEvent);
    }

    public PlaybackControlsRowView(Context context, AttributeSet attributeSet) {
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

    public OnUnhandledKeyListener getOnUnhandledKeyListener() {
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
        return super.onRequestFocusInDescendants(i8, rect);
    }

    public void setOnUnhandledKeyListener(OnUnhandledKeyListener onUnhandledKeyListener) {
        this.mOnUnhandledKeyListener = onUnhandledKeyListener;
    }

    public PlaybackControlsRowView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
