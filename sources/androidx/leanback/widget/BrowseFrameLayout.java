package androidx.leanback.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;

/* loaded from: classes3.dex */
public class BrowseFrameLayout extends FrameLayout {
    private OnFocusSearchListener mListener;
    private OnChildFocusListener mOnChildFocusListener;
    private View.OnKeyListener mOnDispatchKeyListener;

    /* loaded from: classes3.dex */
    public interface OnChildFocusListener {
        void onRequestChildFocus(View view, View view2);

        boolean onRequestFocusInDescendants(int i8, Rect rect);
    }

    /* loaded from: classes3.dex */
    public interface OnFocusSearchListener {
        View onFocusSearch(View view, int i8);
    }

    public BrowseFrameLayout(Context context) {
        this(context, null, 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        boolean dispatchKeyEvent = super.dispatchKeyEvent(keyEvent);
        View.OnKeyListener onKeyListener = this.mOnDispatchKeyListener;
        if (onKeyListener != null && !dispatchKeyEvent) {
            return onKeyListener.onKey(getRootView(), keyEvent.getKeyCode(), keyEvent);
        }
        return dispatchKeyEvent;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public View focusSearch(View view, int i8) {
        View onFocusSearch;
        OnFocusSearchListener onFocusSearchListener = this.mListener;
        if (onFocusSearchListener != null && (onFocusSearch = onFocusSearchListener.onFocusSearch(view, i8)) != null) {
            return onFocusSearch;
        }
        return super.focusSearch(view, i8);
    }

    public OnChildFocusListener getOnChildFocusListener() {
        return this.mOnChildFocusListener;
    }

    public OnFocusSearchListener getOnFocusSearchListener() {
        return this.mListener;
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i8, Rect rect) {
        OnChildFocusListener onChildFocusListener = this.mOnChildFocusListener;
        if (onChildFocusListener != null && onChildFocusListener.onRequestFocusInDescendants(i8, rect)) {
            return true;
        }
        return super.onRequestFocusInDescendants(i8, rect);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        OnChildFocusListener onChildFocusListener = this.mOnChildFocusListener;
        if (onChildFocusListener != null) {
            onChildFocusListener.onRequestChildFocus(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public void setOnChildFocusListener(OnChildFocusListener onChildFocusListener) {
        this.mOnChildFocusListener = onChildFocusListener;
    }

    public void setOnDispatchKeyListener(View.OnKeyListener onKeyListener) {
        this.mOnDispatchKeyListener = onKeyListener;
    }

    public void setOnFocusSearchListener(OnFocusSearchListener onFocusSearchListener) {
        this.mListener = onFocusSearchListener;
    }

    public BrowseFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BrowseFrameLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
    }
}
