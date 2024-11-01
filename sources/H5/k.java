package h5;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.InstallSourceInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.TsExtractor;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import kotlin.jvm.internal.AbstractC3292y;
import l6.AbstractC3335a;

/* loaded from: classes5.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final k f32654a = new k();

    public final String a(Context context, String packageName) {
        InstallSourceInfo installSourceInfo;
        String installingPackageName;
        AbstractC3292y.i(context, "context");
        AbstractC3292y.i(packageName, "packageName");
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                installSourceInfo = context.getPackageManager().getInstallSourceInfo(packageName);
                installingPackageName = installSourceInfo.getInstallingPackageName();
                return installingPackageName;
            }
            return context.getPackageManager().getInstallerPackageName(packageName);
        } catch (Exception e8) {
            e8.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x008a -> B:14:0x008b). Please report as a decompilation issue!!! */
    public final String b(PackageManager pm, String str) {
        String str2;
        SigningInfo signingInfo;
        boolean hasPastSigningCertificates;
        Signature[] apkContentsSigners;
        Signature[] signingCertificateHistory;
        boolean z8;
        Signature[] signingCertificateHistory2;
        AbstractC3292y.i(pm, "pm");
        try {
        } catch (Exception e8) {
            e8.printStackTrace();
        }
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC3292y.f(str);
            signingInfo = AbstractC2952c.a(pm, str, 134217728).signingInfo;
            hasPastSigningCertificates = signingInfo.hasPastSigningCertificates();
            if (hasPastSigningCertificates) {
                signingCertificateHistory = signingInfo.getSigningCertificateHistory();
                AbstractC3292y.h(signingCertificateHistory, "signingInfo.signingCertificateHistory");
                if (signingCertificateHistory.length == 0) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                if (!z8) {
                    C2951b c2951b = C2951b.f32648a;
                    signingCertificateHistory2 = signingInfo.getSigningCertificateHistory();
                    byte[] byteArray = signingCertificateHistory2[0].toByteArray();
                    AbstractC3292y.h(byteArray, "signingInfo.signingCerti…eHistory[0].toByteArray()");
                    str2 = c2951b.a(byteArray);
                }
            }
            apkContentsSigners = signingInfo.getApkContentsSigners();
            if (apkContentsSigners != null && apkContentsSigners.length != 0) {
                C2951b c2951b2 = C2951b.f32648a;
                byte[] byteArray2 = apkContentsSigners[0].toByteArray();
                AbstractC3292y.h(byteArray2, "signatures[0].toByteArray()");
                str2 = c2951b2.a(byteArray2);
            }
            str2 = null;
        } else {
            AbstractC3292y.f(str);
            Signature[] signatureArr = AbstractC2952c.a(pm, str, 64).signatures;
            if (signatureArr != null && signatureArr.length != 0) {
                C2951b c2951b3 = C2951b.f32648a;
                byte[] byteArray3 = signatureArr[0].toByteArray();
                AbstractC3292y.h(byteArray3, "signatures[0].toByteArray()");
                str2 = c2951b3.a(byteArray3);
            }
            str2 = null;
        }
        return str2;
    }

    public final String c(String text) {
        AbstractC3292y.i(text, "text");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            Charset forName = Charset.forName(C.UTF8_NAME);
            AbstractC3292y.h(forName, "forName(...)");
            byte[] bytes = text.getBytes(forName);
            AbstractC3292y.h(bytes, "getBytes(...)");
            byte[] bytes2 = messageDigest.digest(bytes);
            StringBuilder sb = new StringBuilder();
            AbstractC3292y.h(bytes2, "bytes");
            for (byte b9 : bytes2) {
                String num = Integer.toString((b9 & 255) + 256, AbstractC3335a.a(16));
                AbstractC3292y.h(num, "toString(...)");
                String substring = num.substring(1);
                AbstractC3292y.h(substring, "substring(...)");
                sb.append(substring);
            }
            String sb2 = sb.toString();
            AbstractC3292y.h(sb2, "sb.toString()");
            return sb2;
        } catch (Exception e8) {
            e8.printStackTrace();
            return "";
        }
    }

    public final long d(Context context) {
        AbstractC3292y.i(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            AbstractC3292y.h(packageManager, "context.packageManager");
            String packageName = context.getPackageName();
            AbstractC3292y.h(packageName, "context.packageName");
            return e(AbstractC2952c.a(packageManager, packageName, 0));
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return 0L;
        }
    }

    public final long e(PackageInfo pi) {
        long longVersionCode;
        AbstractC3292y.i(pi, "pi");
        if (Build.VERSION.SDK_INT >= 28) {
            longVersionCode = pi.getLongVersionCode();
            return longVersionCode;
        }
        return pi.versionCode;
    }

    public final String f(Context context) {
        AbstractC3292y.i(context, "context");
        try {
            PackageManager packageManager = context.getPackageManager();
            AbstractC3292y.h(packageManager, "context.packageManager");
            String packageName = context.getPackageName();
            AbstractC3292y.h(packageName, "context.packageName");
            return AbstractC2952c.a(packageManager, packageName, 0).versionName;
        } catch (PackageManager.NameNotFoundException e8) {
            e8.printStackTrace();
            return null;
        }
    }

    public final boolean g(PackageInfo packageInfo) {
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
