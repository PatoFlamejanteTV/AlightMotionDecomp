package m6;

import com.mbridge.msdk.c.h;
import kotlin.jvm.internal.AbstractC3292y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: m6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3379f extends AbstractC3378e {
    public static final EnumC3377d d(char c8, boolean z8) {
        if (!z8) {
            if (c8 == 'D') {
                return EnumC3377d.f35049h;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c8);
        }
        if (c8 != 'H') {
            if (c8 != 'M') {
                if (c8 == 'S') {
                    return EnumC3377d.f35046e;
                }
                throw new IllegalArgumentException("Invalid duration ISO time unit: " + c8);
            }
            return EnumC3377d.f35047f;
        }
        return EnumC3377d.f35048g;
    }

    public static final EnumC3377d e(String shortName) {
        AbstractC3292y.i(shortName, "shortName");
        int hashCode = shortName.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && shortName.equals("us")) {
                                    return EnumC3377d.f35044c;
                                }
                            } else if (shortName.equals("ns")) {
                                return EnumC3377d.f35043b;
                            }
                        } else if (shortName.equals("ms")) {
                            return EnumC3377d.f35045d;
                        }
                    } else if (shortName.equals("s")) {
                        return EnumC3377d.f35046e;
                    }
                } else if (shortName.equals("m")) {
                    return EnumC3377d.f35047f;
                }
            } else if (shortName.equals(h.f19256a)) {
                return EnumC3377d.f35048g;
            }
        } else if (shortName.equals("d")) {
            return EnumC3377d.f35049h;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }
}
