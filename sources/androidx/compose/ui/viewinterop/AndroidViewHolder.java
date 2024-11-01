package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.runtime.ComposeNodeLifecycleCallback;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.DrawModifierKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt;
import androidx.compose.ui.layout.IntrinsicMeasurable;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.OnGloballyPositionedModifierKt;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.node.OwnerScope;
import androidx.compose.ui.node.OwnerSnapshotObserver;
import androidx.compose.ui.platform.NestedScrollInteropConnectionKt;
import androidx.compose.ui.platform.WindowRecomposer_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.DensityKt;
import androidx.compose.ui.unit.VelocityKt;
import androidx.core.view.NestedScrollingParent3;
import androidx.core.view.NestedScrollingParentHelper;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import i6.m;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class AndroidViewHolder extends ViewGroup implements NestedScrollingParent3, ComposeNodeLifecycleCallback, OwnerScope {
    private final int compositeKeyHash;
    private Density density;
    private final NestedScrollDispatcher dispatcher;
    private boolean hasUpdateBlock;
    private boolean isDrawing;
    private int lastHeightMeasureSpec;
    private int lastWidthMeasureSpec;
    private final LayoutNode layoutNode;
    private LifecycleOwner lifecycleOwner;
    private final int[] location;
    private Modifier modifier;
    private final NestedScrollingParentHelper nestedScrollingParentHelper;
    private Function1 onDensityChanged;
    private Function1 onModifierChanged;
    private Function1 onRequestDisallowInterceptTouchEvent;
    private final Owner owner;
    private Function0 release;
    private Function0 reset;
    private final Function0 runInvalidate;
    private final Function0 runUpdate;
    private SavedStateRegistryOwner savedStateRegistryOwner;
    private Function0 update;
    private final View view;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final Function1 OnCommitAffectingUpdate = AndroidViewHolder$Companion$OnCommitAffectingUpdate$1.INSTANCE;

    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    public AndroidViewHolder(Context context, CompositionContext compositionContext, int i8, NestedScrollDispatcher nestedScrollDispatcher, View view, Owner owner) {
        super(context);
        this.compositeKeyHash = i8;
        this.dispatcher = nestedScrollDispatcher;
        this.view = view;
        this.owner = owner;
        if (compositionContext != null) {
            WindowRecomposer_androidKt.setCompositionContext(this, compositionContext);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        this.update = AndroidViewHolder$update$1.INSTANCE;
        this.reset = AndroidViewHolder$reset$1.INSTANCE;
        this.release = AndroidViewHolder$release$1.INSTANCE;
        Modifier.Companion companion = Modifier.Companion;
        this.modifier = companion;
        this.density = DensityKt.Density$default(1.0f, 0.0f, 2, null);
        this.runUpdate = new AndroidViewHolder$runUpdate$1(this);
        this.runInvalidate = new AndroidViewHolder$runInvalidate$1(this);
        this.location = new int[2];
        this.lastWidthMeasureSpec = Integer.MIN_VALUE;
        this.lastHeightMeasureSpec = Integer.MIN_VALUE;
        this.nestedScrollingParentHelper = new NestedScrollingParentHelper(this);
        byte b9 = 0 == true ? 1 : 0;
        final LayoutNode layoutNode = new LayoutNode(false, b9, 3, null);
        layoutNode.setInteropViewFactoryHolder$ui_release(this);
        Modifier onGloballyPositioned = OnGloballyPositionedModifierKt.onGloballyPositioned(DrawModifierKt.drawBehind(PointerInteropFilter_androidKt.pointerInteropFilter(SemanticsModifierKt.semantics(NestedScrollModifierKt.nestedScroll(companion, AndroidViewHolder_androidKt.access$getNoOpScrollConnection$p(), nestedScrollDispatcher), true, AndroidViewHolder$layoutNode$1$coreModifier$1.INSTANCE), this), new AndroidViewHolder$layoutNode$1$coreModifier$2(this, layoutNode, this)), new AndroidViewHolder$layoutNode$1$coreModifier$3(this, layoutNode));
        layoutNode.setCompositeKeyHash(i8);
        layoutNode.setModifier(this.modifier.then(onGloballyPositioned));
        this.onModifierChanged = new AndroidViewHolder$layoutNode$1$1(layoutNode, onGloballyPositioned);
        layoutNode.setDensity(this.density);
        this.onDensityChanged = new AndroidViewHolder$layoutNode$1$2(layoutNode);
        layoutNode.setOnAttach$ui_release(new AndroidViewHolder$layoutNode$1$3(this, layoutNode));
        layoutNode.setOnDetach$ui_release(new AndroidViewHolder$layoutNode$1$4(this));
        layoutNode.setMeasurePolicy(new MeasurePolicy() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder$layoutNode$1$5
            private final int intrinsicHeight(int i9) {
                int obtainMeasureSpec;
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
                AbstractC3292y.f(layoutParams);
                obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(0, i9, layoutParams.width);
                androidViewHolder.measure(obtainMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
                return AndroidViewHolder.this.getMeasuredHeight();
            }

            private final int intrinsicWidth(int i9) {
                int obtainMeasureSpec;
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
                AbstractC3292y.f(layoutParams);
                obtainMeasureSpec = androidViewHolder2.obtainMeasureSpec(0, i9, layoutParams.height);
                androidViewHolder.measure(makeMeasureSpec, obtainMeasureSpec);
                return AndroidViewHolder.this.getMeasuredWidth();
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i9) {
                return intrinsicHeight(i9);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i9) {
                return intrinsicWidth(i9);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            /* renamed from: measure-3p2s80s */
            public MeasureResult mo109measure3p2s80s(MeasureScope measureScope, List<? extends Measurable> list, long j8) {
                int obtainMeasureSpec;
                int obtainMeasureSpec2;
                if (AndroidViewHolder.this.getChildCount() == 0) {
                    return MeasureScope.CC.q(measureScope, Constraints.m5125getMinWidthimpl(j8), Constraints.m5124getMinHeightimpl(j8), null, AndroidViewHolder$layoutNode$1$5$measure$1.INSTANCE, 4, null);
                }
                if (Constraints.m5125getMinWidthimpl(j8) != 0) {
                    AndroidViewHolder.this.getChildAt(0).setMinimumWidth(Constraints.m5125getMinWidthimpl(j8));
                }
                if (Constraints.m5124getMinHeightimpl(j8) != 0) {
                    AndroidViewHolder.this.getChildAt(0).setMinimumHeight(Constraints.m5124getMinHeightimpl(j8));
                }
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                int m5125getMinWidthimpl = Constraints.m5125getMinWidthimpl(j8);
                int m5123getMaxWidthimpl = Constraints.m5123getMaxWidthimpl(j8);
                ViewGroup.LayoutParams layoutParams = AndroidViewHolder.this.getLayoutParams();
                AbstractC3292y.f(layoutParams);
                obtainMeasureSpec = androidViewHolder.obtainMeasureSpec(m5125getMinWidthimpl, m5123getMaxWidthimpl, layoutParams.width);
                AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
                int m5124getMinHeightimpl = Constraints.m5124getMinHeightimpl(j8);
                int m5122getMaxHeightimpl = Constraints.m5122getMaxHeightimpl(j8);
                ViewGroup.LayoutParams layoutParams2 = AndroidViewHolder.this.getLayoutParams();
                AbstractC3292y.f(layoutParams2);
                obtainMeasureSpec2 = androidViewHolder2.obtainMeasureSpec(m5124getMinHeightimpl, m5122getMaxHeightimpl, layoutParams2.height);
                androidViewHolder.measure(obtainMeasureSpec, obtainMeasureSpec2);
                return MeasureScope.CC.q(measureScope, AndroidViewHolder.this.getMeasuredWidth(), AndroidViewHolder.this.getMeasuredHeight(), null, new AndroidViewHolder$layoutNode$1$5$measure$2(AndroidViewHolder.this, layoutNode), 4, null);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i9) {
                return intrinsicHeight(i9);
            }

            @Override // androidx.compose.ui.layout.MeasurePolicy
            public int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List<? extends IntrinsicMeasurable> list, int i9) {
                return intrinsicWidth(i9);
            }
        });
        this.layoutNode = layoutNode;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OwnerSnapshotObserver getSnapshotObserver() {
        if (isAttachedToWindow()) {
            return this.owner.getSnapshotObserver();
        }
        throw new IllegalStateException("Expected AndroidViewHolder to be attached when observing reads.".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int obtainMeasureSpec(int i8, int i9, int i10) {
        if (i10 < 0 && i8 != i9) {
            if (i10 == -2 && i9 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i9, Integer.MIN_VALUE);
            }
            if (i10 == -1 && i9 != Integer.MAX_VALUE) {
                return View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
            }
            return View.MeasureSpec.makeMeasureSpec(0, 0);
        }
        return View.MeasureSpec.makeMeasureSpec(m.k(i10, i8, i9), 1073741824);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i8 = iArr[0];
        region.op(i8, iArr[1], i8 + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final Density getDensity() {
        return this.density;
    }

    public final View getInteropView() {
        return this.view;
    }

    public final LayoutNode getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        if (layoutParams == null) {
            return new ViewGroup.LayoutParams(-1, -1);
        }
        return layoutParams;
    }

    public final LifecycleOwner getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final Modifier getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup, androidx.core.view.NestedScrollingParent
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.getNestedScrollAxes();
    }

    public final Function1 getOnDensityChanged$ui_release() {
        return this.onDensityChanged;
    }

    public final Function1 getOnModifierChanged$ui_release() {
        return this.onModifierChanged;
    }

    public final Function1 getOnRequestDisallowInterceptTouchEvent$ui_release() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final Function0 getRelease() {
        return this.release;
    }

    public final Function0 getReset() {
        return this.reset;
    }

    public final SavedStateRegistryOwner getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final Function0 getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        super.invalidateChildInParent(iArr, rect);
        invalidateOrDefer();
        return null;
    }

    public final void invalidateOrDefer() {
        if (this.isDrawing) {
            View view = this.view;
            final Function0 function0 = this.runInvalidate;
            view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.a
                @Override // java.lang.Runnable
                public final void run() {
                    Function0.this.invoke();
                }
            });
            return;
        }
        this.layoutNode.invalidateLayer$ui_release();
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // androidx.compose.ui.node.OwnerScope
    public boolean isValidOwnerScope() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onDeactivate() {
        this.reset.invoke();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
        super.onDescendantInvalidated(view, view2);
        invalidateOrDefer();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().clear$ui_release(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        this.view.layout(0, 0, i10 - i8, i11 - i9);
    }

    @Override // android.view.View
    protected void onMeasure(int i8, int i9) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(i8), View.MeasureSpec.getSize(i9));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(i8, i9);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = i8;
        this.lastHeightMeasureSpec = i9;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedFling(View view, float f8, float f9, boolean z8) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC3458i.d(this.dispatcher.getCoroutineScope(), null, null, new AndroidViewHolder$onNestedFling$1(z8, this, VelocityKt.Velocity(AndroidViewHolder_androidKt.access$toComposeVelocity(f8), AndroidViewHolder_androidKt.access$toComposeVelocity(f9)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.NestedScrollingParent
    public boolean onNestedPreFling(View view, float f8, float f9) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        AbstractC3458i.d(this.dispatcher.getCoroutineScope(), null, null, new AndroidViewHolder$onNestedPreFling$1(this, VelocityKt.Velocity(AndroidViewHolder_androidKt.access$toComposeVelocity(f8), AndroidViewHolder_androidKt.access$toComposeVelocity(f9)), null), 3, null);
        return false;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedPreScroll(View view, int i8, int i9, int[] iArr, int i10) {
        if (!isNestedScrollingEnabled()) {
            return;
        }
        long m3891dispatchPreScrollOzD1aCk = this.dispatcher.m3891dispatchPreScrollOzD1aCk(OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(i8), AndroidViewHolder_androidKt.access$toComposeOffset(i9)), AndroidViewHolder_androidKt.access$toNestedScrollSource(i10));
        iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2712getXimpl(m3891dispatchPreScrollOzD1aCk));
        iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2713getYimpl(m3891dispatchPreScrollOzD1aCk));
    }

    @Override // androidx.core.view.NestedScrollingParent3
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        if (isNestedScrollingEnabled()) {
            long m3889dispatchPostScrollDzOQY0M = this.dispatcher.m3889dispatchPostScrollDzOQY0M(OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(i8), AndroidViewHolder_androidKt.access$toComposeOffset(i9)), OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(i10), AndroidViewHolder_androidKt.access$toComposeOffset(i11)), AndroidViewHolder_androidKt.access$toNestedScrollSource(i12));
            iArr[0] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2712getXimpl(m3889dispatchPostScrollDzOQY0M));
            iArr[1] = NestedScrollInteropConnectionKt.composeToViewOffset(Offset.m2713getYimpl(m3889dispatchPostScrollDzOQY0M));
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScrollAccepted(View view, View view2, int i8, int i9) {
        this.nestedScrollingParentHelper.onNestedScrollAccepted(view, view2, i8, i9);
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onRelease() {
        this.release.invoke();
    }

    @Override // androidx.compose.runtime.ComposeNodeLifecycleCallback
    public void onReuse() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.invoke();
        }
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public boolean onStartNestedScroll(View view, View view2, int i8, int i9) {
        return ((i8 & 2) == 0 && (i8 & 1) == 0) ? false : true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onStopNestedScroll(View view, int i8) {
        this.nestedScrollingParentHelper.onStopNestedScroll(view, i8);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i8) {
        super.onWindowVisibilityChanged(i8);
        if (Build.VERSION.SDK_INT < 23 && i8 == 0) {
            this.layoutNode.invalidateLayer$ui_release();
        }
    }

    public final void remeasure() {
        int i8;
        int i9 = this.lastWidthMeasureSpec;
        if (i9 != Integer.MIN_VALUE && (i8 = this.lastHeightMeasureSpec) != Integer.MIN_VALUE) {
            measure(i9, i8);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z8) {
        Function1 function1 = this.onRequestDisallowInterceptTouchEvent;
        if (function1 != null) {
            function1.invoke(Boolean.valueOf(z8));
        }
        super.requestDisallowInterceptTouchEvent(z8);
    }

    public final void setDensity(Density density) {
        if (density != this.density) {
            this.density = density;
            Function1 function1 = this.onDensityChanged;
            if (function1 != null) {
                function1.invoke(density);
            }
        }
    }

    public final void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (lifecycleOwner != this.lifecycleOwner) {
            this.lifecycleOwner = lifecycleOwner;
            ViewTreeLifecycleOwner.set(this, lifecycleOwner);
        }
    }

    public final void setModifier(Modifier modifier) {
        if (modifier != this.modifier) {
            this.modifier = modifier;
            Function1 function1 = this.onModifierChanged;
            if (function1 != null) {
                function1.invoke(modifier);
            }
        }
    }

    public final void setOnDensityChanged$ui_release(Function1 function1) {
        this.onDensityChanged = function1;
    }

    public final void setOnModifierChanged$ui_release(Function1 function1) {
        this.onModifierChanged = function1;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui_release(Function1 function1) {
        this.onRequestDisallowInterceptTouchEvent = function1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setRelease(Function0 function0) {
        this.release = function0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setReset(Function0 function0) {
        this.reset = function0;
    }

    public final void setSavedStateRegistryOwner(SavedStateRegistryOwner savedStateRegistryOwner) {
        if (savedStateRegistryOwner != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = savedStateRegistryOwner;
            ViewTreeSavedStateRegistryOwner.set(this, savedStateRegistryOwner);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setUpdate(Function0 function0) {
        this.update = function0;
        this.hasUpdateBlock = true;
        this.runUpdate.invoke();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.NestedScrollingParent2
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11, int i12) {
        if (isNestedScrollingEnabled()) {
            this.dispatcher.m3889dispatchPostScrollDzOQY0M(OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(i8), AndroidViewHolder_androidKt.access$toComposeOffset(i9)), OffsetKt.Offset(AndroidViewHolder_androidKt.access$toComposeOffset(i10), AndroidViewHolder_androidKt.access$toComposeOffset(i11)), AndroidViewHolder_androidKt.access$toNestedScrollSource(i12));
        }
    }
}
