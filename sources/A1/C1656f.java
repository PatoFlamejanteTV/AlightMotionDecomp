package a1;

import D0.C1038c;
import D0.F;
import D0.InterfaceC1040e;
import D0.r;
import a1.InterfaceC1660j;
import android.content.Context;
import android.util.Base64OutputStream;
import androidx.core.os.UserManagerCompat;
import c1.InterfaceC2009b;
import com.google.android.gms.tasks.Task;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.ByteArrayOutputStream;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;
import q0.AbstractC3628n;

/* renamed from: a1.f, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1656f implements InterfaceC1659i, InterfaceC1660j {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2009b f14047a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f14048b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC2009b f14049c;

    /* renamed from: d, reason: collision with root package name */
    private final Set f14050d;

    /* renamed from: e, reason: collision with root package name */
    private final Executor f14051e;

    private C1656f(final Context context, final String str, Set set, InterfaceC2009b interfaceC2009b, Executor executor) {
        this(new InterfaceC2009b() { // from class: a1.c
            @Override // c1.InterfaceC2009b
            public final Object get() {
                C1661k j8;
                j8 = C1656f.j(context, str);
                return j8;
            }
        }, set, executor, interfaceC2009b, context);
    }

    public static C1038c g() {
        final F a9 = F.a(C0.a.class, Executor.class);
        return C1038c.f(C1656f.class, InterfaceC1659i.class, InterfaceC1660j.class).b(r.l(Context.class)).b(r.l(A0.f.class)).b(r.o(InterfaceC1657g.class)).b(r.n(k1.i.class)).b(r.k(a9)).f(new D0.h() { // from class: a1.b
            @Override // D0.h
            public final Object a(InterfaceC1040e interfaceC1040e) {
                C1656f h8;
                h8 = C1656f.h(F.this, interfaceC1040e);
                return h8;
            }
        }).d();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C1656f h(F f8, InterfaceC1040e interfaceC1040e) {
        return new C1656f((Context) interfaceC1040e.a(Context.class), ((A0.f) interfaceC1040e.a(A0.f.class)).o(), interfaceC1040e.e(InterfaceC1657g.class), interfaceC1040e.c(k1.i.class), (Executor) interfaceC1040e.b(f8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String i() {
        String byteArrayOutputStream;
        synchronized (this) {
            try {
                C1661k c1661k = (C1661k) this.f14047a.get();
                List c8 = c1661k.c();
                c1661k.b();
                JSONArray jSONArray = new JSONArray();
                for (int i8 = 0; i8 < c8.size(); i8++) {
                    AbstractC1662l abstractC1662l = (AbstractC1662l) c8.get(i8);
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("agent", abstractC1662l.c());
                    jSONObject.put("dates", new JSONArray((Collection) abstractC1662l.b()));
                    jSONArray.put(jSONObject);
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("heartbeats", jSONArray);
                jSONObject2.put("version", "2");
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream2, 11);
                try {
                    GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                    try {
                        gZIPOutputStream.write(jSONObject2.toString().getBytes(C.UTF8_NAME));
                        gZIPOutputStream.close();
                        base64OutputStream.close();
                        byteArrayOutputStream = byteArrayOutputStream2.toString(C.UTF8_NAME);
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        base64OutputStream.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        return byteArrayOutputStream;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ C1661k j(Context context, String str) {
        return new C1661k(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Void k() {
        synchronized (this) {
            ((C1661k) this.f14047a.get()).k(System.currentTimeMillis(), ((k1.i) this.f14049c.get()).a());
        }
        return null;
    }

    @Override // a1.InterfaceC1659i
    public Task a() {
        if (!UserManagerCompat.isUserUnlocked(this.f14048b)) {
            return AbstractC3628n.e("");
        }
        return AbstractC3628n.c(this.f14051e, new Callable() { // from class: a1.d
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String i8;
                i8 = C1656f.this.i();
                return i8;
            }
        });
    }

    @Override // a1.InterfaceC1660j
    public synchronized InterfaceC1660j.a b(String str) {
        long currentTimeMillis = System.currentTimeMillis();
        C1661k c1661k = (C1661k) this.f14047a.get();
        if (c1661k.i(currentTimeMillis)) {
            c1661k.g();
            return InterfaceC1660j.a.GLOBAL;
        }
        return InterfaceC1660j.a.NONE;
    }

    public Task l() {
        if (this.f14050d.size() <= 0) {
            return AbstractC3628n.e(null);
        }
        if (!UserManagerCompat.isUserUnlocked(this.f14048b)) {
            return AbstractC3628n.e(null);
        }
        return AbstractC3628n.c(this.f14051e, new Callable() { // from class: a1.e
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Void k8;
                k8 = C1656f.this.k();
                return k8;
            }
        });
    }

    C1656f(InterfaceC2009b interfaceC2009b, Set set, Executor executor, InterfaceC2009b interfaceC2009b2, Context context) {
        this.f14047a = interfaceC2009b;
        this.f14050d = set;
        this.f14051e = executor;
        this.f14049c = interfaceC2009b2;
        this.f14048b = context;
    }
}
