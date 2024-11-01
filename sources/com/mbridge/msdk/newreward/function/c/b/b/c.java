package com.mbridge.msdk.newreward.function.c.b.b;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.a.a f22195a;

    /* renamed from: b, reason: collision with root package name */
    private com.mbridge.msdk.newreward.function.c.b.b.a f22196b;

    /* renamed from: c, reason: collision with root package name */
    private b f22197c;

    /* renamed from: d, reason: collision with root package name */
    private d f22198d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f22199e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f22200f = false;

    public c(com.mbridge.msdk.newreward.function.c.a.a aVar) {
        this.f22195a = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public class a implements com.mbridge.msdk.newreward.a.b.b {

        /* renamed from: b, reason: collision with root package name */
        private final c f22204b;

        /* renamed from: c, reason: collision with root package name */
        private final com.mbridge.msdk.newreward.a.b.b f22205c;

        public a(c cVar, com.mbridge.msdk.newreward.a.b.b bVar) {
            this.f22204b = cVar;
            this.f22205c = bVar;
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(Object obj) {
            if (this.f22204b.f22199e) {
                return;
            }
            this.f22204b.f22199e = true;
            this.f22205c.a(obj);
        }

        @Override // com.mbridge.msdk.newreward.a.b.b
        public final void a(com.mbridge.msdk.foundation.c.b bVar) {
            if (bVar.a() == 1) {
                if (!c.this.f22196b.a() || !c.this.f22197c.a() || this.f22204b.f22200f) {
                    return;
                } else {
                    this.f22204b.f22200f = true;
                }
            }
            this.f22205c.a(bVar);
        }
    }

    public final void a(e eVar, final com.mbridge.msdk.newreward.a.b.b bVar) {
        int c8 = eVar.c();
        if (c8 == 1) {
            if (this.f22196b == null) {
                a();
            }
            this.f22196b.a(eVar, new a(this, bVar));
        } else if (c8 == 2) {
            if (this.f22198d == null) {
                this.f22198d = new d();
            }
            this.f22198d.a(eVar, new com.mbridge.msdk.newreward.a.b.b() { // from class: com.mbridge.msdk.newreward.function.c.b.b.c.1
                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(Object obj) {
                    com.mbridge.msdk.newreward.a.b.b bVar2 = bVar;
                    if (bVar2 != null) {
                        bVar2.a(obj);
                    }
                }

                @Override // com.mbridge.msdk.newreward.a.b.b
                public final void a(com.mbridge.msdk.foundation.c.b bVar2) {
                    com.mbridge.msdk.newreward.a.b.b bVar3 = bVar;
                    if (bVar3 != null) {
                        bVar3.a(bVar2);
                    }
                }
            });
        } else {
            if (c8 != 3) {
                return;
            }
            if (this.f22197c == null) {
                this.f22197c = new b(this.f22195a);
            }
            this.f22197c.a(eVar, new a(this, bVar));
        }
    }

    private void a() {
        this.f22196b = new com.mbridge.msdk.newreward.function.c.b.b.a(this.f22195a);
    }

    public final boolean a(e eVar) {
        if (eVar.c() == 1) {
            if (this.f22196b == null) {
                a();
            }
            return this.f22196b.a(eVar.a(), eVar, eVar.b());
        }
        if (eVar.c() == 2) {
            if (this.f22198d == null) {
                this.f22198d = new d();
            }
            return this.f22198d.a(eVar);
        }
        if (eVar.c() != 3) {
            return false;
        }
        if (this.f22197c == null) {
            this.f22197c = new b(this.f22195a);
        }
        return true;
    }
}
