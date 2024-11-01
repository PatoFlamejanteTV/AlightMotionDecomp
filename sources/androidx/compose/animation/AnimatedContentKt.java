package androidx.compose.animation;

import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AnimatedContentKt {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:37:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x004f  */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S> void AnimatedContent(S r19, androidx.compose.ui.Modifier r20, kotlin.jvm.functions.Function1 r21, androidx.compose.ui.Alignment r22, java.lang.String r23, kotlin.jvm.functions.Function1 r24, c6.InterfaceC2074p r25, androidx.compose.runtime.Composer r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(java.lang.Object, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment, java.lang.String, kotlin.jvm.functions.Function1, c6.p, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final SizeTransform SizeTransform(boolean z8, InterfaceC2072n sizeAnimationSpec) {
        AbstractC3292y.i(sizeAnimationSpec, "sizeAnimationSpec");
        return new SizeTransformImpl(z8, sizeAnimationSpec);
    }

    public static /* synthetic */ SizeTransform SizeTransform$default(boolean z8, InterfaceC2072n interfaceC2072n, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        if ((i8 & 2) != 0) {
            interfaceC2072n = AnimatedContentKt$SizeTransform$1.INSTANCE;
        }
        return SizeTransform(z8, interfaceC2072n);
    }

    public static final ContentTransform togetherWith(EnterTransition enterTransition, ExitTransition exit) {
        AbstractC3292y.i(enterTransition, "<this>");
        AbstractC3292y.i(exit, "exit");
        return new ContentTransform(enterTransition, exit, 0.0f, null, 12, null);
    }

    @ExperimentalAnimationApi
    public static final ContentTransform with(EnterTransition enterTransition, ExitTransition exit) {
        AbstractC3292y.i(enterTransition, "<this>");
        AbstractC3292y.i(exit, "exit");
        return new ContentTransform(enterTransition, exit, 0.0f, null, 12, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0378  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0250 A[LOOP:2: B:131:0x024e->B:132:0x0250, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0219 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02a6  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final <S> void AnimatedContent(androidx.compose.animation.core.Transition<S> r22, androidx.compose.ui.Modifier r23, kotlin.jvm.functions.Function1 r24, androidx.compose.ui.Alignment r25, kotlin.jvm.functions.Function1 r26, c6.InterfaceC2074p r27, androidx.compose.runtime.Composer r28, int r29, int r30) {
        /*
            Method dump skipped, instructions count: 974
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.AnimatedContentKt.AnimatedContent(androidx.compose.animation.core.Transition, androidx.compose.ui.Modifier, kotlin.jvm.functions.Function1, androidx.compose.ui.Alignment, kotlin.jvm.functions.Function1, c6.p, androidx.compose.runtime.Composer, int, int):void");
    }
}
