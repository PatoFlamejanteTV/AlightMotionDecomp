package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import c6.InterfaceC2075q;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyStaggeredGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LazyHorizontalStaggeredGrid-cJHQLPU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m745LazyHorizontalStaggeredGridcJHQLPU(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, androidx.compose.foundation.layout.Arrangement.Vertical r33, float r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, kotlin.jvm.functions.Function1 r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 631
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m745LazyHorizontalStaggeredGridcJHQLPU(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, float, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0114  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: LazyVerticalStaggeredGrid-zadm560, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m746LazyVerticalStaggeredGridzadm560(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells r28, androidx.compose.ui.Modifier r29, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState r30, androidx.compose.foundation.layout.PaddingValues r31, boolean r32, float r33, androidx.compose.foundation.layout.Arrangement.Horizontal r34, androidx.compose.foundation.gestures.FlingBehavior r35, boolean r36, kotlin.jvm.functions.Function1 r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 635
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridDslKt.m746LazyVerticalStaggeredGridzadm560(androidx.compose.foundation.lazy.staggeredgrid.StaggeredGridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState, androidx.compose.foundation.layout.PaddingValues, boolean, float, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> items, Function1 function1, Function1 contentType, Function1 function12, InterfaceC2074p itemContent) {
        AbstractC3292y.i(lazyStaggeredGridScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, items) : null, new LazyStaggeredGridDslKt$items$3(contentType, items), function12 != null ? new LazyStaggeredGridDslKt$items$4$1(function12, items) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new LazyStaggeredGridDslKt$items$5(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, List items, Function1 function1, Function1 contentType, Function1 function12, InterfaceC2074p itemContent, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            function1 = null;
        }
        if ((i8 & 4) != 0) {
            contentType = LazyStaggeredGridDslKt$items$1.INSTANCE;
        }
        if ((i8 & 8) != 0) {
            function12 = null;
        }
        AbstractC3292y.i(lazyStaggeredGridScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), function1 != null ? new LazyStaggeredGridDslKt$items$2$1(function1, items) : null, new LazyStaggeredGridDslKt$items$3(contentType, items), function12 != null ? new LazyStaggeredGridDslKt$items$4$1(function12, items) : null, ComposableLambdaKt.composableLambdaInstance(-886456479, true, new LazyStaggeredGridDslKt$items$5(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, List<? extends T> items, InterfaceC2072n interfaceC2072n, InterfaceC2072n contentType, InterfaceC2072n interfaceC2072n2, InterfaceC2075q itemContent) {
        AbstractC3292y.i(lazyStaggeredGridScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), interfaceC2072n != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(interfaceC2072n, items) : null, new LazyStaggeredGridDslKt$itemsIndexed$3(contentType, items), interfaceC2072n2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(interfaceC2072n2, items) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new LazyStaggeredGridDslKt$itemsIndexed$5(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, List items, InterfaceC2072n interfaceC2072n, InterfaceC2072n contentType, InterfaceC2072n interfaceC2072n2, InterfaceC2075q itemContent, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            interfaceC2072n = null;
        }
        if ((i8 & 4) != 0) {
            contentType = LazyStaggeredGridDslKt$itemsIndexed$1.INSTANCE;
        }
        if ((i8 & 8) != 0) {
            interfaceC2072n2 = null;
        }
        AbstractC3292y.i(lazyStaggeredGridScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.size(), interfaceC2072n != null ? new LazyStaggeredGridDslKt$itemsIndexed$2$1(interfaceC2072n, items) : null, new LazyStaggeredGridDslKt$itemsIndexed$3(contentType, items), interfaceC2072n2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$4$1(interfaceC2072n2, items) : null, ComposableLambdaKt.composableLambdaInstance(284833944, true, new LazyStaggeredGridDslKt$itemsIndexed$5(itemContent, items)));
    }

    @Composable
    private static final InterfaceC2072n rememberColumnSlots(StaggeredGridCells staggeredGridCells, Arrangement.Horizontal horizontal, PaddingValues paddingValues, Composer composer, int i8) {
        composer.startReplaceableGroup(-1038659655);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1038659655, i8, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberColumnSlots (LazyStaggeredGridDsl.kt:90)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(staggeredGridCells) | composer.changed(horizontal) | composer.changed(paddingValues);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridSlotCache(new LazyStaggeredGridDslKt$rememberColumnSlots$1$1(paddingValues, staggeredGridCells, horizontal));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        InterfaceC2072n interfaceC2072n = (InterfaceC2072n) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return interfaceC2072n;
    }

    @Composable
    private static final InterfaceC2072n rememberRowSlots(StaggeredGridCells staggeredGridCells, Arrangement.Vertical vertical, PaddingValues paddingValues, Composer composer, int i8) {
        composer.startReplaceableGroup(-675899235);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-675899235, i8, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberRowSlots (LazyStaggeredGridDsl.kt:180)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(staggeredGridCells) | composer.changed(vertical) | composer.changed(paddingValues);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new LazyStaggeredGridSlotCache(new LazyStaggeredGridDslKt$rememberRowSlots$1$1(paddingValues, staggeredGridCells, vertical));
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        InterfaceC2072n interfaceC2072n = (InterfaceC2072n) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return interfaceC2072n;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyStaggeredGridScope lazyStaggeredGridScope, T[] items, Function1 function1, Function1 contentType, Function1 function12, InterfaceC2074p itemContent) {
        AbstractC3292y.i(lazyStaggeredGridScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, items) : null, new LazyStaggeredGridDslKt$items$8(contentType, items), function12 != null ? new LazyStaggeredGridDslKt$items$9$1(function12, items) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new LazyStaggeredGridDslKt$items$10(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyStaggeredGridScope lazyStaggeredGridScope, T[] items, InterfaceC2072n interfaceC2072n, InterfaceC2072n contentType, InterfaceC2072n interfaceC2072n2, InterfaceC2075q itemContent) {
        AbstractC3292y.i(lazyStaggeredGridScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, interfaceC2072n != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(interfaceC2072n, items) : null, new LazyStaggeredGridDslKt$itemsIndexed$8(contentType, items), interfaceC2072n2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(interfaceC2072n2, items) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new LazyStaggeredGridDslKt$itemsIndexed$10(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] items, Function1 function1, Function1 contentType, Function1 function12, InterfaceC2074p itemContent, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            function1 = null;
        }
        if ((i8 & 4) != 0) {
            contentType = LazyStaggeredGridDslKt$items$6.INSTANCE;
        }
        if ((i8 & 8) != 0) {
            function12 = null;
        }
        AbstractC3292y.i(lazyStaggeredGridScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, function1 != null ? new LazyStaggeredGridDslKt$items$7$1(function1, items) : null, new LazyStaggeredGridDslKt$items$8(contentType, items), function12 != null ? new LazyStaggeredGridDslKt$items$9$1(function12, items) : null, ComposableLambdaKt.composableLambdaInstance(2101296000, true, new LazyStaggeredGridDslKt$items$10(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyStaggeredGridScope lazyStaggeredGridScope, Object[] items, InterfaceC2072n interfaceC2072n, InterfaceC2072n contentType, InterfaceC2072n interfaceC2072n2, InterfaceC2075q itemContent, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            interfaceC2072n = null;
        }
        if ((i8 & 4) != 0) {
            contentType = LazyStaggeredGridDslKt$itemsIndexed$6.INSTANCE;
        }
        if ((i8 & 8) != 0) {
            interfaceC2072n2 = null;
        }
        AbstractC3292y.i(lazyStaggeredGridScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyStaggeredGridScope.items(items.length, interfaceC2072n != null ? new LazyStaggeredGridDslKt$itemsIndexed$7$1(interfaceC2072n, items) : null, new LazyStaggeredGridDslKt$itemsIndexed$8(contentType, items), interfaceC2072n2 != null ? new LazyStaggeredGridDslKt$itemsIndexed$9$1(interfaceC2072n2, items) : null, ComposableLambdaKt.composableLambdaInstance(-804487775, true, new LazyStaggeredGridDslKt$itemsIndexed$10(itemContent, items)));
    }
}
