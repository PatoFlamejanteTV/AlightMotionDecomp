package O1;

import java.io.Serializable;

/* loaded from: classes4.dex */
public final class h implements Serializable {

    /* renamed from: b, reason: collision with root package name */
    public static final h f6962b = new h("JOSE");

    /* renamed from: c, reason: collision with root package name */
    public static final h f6963c = new h("JOSE+JSON");

    /* renamed from: d, reason: collision with root package name */
    public static final h f6964d = new h("JWT");

    /* renamed from: a, reason: collision with root package name */
    private final String f6965a;

    public h(String str) {
        if (str != null) {
            this.f6965a = str;
            return;
        }
        throw new IllegalArgumentException("The object type must not be null");
    }

    public boolean equals(Object obj) {
        if ((obj instanceof h) && this.f6965a.equalsIgnoreCase(((h) obj).f6965a)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return this.f6965a.toLowerCase().hashCode();
    }

    public String toString() {
        return this.f6965a;
    }
}
