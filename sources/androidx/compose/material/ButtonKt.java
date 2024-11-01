package androidx.compose.material;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.InteractionSourceKt;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import c6.InterfaceC2073o;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ButtonKt {
    /* JADX WARN: Removed duplicated region for block: B:103:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01a8  */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v7 */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void Button(kotlin.jvm.functions.Function0 r36, androidx.compose.ui.Modifier r37, boolean r38, androidx.compose.foundation.interaction.MutableInteractionSource r39, androidx.compose.material.ButtonElevation r40, androidx.compose.ui.graphics.Shape r41, androidx.compose.foundation.BorderStroke r42, androidx.compose.material.ButtonColors r43, androidx.compose.foundation.layout.PaddingValues r44, c6.InterfaceC2073o r45, androidx.compose.runtime.Composer r46, int r47, int r48) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.ButtonKt.Button(kotlin.jvm.functions.Function0, androidx.compose.ui.Modifier, boolean, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.material.ButtonElevation, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.BorderStroke, androidx.compose.material.ButtonColors, androidx.compose.foundation.layout.PaddingValues, c6.o, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long Button$lambda$1(State<Color> state) {
        return state.getValue().m2958unboximpl();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void OutlinedButton(Function0 onClick, Modifier modifier, boolean z8, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, InterfaceC2073o content, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z9;
        MutableInteractionSource mutableInteractionSource2;
        ButtonElevation buttonElevation2;
        Shape shape2;
        BorderStroke borderStroke2;
        ButtonColors buttonColors2;
        PaddingValues paddingValues2;
        AbstractC3292y.i(onClick, "onClick");
        AbstractC3292y.i(content, "content");
        composer.startReplaceableGroup(-1776134358);
        if ((i9 & 2) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 4) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if ((i9 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if ((i9 & 16) != 0) {
            buttonElevation2 = null;
        } else {
            buttonElevation2 = buttonElevation;
        }
        if ((i9 & 32) != 0) {
            shape2 = MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall();
        } else {
            shape2 = shape;
        }
        if ((i9 & 64) != 0) {
            borderStroke2 = ButtonDefaults.INSTANCE.getOutlinedBorder(composer, 6);
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i9 & 128) != 0) {
            buttonColors2 = ButtonDefaults.INSTANCE.m1127outlinedButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7);
        } else {
            buttonColors2 = buttonColors;
        }
        if ((i9 & 256) != 0) {
            paddingValues2 = ButtonDefaults.INSTANCE.getContentPadding();
        } else {
            paddingValues2 = paddingValues;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1776134358, i8, -1, "androidx.compose.material.OutlinedButton (Button.kt:167)");
        }
        Button(onClick, modifier2, z9, mutableInteractionSource2, buttonElevation2, shape2, borderStroke2, buttonColors2, paddingValues2, content, composer, i8 & 2147483646, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }

    @Composable
    @ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void TextButton(Function0 onClick, Modifier modifier, boolean z8, MutableInteractionSource mutableInteractionSource, ButtonElevation buttonElevation, Shape shape, BorderStroke borderStroke, ButtonColors buttonColors, PaddingValues paddingValues, InterfaceC2073o content, Composer composer, int i8, int i9) {
        Modifier modifier2;
        boolean z9;
        MutableInteractionSource mutableInteractionSource2;
        ButtonElevation buttonElevation2;
        Shape shape2;
        BorderStroke borderStroke2;
        ButtonColors buttonColors2;
        PaddingValues paddingValues2;
        AbstractC3292y.i(onClick, "onClick");
        AbstractC3292y.i(content, "content");
        composer.startReplaceableGroup(288797557);
        if ((i9 & 2) != 0) {
            modifier2 = Modifier.Companion;
        } else {
            modifier2 = modifier;
        }
        if ((i9 & 4) != 0) {
            z9 = true;
        } else {
            z9 = z8;
        }
        if ((i9 & 8) != 0) {
            composer.startReplaceableGroup(-492369756);
            Object rememberedValue = composer.rememberedValue();
            if (rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = InteractionSourceKt.MutableInteractionSource();
                composer.updateRememberedValue(rememberedValue);
            }
            composer.endReplaceableGroup();
            mutableInteractionSource2 = (MutableInteractionSource) rememberedValue;
        } else {
            mutableInteractionSource2 = mutableInteractionSource;
        }
        if ((i9 & 16) != 0) {
            buttonElevation2 = null;
        } else {
            buttonElevation2 = buttonElevation;
        }
        if ((i9 & 32) != 0) {
            shape2 = MaterialTheme.INSTANCE.getShapes(composer, 6).getSmall();
        } else {
            shape2 = shape;
        }
        if ((i9 & 64) != 0) {
            borderStroke2 = null;
        } else {
            borderStroke2 = borderStroke;
        }
        if ((i9 & 128) != 0) {
            buttonColors2 = ButtonDefaults.INSTANCE.m1128textButtonColorsRGew2ao(0L, 0L, 0L, composer, 3072, 7);
        } else {
            buttonColors2 = buttonColors;
        }
        if ((i9 & 256) != 0) {
            paddingValues2 = ButtonDefaults.INSTANCE.getTextButtonContentPadding();
        } else {
            paddingValues2 = paddingValues;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(288797557, i8, -1, "androidx.compose.material.TextButton (Button.kt:221)");
        }
        Button(onClick, modifier2, z9, mutableInteractionSource2, buttonElevation2, shape2, borderStroke2, buttonColors2, paddingValues2, content, composer, i8 & 2147483646, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
    }
}
