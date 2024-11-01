package Q;

import N.AbstractC1351n;
import android.content.Context;
import android.content.res.Resources;
import androidx.constraintlayout.core.motion.utils.TypedValues;

/* renamed from: Q.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C1398s {

    /* renamed from: a, reason: collision with root package name */
    private final Resources f8313a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8314b;

    public C1398s(Context context) {
        AbstractC1396p.l(context);
        Resources resources = context.getResources();
        this.f8313a = resources;
        this.f8314b = resources.getResourcePackageName(AbstractC1351n.f6378a);
    }

    public String a(String str) {
        int identifier = this.f8313a.getIdentifier(str, TypedValues.Custom.S_STRING, this.f8314b);
        if (identifier == 0) {
            return null;
        }
        return this.f8313a.getString(identifier);
    }
}
