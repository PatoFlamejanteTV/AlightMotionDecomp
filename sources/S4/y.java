package S4;

import Q5.I;
import android.content.Context;
import android.net.Uri;
import androidx.documentfile.provider.DocumentFile;
import c6.InterfaceC2072n;
import java.io.File;
import java.util.ArrayList;
import java.util.zip.ZipOutputStream;
import kotlin.jvm.internal.AbstractC3292y;
import kotlin.jvm.internal.Q;
import kotlin.jvm.internal.S;
import n6.AbstractC3458i;
import n6.C3445b0;
import n6.M;

/* loaded from: classes5.dex */
public final class y {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f9554a = new byte[4096];

    /* renamed from: b, reason: collision with root package name */
    private int f9555b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f9556a;

        /* renamed from: b, reason: collision with root package name */
        int f9557b;

        /* renamed from: c, reason: collision with root package name */
        int f9558c;

        /* renamed from: d, reason: collision with root package name */
        int f9559d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ DocumentFile f9560e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ZipOutputStream f9561f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ Context f9562g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ y f9563h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(DocumentFile documentFile, ZipOutputStream zipOutputStream, Context context, y yVar, U5.d dVar) {
            super(2, dVar);
            this.f9560e = documentFile;
            this.f9561f = zipOutputStream;
            this.f9562g = context;
            this.f9563h = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new a(this.f9560e, this.f9561f, this.f9562g, this.f9563h, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0095  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x00ae -> B:5:0x00b1). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r8.f9559d
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                int r1 = r8.f9558c
                int r3 = r8.f9557b
                java.lang.Object r4 = r8.f9556a
                androidx.documentfile.provider.DocumentFile[] r4 = (androidx.documentfile.provider.DocumentFile[]) r4
                Q5.t.b(r9)
                goto Lb1
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                Q5.t.b(r9)
                androidx.documentfile.provider.DocumentFile r9 = r8.f9560e
                boolean r9 = r9.isFile()
                r1 = 0
                if (r9 == 0) goto L7c
                java.util.zip.ZipEntry r9 = new java.util.zip.ZipEntry
                androidx.documentfile.provider.DocumentFile r0 = r8.f9560e
                java.lang.String r0 = r0.getName()
                r9.<init>(r0)
                java.util.zip.ZipOutputStream r0 = r8.f9561f
                r0.putNextEntry(r9)
                android.content.Context r9 = r8.f9562g
                android.content.ContentResolver r9 = r9.getContentResolver()
                r0 = 0
                if (r9 == 0) goto L50
                androidx.documentfile.provider.DocumentFile r2 = r8.f9560e
                android.net.Uri r2 = r2.getUri()
                java.io.InputStream r9 = r9.openInputStream(r2)
                goto L51
            L50:
                r9 = r0
            L51:
                S4.y r2 = r8.f9563h
                java.util.zip.ZipOutputStream r3 = r8.f9561f
                if (r9 == 0) goto L6b
            L57:
                byte[] r4 = S4.y.c(r2)     // Catch: java.lang.Throwable -> L69
                int r4 = r9.read(r4)     // Catch: java.lang.Throwable -> L69
                if (r4 <= 0) goto L6b
                byte[] r5 = S4.y.c(r2)     // Catch: java.lang.Throwable -> L69
                r3.write(r5, r1, r4)     // Catch: java.lang.Throwable -> L69
                goto L57
            L69:
                r0 = move-exception
                goto L76
            L6b:
                Q5.I r1 = Q5.I.f8786a     // Catch: java.lang.Throwable -> L69
                a6.AbstractC1677b.a(r9, r0)
                java.util.zip.ZipOutputStream r9 = r8.f9561f
                r9.closeEntry()
                goto Lb3
            L76:
                throw r0     // Catch: java.lang.Throwable -> L77
            L77:
                r1 = move-exception
                a6.AbstractC1677b.a(r9, r0)
                throw r1
            L7c:
                androidx.documentfile.provider.DocumentFile r9 = r8.f9560e
                boolean r9 = r9.isDirectory()
                if (r9 == 0) goto Lb3
                androidx.documentfile.provider.DocumentFile r9 = r8.f9560e
                androidx.documentfile.provider.DocumentFile[] r9 = r9.listFiles()
                java.lang.String r3 = "sourceFile.listFiles()"
                kotlin.jvm.internal.AbstractC3292y.h(r9, r3)
                int r3 = r9.length
                r4 = r9
                r1 = r3
                r3 = 0
            L93:
                if (r3 >= r1) goto Lb3
                r9 = r4[r3]
                S4.y r5 = r8.f9563h
                java.lang.String r6 = "entry"
                kotlin.jvm.internal.AbstractC3292y.h(r9, r6)
                java.util.zip.ZipOutputStream r6 = r8.f9561f
                android.content.Context r7 = r8.f9562g
                r8.f9556a = r4
                r8.f9557b = r3
                r8.f9558c = r1
                r8.f9559d = r2
                java.lang.Object r9 = S4.y.a(r5, r9, r6, r7, r8)
                if (r9 != r0) goto Lb1
                return r0
            Lb1:
                int r3 = r3 + r2
                goto L93
            Lb3:
                Q5.I r9 = Q5.I.f8786a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: S4.y.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f9564a;

        /* renamed from: b, reason: collision with root package name */
        int f9565b;

        /* renamed from: c, reason: collision with root package name */
        int f9566c;

        /* renamed from: d, reason: collision with root package name */
        int f9567d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ File f9568e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ String f9569f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ZipOutputStream f9570g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ y f9571h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, String str, ZipOutputStream zipOutputStream, y yVar, U5.d dVar) {
            super(2, dVar);
            this.f9568e = file;
            this.f9569f = str;
            this.f9570g = zipOutputStream;
            this.f9571h = yVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f9568e, this.f9569f, this.f9570g, this.f9571h, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x007f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x00b0 -> B:5:0x00b3). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = V5.b.e()
                int r1 = r8.f9567d
                r2 = 1
                if (r1 == 0) goto L20
                if (r1 != r2) goto L18
                int r1 = r8.f9566c
                int r3 = r8.f9565b
                java.lang.Object r4 = r8.f9564a
                java.io.File[] r4 = (java.io.File[]) r4
                Q5.t.b(r9)
                goto Lb3
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                Q5.t.b(r9)
                java.io.File r9 = r8.f9568e
                boolean r9 = r9.isFile()
                r1 = 0
                if (r9 == 0) goto L69
                java.util.zip.ZipEntry r9 = new java.util.zip.ZipEntry
                java.lang.String r0 = r8.f9569f
                r9.<init>(r0)
                java.util.zip.ZipOutputStream r0 = r8.f9570g
                r0.putNextEntry(r9)
                java.io.FileInputStream r9 = new java.io.FileInputStream
                java.io.File r0 = r8.f9568e
                r9.<init>(r0)
                S4.y r0 = r8.f9571h
                java.util.zip.ZipOutputStream r2 = r8.f9570g
            L43:
                byte[] r3 = S4.y.c(r0)     // Catch: java.lang.Throwable -> L55
                int r3 = r9.read(r3)     // Catch: java.lang.Throwable -> L55
                if (r3 <= 0) goto L57
                byte[] r4 = S4.y.c(r0)     // Catch: java.lang.Throwable -> L55
                r2.write(r4, r1, r3)     // Catch: java.lang.Throwable -> L55
                goto L43
            L55:
                r0 = move-exception
                goto L63
            L57:
                Q5.I r0 = Q5.I.f8786a     // Catch: java.lang.Throwable -> L55
                r0 = 0
                a6.AbstractC1677b.a(r9, r0)
                java.util.zip.ZipOutputStream r9 = r8.f9570g
                r9.closeEntry()
                goto Lb5
            L63:
                throw r0     // Catch: java.lang.Throwable -> L64
            L64:
                r1 = move-exception
                a6.AbstractC1677b.a(r9, r0)
                throw r1
            L69:
                java.io.File r9 = r8.f9568e
                boolean r9 = r9.isDirectory()
                if (r9 == 0) goto Lb5
                java.io.File r9 = r8.f9568e
                java.io.File[] r9 = r9.listFiles()
                if (r9 == 0) goto Lb5
                int r3 = r9.length
                r4 = r9
                r1 = r3
                r3 = 0
            L7d:
                if (r3 >= r1) goto Lb5
                r9 = r4[r3]
                S4.y r5 = r8.f9571h
                java.lang.String r6 = "entry"
                kotlin.jvm.internal.AbstractC3292y.h(r9, r6)
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                java.lang.String r7 = r8.f9569f
                r6.append(r7)
                r7 = 47
                r6.append(r7)
                java.lang.String r7 = r9.getName()
                r6.append(r7)
                java.lang.String r6 = r6.toString()
                java.util.zip.ZipOutputStream r7 = r8.f9570g
                r8.f9564a = r4
                r8.f9565b = r3
                r8.f9566c = r1
                r8.f9567d = r2
                java.lang.Object r9 = S4.y.b(r5, r9, r6, r7, r8)
                if (r9 != r0) goto Lb3
                return r0
            Lb3:
                int r3 = r3 + r2
                goto L7d
            Lb5:
                Q5.I r9 = Q5.I.f8786a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: S4.y.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    static final class c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f9572a;

