package androidx.compose.material3;

import androidx.compose.runtime.State;
import androidx.compose.ui.graphics.Color;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class TextFieldTransitionScope {
    public static final TextFieldTransitionScope INSTANCE = new TextFieldTransitionScope();

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputPhase.values().length];
            iArr[InputPhase.Focused.ordinal()] = 1;
            iArr[InputPhase.UnfocusedEmpty.ordinal()] = 2;
            iArr[InputPhase.UnfocusedNotEmpty.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private TextFieldTransitionScope() {
    }

    /* renamed from: Transition_DTcfvLk$lambda-1, reason: not valid java name */
    private static final float m1850Transition_DTcfvLk$lambda1(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: Transition_DTcfvLk$lambda-3, reason: not valid java name */
    private static final float m1851Transition_DTcfvLk$lambda3(State<Float> state) {
        return state.getValue().floatValue();
    }

    /* renamed from: Transition_DTcfvLk$lambda-5, reason: not valid java name */
    private static final long m1852Transition_DTcfvLk$lambda5(State<Color> state) {
        return state.getValue().m2958unboximpl();
    }

    /* renamed from: Transition_DTcfvLk$lambda-6, reason: not valid java name */
    private static final long m1853Transition_DTcfvLk$lambda6(State<Color> state) {
        return state.getValue().m2958unboximpl();
    }

    /* JADX WARN: Code restructure failed: missing block: B:152:0x01f9, code lost:            if (r32 != false) goto L120;     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x01ba, code lost:            if (r32 != false) goto L95;     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02bb  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01e1  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[0[0][0]]")
    /* renamed from: Transition-DTcfvLk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1854TransitionDTcfvLk(androidx.compose.material3.InputPhase r26, long r27, long r29, c6.InterfaceC2073o r31, boolean r32, c6.InterfaceC2076r r33, androidx.compose.runtime.Composer r34, int r35) {
        /*
            Method dump skipped, instructions count: 1048
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.TextFieldTransitionScope.m1854TransitionDTcfvLk(androidx.compose.material3.InputPhase, long, long, c6.o, boolean, c6.r, androidx.compose.runtime.Composer, int):void");
    }
}
