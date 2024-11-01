package Q6;

import U6.C1449e;
import U6.C1452h;
import U6.InterfaceC1451g;
import U6.L;
import U6.Z;
import androidx.browser.trusted.sharing.ShareTarget;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.mbsignalcommon.commonwebview.ToolBar;
import j$.util.DesugarCollections;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    static final c[] f8851a;

    /* renamed from: b, reason: collision with root package name */
    static final Map f8852b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f8853a;

        /* renamed from: b, reason: collision with root package name */
        private final InterfaceC1451g f8854b;

        /* renamed from: c, reason: collision with root package name */
        private final int f8855c;

        /* renamed from: d, reason: collision with root package name */
        private int f8856d;

        /* renamed from: e, reason: collision with root package name */
        c[] f8857e;

        /* renamed from: f, reason: collision with root package name */
        int f8858f;

        /* renamed from: g, reason: collision with root package name */
        int f8859g;

        /* renamed from: h, reason: collision with root package name */
        int f8860h;

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(int i8, Z z8) {
            this(i8, i8, z8);
        }

        private void a() {
            int i8 = this.f8856d;
            int i9 = this.f8860h;
            if (i8 < i9) {
                if (i8 == 0) {
                    b();
                } else {
                    d(i9 - i8);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f8857e, (Object) null);
            this.f8858f = this.f8857e.length - 1;
            this.f8859g = 0;
            this.f8860h = 0;
        }

        private int c(int i8) {
            return this.f8858f + 1 + i8;
        }

        private int d(int i8) {
            int i9;
            int i10 = 0;
            if (i8 > 0) {
                int length = this.f8857e.length;
                while (true) {
                    length--;
                    i9 = this.f8858f;
                    if (length < i9 || i8 <= 0) {
                        break;
                    }
                    int i11 = this.f8857e[length].f8850c;
                    i8 -= i11;
                    this.f8860h -= i11;
                    this.f8859g--;
                    i10++;
                }
                c[] cVarArr = this.f8857e;
                System.arraycopy(cVarArr, i9 + 1, cVarArr, i9 + 1 + i10, this.f8859g);
                this.f8858f += i10;
            }
            return i10;
        }

        private C1452h f(int i8) {
            if (h(i8)) {
                return d.f8851a[i8].f8848a;
            }
            int c8 = c(i8 - d.f8851a.length);
            if (c8 >= 0) {
                c[] cVarArr = this.f8857e;
                if (c8 < cVarArr.length) {
                    return cVarArr[c8].f8848a;
                }
            }
            throw new IOException("Header index too large " + (i8 + 1));
        }

        private void g(int i8, c cVar) {
            this.f8853a.add(cVar);
            int i9 = cVar.f8850c;
            if (i8 != -1) {
                i9 -= this.f8857e[c(i8)].f8850c;
            }
            int i10 = this.f8856d;
            if (i9 > i10) {
                b();
                return;
            }
            int d8 = d((this.f8860h + i9) - i10);
            if (i8 == -1) {
                int i11 = this.f8859g + 1;
                c[] cVarArr = this.f8857e;
                if (i11 > cVarArr.length) {
                    c[] cVarArr2 = new c[cVarArr.length * 2];
                    System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                    this.f8858f = this.f8857e.length - 1;
                    this.f8857e = cVarArr2;
                }
                int i12 = this.f8858f;
                this.f8858f = i12 - 1;
                this.f8857e[i12] = cVar;
                this.f8859g++;
            } else {
                this.f8857e[i8 + c(i8) + d8] = cVar;
            }
            this.f8860h += i9;
        }

        private boolean h(int i8) {
            if (i8 >= 0 && i8 <= d.f8851a.length - 1) {
                return true;
            }
            return false;
        }

        private int i() {
            return this.f8854b.readByte() & 255;
        }

        private void l(int i8) {
            if (h(i8)) {
                this.f8853a.add(d.f8851a[i8]);
                return;
            }
            int c8 = c(i8 - d.f8851a.length);
            if (c8 >= 0) {
                c[] cVarArr = this.f8857e;
                if (c8 < cVarArr.length) {
                    this.f8853a.add(cVarArr[c8]);
                    return;
                }
            }
            throw new IOException("Header index too large " + (i8 + 1));
        }

        private void n(int i8) {
            g(-1, new c(f(i8), j()));
        }

        private void o() {
            g(-1, new c(d.a(j()), j()));
        }

        private void p(int i8) {
            this.f8853a.add(new c(f(i8), j()));
        }

        private void q() {
            this.f8853a.add(new c(d.a(j()), j()));
        }

        public List e() {
            ArrayList arrayList = new ArrayList(this.f8853a);
            this.f8853a.clear();
            return arrayList;
        }

        C1452h j() {
            boolean z8;
            int i8 = i();
            if ((i8 & 128) == 128) {
                z8 = true;
            } else {
                z8 = false;
            }
            int m8 = m(i8, ModuleDescriptor.MODULE_VERSION);
            if (z8) {
                return C1452h.C(k.f().c(this.f8854b.readByteArray(m8)));
            }
            return this.f8854b.readByteString(m8);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void k() {
            while (!this.f8854b.exhausted()) {
                byte readByte = this.f8854b.readByte();
                int i8 = readByte & 255;
                if (i8 != 128) {
                    if ((readByte & 128) == 128) {
                        l(m(i8, ModuleDescriptor.MODULE_VERSION) - 1);
                    } else if (i8 == 64) {
                        o();
                    } else if ((readByte & 64) == 64) {
                        n(m(i8, 63) - 1);
                    } else if ((readByte & 32) == 32) {
                        int m8 = m(i8, 31);
                        this.f8856d = m8;
                        if (m8 >= 0 && m8 <= this.f8855c) {
                            a();
                        } else {
                            throw new IOException("Invalid dynamic table size update " + this.f8856d);
                        }
                    } else if (i8 != 16 && i8 != 0) {
                        p(m(i8, 15) - 1);
                    } else {
                        q();
                    }
                } else {
                    throw new IOException("index == 0");
                }
            }
        }

        int m(int i8, int i9) {
            int i10 = i8 & i9;
            if (i10 < i9) {
                return i10;
            }
            int i11 = 0;
            while (true) {
                int i12 = i();
                if ((i12 & 128) != 0) {
                    i9 += (i12 & ModuleDescriptor.MODULE_VERSION) << i11;
                    i11 += 7;
                } else {
                    return i9 + (i12 << i11);
                }
            }
        }

        a(int i8, int i9, Z z8) {
            this.f8853a = new ArrayList();
            this.f8857e = new c[8];
            this.f8858f = r0.length - 1;
            this.f8859g = 0;
            this.f8860h = 0;
            this.f8855c = i8;
            this.f8856d = i9;
            this.f8854b = L.d(z8);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final C1449e f8861a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f8862b;

        /* renamed from: c, reason: collision with root package name */
        private int f8863c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f8864d;

        /* renamed from: e, reason: collision with root package name */
        int f8865e;

        /* renamed from: f, reason: collision with root package name */
        int f8866f;

        /* renamed from: g, reason: collision with root package name */
        c[] f8867g;

        /* renamed from: h, reason: collision with root package name */
        int f8868h;

        /* renamed from: i, reason: collision with root package name */
        int f8869i;

        /* renamed from: j, reason: collision with root package name */
        int f8870j;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(C1449e c1449e) {
            this(4096, true, c1449e);
        }

        private void a() {
            int i8 = this.f8866f;
            int i9 = this.f8870j;
            if (i8 < i9) {
                if (i8 == 0) {
                    b();
                } else {
                    c(i9 - i8);
                }
            }
        }

        private void b() {
            Arrays.fill(this.f8867g, (Object) null);
            this.f8868h = this.f8867g.length - 1;
            this.f8869i = 0;
            this.f8870j = 0;
        }

        private int c(int i8) {
            int i9;
            int i10 = 0;
            if (i8 > 0) {
                int length = this.f8867g.length;
                while (true) {
                    length--;
                    i9 = this.f8868h;
                    if (length < i9 || i8 <= 0) {
                        break;
                    }
                    int i11 = this.f8867g[length].f8850c;
                    i8 -= i11;
                    this.f8870j -= i11;
                    this.f8869i--;
                    i10++;
                }
                c[] cVarArr = this.f8867g;
                System.arraycopy(cVarArr, i9 + 1, cVarArr, i9 + 1 + i10, this.f8869i);
                c[] cVarArr2 = this.f8867g;
                int i12 = this.f8868h;
                Arrays.fill(cVarArr2, i12 + 1, i12 + 1 + i10, (Object) null);
                this.f8868h += i10;
            }
            return i10;
        }

        private void d(c cVar) {
            int i8 = cVar.f8850c;
            int i9 = this.f8866f;
            if (i8 > i9) {
                b();
                return;
            }
            c((this.f8870j + i8) - i9);
            int i10 = this.f8869i + 1;
            c[] cVarArr = this.f8867g;
            if (i10 > cVarArr.length) {
                c[] cVarArr2 = new c[cVarArr.length * 2];
                System.arraycopy(cVarArr, 0, cVarArr2, cVarArr.length, cVarArr.length);
                this.f8868h = this.f8867g.length - 1;
                this.f8867g = cVarArr2;
            }
            int i11 = this.f8868h;
            this.f8868h = i11 - 1;
            this.f8867g[i11] = cVar;
            this.f8869i++;
            this.f8870j += i8;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void e(int i8) {
            this.f8865e = i8;
            int min = Math.min(i8, 16384);
            int i9 = this.f8866f;
            if (i9 == min) {
                return;
            }
            if (min < i9) {
                this.f8863c = Math.min(this.f8863c, min);
            }
            this.f8864d = true;
            this.f8866f = min;
            a();
        }

        void f(C1452h c1452h) {
            if (this.f8862b && k.f().e(c1452h) < c1452h.J()) {
                C1449e c1449e = new C1449e();
                k.f().d(c1452h, c1449e);
                C1452h t8 = c1449e.t();
                h(t8.J(), ModuleDescriptor.MODULE_VERSION, 128);
                this.f8861a.I(t8);
                return;
            }
            h(c1452h.J(), ModuleDescriptor.MODULE_VERSION, 0);
            this.f8861a.I(c1452h);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0070  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void g(java.util.List r14) {
            /*
                Method dump skipped, instructions count: 236
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: Q6.d.b.g(java.util.List):void");
        }

        void h(int i8, int i9, int i10) {
            if (i8 < i9) {
                this.f8861a.writeByte(i8 | i10);
                return;
            }
            this.f8861a.writeByte(i10 | i9);
            int i11 = i8 - i9;
            while (i11 >= 128) {
                this.f8861a.writeByte(128 | (i11 & ModuleDescriptor.MODULE_VERSION));
                i11 >>>= 7;
            }
            this.f8861a.writeByte(i11);
        }

        b(int i8, boolean z8, C1449e c1449e) {
            this.f8863c = Integer.MAX_VALUE;
            this.f8867g = new c[8];
            this.f8868h = r0.length - 1;
            this.f8869i = 0;
            this.f8870j = 0;
            this.f8865e = i8;
            this.f8866f = i8;
            this.f8862b = z8;
            this.f8861a = c1449e;
        }
    }

    static {
        c cVar = new c(c.f8847i, "");
        C1452h c1452h = c.f8844f;
        c cVar2 = new c(c1452h, ShareTarget.METHOD_GET);
        c cVar3 = new c(c1452h, ShareTarget.METHOD_POST);
        C1452h c1452h2 = c.f8845g;
        c cVar4 = new c(c1452h2, "/");
        c cVar5 = new c(c1452h2, "/index.html");
        C1452h c1452h3 = c.f8846h;
        c cVar6 = new c(c1452h3, "http");
        c cVar7 = new c(c1452h3, "https");
        C1452h c1452h4 = c.f8843e;
        f8851a = new c[]{cVar, cVar2, cVar3, cVar4, cVar5, cVar6, cVar7, new c(c1452h4, "200"), new c(c1452h4, "204"), new c(c1452h4, "206"), new c(c1452h4, "304"), new c(c1452h4, "400"), new c(c1452h4, "404"), new c(c1452h4, "500"), new c("accept-charset", ""), new c("accept-encoding", "gzip, deflate"), new c("accept-language", ""), new c("accept-ranges", ""), new c("accept", ""), new c("access-control-allow-origin", ""), new c("age", ""), new c("allow", ""), new c("authorization", ""), new c("cache-control", ""), new c("content-disposition", ""), new c("content-encoding", ""), new c("content-language", ""), new c("content-length", ""), new c("content-location", ""), new c("content-range", ""), new c("content-type", ""), new c("cookie", ""), new c("date", ""), new c(DownloadModel.ETAG, ""), new c("expect", ""), new c("expires", ""), new c(TypedValues.TransitionType.S_FROM, ""), new c("host", ""), new c("if-match", ""), new c("if-modified-since", ""), new c("if-none-match", ""), new c("if-range", ""), new c("if-unmodified-since", ""), new c("last-modified", ""), new c("link", ""), new c("location", ""), new c("max-forwards", ""), new c("proxy-authenticate", ""), new c("proxy-authorization", ""), new c("range", ""), new c("referer", ""), new c(ToolBar.REFRESH, ""), new c("retry-after", ""), new c("server", ""), new c("set-cookie", ""), new c("strict-transport-security", ""), new c("transfer-encoding", ""), new c("user-agent", ""), new c("vary", ""), new c("via", ""), new c("www-authenticate", "")};
        f8852b = b();
    }

    static C1452h a(C1452h c1452h) {
        int J8 = c1452h.J();
        for (int i8 = 0; i8 < J8; i8++) {
            byte h8 = c1452h.h(i8);
            if (h8 >= 65 && h8 <= 90) {
                throw new IOException("PROTOCOL_ERROR response malformed: mixed case name: " + c1452h.P());
            }
        }
        return c1452h;
    }

    private static Map b() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(f8851a.length);
        int i8 = 0;
        while (true) {
            c[] cVarArr = f8851a;
            if (i8 < cVarArr.length) {
                if (!linkedHashMap.containsKey(cVarArr[i8].f8848a)) {
                    linkedHashMap.put(cVarArr[i8].f8848a, Integer.valueOf(i8));
                }
                i8++;
            } else {
                return DesugarCollections.unmodifiableMap(linkedHashMap);
            }
        }
    }
}
