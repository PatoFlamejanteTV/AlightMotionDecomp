package androidx.compose.material;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material.Strings;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class Strings_androidKt {
    @Composable
    /* renamed from: getString-4foXLRw, reason: not valid java name */
    public static final String m1328getString4foXLRw(int i8, Composer composer, int i9) {
        String str;
        composer.startReplaceableGroup(-726638443);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-726638443, i9, -1, "androidx.compose.material.getString (Strings.android.kt:24)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Strings.Companion companion = Strings.Companion;
        if (Strings.m1317equalsimpl0(i8, companion.m1325getNavigationMenuUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.navigation_menu);
            AbstractC3292y.h(str, "resources.getString(R.string.navigation_menu)");
        } else if (Strings.m1317equalsimpl0(i8, companion.m1321getCloseDrawerUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.close_drawer);
            AbstractC3292y.h(str, "resources.getString(R.string.close_drawer)");
        } else if (Strings.m1317equalsimpl0(i8, companion.m1322getCloseSheetUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.close_sheet);
            AbstractC3292y.h(str, "resources.getString(R.string.close_sheet)");
        } else if (Strings.m1317equalsimpl0(i8, companion.m1323getDefaultErrorMessageUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.default_error_message);
            AbstractC3292y.h(str, "resources.getString(R.st…ng.default_error_message)");
        } else if (Strings.m1317equalsimpl0(i8, companion.m1324getExposedDropdownMenuUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.dropdown_menu);
            AbstractC3292y.h(str, "resources.getString(R.string.dropdown_menu)");
        } else if (Strings.m1317equalsimpl0(i8, companion.m1327getSliderRangeStartUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.range_start);
            AbstractC3292y.h(str, "resources.getString(R.string.range_start)");
        } else if (Strings.m1317equalsimpl0(i8, companion.m1326getSliderRangeEndUdPEhr4())) {
            str = resources.getString(androidx.compose.ui.R.string.range_end);
            AbstractC3292y.h(str, "resources.getString(R.string.range_end)");
        } else {
            str = "";
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return str;
    }
}
