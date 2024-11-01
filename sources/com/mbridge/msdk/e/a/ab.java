package com.mbridge.msdk.e.a;

import com.mbridge.msdk.e.a.b;
import com.mbridge.msdk.e.a.p;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class ab implements p.a {

    /* renamed from: b, reason: collision with root package name */
    private final t f20015b;

    /* renamed from: d, reason: collision with root package name */
    private final c f20017d;

    /* renamed from: e, reason: collision with root package name */
    private final BlockingQueue<p<?>> f20018e;

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, List<p<?>>> f20014a = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private final q f20016c = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ab(c cVar, BlockingQueue<p<?>> blockingQueue, t tVar) {
        this.f20015b = tVar;
        this.f20017d = cVar;
        this.f20018e = blockingQueue;
    }

    @Override // com.mbridge.msdk.e.a.p.a
    public final void a(p<?> pVar, r<?> rVar) {
        List<p<?>> remove;
        b.a aVar = rVar.f20094b;
        if (aVar != null && !aVar.a(System.currentTimeMillis())) {
            String j8 = pVar.j();
            synchronized (this) {
                remove = this.f20014a.remove(j8);
            }
            if (remove != null) {
                Iterator<p<?>> it = remove.iterator();
                while (it.hasNext()) {
                    this.f20015b.a(it.next(), rVar);
                }
                return;
            }
            return;
        }
        a(pVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean b(p<?> pVar) {
        try {
            String j8 = pVar.j();
            if (this.f20014a.containsKey(j8)) {
                List<p<?>> list = this.f20014a.get(j8);
                if (list == null) {
                    list = new ArrayList<>();
                }
                list.add(pVar);
                this.f20014a.put(j8, list);
                return true;
            }
            this.f20014a.put(j8, null);
            pVar.a((p.a) this);
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.mbridge.msdk.e.a.p.a
    public final synchronized void a(p<?> pVar) {
        BlockingQueue<p<?>> blockingQueue;
        try {
            String j8 = pVar.j();
            List<p<?>> remove = this.f20014a.remove(j8);
            if (remove != null && !remove.isEmpty()) {
                p<?> remove2 = remove.remove(0);
                this.f20014a.put(j8, remove);
                remove2.a((p.a) this);
                q qVar = this.f20016c;
                if (qVar != null) {
                    qVar.c(remove2);
                } else if (this.f20017d != null && (blockingQueue = this.f20018e) != null) {
                    try {
                        blockingQueue.put(remove2);
                    } catch (InterruptedException e8) {
                        aa.c("Couldn't add request to queue. %s", e8.toString());
                        Thread.currentThread().interrupt();
                        this.f20017d.a();
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }
}
