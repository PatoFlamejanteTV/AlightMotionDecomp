package com.mbridge.msdk.foundation.same.net.e;

import com.mbridge.msdk.foundation.same.net.j;
import com.mbridge.msdk.foundation.same.net.k;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private int f20871a;

    /* renamed from: b, reason: collision with root package name */
    private j f20872b;

    /* renamed from: c, reason: collision with root package name */
    private LinkedList<a> f20873c = new LinkedList<>();

    /* loaded from: classes4.dex */
    public class a {

        /* renamed from: b, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.net.e<Void> f20875b;

        /* renamed from: c, reason: collision with root package name */
        private com.mbridge.msdk.foundation.same.net.e.a f20876c;

        /* renamed from: d, reason: collision with root package name */
        private int f20877d;

        /* renamed from: e, reason: collision with root package name */
        private File f20878e;

        /* renamed from: f, reason: collision with root package name */
        private String f20879f;

        private a(File file, String str, com.mbridge.msdk.foundation.same.net.e<Void> eVar) {
            this.f20878e = file;
            this.f20875b = eVar;
            this.f20879f = str;
        }

        public final boolean a() {
            return this.f20877d == 1;
        }

        static /* synthetic */ boolean a(a aVar) {
            if (aVar.f20877d != 0) {
                return false;
            }
            com.mbridge.msdk.foundation.same.net.e.a aVar2 = new com.mbridge.msdk.foundation.same.net.e.a(aVar.f20878e, aVar.f20879f);
            aVar.f20876c = aVar2;
            aVar2.a(new com.mbridge.msdk.foundation.same.net.f<Void>() { // from class: com.mbridge.msdk.foundation.same.net.e.b.a.1

                /* renamed from: a, reason: collision with root package name */
                boolean f20880a;

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onCancel() {
                    a.this.f20875b.onCancel();
                    this.f20880a = true;
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onError(com.mbridge.msdk.foundation.same.net.b.a aVar3) {
                    if (!this.f20880a) {
                        a.this.f20875b.onError(aVar3);
                    }
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onFinish() {
                    if (!this.f20880a) {
                        a.this.f20877d = 3;
                        a.this.f20875b.onFinish();
                        a aVar3 = a.this;
                        b.a(b.this, aVar3);
                    }
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onPreExecute() {
                    a.this.f20875b.onPreExecute();
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onProgressChange(long j8, long j9) {
                    a.this.f20875b.onProgressChange(j8, j9);
                }

                @Override // com.mbridge.msdk.foundation.same.net.f, com.mbridge.msdk.foundation.same.net.e
                public final void onSuccess(k kVar) {
                    if (!this.f20880a) {
                        a.this.f20875b.onSuccess(kVar);
                    }
                }
            });
            aVar.f20877d = 1;
            b.this.f20872b.a(aVar.f20876c);
            return true;
        }
    }

    public b(j jVar, int i8) {
        this.f20872b = jVar;
        this.f20871a = i8;
    }

    public final a a(File file, String str, com.mbridge.msdk.foundation.same.net.e<Void> eVar) {
        a aVar = new a(file, str, eVar);
        synchronized (this) {
            this.f20873c.add(aVar);
        }
        a();
        return aVar;
    }

    private void a() {
        synchronized (this) {
            try {
                Iterator<a> it = this.f20873c.iterator();
                int i8 = 0;
                while (it.hasNext()) {
                    if (it.next().a()) {
                        i8++;
                    }
                }
                if (i8 >= this.f20871a) {
                    return;
                }
                Iterator<a> it2 = this.f20873c.iterator();
                while (it2.hasNext()) {
                    if (a.a(it2.next()) && (i8 = i8 + 1) == this.f20871a) {
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static /* synthetic */ void a(b bVar, a aVar) {
        synchronized (bVar) {
            bVar.f20873c.remove(aVar);
        }
        bVar.a();
    }
}
