package l0;

import N.AbstractC1351n;
import Q.AbstractC1396p;
import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f34614a;

    /* renamed from: b, reason: collision with root package name */
    private final String f34615b;

    public n(Context context, String str) {
        AbstractC1396p.l(context);
        this.f34614a = context.getResources();
        if (!TextUtils.isEmpty(str)) {
            this.f34615b = str;
        } else {
            this.f34615b = a(context);
        }
    }

    public static String a(Context context) {
        try {
            return context.getResources().getResourcePackageName(AbstractC1351n.f6378a);
        } catch (Resources.NotFoundException unused) {
            return context.getPackageName();
        }
    }

    public final String b(String str) {
        int identifier = this.f34614a.getIdentifier(str, TypedValues.Custom.S_STRING, this.f34615b);
        if (identifier == 0) {
            return null;
        }
        try {
            return this.f34614a.getString(identifier);
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
