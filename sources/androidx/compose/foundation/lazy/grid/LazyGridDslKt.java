package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import c6.InterfaceC2074p;
import c6.InterfaceC2075q;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyGridDslKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cd  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyHorizontalGrid(androidx.compose.foundation.lazy.grid.GridCells r27, androidx.compose.ui.Modifier r28, androidx.compose.foundation.lazy.grid.LazyGridState r29, androidx.compose.foundation.layout.PaddingValues r30, boolean r31, androidx.compose.foundation.layout.Arrangement.Horizontal r32, androidx.compose.foundation.layout.Arrangement.Vertical r33, androidx.compose.foundation.gestures.FlingBehavior r34, boolean r35, kotlin.jvm.functions.Function1 r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 669
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyHorizontalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0288  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01cd  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyVerticalGrid(androidx.compose.foundation.lazy.grid.GridCells r27, androidx.compose.ui.Modifier r28, androidx.compose.foundation.lazy.grid.LazyGridState r29, androidx.compose.foundation.layout.PaddingValues r30, boolean r31, androidx.compose.foundation.layout.Arrangement.Vertical r32, androidx.compose.foundation.layout.Arrangement.Horizontal r33, androidx.compose.foundation.gestures.FlingBehavior r34, boolean r35, kotlin.jvm.functions.Function1 r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 666
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.grid.LazyGridDslKt.LazyVerticalGrid(androidx.compose.foundation.lazy.grid.GridCells, androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.grid.LazyGridState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Integer> calculateCellsCrossAxisSizeImpl(int i8, int i9, int i10) {
        int i11;
        int i12 = i8 - (i10 * (i9 - 1));
        int i13 = i12 / i9;
        int i14 = i12 % i9;
        ArrayList arrayList = new ArrayList(i9);
        for (int i15 = 0; i15 < i9; i15++) {
            if (i15 < i14) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            arrayList.add(Integer.valueOf(i11 + i13));
        }
        return arrayList;
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyGridScope lazyGridScope, List<? extends T> items, Function1 function1, InterfaceC2072n interfaceC2072n, Function1 contentType, InterfaceC2074p itemContent) {
        AbstractC3292y.i(lazyGridScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function1 != null ? new LazyGridDslKt$items$2(function1, items) : null, interfaceC2072n != null ? new LazyGridDslKt$items$3(interfaceC2072n, items) : null, new LazyGridDslKt$items$4(contentType, items), ComposableLambdaKt.composableLambdaInstance(699646206, true, new LazyGridDslKt$items$5(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, List items, Function1 function1, InterfaceC2072n interfaceC2072n, Function1 contentType, InterfaceC2074p itemContent, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            function1 = null;
        }
        if ((i8 & 4) != 0) {
            interfaceC2072n = null;
        }
        if ((i8 & 8) != 0) {
            contentType = LazyGridDslKt$items$1.INSTANCE;
        }
        AbstractC3292y.i(lazyGridScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyGridScope.items(items.size(), function1 != null ? new LazyGridDslKt$items$2(function1, items) : null, interfaceC2072n != null ? new LazyGridDslKt$items$3(interfaceC2072n, items) : null, new LazyGridDslKt$items$4(contentType, items), ComposableLambdaKt.composableLambdaInstance(699646206, true, new LazyGridDslKt$items$5(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyGridScope lazyGridScope, List<? extends T> items, InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, InterfaceC2072n contentType, InterfaceC2075q itemContent) {
        AbstractC3292y.i(lazyGridScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyGridScope.items(items.size(), interfaceC2072n != null ? new LazyGridDslKt$itemsIndexed$2(interfaceC2072n, items) : null, interfaceC2073o != null ? new LazyGridDslKt$itemsIndexed$3(interfaceC2073o, items) : null, new LazyGridDslKt$itemsIndexed$4(contentType, items), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new LazyGridDslKt$itemsIndexed$5(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, List items, InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, InterfaceC2072n contentType, InterfaceC2075q itemContent, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            interfaceC2072n = null;
        }
        if ((i8 & 4) != 0) {
            interfaceC2073o = null;
        }
        if ((i8 & 8) != 0) {
            contentType = LazyGridDslKt$itemsIndexed$1.INSTANCE;
        }
        AbstractC3292y.i(lazyGridScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyGridScope.items(items.size(), interfaceC2072n != null ? new LazyGridDslKt$itemsIndexed$2(interfaceC2072n, items) : null, interfaceC2073o != null ? new LazyGridDslKt$itemsIndexed$3(interfaceC2073o, items) : null, new LazyGridDslKt$itemsIndexed$4(contentType, items), ComposableLambdaKt.composableLambdaInstance(1229287273, true, new LazyGridDslKt$itemsIndexed$5(itemContent, items)));
    }

    @Composable
    private static final InterfaceC2072n rememberColumnWidthSums(GridCells gridCells, Arrangement.Horizontal horizontal, PaddingValues paddingValues, Composer composer, int i8) {
        composer.startReplaceableGroup(-1355301804);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1355301804, i8, -1, "androidx.compose.foundation.lazy.grid.rememberColumnWidthSums (LazyGridDsl.kt:144)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(gridCells) | composer.changed(horizontal) | composer.changed(paddingValues);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new GridSlotCache(new LazyGridDslKt$rememberColumnWidthSums$1$1(paddingValues, gridCells, horizontal));
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
    private static final InterfaceC2072n rememberRowHeightSums(GridCells gridCells, Arrangement.Vertical vertical, PaddingValues paddingValues, Composer composer, int i8) {
        composer.startReplaceableGroup(239683573);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(239683573, i8, -1, "androidx.compose.foundation.lazy.grid.rememberRowHeightSums (LazyGridDsl.kt:177)");
        }
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(gridCells) | composer.changed(vertical) | composer.changed(paddingValues);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new GridSlotCache(new LazyGridDslKt$rememberRowHeightSums$1$1(paddingValues, gridCells, vertical));
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
    public static final <T> void items(LazyGridScope lazyGridScope, T[] items, Function1 function1, InterfaceC2072n interfaceC2072n, Function1 contentType, InterfaceC2074p itemContent) {
        AbstractC3292y.i(lazyGridScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyGridScope.items(items.length, function1 != null ? new LazyGridDslKt$items$7(function1, items) : null, interfaceC2072n != null ? new LazyGridDslKt$items$8(interfaceC2072n, items) : null, new LazyGridDslKt$items$9(contentType, items), ComposableLambdaKt.composableLambdaInstance(407562193, true, new LazyGridDslKt$items$10(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyGridScope lazyGridScope, T[] items, InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, InterfaceC2072n contentType, InterfaceC2075q itemContent) {
        AbstractC3292y.i(lazyGridScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyGridScope.items(items.length, interfaceC2072n != null ? new LazyGridDslKt$itemsIndexed$7(interfaceC2072n, items) : null, interfaceC2073o != null ? new LazyGridDslKt$itemsIndexed$8(interfaceC2073o, items) : null, new LazyGridDslKt$itemsIndexed$9(contentType, items), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new LazyGridDslKt$itemsIndexed$10(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyGridScope lazyGridScope, Object[] items, Function1 function1, InterfaceC2072n interfaceC2072n, Function1 contentType, InterfaceC2074p itemContent, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            function1 = null;
        }
        if ((i8 & 4) != 0) {
            interfaceC2072n = null;
        }
        if ((i8 & 8) != 0) {
            contentType = LazyGridDslKt$items$6.INSTANCE;
        }
        AbstractC3292y.i(lazyGridScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyGridScope.items(items.length, function1 != null ? new LazyGridDslKt$items$7(function1, items) : null, interfaceC2072n != null ? new LazyGridDslKt$items$8(interfaceC2072n, items) : null, new LazyGridDslKt$items$9(contentType, items), ComposableLambdaKt.composableLambdaInstance(407562193, true, new LazyGridDslKt$items$10(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyGridScope lazyGridScope, Object[] items, InterfaceC2072n interfaceC2072n, InterfaceC2073o interfaceC2073o, InterfaceC2072n contentType, InterfaceC2075q itemContent, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            interfaceC2072n = null;
        }
        if ((i8 & 4) != 0) {
            interfaceC2073o = null;
        }
        if ((i8 & 8) != 0) {
            contentType = LazyGridDslKt$itemsIndexed$6.INSTANCE;
        }
        AbstractC3292y.i(lazyGridScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyGridScope.items(items.length, interfaceC2072n != null ? new LazyGridDslKt$itemsIndexed$7(interfaceC2072n, items) : null, interfaceC2073o != null ? new LazyGridDslKt$itemsIndexed$8(interfaceC2073o, items) : null, new LazyGridDslKt$itemsIndexed$9(contentType, items), ComposableLambdaKt.composableLambdaInstance(-911455938, true, new LazyGridDslKt$itemsIndexed$10(itemContent, items)));
    }
}
