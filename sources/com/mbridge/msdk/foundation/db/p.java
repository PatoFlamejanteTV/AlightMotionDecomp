package com.mbridge.msdk.foundation.db;

import android.content.ContentValues;
import android.database.Cursor;
import android.text.TextUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.ad;
import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes4.dex */
public final class p extends a<Campaign> {

    /* renamed from: a, reason: collision with root package name */
    private static p f20454a;

    private p(g gVar) {
        super(gVar);
    }

    public static synchronized p a(g gVar) {
        p pVar;
        synchronized (p.class) {
            try {
                if (f20454a == null) {
                    f20454a = new p(gVar);
                }
                pVar = f20454a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return pVar;
    }

    public final synchronized void b(String str) {
        String str2;
        try {
            str2 = "video_url = '" + str + "'";
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e8.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return;
        }
        getWritableDatabase().delete(MimeTypes.BASE_TYPE_VIDEO, str2, null);
    }

    public final synchronized com.mbridge.msdk.foundation.entity.m a(String str) {
        com.mbridge.msdk.foundation.entity.m mVar;
        Exception e8;
        Cursor cursor;
        Cursor cursor2 = null;
        r1 = null;
        com.mbridge.msdk.foundation.entity.m mVar2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            cursor = getReadableDatabase().rawQuery("SELECT * FROM video WHERE video_url = '" + str + "'", null);
            if (cursor != null) {
                try {
                    try {
                        if (cursor.getCount() > 0) {
                            mVar = new com.mbridge.msdk.foundation.entity.m();
                            while (cursor.moveToNext()) {
                                try {
                                    mVar.b(cursor.getString(cursor.getColumnIndex(CampaignEx.JSON_KEY_VIDEO_URL)));
                                    mVar.a(cursor.getInt(cursor.getColumnIndex("video_state")));
                                    mVar.b(cursor.getLong(cursor.getColumnIndex("pregeress_size")));
                                    mVar.b(cursor.getInt(cursor.getColumnIndex("total_size")));
                                    mVar.a(cursor.getString(cursor.getColumnIndex("video_path")));
                                    mVar.a(cursor.getLong(cursor.getColumnIndex("video_download_start")) * 1000);
                                } catch (Exception e9) {
                                    e8 = e9;
                                    if (MBridgeConstans.DEBUG) {
                                        ad.b("VideoDao", e8.getLocalizedMessage());
                                    }
                                    if (cursor != null) {
                                        try {
                                            cursor.close();
                                        } catch (Exception e10) {
                                            if (MBridgeConstans.DEBUG) {
                                                ad.b("VideoDao", e10.getLocalizedMessage());
                                            }
                                        }
                                    }
                                    mVar2 = mVar;
                                    return mVar2;
                                }
                            }
                            mVar2 = mVar;
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor2 = cursor;
                        if (cursor2 != null) {
                            try {
                                cursor2.close();
                            } catch (Exception e11) {
                                if (MBridgeConstans.DEBUG) {
                                    ad.b("VideoDao", e11.getLocalizedMessage());
                                }
                            }
                        }
                        throw th;
                    }
                } catch (Exception e12) {
                    e8 = e12;
                    mVar = null;
                }
            }
            if (cursor != null) {
                try {
                    cursor.close();
                } catch (Exception e13) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("VideoDao", e13.getLocalizedMessage());
                    }
                }
            }
        } catch (Exception e14) {
            mVar = null;
            e8 = e14;
            cursor = null;
        } catch (Throwable th2) {
            th = th2;
        }
        return mVar2;
    }

