package androidx.activity;

import android.view.View;
import k6.AbstractC3258j;
import kotlin.jvm.internal.AbstractC3292y;

/* loaded from: classes.dex */
public final class ViewTreeFullyDrawnReporterOwner {
    public static final FullyDrawnReporterOwner get(View view) {
        AbstractC3292y.i(view, "<this>");
        return (FullyDrawnReporterOwner) AbstractC3258j.s(AbstractC3258j.z(AbstractC3258j.h(view, ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$1.INSTANCE), ViewTreeFullyDrawnReporterOwner$findViewTreeFullyDrawnReporterOwner$2.INSTANCE));
    }

    public static final void set(View view, FullyDrawnReporterOwner fullyDrawnReporterOwner) {
        AbstractC3292y.i(view, "<this>");
        AbstractC3292y.i(fullyDrawnReporterOwner, "fullyDrawnReporterOwner");
        view.setTag(R.id.report_drawn, fullyDrawnReporterOwner);
    }
}
