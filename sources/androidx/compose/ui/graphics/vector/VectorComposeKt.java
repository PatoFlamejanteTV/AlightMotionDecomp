package androidx.compose.ui.graphics.vector;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.PathFillType;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import java.util.List;

/* loaded from: classes.dex */
public final class VectorComposeKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x010f  */
    @androidx.compose.ui.graphics.vector.VectorComposable
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Group(java.lang.String r20, float r21, float r22, float r23, float r24, float r25, float r26, float r27, java.util.List<? extends androidx.compose.ui.graphics.vector.PathNode> r28, c6.InterfaceC2072n r29, androidx.compose.runtime.Composer r30, int r31, int r32) {
        /*
            Method dump skipped, instructions count: 604
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.vector.VectorComposeKt.Group(java.lang.String, float, float, float, float, float, float, float, java.util.List, c6.n, androidx.compose.runtime.Composer, int, int):void");
    }

    @VectorComposable
    @Composable
    /* renamed from: Path-9cdaXJ4, reason: not valid java name */
    public static final void m3513Path9cdaXJ4(List<? extends PathNode> list, int i8, String str, Brush brush, float f8, Brush brush2, float f9, float f10, int i9, int i10, float f11, float f12, float f13, float f14, Composer composer, int i11, int i12, int i13) {
        Composer startRestartGroup = composer.startRestartGroup(-1478270750);
        int defaultFillType = (i13 & 2) != 0 ? VectorKt.getDefaultFillType() : i8;
        String str2 = (i13 & 4) != 0 ? "" : str;
        Brush brush3 = (i13 & 8) != 0 ? null : brush;
        float f15 = (i13 & 16) != 0 ? 1.0f : f8;
        Brush brush4 = (i13 & 32) != 0 ? null : brush2;
        float f16 = (i13 & 64) != 0 ? 1.0f : f9;
        float f17 = (i13 & 128) != 0 ? 0.0f : f10;
        int defaultStrokeLineCap = (i13 & 256) != 0 ? VectorKt.getDefaultStrokeLineCap() : i9;
        int defaultStrokeLineJoin = (i13 & 512) != 0 ? VectorKt.getDefaultStrokeLineJoin() : i10;
        float f18 = (i13 & 1024) != 0 ? 4.0f : f11;
        float f19 = (i13 & 2048) != 0 ? 0.0f : f12;
        float f20 = (i13 & 4096) != 0 ? 1.0f : f13;
        float f21 = (i13 & 8192) != 0 ? 0.0f : f14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1478270750, i11, i12, "androidx.compose.ui.graphics.vector.Path (VectorCompose.kt:114)");
        }
        VectorComposeKt$Path$1 vectorComposeKt$Path$1 = VectorComposeKt$Path$1.INSTANCE;
        startRestartGroup.startReplaceableGroup(1886828752);
        if (!(startRestartGroup.getApplier() instanceof VectorApplier)) {
            ComposablesKt.invalidApplier();
        }
        startRestartGroup.startNode();
        if (startRestartGroup.getInserting()) {
            startRestartGroup.createNode(new VectorComposeKt$Path9cdaXJ4$$inlined$ComposeNode$1(vectorComposeKt$Path$1));
        } else {
            startRestartGroup.useNode();
        }
        Composer m2473constructorimpl = Updater.m2473constructorimpl(startRestartGroup);
        Updater.m2480setimpl(m2473constructorimpl, str2, VectorComposeKt$Path$2$1.INSTANCE);
        Updater.m2480setimpl(m2473constructorimpl, list, VectorComposeKt$Path$2$2.INSTANCE);
        Updater.m2480setimpl(m2473constructorimpl, PathFillType.m3201boximpl(defaultFillType), VectorComposeKt$Path$2$3.INSTANCE);
        Updater.m2480setimpl(m2473constructorimpl, brush3, VectorComposeKt$Path$2$4.INSTANCE);
        Updater.m2480setimpl(m2473constructorimpl, Float.valueOf(f15), VectorComposeKt$Path$2$5.INSTANCE);
        Updater.m2480setimpl(m2473constructorimpl, brush4, VectorComposeKt$Path$2$6.INSTANCE);
        Updater.m2480setimpl(m2473constructorimpl, Float.valueOf(f16), VectorComposeKt$Path$2$7.INSTANCE);
        Updater.m2480setimpl(m2473constructorimpl, Float.valueOf(f17), VectorComposeKt$Path$2$8.INSTANCE);
        Updater.m2480setimpl(m2473constructorimpl, StrokeJoin.m3281boximpl(defaultStrokeLineJoin), VectorComposeKt$Path$2$9.INSTANCE);
        Updater.m2480setimpl(m2473constructorimpl, StrokeCap.m3271boximpl(defaultStrokeLineCap), VectorComposeKt$Path$2$10.INSTANCE);
        Updater.m2480setimpl(m2473constructorimpl, Float.valueOf(f18), VectorComposeKt$Path$2$11.INSTANCE);
        Updater.m2480setimpl(m2473constructorimpl, Float.valueOf(f19), VectorComposeKt$Path$2$12.INSTANCE);
        Updater.m2480setimpl(m2473constructorimpl, Float.valueOf(f20), VectorComposeKt$Path$2$13.INSTANCE);
        Updater.m2480setimpl(m2473constructorimpl, Float.valueOf(f21), VectorComposeKt$Path$2$14.INSTANCE);
        startRestartGroup.endNode();
        startRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new VectorComposeKt$Path$3(list, defaultFillType, str2, brush3, f15, brush4, f16, f17, defaultStrokeLineCap, defaultStrokeLineJoin, f18, f19, f20, f21, i11, i12, i13));
        }
    }
}
