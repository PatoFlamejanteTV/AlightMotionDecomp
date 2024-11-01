package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.Recomposer;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.InternalComposeUiApi;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.Owner;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class AbstractComposeView extends ViewGroup {
    public static final int $stable = 8;
    private WeakReference<CompositionContext> cachedViewTreeCompositionContext;
    private Composition composition;
    private boolean creatingComposition;
    private Function0 disposeViewCompositionStrategy;
    private boolean isTransitionGroupSet;
    private CompositionContext parentContext;
    private IBinder previousAttachedWindowToken;
    private boolean showLayoutBounds;

    public AbstractComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    private final CompositionContext cacheIfAlive(CompositionContext compositionContext) {
        CompositionContext compositionContext2;
        if (isAlive(compositionContext)) {
            compositionContext2 = compositionContext;
        } else {
            compositionContext2 = null;
        }
        if (compositionContext2 != null) {
            this.cachedViewTreeCompositionContext = new WeakReference<>(compositionContext2);
        }
        return compositionContext;
    }

    private final void checkAddView() {
        if (this.creatingComposition) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    private final void ensureCompositionCreated() {
        if (this.composition == null) {
            try {
                this.creatingComposition = true;
                this.composition = Wrapper_androidKt.setContent(this, resolveParentCompositionContext(), ComposableLambdaKt.composableLambdaInstance(-656146368, true, new AbstractComposeView$ensureCompositionCreated$1(this)));
            } finally {
                this.creatingComposition = false;
            }
        }
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    @InternalComposeUiApi
    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    private final boolean isAlive(CompositionContext compositionContext) {
        if ((compositionContext instanceof Recomposer) && ((Recomposer.State) ((Recomposer) compositionContext).getCurrentState().getValue()).compareTo(Recomposer.State.ShuttingDown) <= 0) {
            return false;
        }
        return true;
    }

    private final CompositionContext resolveParentCompositionContext() {
        CompositionContext compositionContext;
        CompositionContext compositionContext2;
        CompositionContext compositionContext3 = this.parentContext;
        if (compositionContext3 == null) {
            CompositionContext findViewTreeCompositionContext = WindowRecomposer_androidKt.findViewTreeCompositionContext(this);
            CompositionContext compositionContext4 = null;
            if (findViewTreeCompositionContext != null) {
                compositionContext = cacheIfAlive(findViewTreeCompositionContext);
            } else {
                compositionContext = null;
            }
            if (compositionContext == null) {
                WeakReference<CompositionContext> weakReference = this.cachedViewTreeCompositionContext;
                if (weakReference != null && (compositionContext2 = weakReference.get()) != null && isAlive(compositionContext2)) {
                    compositionContext4 = compositionContext2;
                }
                CompositionContext compositionContext5 = compositionContext4;
                if (compositionContext5 == null) {
                    return cacheIfAlive(WindowRecomposer_androidKt.getWindowRecomposer(this));
                }
                return compositionContext5;
            }
            return compositionContext;
        }
        return compositionContext3;
    }

    private final void setParentContext(CompositionContext compositionContext) {
        if (this.parentContext != compositionContext) {
            this.parentContext = compositionContext;
            if (compositionContext != null) {
                this.cachedViewTreeCompositionContext = null;
            }
            Composition composition = this.composition;
            if (composition != null) {
                composition.dispose();
                this.composition = null;
                if (isAttachedToWindow()) {
                    ensureCompositionCreated();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.cachedViewTreeCompositionContext = null;
        }
    }

    @Composable
    @UiComposable
    public abstract void Content(Composer composer, int i8);

    @Override // android.view.ViewGroup
    public void addView(View view) {
        checkAddView();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        return super.addViewInLayout(view, i8, layoutParams);
    }

    public final void createComposition() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.".toString());
        }
        ensureCompositionCreated();
    }

    public final void disposeComposition() {
        Composition composition = this.composition;
        if (composition != null) {
            composition.dispose();
        }
        this.composition = null;
        requestLayout();
    }

    public final boolean getHasComposition() {
        if (this.composition != null) {
            return true;
        }
        return false;
    }

    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    public void internalOnLayout$ui_release(boolean z8, int i8, int i9, int i10, int i11) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i10 - i8) - getPaddingRight(), (i11 - i9) - getPaddingBottom());
        }
    }

    public void internalOnMeasure$ui_release(int i8, int i9) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i8, i9);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i8) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i8)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i9) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i9)));
        setMeasuredDimension(childAt.getMeasuredWidth() + getPaddingLeft() + getPaddingRight(), childAt.getMeasuredHeight() + getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.ViewGroup
    public boolean isTransitionGroup() {
        if (this.isTransitionGroupSet && !super.isTransitionGroup()) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getShouldCreateCompositionOnAttachedToWindow()) {
            ensureCompositionCreated();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        internalOnLayout$ui_release(z8, i8, i9, i10, i11);
    }

    @Override // android.view.View
    protected final void onMeasure(int i8, int i9) {
        ensureCompositionCreated();
        internalOnMeasure$ui_release(i8, i9);
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i8) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.setLayoutDirection(i8);
        }
    }

    public final void setParentCompositionContext(CompositionContext compositionContext) {
        setParentContext(compositionContext);
    }

    public final void setShowLayoutBounds(boolean z8) {
        this.showLayoutBounds = z8;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((Owner) childAt).setShowLayoutBounds(z8);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean z8) {
        super.setTransitionGroup(z8);
        this.isTransitionGroupSet = true;
    }

    public final void setViewCompositionStrategy(ViewCompositionStrategy viewCompositionStrategy) {
        Function0 function0 = this.disposeViewCompositionStrategy;
        if (function0 != null) {
            function0.invoke();
        }
        this.disposeViewCompositionStrategy = viewCompositionStrategy.installFor(this);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ AbstractComposeView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8) {
        checkAddView();
        super.addView(view, i8);
    }

    @Override // android.view.ViewGroup
    protected boolean addViewInLayout(View view, int i8, ViewGroup.LayoutParams layoutParams, boolean z8) {
        checkAddView();
        return super.addViewInLayout(view, i8, layoutParams, z8);
    }

    public AbstractComposeView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        setClipChildren(false);
        setClipToPadding(false);
        this.disposeViewCompositionStrategy = ViewCompositionStrategy.Companion.getDefault().installFor(this);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, int i9) {
        checkAddView();
        super.addView(view, i8, i9);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        checkAddView();
        super.addView(view, i8, layoutParams);
    }
}
