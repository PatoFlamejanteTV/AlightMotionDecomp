package S4;

import Q5.I;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInstaller;
import android.os.Build;
import androidx.documentfile.provider.DocumentFile;
import c6.InterfaceC2072n;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.InterfaceC3487x;
import n6.M;
import n6.N;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: d, reason: collision with root package name */
    public static final a f9444d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    private static InterfaceC3487x f9445e;

    /* renamed from: f, reason: collision with root package name */
    private static InterfaceC3487x f9446f;

    /* renamed from: a, reason: collision with root package name */
    private final Context f9447a;

    /* renamed from: b, reason: collision with root package name */
    private final O4.h f9448b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f9449c;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final InterfaceC3487x a() {
            return h.f9445e;
        }

        public final InterfaceC3487x b() {
            return h.f9446f;
        }

        public final void c(InterfaceC3487x interfaceC3487x) {
            h.f9445e = interfaceC3487x;
        }

        public final void d(InterfaceC3487x interfaceC3487x) {
            h.f9446f = interfaceC3487x;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f9450a;

        /* renamed from: b, reason: collision with root package name */
        Object f9451b;

        /* renamed from: c, reason: collision with root package name */
        Object f9452c;

        /* renamed from: d, reason: collision with root package name */
        int f9453d;

        /* renamed from: e, reason: collision with root package name */
        int f9454e;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f9456g;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9457a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9458b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f9459c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h hVar, String str, U5.d dVar) {
                super(2, dVar);
                this.f9458b = hVar;
                this.f9459c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f9458b, this.f9459c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9457a == 0) {
                    Q5.t.b(obj);
                    O4.h r8 = this.f9458b.r();
                    if (r8 != null) {
                        r8.b(this.f9459c);
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.h$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0200b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9460a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ h f9461b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ String f9462c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0200b(h hVar, String str, U5.d dVar) {
                super(2, dVar);
                this.f9461b = hVar;
                this.f9462c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0200b(this.f9461b, this.f9462c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9460a == 0) {
                    Q5.t.b(obj);
                    O4.h r8 = this.f9461b.r();
                    if (r8 != null) {
                        r8.b(this.f9462c);
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0200b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ArrayList arrayList, U5.d dVar) {
            super(2, dVar);
            this.f9456g = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f9456g, dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x03bc, code lost:            if (r0 == null) goto L157;     */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x03be, code lost:            r0.close();     */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0403, code lost:            return Q5.I.f8786a;     */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x03fe, code lost:            if (r0 == null) goto L157;     */
        /* JADX WARN: Removed duplicated region for block: B:107:0x027a A[Catch: all -> 0x02b6, Exception -> 0x02bd, TRY_LEAVE, TryCatch #12 {Exception -> 0x02bd, all -> 0x02b6, blocks: (B:104:0x0268, B:105:0x0274, B:107:0x027a, B:117:0x02b2, B:135:0x02d1, B:136:0x02d4, B:138:0x02d5, B:141:0x02ed), top: B:103:0x0268 }] */
        /* JADX WARN: Removed duplicated region for block: B:140:0x02e9  */
        /* JADX WARN: Removed duplicated region for block: B:143:0x032d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:144:0x032e  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x02ec  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x037c  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x03f3 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:38:0x03f4  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x03b1 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:44:0x03b2  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0208 A[Catch: all -> 0x0152, Exception -> 0x0159, TryCatch #13 {Exception -> 0x0159, all -> 0x0152, blocks: (B:68:0x00d4, B:71:0x00e0, B:73:0x00ef, B:75:0x010d, B:76:0x01fc, B:78:0x0208, B:80:0x020c, B:82:0x0214, B:83:0x0222, B:85:0x022a, B:86:0x022d, B:88:0x0233, B:90:0x0238, B:94:0x023f, B:97:0x0258, B:101:0x025b, B:151:0x0160, B:152:0x0166, B:154:0x016c, B:157:0x0174, B:160:0x0191, B:163:0x019c, B:164:0x01da, B:166:0x01e0, B:168:0x01f2), top: B:67:0x00d4 }] */
        /* JADX WARN: Removed duplicated region for block: B:82:0x0214 A[Catch: all -> 0x0152, Exception -> 0x0159, TryCatch #13 {Exception -> 0x0159, all -> 0x0152, blocks: (B:68:0x00d4, B:71:0x00e0, B:73:0x00ef, B:75:0x010d, B:76:0x01fc, B:78:0x0208, B:80:0x020c, B:82:0x0214, B:83:0x0222, B:85:0x022a, B:86:0x022d, B:88:0x0233, B:90:0x0238, B:94:0x023f, B:97:0x0258, B:101:0x025b, B:151:0x0160, B:152:0x0166, B:154:0x016c, B:157:0x0174, B:160:0x0191, B:163:0x019c, B:164:0x01da, B:166:0x01e0, B:168:0x01f2), top: B:67:0x00d4 }] */
        /* JADX WARN: Removed duplicated region for block: B:85:0x022a A[Catch: all -> 0x0152, Exception -> 0x0159, TryCatch #13 {Exception -> 0x0159, all -> 0x0152, blocks: (B:68:0x00d4, B:71:0x00e0, B:73:0x00ef, B:75:0x010d, B:76:0x01fc, B:78:0x0208, B:80:0x020c, B:82:0x0214, B:83:0x0222, B:85:0x022a, B:86:0x022d, B:88:0x0233, B:90:0x0238, B:94:0x023f, B:97:0x0258, B:101:0x025b, B:151:0x0160, B:152:0x0166, B:154:0x016c, B:157:0x0174, B:160:0x0191, B:163:0x019c, B:164:0x01da, B:166:0x01e0, B:168:0x01f2), top: B:67:0x00d4 }] */
        /* JADX WARN: Removed duplicated region for block: B:88:0x0233 A[Catch: all -> 0x0152, Exception -> 0x0159, TryCatch #13 {Exception -> 0x0159, all -> 0x0152, blocks: (B:68:0x00d4, B:71:0x00e0, B:73:0x00ef, B:75:0x010d, B:76:0x01fc, B:78:0x0208, B:80:0x020c, B:82:0x0214, B:83:0x0222, B:85:0x022a, B:86:0x022d, B:88:0x0233, B:90:0x0238, B:94:0x023f, B:97:0x0258, B:101:0x025b, B:151:0x0160, B:152:0x0166, B:154:0x016c, B:157:0x0174, B:160:0x0191, B:163:0x019c, B:164:0x01da, B:166:0x01e0, B:168:0x01f2), top: B:67:0x00d4 }] */
        /* JADX WARN: Removed duplicated region for block: B:90:0x0238 A[Catch: all -> 0x0152, Exception -> 0x0159, TRY_LEAVE, TryCatch #13 {Exception -> 0x0159, all -> 0x0152, blocks: (B:68:0x00d4, B:71:0x00e0, B:73:0x00ef, B:75:0x010d, B:76:0x01fc, B:78:0x0208, B:80:0x020c, B:82:0x0214, B:83:0x0222, B:85:0x022a, B:86:0x022d, B:88:0x0233, B:90:0x0238, B:94:0x023f, B:97:0x0258, B:101:0x025b, B:151:0x0160, B:152:0x0166, B:154:0x016c, B:157:0x0174, B:160:0x0191, B:163:0x019c, B:164:0x01da, B:166:0x01e0, B:168:0x01f2), top: B:67:0x00d4 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 1038
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: S4.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f9463a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ArrayList f9465c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(ArrayList arrayList, U5.d dVar) {
            super(2, dVar);
            this.f9465c = arrayList;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f9465c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f9463a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                h hVar = h.this;
                ArrayList arrayList = this.f9465c;
                this.f9463a = 1;
                if (hVar.w(arrayList, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public h(Context context, O4.h hVar) {
        AbstractC3292y.i(context, "context");
        this.f9447a = context;
        this.f9448b = hVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(PackageInstaller packageInstaller) {
        Iterator<PackageInstaller.SessionInfo> it = packageInstaller.getMySessions().iterator();
        while (it.hasNext()) {
            try {
                packageInstaller.abandonSession(it.next().getSessionId());
            } catch (Exception e8) {
                e8.printStackTrace();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n(int i8, PackageInstaller packageInstaller) {
        try {
            packageInstaller.abandonSession(i8);
        } catch (Exception e8) {
            e8.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String p(int i8, PackageInstaller.Session session, int i9) {
        if (i8 == 0) {
            String string = this.f9447a.getString(J4.h.f4329G, "102");
            AbstractC3292y.h(string, "context.getString(R.stri…RROR_CODE_CREATE_SESSION)");
            return string;
        }
        if (session == null) {
            String string2 = this.f9447a.getString(J4.h.f4329G, "103");
            AbstractC3292y.h(string2, "context.getString(R.stri….ERROR_CODE_OPEN_SESSION)");
            return string2;
        }
        if (i9 == 0) {
            String string3 = this.f9447a.getString(J4.h.f4340R);
            AbstractC3292y.h(string3, "context.getString(R.stri…n_status_failure_storage)");
            return string3;
        }
        if (i9 == 1) {
            String string4 = this.f9447a.getString(J4.h.f4329G, "105");
            AbstractC3292y.h(string4, "context.getString(R.stri….ERROR_CODE_FSYNC_FAILED)");
            return string4;
        }
        if (i9 == 2) {
            String string5 = this.f9447a.getString(J4.h.f4329G, "106");
            AbstractC3292y.h(string5, "context.getString(R.stri…ROR_CODE_CALLBACK_INTENT)");
            return string5;
        }
        if (i9 == 3) {
            String string6 = this.f9447a.getString(J4.h.f4329G, "107");
            AbstractC3292y.h(string6, "context.getString(R.stri…NDING_INTENT_GET_SERVICE)");
            return string6;
        }
        if (i9 == 4) {
            String string7 = this.f9447a.getString(J4.h.f4329G, "108");
            AbstractC3292y.h(string7, "context.getString(R.stri…RROR_CODE_SESSION_COMMIT)");
            return string7;
        }
        String string8 = this.f9447a.getString(J4.h.f4329G, "101");
        AbstractC3292y.h(string8, "context.getString(R.stri…re, Const.ERROR_CODE_101)");
        return string8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InputStream q(Object obj) {
        if (obj instanceof File) {
            return new FileInputStream((File) obj);
        }
        if (obj instanceof DocumentFile) {
            ContentResolver contentResolver = this.f9447a.getContentResolver();
            if (contentResolver != null) {
                return contentResolver.openInputStream(((DocumentFile) obj).getUri());
            }
            return null;
        }
        throw new Exception("getInputStream: Illegal parameter type");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final OutputStream s(PackageInstaller.Session session, Object obj) {
        String name;
        long length;
        if (obj instanceof File) {
            File file = (File) obj;
            name = file.getName();
            AbstractC3292y.h(name, "any.name");
            length = file.length();
        } else if (obj instanceof DocumentFile) {
            DocumentFile documentFile = (DocumentFile) obj;
            if (documentFile.getName() != null) {
                name = documentFile.getName();
                AbstractC3292y.f(name);
                length = documentFile.length();
            } else {
                throw new Exception("getOutputStream: DocumentFile name is null");
            }
        } else {
            throw new Exception("getOutputStream: Illegal parameter type");
        }
        OutputStream openWrite = session.openWrite(name, 0L, length);
        AbstractC3292y.h(openWrite, "session.openWrite(name, 0, length)");
        return openWrite;
    }

    public static /* synthetic */ void u(h hVar, File file, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        hVar.t(file, z8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w(ArrayList arrayList, U5.d dVar) {
        return AbstractC3458i.g(C3445b0.b(), new b(arrayList, null), dVar);
    }

    private final void x(ArrayList arrayList) {
        AbstractC3462k.d(N.a(C3445b0.b()), null, null, new c(arrayList, null), 3, null);
    }

    public final Context o() {
        return this.f9447a;
    }

    public final O4.h r() {
        return this.f9448b;
    }

    public final void t(File apk, boolean z8) {
        AbstractC3292y.i(apk, "apk");
        this.f9449c = z8;
        ArrayList arrayList = new ArrayList();
        arrayList.add(apk);
        x(arrayList);
    }

    public final void v(ArrayList apks, boolean z8) {
        AbstractC3292y.i(apks, "apks");
        this.f9449c = z8;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(apks);
        x(arrayList);
    }

    public final boolean y(int i8) {
        int i9 = Build.VERSION.SDK_INT;
        if (i9 < 31) {
            return false;
        }
        if (i9 == 31 && i8 >= 29) {
            return true;
        }
        if (i9 == 32 && i8 >= 29) {
            return true;
        }
        if (i9 == 33 && i8 >= 30) {
            return true;
        }
        if (i9 < 34 || i8 < 31) {
            return false;
        }
        return true;
    }
}
