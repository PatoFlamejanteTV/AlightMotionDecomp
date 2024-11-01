package j$.time.zone;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TimeZone;

/* loaded from: classes2.dex */
final class i extends j {

    /* renamed from: c, reason: collision with root package name */
    private final Set f33044c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : TimeZone.getAvailableIDs()) {
            linkedHashSet.add(str);
        }
        this.f33044c = Collections.unmodifiableSet(linkedHashSet);
    }

    @Override // j$.time.zone.j
    protected final f b(String str) {
        if (this.f33044c.contains(str)) {
            return new f(TimeZone.getTimeZone(str));
        }
        throw new RuntimeException("Not a built-in time zone: " + str);
    }

    @Override // j$.time.zone.j
    protected final Set c() {
        return this.f33044c;
    }
}
