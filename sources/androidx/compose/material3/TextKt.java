package androidx.compose.material3;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.ui.text.TextStyle;
import c6.InterfaceC2072n;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class TextKt {
    private static final ProvidableCompositionLocal<TextStyle> LocalTextStyle = CompositionLocalKt.compositionLocalOf(SnapshotStateKt.structuralEqualityPolicy(), TextKt$LocalTextStyle$1.INSTANCE);

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void ProvideTextStyle(TextStyle value, InterfaceC2072n content, Composer composer, int i8) {
        int i9;
        int i10;
        int i11;
        AbstractC3292y.i(value, "value");
        AbstractC3292y.i(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(-460300127);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(value)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i9 = i11 | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            if (startRestartGroup.changed(content)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i9 |= i10;
        }
        if ((i9 & 91) == 18 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-460300127, i9, -1, "androidx.compose.material3.ProvideTextStyle (Text.kt:258)");
            }
            ProvidableCompositionLocal<TextStyle> providableCompositionLocal = LocalTextStyle;
            CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{providableCompositionLocal.provides(((TextStyle) startRestartGroup.consume(providableCompositionLocal)).merge(value))}, content, startRestartGroup, (i9 & 112) | 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TextKt$ProvideTextStyle$1(value, content, i8));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0284  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03cf  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0342  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1855Text4IGK_g(androidx.compose.ui.text.AnnotatedString r59, androidx.compose.ui.Modifier r60, long r61, long r63, androidx.compose.ui.text.font.FontStyle r65, androidx.compose.ui.text.font.FontWeight r66, androidx.compose.ui.text.font.FontFamily r67, long r68, androidx.compose.ui.text.style.TextDecoration r70, androidx.compose.ui.text.style.TextAlign r71, long r72, int r74, boolean r75, int r76, java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r77, kotlin.jvm.functions.Function1 r78, androidx.compose.ui.text.TextStyle r79, androidx.compose.runtime.Composer r80, int r81, int r82, int r83) {
        /*
            Method dump skipped, instructions count: 1037
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.m1855Text4IGK_g(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02d6  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x027b  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x030a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0274  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Text-fLXpl1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1856TextfLXpl1I(java.lang.String r60, androidx.compose.ui.Modifier r61, long r62, long r64, androidx.compose.ui.text.font.FontStyle r66, androidx.compose.ui.text.font.FontWeight r67, androidx.compose.ui.text.font.FontFamily r68, long r69, androidx.compose.ui.text.style.TextDecoration r71, androidx.compose.ui.text.style.TextAlign r72, long r73, int r75, boolean r76, int r77, kotlin.jvm.functions.Function1 r78, androidx.compose.ui.text.TextStyle r79, androidx.compose.runtime.Composer r80, int r81, int r82, int r83) {
        /*
            Method dump skipped, instructions count: 999
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextKt.m1856TextfLXpl1I(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }
}
