package androidx.compose.material3;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.material3.Strings;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class Strings_androidKt {
    @Composable
    /* renamed from: getString-NWtq2-8, reason: not valid java name */
    public static final String m1772getStringNWtq28(int i8, Composer composer, int i9) {
        String str;
        composer.startReplaceableGroup(-176762646);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-176762646, i9, -1, "androidx.compose.material3.getString (Strings.android.kt:24)");
        }
        composer.consume(AndroidCompositionLocals_androidKt.getLocalConfiguration());
        Resources resources = ((Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
        Strings.Companion companion = Strings.Companion;
        if (Strings.m1758equalsimpl0(i8, companion.m1769getNavigationMenuadMyvUU())) {
            str = resources.getString(androidx.compose.ui.R.string.navigation_menu);
            AbstractC3292y.h(str, "resources.getString(R.string.navigation_menu)");
        } else if (Strings.m1758equalsimpl0(i8, companion.m1762getCloseDraweradMyvUU())) {
            str = resources.getString(androidx.compose.ui.R.string.close_drawer);
            AbstractC3292y.h(str, "resources.getString(R.string.close_drawer)");
        } else if (Strings.m1758equalsimpl0(i8, companion.m1763getCloseSheetadMyvUU())) {
            str = resources.getString(androidx.compose.ui.R.string.close_sheet);
            AbstractC3292y.h(str, "resources.getString(R.string.close_sheet)");
        } else if (Strings.m1758equalsimpl0(i8, companion.m1764getDefaultErrorMessageadMyvUU())) {
            str = resources.getString(androidx.compose.ui.R.string.default_error_message);
            AbstractC3292y.h(str, "resources.getString(R.st…ng.default_error_message)");
        } else if (Strings.m1758equalsimpl0(i8, companion.m1766getExposedDropdownMenuadMyvUU())) {
            str = resources.getString(androidx.compose.ui.R.string.dropdown_menu);
            AbstractC3292y.h(str, "resources.getString(R.string.dropdown_menu)");
        } else if (Strings.m1758equalsimpl0(i8, companion.m1771getSliderRangeStartadMyvUU())) {
            str = resources.getString(androidx.compose.ui.R.string.range_start);
            AbstractC3292y.h(str, "resources.getString(R.string.range_start)");
        } else if (Strings.m1758equalsimpl0(i8, companion.m1770getSliderRangeEndadMyvUU())) {
            str = resources.getString(androidx.compose.ui.R.string.range_end);
            AbstractC3292y.h(str, "resources.getString(R.string.range_end)");
        } else if (Strings.m1758equalsimpl0(i8, companion.m1765getDialogadMyvUU())) {
            str = resources.getString(R.string.dialog);
            AbstractC3292y.h(str, "resources.getString(andr…aterial3.R.string.dialog)");
        } else if (Strings.m1758equalsimpl0(i8, companion.m1768getMenuExpandedadMyvUU())) {
            str = resources.getString(R.string.expanded);
            AbstractC3292y.h(str, "resources.getString(andr…erial3.R.string.expanded)");
        } else if (Strings.m1758equalsimpl0(i8, companion.m1767getMenuCollapsedadMyvUU())) {
            str = resources.getString(R.string.collapsed);
            AbstractC3292y.h(str, "resources.getString(andr…rial3.R.string.collapsed)");
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
