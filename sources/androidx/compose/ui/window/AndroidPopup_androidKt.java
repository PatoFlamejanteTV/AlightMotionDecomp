package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.unit.IntRect;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AndroidPopup_androidKt {
    private static final ProvidableCompositionLocal<String> LocalPopupTestTag = CompositionLocalKt.compositionLocalOf$default(null, AndroidPopup_androidKt$LocalPopupTestTag$1.INSTANCE, 1, null);

    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x004a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Popup(androidx.compose.ui.window.PopupPositionProvider r35, kotlin.jvm.functions.Function0 r36, androidx.compose.ui.window.PopupProperties r37, c6.InterfaceC2072n r38, androidx.compose.runtime.Composer r39, int r40, int r41) {
        /*
            Method dump skipped, instructions count: 600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.Popup(androidx.compose.ui.window.PopupPositionProvider, kotlin.jvm.functions.Function0, androidx.compose.ui.window.PopupProperties, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InterfaceC2072n Popup$lambda$1(State<? extends InterfaceC2072n> state) {
        return state.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0068  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Popup-K5zGePQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m5409PopupK5zGePQ(androidx.compose.ui.Alignment r25, long r26, kotlin.jvm.functions.Function0 r28, androidx.compose.ui.window.PopupProperties r29, c6.InterfaceC2072n r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.AndroidPopup_androidKt.m5409PopupK5zGePQ(androidx.compose.ui.Alignment, long, kotlin.jvm.functions.Function0, androidx.compose.ui.window.PopupProperties, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void PopupTestTag(String str, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        Composer startRestartGroup = composer.startRestartGroup(-498879600);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(str)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(interfaceC2072n)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-498879600, i9, -1, "androidx.compose.ui.window.PopupTestTag (AndroidPopup.android.kt:333)");
            }
            CompositionLocalKt.CompositionLocalProvider(LocalPopupTestTag.provides(str), interfaceC2072n, startRestartGroup, (i9 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidPopup_androidKt$PopupTestTag$1(str, interfaceC2072n, i8));
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void SimpleStack(Modifier modifier, InterfaceC2072n interfaceC2072n, Composer composer, int i8) {
        composer.startReplaceableGroup(1406149896);
        AndroidPopup_androidKt$SimpleStack$1 androidPopup_androidKt$SimpleStack$1 = AndroidPopup_androidKt$SimpleStack$1.INSTANCE;
        composer.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Function0 constructor = companion.getConstructor();
        InterfaceC2073o modifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifier);
        int i9 = (((((i8 << 3) & 112) | ((i8 >> 3) & 14)) << 9) & 7168) | 6;
        if (!(composer.getApplier() instanceof Applier)) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m2473constructorimpl = Updater.m2473constructorimpl(composer);
        Updater.m2480setimpl(m2473constructorimpl, androidPopup_androidKt$SimpleStack$1, companion.getSetMeasurePolicy());
        Updater.m2480setimpl(m2473constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m2473constructorimpl.getInserting() || !AbstractC3292y.d(m2473constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m2473constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m2473constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        modifierMaterializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(composer)), composer, 0);
        composer.startReplaceableGroup(2058660585);
        interfaceC2072n.invoke(composer, Integer.valueOf((i9 >> 9) & 14));
        composer.endReplaceableGroup();
        composer.endNode();
        composer.endReplaceableGroup();
        composer.endReplaceableGroup();
    }

    public static final ProvidableCompositionLocal<String> getLocalPopupTestTag() {
        return LocalPopupTestTag;
    }

    public static final boolean isFlagSecureEnabled(View view) {
        WindowManager.LayoutParams layoutParams;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        if (layoutParams == null || (layoutParams.flags & 8192) == 0) {
            return false;
        }
        return true;
    }

    public static final boolean isPopupLayout(View view, String str) {
        if ((view instanceof PopupLayout) && (str == null || AbstractC3292y.d(str, ((PopupLayout) view).getTestTag()))) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ boolean isPopupLayout$default(View view, String str, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str = null;
        }
        return isPopupLayout(view, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntRect toIntBounds(Rect rect) {
        return new IntRect(rect.left, rect.top, rect.right, rect.bottom);
    }
}
