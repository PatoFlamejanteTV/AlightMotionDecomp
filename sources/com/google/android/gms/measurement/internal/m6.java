package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.internal.measurement.AbstractC2240r4;
import com.google.android.gms.internal.measurement.C2171j2;
import com.google.android.gms.internal.measurement.C2189l2;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class m6 {

    /* renamed from: a, reason: collision with root package name */
    private C2171j2 f17952a;

    /* renamed from: b, reason: collision with root package name */
    private Long f17953b;

    /* renamed from: c, reason: collision with root package name */
    private long f17954c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ h6 f17955d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final C2171j2 a(String str, C2171j2 c2171j2) {
        boolean z8;
        Object obj;
        String U8 = c2171j2.U();
        List V8 = c2171j2.V();
        this.f17955d.l();
        Long l8 = (Long) Z5.f0(c2171j2, "_eid");
        if (l8 != null) {
            z8 = true;
        } else {
            z8 = false;
        }
        if (z8 && U8.equals("_ep")) {
            AbstractC1396p.l(l8);
            this.f17955d.l();
            U8 = (String) Z5.f0(c2171j2, "_en");
            if (TextUtils.isEmpty(U8)) {
                this.f17955d.a().I().b("Extra parameter without an event name. eventId", l8);
                return null;
            }
            if (this.f17952a == null || this.f17953b == null || l8.longValue() != this.f17953b.longValue()) {
                Pair H8 = this.f17955d.n().H(str, l8);
                if (H8 != null && (obj = H8.first) != null) {
                    this.f17952a = (C2171j2) obj;
                    this.f17954c = ((Long) H8.second).longValue();
                    this.f17955d.l();
                    this.f17953b = (Long) Z5.f0(this.f17952a, "_eid");
                } else {
                    this.f17955d.a().I().c("Extra parameter without existing main event. eventName, eventId", U8, l8);
                    return null;
                }
            }
            long j8 = this.f17954c - 1;
            this.f17954c = j8;
            if (j8 <= 0) {
                C2377k n8 = this.f17955d.n();
                n8.k();
                n8.a().K().b("Clearing complex main event info. appId", str);
                try {
                    n8.B().execSQL("delete from main_event_params where app_id=?", new String[]{str});
                } catch (SQLiteException e8) {
                    n8.a().G().b("Error clearing complex main event", e8);
                }
            } else {
                this.f17955d.n().n0(str, l8, this.f17954c, this.f17952a);
            }
            ArrayList arrayList = new ArrayList();
            for (C2189l2 c2189l2 : this.f17952a.V()) {
                this.f17955d.l();
                if (Z5.F(c2171j2, c2189l2.W()) == null) {
                    arrayList.add(c2189l2);
                }
            }
            if (!arrayList.isEmpty()) {
                arrayList.addAll(V8);
                V8 = arrayList;
            } else {
                this.f17955d.a().I().b("No unique parameters in main event. eventName", U8);
            }
        } else if (z8) {
            this.f17953b = l8;
            this.f17952a = c2171j2;
            this.f17955d.l();
            long longValue = ((Long) Z5.J(c2171j2, "_epc", 0L)).longValue();
            this.f17954c = longValue;
            if (longValue <= 0) {
                this.f17955d.a().I().b("Complex event with zero extra param count. eventName", U8);
            } else {
                this.f17955d.n().n0(str, (Long) AbstractC1396p.l(l8), this.f17954c, c2171j2);
            }
        }
        return (C2171j2) ((AbstractC2240r4) ((C2171j2.a) c2171j2.x()).B(U8).G().A(V8).m());
    }

    private m6(h6 h6Var) {
        this.f17955d = h6Var;
    }
}
