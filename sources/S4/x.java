package S4;

import Q5.I;
import R5.AbstractC1435t;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import c6.InterfaceC2072n;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import kotlin.jvm.internal.AbstractC3284p;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.T;
import n6.AbstractC3458i;
import n6.C3445b0;
import n6.M;

/* loaded from: classes5.dex */
public final class x {

    /* renamed from: b, reason: collision with root package name */
    public static final a f9510b = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private boolean f9511a;

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public final boolean a(String filename) {
            AbstractC3292y.i(filename, "filename");
            if (!l6.n.r(filename, ".xapk", false, 2, null) && !l6.n.r(filename, ".apks", false, 2, null) && !l6.n.r(filename, ".apkm", false, 2, null)) {
                return false;
            }
            return true;
        }

        public /* synthetic */ a(AbstractC3284p abstractC3284p) {
            this();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f9512a;

        /* renamed from: b, reason: collision with root package name */
        int f9513b;

        /* renamed from: c, reason: collision with root package name */
        int f9514c;

        /* renamed from: d, reason: collision with root package name */
        int f9515d;

        /* renamed from: e, reason: collision with root package name */
        Object f9516e;

        /* renamed from: f, reason: collision with root package name */
        Object f9517f;

        /* renamed from: g, reason: collision with root package name */
        Object f9518g;

        /* renamed from: h, reason: collision with root package name */
        Object f9519h;

        /* renamed from: i, reason: collision with root package name */
        Object f9520i;

        /* renamed from: j, reason: collision with root package name */
        Object f9521j;

        /* renamed from: k, reason: collision with root package name */
        Object f9522k;

        /* renamed from: l, reason: collision with root package name */
        Object f9523l;

        /* renamed from: m, reason: collision with root package name */
        Object f9524m;

        /* renamed from: n, reason: collision with root package name */
        long f9525n;

        /* renamed from: o, reason: collision with root package name */
        int f9526o;

        /* renamed from: p, reason: collision with root package name */
        final /* synthetic */ File f9527p;

        /* renamed from: q, reason: collision with root package name */
        final /* synthetic */ x f9528q;

        /* renamed from: r, reason: collision with root package name */
        final /* synthetic */ File f9529r;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ O4.m f9530s;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9531a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.m f9532b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(O4.m mVar, U5.d dVar) {
                super(2, dVar);
                this.f9532b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f9532b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9531a == 0) {
                    Q5.t.b(obj);
                    O4.m mVar = this.f9532b;
                    if (mVar != null) {
                        mVar.i();
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
        /* renamed from: S4.x$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0204b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9533a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.m f9534b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0204b(O4.m mVar, U5.d dVar) {
                super(2, dVar);
                this.f9534b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0204b(this.f9534b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9533a == 0) {
                    Q5.t.b(obj);
                    O4.m mVar = this.f9534b;
                    if (mVar != null) {
                        mVar.g();
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0204b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9535a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.m f9536b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f9537c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(O4.m mVar, T t8, U5.d dVar) {
                super(2, dVar);
                this.f9536b = mVar;
                this.f9537c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new c(this.f9536b, this.f9537c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9535a == 0) {
                    Q5.t.b(obj);
                    O4.m mVar = this.f9536b;
                    if (mVar != null) {
                        mVar.e((File) this.f9537c.f34573a);
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9538a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.m f9539b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f9540c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(O4.m mVar, int i8, U5.d dVar) {
                super(2, dVar);
                this.f9539b = mVar;
                this.f9540c = i8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new d(this.f9539b, this.f9540c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9538a == 0) {
                    Q5.t.b(obj);
                    O4.m mVar = this.f9539b;
                    if (mVar != null) {
                        mVar.c(this.f9540c);
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9541a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.m f9542b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(O4.m mVar, U5.d dVar) {
                super(2, dVar);
                this.f9542b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new e(this.f9542b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9541a == 0) {
                    Q5.t.b(obj);
                    O4.m mVar = this.f9542b;
                    if (mVar != null) {
                        mVar.c(100);
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9543a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.m f9544b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ T f9545c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            f(O4.m mVar, T t8, U5.d dVar) {
                super(2, dVar);
                this.f9544b = mVar;
                this.f9545c = t8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new f(this.f9544b, this.f9545c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9543a == 0) {
                    Q5.t.b(obj);
                    O4.m mVar = this.f9544b;
                    if (mVar != null) {
                        mVar.d((File) this.f9545c.f34573a);
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9546a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.m f9547b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            g(O4.m mVar, U5.d dVar) {
                super(2, dVar);
                this.f9547b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new g(this.f9547b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9546a == 0) {
                    Q5.t.b(obj);
                    O4.m mVar = this.f9547b;
                    if (mVar != null) {
                        mVar.f();
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((g) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9548a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ File[] f9549b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ O4.m f9550c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ File f9551d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            h(File[] fileArr, O4.m mVar, File file, U5.d dVar) {
                super(2, dVar);
                this.f9549b = fileArr;
                this.f9550c = mVar;
                this.f9551d = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new h(this.f9549b, this.f9550c, this.f9551d, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9548a == 0) {
                    Q5.t.b(obj);
                    File[] fileArr = this.f9549b;
                    if (fileArr.length == 1) {
                        O4.m mVar = this.f9550c;
                        if (mVar == null) {
                            return null;
                        }
                        File file = fileArr[0];
                        AbstractC3292y.h(file, "tmp[0]");
                        mVar.b(file);
                        return I.f8786a;
                    }
                    ArrayList arrayList = new ArrayList();
                    File[] tmp = this.f9549b;
                    AbstractC3292y.h(tmp, "tmp");
                    AbstractC1435t.E(arrayList, tmp);
                    O4.m mVar2 = this.f9550c;
                    if (mVar2 == null) {
                        return null;
                    }
                    mVar2.a(this.f9551d, arrayList);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((h) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class i extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9552a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.m f9553b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            i(O4.m mVar, U5.d dVar) {
                super(2, dVar);
                this.f9553b = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new i(this.f9553b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9552a == 0) {
                    Q5.t.b(obj);
                    O4.m mVar = this.f9553b;
                    if (mVar != null) {
                        mVar.i();
                        return I.f8786a;
                    }
                    return null;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((i) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, x xVar, File file2, O4.m mVar, U5.d dVar) {
            super(2, dVar);
            this.f9527p = file;
            this.f9528q = xVar;
            this.f9529r = file2;
            this.f9530s = mVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f9527p, this.f9528q, this.f9529r, this.f9530s, dVar);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(12:75|76|77|78|79|80|81|(5:83|84|85|86|(2:88|(1:90)))(1:136)|91|20|21|(0)) */
        /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
        /* JADX WARN: Removed duplicated region for block: B:116:0x04cd  */
        /* JADX WARN: Removed duplicated region for block: B:128:0x04ee  */
        /* JADX WARN: Removed duplicated region for block: B:135:0x052a A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:136:0x03fb  */
        /* JADX WARN: Removed duplicated region for block: B:145:0x0350  */
        /* JADX WARN: Removed duplicated region for block: B:159:0x035d A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:23:0x013c A[Catch: Exception -> 0x0406, TryCatch #9 {Exception -> 0x0406, blocks: (B:23:0x013c, B:25:0x0144, B:27:0x014a, B:33:0x016c, B:35:0x017a, B:42:0x026c, B:163:0x01cc, B:207:0x012c), top: B:206:0x012c }] */
        /* JADX WARN: Removed duplicated region for block: B:49:0x02af  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0337 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0338  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x0348  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x03b7 A[Catch: Exception -> 0x03f9, TRY_LEAVE, TryCatch #6 {Exception -> 0x03f9, blocks: (B:70:0x036d, B:81:0x03af, B:83:0x03b7), top: B:69:0x036d }] */
        /* JADX WARN: Removed duplicated region for block: B:97:0x043f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:133:0x0350 -> B:41:0x02a4). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:161:0x0434 -> B:17:0x0437). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:82:0x0401 -> B:18:0x03f0). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) {
            /*
                Method dump skipped, instructions count: 1350
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: S4.x.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    private final boolean h(File file, File file2) {
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> entries = zipFile.entries();
            while (entries.hasMoreElements()) {
                ZipEntry nextElement = entries.nextElement();
                String entryName = nextElement.getName();
                AbstractC3292y.h(entryName, "entryName");
                if (l6.n.r(entryName, ".apk", false, 2, null)) {
                    if (nextElement.getSize() >= file2.getUsableSpace()) {
                        return false;
                    }
                    File file3 = new File(file2, entryName);
                    InputStream inputStream = zipFile.getInputStream(nextElement);
                    AbstractC3292y.h(inputStream, "zipFile.getInputStream(element)");
                    FileOutputStream fileOutputStream = new FileOutputStream(file3);
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int read = inputStream.read(bArr);
                                if (read == -1) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, read);
                            }
                            inputStream.close();
                        } catch (Exception e8) {
                            e8.printStackTrace();
                            inputStream.close();
                        }
                        fileOutputStream.close();
                    } finally {
                    }
                }
            }
            return true;
        } catch (Exception e9) {
            e9.printStackTrace();
            return false;
        }
    }

    public final void b() {
        this.f9511a = true;
    }

    public final boolean c(File file) {
        try {
            Enumeration<? extends ZipEntry> entries = new ZipFile(file).entries();
            while (entries.hasMoreElements()) {
                String entryName = entries.nextElement().getName();
                AbstractC3292y.h(entryName, "entryName");
                if (l6.n.r(entryName, ".obb", false, 2, null)) {
                    return true;
                }
            }
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        return false;
    }

    public final Drawable d(File xapkFile, Context context) {
        boolean z8;
        AbstractC3292y.i(xapkFile, "xapkFile");
        AbstractC3292y.i(context, "context");
        Drawable drawable = (Drawable) u.f9499a.a().get(xapkFile.getName());
        if (drawable == null) {
            File g8 = new f().g(context);
            String name = xapkFile.getName();
            AbstractC3292y.h(name, "xapkFile.name");
            String name2 = xapkFile.getName();
            AbstractC3292y.h(name2, "xapkFile.name");
            int i8 = 0;
            String substring = name.substring(0, l6.n.X(name2, ".", 0, false, 6, null));
            AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            File file = new File(g8, substring);
            if (!file.exists()) {
                file.mkdirs();
            }
            if (h(xapkFile, file)) {
                File[] listFiles = file.listFiles();
                if (listFiles != null) {
                    if (listFiles.length == 0) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    if (!z8) {
                        int length = listFiles.length;
                        while (i8 < length) {
                            File file2 = listFiles[i8];
                            f fVar = new f();
                            String absolutePath = file2.getAbsolutePath();
                            AbstractC3292y.h(absolutePath, "item.absolutePath");
                            Drawable h8 = fVar.h(context, absolutePath);
                            HashMap a9 = u.f9499a.a();
                            String name3 = xapkFile.getName();
                            AbstractC3292y.h(name3, "xapkFile.name");
                            a9.put(name3, h8);
                            try {
                                file2.delete();
                            } catch (Exception e8) {
                                e8.printStackTrace();
                            }
                            i8++;
                            drawable = h8;
                        }
                    }
                }
                if (file.exists()) {
                    new g().a(file);
                }
            }
        }
        return drawable;
    }

    public final P4.g e(File xapkFile, Context context) {
        boolean z8;
        AbstractC3292y.i(xapkFile, "xapkFile");
        AbstractC3292y.i(context, "context");
        File g8 = new f().g(context);
        String name = xapkFile.getName();
        AbstractC3292y.h(name, "xapkFile.name");
        String name2 = xapkFile.getName();
        AbstractC3292y.h(name2, "xapkFile.name");
        String substring = name.substring(0, l6.n.X(name2, ".", 0, false, 6, null));
        AbstractC3292y.h(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        File file = new File(g8, substring);
        if (!file.exists()) {
            file.mkdirs();
        }
        P4.g gVar = null;
        if (h(xapkFile, file)) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                if (listFiles.length == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    PackageManager pm = context.getPackageManager();
                    for (File file2 : listFiles) {
                        AbstractC3292y.h(pm, "pm");
                        String absolutePath = file2.getAbsolutePath();
                        AbstractC3292y.h(absolutePath, "item.absolutePath");
                        PackageInfo c8 = r.c(pm, absolutePath, 128);
                        if (c8 != null) {
                            try {
                                long m8 = new f().m(c8);
                                String str = c8.packageName;
                                AbstractC3292y.h(str, "pi.packageName");
                                P4.g gVar2 = new P4.g(str, m8);
                                try {
                                    u uVar = u.f9499a;
                                    if (((Drawable) uVar.a().get(xapkFile.getName())) == null) {
                                        f fVar = new f();
                                        String absolutePath2 = file2.getAbsolutePath();
                                        AbstractC3292y.h(absolutePath2, "item.absolutePath");
                                        Drawable h8 = fVar.h(context, absolutePath2);
                                        HashMap a9 = uVar.a();
                                        String name3 = xapkFile.getName();
                                        AbstractC3292y.h(name3, "xapkFile.name");
                                        a9.put(name3, h8);
                                    }
                                    gVar = gVar2;
                                } catch (Exception e8) {
                                    e = e8;
                                    gVar = gVar2;
                                    e.printStackTrace();
                                    file2.delete();
                                }
                            } catch (Exception e9) {
                                e = e9;
                            }
                        }
                        try {
                            file2.delete();
                        } catch (Exception e10) {
                            e10.printStackTrace();
                        }
                    }
                }
            }
            if (file.exists()) {
                new g().a(file);
            }
        }
        return gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0036 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(java.io.File r7) {
        /*
            r6 = this;
            r0 = 0
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.lang.Exception -> L2f
            r1.<init>(r7)     // Catch: java.lang.Exception -> L2f
            java.util.Enumeration r7 = r1.entries()     // Catch: java.lang.Exception -> L2f
            r1 = 0
        Lb:
            boolean r2 = r7.hasMoreElements()     // Catch: java.lang.Exception -> L2d
            if (r2 == 0) goto L34
            java.lang.Object r2 = r7.nextElement()     // Catch: java.lang.Exception -> L2d
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch: java.lang.Exception -> L2d
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Exception -> L2d
            java.lang.String r3 = "entryName"
            kotlin.jvm.internal.AbstractC3292y.h(r2, r3)     // Catch: java.lang.Exception -> L2d
            java.lang.String r3 = ".apk"
            r4 = 2
            r5 = 0
            boolean r2 = l6.n.r(r2, r3, r0, r4, r5)     // Catch: java.lang.Exception -> L2d
            if (r2 == 0) goto Lb
            int r1 = r1 + 1
            goto Lb
        L2d:
            r7 = move-exception
            goto L31
        L2f:
            r7 = move-exception
            r1 = 0
        L31:
            r7.printStackTrace()
        L34:
            if (r1 <= 0) goto L37
            r0 = 1
        L37:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: S4.x.f(java.io.File):boolean");
    }

    public final Object g(File file, File file2, O4.m mVar, U5.d dVar) {
        return AbstractC3458i.g(C3445b0.b(), new b(file, this, file2, mVar, null), dVar);
    }
}
