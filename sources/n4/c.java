package N4;

import O4.i;
import Q5.I;
import Q5.t;
import S4.f;
import S4.u;
import U5.d;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.documentfile.provider.DocumentFile;
import c6.InterfaceC2072n;
import java.io.File;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3292y;
import l6.n;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.J0;
import n6.M;
import n6.N;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final DocumentFile f6797a;

    /* renamed from: b, reason: collision with root package name */
    private final File f6798b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f6799c;

    /* renamed from: d, reason: collision with root package name */
    private final i f6800d;

    /* loaded from: classes5.dex */
    static final class a extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6801a;

        a(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f6801a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                c cVar = c.this;
                this.f6801a = 1;
                if (cVar.f(this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f6803a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f6805a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f6806b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f6807c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, ArrayList arrayList, d dVar) {
                super(2, dVar);
                this.f6806b = cVar;
                this.f6807c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f6806b, this.f6807c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f6805a == 0) {
                    t.b(obj);
                    this.f6806b.f6800d.a(this.f6807c);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: N4.c$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0130b extends l implements InterfaceC2072n {

            /* renamed from: a, reason: collision with root package name */
            int f6808a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f6809b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f6810c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0130b(c cVar, ArrayList arrayList, d dVar) {
                super(2, dVar);
                this.f6809b = cVar;
                this.f6810c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C0130b(this.f6809b, this.f6810c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                V5.b.e();
                if (this.f6808a == 0) {
                    t.b(obj);
                    this.f6809b.f6800d.b(this.f6810c);
                    return I.f8786a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // c6.InterfaceC2072n
            public final Object invoke(M m8, d dVar) {
                return ((C0130b) create(m8, dVar)).invokeSuspend(I.f8786a);
            }
        }

        b(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f6803a;
            try {
                if (i8 != 0) {
                    if (i8 == 1 || i8 == 2) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    int i9 = 0;
                    if (c.this.f6797a != null) {
                        DocumentFile[] listFiles = c.this.f6797a.listFiles();
                        AbstractC3292y.h(listFiles, "currentDirectory.listFiles()");
                        ArrayList arrayList = new ArrayList();
                        int length = listFiles.length;
                        while (i9 < length) {
                            DocumentFile documentFile = listFiles[i9];
                            if (documentFile.getName() != null) {
                                arrayList.add(documentFile);
                                String path = documentFile.getUri().getPath();
                                if (path != null) {
                                    c cVar = c.this;
                                    String name = documentFile.getName();
                                    AbstractC3292y.f(name);
                                    cVar.g(path, name);
                                }
                            }
                            i9++;
                        }
                        J0 c8 = C3445b0.c();
                        a aVar = new a(c.this, arrayList, null);
                        this.f6803a = 1;
                        if (AbstractC3458i.g(c8, aVar, this) == e8) {
                            return e8;
                        }
                    } else if (c.this.f6798b != null) {
                        File[] listFiles2 = c.this.f6798b.listFiles();
                        ArrayList arrayList2 = new ArrayList();
                        if (listFiles2 != null) {
                            int length2 = listFiles2.length;
                            while (i9 < length2) {
                                File file = listFiles2[i9];
                                arrayList2.add(file);
                                c cVar2 = c.this;
                                String path2 = file.getPath();
                                AbstractC3292y.h(path2, "file.path");
                                String name2 = file.getName();
                                AbstractC3292y.h(name2, "file.name");
                                cVar2.g(path2, name2);
                                i9++;
                            }
                        }
                        J0 c9 = C3445b0.c();
                        C0130b c0130b = new C0130b(c.this, arrayList2, null);
                        this.f6803a = 2;
                        if (AbstractC3458i.g(c9, c0130b, this) == e8) {
                            return e8;
                        }
                    }
                }
            } catch (Error e9) {
                e9.printStackTrace();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return I.f8786a;
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public c(DocumentFile documentFile, File file, Context context, i listener) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(listener, "listener");
        this.f6797a = documentFile;
        this.f6798b = file;
        this.f6799c = context;
        this.f6800d = listener;
        AbstractC3462k.d(N.a(C3445b0.b()), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(d dVar) {
        Object g8 = AbstractC3458i.g(C3445b0.b(), new b(null), dVar);
        if (g8 == V5.b.e()) {
            return g8;
        }
        return I.f8786a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(String str, String str2) {
        Drawable h8;
        if (n.r(str2, ".apk", false, 2, null)) {
            u uVar = u.f9499a;
            if (!uVar.a().containsKey(str2) && (h8 = new f().h(this.f6799c, str)) != null) {
                uVar.a().put(str2, h8);
            }
        }
    }
}
