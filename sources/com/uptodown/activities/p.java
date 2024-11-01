package com.uptodown.activities;

import R5.AbstractC1435t;
import S4.x;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Environment;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelKt;
import c6.InterfaceC2072n;
import com.uptodown.workers.DownloadApkWorker;
import d5.ResultReceiverC2762e;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import q5.AbstractC3768A;
import q5.C3770C;
import q5.C3791p;
import q5.C3794s;
import q6.AbstractC3815N;
import q6.InterfaceC3813L;

/* loaded from: classes4.dex */
public final class p extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private final q6.w f30493a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC3813L f30494b;

    /* renamed from: c, reason: collision with root package name */
    private final q6.w f30495c;

    /* renamed from: d, reason: collision with root package name */
    private final q6.w f30496d;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final ArrayList f30497a;

        /* renamed from: b, reason: collision with root package name */
        private final ArrayList f30498b;

        public a(ArrayList downloads, ArrayList downloadsQueue) {
            AbstractC3292y.i(downloads, "downloads");
            AbstractC3292y.i(downloadsQueue, "downloadsQueue");
            this.f30497a = downloads;
            this.f30498b = downloadsQueue;
        }

        public final ArrayList a() {
            return this.f30497a;
        }

        public final ArrayList b() {
            return this.f30498b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return AbstractC3292y.d(this.f30497a, aVar.f30497a) && AbstractC3292y.d(this.f30498b, aVar.f30498b);
        }

        public int hashCode() {
            return (this.f30497a.hashCode() * 31) + this.f30498b.hashCode();
        }

        public String toString() {
            return "MyDownloadsData(downloads=" + this.f30497a + ", downloadsQueue=" + this.f30498b + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* loaded from: classes4.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f30499a = new b("NAME", 0);

        /* renamed from: b, reason: collision with root package name */
        public static final b f30500b = new b("DATE", 1);

        /* renamed from: c, reason: collision with root package name */
        public static final b f30501c = new b("SIZE", 2);

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ b[] f30502d;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ W5.a f30503e;

        static {
            b[] a9 = a();
            f30502d = a9;
            f30503e = W5.b.a(a9);
        }

        private b(String str, int i8) {
        }

        private static final /* synthetic */ b[] a() {
            return new b[]{f30499a, f30500b, f30501c};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f30502d.clone();
        }
    }

    /* loaded from: classes4.dex */
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f30504a;

        static {
            int[] iArr = new int[b.values().length];
            try {
                iArr[b.f30500b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.f30501c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.f30499a.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f30504a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class d extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30505a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ c5.r f30506b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f30507c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(c5.r rVar, Context context, U5.d dVar) {
            super(2, dVar);
            this.f30506b = rVar;
            this.f30507c = context;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new d(this.f30506b, this.f30507c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30505a == 0) {
                Q5.t.b(obj);
                DownloadApkWorker.a aVar = DownloadApkWorker.f31190k;
                if (aVar.d(this.f30506b.h(), this.f30506b.e0())) {
                    aVar.a(this.f30506b.h());
                }
                C3791p a9 = C3791p.f37286s.a(this.f30507c);
                a9.a();
                int z8 = a9.z(this.f30506b);
                a9.i();
                if (this.f30506b.f() != null) {
                    String f8 = this.f30506b.f();
                    AbstractC3292y.f(f8);
                    File file = new File(f8);
                    if (file.exists()) {
                        file.delete();
                    }
                } else if (this.f30506b.X() != null) {
                    File f9 = new C3794s().f(this.f30507c);
                    String X8 = this.f30506b.X();
                    AbstractC3292y.f(X8);
                    File file2 = new File(f9, X8);
                    if (file2.exists()) {
                        file2.delete();
                    }
                }
                boolean z9 = true;
                if (z8 == 1) {
                    ResultReceiverC2762e e8 = C3770C.f37260a.e();
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("download", this.f30506b);
                    Q5.I i8 = Q5.I.f8786a;
                    e8.send(ComposerKt.reuseKey, bundle);
                }
                if (z8 != 1) {
                    z9 = false;
                }
                return kotlin.coroutines.jvm.internal.b.a(z9);
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((d) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class e extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30508a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f30509b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ p f30510c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f30511d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ b f30512e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f30513f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(boolean z8, p pVar, Context context, b bVar, boolean z9, U5.d dVar) {
            super(2, dVar);
            this.f30509b = z8;
            this.f30510c = pVar;
            this.f30511d = context;
            this.f30512e = bVar;
            this.f30513f = z9;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new e(this.f30509b, this.f30510c, this.f30511d, this.f30512e, this.f30513f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            File file;
            V5.b.e();
            if (this.f30508a == 0) {
                Q5.t.b(obj);
                if (this.f30509b) {
                    this.f30510c.f30493a.setValue(AbstractC3768A.a.f37253a);
                }
                this.f30510c.g(this.f30511d);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
                File f8 = new C3794s().f(this.f30511d);
                C3791p a9 = C3791p.f37286s.a(this.f30511d);
                a9.a();
                Iterator it = a9.c0().iterator();
                AbstractC3292y.h(it, "iterator(...)");
                while (it.hasNext()) {
                    Object next = it.next();
                    AbstractC3292y.h(next, "next(...)");
                    c5.r rVar = (c5.r) next;
                    if (rVar.h0()) {
                        if (rVar.X() != null) {
                            String X8 = rVar.X();
                            AbstractC3292y.f(X8);
                            File file2 = new File(f8, X8);
                            if (file2.exists()) {
                                rVar.o0(file2.getAbsolutePath());
                            }
                        }
                        kotlin.coroutines.jvm.internal.b.a(arrayList.add(rVar));
                    } else {
                        if (rVar.X() != null) {
                            String X9 = rVar.X();
                            AbstractC3292y.f(X9);
                            file = new File(f8, X9);
                            if (!file.exists()) {
                                String X10 = rVar.X();
                                AbstractC3292y.f(X10);
                                file = new File(externalStoragePublicDirectory, X10);
                            }
                        } else {
                            file = null;
                        }
                        if (file != null) {
                            if (!file.exists()) {
                                kotlin.coroutines.jvm.internal.b.c(a9.z(rVar));
                            } else {
                                rVar.o0(file.getAbsolutePath());
                                rVar.I(this.f30511d, file);
                                kotlin.coroutines.jvm.internal.b.a(arrayList2.add(rVar));
                            }
                        } else {
                            kotlin.coroutines.jvm.internal.b.c(a9.z(rVar));
                        }
                    }
                }
                a9.i();
                this.f30510c.m(arrayList2, this.f30512e, this.f30513f);
                this.f30510c.f30496d.setValue(arrayList);
                this.f30510c.f30495c.setValue(arrayList2);
                this.f30510c.f30493a.setValue(new AbstractC3768A.c(new a(arrayList2, arrayList)));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((e) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static final class f extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f30514a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f30516c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f30517d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ boolean f30518e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, b bVar, boolean z8, U5.d dVar) {
            super(2, dVar);
            this.f30516c = str;
            this.f30517d = bVar;
            this.f30518e = z8;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new f(this.f30516c, this.f30517d, this.f30518e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            V5.b.e();
            if (this.f30514a == 0) {
                Q5.t.b(obj);
                p pVar = p.this;
                ArrayList l8 = pVar.l((ArrayList) pVar.f30495c.getValue(), this.f30516c);
                p.this.m(l8, this.f30517d, this.f30518e);
                p pVar2 = p.this;
                p.this.f30493a.setValue(new AbstractC3768A.c(new a(l8, pVar2.l((ArrayList) pVar2.f30496d.getValue(), this.f30516c))));
                return Q5.I.f8786a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(n6.M m8, U5.d dVar) {
            return ((f) create(m8, dVar)).invokeSuspend(Q5.I.f8786a);
        }
    }

    /* loaded from: classes4.dex */
    public static final class g implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            long lastModified;
            c5.r rVar = (c5.r) obj;
            long j8 = 0;
            if (rVar.f() == null) {
                lastModified = 0;
            } else {
                String f8 = rVar.f();
                AbstractC3292y.f(f8);
                lastModified = new File(f8).lastModified();
            }
            Long valueOf = Long.valueOf(lastModified);
            c5.r rVar2 = (c5.r) obj2;
            if (rVar2.f() != null) {
                String f9 = rVar2.f();
                AbstractC3292y.f(f9);
                j8 = new File(f9).lastModified();
            }
            return T5.a.a(valueOf, Long.valueOf(j8));
        }
    }

    /* loaded from: classes4.dex */
    public static final class h implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            long lastModified;
            c5.r rVar = (c5.r) obj2;
            long j8 = 0;
            if (rVar.f() == null) {
                lastModified = 0;
            } else {
                String f8 = rVar.f();
                AbstractC3292y.f(f8);
                lastModified = new File(f8).lastModified();
            }
            Long valueOf = Long.valueOf(lastModified);
            c5.r rVar2 = (c5.r) obj;
            if (rVar2.f() != null) {
                String f9 = rVar2.f();
                AbstractC3292y.f(f9);
                j8 = new File(f9).lastModified();
            }
            return T5.a.a(valueOf, Long.valueOf(j8));
        }
    }

    /* loaded from: classes4.dex */
    public static final class i implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return T5.a.a(((c5.r) obj).X(), ((c5.r) obj2).X());
        }
    }

    /* loaded from: classes4.dex */
    public static final class j implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return T5.a.a(((c5.r) obj2).X(), ((c5.r) obj).X());
        }
    }

    /* loaded from: classes4.dex */
    public static final class k implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return T5.a.a(Long.valueOf(((c5.r) obj).a0()), Long.valueOf(((c5.r) obj2).a0()));
        }
    }

    /* loaded from: classes4.dex */
    public static final class l implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return T5.a.a(Long.valueOf(((c5.r) obj2).a0()), Long.valueOf(((c5.r) obj).a0()));
        }
    }

    public p() {
        q6.w a9 = AbstractC3815N.a(AbstractC3768A.a.f37253a);
        this.f30493a = a9;
        this.f30494b = a9;
        this.f30495c = AbstractC3815N.a(new ArrayList());
        this.f30496d = AbstractC3815N.a(new ArrayList());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(Context context) {
        c5.r a9;
        PackageInfo packageInfo;
        ArrayList arrayList = new ArrayList();
        ArrayList a10 = new C3794s().a(context);
        ArrayList d8 = new C3794s().d(context);
        d8.addAll(a10);
        PackageManager packageManager = context.getPackageManager();
        Iterator it = d8.iterator();
        AbstractC3292y.h(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            AbstractC3292y.h(next, "next(...)");
            File file = (File) next;
            String name = file.getName();
            AbstractC3292y.h(name, "getName(...)");
            boolean z8 = false;
            if (l6.n.r(name, ".apk", false, 2, null)) {
                String absolutePath = file.getAbsolutePath();
                try {
                    AbstractC3292y.f(packageManager);
                    AbstractC3292y.f(absolutePath);
                    packageInfo = S4.r.c(packageManager, absolutePath, 128);
                } catch (Exception unused) {
                    packageInfo = null;
                }
                if (packageInfo != null) {
                    try {
                        Bundle bundle = packageInfo.applicationInfo.metaData;
                        if (bundle != null && bundle.containsKey("com.android.vending.splits.required")) {
                            z8 = packageInfo.applicationInfo.metaData.getBoolean("com.android.vending.splits.required");
                        }
                    } catch (Exception unused2) {
                    }
                    if (!z8) {
                        arrayList.add(file);
                    }
                } else {
                    File b9 = new C3794s().b(context, file);
                    if (b9 != null) {
                        arrayList.add(b9);
                    } else {
                        String name2 = file.getName();
                        AbstractC3292y.h(name2, "getName(...)");
                        if (!l6.n.B(name2, "split_config", false, 2, null)) {
                            arrayList.add(file);
                        }
                    }
                }
            } else {
                x.a aVar = S4.x.f9510b;
                String name3 = file.getName();
                AbstractC3292y.h(name3, "getName(...)");
                if (aVar.a(name3)) {
                    File b10 = new C3794s().b(context, file);
                    if (b10 != null) {
                        arrayList.add(b10);
                    } else {
                        arrayList.add(file);
                    }
                }
            }
        }
        C3791p a11 = C3791p.f37286s.a(context);
        a11.a();
        Iterator it2 = arrayList.iterator();
        AbstractC3292y.h(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next2 = it2.next();
            AbstractC3292y.h(next2, "next(...)");
            File file2 = (File) next2;
            String name4 = file2.getName();
            AbstractC3292y.h(name4, "getName(...)");
            if (a11.Y(name4) == null && (a9 = c5.r.f15919y.a(context, file2)) != null) {
                a11.D0(a9);
            }
        }
        a11.i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final ArrayList l(ArrayList arrayList, String str) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            c5.r rVar = (c5.r) obj;
            String X8 = rVar.X();
            String str2 = "";
            boolean z8 = true;
            if (X8 != null && X8.length() != 0) {
                String X9 = rVar.X();
                AbstractC3292y.f(X9);
                if (str != null) {
                    str2 = str;
                }
                z8 = l6.n.E(X9, str2, true);
            } else {
                String Y8 = rVar.Y();
                if (Y8 != null && Y8.length() != 0) {
                    String Y9 = rVar.Y();
                    AbstractC3292y.f(Y9);
                    if (str != null) {
                        str2 = str;
                    }
                    z8 = l6.n.E(Y9, str2, true);
                }
            }
            if (z8) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m(ArrayList arrayList, b bVar, boolean z8) {
        int i8 = c.f30504a[bVar.ordinal()];
        if (i8 != 1) {
            if (i8 != 2) {
                if (i8 == 3) {
                    o(arrayList, z8);
                    return;
                }
                throw new Q5.p();
            }
            p(arrayList, z8);
            return;
        }
        n(arrayList, z8);
    }

    private final void n(ArrayList arrayList, boolean z8) {
        if (z8) {
            if (arrayList.size() > 1) {
                AbstractC1435t.B(arrayList, new h());
            }
        } else if (arrayList.size() > 1) {
            AbstractC1435t.B(arrayList, new g());
        }
    }

    private final void o(ArrayList arrayList, boolean z8) {
        if (z8) {
            if (arrayList.size() > 1) {
                AbstractC1435t.B(arrayList, new j());
            }
        } else if (arrayList.size() > 1) {
            AbstractC1435t.B(arrayList, new i());
        }
    }

    private final void p(ArrayList arrayList, boolean z8) {
        if (z8) {
            if (arrayList.size() > 1) {
                AbstractC1435t.B(arrayList, new l());
            }
        } else if (arrayList.size() > 1) {
            AbstractC1435t.B(arrayList, new k());
        }
    }

    public final Object h(Context context, c5.r rVar, U5.d dVar) {
        return AbstractC3458i.g(C3445b0.b(), new d(rVar, context, null), dVar);
    }

    public final void i(Context context, b sortType, boolean z8, boolean z9) {
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(sortType, "sortType");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new e(z9, this, context, sortType, z8, null), 2, null);
    }

    public final void j(String str, b sortType, boolean z8) {
        AbstractC3292y.i(sortType, "sortType");
        AbstractC3462k.d(ViewModelKt.getViewModelScope(this), C3445b0.b(), null, new f(str, sortType, z8, null), 2, null);
    }

    public final InterfaceC3813L k() {
        return this.f30494b;
    }
}
