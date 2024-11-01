package com.google.android.gms.auth.api.signin;

import K.o;
import Q.AbstractC1382b;
import Q.AbstractC1396p;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.tasks.Task;
import q0.AbstractC3628n;

/* loaded from: classes3.dex */
public abstract class a {
    public static b a(Context context, GoogleSignInOptions googleSignInOptions) {
        return new b(context, (GoogleSignInOptions) AbstractC1396p.l(googleSignInOptions));
    }

    public static Task b(Intent intent) {
        J.b d8 = o.d(intent);
        GoogleSignInAccount a9 = d8.a();
        if (d8.getStatus().I() && a9 != null) {
            return AbstractC3628n.e(a9);
        }
        return AbstractC3628n.d(AbstractC1382b.a(d8.getStatus()));
    }
}
