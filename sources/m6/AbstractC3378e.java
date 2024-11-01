package m6;

import kotlin.jvm.internal.AbstractC3292y;

/* renamed from: m6.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC3378e {
    public static final double a(double d8, EnumC3377d sourceUnit, EnumC3377d targetUnit) {
        AbstractC3292y.i(sourceUnit, "sourceUnit");
        AbstractC3292y.i(targetUnit, "targetUnit");
        long convert = targetUnit.b().convert(1L, sourceUnit.b());
        if (convert > 0) {
            return d8 * convert;
        }
        return d8 / sourceUnit.b().convert(1L, targetUnit.b());
    }

    public static final long b(long j8, EnumC3377d sourceUnit, EnumC3377d targetUnit) {
        AbstractC3292y.i(sourceUnit, "sourceUnit");
        AbstractC3292y.i(targetUnit, "targetUnit");
        return targetUnit.b().convert(j8, sourceUnit.b());
    }

    public static final long c(long j8, EnumC3377d sourceUnit, EnumC3377d targetUnit) {
        AbstractC3292y.i(sourceUnit, "sourceUnit");
        AbstractC3292y.i(targetUnit, "targetUnit");
        return targetUnit.b().convert(j8, sourceUnit.b());
    }
}
