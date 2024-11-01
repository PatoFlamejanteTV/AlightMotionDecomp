package x1;

import j$.time.Instant;
import j$.time.ZoneId;
import j$.time.ZonedDateTime;
import java.util.regex.Pattern;
import y1.C4236a;

/* renamed from: x1.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC4202f {

    /* renamed from: a, reason: collision with root package name */
    private static Pattern f40935a = Pattern.compile("^[0-1]*$", 2);

    public static ZonedDateTime a(String str) {
        if (f40935a.matcher(str).matches() && str.length() == 36) {
            return ZonedDateTime.ofInstant(Instant.ofEpochMilli(m.a(str) * 100), ZoneId.of("UTC"));
        }
        throw new C4236a("Undecodable Datetime '" + str + "'");
    }

    public static String b(ZonedDateTime zonedDateTime) {
        if (zonedDateTime != null) {
            return m.b(zonedDateTime.toInstant().toEpochMilli() / 100, 36);
        }
        return m.b(0L, 36);
    }
}
