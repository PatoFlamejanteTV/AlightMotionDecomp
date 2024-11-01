package androidx.compose.foundation.lazy.layout;

import androidx.compose.foundation.ExperimentalFoundationApi;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyLayoutPinnableItemKt {
    @Composable
    @ExperimentalFoundationApi
    public static final void LazyLayoutPinnableItem(Object obj, int i8, LazyLayoutPinnedItemList pinnedItemList, InterfaceC2072n content, Composer composer, int i9) {
        AbstractC3292y.i(pinnedItemList, "pinnedItemList");
        AbstractC3292y.i(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-2079116560);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2079116560, i9, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:43)");
        }
        startRestartGroup.startReplaceableGroup(511388516);
        boolean changed = startRestartGroup.changed(obj) | startRestartGroup.changed(pinnedItemList);
        Object rememberedValue = startRestartGroup.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyLayoutPinnableItem(obj, pinnedItemList);
            startRestartGroup.updateRememberedValue(rememberedValue);
        }
        startRestartGroup.endReplaceableGroup();
        LazyLayoutPinnableItem lazyLayoutPinnableItem = (LazyLayoutPinnableItem) rememberedValue;
        lazyLayoutPinnableItem.setIndex(i8);
        lazyLayoutPinnableItem.setParentPinnableContainer((PinnableContainer) startRestartGroup.consume(PinnableContainerKt.getLocalPinnableContainer()));
        startRestartGroup.startReplaceableGroup(1157296644);
        boolean changed2 = startRestartGroup.changed(lazyLayoutPinnableItem);
        Object rememberedValue2 = startRestartGroup.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
            rememberedValue2 = new LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1(lazyLayoutPinnableItem);
            startRestartGroup.updateRememberedValue(rememberedValue2);
        }
        startRestartGroup.endReplaceableGroup();
        EffectsKt.DisposableEffect(lazyLayoutPinnableItem, (Function1) rememberedValue2, startRestartGroup, 0);
        CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{PinnableContainerKt.getLocalPinnableContainer().provides(lazyLayoutPinnableItem)}, content, startRestartGroup, ((i9 >> 6) & 112) | 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2(obj, i8, pinnedItemList, content, i9));
        }
    }
}
