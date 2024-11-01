package j$.time;

import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class a extends b implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    static final a f32819b;
    private static final long serialVersionUID = 6740630888130243051L;

    /* renamed from: a, reason: collision with root package name */
    private final ZoneId f32820a;

    static {
        System.currentTimeMillis();
        f32819b = new a(ZoneOffset.UTC);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(ZoneId zoneId) {
        this.f32820a = zoneId;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
    }

    @Override // j$.time.b
    public final long a() {
        return System.currentTimeMillis();
    }

    public final ZoneId c() {
        return this.f32820a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        return this.f32820a.equals(((a) obj).f32820a);
    }

    public final int hashCode() {
        return this.f32820a.hashCode() + 1;
    }

    public final String toString() {
        return "SystemClock[" + this.f32820a + "]";
    }
}
