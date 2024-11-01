package androidx.compose.animation;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class CrossfadeKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0056  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void Crossfade(T r16, androidx.compose.ui.Modifier r17, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r18, java.lang.String r19, c6.InterfaceC2073o r20, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.Crossfade(java.lang.Object, androidx.compose.ui.Modifier, androidx.compose.animation.core.FiniteAnimationSpec, java.lang.String, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    @Composable
    public static final /* synthetic */ void Crossfade(Object obj, Modifier modifier, FiniteAnimationSpec finiteAnimationSpec, InterfaceC2073o content, Composer composer, int i8, int i9) {
        int i10;
        AbstractC3292y.i(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(523603005);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            i10 = (startRestartGroup.changed(obj) ? 4 : 2) | i8;
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
            i10 |= 128;
        }
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            i10 |= startRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        if (i12 == 4 && (i10 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i11 != 0) {
                modifier = Modifier.Companion;
            }
            if (i12 != 0) {
                finiteAnimationSpec = AnimationSpecKt.tween$default(0, 0, null, 7, null);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(523603005, i10, -1, "androidx.compose.animation.Crossfade (Crossfade.kt:65)");
            }
            Crossfade(androidx.compose.animation.core.TransitionKt.updateTransition(obj, (String) null, startRestartGroup, i10 & 14, 2), modifier, (FiniteAnimationSpec<Float>) finiteAnimationSpec, (Function1) null, content, startRestartGroup, (i10 & 112) | 512 | ((i10 << 3) & 57344), 4);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Modifier modifier2 = modifier;
        FiniteAnimationSpec finiteAnimationSpec2 = finiteAnimationSpec;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new CrossfadeKt$Crossfade$2(obj, modifier2, finiteAnimationSpec2, content, i8, i9));
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02bd  */
    @androidx.compose.runtime.Composable
    @androidx.compose.animation.ExperimentalAnimationApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <T> void Crossfade(androidx.compose.animation.core.Transition<T> r18, androidx.compose.ui.Modifier r19, androidx.compose.animation.core.FiniteAnimationSpec<java.lang.Float> r20, kotlin.jvm.functions.Function1 r21, c6.InterfaceC2073o r22, androidx.compose.runtime.Composer r23, int r24, int r25) {
        /*
            Method dump skipped, instructions count: 732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.CrossfadeKt.Crossfade(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, androidx.compose.animation.core.FiniteAnimationSpec, kotlin.jvm.functions.Function1, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }
}
