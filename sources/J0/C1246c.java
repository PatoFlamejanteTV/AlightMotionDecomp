package J0;

import java.io.File;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: J0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1246c extends A {

    /* renamed from: a, reason: collision with root package name */
    private final M0.F f3894a;

    /* renamed from: b, reason: collision with root package name */
    private final String f3895b;

    /* renamed from: c, reason: collision with root package name */
    private final File f3896c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1246c(M0.F f8, String str, File file) {
        if (f8 != null) {
            this.f3894a = f8;
            if (str != null) {
                this.f3895b = str;
                if (file != null) {
                    this.f3896c = file;
                    return;
                }
                throw new NullPointerException("Null reportFile");
            }
            throw new NullPointerException("Null sessionId");
        }
        throw new NullPointerException("Null report");
    }

    @Override // J0.A
    public M0.F b() {
        return this.f3894a;
    }

    @Override // J0.A
    public File c() {
        return this.f3896c;
    }

    @Override // J0.A
    public String d() {
        return this.f3895b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a9 = (A) obj;
        if (this.f3894a.equals(a9.b()) && this.f3895b.equals(a9.d()) && this.f3896c.equals(a9.c())) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f3894a.hashCode() ^ 1000003) * 1000003) ^ this.f3895b.hashCode()) * 1000003) ^ this.f3896c.hashCode();
    }

    public String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.f3894a + ", sessionId=" + this.f3895b + ", reportFile=" + this.f3896c + "}";
    }
}
