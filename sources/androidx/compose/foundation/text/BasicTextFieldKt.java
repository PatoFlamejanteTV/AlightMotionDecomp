package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.text.input.TextFieldValue;

/* loaded from: classes.dex */
public final class BasicTextFieldKt {
    /* JADX WARN: Removed duplicated region for block: B:101:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x048b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f4  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02a3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x04a7  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x03bb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x03e2  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0405  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void BasicTextField(java.lang.String r41, kotlin.jvm.functions.Function1 r42, androidx.compose.ui.Modifier r43, boolean r44, boolean r45, androidx.compose.ui.text.TextStyle r46, androidx.compose.foundation.text.KeyboardOptions r47, androidx.compose.foundation.text.KeyboardActions r48, boolean r49, int r50, int r51, androidx.compose.ui.text.input.VisualTransformation r52, kotlin.jvm.functions.Function1 r53, androidx.compose.foundation.interaction.MutableInteractionSource r54, androidx.compose.ui.graphics.Brush r55, c6.InterfaceC2073o r56, androidx.compose.runtime.Composer r57, int r58, int r59, int r60) {
        /*
            Method dump skipped, instructions count: 1244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, c6.o, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue BasicTextField$lambda$2(MutableState<TextFieldValue> mutableState) {
        return mutableState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BasicTextField$lambda$6(MutableState<String> mutableState) {
        return mutableState.getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x027e  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x027a  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0273  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x036d  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0370  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void BasicTextField(androidx.compose.ui.text.input.TextFieldValue r37, kotlin.jvm.functions.Function1 r38, androidx.compose.ui.Modifier r39, boolean r40, boolean r41, androidx.compose.ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.KeyboardActions r44, boolean r45, int r46, int r47, androidx.compose.ui.text.input.VisualTransformation r48, kotlin.jvm.functions.Function1 r49, androidx.compose.foundation.interaction.MutableInteractionSource r50, androidx.compose.ui.graphics.Brush r51, c6.InterfaceC2073o r52, androidx.compose.runtime.Composer r53, int r54, int r55, int r56) {
        /*
            Method dump skipped, instructions count: 1082
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, c6.o, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0311  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void BasicTextField(java.lang.String r37, kotlin.jvm.functions.Function1 r38, androidx.compose.ui.Modifier r39, boolean r40, boolean r41, androidx.compose.ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.KeyboardActions r44, boolean r45, int r46, androidx.compose.ui.text.input.VisualTransformation r47, kotlin.jvm.functions.Function1 r48, androidx.compose.foundation.interaction.MutableInteractionSource r49, androidx.compose.ui.graphics.Brush r50, c6.InterfaceC2073o r51, androidx.compose.runtime.Composer r52, int r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(java.lang.String, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, c6.o, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x025f  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0279  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0311  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final /* synthetic */ void BasicTextField(androidx.compose.ui.text.input.TextFieldValue r37, kotlin.jvm.functions.Function1 r38, androidx.compose.ui.Modifier r39, boolean r40, boolean r41, androidx.compose.ui.text.TextStyle r42, androidx.compose.foundation.text.KeyboardOptions r43, androidx.compose.foundation.text.KeyboardActions r44, boolean r45, int r46, androidx.compose.ui.text.input.VisualTransformation r47, kotlin.jvm.functions.Function1 r48, androidx.compose.foundation.interaction.MutableInteractionSource r49, androidx.compose.ui.graphics.Brush r50, c6.InterfaceC2073o r51, androidx.compose.runtime.Composer r52, int r53, int r54, int r55) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.BasicTextFieldKt.BasicTextField(androidx.compose.ui.text.input.TextFieldValue, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, boolean, boolean, androidx.compose.ui.text.TextStyle, androidx.compose.foundation.text.KeyboardOptions, androidx.compose.foundation.text.KeyboardActions, boolean, int, androidx.compose.ui.text.input.VisualTransformation, kotlin.jvm.functions.Function1, androidx.compose.foundation.interaction.MutableInteractionSource, androidx.compose.ui.graphics.Brush, c6.o, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
