package androidx.compose.material;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.unit.Dp;

/* loaded from: classes.dex */
public final class ChipKt {
    private static final float LeadingIconEndSpacing;
    private static final float SelectedOverlayOpacity = 0.16f;
    private static final float SurfaceOverlayOpacity = 0.12f;
    private static final float TrailingIconSpacing;
    private static final float HorizontalPadding = Dp.m5155constructorimpl(12);
    private static final float LeadingIconStartSpacing = Dp.m5155constructorimpl(4);
    private static final float SelectedIconContainerSize = Dp.m5155constructorimpl(24);

    static {
        float f8 = 8;
        LeadingIconEndSpacing = Dp.m5155constructorimpl(f8);
        TrailingIconSpacing = Dp.m5155constructorimpl(f8);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0104  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Chip(kotlin.jvm.functions.Function0 r34, androidx.compose.ui.Modifier r35, boolean r36, androidx.compose.foundation.interaction.MutableInteractionSource r37, androidx.compose.ui.graphics.Shape r38, androidx.compose.foundation.BorderStroke r39, androidx.compose.material.ChipColors r40, c6.InterfaceC2072n r41, c6.InterfaceC2073o r42, androidx.compose.runtime.Composer r43, int r44, int r45) {
        /*
            Method dump skipped, instructions count: 707
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ChipKt.Chip(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.ChipColors, c6.n, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Chip$lambda$1(State<Color> state) {
        return state.getValue().m2958unboximpl();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0226  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0258  */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void FilterChip(boolean r43, kotlin.jvm.functions.Function0 r44, androidx.compose.ui.Modifier r45, boolean r46, androidx.compose.foundation.interaction.MutableInteractionSource r47, androidx.compose.ui.graphics.Shape r48, androidx.compose.foundation.BorderStroke r49, androidx.compose.material.SelectableChipColors r50, c6.InterfaceC2072n r51, c6.InterfaceC2072n r52, c6.InterfaceC2072n r53, c6.InterfaceC2073o r54, androidx.compose.runtime.Composer r55, int r56, int r57, int r58) {
        /*
            Method dump skipped, instructions count: 896
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ChipKt.FilterChip(boolean, kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.SelectableChipColors, c6.n, c6.n, c6.n, c6.o, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
