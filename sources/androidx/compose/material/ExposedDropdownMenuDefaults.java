package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import kotlin.jvm.functions.Function0;

@StabilityInferred(parameters = 0)
@ExperimentalMaterialApi
/* loaded from: classes.dex */
public final class ExposedDropdownMenuDefaults {
    public static final int $stable = 0;
    public static final ExposedDropdownMenuDefaults INSTANCE = new ExposedDropdownMenuDefaults();

    private ExposedDropdownMenuDefaults() {
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    @ExperimentalMaterialApi
    public final void TrailingIcon(boolean z8, Function0 function0, Composer composer, int i8, int i9) {
        int i10;
        int i11;
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(876077373);
        if ((i9 & 1) != 0) {
            i10 = i8 | 6;
        } else if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(z8)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            i10 = i8;
        }
        int i13 = i9 & 2;
        if (i13 != 0) {
            i10 |= 48;
        } else if ((i8 & 112) == 0) {
            if (startRestartGroup.changedInstance(function0)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i10 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (i13 != 0) {
                function0 = ExposedDropdownMenuDefaults$TrailingIcon$1.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(876077373, i10, -1, "androidx.compose.material.ExposedDropdownMenuDefaults.TrailingIcon (ExposedDropdownMenu.kt:291)");
            }
            IconButtonKt.IconButton(function0, SemanticsModifierKt.clearAndSetSemantics(Modifier.Companion, ExposedDropdownMenuDefaults$TrailingIcon$2.INSTANCE), false, null, ComposableLambdaKt.composableLambda(startRestartGroup, 726122713, true, new ExposedDropdownMenuDefaults$TrailingIcon$3(z8)), startRestartGroup, ((i10 >> 3) & 14) | 24576, 12);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        Function0 function02 = function0;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ExposedDropdownMenuDefaults$TrailingIcon$4(this, z8, function02, i8, i9));
        }
    }

