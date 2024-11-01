package androidx.compose.material;

import Q5.r;
import Q5.x;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class AppBarKt {
    private static final float AppBarHeight = Dp.m5155constructorimpl(56);
    private static final float AppBarHorizontalPadding;
    private static final float BottomAppBarCutoutOffset;
    private static final float BottomAppBarRoundedEdgeRadius;
    private static final Modifier TitleIconModifier;
    private static final Modifier TitleInsetWithoutIcon;

    static {
        float f8 = 4;
        float m5155constructorimpl = Dp.m5155constructorimpl(f8);
        AppBarHorizontalPadding = m5155constructorimpl;
        Modifier.Companion companion = Modifier.Companion;
        TitleInsetWithoutIcon = SizeKt.m629width3ABfNKs(companion, Dp.m5155constructorimpl(Dp.m5155constructorimpl(16) - m5155constructorimpl));
        TitleIconModifier = SizeKt.m629width3ABfNKs(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), Dp.m5155constructorimpl(Dp.m5155constructorimpl(72) - m5155constructorimpl));
        BottomAppBarCutoutOffset = Dp.m5155constructorimpl(8);
        BottomAppBarRoundedEdgeRadius = Dp.m5155constructorimpl(f8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x006a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: AppBar-celAv9A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1081AppBarcelAv9A(long r24, long r26, float r28, androidx.compose.foundation.layout.PaddingValues r29, androidx.compose.ui.graphics.Shape r30, androidx.compose.ui.Modifier r31, c6.InterfaceC2073o r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m1081AppBarcelAv9A(long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.ui.graphics.Shape, androidx.compose.ui.Modifier, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0183 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x00ab  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-Y1yfwus, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1082BottomAppBarY1yfwus(androidx.compose.ui.Modifier r25, long r26, long r28, androidx.compose.ui.graphics.Shape r30, float r31, androidx.compose.foundation.layout.PaddingValues r32, c6.InterfaceC2073o r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m1082BottomAppBarY1yfwus(androidx.compose.ui.Modifier, long, long, androidx.compose.ui.graphics.Shape, float, androidx.compose.foundation.layout.PaddingValues, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x008a  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: TopAppBar-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1083TopAppBarHsRjFd4(androidx.compose.ui.Modifier r23, long r24, long r26, float r28, androidx.compose.foundation.layout.PaddingValues r29, c6.InterfaceC2073o r30, androidx.compose.runtime.Composer r31, int r32, int r33) {
        /*
            Method dump skipped, instructions count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m1083TopAppBarHsRjFd4(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0068  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: TopAppBar-xWeB9-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1084TopAppBarxWeB9s(c6.InterfaceC2072n r25, androidx.compose.ui.Modifier r26, c6.InterfaceC2072n r27, c6.InterfaceC2073o r28, long r29, long r31, float r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 471
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m1084TopAppBarxWeB9s(c6.n, androidx.compose.ui.Modifier, c6.n, c6.o, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float calculateCutoutCircleYIntercept(float f8, float f9) {
        return -((float) Math.sqrt((f8 * f8) - (f9 * f9)));
    }

    public static final r calculateRoundedEdgeIntercept(float f8, float f9, float f10) {
        Float valueOf;
        Float valueOf2;
        r a9;
        Float valueOf3;
        Float valueOf4;
        float f11 = f9 * f9;
        float f12 = f10 * f10;
        float f13 = (f8 * f8) + f11;
        float f14 = f11 * f12 * (f13 - f12);
        float f15 = f8 * f12;
        double d8 = f14;
        float sqrt = (f15 - ((float) Math.sqrt(d8))) / f13;
        float sqrt2 = (f15 + ((float) Math.sqrt(d8))) / f13;
        float sqrt3 = (float) Math.sqrt(f12 - (sqrt * sqrt));
        float sqrt4 = (float) Math.sqrt(f12 - (sqrt2 * sqrt2));
        if (f9 > 0.0f) {
            if (sqrt3 > sqrt4) {
                valueOf3 = Float.valueOf(sqrt);
                valueOf4 = Float.valueOf(sqrt3);
            } else {
                valueOf3 = Float.valueOf(sqrt2);
                valueOf4 = Float.valueOf(sqrt4);
            }
            a9 = x.a(valueOf3, valueOf4);
        } else {
            if (sqrt3 < sqrt4) {
                valueOf = Float.valueOf(sqrt);
                valueOf2 = Float.valueOf(sqrt3);
            } else {
                valueOf = Float.valueOf(sqrt2);
                valueOf2 = Float.valueOf(sqrt4);
            }
            a9 = x.a(valueOf, valueOf2);
        }
        float floatValue = ((Number) a9.a()).floatValue();
        float floatValue2 = ((Number) a9.b()).floatValue();
        if (floatValue < f8) {
            floatValue2 = -floatValue2;
        }
        return x.a(Float.valueOf(floatValue), Float.valueOf(floatValue2));
    }

    private static final float square(float f8) {
        return f8 * f8;
    }
}
