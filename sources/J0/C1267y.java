package J0;

import java.io.File;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: J0.y, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1267y {

    /* renamed from: a, reason: collision with root package name */
    private final String f3998a;

    /* renamed from: b, reason: collision with root package name */
    private final P0.g f3999b;

    public C1267y(String str, P0.g gVar) {
        this.f3998a = str;
        this.f3999b = gVar;
    }

    private File b() {
        return this.f3999b.g(this.f3998a);
    }

    public boolean a() {
        try {
            return b().createNewFile();
        } catch (IOException e8) {
            G0.g.f().e("Error creating marker: " + this.f3998a, e8);
            return false;
        }
    }

    public boolean c() {
        return b().exists();
    }

    public boolean d() {
        return b().delete();
    }
}
