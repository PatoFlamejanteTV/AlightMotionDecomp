package j$.time;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public abstract class ZoneId implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f32809a;
    private static final long serialVersionUID = 8352817235686L;

    static {
        Map.Entry[] entryArr = {j$.com.android.tools.r8.a.g("ACT", "Australia/Darwin"), j$.com.android.tools.r8.a.g("AET", "Australia/Sydney"), j$.com.android.tools.r8.a.g("AGT", "America/Argentina/Buenos_Aires"), j$.com.android.tools.r8.a.g("ART", "Africa/Cairo"), j$.com.android.tools.r8.a.g("AST", "America/Anchorage"), j$.com.android.tools.r8.a.g("BET", "America/Sao_Paulo"), j$.com.android.tools.r8.a.g("BST", "Asia/Dhaka"), j$.com.android.tools.r8.a.g("CAT", "Africa/Harare"), j$.com.android.tools.r8.a.g("CNT", "America/St_Johns"), j$.com.android.tools.r8.a.g("CST", "America/Chicago"), j$.com.android.tools.r8.a.g("CTT", "Asia/Shanghai"), j$.com.android.tools.r8.a.g("EAT", "Africa/Addis_Ababa"), j$.com.android.tools.r8.a.g("ECT", "Europe/Paris"), j$.com.android.tools.r8.a.g("IET", "America/Indiana/Indianapolis"), j$.com.android.tools.r8.a.g("IST", "Asia/Kolkata"), j$.com.android.tools.r8.a.g("JST", "Asia/Tokyo"), j$.com.android.tools.r8.a.g("MIT", "Pacific/Apia"), j$.com.android.tools.r8.a.g("NET", "Asia/Yerevan"), j$.com.android.tools.r8.a.g("NST", "Pacific/Auckland"), j$.com.android.tools.r8.a.g("PLT", "Asia/Karachi"), j$.com.android.tools.r8.a.g("PNT", "America/Phoenix"), j$.com.android.tools.r8.a.g("PRT", "America/Puerto_Rico"), j$.com.android.tools.r8.a.g("PST", "America/Los_Angeles"), j$.com.android.tools.r8.a.g("SST", "Pacific/Guadalcanal"), j$.com.android.tools.r8.a.g("VST", "Asia/Ho_Chi_Minh"), j$.com.android.tools.r8.a.g("EST", "-05:00"), j$.com.android.tools.r8.a.g("MST", "-07:00"), j$.com.android.tools.r8.a.g("HST", "-10:00")};
        HashMap hashMap = new HashMap(28);
        for (int i8 = 0; i8 < 28; i8++) {
            Map.Entry entry = entryArr[i8];
            Object requireNonNull = Objects.requireNonNull(entry.getKey());
            if (hashMap.put(requireNonNull, Objects.requireNonNull(entry.getValue())) != null) {
                throw new IllegalArgumentException("duplicate key: " + requireNonNull);
            }
        }
        f32809a = Collections.unmodifiableMap(hashMap);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ZoneId() {
        if (getClass() != ZoneOffset.class && getClass() != x.class) {
            throw new AssertionError("Invalid subclass");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneId E(String str, boolean z8) {
        int i8;
        Objects.requireNonNull(str, "zoneId");
        if (str.length() <= 1 || str.startsWith("+") || str.startsWith("-")) {
            return ZoneOffset.K(str);
        }
        if (str.startsWith("UTC") || str.startsWith("GMT")) {
            i8 = 3;
        } else {
            if (!str.startsWith("UT")) {
                return x.I(str, z8);
            }
            i8 = 2;
        }
        return G(str, i8, z8);
    }

    public static ZoneId F(String str, ZoneOffset zoneOffset) {
        Objects.requireNonNull(str, "prefix");
        Objects.requireNonNull(zoneOffset, TypedValues.CycleType.S_WAVE_OFFSET);
        if (str.isEmpty()) {
            return zoneOffset;
        }
        if (!str.equals("GMT") && !str.equals("UTC") && !str.equals("UT")) {
            throw new IllegalArgumentException("prefix should be GMT, UTC or UT, is: ".concat(str));
        }
        if (zoneOffset.J() != 0) {
            str = str.concat(zoneOffset.i());
        }
        return new x(str, j$.time.zone.f.i(zoneOffset));
    }

    private static ZoneId G(String str, int i8, boolean z8) {
        String substring = str.substring(0, i8);
        if (str.length() == i8) {
            return F(substring, ZoneOffset.UTC);
        }
        if (str.charAt(i8) != '+' && str.charAt(i8) != '-') {
            return x.I(str, z8);
        }
        try {
            ZoneOffset K8 = ZoneOffset.K(str.substring(i8));
            return K8 == ZoneOffset.UTC ? F(substring, K8) : F(substring, K8);
        } catch (c e8) {
            throw new RuntimeException("Invalid ID for offset-based ZoneId: ".concat(str), e8);
        }
    }

    public static ZoneId of(String str) {
        return E(str, true);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new s((byte) 7, this);
    }

    public abstract j$.time.zone.f D();

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract void H(DataOutput dataOutput);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ZoneId) {
            return i().equals(((ZoneId) obj).i());
        }
        return false;
    }

    public int hashCode() {
        return i().hashCode();
    }

    public abstract String i();

    public String toString() {
        return i();
    }
}
