package j$.time.chrono;

import androidx.exifinterface.media.ExifInterface;
import j$.time.LocalDateTime;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.ServiceLoader;

/* renamed from: j$.time.chrono.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2983a implements m {

    /* renamed from: a, reason: collision with root package name */
    private static final ConcurrentHashMap f32833a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final ConcurrentHashMap f32834b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ int f32835c = 0;

    static {
        new Locale("ja", "JP", "JP");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m j(String str) {
        Objects.requireNonNull(str, "id");
        while (true) {
            ConcurrentHashMap concurrentHashMap = f32833a;
            m mVar = (m) concurrentHashMap.get(str);
            if (mVar == null) {
                mVar = (m) f32834b.get(str);
            }
            if (mVar != null) {
                return mVar;
            }
            if (concurrentHashMap.get(ExifInterface.TAG_RW2_ISO) != null) {
                Iterator it = ServiceLoader.load(m.class).iterator();
                while (it.hasNext()) {
                    m mVar2 = (m) it.next();
                    if (str.equals(mVar2.i()) || str.equals(mVar2.q())) {
                        return mVar2;
                    }
                }
                throw new RuntimeException("Unknown chronology: " + str);
            }
            p pVar = p.f32851o;
            l(pVar, pVar.i());
            w wVar = w.f32872d;
            wVar.getClass();
            l(wVar, "Japanese");
            B b9 = B.f32822d;
            b9.getClass();
            l(b9, "Minguo");
            H h8 = H.f32829d;
            h8.getClass();
            l(h8, "ThaiBuddhist");
            Iterator it2 = ServiceLoader.load(AbstractC2983a.class, null).iterator();
            while (it2.hasNext()) {
                AbstractC2983a abstractC2983a = (AbstractC2983a) it2.next();
                if (!abstractC2983a.i().equals(ExifInterface.TAG_RW2_ISO)) {
                    l(abstractC2983a, abstractC2983a.i());
                }
            }
            t tVar = t.f32869d;
            tVar.getClass();
            l(tVar, ExifInterface.TAG_RW2_ISO);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static m l(m mVar, String str) {
        String q8;
        m mVar2 = (m) f32833a.putIfAbsent(str, mVar);
        if (mVar2 == null && (q8 = mVar.q()) != null) {
            f32834b.putIfAbsent(q8, mVar);
        }
        return mVar2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return i().compareTo(((m) obj).i());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AbstractC2983a) && i().compareTo(((AbstractC2983a) obj).i()) == 0;
    }

    public final int hashCode() {
        return getClass().hashCode() ^ i().hashCode();
    }

    @Override // j$.time.chrono.m
    public InterfaceC2987e n(LocalDateTime localDateTime) {
        try {
            return k(localDateTime).t(j$.time.k.F(localDateTime));
        } catch (j$.time.c e8) {
            throw new RuntimeException("Unable to obtain ChronoLocalDateTime from TemporalAccessor: " + LocalDateTime.class, e8);
        }
    }

    public final String toString() {
        return i();
    }
}