    @Composable
    /* renamed from: outlinedTextFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m1220outlinedTextFieldColorsDlUQjxs(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, Composer composer, int i8, int i9, int i10, int i11) {
        composer.startReplaceableGroup(1162641182);
        long m2947copywmQWz5c$default = (i11 & 1) != 0 ? Color.m2947copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m2947copywmQWz5c$default2 = (i11 & 2) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long m2983getTransparent0d7_KjU = (i11 & 4) != 0 ? Color.Companion.m2983getTransparent0d7_KjU() : j10;
        long m1155getPrimary0d7_KjU = (i11 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU() : j11;
        long m1149getError0d7_KjU = (i11 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1149getError0d7_KjU() : j12;
        long m2947copywmQWz5c$default3 = (i11 & 32) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m2947copywmQWz5c$default4 = (i11 & 64) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m2947copywmQWz5c$default5 = (i11 & 128) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default4, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long m1149getError0d7_KjU2 = (i11 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1149getError0d7_KjU() : j16;
        long m2947copywmQWz5c$default6 = (i11 & 512) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m2947copywmQWz5c$default7 = (i11 & 1024) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default6, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long j30 = (i11 & 2048) != 0 ? m2947copywmQWz5c$default6 : j19;
        long m2947copywmQWz5c$default8 = (i11 & 4096) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m2947copywmQWz5c$default9 = (i11 & 8192) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long m2947copywmQWz5c$default10 = (i11 & 16384) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default8, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long m1149getError0d7_KjU3 = (32768 & i11) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1149getError0d7_KjU() : j23;
        long m2947copywmQWz5c$default11 = (65536 & i11) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long m2947copywmQWz5c$default12 = (131072 & i11) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long m2947copywmQWz5c$default13 = (262144 & i11) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default12, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long m1149getError0d7_KjU4 = (524288 & i11) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1149getError0d7_KjU() : j27;
        long m2947copywmQWz5c$default14 = (1048576 & i11) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j28;
        long m2947copywmQWz5c$default15 = (i11 & 2097152) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default14, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1162641182, i8, i9, "androidx.compose.material.ExposedDropdownMenuDefaults.outlinedTextFieldColors (ExposedDropdownMenu.kt:460)");
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(m2947copywmQWz5c$default, m2947copywmQWz5c$default2, m1155getPrimary0d7_KjU, m1149getError0d7_KjU, m2947copywmQWz5c$default3, m2947copywmQWz5c$default4, m1149getError0d7_KjU2, m2947copywmQWz5c$default5, m2947copywmQWz5c$default6, m2947copywmQWz5c$default7, j30, m2947copywmQWz5c$default8, m2947copywmQWz5c$default9, m2947copywmQWz5c$default10, m1149getError0d7_KjU3, m2983getTransparent0d7_KjU, m2947copywmQWz5c$default11, m2947copywmQWz5c$default12, m2947copywmQWz5c$default13, m1149getError0d7_KjU4, m2947copywmQWz5c$default14, m2947copywmQWz5c$default15, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldForExposedDropdownMenusColors;
    }

    @Composable
    /* renamed from: textFieldColors-DlUQjxs, reason: not valid java name */
    public final TextFieldColors m1221textFieldColorsDlUQjxs(long j8, long j9, long j10, long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j20, long j21, long j22, long j23, long j24, long j25, long j26, long j27, long j28, long j29, Composer composer, int i8, int i9, int i10, int i11) {
        composer.startReplaceableGroup(1208167904);
        long m2947copywmQWz5c$default = (i11 & 1) != 0 ? Color.m2947copywmQWz5c$default(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl(), ((Number) composer.consume(ContentAlphaKt.getLocalContentAlpha())).floatValue(), 0.0f, 0.0f, 0.0f, 14, null) : j8;
        long m2947copywmQWz5c$default2 = (i11 & 2) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j9;
        long m2947copywmQWz5c$default3 = (i11 & 4) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null) : j10;
        long m1155getPrimary0d7_KjU = (i11 & 8) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU() : j11;
        long m1149getError0d7_KjU = (i11 & 16) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1149getError0d7_KjU() : j12;
        long m2947copywmQWz5c$default4 = (i11 & 32) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j13;
        long m2947copywmQWz5c$default5 = (i11 & 64) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.42f, 0.0f, 0.0f, 0.0f, 14, null) : j14;
        long m2947copywmQWz5c$default6 = (i11 & 128) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default5, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j15;
        long m1149getError0d7_KjU2 = (i11 & 256) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1149getError0d7_KjU() : j16;
        long m2947copywmQWz5c$default7 = (i11 & 512) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j17;
        long m2947copywmQWz5c$default8 = (i11 & 1024) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default7, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j18;
        long j30 = (i11 & 2048) != 0 ? m2947copywmQWz5c$default7 : j19;
        long m2947copywmQWz5c$default9 = (i11 & 4096) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), 0.54f, 0.0f, 0.0f, 0.0f, 14, null) : j20;
        long m2947copywmQWz5c$default10 = (i11 & 8192) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j21;
        long m2947copywmQWz5c$default11 = (i11 & 16384) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default9, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j22;
        long m1149getError0d7_KjU3 = (32768 & i11) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1149getError0d7_KjU() : j23;
        long m2947copywmQWz5c$default12 = (65536 & i11) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1155getPrimary0d7_KjU(), ContentAlpha.INSTANCE.getHigh(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j24;
        long m2947copywmQWz5c$default13 = (131072 & i11) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j25;
        long m2947copywmQWz5c$default14 = (262144 & i11) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default13, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j26;
        long m1149getError0d7_KjU4 = (524288 & i11) != 0 ? MaterialTheme.INSTANCE.getColors(composer, 6).m1149getError0d7_KjU() : j27;
        long m2947copywmQWz5c$default15 = (1048576 & i11) != 0 ? Color.m2947copywmQWz5c$default(MaterialTheme.INSTANCE.getColors(composer, 6).m1154getOnSurface0d7_KjU(), ContentAlpha.INSTANCE.getMedium(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j28;
        long m2947copywmQWz5c$default16 = (i11 & 2097152) != 0 ? Color.m2947copywmQWz5c$default(m2947copywmQWz5c$default15, ContentAlpha.INSTANCE.getDisabled(composer, 6), 0.0f, 0.0f, 0.0f, 14, null) : j29;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1208167904, i8, i9, "androidx.compose.material.ExposedDropdownMenuDefaults.textFieldColors (ExposedDropdownMenu.kt:357)");
        }
        DefaultTextFieldForExposedDropdownMenusColors defaultTextFieldForExposedDropdownMenusColors = new DefaultTextFieldForExposedDropdownMenusColors(m2947copywmQWz5c$default, m2947copywmQWz5c$default2, m1155getPrimary0d7_KjU, m1149getError0d7_KjU, m2947copywmQWz5c$default4, m2947copywmQWz5c$default5, m1149getError0d7_KjU2, m2947copywmQWz5c$default6, m2947copywmQWz5c$default7, m2947copywmQWz5c$default8, j30, m2947copywmQWz5c$default9, m2947copywmQWz5c$default10, m2947copywmQWz5c$default11, m1149getError0d7_KjU3, m2947copywmQWz5c$default3, m2947copywmQWz5c$default12, m2947copywmQWz5c$default13, m2947copywmQWz5c$default14, m1149getError0d7_KjU4, m2947copywmQWz5c$default15, m2947copywmQWz5c$default16, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return defaultTextFieldForExposedDropdownMenusColors;
    }
}
