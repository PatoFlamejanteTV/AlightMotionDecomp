package com.mbridge.msdk.e;

import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.work.PeriodicWorkRequest;
import com.mbridge.msdk.playercommon.exoplayer2.source.chunk.ChunkedTrackBlacklistUtil;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public final class y {
    public static long a(int i8, long j8, long j9) {
        if (i8 <= 0 || j8 == 0 || i8 <= 10) {
            return j9;
        }
        if (i8 <= 20) {
            return ChunkedTrackBlacklistUtil.DEFAULT_TRACK_BLACKLIST_MS;
        }
        if (i8 <= 30) {
            return 120000L;
        }
        if (i8 <= 40) {
            return 180000L;
        }
        if (i8 <= 50) {
            return 240000L;
        }
        return PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(Object obj) {
        return obj != null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(Object obj) {
        return obj == null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean b(List<i> list) {
        if (a((List<?>) list)) {
            return false;
        }
        for (i iVar : list) {
            if (!a(iVar)) {
                e c8 = iVar.c();
                if (!a(c8) && c8.c() == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(List<?> list) {
        return list == null || list.size() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Cursor cursor) {
        try {
            if (!b((Object) cursor) || cursor.isClosed()) {
                return;
            }
            cursor.close();
        } catch (Exception unused) {
        }
    }

    public static boolean a(Context context) {
        ConnectivityManager connectivityManager;
        if (context == null) {
            return true;
        }
        NetworkInfo networkInfo = null;
        try {
            connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        } catch (Exception unused) {
            connectivityManager = null;
        }
        if (connectivityManager == null) {
            return true;
        }
        try {
            networkInfo = connectivityManager.getActiveNetworkInfo();
        } catch (Exception unused2) {
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<i> b(Cursor cursor) {
        int i8;
        int i9;
        e eVar;
        ArrayList arrayList = new ArrayList();
        try {
            int columnIndex = cursor.getColumnIndex("name");
            int columnIndex2 = cursor.getColumnIndex("type");
            int columnIndex3 = cursor.getColumnIndex("time_stamp");
            int columnIndex4 = cursor.getColumnIndex("properties");
            int columnIndex5 = cursor.getColumnIndex("priority");
            int columnIndex6 = cursor.getColumnIndex("uuid");
            int columnIndex7 = cursor.getColumnIndex(TypedValues.TransitionType.S_DURATION);
            int columnIndex8 = cursor.getColumnIndex("state");
            int columnIndex9 = cursor.getColumnIndex("report_count");
            int columnIndex10 = cursor.getColumnIndex("ignore_max_timeout");
            int columnIndex11 = cursor.getColumnIndex("ignore_max_retry_times");
            int columnIndex12 = cursor.getColumnIndex("invalid_time");
            while (cursor.moveToNext()) {
                try {
                    eVar = new e(cursor.getString(columnIndex));
                    eVar.a(cursor.getInt(columnIndex2));
                    i8 = columnIndex;
                    i9 = columnIndex2;
                } catch (JSONException e8) {
                    e = e8;
                    i8 = columnIndex;
                    i9 = columnIndex2;
                }
                try {
                    eVar.a(cursor.getLong(columnIndex3));
                    eVar.a(new JSONObject(cursor.getString(columnIndex4)));
                    eVar.b(cursor.getInt(columnIndex5));
                    eVar.a(cursor.getString(columnIndex6));
                    eVar.b(cursor.getLong(columnIndex7));
                    i iVar = new i(eVar);
                    iVar.b(cursor.getInt(columnIndex8));
                    iVar.a(cursor.getInt(columnIndex9));
                    iVar.a(cursor.getInt(columnIndex10) == 0);
                    iVar.b(cursor.getInt(columnIndex11) == 0);
                    iVar.a(cursor.getLong(columnIndex12));
                    arrayList.add(iVar);
                } catch (JSONException e9) {
                    e = e9;
                    if (a.f19988a) {
                        Log.e("TrackManager", "create: ", e);
                    }
                    columnIndex = i8;
                    columnIndex2 = i9;
                }
                columnIndex = i8;
                columnIndex2 = i9;
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }
}
