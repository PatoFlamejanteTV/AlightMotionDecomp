package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3292y;

@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class TabRowDefaults {
    public static final int $stable = 0;
    public static final float DividerOpacity = 0.12f;
    public static final TabRowDefaults INSTANCE = new TabRowDefaults();
    private static final float DividerThickness = Dp.m5155constructorimpl(1);
    private static final float IndicatorHeight = Dp.m5155constructorimpl(2);
    private static final float ScrollableTabRowPadding = Dp.m5155constructorimpl(52);

    private TabRowDefaults() {
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    /* renamed from: Divider-9IZ8Weo, reason: not valid java name */
    public final void m1355Divider9IZ8Weo(Modifier modifier, float f8, long j8, Composer composer, int i8, int i9) {
        Modifier modifier2;
        int i10;
        int i11;
        float f9;
        long j9;
        int i12;
        Modifier modifier3;
        float f10;
        long j10;
        int i13;
        int i14;
        Composer startRestartGroup = composer.startRestartGroup(910934799);
        int i15 = i9 & 1;
        if (i15 != 0) {
            i10 = i8 | 6;
            modifier2 = modifier;
        } else if ((i8 & 14) == 0) {
            modifier2 = modifier;
            if (startRestartGroup.changed(modifier2)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i10 = i11 | i8;
        } else {
            modifier2 = modifier;
            i10 = i8;
        }
        if ((i8 & 112) == 0) {
            if ((i9 & 2) == 0) {
                f9 = f8;
                if (startRestartGroup.changed(f9)) {
                    i14 = 32;
                    i10 |= i14;
                }
            } else {
                f9 = f8;
            }
            i14 = 16;
            i10 |= i14;
        } else {
            f9 = f8;
        }
        if ((i8 & 896) == 0) {
            if ((i9 & 4) == 0) {
                j9 = j8;
                if (startRestartGroup.changed(j9)) {
                    i13 = 256;
                    i10 |= i13;
                }
            } else {
                j9 = j8;
            }
            i13 = 128;
            i10 |= i13;
        } else {
            j9 = j8;
        }
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else if ((i8 & 7168) == 0) {
            if (startRestartGroup.changed(this)) {
                i12 = 2048;
            } else {
                i12 = 1024;
            }
            i10 |= i12;
        }
        if ((i10 & 5851) == 1170 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
            modifier3 = modifier2;
            f10 = f9;
            j10 = j9;
        } else {
            startRestartGroup.startDefaults();
            if ((i8 & 1) != 0 && !startRestartGroup.getDefaultsInvalid()) {
                startRestartGroup.skipToGroupEnd();
                if ((i9 & 2) != 0) {
                    i10 &= -113;
                }
                if ((i9 & 4) != 0) {
                    i10 &= -897;
                }
                modifier3 = modifier2;
                f10 = f9;
            } else {
                if (i15 != 0) {
                    modifier3 = Modifier.Companion;
                } else {
                    modifier3 = modifier2;
                }
                if ((i9 & 2) != 0) {
                    f10 = DividerThickness;
                    i10 &= -113;
                } else {
                    f10 = f9;
                }
                if ((i9 & 4) != 0) {
                    j9 = Color.m2947copywmQWz5c$default(((Color) startRestartGroup.consume(ContentColorKt.getLocalContentColor())).m2958unboximpl(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    i10 &= -897;
                }
            }
            long j11 = j9;
            int i16 = i10;
            j10 = j11;
            startRestartGroup.endDefaults();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(910934799, i16, -1, "androidx.compose.material.TabRowDefaults.Divider (TabRow.kt:363)");
            }
            DividerKt.m1190DivideroMI9zvI(modifier3, j10, f10, 0.0f, startRestartGroup, (i16 & 14) | ((i16 >> 3) & 112) | ((i16 << 3) & 896), 8);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new TabRowDefaults$Divider$1(this, modifier3, f10, j10, i8, i9));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a8  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /* renamed from: Indicator-9IZ8Weo, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m1356Indicator9IZ8Weo(androidx.compose.ui.Modifier r17, float r18, long r19, androidx.compose.runtime.Composer r21, int r22, int r23) {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.TabRowDefaults.m1356Indicator9IZ8Weo(androidx.compose.ui.Modifier, float, long, androidx.compose.runtime.Composer, int, int):void");
    }

    /* renamed from: getDividerThickness-D9Ej5fM, reason: not valid java name */
    public final float m1357getDividerThicknessD9Ej5fM() {
        return DividerThickness;
    }

    /* renamed from: getIndicatorHeight-D9Ej5fM, reason: not valid java name */
    public final float m1358getIndicatorHeightD9Ej5fM() {
        return IndicatorHeight;
    }

    /* renamed from: getScrollableTabRowPadding-D9Ej5fM, reason: not valid java name */
    public final float m1359getScrollableTabRowPaddingD9Ej5fM() {
        return ScrollableTabRowPadding;
    }

    public final Modifier tabIndicatorOffset(Modifier modifier, TabPosition currentTabPosition) {
        Function1 noInspectorInfo;
        AbstractC3292y.i(modifier, "<this>");
        AbstractC3292y.i(currentTabPosition, "currentTabPosition");
        if (InspectableValueKt.isDebugInspectorInfoEnabled()) {
            noInspectorInfo = new TabRowDefaults$tabIndicatorOffset$$inlined$debugInspectorInfo$1(currentTabPosition);
        } else {
            noInspectorInfo = InspectableValueKt.getNoInspectorInfo();
        }
        return ComposedModifierKt.composed(modifier, noInspectorInfo, new TabRowDefaults$tabIndicatorOffset$2(currentTabPosition));
    }
}
