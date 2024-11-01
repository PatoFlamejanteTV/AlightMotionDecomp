package androidx.compose.material;

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
        Composer startRestartGroup = composer.startRestartGroup(1772272796);
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
            if (startRestartGroup.changedInstance(content)) {
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
                ComposerKt.traceEventStart(1772272796, i9, -1, "androidx.compose.material.ProvideTextStyle (Text.kt:393)");
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

    /* JADX WARN: Removed duplicated region for block: B:101:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02e2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02d7  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x035c  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0409  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0334  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1391Text4IGK_g(java.lang.String r68, androidx.compose.ui.Modifier r69, long r70, long r72, androidx.compose.ui.text.font.FontStyle r74, androidx.compose.ui.text.font.FontWeight r75, androidx.compose.ui.text.font.FontFamily r76, long r77, androidx.compose.ui.text.style.TextDecoration r79, androidx.compose.ui.text.style.TextAlign r80, long r81, int r83, boolean r84, int r85, int r86, kotlin.jvm.functions.Function1 r87, androidx.compose.ui.text.TextStyle r88, androidx.compose.runtime.Composer r89, int r90, int r91, int r92) {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m1391Text4IGK_g(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02d8  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x045c  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0434  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Text-IbK3jfQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m1392TextIbK3jfQ(androidx.compose.ui.text.AnnotatedString r69, androidx.compose.ui.Modifier r70, long r71, long r73, androidx.compose.ui.text.font.FontStyle r75, androidx.compose.ui.text.font.FontWeight r76, androidx.compose.ui.text.font.FontFamily r77, long r78, androidx.compose.ui.text.style.TextDecoration r80, androidx.compose.ui.text.style.TextAlign r81, long r82, int r84, boolean r85, int r86, int r87, java.util.Map<java.lang.String, androidx.compose.foundation.text.InlineTextContent> r88, kotlin.jvm.functions.Function1 r89, androidx.compose.ui.text.TextStyle r90, androidx.compose.runtime.Composer r91, int r92, int r93, int r94) {
        /*
            Method dump skipped, instructions count: 1141
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m1392TextIbK3jfQ(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, int, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0298  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01fc  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x039b  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0291  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Text-fLXpl1I, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m1393TextfLXpl1I(java.lang.String r47, androidx.compose.ui.Modifier r48, long r49, long r51, androidx.compose.ui.text.font.FontStyle r53, androidx.compose.ui.text.font.FontWeight r54, androidx.compose.ui.text.font.FontFamily r55, long r56, androidx.compose.ui.text.style.TextDecoration r58, androidx.compose.ui.text.style.TextAlign r59, long r60, int r62, boolean r63, int r64, kotlin.jvm.functions.Function1 r65, androidx.compose.ui.text.TextStyle r66, androidx.compose.runtime.Composer r67, int r68, int r69, int r70) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m1393TextfLXpl1I(java.lang.String, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }

    public static final ProvidableCompositionLocal<TextStyle> getLocalTextStyle() {
        return LocalTextStyle;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02f0  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:77:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x028e  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Text--4IGK_g, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void m1390Text4IGK_g(androidx.compose.ui.text.AnnotatedString r49, androidx.compose.ui.Modifier r50, long r51, long r53, androidx.compose.ui.text.font.FontStyle r55, androidx.compose.ui.text.font.FontWeight r56, androidx.compose.ui.text.font.FontFamily r57, long r58, androidx.compose.ui.text.style.TextDecoration r60, androidx.compose.ui.text.style.TextAlign r61, long r62, int r64, boolean r65, int r66, java.util.Map r67, kotlin.jvm.functions.Function1 r68, androidx.compose.ui.text.TextStyle r69, androidx.compose.runtime.Composer r70, int r71, int r72, int r73) {
        /*
            Method dump skipped, instructions count: 979
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TextKt.m1390Text4IGK_g(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.text.font.FontStyle, androidx.compose.ui.text.font.FontWeight, androidx.compose.ui.text.font.FontFamily, long, androidx.compose.ui.text.style.TextDecoration, androidx.compose.ui.text.style.TextAlign, long, int, boolean, int, java.util.Map, kotlin.jvm.functions.Function1, androidx.compose.ui.text.TextStyle, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
