package androidx.window.core;

import Q5.InterfaceC1416k;
import Q5.l;
import java.math.BigInteger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;

/* loaded from: classes3.dex */
public final class Version implements Comparable<Version> {
    private static final Version CURRENT;
    public static final Companion Companion = new Companion(null);
    private static final Version UNKNOWN = new Version(0, 0, 0, "");
    private static final Version VERSION_0_1 = new Version(0, 1, 0, "");
    private static final Version VERSION_1_0;
    private static final String VERSION_PATTERN_STRING = "(\\d+)(?:\\.(\\d+))(?:\\.(\\d+))(?:-(.+))?";
    private final InterfaceC1416k bigInteger$delegate;
    private final String description;
    private final int major;
    private final int minor;
    private final int patch;

    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public final Version getCURRENT() {
            return Version.CURRENT;
        }

        public final Version getUNKNOWN() {
            return Version.UNKNOWN;
        }

        public final Version getVERSION_0_1() {
            return Version.VERSION_0_1;
        }

        public final Version getVERSION_1_0() {
            return Version.VERSION_1_0;
        }

        public final Version parse(String str) {
            Integer valueOf;
            Integer valueOf2;
            Integer valueOf3;
            String str2;
            if (str == null || n.T(str)) {
                return null;
            }
            Matcher matcher = Pattern.compile(Version.VERSION_PATTERN_STRING).matcher(str);
            if (!matcher.matches()) {
                return null;
            }
            String group = matcher.group(1);
            if (group == null) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(Integer.parseInt(group));
            }
            if (valueOf == null) {
                return null;
            }
            int intValue = valueOf.intValue();
            String group2 = matcher.group(2);
            if (group2 == null) {
                valueOf2 = null;
            } else {
                valueOf2 = Integer.valueOf(Integer.parseInt(group2));
            }
            if (valueOf2 == null) {
                return null;
            }
            int intValue2 = valueOf2.intValue();
            String group3 = matcher.group(3);
            if (group3 == null) {
                valueOf3 = null;
            } else {
                valueOf3 = Integer.valueOf(Integer.parseInt(group3));
            }
            if (valueOf3 == null) {
                return null;
            }
            int intValue3 = valueOf3.intValue();
            if (matcher.group(4) != null) {
                str2 = matcher.group(4);
            } else {
                str2 = "";
            }
            String description = str2;
            AbstractC3292y.h(description, "description");
            return new Version(intValue, intValue2, intValue3, description, null);
        }

        public /* synthetic */ Companion(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    static {
        Version version = new Version(1, 0, 0, "");
        VERSION_1_0 = version;
        CURRENT = version;
    }

    public /* synthetic */ Version(int i8, int i9, int i10, String str, AbstractC3284p abstractC3284p) {
        this(i8, i9, i10, str);
    }

    private final BigInteger getBigInteger() {
        Object value = this.bigInteger$delegate.getValue();
        AbstractC3292y.h(value, "<get-bigInteger>(...)");
        return (BigInteger) value;
    }

    public static final Version parse(String str) {
        return Companion.parse(str);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Version)) {
            return false;
        }
        Version version = (Version) obj;
        if (this.major != version.major || this.minor != version.minor || this.patch != version.patch) {
            return false;
        }
        return true;
    }

    public final String getDescription() {
        return this.description;
    }

    public final int getMajor() {
        return this.major;
    }

    public final int getMinor() {
        return this.minor;
    }

    public final int getPatch() {
        return this.patch;
    }

    public int hashCode() {
        return ((((527 + this.major) * 31) + this.minor) * 31) + this.patch;
    }

    public String toString() {
        String str;
        if (!n.T(this.description)) {
            str = AbstractC3292y.q("-", this.description);
        } else {
            str = "";
        }
        return this.major + '.' + this.minor + '.' + this.patch + str;
    }

    private Version(int i8, int i9, int i10, String str) {
        this.major = i8;
        this.minor = i9;
        this.patch = i10;
        this.description = str;
        this.bigInteger$delegate = l.b(new Version$bigInteger$2(this));
    }

    @Override // java.lang.Comparable
    public int compareTo(Version other) {
        AbstractC3292y.i(other, "other");
        return getBigInteger().compareTo(other.getBigInteger());
    }
}
