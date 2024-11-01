package x2;

import androidx.core.os.EnvironmentCompat;

/* loaded from: classes4.dex */
public final class h extends k {

    /* renamed from: f, reason: collision with root package name */
    private final String f40946f;

    /* renamed from: g, reason: collision with root package name */
    private final String f40947g;

    public h(String str, String str2) {
        super(null, null, 0, null, str, 15, null);
        this.f40946f = str;
        this.f40947g = str2;
    }

    @Override // x2.k
    public String a() {
        String str = this.f40947g;
        if (str == null) {
            return EnvironmentCompat.MEDIA_UNKNOWN;
        }
        return str;
    }

    public final String g() {
        return this.f40946f;
    }
}
