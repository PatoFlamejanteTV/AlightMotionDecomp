package N6;

import K6.s;
import K6.u;
import K6.x;
import K6.z;
import androidx.browser.trusted.sharing.ShareTarget;

/* loaded from: classes5.dex */
public final class a implements s {

    /* renamed from: a, reason: collision with root package name */
    public final u f6811a;

    public a(u uVar) {
        this.f6811a = uVar;
    }

    @Override // K6.s
    public z a(s.a aVar) {
        O6.g gVar = (O6.g) aVar;
        x request = gVar.request();
        g g8 = gVar.g();
        return gVar.f(request, g8, g8.h(this.f6811a, aVar, !request.g().equals(ShareTarget.METHOD_GET)), g8.c());
    }
}
