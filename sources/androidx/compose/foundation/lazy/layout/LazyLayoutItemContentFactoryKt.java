package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;

/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactoryKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* renamed from: SkippableItem-JVlU9Rs, reason: not valid java name */
    public static final void m730SkippableItemJVlU9Rs(LazyLayoutItemProvider lazyLayoutItemProvider, Object obj, int i8, Object obj2, Composer composer, int i9) {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(1439843069);
        if ((i9 & 14) == 0) {
            if (startRestartGroup.changed(lazyLayoutItemProvider)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i10 = i14 | i9;
        } else {
            i10 = i9;
        }
        if ((i9 & 112) == 0) {
            if (startRestartGroup.changed(obj)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i10 |= i13;
        }
        if ((i9 & 896) == 0) {
            if (startRestartGroup.changed(i8)) {
                i12 = 256;
            } else {
                i12 = 128;
            }
            i10 |= i12;
        }
        if ((i9 & 7168) == 0) {
            if (startRestartGroup.changed(obj2)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        }
        if ((i10 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1439843069, i10, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:127)");
            }
            ((SaveableStateHolder) obj).SaveableStateProvider(obj2, ComposableLambdaKt.composableLambda(startRestartGroup, 980966366, true, new LazyLayoutItemContentFactoryKt$SkippableItem$1(lazyLayoutItemProvider, i8, obj2, i10)), startRestartGroup, 568);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new LazyLayoutItemContentFactoryKt$SkippableItem$2(lazyLayoutItemProvider, obj, i8, obj2, i9));
        }
    }
}
