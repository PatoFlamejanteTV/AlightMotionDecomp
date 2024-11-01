package com.mbridge.msdk.newreward.function.f;

import com.mbridge.msdk.newreward.a.b.f;
import com.mbridge.msdk.newreward.a.b.g;
import com.mbridge.msdk.newreward.a.b.h;
import com.mbridge.msdk.newreward.a.b.i;
import com.mbridge.msdk.newreward.a.b.j;
import com.mbridge.msdk.newreward.a.b.m;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private volatile boolean f22476a = false;

    /* renamed from: b, reason: collision with root package name */
    private volatile boolean f22477b = false;

    public final void a(com.mbridge.msdk.newreward.function.d.a.b bVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
        this.f22476a = false;
        this.f22477b = false;
        a aVar = new a(bVar, this, bVar2);
        try {
            new com.mbridge.msdk.newreward.a.b.d().a(bVar, aVar);
        } catch (IOException e8) {
            aVar.a(new com.mbridge.msdk.foundation.c.b(880020, e8.getMessage()));
        }
        for (com.mbridge.msdk.newreward.function.d.a.a aVar2 : bVar.s()) {
            a aVar3 = new a(bVar, this, bVar2);
            try {
                new m().a(aVar2, aVar3);
            } catch (IOException e9) {
                aVar3.a(new com.mbridge.msdk.foundation.c.b(880020, e9.getMessage()));
            }
            a aVar4 = new a(bVar, this, bVar2);
            try {
                new com.mbridge.msdk.newreward.a.b.e().a(aVar2, aVar4);
            } catch (IOException e10) {
                aVar4.a(new com.mbridge.msdk.foundation.c.b(880020, e10.getMessage()));
            }
            a aVar5 = new a(bVar, this, bVar2);
            try {
                new f().a(aVar2, aVar5);
            } catch (IOException e11) {
                aVar5.a(new com.mbridge.msdk.foundation.c.b(880020, e11.getMessage()));
            }
            a aVar6 = new a(bVar, this, bVar2);
            try {
                new h().a(aVar2, aVar6);
            } catch (IOException e12) {
                aVar6.a(new com.mbridge.msdk.foundation.c.b(880020, e12.getMessage()));
            }
            a aVar7 = new a(bVar, this, bVar2);
            try {
                new i().a(aVar2, aVar7);
            } catch (IOException e13) {
                aVar7.a(new com.mbridge.msdk.foundation.c.b(880000, e13.getMessage()));
            }
            a aVar8 = new a(bVar, this, bVar2);
            try {
                new g().a(aVar2, aVar8);
            } catch (IOException e14) {
                aVar8.a(new com.mbridge.msdk.foundation.c.b(880000, e14.getMessage()));
            }
            a aVar9 = new a(bVar, this, bVar2);
            try {
                new j().a(aVar2, aVar9);
            } catch (IOException e15) {
                aVar9.a(new com.mbridge.msdk.foundation.c.b(880000, e15.getMessage()));
            }
        }
    }

    /* loaded from: classes4.dex */
    private static class a implements com.mbridge.msdk.newreward.a.b.b {

        /* renamed from: a, reason: collision with root package name */
        private com.mbridge.msdk.newreward.function.d.a.b f22478a;

        /* renamed from: b, reason: collision with root package name */
        private d f22479b;

        /* renamed from: c, reason: collision with root package name */
        private com.mbridge.msdk.newreward.a.b.b f22480c;

        public a(com.mbridge.msdk.newreward.function.d.a.b bVar, d dVar, com.mbridge.msdk.newreward.a.b.b bVar2) {
            this.f22478a = bVar;
            this.f22479b = dVar;
            this.f22480c = bVar2;
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            com.mbridge.msdk.newreward.function.d.a.b bVar = this.f22478a;
            com.mbridge.msdk.newreward.a.b.b bVar2 = this.f22480c;
            if (d.a(this.f22479b) && bVar.x()) {
                this.f22479b.f22476a = true;
                com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar.a(), bVar.b(), bVar.c(), bVar.e(), 3);
                bVar2.a(bVar);
            }
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            com.mbridge.msdk.newreward.function.d.a.b bVar2 = this.f22478a;
            com.mbridge.msdk.newreward.a.b.b bVar3 = this.f22480c;
            if (d.a(this.f22479b)) {
                if (bVar2.x()) {
                    this.f22479b.f22476a = true;
                    com.mbridge.msdk.newreward.function.e.c.a().b().a(bVar2.a(), bVar2.b(), bVar2.c(), bVar2.e(), 3);
                    bVar3.a(bVar2);
                } else {
                    this.f22479b.f22477b = true;
                    bVar3.a(bVar);
                }
            }
        }
    }

    static /* synthetic */ boolean a(d dVar) {
        return (dVar.f22476a || dVar.f22477b) ? false : true;
    }
}
