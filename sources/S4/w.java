package S4;

import J4.j;
import Q5.I;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.IPackageInstallObserver;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import c6.InterfaceC2072n;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.io.File;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3292y;
import n6.AbstractC3458i;
import n6.AbstractC3462k;
import n6.C3445b0;
import n6.M;
import n6.N;

/* loaded from: classes5.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private final Context f9501a;

    /* renamed from: b, reason: collision with root package name */
    private final O4.a f9502b;

    /* loaded from: classes5.dex */
    public final class a extends IPackageInstallObserver.Stub {
        public a() {
        }

        @Override // android.content.pm.IPackageInstallObserver
        public void packageInstalled(String packageName, int i8) {
            AbstractC3292y.i(packageName, "packageName");
            if (i8 == 1) {
                O4.a aVar = w.this.f9502b;
                if (aVar != null) {
                    aVar.b(packageName);
                }
                j.a aVar2 = J4.j.f4395g;
                if (aVar2.t() != null) {
                    Bundle bundle = new Bundle();
                    bundle.putString("packageName", packageName);
                    ResultReceiver t8 = aVar2.t();
                    if (t8 != null) {
                        t8.send(352, bundle);
                    }
                }
            }
            J4.j.f4395g.e();
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.coroutines.jvm.internal.l implements InterfaceC2072n {

        /* renamed from: a, reason: collision with root package name */
        int f9504a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f9506c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(File file, U5.d dVar) {
            super(2, dVar);
            this.f9506c = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new b(this.f9506c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = V5.b.e();
            int i8 = this.f9504a;
            if (i8 != 0) {
                if (i8 == 1) {
                    Q5.t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                Q5.t.b(obj);
                w wVar = w.this;
                File file = this.f9506c;
                this.f9504a = 1;
                if (wVar.h(file, this) == e8) {
                    return e8;
                }
            }
            return I.f8786a;
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
        int f9507a;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f9509c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file, U5.d dVar) {
            super(2, dVar);
            this.f9509c = file;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final U5.d create(Object obj, U5.d dVar) {
            return new c(this.f9509c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            I i8;
            V5.b.e();
            if (this.f9507a == 0) {
                Q5.t.b(obj);
                try {
                    if (new L4.a(w.this.f9501a).s()) {
                        w.this.g(this.f9509c);
                        i8 = I.f8786a;
                    } else {
                        O4.a aVar = w.this.f9502b;
                        if (aVar != null) {
                            aVar.f(this.f9509c.getPath());
                            i8 = I.f8786a;
                        } else {
                            i8 = null;
                        }
                    }
                    return i8;
                } catch (Exception e8) {
                    e8.printStackTrace();
                    return I.f8786a;
                }
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        @Override // c6.InterfaceC2072n
        public final Object invoke(M m8, U5.d dVar) {
            return ((c) create(m8, dVar)).invokeSuspend(I.f8786a);
        }
    }

    public w(Context context, O4.a aVar) {
        AbstractC3292y.i(context, "context");
        this.f9501a = context;
        this.f9502b = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(File file) {
        try {
            PackageManager pm = this.f9501a.getPackageManager();
            AbstractC3292y.h(pm, "pm");
            String absolutePath = file.getAbsolutePath();
            AbstractC3292y.h(absolutePath, "apkFile.absolutePath");
            PackageInfo c8 = r.c(pm, absolutePath, 128);
            if (c8 != null) {
                String str = c8.applicationInfo.packageName;
                long m8 = new f().m(c8);
                try {
                    PackageManager packageManager = this.f9501a.getPackageManager();
                    AbstractC3292y.h(packageManager, "context.packageManager");
                    if (new f().m(r.d(packageManager, str, 0)) > m8) {
                        O4.a aVar = this.f9502b;
                        if (aVar != null) {
                            String name = file.getName();
                            AbstractC3292y.h(name, "apkFile.name");
                            aVar.e(name);
                        }
                        j.a aVar2 = J4.j.f4395g;
                        if (aVar2.t() != null) {
                            Bundle bundle = new Bundle();
                            bundle.putString("packageName", str);
                            bundle.putLong("versionCode", m8);
                            ResultReceiver t8 = aVar2.t();
                            if (t8 != null) {
                                t8.send(353, bundle);
                                return;
                            }
                            return;
                        }
                        return;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
                O4.a aVar3 = this.f9502b;
                if (aVar3 != null) {
                    String name2 = file.getName();
                    AbstractC3292y.h(name2, "apkFile.name");
                    aVar3.a(name2);
                }
                j.a aVar4 = J4.j.f4395g;
                if (aVar4.t() != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("packageName", str);
                    bundle2.putLong("versionCode", m8);
                    ResultReceiver t9 = aVar4.t();
                    if (t9 != null) {
                        t9.send(351, bundle2);
                    }
                }
                f fVar = new f();
                String absolutePath2 = file.getAbsolutePath();
                AbstractC3292y.h(absolutePath2, "apkFile.absolutePath");
                String b9 = fVar.b(c8, absolutePath2, pm);
                long m9 = new f().m(c8);
                e eVar = new e();
                String absolutePath3 = file.getAbsolutePath();
                AbstractC3292y.h(absolutePath3, "apkFile.absolutePath");
                long f8 = eVar.f(absolutePath3);
                String str2 = c8.packageName;
                AbstractC3292y.h(str2, "piToInstall.packageName");
                aVar4.w(str2, m9, b9, f8);
                pm.getClass().getMethod("installPackage", (Class[]) Arrays.copyOf(new Class[]{Uri.class, IPackageInstallObserver.class, Integer.TYPE, String.class}, 4)).invoke(pm, Uri.fromFile(file), new a(), 2, null);
                return;
            }
            O4.a aVar5 = this.f9502b;
            if (aVar5 != null) {
                String name3 = file.getName();
                AbstractC3292y.h(name3, "apkFile.name");
                aVar5.d(name3);
            }
            j.a aVar6 = J4.j.f4395g;
            if (aVar6.t() != null) {
                Bundle bundle3 = new Bundle();
                bundle3.putString("fileName", file.getName());
                ResultReceiver t10 = aVar6.t();
                if (t10 != null) {
                    t10.send(353, bundle3);
                }
            }
        } catch (Error e8) {
            j.a aVar7 = J4.j.f4395g;
            aVar7.e();
            O4.a aVar8 = this.f9502b;
            if (aVar8 != null) {
                String name4 = file.getName();
                AbstractC3292y.h(name4, "apkFile.name");
                aVar8.c(name4, e8.getMessage());
            }
            if (aVar7.t() != null) {
                Bundle bundle4 = new Bundle();
                bundle4.putString("fileName", file.getName());
                ResultReceiver t11 = aVar7.t();
                if (t11 != null) {
                    t11.send(353, bundle4);
                }
            }
        } catch (Exception e9) {
            j.a aVar9 = J4.j.f4395g;
            aVar9.e();
            O4.a aVar10 = this.f9502b;
            if (aVar10 != null) {
                String name5 = file.getName();
                AbstractC3292y.h(name5, "apkFile.name");
                aVar10.c(name5, e9.getMessage());
            }
            if (aVar9.t() != null) {
                Bundle bundle5 = new Bundle();
                bundle5.putString("fileName", file.getName());
                ResultReceiver t12 = aVar9.t();
                if (t12 != null) {
                    t12.send(353, bundle5);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object h(File file, U5.d dVar) {
        return AbstractC3458i.g(C3445b0.b(), new c(file, null), dVar);
    }

    public final boolean e() {
        PackageManager pm = this.f9501a.getPackageManager();
        int checkPermission = pm.checkPermission("android.permission.INSTALL_PACKAGES", this.f9501a.getPackageName());
        int checkPermission2 = pm.checkPermission("android.permission.DELETE_PACKAGES", this.f9501a.getPackageName());
        if (checkPermission == 0 && checkPermission2 == 0) {
            return true;
        }
        try {
            AbstractC3292y.h(pm, "pm");
            String packageName = this.f9501a.getPackageName();
            AbstractC3292y.h(packageName, "context.packageName");
            return i(r.d(pm, packageName, 4096));
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public final void f(File file) {
        AbstractC3292y.i(file, "file");
        AbstractC3462k.d(N.a(C3445b0.b()), null, null, new b(file, null), 3, null);
    }

    public final boolean i(PackageInfo packageInfo) {
        ApplicationInfo applicationInfo;
        if (packageInfo != null) {
            applicationInfo = packageInfo.applicationInfo;
        } else {
            applicationInfo = null;
        }
        if (applicationInfo != null && (packageInfo.applicationInfo.flags & TsExtractor.TS_STREAM_TYPE_AC3) != 0) {
            return true;
        }
        return false;
    }
}
