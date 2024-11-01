package androidx.compose.ui.platform;

import android.content.Context;
import android.util.AttributeSet;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3284p;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class ComposeView extends AbstractComposeView {
    public static final int $stable = 8;
    private final MutableState<InterfaceC2072n> content;
    private boolean shouldCreateCompositionOnAttachedToWindow;

    public ComposeView(Context context) {
        this(context, null, 0, 6, null);
    }

    protected static /* synthetic */ void getShouldCreateCompositionOnAttachedToWindow$annotations() {
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    @Composable
    public void Content(Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(420213850);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(420213850, i8, -1, "androidx.compose.ui.platform.ComposeView.Content (ComposeView.android.kt:426)");
        }
        InterfaceC2072n value = this.content.getValue();
        if (value != null) {
            value.invoke(startRestartGroup, 0);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ComposeView$Content$1(this, i8));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return ComposeView.class.getName();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    protected boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void setContent(InterfaceC2072n interfaceC2072n) {
        this.shouldCreateCompositionOnAttachedToWindow = true;
        this.content.setValue(interfaceC2072n);
        if (isAttachedToWindow()) {
            createComposition();
        }
    }

    public ComposeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ ComposeView(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC3284p abstractC3284p) {
        this(context, (i9 & 2) != 0 ? null : attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    public ComposeView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        MutableState<InterfaceC2072n> mutableStateOf$default;
        mutableStateOf$default = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.content = mutableStateOf$default;
    }
}
