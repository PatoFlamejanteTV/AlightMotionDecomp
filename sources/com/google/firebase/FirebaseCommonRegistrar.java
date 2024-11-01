package com.google.firebase;

import a1.C1656f;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentRegistrar;
import java.util.ArrayList;
import java.util.List;
import k1.AbstractC3228e;
import k1.C3226c;
import k1.h;

/* loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f(Context context) {
        int i8;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null && Build.VERSION.SDK_INT >= 24) {
            i8 = applicationInfo.minSdkVersion;
            return String.valueOf(i8);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String g(Context context) {
        int i8 = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (i8 >= 23 && context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (i8 >= 26 && context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "embedded";
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return i(installerPackageName);
        }
        return "";
    }

    private static String i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C3226c.c());
        arrayList.add(C1656f.g());
        arrayList.add(h.b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(h.b("fire-core", "21.0.0"));
        arrayList.add(h.b("device-name", i(Build.PRODUCT)));
        arrayList.add(h.b("device-model", i(Build.DEVICE)));
        arrayList.add(h.b("device-brand", i(Build.BRAND)));
        arrayList.add(h.c("android-target-sdk", new h.a() { // from class: A0.i
            @Override // k1.h.a
            public final String a(Object obj) {
                String e8;
                e8 = FirebaseCommonRegistrar.e((Context) obj);
                return e8;
            }
        }));
        arrayList.add(h.c("android-min-sdk", new h.a() { // from class: A0.j
            @Override // k1.h.a
            public final String a(Object obj) {
                String f8;
                f8 = FirebaseCommonRegistrar.f((Context) obj);
                return f8;
            }
        }));
        arrayList.add(h.c("android-platform", new h.a() { // from class: A0.k
            @Override // k1.h.a
            public final String a(Object obj) {
                String g8;
                g8 = FirebaseCommonRegistrar.g((Context) obj);
                return g8;
            }
        }));
        arrayList.add(h.c("android-installer", new h.a() { // from class: A0.l
            @Override // k1.h.a
            public final String a(Object obj) {
                String h8;
                h8 = FirebaseCommonRegistrar.h((Context) obj);
                return h8;
            }
        }));
        String a9 = AbstractC3228e.a();
        if (a9 != null) {
            arrayList.add(h.b("kotlin", a9));
        }
        return arrayList;
    }
}
