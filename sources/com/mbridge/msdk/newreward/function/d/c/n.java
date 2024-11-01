package com.mbridge.msdk.newreward.function.d.c;

import java.io.File;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class n extends a<File> {

    /* renamed from: b, reason: collision with root package name */
    private final y f22356b;

    /* renamed from: c, reason: collision with root package name */
    private File f22357c;

    public n(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.function.d.a.a aVar) {
        super(bVar, aVar);
        this.f22356b = new y(a(), b(), this, 100);
    }

    public final void a(File file) {
        this.f22357c = file;
    }

    public final File f() {
        return this.f22357c;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final boolean g() {
        if (b() != null && b().g() != null) {
            ArrayList<Integer> rsIgnoreCheckRule = b().g().getRsIgnoreCheckRule();
            if (rsIgnoreCheckRule == null) {
                return false;
            }
            return rsIgnoreCheckRule.contains(0);
        }
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final int h() {
        return 1;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final boolean i() {
        return true;
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final String j() {
        if (b() != null && b().g() != null) {
            return b().g().getVideoUrlEncode();
        }
        return "";
    }

    @Override // com.mbridge.msdk.newreward.function.d.c.o
    public final q k() {
        return this.f22356b;
    }
}
