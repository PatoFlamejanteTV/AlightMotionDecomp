package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.lifecycle.LifecycleOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import c6.InterfaceC2072n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AndroidView_androidKt {
    private static final Function1 NoOpUpdate = AndroidView_androidKt$NoOpUpdate$1.INSTANCE;

    @Composable
    @UiComposable
    public static final <T extends View> void AndroidView(Function1 function1, Modifier modifier, Function1 function12, Composer composer, int i8, int i9) {
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-1783766393);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (startRestartGroup.changedInstance(function1) ? 4 : 2) | i8;
        } else {
            i10 = i8;
        }
        int i11 = i9 & 2;
        if (i11 != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            i10 |= startRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i12 = i9 & 4;
        if (i12 != 0) {
            i10 |= 384;
        } else if ((i8 & 896) == 0) {
            i10 |= startRestartGroup.changedInstance(function12) ? 256 : 128;
        }
        if ((i10 & 731) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i11 != 0) {
                modifier = Modifier.Companion;
            }
            if (i12 != 0) {
                function12 = NoOpUpdate;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1783766393, i10, -1, "androidx.compose.ui.viewinterop.AndroidView (AndroidView.android.kt:106)");
            }
            AndroidView(function1, modifier, null, NoOpUpdate, function12, startRestartGroup, (i10 & 14) | 3072 | (i10 & 112) | ((i10 << 6) & 57344), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        Function1 function13 = function12;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new AndroidView_androidKt$AndroidView$1(function1, modifier2, function13, i8, i9));
        }
    }

    @Composable
    private static final <T extends View> Function0 createAndroidViewNodeFactory(Function1 function1, Composer composer, int i8) {
        composer.startReplaceableGroup(2030558801);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2030558801, i8, -1, "androidx.compose.ui.viewinterop.createAndroidViewNodeFactory (AndroidView.android.kt:265)");
        }
        AndroidView_androidKt$createAndroidViewNodeFactory$1 androidView_androidKt$createAndroidViewNodeFactory$1 = new AndroidView_androidKt$createAndroidViewNodeFactory$1((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext()), function1, ComposablesKt.rememberCompositionContext(composer, 0), (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry()), ComposablesKt.getCurrentCompositeKeyHash(composer, 0), (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView()));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return androidView_androidKt$createAndroidViewNodeFactory$1;
    }

    public static final Function1 getNoOpUpdate() {
        return NoOpUpdate;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T extends View> ViewFactoryHolder<T> requireViewFactoryHolder(LayoutNode layoutNode) {
        AndroidViewHolder interopViewFactoryHolder$ui_release = layoutNode.getInteropViewFactoryHolder$ui_release();
        if (interopViewFactoryHolder$ui_release != null) {
            AbstractC3292y.g(interopViewFactoryHolder$ui_release, "null cannot be cast to non-null type androidx.compose.ui.viewinterop.ViewFactoryHolder<T of androidx.compose.ui.viewinterop.AndroidView_androidKt.requireViewFactoryHolder>");
            return (ViewFactoryHolder) interopViewFactoryHolder$ui_release;
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: updateViewHolderParams-6NefGtU, reason: not valid java name */
    private static final <T extends View> void m5403updateViewHolderParams6NefGtU(Composer composer, Modifier modifier, int i8, Density density, LifecycleOwner lifecycleOwner, SavedStateRegistryOwner savedStateRegistryOwner, LayoutDirection layoutDirection, CompositionLocalMap compositionLocalMap) {
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        Updater.m2480setimpl(composer, compositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m2480setimpl(composer, modifier, AndroidView_androidKt$updateViewHolderParams$1.INSTANCE);
        Updater.m2480setimpl(composer, density, AndroidView_androidKt$updateViewHolderParams$2.INSTANCE);
        Updater.m2480setimpl(composer, lifecycleOwner, AndroidView_androidKt$updateViewHolderParams$3.INSTANCE);
        Updater.m2480setimpl(composer, savedStateRegistryOwner, AndroidView_androidKt$updateViewHolderParams$4.INSTANCE);
        Updater.m2480setimpl(composer, layoutDirection, AndroidView_androidKt$updateViewHolderParams$5.INSTANCE);
        InterfaceC2072n setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (composer.getInserting() || !AbstractC3292y.d(composer.rememberedValue(), Integer.valueOf(i8))) {
            composer.updateRememberedValue(Integer.valueOf(i8));
            composer.apply(Integer.valueOf(i8), setCompositeKeyHash);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0048  */
    @androidx.compose.runtime.Composable
    @androidx.compose.ui.UiComposable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T extends android.view.View> void AndroidView(kotlin.jvm.functions.Function1 r21, androidx.compose.ui.Modifier r22, kotlin.jvm.functions.Function1 r23, kotlin.jvm.functions.Function1 r24, kotlin.jvm.functions.Function1 r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 459
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidView_androidKt.AndroidView(kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }
}
