package com.google.android.gms.internal.measurement;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import java.util.Map;

/* loaded from: classes3.dex */
public final class M2 implements O2 {
    @Override // com.google.android.gms.internal.measurement.O2
    public final String a(ContentResolver contentResolver, String str) {
        Uri uri = G2.f16308a;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        try {
            if (acquireUnstableContentProviderClient != null) {
                try {
                    Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, new String[]{str}, null);
                    try {
                        if (query != null) {
                            if (query.moveToFirst()) {
                                String string = query.getString(1);
                                query.close();
                                return string;
                            }
                            query.close();
                            acquireUnstableContentProviderClient.release();
                            return null;
                        }
                        throw new S2("ContentProvider query returned null cursor");
                    } catch (Throwable th) {
                        if (query != null) {
                            try {
                                query.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (RemoteException e8) {
                    throw new S2("ContentProvider query failed", e8);
                }
            }
            throw new S2("Unable to acquire ContentProviderClient");
        } finally {
            acquireUnstableContentProviderClient.release();
        }
    }

    @Override // com.google.android.gms.internal.measurement.O2
    public final Map b(ContentResolver contentResolver, String[] strArr, P2 p22) {
        Uri uri = G2.f16309b;
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(uri);
        if (acquireUnstableContentProviderClient != null) {
            try {
                try {
                    Cursor query = acquireUnstableContentProviderClient.query(uri, null, null, strArr, null);
                    try {
                        if (query != null) {
                            Map a9 = p22.a(query.getCount());
                            while (query.moveToNext()) {
                                a9.put(query.getString(0), query.getString(1));
                            }
                            if (query.isAfterLast()) {
                                query.close();
                                return a9;
                            }
                            throw new S2("Cursor read incomplete (ContentProvider dead?)");
                        }
                        throw new S2("ContentProvider query returned null cursor");
                    } catch (Throwable th) {
                        if (query != null) {
                            try {
                                query.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                        throw th;
                    }
                } catch (RemoteException e8) {
                    throw new S2("ContentProvider query failed", e8);
                }
            } finally {
                acquireUnstableContentProviderClient.release();
            }
        }
        throw new S2("Unable to acquire ContentProviderClient");
    }
}
