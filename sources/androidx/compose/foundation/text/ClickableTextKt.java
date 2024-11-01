package androidx.compose.foundation.text;

import androidx.compose.runtime.MutableState;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.text.MultiParagraph;
import androidx.compose.ui.text.TextLayoutResult;

/* loaded from: classes.dex */
public final class ClickableTextKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x00b2  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    @androidx.compose.foundation.ExperimentalFoundationApi
    /* renamed from: ClickableText-03UYbkw, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m841ClickableText03UYbkw(androidx.compose.ui.text.AnnotatedString r25, kotlin.jvm.functions.Function1 r26, androidx.compose.ui.Modifier r27, androidx.compose.ui.text.TextStyle r28, boolean r29, int r30, int r31, kotlin.jvm.functions.Function1 r32, kotlin.jvm.functions.Function1 r33, androidx.compose.runtime.Composer r34, int r35, int r36) {
        /*
            Method dump skipped, instructions count: 643
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ClickableTextKt.m841ClickableText03UYbkw(androidx.compose.ui.text.AnnotatedString, kotlin.jvm.functions.Function1, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, boolean, int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:40:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x008c  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: ClickableText-4YKlhWE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void m842ClickableText4YKlhWE(androidx.compose.ui.text.AnnotatedString r25, androidx.compose.ui.Modifier r26, androidx.compose.ui.text.TextStyle r27, boolean r28, int r29, int r30, kotlin.jvm.functions.Function1 r31, kotlin.jvm.functions.Function1 r32, androidx.compose.runtime.Composer r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 566
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.ClickableTextKt.m842ClickableText4YKlhWE(androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.Modifier, androidx.compose.ui.text.TextStyle, boolean, int, int, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Integer ClickableText_03UYbkw$getOffset(MutableState<TextLayoutResult> mutableState, long j8) {
        MultiParagraph multiParagraph;
        TextLayoutResult value = mutableState.getValue();
        if (value == null || (multiParagraph = value.getMultiParagraph()) == null) {
            return null;
        }
        if (!m843containsWithinBoundsUv8p0NA(multiParagraph, j8)) {
            multiParagraph = null;
        }
        if (multiParagraph == null) {
            return null;
        }
        return Integer.valueOf(multiParagraph.m4549getOffsetForPositionk4lQ0M(j8));
    }

    /* renamed from: containsWithinBounds-Uv8p0NA, reason: not valid java name */
    private static final boolean m843containsWithinBoundsUv8p0NA(MultiParagraph multiParagraph, long j8) {
        float m2702component1impl = Offset.m2702component1impl(j8);
        float m2703component2impl = Offset.m2703component2impl(j8);
        if (m2702component1impl > 0.0f && m2703component2impl >= 0.0f && m2702component1impl <= multiParagraph.getWidth() && m2703component2impl <= multiParagraph.getHeight()) {
            return true;
        }
        return false;
    }
}
