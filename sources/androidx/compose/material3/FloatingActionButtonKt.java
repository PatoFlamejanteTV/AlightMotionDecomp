package androidx.compose.material3;

import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.material3.tokens.MotionTokens;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class FloatingActionButtonKt {
    private static final ExitTransition ExtendedFabCollapseAnimation;
    private static final EnterTransition ExtendedFabExpandAnimation;
    private static final float ExtendedFabStartIconPadding = Dp.m5155constructorimpl(16);
    private static final float ExtendedFabEndIconPadding = Dp.m5155constructorimpl(12);
    private static final float ExtendedFabTextPadding = Dp.m5155constructorimpl(20);
    private static final float ExtendedFabMinimumWidth = Dp.m5155constructorimpl(80);

    static {
        MotionTokens motionTokens = MotionTokens.INSTANCE;
        ExitTransition fadeOut$default = EnterExitTransitionKt.fadeOut$default(AnimationSpecKt.tween$default(100, 0, motionTokens.getEasingLinearCubicBezier(), 2, null), 0.0f, 2, null);
        TweenSpec tween$default = AnimationSpecKt.tween$default(500, 0, motionTokens.getEasingEmphasizedCubicBezier(), 2, null);
        Alignment.Companion companion = Alignment.Companion;
        ExtendedFabCollapseAnimation = fadeOut$default.plus(EnterExitTransitionKt.shrinkHorizontally$default(tween$default, companion.getStart(), false, null, 12, null));
        ExtendedFabExpandAnimation = EnterExitTransitionKt.fadeIn$default(AnimationSpecKt.tween(200, 100, motionTokens.getEasingLinearCubicBezier()), 0.0f, 2, null).plus(EnterExitTransitionKt.expandHorizontally$default(AnimationSpecKt.tween$default(500, 0, motionTokens.getEasingEmphasizedCubicBezier(), 2, null), companion.getStart(), false, null, 12, null));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01c1  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: ExtendedFloatingActionButton-ElI5-7k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1632ExtendedFloatingActionButtonElI57k(c6.InterfaceC2072n r31, c6.InterfaceC2072n r32, kotlin.jvm.functions.Function0 r33, androidx.compose.ui.Modifier r34, boolean r35, androidx.compose.ui.graphics.Shape r36, long r37, long r39, androidx.compose.material3.FloatingActionButtonElevation r41, androidx.compose.foundation.interaction.MutableInteractionSource r42, androidx.compose.runtime.Composer r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 706
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m1632ExtendedFloatingActionButtonElI57k(c6.n, c6.n, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b0  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: ExtendedFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1633ExtendedFloatingActionButtonXz6DiA(kotlin.jvm.functions.Function0 r28, androidx.compose.ui.Modifier r29, androidx.compose.ui.graphics.Shape r30, long r31, long r33, androidx.compose.material3.FloatingActionButtonElevation r35, androidx.compose.foundation.interaction.MutableInteractionSource r36, c6.InterfaceC2073o r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m1633ExtendedFloatingActionButtonXz6DiA(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x019d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: FloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1634FloatingActionButtonXz6DiA(kotlin.jvm.functions.Function0 r28, androidx.compose.ui.Modifier r29, androidx.compose.ui.graphics.Shape r30, long r31, long r33, androidx.compose.material3.FloatingActionButtonElevation r35, androidx.compose.foundation.interaction.MutableInteractionSource r36, c6.InterfaceC2072n r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m1634FloatingActionButtonXz6DiA(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b0  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: LargeFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1635LargeFloatingActionButtonXz6DiA(kotlin.jvm.functions.Function0 r27, androidx.compose.ui.Modifier r28, androidx.compose.ui.graphics.Shape r29, long r30, long r32, androidx.compose.material3.FloatingActionButtonElevation r34, androidx.compose.foundation.interaction.MutableInteractionSource r35, c6.InterfaceC2072n r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m1635LargeFloatingActionButtonXz6DiA(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b0  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: SmallFloatingActionButton-X-z6DiA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1636SmallFloatingActionButtonXz6DiA(kotlin.jvm.functions.Function0 r27, androidx.compose.ui.Modifier r28, androidx.compose.ui.graphics.Shape r29, long r30, long r32, androidx.compose.material3.FloatingActionButtonElevation r34, androidx.compose.foundation.interaction.MutableInteractionSource r35, c6.InterfaceC2072n r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 605
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.FloatingActionButtonKt.m1636SmallFloatingActionButtonXz6DiA(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.material3.FloatingActionButtonElevation, androidx.compose.foundation.interaction.MutableInteractionSource, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }
}