        /* renamed from: b, reason: collision with root package name */
        Object f9573b;

        /* renamed from: c, reason: collision with root package name */
        Object f9574c;

        /* renamed from: d, reason: collision with root package name */
        int f9575d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ File f9576e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ArrayList f9577f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ y f9578g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ O4.c f9579h;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9580a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.c f9581b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f9582c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(O4.c cVar, ArrayList arrayList, U5.d dVar) {
                super(2, dVar);
                this.f9581b = cVar;
                this.f9582c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f9581b, this.f9582c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9580a == 0) {
                    Q5.t.b(obj);
                    this.f9581b.b(String.valueOf(this.f9582c.size()));
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9583a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.c f9584b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ y f9585c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ArrayList f9586d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f9587e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(O4.c cVar, y yVar, ArrayList arrayList, String str, U5.d dVar) {
                super(2, dVar);
                this.f9584b = cVar;
                this.f9585c = yVar;
                this.f9586d = arrayList;
                this.f9587e = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f9584b, this.f9585c, this.f9586d, this.f9587e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9583a == 0) {
                    Q5.t.b(obj);
                    this.f9584b.c((this.f9585c.f9555b * 100) / this.f9586d.size(), this.f9587e);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.y$c$c, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0205c extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9588a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.c f9589b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ File f9590c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0205c(O4.c cVar, File file, U5.d dVar) {
                super(2, dVar);
                this.f9589b = cVar;
                this.f9590c = file;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0205c(this.f9589b, this.f9590c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9588a == 0) {
                    Q5.t.b(obj);
                    O4.c cVar = this.f9589b;
                    String name = this.f9590c.getName();
                    AbstractC3292y.h(name, "destinationZip.name");
                    cVar.a(name);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0205c) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file, ArrayList arrayList, y yVar, O4.c cVar, U5.d dVar) {
            super(2, dVar);
            this.f9576e = file;
            this.f9577f = arrayList;
            this.f9578g = yVar;
            this.f9579h = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f9576e, this.f9577f, this.f9578g, this.f9579h, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0100 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0101  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x00fe -> B:14:0x0033). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 294
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: S4.y.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f9591a;

        /* renamed from: b, reason: collision with root package name */
        Object f9592b;

        /* renamed from: c, reason: collision with root package name */
        Object f9593c;

        /* renamed from: d, reason: collision with root package name */
        int f9594d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ Context f9595e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ DocumentFile f9596f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ ArrayList f9597g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ y f9598h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ O4.c f9599i;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9600a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.c f9601b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f9602c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(O4.c cVar, ArrayList arrayList, U5.d dVar) {
                super(2, dVar);
                this.f9601b = cVar;
                this.f9602c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f9601b, this.f9602c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9600a == 0) {
                    Q5.t.b(obj);
                    this.f9601b.b(String.valueOf(this.f9602c.size()));
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9603a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.c f9604b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(O4.c cVar, U5.d dVar) {
                super(2, dVar);
                this.f9604b = cVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f9604b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9603a == 0) {
                    Q5.t.b(obj);
                    this.f9604b.onError("FileNotFoundException");
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            int f9605a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.c f9606b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ y f9607c;

            /* renamed from: d, reason: collision with root package name */
            final /* synthetic */ ArrayList f9608d;

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ String f9609e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(O4.c cVar, y yVar, ArrayList arrayList, String str, U5.d dVar) {
                super(2, dVar);
                this.f9606b = cVar;
                this.f9607c = yVar;
                this.f9608d = arrayList;
                this.f9609e = str;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new c(this.f9606b, this.f9607c, this.f9608d, this.f9609e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9605a == 0) {
                    Q5.t.b(obj);
                    this.f9606b.c((this.f9607c.f9555b * 100) / this.f9608d.size(), this.f9609e);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: S4.y$d$d, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0206d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9610a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.c f9611b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ DocumentFile f9612c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0206d(O4.c cVar, DocumentFile documentFile, U5.d dVar) {
                super(2, dVar);
                this.f9611b = cVar;
                this.f9612c = documentFile;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new C0206d(this.f9611b, this.f9612c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9610a == 0) {
                    Q5.t.b(obj);
                    O4.c cVar = this.f9611b;
                    String name = this.f9612c.getName();
                    AbstractC3292y.f(name);
                    cVar.a(name);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((C0206d) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Context context, DocumentFile documentFile, ArrayList arrayList, y yVar, O4.c cVar, U5.d dVar) {
            super(2, dVar);
            this.f9595e = context;
            this.f9596f = documentFile;
            this.f9597g = arrayList;
            this.f9598h = yVar;
            this.f9599i = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f9595e, this.f9596f, this.f9597g, this.f9598h, this.f9599i, dVar);
        }

        /* JADX WARN: Can't wrap try/catch for region: R(9:1|(1:(1:(1:(1:(1:(3:8|9|10)(2:12|13))(4:14|15|16|(2:18|(1:20)(6:21|22|(1:24)|15|16|(6:25|(1:27)|28|(1:30)|9|10)(0)))(0)))(6:31|22|(0)|15|16|(0)(0)))(5:32|33|34|16|(0)(0)))(1:35))(2:44|(1:46))|36|37|(4:39|34|16|(0)(0))|33|34|16|(0)(0)) */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0081, code lost:            r2 = n6.C3445b0.c();        r9 = new S4.y.d.b(r19.f9599i, null);        r19.f9594d = 2;     */
        /* JADX WARN: Code restructure failed: missing block: B:42:0x0093, code lost:            if (n6.AbstractC3458i.g(r2, r9, r19) == r1) goto L26;     */
        /* JADX WARN: Code restructure failed: missing block: B:43:0x0095, code lost:            return r1;     */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0115 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0116  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0113 -> B:15:0x0036). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 317
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: S4.y.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f9613a;

        /* renamed from: b, reason: collision with root package name */
        Object f9614b;

        /* renamed from: c, reason: collision with root package name */
        Object f9615c;

        /* renamed from: d, reason: collision with root package name */
        Object f9616d;

        /* renamed from: e, reason: collision with root package name */
        Object f9617e;

        /* renamed from: f, reason: collision with root package name */
        Object f9618f;

        /* renamed from: g, reason: collision with root package name */
        long f9619g;

        /* renamed from: h, reason: collision with root package name */
        int f9620h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f9621i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ File f9622j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ y f9623k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ O4.e f9624l;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9625a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.e f9626b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(O4.e eVar, U5.d dVar) {
                super(2, dVar);
                this.f9626b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f9626b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9625a == 0) {
                    Q5.t.b(obj);
                    this.f9626b.c();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9627a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.e f9628b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f9629c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(O4.e eVar, S s8, U5.d dVar) {
                super(2, dVar);
                this.f9628b = eVar;
                this.f9629c = s8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f9628b, this.f9629c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9627a == 0) {
                    Q5.t.b(obj);
                    this.f9628b.d(this.f9629c.f34572a);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            int f9630a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.e f9631b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f9632c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(O4.e eVar, Q q8, U5.d dVar) {
                super(2, dVar);
                this.f9631b = eVar;
                this.f9632c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new c(this.f9631b, this.f9632c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9630a == 0) {
                    Q5.t.b(obj);
                    this.f9631b.b(this.f9632c.f34571a);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(String str, File file, y yVar, O4.e eVar, U5.d dVar) {
            super(2, dVar);
            this.f9621i = str;
            this.f9622j = file;
            this.f9623k = yVar;
            this.f9624l = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f9621i, this.f9622j, this.f9623k, this.f9624l, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00fc A[Catch: all -> 0x001e, IOException -> 0x018f, EOFException -> 0x0195, TryCatch #8 {all -> 0x001e, blocks: (B:8:0x0019, B:49:0x018f, B:47:0x0195, B:20:0x0146, B:21:0x00ee, B:23:0x00fc, B:25:0x010e, B:30:0x0157, B:31:0x015c, B:33:0x00b6, B:35:0x00ca, B:36:0x00d0, B:38:0x00d6, B:40:0x00dc, B:41:0x00df, B:42:0x0169, B:58:0x00af, B:65:0x008f), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0157 A[Catch: all -> 0x001e, IOException -> 0x018f, EOFException -> 0x0195, TryCatch #8 {all -> 0x001e, blocks: (B:8:0x0019, B:49:0x018f, B:47:0x0195, B:20:0x0146, B:21:0x00ee, B:23:0x00fc, B:25:0x010e, B:30:0x0157, B:31:0x015c, B:33:0x00b6, B:35:0x00ca, B:36:0x00d0, B:38:0x00d6, B:40:0x00dc, B:41:0x00df, B:42:0x0169, B:58:0x00af, B:65:0x008f), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00b6 A[Catch: all -> 0x001e, IOException -> 0x018f, EOFException -> 0x0195, TryCatch #8 {all -> 0x001e, blocks: (B:8:0x0019, B:49:0x018f, B:47:0x0195, B:20:0x0146, B:21:0x00ee, B:23:0x00fc, B:25:0x010e, B:30:0x0157, B:31:0x015c, B:33:0x00b6, B:35:0x00ca, B:36:0x00d0, B:38:0x00d6, B:40:0x00dc, B:41:0x00df, B:42:0x0169, B:58:0x00af, B:65:0x008f), top: B:2:0x000c }] */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0169 A[Catch: all -> 0x001e, IOException -> 0x018f, EOFException -> 0x0195, TRY_LEAVE, TryCatch #8 {all -> 0x001e, blocks: (B:8:0x0019, B:49:0x018f, B:47:0x0195, B:20:0x0146, B:21:0x00ee, B:23:0x00fc, B:25:0x010e, B:30:0x0157, B:31:0x015c, B:33:0x00b6, B:35:0x00ca, B:36:0x00d0, B:38:0x00d6, B:40:0x00dc, B:41:0x00df, B:42:0x0169, B:58:0x00af, B:65:0x008f), top: B:2:0x000c }] */
        /* JADX WARN: Type inference failed for: r2v0, types: [int] */
        /* JADX WARN: Type inference failed for: r2v1, types: [java.util.zip.ZipInputStream] */
        /* JADX WARN: Type inference failed for: r2v17 */
        /* JADX WARN: Type inference failed for: r2v18 */
        /* JADX WARN: Type inference failed for: r2v19 */
        /* JADX WARN: Type inference failed for: r2v2 */
        /* JADX WARN: Type inference failed for: r2v23 */
        /* JADX WARN: Type inference failed for: r2v24 */
        /* JADX WARN: Type inference failed for: r2v25 */
        /* JADX WARN: Type inference failed for: r2v3 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0136 -> B:19:0x013b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0145 -> B:20:0x0146). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00ca -> B:31:0x015c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00df -> B:21:0x00ee). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 418
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: S4.y.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f9633a;

        /* renamed from: b, reason: collision with root package name */
        Object f9634b;

        /* renamed from: c, reason: collision with root package name */
        Object f9635c;

        /* renamed from: d, reason: collision with root package name */
        Object f9636d;

        /* renamed from: e, reason: collision with root package name */
        Object f9637e;

        /* renamed from: f, reason: collision with root package name */
        Object f9638f;

        /* renamed from: g, reason: collision with root package name */
        Object f9639g;

        /* renamed from: h, reason: collision with root package name */
        int f9640h;

        /* renamed from: i, reason: collision with root package name */
        long f9641i;

        /* renamed from: j, reason: collision with root package name */
        int f9642j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ File f9643k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Uri f9644l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ Context f9645m;

        /* renamed from: n, reason: collision with root package name */
        final /* synthetic */ O4.e f9646n;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9647a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.e f9648b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(O4.e eVar, U5.d dVar) {
                super(2, dVar);
                this.f9648b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f9648b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9647a == 0) {
                    Q5.t.b(obj);
                    this.f9648b.c();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9649a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.e f9650b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(O4.e eVar, U5.d dVar) {
                super(2, dVar);
                this.f9650b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f9650b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9649a == 0) {
                    Q5.t.b(obj);
                    this.f9650b.a();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            int f9651a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.e f9652b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(O4.e eVar, U5.d dVar) {
                super(2, dVar);
                this.f9652b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new c(this.f9652b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9651a == 0) {
                    Q5.t.b(obj);
                    this.f9652b.a();
                    return I.f8786a;
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
            int f9653a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.e f9654b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f9655c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(O4.e eVar, S s8, U5.d dVar) {
                super(2, dVar);
                this.f9654b = eVar;
                this.f9655c = s8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new d(this.f9654b, this.f9655c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9653a == 0) {
                    Q5.t.b(obj);
                    this.f9654b.d(this.f9655c.f34572a);
                    return I.f8786a;
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
            int f9656a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.e f9657b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f9658c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(O4.e eVar, Q q8, U5.d dVar) {
                super(2, dVar);
                this.f9657b = eVar;
                this.f9658c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new e(this.f9657b, this.f9658c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9656a == 0) {
                    Q5.t.b(obj);
                    this.f9657b.b(this.f9658c.f34571a);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(File file, Uri uri, Context context, O4.e eVar, U5.d dVar) {
            super(2, dVar);
            this.f9643k = file;
            this.f9644l = uri;
            this.f9645m = context;
            this.f9646n = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f9643k, this.f9644l, this.f9645m, this.f9646n, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0201  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x025c  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x013b  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x01b6  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x01df  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0274  */
        /* JADX WARN: Type inference failed for: r3v14 */
        /* JADX WARN: Type inference failed for: r3v15, types: [androidx.documentfile.provider.DocumentFile] */
        /* JADX WARN: Type inference failed for: r3v34 */
        /* JADX WARN: Type inference failed for: r5v15 */
        /* JADX WARN: Type inference failed for: r5v19, types: [java.io.OutputStream, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r5v21, types: [java.io.OutputStream] */
        /* JADX WARN: Type inference failed for: r5v22 */
        /* JADX WARN: Type inference failed for: r5v23 */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0243 -> B:15:0x0245). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x024c -> B:16:0x024f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x01db -> B:27:0x0268). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:49:0x01df -> B:17:0x01f9). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                Method dump skipped, instructions count: 670
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: S4.y.f.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    static final class g extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f9659a;

        /* renamed from: b, reason: collision with root package name */
        Object f9660b;

        /* renamed from: c, reason: collision with root package name */
        Object f9661c;

        /* renamed from: d, reason: collision with root package name */
        Object f9662d;

        /* renamed from: e, reason: collision with root package name */
        Object f9663e;

        /* renamed from: f, reason: collision with root package name */
        Object f9664f;

        /* renamed from: g, reason: collision with root package name */
        long f9665g;

        /* renamed from: h, reason: collision with root package name */
        int f9666h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ String f9667i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Context f9668j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ DocumentFile f9669k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ y f9670l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ O4.e f9671m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9672a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.e f9673b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(O4.e eVar, U5.d dVar) {
                super(2, dVar);
                this.f9673b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f9673b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9672a == 0) {
                    Q5.t.b(obj);
                    this.f9673b.c();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9674a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.e f9675b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f9676c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(O4.e eVar, S s8, U5.d dVar) {
                super(2, dVar);
                this.f9675b = eVar;
                this.f9676c = s8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f9675b, this.f9676c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9674a == 0) {
                    Q5.t.b(obj);
                    this.f9675b.d(this.f9676c.f34572a);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            int f9677a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.e f9678b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f9679c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(O4.e eVar, Q q8, U5.d dVar) {
                super(2, dVar);
                this.f9678b = eVar;
                this.f9679c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new c(this.f9678b, this.f9679c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9677a == 0) {
                    Q5.t.b(obj);
                    this.f9678b.b(this.f9679c.f34571a);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, Context context, DocumentFile documentFile, y yVar, O4.e eVar, U5.d dVar) {
            super(2, dVar);
            this.f9667i = str;
            this.f9668j = context;
            this.f9669k = documentFile;
            this.f9670l = yVar;
            this.f9671m = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new g(this.f9667i, this.f9668j, this.f9669k, this.f9670l, this.f9671m, dVar);
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x00ea  */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x014a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x00fa -> B:13:0x0124). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0121 -> B:14:0x0125). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00b1 -> B:23:0x013d). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00c6 -> B:15:0x00dc). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r19) {
            /*
                Method dump skipped, instructions count: 370
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: S4.y.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((g) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* loaded from: classes5.dex */
    static final class h extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        Object f9680a;

        /* renamed from: b, reason: collision with root package name */
        Object f9681b;

        /* renamed from: c, reason: collision with root package name */
        Object f9682c;

        /* renamed from: d, reason: collision with root package name */
        Object f9683d;

        /* renamed from: e, reason: collision with root package name */
        Object f9684e;

        /* renamed from: f, reason: collision with root package name */
        Object f9685f;

        /* renamed from: g, reason: collision with root package name */
        Object f9686g;

        /* renamed from: h, reason: collision with root package name */
        long f9687h;

        /* renamed from: i, reason: collision with root package name */
        int f9688i;

        /* renamed from: j, reason: collision with root package name */
        final /* synthetic */ Context f9689j;

        /* renamed from: k, reason: collision with root package name */
        final /* synthetic */ DocumentFile f9690k;

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Uri f9691l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ O4.e f9692m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9693a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.e f9694b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(O4.e eVar, U5.d dVar) {
                super(2, dVar);
                this.f9694b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new a(this.f9694b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9693a == 0) {
                    Q5.t.b(obj);
                    this.f9694b.c();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f9695a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.e f9696b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(O4.e eVar, U5.d dVar) {
                super(2, dVar);
                this.f9696b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new b(this.f9696b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9695a == 0) {
                    Q5.t.b(obj);
                    this.f9696b.a();
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
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
            int f9697a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.e f9698b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(O4.e eVar, U5.d dVar) {
                super(2, dVar);
                this.f9698b = eVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new c(this.f9698b, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9697a == 0) {
                    Q5.t.b(obj);
                    this.f9698b.a();
                    return I.f8786a;
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
            int f9699a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.e f9700b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f9701c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            d(O4.e eVar, S s8, U5.d dVar) {
                super(2, dVar);
                this.f9700b = eVar;
                this.f9701c = s8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new d(this.f9700b, this.f9701c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9699a == 0) {
                    Q5.t.b(obj);
                    this.f9700b.d(this.f9701c.f34572a);
                    return I.f8786a;
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
            int f9702a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ O4.e f9703b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ Q f9704c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            e(O4.e eVar, Q q8, U5.d dVar) {
                super(2, dVar);
                this.f9703b = eVar;
                this.f9704c = q8;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final U5.d create(Object obj, U5.d dVar) {
                return new e(this.f9703b, this.f9704c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f9702a == 0) {
                    Q5.t.b(obj);
                    this.f9703b.b(this.f9704c.f34571a);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, U5.d dVar) {
                return ((e) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(Context context, DocumentFile documentFile, Uri uri, O4.e eVar, U5.d dVar) {
            super(2, dVar);
            this.f9689j = context;
            this.f9690k = documentFile;
            this.f9691l = uri;
            this.f9692m = eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new h(this.f9689j, this.f9690k, this.f9691l, this.f9692m, dVar);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:19:0x02b5  */
        /* JADX WARN: Removed duplicated region for block: B:26:0x0300  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0157  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0272  */
        /* JADX WARN: Removed duplicated region for block: B:82:0x029a  */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0319  */
        /* JADX WARN: Type inference failed for: r10v0 */
        /* JADX WARN: Type inference failed for: r10v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r15v17 */
        /* JADX WARN: Type inference failed for: r15v6 */
        /* JADX WARN: Type inference failed for: r15v8, types: [java.io.OutputStream, java.lang.Object] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x02f1 -> B:15:0x02f2). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x02f5 -> B:16:0x02f6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0296 -> B:27:0x030c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x029a -> B:17:0x02ad). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r26) {
            /*
                Method dump skipped, instructions count: 835
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: S4.y.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((h) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(DocumentFile documentFile, ZipOutputStream zipOutputStream, Context context, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new a(documentFile, zipOutputStream, context, this, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object g(File file, String str, ZipOutputStream zipOutputStream, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(file, str, zipOutputStream, this, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    public final Object h(ArrayList arrayList, DocumentFile documentFile, O4.c cVar, Context context, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new d(context, documentFile, arrayList, this, cVar, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    public final Object i(ArrayList arrayList, File file, O4.c cVar, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new c(file, arrayList, this, cVar, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    public final Object j(DocumentFile documentFile, Uri uri, O4.e eVar, Context context, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new h(context, documentFile, uri, eVar, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    public final Object k(DocumentFile documentFile, String str, O4.e eVar, Context context, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new g(str, context, documentFile, this, eVar, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    public final Object l(File file, Uri uri, O4.e eVar, Context context, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new f(file, uri, context, eVar, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    public final Object m(File file, String str, O4.e eVar, U5.d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new e(str, file, this, eVar, null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }
}
