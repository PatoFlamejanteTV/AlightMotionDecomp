package com.google.android.gms.measurement.internal;

import Q.AbstractC1396p;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import com.google.android.gms.internal.measurement.AbstractC2240r4;
import com.google.android.gms.internal.measurement.C2171j2;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSchemeDataSource;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2412p {

    /* renamed from: a, reason: collision with root package name */
    private final String f17997a;

    /* renamed from: b, reason: collision with root package name */
    private long f17998b = -1;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C2377k f17999c;

    public C2412p(C2377k c2377k, String str) {
        this.f17999c = c2377k;
        AbstractC1396p.f(str);
        this.f17997a = str;
    }

    public final List a() {
        boolean z8;
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                Cursor query = this.f17999c.B().query("raw_events", new String[]{"rowid", "name", CampaignEx.JSON_KEY_TIMESTAMP, "metadata_fingerprint", DataSchemeDataSource.SCHEME_DATA, "realtime"}, "app_id = ? and rowid > ?", new String[]{this.f17997a, String.valueOf(this.f17998b)}, null, null, "rowid", "1000");
                if (!query.moveToFirst()) {
                    List emptyList = Collections.emptyList();
                    query.close();
                    return emptyList;
                }
                do {
                    long j8 = query.getLong(0);
                    long j9 = query.getLong(3);
                    if (query.getLong(5) == 1) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    byte[] blob = query.getBlob(4);
                    if (j8 > this.f17998b) {
                        this.f17998b = j8;
                    }
                    try {
                        C2171j2.a aVar = (C2171j2.a) Z5.G(C2171j2.S(), blob);
                        String string = query.getString(1);
                        if (string == null) {
                            string = "";
                        }
                        aVar.B(string).D(query.getLong(2));
                        arrayList.add(new C2398n(j8, j9, z8, (C2171j2) ((AbstractC2240r4) aVar.m())));
                    } catch (IOException e8) {
                        this.f17999c.a().G().c("Data loss. Failed to merge raw event. appId", C2401n2.s(this.f17997a), e8);
                    }
                } while (query.moveToNext());
                query.close();
            } catch (SQLiteException e9) {
                this.f17999c.a().G().c("Data loss. Error querying raw events batch. appId", C2401n2.s(this.f17997a), e9);
                if (0 != 0) {
                    cursor.close();
                }
            }
            return arrayList;
        } catch (Throwable th) {
            if (0 != 0) {
                cursor.close();
            }
            throw th;
        }
    }
}
