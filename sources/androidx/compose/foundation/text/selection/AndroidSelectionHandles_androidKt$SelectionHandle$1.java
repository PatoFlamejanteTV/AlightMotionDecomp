package androidx.compose.foundation.text.selection;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.style.ResolvedTextDirection;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidSelectionHandles_androidKt$SelectionHandle$1 extends AbstractC3293z implements InterfaceC2072n {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ InterfaceC2072n $content;
    final /* synthetic */ ResolvedTextDirection $direction;
    final /* synthetic */ boolean $handlesCrossed;
    final /* synthetic */ boolean $isStartHandle;
    final /* synthetic */ Modifier $modifier;
    final /* synthetic */ long $position;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidSelectionHandles_androidKt$SelectionHandle$1(InterfaceC2072n interfaceC2072n, Modifier modifier, boolean z8, long j8, int i8, ResolvedTextDirection resolvedTextDirection, boolean z9) {
        super(2);
        this.$content = interfaceC2072n;
        this.$modifier = modifier;
        this.$isStartHandle = z8;
        this.$position = j8;
        this.$$dirty = i8;
        this.$direction = resolvedTextDirection;
        this.$handlesCrossed = z9;
    }

    @Override // c6.InterfaceC2072n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((Composer) obj, ((Number) obj2).intValue());
        return I.f8786a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public final void invoke(Composer composer, int i8) {
        if ((i8 & 11) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(732099485, i8, -1, "androidx.compose.foundation.text.selection.SelectionHandle.<anonymous> (AndroidSelectionHandles.android.kt:69)");
        }
        if (this.$content == null) {
            composer.startReplaceableGroup(386443790);
            Modifier modifier = this.$modifier;
            Boolean valueOf = Boolean.valueOf(this.$isStartHandle);
            Offset m2701boximpl = Offset.m2701boximpl(this.$position);
            boolean z8 = this.$isStartHandle;
            long j8 = this.$position;
            composer.startReplaceableGroup(511388516);
            boolean changed = composer.changed(valueOf) | composer.changed(m2701boximpl);
            Object rememberedValue = composer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new AndroidSelectionHandles_androidKt$SelectionHandle$1$1$1(z8, j8);
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            AndroidSelectionHandles_androidKt.DefaultSelectionHandle(SemanticsModifierKt.semantics$default(modifier, false, (Function1) rememberedValue, 1, null), this.$isStartHandle, this.$direction, this.$handlesCrossed, composer, this.$$dirty & 8176);
            composer.endReplaceableGroup();
        } else {
            composer.startReplaceableGroup(386444465);
            this.$content.invoke(composer, Integer.valueOf((this.$$dirty >> 15) & 14));
            composer.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
