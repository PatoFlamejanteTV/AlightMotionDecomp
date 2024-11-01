package androidx.compose.material3.internal;

import Q5.p;
import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.compose.ui.R;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.platform.ViewRootForInspector;
import androidx.compose.ui.platform.a1;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.IntSizeKt;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class PopupLayout extends AbstractComposeView implements ViewRootForInspector, ViewTreeObserver.OnGlobalLayoutListener {
    private final State canCalculatePosition$delegate;
    private final View composeView;
    private final MutableState content$delegate;
    private final InterfaceC2072n dismissOnOutsideClick;
    private final float maxSupportedElevation;
    private Function0 onDismissRequest;
    private final WindowManager.LayoutParams params;
    private final MutableState parentBounds$delegate;
    private LayoutDirection parentLayoutDirection;
    private final MutableState popupContentSize$delegate;
    private PopupPositionProvider positionProvider;
    private final Rect previousWindowVisibleFrame;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private String testTag;
    private final Rect tmpWindowVisibleFrame;
    private final WindowManager windowManager;

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            iArr[LayoutDirection.Ltr.ordinal()] = 1;
            iArr[LayoutDirection.Rtl.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public PopupLayout(kotlin.jvm.functions.Function0 r8, java.lang.String r9, android.view.View r10, androidx.compose.ui.unit.Density r11, androidx.compose.ui.window.PopupPositionProvider r12, java.util.UUID r13) {
        /*
            r7 = this;
            java.lang.String r0 = "testTag"
            kotlin.jvm.internal.AbstractC3292y.i(r9, r0)
            java.lang.String r0 = "composeView"
            kotlin.jvm.internal.AbstractC3292y.i(r10, r0)
            java.lang.String r0 = "density"
            kotlin.jvm.internal.AbstractC3292y.i(r11, r0)
            java.lang.String r0 = "initialPositionProvider"
            kotlin.jvm.internal.AbstractC3292y.i(r12, r0)
            java.lang.String r0 = "popupId"
            kotlin.jvm.internal.AbstractC3292y.i(r13, r0)
            android.content.Context r2 = r10.getContext()
            java.lang.String r0 = "composeView.context"
            kotlin.jvm.internal.AbstractC3292y.h(r2, r0)
            r5 = 6
            r6 = 0
            r3 = 0
            r4 = 0
            r1 = r7
            r1.<init>(r2, r3, r4, r5, r6)
            r7.onDismissRequest = r8
            r7.testTag = r9
            r7.composeView = r10
            android.content.Context r8 = r10.getContext()
            java.lang.String r9 = "window"
            java.lang.Object r8 = r8.getSystemService(r9)
            java.lang.String r9 = "null cannot be cast to non-null type android.view.WindowManager"
            kotlin.jvm.internal.AbstractC3292y.g(r8, r9)
            android.view.WindowManager r8 = (android.view.WindowManager) r8
            r7.windowManager = r8
            android.view.WindowManager$LayoutParams r8 = r7.createLayoutParams()
            r7.params = r8
            r7.positionProvider = r12
            androidx.compose.ui.unit.LayoutDirection r8 = androidx.compose.ui.unit.LayoutDirection.Ltr
            r7.parentLayoutDirection = r8
            r8 = 0
            r9 = 2
            androidx.compose.runtime.MutableState r12 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(r8, r8, r9, r8)
            r7.parentBounds$delegate = r12
            androidx.compose.runtime.MutableState r12 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(r8, r8, r9, r8)
            r7.popupContentSize$delegate = r12
            androidx.compose.material3.internal.PopupLayout$canCalculatePosition$2 r12 = new androidx.compose.material3.internal.PopupLayout$canCalculatePosition$2
            r12.<init>(r7)
            androidx.compose.runtime.State r12 = androidx.compose.runtime.SnapshotStateKt.derivedStateOf(r12)
            r7.canCalculatePosition$delegate = r12
            r12 = 8
            float r12 = (float) r12
            float r12 = androidx.compose.ui.unit.Dp.m5155constructorimpl(r12)
            r7.maxSupportedElevation = r12
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.previousWindowVisibleFrame = r0
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r7.tmpWindowVisibleFrame = r0
            androidx.compose.material3.internal.PopupLayout$dismissOnOutsideClick$1 r0 = androidx.compose.material3.internal.PopupLayout$dismissOnOutsideClick$1.INSTANCE
            r7.dismissOnOutsideClick = r0
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            r7.setId(r0)
            androidx.lifecycle.LifecycleOwner r0 = androidx.lifecycle.ViewTreeLifecycleOwner.get(r10)
            androidx.lifecycle.ViewTreeLifecycleOwner.set(r7, r0)
            androidx.lifecycle.ViewModelStoreOwner r0 = androidx.lifecycle.ViewTreeViewModelStoreOwner.get(r10)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.set(r7, r0)
            androidx.savedstate.SavedStateRegistryOwner r0 = androidx.savedstate.ViewTreeSavedStateRegistryOwner.get(r10)
            androidx.savedstate.ViewTreeSavedStateRegistryOwner.set(r7, r0)
            android.view.ViewTreeObserver r10 = r10.getViewTreeObserver()
            r10.addOnGlobalLayoutListener(r7)
            int r10 = androidx.compose.ui.R.id.compose_view_saveable_id_tag
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Popup:"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r13 = r0.toString()
            r7.setTag(r10, r13)
            r10 = 0
            r7.setClipChildren(r10)
            float r10 = r11.mo425toPx0680j_4(r12)
            r7.setElevation(r10)
            androidx.compose.material3.internal.PopupLayout$2 r10 = new androidx.compose.material3.internal.PopupLayout$2
            r10.<init>()
            r7.setOutlineProvider(r10)
            androidx.compose.material3.internal.ComposableSingletons$ExposedDropdownMenuPopupKt r10 = androidx.compose.material3.internal.ComposableSingletons$ExposedDropdownMenuPopupKt.INSTANCE
            c6.n r10 = r10.m1930getLambda1$material3_release()
            androidx.compose.runtime.MutableState r8 = androidx.compose.runtime.SnapshotStateKt.mutableStateOf$default(r10, r8, r9, r8)
            r7.content$delegate = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.PopupLayout.<init>(kotlin.jvm.functions.Function0, java.lang.String, android.view.View, androidx.compose.ui.unit.Density, androidx.compose.ui.window.PopupPositionProvider, java.util.UUID):void");
    }

    private final WindowManager.LayoutParams createLayoutParams() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = this.composeView.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.composeView.getContext().getResources().getString(R.string.default_popup_window_title));
        return layoutParams;
    }

    private final InterfaceC2072n getContent() {
        return (InterfaceC2072n) this.content$delegate.getValue();
    }

    private final void setContent(InterfaceC2072n interfaceC2072n) {
        this.content$delegate.setValue(interfaceC2072n);
    }

    private final void superSetLayoutDirection(LayoutDirection layoutDirection) {
        int i8 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i9 = 1;
        if (i8 != 1) {
            if (i8 != 2) {
                throw new p();
            }
        } else {
            i9 = 0;
        }
        super.setLayoutDirection(i9);
    }

    private final IntRect toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    public void Content(Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-797839545);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-797839545, i8, -1, "androidx.compose.material3.internal.PopupLayout.Content (ExposedDropdownMenuPopup.kt:300)");
        }
        getContent().invoke(startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new PopupLayout$Content$4(this, i8));
        }
    }

    public final void dismiss() {
        ViewTreeLifecycleOwner.set(this, null);
        this.composeView.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.windowManager.removeViewImmediate(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent event) {
        KeyEvent.DispatcherState keyDispatcherState;
        AbstractC3292y.i(event, "event");
        if (event.getKeyCode() == 4) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(event);
            }
            if (event.getAction() == 0 && event.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(event, this);
                }
                return true;
            }
            if (event.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(event) && !event.isCanceled()) {
                Function0 function0 = this.onDismissRequest;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(event);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final IntRect getParentBounds() {
        return (IntRect) this.parentBounds$delegate.getValue();
    }

    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final IntSize m1935getPopupContentSizebOM6tXw() {
        return (IntSize) this.popupContentSize$delegate.getValue();
    }

    public final PopupPositionProvider getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public AbstractComposeView getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.testTag;
    }

    @Override // androidx.compose.ui.platform.ViewRootForInspector
    public /* synthetic */ View getViewRoot() {
        return a1.b(this);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.composeView.getWindowVisibleDisplayFrame(this.tmpWindowVisibleFrame);
        if (!AbstractC3292y.d(this.tmpWindowVisibleFrame, this.previousWindowVisibleFrame)) {
            updatePosition();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:            if (((java.lang.Boolean) r2.invoke(r1, r0)).booleanValue() != false) goto L27;     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            r5 = this;
            if (r6 != 0) goto L7
            boolean r6 = super.onTouchEvent(r6)
            return r6
        L7:
            int r0 = r6.getAction()
            r1 = 0
            if (r0 != 0) goto L38
            float r0 = r6.getX()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3f
            float r0 = r6.getX()
            int r2 = r5.getWidth()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3f
            float r0 = r6.getY()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 < 0) goto L3f
            float r0 = r6.getY()
            int r2 = r5.getHeight()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L3f
        L38:
            int r0 = r6.getAction()
            r2 = 4
            if (r0 != r2) goto L8a
        L3f:
            androidx.compose.ui.unit.IntRect r0 = r5.getParentBounds()
            if (r0 == 0) goto L81
            c6.n r2 = r5.dismissOnOutsideClick
            float r3 = r6.getX()
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 != 0) goto L59
            float r3 = r6.getY()
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 != 0) goto L59
            r1 = 0
            goto L75
        L59:
            android.view.WindowManager$LayoutParams r1 = r5.params
            int r1 = r1.x
            float r1 = (float) r1
            float r3 = r6.getX()
            float r1 = r1 + r3
            android.view.WindowManager$LayoutParams r3 = r5.params
            int r3 = r3.y
            float r3 = (float) r3
            float r4 = r6.getY()
            float r3 = r3 + r4
            long r3 = androidx.compose.ui.geometry.OffsetKt.Offset(r1, r3)
            androidx.compose.ui.geometry.Offset r1 = androidx.compose.ui.geometry.Offset.m2701boximpl(r3)
        L75:
            java.lang.Object r0 = r2.invoke(r1, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L8a
        L81:
            kotlin.jvm.functions.Function0 r6 = r5.onDismissRequest
            if (r6 == 0) goto L88
            r6.invoke()
        L88:
            r6 = 1
            return r6
        L8a:
            boolean r6 = super.onTouchEvent(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.PopupLayout.onTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.view.View
    public void setLayoutDirection(int i8) {
    }

    public final void setParentBounds(IntRect intRect) {
        this.parentBounds$delegate.setValue(intRect);
    }

    public final void setParentLayoutDirection(LayoutDirection layoutDirection) {
        AbstractC3292y.i(layoutDirection, "<set-?>");
        this.parentLayoutDirection = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m1936setPopupContentSizefhxjrPA(IntSize intSize) {
        this.popupContentSize$delegate.setValue(intSize);
    }

    public final void setPositionProvider(PopupPositionProvider popupPositionProvider) {
        AbstractC3292y.i(popupPositionProvider, "<set-?>");
        this.positionProvider = popupPositionProvider;
    }

    public final void setTestTag(String str) {
        AbstractC3292y.i(str, "<set-?>");
        this.testTag = str;
    }

    public final void show() {
        this.windowManager.addView(this, this.params);
    }

    public final void updateParameters(Function0 function0, String testTag, LayoutDirection layoutDirection) {
        AbstractC3292y.i(testTag, "testTag");
        AbstractC3292y.i(layoutDirection, "layoutDirection");
        this.onDismissRequest = function0;
        this.testTag = testTag;
        superSetLayoutDirection(layoutDirection);
    }

    public final void updatePosition() {
        IntSize m1935getPopupContentSizebOM6tXw;
        IntRect parentBounds = getParentBounds();
        if (parentBounds != null && (m1935getPopupContentSizebOM6tXw = m1935getPopupContentSizebOM6tXw()) != null) {
            long m5325unboximpl = m1935getPopupContentSizebOM6tXw.m5325unboximpl();
            Rect rect = this.previousWindowVisibleFrame;
            this.composeView.getWindowVisibleDisplayFrame(rect);
            IntRect intBounds = toIntBounds(rect);
            long mo987calculatePositionllwVHH4 = this.positionProvider.mo987calculatePositionllwVHH4(parentBounds, IntSizeKt.IntSize(intBounds.getWidth(), intBounds.getHeight()), this.parentLayoutDirection, m5325unboximpl);
            this.params.x = IntOffset.m5279getXimpl(mo987calculatePositionllwVHH4);
            this.params.y = IntOffset.m5280getYimpl(mo987calculatePositionllwVHH4);
            this.windowManager.updateViewLayout(this, this.params);
        }
    }

    public final void setContent(CompositionContext parent, InterfaceC2072n content) {
        AbstractC3292y.i(parent, "parent");
        AbstractC3292y.i(content, "content");
        setParentCompositionContext(parent);
        setContent(content);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }
}
