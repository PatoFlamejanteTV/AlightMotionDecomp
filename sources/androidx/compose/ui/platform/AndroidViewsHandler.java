package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import java.util.HashMap;
import java.util.Iterator;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class AndroidViewsHandler extends ViewGroup {
    public static final int $stable = 8;
    private final HashMap<AndroidViewHolder, LayoutNode> holderToLayoutNode;
    private final HashMap<LayoutNode, AndroidViewHolder> layoutNodeToHolder;

    public AndroidViewsHandler(Context context) {
        super(context);
        setClipChildren(false);
        this.holderToLayoutNode = new HashMap<>();
        this.layoutNodeToHolder = new HashMap<>();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final void drawView(AndroidViewHolder androidViewHolder, Canvas canvas) {
        androidViewHolder.draw(canvas);
    }

    public final HashMap<AndroidViewHolder, LayoutNode> getHolderToLayoutNode() {
        return this.holderToLayoutNode;
    }

    public final HashMap<LayoutNode, AndroidViewHolder> getLayoutNodeToHolder() {
        return this.layoutNodeToHolder;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public Void invalidateChildInParent(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void onDescendantInvalidated(View view, View view2) {
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        for (AndroidViewHolder androidViewHolder : this.holderToLayoutNode.keySet()) {
            androidViewHolder.layout(androidViewHolder.getLeft(), androidViewHolder.getTop(), androidViewHolder.getRight(), androidViewHolder.getBottom());
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        if (View.MeasureSpec.getMode(i8) == 1073741824) {
            if (View.MeasureSpec.getMode(i9) == 1073741824) {
                setMeasuredDimension(View.MeasureSpec.getSize(i8), View.MeasureSpec.getSize(i9));
                Iterator<T> it = this.holderToLayoutNode.keySet().iterator();
                while (it.hasNext()) {
                    ((AndroidViewHolder) it.next()).remeasure();
                }
                return;
            }
            throw new IllegalArgumentException("heightMeasureSpec should be EXACTLY".toString());
        }
        throw new IllegalArgumentException("widthMeasureSpec should be EXACTLY".toString());
    }

    @Override // android.view.View, android.view.ViewParent
    @SuppressLint({"MissingSuperCall"})
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            LayoutNode layoutNode = this.holderToLayoutNode.get(childAt);
            if (childAt.isLayoutRequested() && layoutNode != null) {
                LayoutNode.requestRemeasure$ui_release$default(layoutNode, false, false, 3, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) invalidateChildInParent(iArr, rect);
    }
}
