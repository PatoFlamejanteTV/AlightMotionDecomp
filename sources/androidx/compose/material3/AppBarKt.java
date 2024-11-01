package androidx.compose.material3;

import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.AlignmentLineKt;
import androidx.compose.ui.layout.IntrinsicMeasureScope;
import androidx.compose.ui.layout.LayoutIdKt;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.g;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import c6.InterfaceC2072n;
import c6.InterfaceC2073o;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import e6.AbstractC2829a;
import i6.m;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class AppBarKt {
    private static final float BottomAppBarHorizontalPadding;
    private static final float BottomAppBarVerticalPadding;
    private static final float FABHorizontalPadding;
    private static final float FABVerticalPadding;
    private static final float LargeTitleBottomPadding;
    private static final float MediumTitleBottomPadding;
    private static final float TopAppBarHorizontalPadding;
    private static final float TopAppBarTitleInset;
    private static final CubicBezierEasing TopTitleAlphaEasing;

    static {
        float f8 = 16;
        float f9 = 12;
        float m5155constructorimpl = Dp.m5155constructorimpl(Dp.m5155constructorimpl(f8) - Dp.m5155constructorimpl(f9));
        BottomAppBarHorizontalPadding = m5155constructorimpl;
        float m5155constructorimpl2 = Dp.m5155constructorimpl(Dp.m5155constructorimpl(f8) - Dp.m5155constructorimpl(f9));
        BottomAppBarVerticalPadding = m5155constructorimpl2;
        FABHorizontalPadding = Dp.m5155constructorimpl(Dp.m5155constructorimpl(f8) - m5155constructorimpl);
        FABVerticalPadding = Dp.m5155constructorimpl(Dp.m5155constructorimpl(f9) - m5155constructorimpl2);
        TopTitleAlphaEasing = new CubicBezierEasing(0.8f, 0.0f, 0.8f, 0.15f);
        MediumTitleBottomPadding = Dp.m5155constructorimpl(24);
        LargeTitleBottomPadding = Dp.m5155constructorimpl(28);
        float m5155constructorimpl3 = Dp.m5155constructorimpl(4);
        TopAppBarHorizontalPadding = m5155constructorimpl3;
        TopAppBarTitleInset = Dp.m5155constructorimpl(Dp.m5155constructorimpl(f8) - m5155constructorimpl3);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x008d  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-1oL4kX8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1432BottomAppBar1oL4kX8(androidx.compose.ui.Modifier r24, long r25, long r27, float r29, androidx.compose.foundation.layout.PaddingValues r30, androidx.compose.foundation.layout.WindowInsets r31, c6.InterfaceC2073o r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 474
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m1432BottomAppBar1oL4kX8(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0150  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-Snr_uVM, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1433BottomAppBarSnr_uVM(c6.InterfaceC2073o r27, androidx.compose.ui.Modifier r28, c6.InterfaceC2072n r29, long r30, long r32, float r34, androidx.compose.foundation.layout.PaddingValues r35, androidx.compose.foundation.layout.WindowInsets r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m1433BottomAppBarSnr_uVM(c6.o, androidx.compose.ui.Modifier, c6.n, long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.foundation.layout.WindowInsets, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0068  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void CenterAlignedTopAppBar(c6.InterfaceC2072n r30, androidx.compose.ui.Modifier r31, c6.InterfaceC2072n r32, c6.InterfaceC2073o r33, androidx.compose.foundation.layout.WindowInsets r34, androidx.compose.material3.TopAppBarColors r35, androidx.compose.material3.TopAppBarScrollBehavior r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.CenterAlignedTopAppBar(c6.n, androidx.compose.ui.Modifier, c6.n, c6.o, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0068  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void LargeTopAppBar(c6.InterfaceC2072n r31, androidx.compose.ui.Modifier r32, c6.InterfaceC2072n r33, c6.InterfaceC2073o r34, androidx.compose.foundation.layout.WindowInsets r35, androidx.compose.material3.TopAppBarColors r36, androidx.compose.material3.TopAppBarScrollBehavior r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.LargeTopAppBar(c6.n, androidx.compose.ui.Modifier, c6.n, c6.o, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0068  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void MediumTopAppBar(c6.InterfaceC2072n r31, androidx.compose.ui.Modifier r32, c6.InterfaceC2072n r33, c6.InterfaceC2073o r34, androidx.compose.foundation.layout.WindowInsets r35, androidx.compose.material3.TopAppBarColors r36, androidx.compose.material3.TopAppBarScrollBehavior r37, androidx.compose.runtime.Composer r38, int r39, int r40) {
        /*
            Method dump skipped, instructions count: 545
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.MediumTopAppBar(c6.n, androidx.compose.ui.Modifier, c6.n, c6.o, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00c2  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SingleRowTopAppBar(androidx.compose.ui.Modifier r32, c6.InterfaceC2072n r33, androidx.compose.ui.text.TextStyle r34, boolean r35, c6.InterfaceC2072n r36, c6.InterfaceC2073o r37, androidx.compose.foundation.layout.WindowInsets r38, androidx.compose.material3.TopAppBarColors r39, androidx.compose.material3.TopAppBarScrollBehavior r40, androidx.compose.runtime.Composer r41, int r42, int r43) {
        /*
            Method dump skipped, instructions count: 691
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.SingleRowTopAppBar(androidx.compose.ui.Modifier, c6.n, androidx.compose.ui.text.TextStyle, boolean, c6.n, c6.o, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: SingleRowTopAppBar$lambda-3, reason: not valid java name */
    private static final long m1434SingleRowTopAppBar$lambda3(State<Color> state) {
        return state.getValue().m2958unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0068  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void SmallTopAppBar(c6.InterfaceC2072n r28, androidx.compose.ui.Modifier r29, c6.InterfaceC2072n r30, c6.InterfaceC2073o r31, androidx.compose.foundation.layout.WindowInsets r32, androidx.compose.material3.TopAppBarColors r33, androidx.compose.material3.TopAppBarScrollBehavior r34, androidx.compose.runtime.Composer r35, int r36, int r37) {
        /*
            Method dump skipped, instructions count: 444
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.SmallTopAppBar(c6.n, androidx.compose.ui.Modifier, c6.n, c6.o, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0068  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material3.ExperimentalMaterial3Api
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void TopAppBar(c6.InterfaceC2072n r30, androidx.compose.ui.Modifier r31, c6.InterfaceC2072n r32, c6.InterfaceC2073o r33, androidx.compose.foundation.layout.WindowInsets r34, androidx.compose.material3.TopAppBarColors r35, androidx.compose.material3.TopAppBarScrollBehavior r36, androidx.compose.runtime.Composer r37, int r38, int r39) {
        /*
            Method dump skipped, instructions count: 506
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.TopAppBar(c6.n, androidx.compose.ui.Modifier, c6.n, c6.o, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: TopAppBarLayout-kXwM9vE, reason: not valid java name */
    public static final void m1435TopAppBarLayoutkXwM9vE(Modifier modifier, final float f8, long j8, long j9, long j10, InterfaceC2072n interfaceC2072n, TextStyle textStyle, float f9, final Arrangement.Vertical vertical, final Arrangement.Horizontal horizontal, final int i8, boolean z8, InterfaceC2072n interfaceC2072n2, InterfaceC2072n interfaceC2072n3, Composer composer, int i9, int i10) {
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(-6794037);
        if ((i9 & 14) == 0) {
            i11 = i9 | (startRestartGroup.changed(modifier) ? 4 : 2);
        } else {
            i11 = i9;
        }
        if ((i9 & 112) == 0) {
            i11 |= startRestartGroup.changed(f8) ? 32 : 16;
        }
        if ((i9 & 896) == 0) {
            i11 |= startRestartGroup.changed(j8) ? 256 : 128;
        }
        if ((i9 & 7168) == 0) {
            i11 |= startRestartGroup.changed(j9) ? 2048 : 1024;
        }
        if ((i9 & 57344) == 0) {
            i11 |= startRestartGroup.changed(j10) ? 16384 : 8192;
        }
        if ((i9 & 458752) == 0) {
            i11 |= startRestartGroup.changed(interfaceC2072n) ? 131072 : 65536;
        }
        if ((i9 & 3670016) == 0) {
            i11 |= startRestartGroup.changed(textStyle) ? 1048576 : 524288;
        }
        if ((i9 & 29360128) == 0) {
            i11 |= startRestartGroup.changed(f9) ? 8388608 : 4194304;
        }
        if ((234881024 & i9) == 0) {
            i11 |= startRestartGroup.changed(vertical) ? AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL : 33554432;
        }
        if ((1879048192 & i9) == 0) {
            i11 |= startRestartGroup.changed(horizontal) ? 536870912 : 268435456;
        }
        int i13 = i11;
        if ((i10 & 14) == 0) {
            i12 = i10 | (startRestartGroup.changed(i8) ? 4 : 2);
        } else {
            i12 = i10;
        }
        if ((i10 & 112) == 0) {
            i12 |= startRestartGroup.changed(z8) ? 32 : 16;
        }
        if ((i10 & 896) == 0) {
            i12 |= startRestartGroup.changed(interfaceC2072n2) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            i12 |= startRestartGroup.changed(interfaceC2072n3) ? 2048 : 1024;
        }
        int i14 = i12;
        if ((1533916891 & i13) == 306783378 && (i14 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-6794037, i13, i14, "androidx.compose.material3.TopAppBarLayout (AppBar.kt:1236)");
            }
            MeasurePolicy measurePolicy = new MeasurePolicy() { // from class: androidx.compose.material3.AppBarKt$TopAppBarLayout$2
                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i15) {
                    return g.a(this, intrinsicMeasureScope, list, i15);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int maxIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i15) {
                    return g.b(this, intrinsicMeasureScope, list, i15);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                /* renamed from: measure-3p2s80s */
                public final MeasureResult mo109measure3p2s80s(MeasureScope Layout, List<? extends Measurable> measurables, long j11) {
                    int d8;
                    int i15;
                    AbstractC3292y.i(Layout, "$this$Layout");
                    AbstractC3292y.i(measurables, "measurables");
                    List<? extends Measurable> list = measurables;
                    for (Measurable measurable : list) {
                        if (AbstractC3292y.d(LayoutIdKt.getLayoutId(measurable), "navigationIcon")) {
                            Placeable mo4108measureBRTryo0 = measurable.mo4108measureBRTryo0(Constraints.m5114copyZbe2FdA$default(j11, 0, 0, 0, 0, 14, null));
                            for (Measurable measurable2 : list) {
                                if (AbstractC3292y.d(LayoutIdKt.getLayoutId(measurable2), "actionIcons")) {
                                    Placeable mo4108measureBRTryo02 = measurable2.mo4108measureBRTryo0(Constraints.m5114copyZbe2FdA$default(j11, 0, 0, 0, 0, 14, null));
                                    if (Constraints.m5123getMaxWidthimpl(j11) == Integer.MAX_VALUE) {
                                        d8 = Constraints.m5123getMaxWidthimpl(j11);
                                    } else {
                                        d8 = m.d((Constraints.m5123getMaxWidthimpl(j11) - mo4108measureBRTryo0.getWidth()) - mo4108measureBRTryo02.getWidth(), 0);
                                    }
                                    int i16 = d8;
                                    for (Measurable measurable3 : list) {
                                        if (AbstractC3292y.d(LayoutIdKt.getLayoutId(measurable3), CampaignEx.JSON_KEY_TITLE)) {
                                            Placeable mo4108measureBRTryo03 = measurable3.mo4108measureBRTryo0(Constraints.m5114copyZbe2FdA$default(j11, 0, i16, 0, 0, 12, null));
                                            if (mo4108measureBRTryo03.get(AlignmentLineKt.getLastBaseline()) != Integer.MIN_VALUE) {
                                                i15 = mo4108measureBRTryo03.get(AlignmentLineKt.getLastBaseline());
                                            } else {
                                                i15 = 0;
                                            }
                                            int d9 = AbstractC2829a.d(f8);
                                            return MeasureScope.CC.q(Layout, Constraints.m5123getMaxWidthimpl(j11), d9, null, new AppBarKt$TopAppBarLayout$2$measure$1(mo4108measureBRTryo0, d9, mo4108measureBRTryo03, horizontal, j11, mo4108measureBRTryo02, Layout, vertical, i8, i15), 4, null);
                                        }
                                    }
                                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                                }
                            }
                            throw new NoSuchElementException("Collection contains no element matching the predicate.");
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicHeight(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i15) {
                    return g.c(this, intrinsicMeasureScope, list, i15);
                }

                @Override // androidx.compose.ui.layout.MeasurePolicy
                public /* synthetic */ int minIntrinsicWidth(IntrinsicMeasureScope intrinsicMeasureScope, List list, int i15) {
                    return g.d(this, intrinsicMeasureScope, list, i15);
                }
            };
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Function0 constructor = companion.getConstructor();
            InterfaceC2073o materializerOf = LayoutKt.materializerOf(modifier);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2473constructorimpl = Updater.m2473constructorimpl(startRestartGroup);
            Updater.m2480setimpl(m2473constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl, density, companion.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl, layoutDirection, companion.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl, viewConfiguration, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(1688650562);
            Modifier.Companion companion2 = Modifier.Companion;
            Modifier layoutId = LayoutIdKt.layoutId(companion2, "navigationIcon");
            float f10 = TopAppBarHorizontalPadding;
            Modifier m581paddingqDBjuR0$default = PaddingKt.m581paddingqDBjuR0$default(layoutId, f10, 0.0f, 0.0f, 0.0f, 14, null);
            startRestartGroup.startReplaceableGroup(733328855);
            Alignment.Companion companion3 = Alignment.Companion;
            MeasurePolicy rememberBoxMeasurePolicy = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density2 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection2 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration2 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor2 = companion.getConstructor();
            InterfaceC2073o materializerOf2 = LayoutKt.materializerOf(m581paddingqDBjuR0$default);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor2);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2473constructorimpl2 = Updater.m2473constructorimpl(startRestartGroup);
            Updater.m2480setimpl(m2473constructorimpl2, rememberBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl2, density2, companion.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl2, layoutDirection2, companion.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl2, viewConfiguration2, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf2.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            startRestartGroup.startReplaceableGroup(1034743112);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(j8))}, interfaceC2072n2, startRestartGroup, ((i14 >> 3) & 112) | 8);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier then = PaddingKt.m579paddingVpY3zN4$default(LayoutIdKt.layoutId(companion2, CampaignEx.JSON_KEY_TITLE), f10, 0.0f, 2, null).then(z8 ? SemanticsModifierKt.clearAndSetSemantics(companion2, AppBarKt$TopAppBarLayout$1$2.INSTANCE) : companion2);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy2 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density3 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection3 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration3 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor3 = companion.getConstructor();
            InterfaceC2073o materializerOf3 = LayoutKt.materializerOf(then);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor3);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2473constructorimpl3 = Updater.m2473constructorimpl(startRestartGroup);
            Updater.m2480setimpl(m2473constructorimpl3, rememberBoxMeasurePolicy2, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl3, density3, companion.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl3, layoutDirection3, companion.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl3, viewConfiguration3, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf3.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            startRestartGroup.startReplaceableGroup(-280006401);
            TextKt.ProvideTextStyle(textStyle, ComposableLambdaKt.composableLambda(startRestartGroup, 824316656, true, new AppBarKt$TopAppBarLayout$1$3$1(j9, f9, interfaceC2072n, i13)), startRestartGroup, ((i13 >> 18) & 14) | 48);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            Modifier m581paddingqDBjuR0$default2 = PaddingKt.m581paddingqDBjuR0$default(LayoutIdKt.layoutId(companion2, "actionIcons"), 0.0f, 0.0f, f10, 0.0f, 11, null);
            startRestartGroup.startReplaceableGroup(733328855);
            MeasurePolicy rememberBoxMeasurePolicy3 = BoxKt.rememberBoxMeasurePolicy(companion3.getTopStart(), false, startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(-1323940314);
            Density density4 = (Density) startRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
            LayoutDirection layoutDirection4 = (LayoutDirection) startRestartGroup.consume(CompositionLocalsKt.getLocalLayoutDirection());
            ViewConfiguration viewConfiguration4 = (ViewConfiguration) startRestartGroup.consume(CompositionLocalsKt.getLocalViewConfiguration());
            Function0 constructor4 = companion.getConstructor();
            InterfaceC2073o materializerOf4 = LayoutKt.materializerOf(m581paddingqDBjuR0$default2);
            if (!(startRestartGroup.getApplier() instanceof Applier)) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor4);
            } else {
                startRestartGroup.useNode();
            }
            startRestartGroup.disableReusing();
            Composer m2473constructorimpl4 = Updater.m2473constructorimpl(startRestartGroup);
            Updater.m2480setimpl(m2473constructorimpl4, rememberBoxMeasurePolicy3, companion.getSetMeasurePolicy());
            Updater.m2480setimpl(m2473constructorimpl4, density4, companion.getSetDensity());
            Updater.m2480setimpl(m2473constructorimpl4, layoutDirection4, companion.getSetLayoutDirection());
            Updater.m2480setimpl(m2473constructorimpl4, viewConfiguration4, companion.getSetViewConfiguration());
            startRestartGroup.enableReusing();
            materializerOf4.invoke(SkippableUpdater.m2462boximpl(SkippableUpdater.m2463constructorimpl(startRestartGroup)), startRestartGroup, 0);
            startRestartGroup.startReplaceableGroup(2058660585);
            startRestartGroup.startReplaceableGroup(-2137368960);
            startRestartGroup.startReplaceableGroup(1192272192);
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{ContentColorKt.getLocalContentColor().provides(Color.m2938boximpl(j10))}, interfaceC2072n3, startRestartGroup, ((i14 >> 6) & 112) | 8);
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endReplaceableGroup();
            startRestartGroup.endNode();
            startRestartGroup.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup == null) {
            return;
        }
        endRestartGroup.updateScope(new AppBarKt$TopAppBarLayout$3(modifier, f8, j8, j9, j10, interfaceC2072n, textStyle, f9, vertical, horizontal, i8, z8, interfaceC2072n2, interfaceC2072n3, i9, i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01cd  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: TwoRowsTopAppBar-tjU4iQQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1436TwoRowsTopAppBartjU4iQQ(androidx.compose.ui.Modifier r40, c6.InterfaceC2072n r41, androidx.compose.ui.text.TextStyle r42, float r43, c6.InterfaceC2072n r44, androidx.compose.ui.text.TextStyle r45, c6.InterfaceC2072n r46, c6.InterfaceC2073o r47, androidx.compose.foundation.layout.WindowInsets r48, androidx.compose.material3.TopAppBarColors r49, float r50, float r51, androidx.compose.material3.TopAppBarScrollBehavior r52, androidx.compose.runtime.Composer r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 905
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.m1436TwoRowsTopAppBartjU4iQQ(androidx.compose.ui.Modifier, c6.n, androidx.compose.ui.text.TextStyle, float, c6.n, androidx.compose.ui.text.TextStyle, c6.n, c6.o, androidx.compose.foundation.layout.WindowInsets, androidx.compose.material3.TopAppBarColors, float, float, androidx.compose.material3.TopAppBarScrollBehavior, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* renamed from: TwoRowsTopAppBar_tjU4iQQ$lambda-8, reason: not valid java name */
    private static final long m1437TwoRowsTopAppBar_tjU4iQQ$lambda8(State<Color> state) {
        return state.getValue().m2958unboximpl();
    }

    public static final float getBottomAppBarVerticalPadding() {
        return BottomAppBarVerticalPadding;
    }

    public static final CubicBezierEasing getTopTitleAlphaEasing() {
        return TopTitleAlphaEasing;
    }

    @Composable
    @ExperimentalMaterial3Api
    public static final TopAppBarState rememberTopAppBarState(float f8, float f9, float f10, Composer composer, int i8, int i9) {
        composer.startReplaceableGroup(1801969826);
        if ((i9 & 1) != 0) {
            f8 = -3.4028235E38f;
        }
        if ((i9 & 2) != 0) {
            f9 = 0.0f;
        }
        if ((i9 & 4) != 0) {
            f10 = 0.0f;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1801969826, i8, -1, "androidx.compose.material3.rememberTopAppBarState (AppBar.kt:754)");
        }
        Object[] objArr = new Object[0];
        Saver<TopAppBarState, ?> saver = TopAppBarState.Companion.getSaver();
        Float valueOf = Float.valueOf(f8);
        Float valueOf2 = Float.valueOf(f9);
        Float valueOf3 = Float.valueOf(f10);
        composer.startReplaceableGroup(1618982084);
        boolean changed = composer.changed(valueOf) | composer.changed(valueOf2) | composer.changed(valueOf3);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new AppBarKt$rememberTopAppBarState$1$1(f8, f9, f10);
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        TopAppBarState topAppBarState = (TopAppBarState) RememberSaveableKt.m2560rememberSaveable(objArr, (Saver) saver, (String) null, (Function0) rememberedValue, composer, 72, 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return topAppBarState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object settleAppBar(androidx.compose.material3.TopAppBarState r22, float r23, androidx.compose.animation.core.DecayAnimationSpec<java.lang.Float> r24, androidx.compose.animation.core.AnimationSpec<java.lang.Float> r25, U5.d r26) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.AppBarKt.settleAppBar(androidx.compose.material3.TopAppBarState, float, androidx.compose.animation.core.DecayAnimationSpec, androidx.compose.animation.core.AnimationSpec, U5.d):java.lang.Object");
    }
}
