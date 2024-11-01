package androidx.compose.ui.layout;

import Q5.I;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.AbstractC3293z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class LayoutKt$materializerOfWithCompositionLocalInjection$1 extends AbstractC3293z implements InterfaceC2073o {
    final /* synthetic */ Modifier $modifier;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LayoutKt$materializerOfWithCompositionLocalInjection$1(Modifier modifier) {
        super(3);
        this.$modifier = modifier;
    }

    @Override // c6.InterfaceC2073o
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        m4123invokeDeg8D_g(((SkippableUpdater) obj).m2469unboximpl(), (Composer) obj2, ((Number) obj3).intValue());
        return I.f8786a;
    }

    @Composable
    /* renamed from: invoke-Deg8D_g, reason: not valid java name */
    public final void m4123invokeDeg8D_g(Composer composer, Composer composer2, int i8) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-55743822, i8, -1, "androidx.compose.ui.layout.materializerOfWithCompositionLocalInjection.<anonymous> (Layout.kt:225)");
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
        Modifier materializeWithCompositionLocalInjectionInternal = ComposedModifierKt.materializeWithCompositionLocalInjectionInternal(composer2, this.$modifier);
        composer.startReplaceableGroup(509942095);
        Composer m2473constructorimpl = Updater.m2473constructorimpl(composer);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Updater.m2480setimpl(m2473constructorimpl, materializeWithCompositionLocalInjectionInternal, companion.getSetModifier());
        InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        composer.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }
}
