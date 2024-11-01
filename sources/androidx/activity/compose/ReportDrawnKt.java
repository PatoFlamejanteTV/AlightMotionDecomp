package androidx.activity.compose;

import androidx.activity.FullyDrawnReporter;
import androidx.activity.FullyDrawnReporterOwner;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ScopeUpdateScope;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class ReportDrawnKt {
    @Composable
    public static final void ReportDrawn(Composer composer, int i8) {
        Composer startRestartGroup = composer.startRestartGroup(-1357012904);
        if (i8 == 0 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            ReportDrawnWhen(ReportDrawnKt$ReportDrawn$1.INSTANCE, startRestartGroup, 6);
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new ReportDrawnKt$ReportDrawn$2(i8));
        }
    }

    @Composable
    public static final void ReportDrawnAfter(Function1 function1, Composer composer, int i8) {
        FullyDrawnReporter fullyDrawnReporter;
        Composer startRestartGroup = composer.startRestartGroup(945311272);
        FullyDrawnReporterOwner current = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(startRestartGroup, 6);
        if (current != null && (fullyDrawnReporter = current.getFullyDrawnReporter()) != null) {
            EffectsKt.LaunchedEffect(function1, fullyDrawnReporter, new ReportDrawnKt$ReportDrawnAfter$1(fullyDrawnReporter, function1, null), startRestartGroup, 584);
            ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
            if (endRestartGroup != null) {
                endRestartGroup.updateScope(new ReportDrawnKt$ReportDrawnAfter$2(function1, i8));
                return;
            }
            return;
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new ReportDrawnKt$ReportDrawnAfter$fullyDrawnReporter$1(function1, i8));
        }
    }

    @Composable
    public static final void ReportDrawnWhen(Function0 function0, Composer composer, int i8) {
        int i9;
        FullyDrawnReporter fullyDrawnReporter;
        int i10;
        Composer startRestartGroup = composer.startRestartGroup(-2047119994);
        if ((i8 & 14) == 0) {
            if (startRestartGroup.changed(function0)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            FullyDrawnReporterOwner current = LocalFullyDrawnReporterOwner.INSTANCE.getCurrent(startRestartGroup, 6);
            if (current != null && (fullyDrawnReporter = current.getFullyDrawnReporter()) != null) {
                EffectsKt.DisposableEffect(fullyDrawnReporter, function0, new ReportDrawnKt$ReportDrawnWhen$1(fullyDrawnReporter, function0), startRestartGroup, ((i9 << 3) & 112) | 8);
            } else {
                ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.updateScope(new ReportDrawnKt$ReportDrawnWhen$fullyDrawnReporter$1(function0, i8));
                    return;
                }
                return;
            }
        }
        ScopeUpdateScope endRestartGroup2 = startRestartGroup.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.updateScope(new ReportDrawnKt$ReportDrawnWhen$2(function0, i8));
        }
    }
}