    private synchronized boolean b(String str, String str2) {
        String str3;
        try {
            if (TextUtils.isEmpty(str2)) {
                str3 = "SELECT id FROM video WHERE video_url = '" + str + "'";
            } else {
                str3 = "SELECT id FROM video WHERE video_url = '" + str + "' AND id = " + str2;
            }
            Cursor rawQuery = getReadableDatabase().rawQuery(str3, null);
            if (rawQuery != null && rawQuery.getCount() > 0) {
                try {
                    rawQuery.close();
                } catch (Exception e8) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("VideoDao", e8.getLocalizedMessage());
                    }
                }
                return true;
            }
            if (rawQuery != null) {
                try {
                    rawQuery.close();
                } catch (Exception e9) {
                    if (MBridgeConstans.DEBUG) {
                        ad.b("VideoDao", e9.getLocalizedMessage());
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
        throw th;
    }

    public final synchronized long b(String str, long j8) {
        int i8 = -1;
        try {
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e8.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("total_size", Long.valueOf(j8));
        if (b(str, "")) {
            String str2 = "video_url = '" + str + "'";
            synchronized (new Object()) {
                i8 = getWritableDatabase().update(MimeTypes.BASE_TYPE_VIDEO, contentValues, str2, null);
            }
        }
        return i8;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a3, code lost:            if (r0 != null) goto L40;     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:            return r7;     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00a5, code lost:            r0.close();     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b8, code lost:            if (r0 != null) goto L40;     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized com.mbridge.msdk.foundation.entity.m a(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> La9
            r0 = 0
            if (r7 == 0) goto La
            monitor-exit(r5)
            return r0
        La:
            com.mbridge.msdk.foundation.entity.m r7 = new com.mbridge.msdk.foundation.entity.m     // Catch: java.lang.Throwable -> La9
            r7.<init>()     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r1.<init>()     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = " WHERE video_url = '"
            r1.append(r2)     // Catch: java.lang.Throwable -> La9
            r1.append(r6)     // Catch: java.lang.Throwable -> La9
            java.lang.String r6 = "'"
            r1.append(r6)     // Catch: java.lang.Throwable -> La9
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> La9
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            r1.<init>()     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = "SELECT * FROM video"
            r1.append(r2)     // Catch: java.lang.Throwable -> La9
            r1.append(r6)     // Catch: java.lang.Throwable -> La9
            java.lang.String r6 = r1.toString()     // Catch: java.lang.Throwable -> La9
            android.database.sqlite.SQLiteDatabase r1 = r5.getReadableDatabase()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            android.database.Cursor r0 = r1.rawQuery(r6, r0)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            if (r0 == 0) goto La3
            int r6 = r0.getCount()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            if (r6 <= 0) goto La3
        L46:
            boolean r6 = r0.moveToNext()     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            if (r6 == 0) goto La3
            java.lang.String r6 = "video_url"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            java.lang.String r6 = r0.getString(r6)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            r7.b(r6)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            java.lang.String r6 = "video_state"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            int r6 = r0.getInt(r6)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            r7.a(r6)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            java.lang.String r6 = "pregeress_size"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            long r1 = r0.getLong(r6)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            r7.b(r1)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            java.lang.String r6 = "total_size"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            int r6 = r0.getInt(r6)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            r7.b(r6)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            java.lang.String r6 = "video_path"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            java.lang.String r6 = r0.getString(r6)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            r7.a(r6)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            java.lang.String r6 = "video_download_start"
            int r6 = r0.getColumnIndex(r6)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            long r1 = r0.getLong(r6)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r7.a(r1)     // Catch: java.lang.Throwable -> L9f java.lang.Exception -> La1
            goto L46
        L9f:
            r6 = move-exception
            goto Lbd
        La1:
            r6 = move-exception
            goto Lab
        La3:
            if (r0 == 0) goto Lbb
        La5:
            r0.close()     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lbb
            goto Lbb
        La9:
            r6 = move-exception
            goto Lc3
        Lab:
            boolean r1 = com.mbridge.msdk.MBridgeConstans.DEBUG     // Catch: java.lang.Throwable -> L9f
            if (r1 == 0) goto Lb8
            java.lang.String r1 = "VideoDao"
            java.lang.String r6 = r6.getLocalizedMessage()     // Catch: java.lang.Throwable -> L9f
            com.mbridge.msdk.foundation.tools.ad.b(r1, r6)     // Catch: java.lang.Throwable -> L9f
        Lb8:
            if (r0 == 0) goto Lbb
            goto La5
        Lbb:
            monitor-exit(r5)
            return r7
        Lbd:
            if (r0 == 0) goto Lc2
            r0.close()     // Catch: java.lang.Throwable -> La9 java.lang.Exception -> Lc2
        Lc2:
            throw r6     // Catch: java.lang.Throwable -> La9
        Lc3:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> La9
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.db.p.a(java.lang.String, java.lang.String):com.mbridge.msdk.foundation.entity.m");
    }

    public final synchronized void a(String str, long j8) {
        if (j8 == 0) {
            return;
        }
        try {
            ContentValues contentValues = new ContentValues();
            contentValues.put("video_download_start", Long.valueOf(j8 / 1000));
            if (b(str, "")) {
                getWritableDatabase().update(MimeTypes.BASE_TYPE_VIDEO, contentValues, "video_url = '" + str + "'", null);
            }
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e8.getLocalizedMessage());
            }
        }
    }

    public final synchronized long a(CampaignEx campaignEx, long j8, String str, int i8) {
        if (campaignEx == null) {
            return 0L;
        }
        try {
            try {
                if (getWritableDatabase() == null) {
                    return -1L;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("unitid", campaignEx.getCampaignUnitId());
                contentValues.put("id", campaignEx.getId());
                contentValues.put(CampaignEx.JSON_KEY_PACKAGE_NAME, campaignEx.getPackageName());
                contentValues.put("app_name", campaignEx.getAppName());
                contentValues.put("app_desc", campaignEx.getAppDesc());
                contentValues.put(CampaignEx.JSON_KEY_APP_SIZE, campaignEx.getSize());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_SIZE, campaignEx.getImageSize());
                contentValues.put(CampaignEx.JSON_KEY_ICON_URL, campaignEx.getIconUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMAGE_URL, campaignEx.getImageUrl());
                contentValues.put(CampaignEx.JSON_KEY_IMPRESSION_URL, campaignEx.getImpressionURL());
                contentValues.put(CampaignEx.JSON_KEY_NOTICE_URL, campaignEx.getNoticeUrl());
                contentValues.put(DownloadModel.DOWNLOAD_URL, campaignEx.getClickURL());
                contentValues.put("only_impression", campaignEx.getOnlyImpressionURL());
                contentValues.put(CampaignEx.JSON_KEY_ST_TS, Long.valueOf(campaignEx.getTimestamp()));
                contentValues.put("template", Integer.valueOf(campaignEx.getTemplate()));
                contentValues.put(CampaignEx.JSON_KEY_CLICK_MODE, campaignEx.getClick_mode());
                contentValues.put(CampaignEx.JSON_KEY_LANDING_TYPE, campaignEx.getLandingType());
                contentValues.put(CampaignEx.JSON_KEY_LINK_TYPE, Integer.valueOf(campaignEx.getLinkType()));
                contentValues.put("star", Double.valueOf(campaignEx.getRating()));
                contentValues.put("cti", Integer.valueOf(campaignEx.getClickInterval()));
                contentValues.put("level", Integer.valueOf(campaignEx.getCacheLevel()));
                contentValues.put("adSource", Integer.valueOf(campaignEx.getType()));
                contentValues.put("ad_call", campaignEx.getAdCall());
                contentValues.put("fc_a", Integer.valueOf(campaignEx.getFca()));
                contentValues.put(CampaignEx.JSON_KEY_AD_URL_LIST, campaignEx.getAd_url_list());
                contentValues.put(CampaignEx.JSON_KEY_VIDEO_URL, campaignEx.getVideoUrlEncode());
                contentValues.put("total_size", Long.valueOf(j8));
                contentValues.put("video_state", Integer.valueOf(i8));
                contentValues.put("video_download_start", Long.valueOf(System.currentTimeMillis() / 1000));
                contentValues.put("ad_bid_token", campaignEx.getBidToken());
                if (!TextUtils.isEmpty(str)) {
                    contentValues.put("video_path", str);
                }
                if (b(campaignEx.getVideoUrlEncode(), campaignEx.getId())) {
                    return 0L;
                }
                return getWritableDatabase().insert(MimeTypes.BASE_TYPE_VIDEO, null, contentValues);
            } catch (Exception e8) {
                if (MBridgeConstans.DEBUG) {
                    ad.b("VideoDao", e8.getLocalizedMessage());
                }
                return -1L;
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized long a(String str, long j8, int i8) {
        int i9 = -1;
        try {
        } catch (Exception e8) {
            if (MBridgeConstans.DEBUG) {
                ad.b("VideoDao", e8.getLocalizedMessage());
            }
        }
        if (getWritableDatabase() == null) {
            return -1;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("pregeress_size", Long.valueOf(j8));
        contentValues.put("video_state", Integer.valueOf(i8));
        if (b(str, "")) {
            String str2 = "video_url = '" + str + "'";
            synchronized (new Object()) {
                i9 = getWritableDatabase().update(MimeTypes.BASE_TYPE_VIDEO, contentValues, str2, null);
            }
        }
        return i9;
    }
}
