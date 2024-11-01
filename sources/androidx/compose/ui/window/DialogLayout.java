package androidx.compose.ui.window;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.platform.AbstractComposeView;
import c6.InterfaceC2072n;
import e6.AbstractC2829a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class DialogLayout extends AbstractComposeView implements DialogWindowProvider {
    private final MutableState content$delegate;
    private boolean shouldCreateCompositionOnAttachedToWindow;
    private boolean usePlatformDefaultWidth;
    private final Window window;

    public DialogLayout(Context context, Window window) {
        super(context, null, 0, 6, null);
        MutableState mutableStateOf$default;
        this.window = window;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ComposableSingletons$AndroidDialog_androidKt.INSTANCE.m5412getLambda1$ui_release(), null, 2, null);
        this.content$delegate = mutableStateOf$default;
    }

    private final InterfaceC2072n getContent() {
        return (InterfaceC2072n) this.content$delegate.getValue();
    }

    private final int getDisplayHeight() {
        return AbstractC2829a.d(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return AbstractC2829a.d(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final void setContent(InterfaceC2072n interfaceC2072n) {
        this.content$delegate.setValue(interfaceC2072n);
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    public void Content(Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(1735448596);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1735448596, i8, -1, "androidx.compose.ui.window.DialogLayout.Content (AndroidDialog.android.kt:268)");
        }
        getContent().invoke(startRestartGroup, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new DialogLayout$Content$4(this, i8));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    public final boolean getUsePlatformDefaultWidth() {
        return this.usePlatformDefaultWidth;
    }

    @Override // androidx.compose.ui.window.DialogWindowProvider
    public Window getWindow() {
        return this.window;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnLayout$ui_release(boolean z8, int i8, int i9, int i10, int i11) {
        View childAt;
        super.internalOnLayout$ui_release(z8, i8, i9, i10, i11);
        if (this.usePlatformDefaultWidth || (childAt = getChildAt(0)) == null) {
            return;
        }
        getWindow().setLayout(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public void internalOnMeasure$ui_release(int i8, int i9) {
        if (this.usePlatformDefaultWidth) {
            super.internalOnMeasure$ui_release(i8, i9);
        } else {
            super.internalOnMeasure$ui_release(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final void setUsePlatformDefaultWidth(boolean z8) {
        this.usePlatformDefaultWidth = z8;
    }

    public final void setContent(CompositionContext compositionContext, InterfaceC2072n interfaceC2072n) {
        setParentCompositionContext(compositionContext);
        setContent(interfaceC2072n);
        this.shouldCreateCompositionOnAttachedToWindow = true;
        createComposition();
    }
}
