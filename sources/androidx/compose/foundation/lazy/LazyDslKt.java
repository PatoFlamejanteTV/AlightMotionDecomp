package androidx.compose.foundation.lazy;

import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import c6.InterfaceC2072n;
import c6.InterfaceC2074p;
import c6.InterfaceC2075q;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class LazyDslKt {
    /* JADX WARN: Removed duplicated region for block: B:100:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cd  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyColumn(androidx.compose.ui.Modifier r27, androidx.compose.foundation.lazy.LazyListState r28, androidx.compose.foundation.layout.PaddingValues r29, boolean r30, androidx.compose.foundation.layout.Arrangement.Vertical r31, androidx.compose.ui.Alignment.Horizontal r32, androidx.compose.foundation.gestures.FlingBehavior r33, boolean r34, kotlin.jvm.functions.Function1 r35, androidx.compose.runtime.Composer r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 630
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01cc  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LazyRow(androidx.compose.ui.Modifier r26, androidx.compose.foundation.lazy.LazyListState r27, androidx.compose.foundation.layout.PaddingValues r28, boolean r29, androidx.compose.foundation.layout.Arrangement.Horizontal r30, androidx.compose.ui.Alignment.Vertical r31, androidx.compose.foundation.gestures.FlingBehavior r32, boolean r33, kotlin.jvm.functions.Function1 r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 629
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, boolean, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyListScope lazyListScope, List<? extends T> items, Function1 function1, Function1 contentType, InterfaceC2074p itemContent) {
        AbstractC3292y.i(lazyListScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new LazyDslKt$items$2(function1, items) : null, new LazyDslKt$items$3(contentType, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List items, Function1 function1, Function1 contentType, InterfaceC2074p itemContent, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            function1 = null;
        }
        if ((i8 & 4) != 0) {
            contentType = LazyDslKt$items$1.INSTANCE;
        }
        AbstractC3292y.i(lazyListScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new LazyDslKt$items$2(function1, items) : null, new LazyDslKt$items$3(contentType, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> items, InterfaceC2072n interfaceC2072n, InterfaceC2072n contentType, InterfaceC2075q itemContent) {
        AbstractC3292y.i(lazyListScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyListScope.items(items.size(), interfaceC2072n != null ? new LazyDslKt$itemsIndexed$2(interfaceC2072n, items) : null, new LazyDslKt$itemsIndexed$3(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List items, InterfaceC2072n interfaceC2072n, InterfaceC2072n contentType, InterfaceC2075q itemContent, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            interfaceC2072n = null;
        }
        if ((i8 & 4) != 0) {
            contentType = LazyDslKt$itemsIndexed$1.INSTANCE;
        }
        AbstractC3292y.i(lazyListScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyListScope.items(items.size(), interfaceC2072n != null ? new LazyDslKt$itemsIndexed$2(interfaceC2072n, items) : null, new LazyDslKt$itemsIndexed$3(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void items(LazyListScope lazyListScope, T[] items, Function1 function1, Function1 contentType, InterfaceC2074p itemContent) {
        AbstractC3292y.i(lazyListScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new LazyDslKt$items$6(function1, items) : null, new LazyDslKt$items$7(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final <T> void itemsIndexed(LazyListScope lazyListScope, T[] items, InterfaceC2072n interfaceC2072n, InterfaceC2072n contentType, InterfaceC2075q itemContent) {
        AbstractC3292y.i(lazyListScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyListScope.items(items.length, interfaceC2072n != null ? new LazyDslKt$itemsIndexed$6(interfaceC2072n, items) : null, new LazyDslKt$itemsIndexed$7(contentType, items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, List items, Function1 function1, InterfaceC2074p itemContent, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            function1 = null;
        }
        AbstractC3292y.i(lazyListScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new LazyDslKt$items$2(function1, items) : null, new LazyDslKt$items$3(LazyDslKt$items$1.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, List items, InterfaceC2072n interfaceC2072n, InterfaceC2075q itemContent, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            interfaceC2072n = null;
        }
        AbstractC3292y.i(lazyListScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyListScope.items(items.size(), interfaceC2072n != null ? new LazyDslKt$itemsIndexed$2(interfaceC2072n, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void items(LazyListScope lazyListScope, List<? extends T> items, Function1 function1, InterfaceC2074p itemContent) {
        AbstractC3292y.i(lazyListScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyListScope.items(items.size(), function1 != null ? new LazyDslKt$items$2(function1, items) : null, new LazyDslKt$items$3(LazyDslKt$items$1.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-632812321, true, new LazyDslKt$items$4(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void itemsIndexed(LazyListScope lazyListScope, List<? extends T> items, InterfaceC2072n interfaceC2072n, InterfaceC2075q itemContent) {
        AbstractC3292y.i(lazyListScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyListScope.items(items.size(), interfaceC2072n != null ? new LazyDslKt$itemsIndexed$2(interfaceC2072n, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$1(items), ComposableLambdaKt.composableLambdaInstance(-1091073711, true, new LazyDslKt$itemsIndexed$4(itemContent, items)));
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] items, InterfaceC2072n interfaceC2072n, InterfaceC2072n contentType, InterfaceC2075q itemContent, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            interfaceC2072n = null;
        }
        if ((i8 & 4) != 0) {
            contentType = LazyDslKt$itemsIndexed$5.INSTANCE;
        }
        AbstractC3292y.i(lazyListScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyListScope.items(items.length, interfaceC2072n != null ? new LazyDslKt$itemsIndexed$6(interfaceC2072n, items) : null, new LazyDslKt$itemsIndexed$7(contentType, items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] items, Function1 function1, Function1 contentType, InterfaceC2074p itemContent, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            function1 = null;
        }
        if ((i8 & 4) != 0) {
            contentType = LazyDslKt$items$5.INSTANCE;
        }
        AbstractC3292y.i(lazyListScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(contentType, "contentType");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new LazyDslKt$items$6(function1, items) : null, new LazyDslKt$items$7(contentType, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void itemsIndexed(LazyListScope lazyListScope, T[] items, InterfaceC2072n interfaceC2072n, InterfaceC2075q itemContent) {
        AbstractC3292y.i(lazyListScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyListScope.items(items.length, interfaceC2072n != null ? new LazyDslKt$itemsIndexed$6(interfaceC2072n, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(itemContent, items)));
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final /* synthetic */ <T> void items(LazyListScope lazyListScope, T[] items, Function1 function1, InterfaceC2074p itemContent) {
        AbstractC3292y.i(lazyListScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new LazyDslKt$items$6(function1, items) : null, new LazyDslKt$items$7(LazyDslKt$items$5.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(itemContent, items)));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0153  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void LazyColumn(androidx.compose.ui.Modifier r27, androidx.compose.foundation.lazy.LazyListState r28, androidx.compose.foundation.layout.PaddingValues r29, boolean r30, androidx.compose.foundation.layout.Arrangement.Vertical r31, androidx.compose.ui.Alignment.Horizontal r32, androidx.compose.foundation.gestures.FlingBehavior r33, kotlin.jvm.functions.Function1 r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyColumn(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Vertical, androidx.compose.ui.Alignment$Horizontal, androidx.compose.foundation.gestures.FlingBehavior, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0153  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void LazyRow(androidx.compose.ui.Modifier r27, androidx.compose.foundation.lazy.LazyListState r28, androidx.compose.foundation.layout.PaddingValues r29, boolean r30, androidx.compose.foundation.layout.Arrangement.Horizontal r31, androidx.compose.ui.Alignment.Vertical r32, androidx.compose.foundation.gestures.FlingBehavior r33, kotlin.jvm.functions.Function1 r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.LazyDslKt.LazyRow(androidx.compose.ui.Modifier, androidx.compose.foundation.lazy.LazyListState, androidx.compose.foundation.layout.PaddingValues, boolean, androidx.compose.foundation.layout.Arrangement$Horizontal, androidx.compose.ui.Alignment$Vertical, androidx.compose.foundation.gestures.FlingBehavior, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    public static /* synthetic */ void itemsIndexed$default(LazyListScope lazyListScope, Object[] items, InterfaceC2072n interfaceC2072n, InterfaceC2075q itemContent, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            interfaceC2072n = null;
        }
        AbstractC3292y.i(lazyListScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyListScope.items(items.length, interfaceC2072n != null ? new LazyDslKt$itemsIndexed$6(interfaceC2072n, items) : null, new LazyDslKt$itemsIndexed$$inlined$itemsIndexed$default$2(items), ComposableLambdaKt.composableLambdaInstance(1600639390, true, new LazyDslKt$itemsIndexed$8(itemContent, items)));
    }

    public static /* synthetic */ void items$default(LazyListScope lazyListScope, Object[] items, Function1 function1, InterfaceC2074p itemContent, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            function1 = null;
        }
        AbstractC3292y.i(lazyListScope, "<this>");
        AbstractC3292y.i(items, "items");
        AbstractC3292y.i(itemContent, "itemContent");
        lazyListScope.items(items.length, function1 != null ? new LazyDslKt$items$6(function1, items) : null, new LazyDslKt$items$7(LazyDslKt$items$5.INSTANCE, items), ComposableLambdaKt.composableLambdaInstance(-1043393750, true, new LazyDslKt$items$8(itemContent, items)));
    }
}
